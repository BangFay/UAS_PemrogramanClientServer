package com.aplikasi.tokosi03

import com.aplikasi.tokosi03.response.cart.Cart

interface CallbackInterface {
    fun passResultCallback(total: String, cart: ArrayList<Cart>)
}