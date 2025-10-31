package com.example.commonlibcqrs.commands;

import com.gmail.andersoninfonet.common.model.CardDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidatePaymentCommand {
    
    @TargetAggregateIdentifier 
    private String paymentId; 
    private String orderId; 
    private CardDetails cardDetails;
}
