package com.example.commonlibcqrs.events;

import com.example.commonlibcqrs.model.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentCancelledEvent {
    private String paymentId; 
    private String orderId; 
    private PaymentStatus paymentStatus;
}
