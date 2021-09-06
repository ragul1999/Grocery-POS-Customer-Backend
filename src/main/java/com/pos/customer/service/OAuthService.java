package com.pos.customer.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.pos.customer.entity.OAuth;
import com.pos.customer.exception.CustomerIdNotFoundException;

public interface OAuthService {
	ResponseEntity<String> createCustomerLogin(Long phoneNo,OAuth oauth) ;
	ResponseEntity<OAuth> getLoginDetails(Long phoneNo) ;
	ResponseEntity<String> updateLoginCredentials(Long phoneNo,String password) ;
}
