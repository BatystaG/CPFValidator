package entities;

import Services.CPFAutenticator;

public class PersonalNumber {

    private Long cpfNumber;

    public PersonalNumber(){
    }

    public PersonalNumber(long cpfNumber){
        this.cpfNumber = cpfNumber;
    }

    public Long getCpfNumber() {
        return cpfNumber;
    }

    public void setCpfNumber(Long cpfNumber) {
        this.cpfNumber = cpfNumber;
    }
}
