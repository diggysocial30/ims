package com.ash.ims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ash.ims.dao.service.EntityDAOService;
import com.ash.ims.entity.dto.ProductDTO;
import com.ash.ims.model.vo.Product;
import com.ash.ims.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private EntityDAOService<Product> productDAOService;

	@Override
	public Product addProduct(ProductDTO mProduct) {
		Product product=Product.builder().description(mProduct.getDescription()).name(mProduct.getName()).build();
		return productDAOService.save(product);
	}

	@Override
	public Product getProductById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(ProductDTO product) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
