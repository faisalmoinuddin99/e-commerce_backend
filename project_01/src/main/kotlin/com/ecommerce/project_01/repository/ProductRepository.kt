package com.ecommerce.project_01.repository

import com.ecommerce.project_01.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: JpaRepository<Product,Long> {
}