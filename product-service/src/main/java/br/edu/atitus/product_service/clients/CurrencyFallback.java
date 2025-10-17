package br.edu.atitus.product_service.clients;

import org.springframework.stereotype.Component;

import br.edu.atitus.product_service.CurrencyClient;

@Component
public class CurrencyFallback implements CurrencyClient{

	@Override
	public CurrencyResponse getCurrency(double value, String source, String target) {
		return null;
	}

}