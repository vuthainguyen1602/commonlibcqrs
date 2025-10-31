package com.example.commonlibcqrs.events;

import com.example.commonlibcqrs.model.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCompletedEvent {
    
    private String orderId; 
    private OrderStatus orderStatus;
}
