package com.laioffer.onlineShop.service;

import com.laioffer.onlineShop.dao.CartDao;
import com.laioffer.onlineShop.entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    
    @Autowired
    private CartDao cartDao;
    
    public Cart getCartById(int cartId) {
        return cartDao.getCartById(cartId);
    }
}

