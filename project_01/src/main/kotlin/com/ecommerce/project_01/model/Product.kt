package com.ecommerce.project_01.model

import jakarta.persistence.*

@Entity
@Table(name = "tbl_product_info")
data class Product(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long ,
    val name: String,
    val price: Double,
    val productCount : Int,
    val inStock : Boolean
)