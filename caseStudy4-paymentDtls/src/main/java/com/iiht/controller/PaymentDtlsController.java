package com.iiht.controller;

import java.util.List;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.model.PaymentDtls;
import com.iiht.service.PaymentDtlsService;

@RestController
public class PaymentDtlsController {
	@Autowired
	PaymentDtlsService paymentDtlsService;

	@GetMapping("/hello")
	String sayHello() {
		return "hello";
	}

	@GetMapping("/payment")
	public List<PaymentDtls> getAllPaymentDtls() {
		return paymentDtlsService.getAllPaymentDtls();
	}

	@PostMapping("/payment")
	public void addPaymentDtls(@RequestBody PaymentDtls paymentDtls) {
		paymentDtlsService.addPaymentDtls(paymentDtls);
	}
	
	@PutMapping("/payment/update/{id}")
	public void updatePaymentDtls(@RequestBody PaymentDtls paymentDtls,@PathVariable int id){
		paymentDtlsService.updatePaymentDtls(paymentDtls,id);
	}
	
	@DeleteMapping("/payment/delete/{id}")
	public void deletePaymentDtls(@PathVariable Long id){
		paymentDtlsService.deletePaymentDtls(id);
	}

}