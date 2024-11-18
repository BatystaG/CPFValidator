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

    public PersonalNumber getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(PersonalNumber personalNumber) {
        this.personalNumber = personalNumber;
    }

    public boolean cpfValidate(){
        String number = personalNumber.getCpfNumber().toString();

        if (number.length() != 11 || number.matches("(.)\\1{10}")){
            throw new IllegalArgumentException("Número Inválido.") ;
        }

        return true;
    }


}
