package application;

import Services.CPFAutenticator;
import entities.PersonalNumber;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o número do CPF para verificar se é válido: ");
            String cpf = sc.nextLine();

            // Remove os caracteres que não são números e converte a string para Long
            String fmt = cpf.replaceAll("[^\\d]", "");
            long num = Long.parseLong(fmt);

            CPFAutenticator cpfAutenticator = new CPFAutenticator(new PersonalNumber(num));

            if (cpfAutenticator.cpfValidate()) {
                System.out.println("O CPF digitado é Valido!");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Número digitado inválido.");
        }
        finally {
            sc.close();
        }

    }
}
