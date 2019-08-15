package com.hiscox.demo.quotebind.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hiscox.demo.quotebind.model.IndustrySector;
import com.hiscox.demo.quotebind.model.Product;

@Service
public class ProductService {

	// Temporary implementation
	private List<Product> _availableProducts = new ArrayList<Product>();
	
	public List<Product> getAllProducts(){
		if(_availableProducts.size()==0) {
			Product p = new Product();
			p.setId("CYB");
			p.setName("Cyber");
			p.addAvailableIndustriesItem(new IndustrySector().id("I1").name("IT"));
			_availableProducts.add(p);
		}
		return _availableProducts;
	}
}
