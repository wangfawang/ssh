package com.how2java.service.impl;

import java.util.List;

import com.how2java.dao.ProductDAO;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;

//ProductServiceImpl ʵ�ֽӿ�ProductService,������productDAO��ע�롣
//list��������ҵ�񷽷���productDAO�������е����ݣ�����ǿյģ��������ݿ������5�����ݡ� 
//@Service
public class ProductServiceImpl implements ProductService {
	// @Autowired
	ProductDAO productDAO;

	// ��ProductServiceImpl ��list����ǰ��һ�䣺

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