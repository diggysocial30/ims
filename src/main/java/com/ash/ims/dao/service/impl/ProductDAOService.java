package com.ash.ims.dao.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ash.ims.dao.service.EntityDAOService;
import com.ash.ims.model.vo.Product;
import com.ash.ims.repository.ProductRepository;

@Service
class ProductDAOServiceImpl implements EntityDAOService<Product> {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product get(UUID id) {
		return productRepository.findById(id).get();
	}

	@Override
	public void update(Product product) {
		productRepository.save(product);
		
	}


	

}
