package com.how2java.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.how2java.dao.ProductDAO;
import com.how2java.pojo.Product;

//@Repository("productDAO")
public class ProductDAOImpl extends HibernateTemplate implements ProductDAO {

	// @Resource(name = "sf")
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	};

	public List<Product> list() {
		return find("from Product");
	}

	@Override
	public void add(Product p) {
		super.save(p);
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return (Product) get(Product.class, id);
	}

	@Override
	public void delete(Product p) {
		// TODO Auto-generated method stub
		super.delete(p);
	}

	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub
		super.update(p);
	}

}