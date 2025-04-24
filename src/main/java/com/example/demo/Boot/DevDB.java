package com.example.demo.Boot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DevDB implements DB{

	@Override
	public String getData() {
		return "Dev Data";
	}
}
