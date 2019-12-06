package com.ash.ims.service;

import com.ash.ims.entity.dto.BaseEntityDTO;
import com.ash.ims.entity.dto.ProductDTO;

public interface ProductService {
	BaseEntityDTO addProduct(ProductDTO product);

	BaseEntityDTO getProductById();

	BaseEntityDTO updateProduct(ProductDTO product);
}
