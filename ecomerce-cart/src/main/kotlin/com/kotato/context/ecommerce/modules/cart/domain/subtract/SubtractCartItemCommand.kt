package com.kotato.context.ecommerce.modules.cart.domain.subtract

import java.math.BigDecimal

data class SubtractCartItemCommand(val id: String,
                                   val itemId: String,
                                   val quantity: Int,
                                   val price: BigDecimal,
                                   val currency: String)