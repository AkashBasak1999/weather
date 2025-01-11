package com.example.demo.Controller;

import org.springframework.http.HttpEntity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.paymentEnterprise.ProductRequestEnterprise;
import com.example.demo.paymentEnterprise.StripeResponseEnterprise;
import com.example.demo.paymentEnterprise.StripeServiceEnterprise;
import com.example.demo.paymentStarter.ProductRequestStarter;
import com.example.demo.paymentStarter.StripeResponseStarter;
import com.example.demo.paymentStarter.StripeServiceStarter;
import com.example.demo.security.SecurityUtils;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Controller
@RequestMapping("/user/product/v1")
public class ProductCheckoutController {

	@Autowired
	private StripeServiceStarter stipeServiceStarter;
	
	@Autowired
	private StripeServiceEnterprise stipeServiceEnterprise;

	
	@Autowired
	RestTemplate rest;

	@Autowired
	UserRepository userRepo;

	public ProductCheckoutController() {}
	
	public ProductCheckoutController(StripeServiceStarter stripeServiceStarter) {
		this.stipeServiceStarter = stripeServiceStarter;
	}
	public ProductCheckoutController(StripeServiceEnterprise stripeServiceEnterprise) {
		this.stipeServiceEnterprise = stripeServiceEnterprise;
	}

	
	@RequestMapping("/checkout/starter")
	public ResponseEntity<StripeResponseStarter> checkoutStarter(@RequestBody ProductRequestStarter productRequest,
			Model model) throws IOException {
		System.out.println("hello" + productRequest);
		StripeResponseStarter stripeResponseStarter = stipeServiceStarter.checkoutProducts(productRequest);
		return ResponseEntity.status(HttpStatus.OK).body(stripeResponseStarter);
	}
	
	@RequestMapping("/checkout/enterprise")
	public ResponseEntity<StripeResponseEnterprise> checkoutEnterprise(@RequestBody ProductRequestEnterprise productRequest,
			Model model) throws IOException {
		System.out.println("hello" + productRequest);
		StripeResponseEnterprise stripeResponseEnterprise = stipeServiceEnterprise.checkoutProducts(productRequest);
		return ResponseEntity.status(HttpStatus.OK).body(stripeResponseEnterprise);
	}

	@RequestMapping("/starterprocessing")
	public ModelAndView starterPayment(HttpSession session) throws IOException {

		String value = SecurityUtils.getLoggedInUsername();
		User user = userRepo.getUserByUserName(value);
		session.setAttribute("loggeduser", user.getEmail());
		session.setAttribute("loggedusername", user.getName());

		String rawJSONBody = "{\"amount\":1000,\"quantity\":1,\"currency\":\"USD\",\"name\":\"Plan\"}";

		String API = "http://localhost:8080/user/product/v1/checkout/starter";

		System.out.println(rawJSONBody);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<>(rawJSONBody, headers);

		ResponseEntity<StripeResponseStarter> response = rest.postForEntity(API, entity, StripeResponseStarter.class);
		String str = response.getBody().getSessionUrl();

		System.out.println(str);
		String ret = "redirect:url";
		String retmod = ret.replace("url", str);
		return new ModelAndView(retmod);
	}

	@RequestMapping("/enterpriseprocessing")
	public ModelAndView enterprisePayments(HttpSession session) throws IOException {
		String value = SecurityUtils.getLoggedInUsername();
		User user = userRepo.getUserByUserName(value);
		session.setAttribute("loggeduser", user.getEmail());
		session.setAttribute("loggedusername", user.getName());
		
		String rawJSONBody = "{\"amount\":2000,\"quantity\":1,\"currency\":\"USD\",\"name\":\"Plan\"}";

		String API = "http://localhost:8080/user/product/v1/checkout/enterprise";

		System.out.println(rawJSONBody);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<>(rawJSONBody, headers);

		ResponseEntity<StripeResponseEnterprise> response = rest.postForEntity(API, entity, StripeResponseEnterprise.class);
		String str = response.getBody().getSessionUrl();

		System.out.println(str);
		String ret = "redirect:url";
		String retmod = ret.replace("url", str);
		return new ModelAndView(retmod);
	}
}
