package com.example.commonlibcqrs.commands;

import com.example.commonlibcqrs.model.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompleteOrderCommand {
    
    @TargetAggregateIdentifier 
    private String orderId; 
    private OrderStatus orderStatus;
}
