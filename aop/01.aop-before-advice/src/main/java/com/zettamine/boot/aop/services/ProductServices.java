package com.zettamine.boot.aop.services;

import org.springframework.stereotype.Service;

import com.zettamine.boot.aop.models.Product;

@Service
public class ProductServices {
	public Product saveProduct(Integer pid, String pname, float pprice) {
		Product product = new Product();
		product.setProductId(pid);
		product.setProductName(pname);
		product.setProductPrice(pprice);
		
		System.out.println("saving product");
		return product;
	}
	
	public void deleteProductById(int pid) {
		System.out.println("deleting product");
	}
}
