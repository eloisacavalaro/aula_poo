package com.poo.introducao;

import java.util.Scanner;

public class Lista2 {

    public static void ex1 (){

        verificaNumeroPar();

    }public static void verificaNumeroPar (){
        
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado;
        int resto;
        String opcao;

        System.out.println("Digite um número: ");
        numeroDigitado = scanner.nextInt();

        resto = numeroDigitado % 2;
        
        if( resto == 0){
            System.out.println("Seu número digitado é par.");
        } else {
            System.out.println("Seu número digitado é impar.");
        }


    }
    public static void ex2(){

        verificaMaior();

    } public static void verificaMaior(){
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Digite o primeiro número:");
        numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        numero2 = scanner.nextInt();

        if( numero1 > numero2){
            System.out.println( numero1 + " é maior que " + numero2 );
        }else if ( numero1 == numero2){
            System.out.println(numero1 +" é igual a" + numero2);
        } else {
            System.out.println(numero1 +" é menor que " + numero2);
        }
       

    }

    public static void ex3(){

        Scanner scanner = new Scanner (System.in);
        String resposta1, resposta2, resposta3;

        System.out.println("Você tem mais de 65 anos?");
        resposta1 = scanner.nextLine();

        System.out.println("Você é deficiente? ");
        resposta2 = scanner.nextLine();
        
        System.out.println("Você é gestante? ");
        resposta3 = scanner.nextLine();
        
        if(resposta1.equalsIgnoreCase("sim") || resposta2.equalsIgnoreCase("sim") || resposta3.equalsIgnoreCase("sim")){
            System.out.println("Você sera encaminhado para a fila preferencial.");
        }else {
            System.out.println("Você será encaminhado para a fila normal.");
        }
       

    }
    public static void ex4(){
        Scanner scanner = new Scanner (System.in);
        int idade;

        System.out.println("Insira sua idade: ");
        idade = scanner.nextInt();

        if(idade > 16 && idade < 18){
            System.out.println("Entrada permitida somente acompanhado pelos responsáveis.");
        }else if (idade < 16){
            System.out.println("Entrada proibida.");
        } else{
            System.out.println("Entrada permitida.");
        }
      
    }

    public static void ex5(){
        Scanner scanner = new Scanner(System.in);
        String loginCorreto = "eloisa";
        String senhaCorreta = "123";

        System.out.print("Digite seu login: ");
        String login = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        boolean loginIncorreto = !login.equals(loginCorreto);
        boolean senhaIncorreta = !senha.equals(senhaCorreta);

        if (!loginIncorreto && !senhaIncorreta) {
            System.out.println("Login bem-sucedido!");
        } else {
            if (loginIncorreto) {
                System.out.println("Login incorreto.");
            }
            if (senhaIncorreta) {
                System.out.println("Senha incorreta.");
            }
        }
      
    }
    public static void ex6(){

        Scanner scanner = new Scanner(System.in);
        double nota1, nota2;
        double resultado;
        double recuperacao;

        System.out.println("Digite sua primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        nota2 = scanner.nextDouble();

        resultado = (nota1 + nota2) / 2;

             if(resultado >= 6){
            System.out.println("Parabéns, você foi aprovado.");
             } else{
            System.out.println("Média:"+ resultado +"Nota de recuperação: ");
            recuperacao = scanner.nextDouble();
            

             if( (nota1 > nota2) && (recuperacao > nota2)){
            resultado = (nota1 + recuperacao) /2;
             }else if( (nota2> nota1) && (recuperacao > nota1)){
            resultado = (nota2 + recuperacao) /2;
            }

             if ( resultado >= 6){
            System.out.println("Parabéns, você foi aprovado! Média : "+ resultado);
             } else{
            System.out.println("Reprovado! Média: " + resultado);
            }
        
        }
       

    }
    public static void ex7(){

        Scanner scanner = new Scanner(System.in);
        int dividendo;
        int divisor;
        double resto;
        double resultado;

        System.out.println("Digite um número para dividir: ");
        dividendo = scanner.nextInt();

        System.out.println("Digite o divisor: ");
        divisor = scanner.nextInt();

        resto = dividendo % divisor;
        resultado = dividendo / divisor;

        if(resto == 0){
            System.out.println(dividendo + " é divisivel por " + divisor);
        } else{
            System.out.println("Não é possível dividir " + dividendo + " por " + divisor + "o resultado seria :"+ resultado );
        }
       

    }
    public static void ex8(){

        Scanner scanner = new Scanner(System.in);
        int chances = 3;
        int resposta1, resposta2, resposta3, resposta4, resposta5;

        System.out.println("Quem descobriu o brasil?\n");
        System.out.println("1) Pedro Vieira\n");
        System.out.println("2) Pedro Alvares Cabral\n");
        System.out.println("3) Pedro Santos\n");
        resposta1 = scanner.nextInt();

        if(resposta1 != 2){
            chances--;
        }

        System.out.println("Que time conquistou a libertadores de 2000?\n");
        System.out.println("1) Flamengo\n");
        System.out.println("2) Vasco\n");
        System.out.println("3) Nenhuma das anteriores\n");
        resposta2 = scanner.nextInt();

        if(resposta2 != 2){
            chances--;
        }

        System.out.println("Qual o maior artilheiro do brasilierão de todos os tempos?\n");
        System.out.println("1) Zico\n");
        System.out.println("2) Roberto Dinamite\n");
        System.out.println("3) Nenhuma das anteriores\n");
        resposta3 = scanner.nextInt();

        if(resposta3 != 2){
            chances--;
        }

        System.out.println("Qual as cores primarias?\n");
        System.out.println("1) Azul, verde e roxo\n");
        System.out.println("2) Azul, vermelho e amarelo\n");
        System.out.println("3) Nenhuma das anteriores\n");
        resposta4 = scanner.nextInt();

        if( chances == 0){
            System.out.println("Você perdeu.");
        } else if(resposta4 != 2){
                chances--;
            }
        
        System.out.println("Quem foi a primeira pessoa a pisar na lua?\n");
        System.out.println("1) Yuri Gagarin\n");
        System.out.println("2) Neil Armstrong\n");
        System.out.println("3) Nenhuma das anteriores\n");
        resposta5 = scanner.nextInt();

        if(resposta4 != 2){
                System.out.println("Você perdeu.");
        }else { 
                System.out.println("Parabéns, você venceu!!! ");
        }
       

    }

}
