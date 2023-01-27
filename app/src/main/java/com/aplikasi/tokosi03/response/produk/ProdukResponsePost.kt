package com.aplikasi.tokosi03.response.produk

data class ProdukResponsePost(
    val `data`: DataProduk,
    val message: String,
    val success: Boolean
)

data class DataProduk(
    val `produk`: Produk
)