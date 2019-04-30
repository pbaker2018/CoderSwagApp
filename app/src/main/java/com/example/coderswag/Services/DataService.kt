package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes black beanie", "£10", "hat1"),
        Product("Devslopes black baseball cap", "£12", "hat2"),
        Product("Devslopes white baseball cap", "£12", "hat3"),
        Product("Devslopes black/lilac baseball cap", "£12", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes black zip hoodie", "£17", "hoodie1"),
        Product("Devslopes red zip hoodie", "£17", "hoodie2"),
        Product("Devslopes dark grey zip hoodie", "£17", "hoodie3"),
        Product("Devslopes black no-zip hoodie", "£20", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes black tee", "£13", "shirt1"),
        Product("Devslopes grey tee", "£13", "shirt2"),
        Product("Devslopes red tee", "£13", "shirt3"),
        Product("Devslopes hustle tee", "£15", "shirt4"),
        Product("Kick Flip Studios tee", "£10", "shirt5")
    )
}