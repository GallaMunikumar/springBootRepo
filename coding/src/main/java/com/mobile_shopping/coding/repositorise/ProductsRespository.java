package com.mobile_shopping.coding.repositorise;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.mobile_shopping.coding.entity.Product;

public interface ProductsRespository extends JpaRepository<Product, Long> {

	@Procedure(procedureName = "procedures_search")

	List<Product> dbsearchProducts(@Param("search_text") String searchText);

}
