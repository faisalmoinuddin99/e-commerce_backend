package com.ecommerce.project_01.controller

import com.ecommerce.project_01.model.Product
import com.ecommerce.project_01.service.ProductService
import com.ecommerce.project_01.service.ProductServiceImpl
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/products")
class ProductController(private val productService: ProductServiceImpl) {

    @GetMapping
    fun getAllProducts(): List<Product> {
        return productService.getAllProducts()
    }

    @PostMapping
    fun addProduct(@RequestBody product: Product): Product {
        return productService.saveProduct(product)
    }
}