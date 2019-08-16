package com.hiscox.demo.quotebind.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiscox.demo.quotebind.dao.ProductDao;
import com.hiscox.demo.quotebind.model.IndustrySector;
import com.hiscox.demo.quotebind.model.Product;

@Service
public class ProductService {

	
	@Autowired
	private ProductDao productDao;
	
	public List<Product> getAllProducts(){
		return productDao.getAllProducts();
	}
}
