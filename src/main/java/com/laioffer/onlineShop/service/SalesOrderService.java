package com.laioffer.onlineShop.service;

import com.laioffer.onlineShop.dao.SalesOrderDao;
import com.laioffer.onlineShop.entity.SalesOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesOrderService {
    
    @Autowired
    private SalesOrderDao salesOrderDao;
    
    public void addSalesOrder(SalesOrder salesOrder) {
        salesOrderDao.addSalesOrder(salesOrder);
    }
}

