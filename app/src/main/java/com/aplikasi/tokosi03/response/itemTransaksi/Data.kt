package com.aplikasi.tokosi03.response.itemTransaksi

import com.aplikasi.tokosi03.response.transaksi.Transaksi

data class Data(
    val transaksi: List<Transaksi>,
    val total: String
)