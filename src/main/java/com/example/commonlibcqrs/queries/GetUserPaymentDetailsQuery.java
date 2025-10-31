package com.example.commonlibcqrs.queries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserPaymentDetailsQuery implements Serializable {
    private String userId;
}
