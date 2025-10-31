package com.example.commonlibcqrs.commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShipCommand {
    
    @TargetAggregateIdentifier 
    private String shipmentId; 
    private String orderId;
}
