package com.rezorpay.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentCheckout {
    @GetMapping("/payment")
    public String showPaymentPage(){

//model.addAttribute("orderId" , orderId);

        return "payment-request";
    }
}
