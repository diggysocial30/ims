package com.ash.ims.service;

import com.ash.ims.entity.dto.ProductDTO;
import com.ash.ims.model.vo.Product;

public interface ProductService {
	Product addProduct(ProductDTO product);

	Product getProductById();

	Product updateProduct(ProductDTO product);
}
