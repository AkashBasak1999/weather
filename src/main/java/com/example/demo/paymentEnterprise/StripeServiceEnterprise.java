package com.example.demo.paymentEnterprise;

import com.example.demo.security.SecurityUtils;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.billingportal.Configuration.Features.CustomerUpdate;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;

import org.springframework.stereotype.Service;
import java.io.IOException;

//PublishableKey: pk_test_51QeryoQUkcQIgjzyV6MUcCrEMoKbEwkgHxH76MTCPWy90uKskYHOEtXqZFXBw2maC9weCaUpBB66qs1aonIJh9MQ00urxhNGxv
//SecretKey: sk_test_51QeryoQUkcQIgjzyfYYxuYfvIhyNK5FW3g6AnDKTn6HsPBvI2INId5K3GDWkOijTqM3h68uMTI0THnM6MdDWtraN00gYqJmcyY
@Service
public class StripeServiceEnterprise {
	public StripeResponseEnterprise checkoutProducts(ProductRequestEnterprise productRequest) throws IOException {
		//to know the logged in user		
        Stripe.apiKey="sk_test_51QeryoQUkcQIgjzyfYYxuYfvIhyNK5FW3g6AnDKTn6HsPBvI2INId5K3GDWkOijTqM3h68uMTI0THnM6MdDWtraN00gYqJmcyY";

        //Below mentione methods are give by Stripe API. SO implement them
        SessionCreateParams.LineItem.PriceData.ProductData productData= SessionCreateParams.LineItem.PriceData.ProductData.builder()
                .setName(productRequest.getName()).build();

        SessionCreateParams.LineItem.PriceData priceData= SessionCreateParams.LineItem.PriceData.builder()
                .setCurrency(productRequest.getCurrency()==null?"USD": productRequest.getCurrency())
                .setUnitAmount(productRequest.getAmount())
                .setProductData(productData)
                .build();

        SessionCreateParams.LineItem lineItem = SessionCreateParams.LineItem.builder()
                .setQuantity(productRequest.getQuantity())
                .setPriceData(priceData)
                .build();
        
        SessionCreateParams params=SessionCreateParams.builder()
                .setMode(SessionCreateParams.Mode.PAYMENT)                
                .setSuccessUrl("http://localhost:8080/user/SuccessEnterprise")
                .setCancelUrl("http://localhost:8080/cancel")
                .addLineItem(lineItem)
                .build();

        Session session=null;
        try{
            session= Session.create(params);
        }catch(StripeException ex){
            System.out.println(ex.getMessage());
        }
        return StripeResponseEnterprise.builder()
                .status("SUCCESS")
                .message("Payment Session Created")
                .sessionId(session.getId())
                .sessionUrl(session.getUrl())
                .build();
    }
}
