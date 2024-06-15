package com.poo.introducao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class IntroducaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoApplication.class, args);

		Lista1 lista = new Lista1();
		lista.ex1();
		lista.ex2();
		lista.ex3();
		lista.ex4();
		lista.ex5();
		lista.ex6();
		lista.ex7();
		lista.ex8();
		
	}

}
