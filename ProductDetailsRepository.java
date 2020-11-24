package com.ecom;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProductDetailsRepository extends CrudRepository<ProductDetails, Integer> {

	List<ProductDetails> findByProductId(Integer productId);

}
