package com.example.demo;

import lombok.Getter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Getter
@Controller

public class ProductController {
	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/")
	public String products(@RequestParam(name = "title", required = false)String title , Model model) {
		model.addAttribute("products", productService.listProducts(title));
		return "products";
	}

    @GetMapping ("/product/{id}")
	public String productInfo(@PathVariable Long id, Model model) {
		  model.addAttribute("product", productService.getProductById(id));
		  return "product-info";  
		}


	@PostMapping("/product/create")
	@PreAuthorize("hasRole('MANAGER')")
	public String createProduct(Product product) {
		productService.saveProduct(product);
		return "redirect:/";
	}

	@PostMapping("/product/delete/{id}")
	@PreAuthorize("hasRole('MANAGER')")
	public String deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
		return "redirect:/";
	}
}
