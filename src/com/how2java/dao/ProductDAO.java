package com.how2java.dao;

import java.util.List;

import com.how2java.pojo.Product;

//ProductDAO 接口声明了方法list()、add(Product p)
public interface ProductDAO {

	public List<Product> list();

	public void add(Product p);

	public Product get(int id);

	public void delete(Product p);

	public void update(Product p);
}
