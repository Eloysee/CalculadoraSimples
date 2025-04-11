package Principal;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Solicita os números ao usuário
	        System.out.print("Digite o primeiro número: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Digite o segundo número: ");
	        double num2 = scanner.nextDouble();

	        // Solicita a operação desejada
	        System.out.print("Escolha a operação (+, -, *, /): ");
	        char operacao = scanner.next().charAt(0);

	        double resultado;

	        // Executa a operação de acordo com a escolha do usuário
	        switch (operacao) {
	            case '+':
	                resultado = num1 + num2;
	                System.out.println("Resultado: " + resultado);
	                break;
	            case '-':
	                resultado = num1 - num2;
	                System.out.println("Resultado: " + resultado);
	                break;
	            case '*':
	                resultado = num1 * num2;
	                System.out.println("Resultado: " + resultado);
	                break;
	            case '/':
	                if (num2 != 0) {
	                    resultado = num1 / num2;
	                    System.out.println("Resultado: " + resultado);
	                } else {
	                    System.out.println("Erro: divisão por zero não é permitida.");
	                }
	                break;
	            default:
	                System.out.println("Operação inválida.");
	        }

	        scanner.close();
	    }

	}

