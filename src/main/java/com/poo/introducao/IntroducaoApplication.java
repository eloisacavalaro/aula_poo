package com.poo.introducao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class IntroducaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoApplication.class, args);

		limpa_windows();


<<<<<<< HEAD
<<<<<<< HEAD
		Lista4 lista4 = new Lista4();
		lista4.ex1();
		lista4.ex2();
		lista4.ex3();
		lista4.ex4();
		lista4.exsDo5ao8();
	
=======
=======
>>>>>>> parent of 1fc0b9a (Lista 4 resolvida.)
		Lista3 lista3 = new Lista3();

		lista3.ex1();
		lista3.ex2();
		lista3.ex3();
		lista3.ex4();
		lista3.ex5();
		lista3.ex6();
		lista3.ex7();
		
>>>>>>> 9134f53499b5341020e2e540f03bf9babf949256

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
