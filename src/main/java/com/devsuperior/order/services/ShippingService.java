package com.devsuperior.order.services;

import com.devsuperior.order.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double orderValue = order.getBasic();

        if (orderValue < 100) {
            return 20;
        } else if (orderValue < 200) {
            return 12;
        }

        return 0;
    }
}
