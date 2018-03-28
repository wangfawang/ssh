package com.how2java.service.impl;

import java.util.List;

import com.how2java.dao.ProductDAO;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;

//ProductServiceImpl 实现接口ProductService,并接受productDAO的注入。
//list方法就是业务方法，productDAO查找所有的数据，如果是空的，就往数据库里插入5条数据。 
//@Service
public class ProductServiceImpl implements ProductService {
	// @Autowired
	ProductDAO productDAO;

	// 在ProductServiceImpl 的list方法前加一句：

	// @Transactional(propagation = Propagation.REQUIRED, rollbackForClassName =
	// "Exception")
	public List<Product> list() {
		List<Product> products = productDAO.list();
		if (products.isEmpty()) {
			for (int i = 0; i < 5; i++) {
				Product p = new Product();
				p.setName("product " + i);
				productDAO.add(p);
				products.add(p);
			}
		}
		return products;
	}

	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Override
	public void add(Product p) {
		// TODO Auto-generated method stub
		productDAO.add(p);
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return productDAO.get(id);
	}

	@Override
	public void delete(Product p) {
		// TODO Auto-generated method stub
		productDAO.delete(p);
	}

	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub
		productDAO.update(p);
	}
}