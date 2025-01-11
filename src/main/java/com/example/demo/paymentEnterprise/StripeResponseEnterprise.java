package com.example.demo.paymentEnterprise;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StripeResponseEnterprise {
    private String status;
    private String message;
    private String sessionId;
    private String sessionUrl;
}
