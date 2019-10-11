package com.iiht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.model.PaymentDtls;
import com.iiht.repository.PaymentDtlsRepository;

@Service
@Transactional
public class PaymentDtlsService {

	@Autowired
	PaymentDtlsRepository paymentDtlsRepository;

	public List<PaymentDtls> getAllPaymentDtls() {
		// TODO Auto-generated method stub
		return (List<PaymentDtls>) paymentDtlsRepository.findAll();
	}

	public void addPaymentDtls(PaymentDtls paymentDtls) {
		paymentDtlsRepository.save(paymentDtls);

	}

	public void updatePaymentDtls(PaymentDtls paymentDtls, int id) {
		paymentDtls.setId(id);
	paymentDtlsRepository.save(paymentDtls);
		
		
	}

	public void deletePaymentDtls(Long id) {
		paymentDtlsRepository.deleteById(id);
		
	}

}
