package com.example.demo.paymentStarter;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StripeResponseStarter {
    private String status;
    private String message;
    private String sessionId;
    private String sessionUrl;

//    public StripeResponse() {
//    }
//
//    public StripeResponse(String message, String sessionId, String sessionUrl, String status) {
//        this.message = message;
//        this.sessionId = sessionId;
//        this.sessionUrl = sessionUrl;
//        this.status = status;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public String getSessionId() {
//        return sessionId;
//    }
//
//    public void setSessionId(String sessionId) {
//        this.sessionId = sessionId;
//    }
//
//    public String getSessionUrl() {
//        return sessionUrl;
//    }
//
//    public void setSessionUrl(String sessionUrl) {
//        this.sessionUrl = sessionUrl;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
}
