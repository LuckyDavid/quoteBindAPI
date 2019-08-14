package com.hiscox.demo.quotebind.api;

import io.swagger.annotations.*;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hiscox.demo.quotebind.model.Product;

@Api(value = "product")
public interface ProductApi {
	
	@ApiOperation(value = "Lists products", nickname = "getAllProducts", notes = "Lists all available products for the current broker", response = Product.class, responseContainer = "List", tags={ "product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "get all available products", response = Product.class, responseContainer = "List") })
    @RequestMapping(value = "/product/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
	ResponseEntity<List<Product>> getAllProducts();
}
