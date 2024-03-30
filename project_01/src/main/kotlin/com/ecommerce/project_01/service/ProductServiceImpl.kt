package com.ecommerce.project_01.service

import com.ecommerce.project_01.model.Product
import com.ecommerce.project_01.repository.ProductRepository
import org.springframework.stereotype.Service


@Service
class ProductServiceImpl(private val productRepository: ProductRepository) : ProductService {


    override fun getAllProducts(): List<Product> {
        return productRepository.findAll();
    }

    override fun getProductById(id: Long): Product {

        return productRepository.getReferenceById(id)
    }

    override fun saveProduct(product: Product): Product {
        return productRepository.save(product)
    }

    override fun deleteProduct(id: Long) {
        return productRepository.deleteById(id)
    }
}