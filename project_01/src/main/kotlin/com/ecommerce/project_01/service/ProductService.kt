package com.ecommerce.project_01.service

import com.ecommerce.project_01.model.Product
import org.springframework.stereotype.Service


interface ProductService {
    fun getAllProducts(): List<Product>
    fun getProductById(id: Long):Product
    fun saveProduct(product: Product): Product
    fun deleteProduct(id: Long)
}