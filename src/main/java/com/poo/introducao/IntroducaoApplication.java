package com.poo.introducao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class IntroducaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoApplication.class, args);

		limpa_windows();


		Lista2 lista2 = new Lista2();
		lista2.ex1();
		lista2.ex2();
		lista2.ex3();
		lista2.ex4();
		lista2.ex5();
		lista2.ex6();
		lista2.ex7();
		lista2.ex8();

		finaliza();
		
	}
	static void limpa_windows() {
		try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.println("Este comando só funciona no Windows.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		} 
		static void finaliza() {
			System.out.println("\n\n\n\n");
	} 
}
