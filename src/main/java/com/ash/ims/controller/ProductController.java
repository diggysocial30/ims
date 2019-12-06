package com.ash.ims.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ash.ims.entity.dto.ProductDTO;
import com.ash.ims.model.vo.Product;
import com.ash.ims.service.ProductService;

@RestController
@RequestMapping("/api/ims/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/v1")
	public Map<String, List<Map<String, String>>> getEntity() throws Exception {
		productService.getProductById();
		return null;
	}

	@PostMapping("/v1")
	public Product postEntity(@RequestBody ProductDTO productDTO) throws Exception {
		return productService.addProduct(productDTO);
	}

	@PutMapping("/v1")
	public Map<String, List<Map<String, String>>> putEntity(@RequestBody ProductDTO productDTO) throws Exception {
		productService.updateProduct(productDTO);
		return null;
	}

}
