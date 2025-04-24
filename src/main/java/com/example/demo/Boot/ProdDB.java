package com.example.demo.Boot;

import org.springframework.stereotype.Component;

@Component
public class ProdDB implements DB{
	
	
	@Override
	public String getData() {
		return "Prod Data";
	}

}
