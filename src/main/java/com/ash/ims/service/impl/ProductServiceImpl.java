package com.ash.ims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ash.ims.dao.service.EntityDAOService;
import com.ash.ims.entity.dto.BaseEntityDTO;
import com.ash.ims.entity.dto.ProductDTO;
import com.ash.ims.model.vo.Product;
import com.ash.ims.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private EntityDAOService<Product> productDAOService;

	@Override
	public BaseEntityDTO addProduct(ProductDTO mProduct) {
		Product product=productDAOService.save(Product.builder().description(mProduct.getDescription()).name(mProduct.getName()).build());
		BaseEntityDTO productDTO=ProductDTO.builder().description(product.getDescription()).name(product.getName()).id(product.getId()).build();
		return productDTO;
	}

	@Override
	public BaseEntityDTO getProductById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseEntityDTO updateProduct(ProductDTO product) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
