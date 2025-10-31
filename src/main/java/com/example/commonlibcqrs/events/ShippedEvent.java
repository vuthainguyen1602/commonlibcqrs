package com.example.commonlibcqrs.events;

import com.example.commonlibcqrs.model.enums.ShipmentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShippedEvent {
    
    private String shipmentId; 
    private String orderId; 
    private ShipmentStatus shipmentStatus;
}
