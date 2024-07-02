package com.mobile_shopping.coding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobile_shopping.coding.entity.Product;
import com.mobile_shopping.coding.pojo.SearchProductApiData;
import com.mobile_shopping.coding.repositorise.ProductsRespository;

import jakarta.transaction.Transactional;

@RestController
public class ProductsController {

	@Autowired
	ProductsRespository productsRespository;

	@Transactional
	@PostMapping("api/search")
	public ResponseEntity<List<Product>> SearchProducts(@RequestBody SearchProductApiData apiData) {

		List<Product> productsList = productsRespository.dbsearchProducts(apiData.getSearchText());
		return new ResponseEntity<>(productsList, HttpStatus.OK);
		// return apiData.getSearchText();

	}

}
