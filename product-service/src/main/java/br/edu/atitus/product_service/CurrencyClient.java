package br.edu.atitus.product_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.atitus.product_service.clients.CurrencyFallback;
import br.edu.atitus.product_service.clients.CurrencyResponse;

@FeignClient(name = "currency-service"
		         , fallback = CurrencyFallback.class)
public interface CurrencyClient {

	@GetMapping("/currency/{value}/{source}/{target}")
	CurrencyResponse getCurrency(
			@PathVariable double value,
			@PathVariable String source,
			@PathVariable String target
			);
	
	
}