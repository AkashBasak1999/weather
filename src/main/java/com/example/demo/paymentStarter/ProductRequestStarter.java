package com.example.demo.paymentStarter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestStarter {
    private String name;
    private Long amount;
    private Long quantity;
    private String currency;

//    public ProductRequest() {
//    }
//
//    public ProductRequest(Long amount, String currency, String name, Long quantity) {
//        this.amount = amount;
//        this.currency = currency;
//        this.name = name;
//        this.quantity = quantity;
//    }
//
//    public Long getAmount() {
//        return amount;
//    }
//
//    public void setAmount(Long amount) {
//        this.amount = amount;
//    }
//
//    public String getCurrency() {
//        return currency;
//    }
//
//    public void setCurrency(String currency) {
//        this.currency = currency;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Long getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(Long quantity) {
//        this.quantity = quantity;
//    }
}
