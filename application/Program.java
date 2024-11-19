package application;

import Services.CPFAutenticator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o número do CPF para verificar se é válido: ");
            String cpf = sc.nextLine();

            // Remove os caracteres que não são números
            String fmt = cpf.replaceAll("[^\\d]", "");

            CPFAutenticator cpfAutenticator = new CPFAutenticator();

            if (cpfAutenticator.cpfValidate(fmt)) {
                System.out.println("O CPF digitado é Valido!");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Número digitado inválido.");
        }
        catch (Exception e) {
            System.out.println("CPF Inválido!");
        }
        finally {
            sc.close();
        }

    }
}
