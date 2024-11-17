package Services;

import entities.PersonalNumber;

import java.util.concurrent.ExecutionException;

public class CPFAutenticator {

    private PersonalNumber personalNumber;

    public CPFAutenticator(){
    }

    public CPFAutenticator(PersonalNumber personalNumber){
        this.personalNumber = personalNumber;
    }

    public boolean verificaSeTodosOsNumerosSaoIguais(){
        String number = personalNumber.getCpfNumber().toString();
        for(int i = 0; i<number.length(); i++){

        }
    }

    public boolean cpfValidate(){
        String number = personalNumber.getCpfNumber().toString();

        if (number.length() != 11){
            throw new IllegalArgumentException("Número Inválido!") ;
        } else if ( )

        return false;
    }


}
