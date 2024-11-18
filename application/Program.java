package application;

import Services.CPFAutenticator;
import entities.PersonalNumber;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número:");
        long num = sc.nextLong();

        PersonalNumber number = new PersonalNumber(num);
        CPFAutenticator cpfAutenticator = new CPFAutenticator(number);




        if (cpfAutenticator.cpfValidate()){
            System.out.println("CPF valido");
        }



        sc.close();
    }
}
