package com.hiscox.demo.quotebind.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hiscox.demo.quotebind.model.Product;

@Service
public class ProductService {

	// Temporary implementation
	private List<Product> _availableProducts = new ArrayList<Product>();
	
	public List<Product> getAllProducts(){
		return _availableProducts;
	}
}
