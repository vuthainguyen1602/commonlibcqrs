package com.example.commonlibcqrs.events;

import com.example.commonlibcqrs.model.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderCancelledEvent {
    
    private String orderId;
    private OrderStatus orderStatus;
}
