package com.hiscox.demo.quotebind.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hiscox.demo.quotebind.model.Product;

@Controller
public class ProductApiController implements ProductApi {
	private static final Logger log = LoggerFactory.getLogger(ProductApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    private ProductService productService;
    
    @org.springframework.beans.factory.annotation.Autowired
    public ProductApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Product>> getAllProducts() {
            try {
            	return new ResponseEntity<List<Product>>(productService.getAllProducts(), HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Product>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
    }
	
}
