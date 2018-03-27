package com.how2java.action;

import java.util.List;

import com.how2java.pojo.Product;
import com.how2java.service.ProductService;

//ProductAction�ṩ��ProductService��ע�룬����SSH�����ϣ�ProductAction�ͳ䵱�ǳ������Ŀ��Ʋ�Ľ�ɫ��
//1. ȡ������
//2. ��ת��ҳ�� ��listJsp�� 
//@Namespace("/")
//@ParentPackage("struts-default")
//@Results({ @Result(name = "listJsp", location = "/list.jsp") })
public class ProductAction {

	// @Autowired
	ProductService productService;
	List<Product> products;
	Product product;

	// @Action("listProduct")
	public String list() {
		products = productService.list();
		return "listProduct";
	}

	public String add() {
		productService.add(product);
		return "listProductAction";
	}

	public String edit() {
		product = productService.get(product.getId());
		return "editProduct";
	}

	public String update() {
		productService.update(product);
		return "listProductAction";
	}

	public String delete(){
		productService.delete(product);
		return "listProductAction";
	}
	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}