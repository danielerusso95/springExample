package com.softwareinside.shop.service;

import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softwareinside.shop.model.Product;
import com.softwareinside.shop.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public void saveProduct(Product newProduct) {
		productRepository.findAll().forEach( product -> {
			if(product.getTitle()==newProduct.getTitle()) return;
		});
		productRepository.save(newProduct);
	}
	public List<Product> 
}
