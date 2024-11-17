package entities;

public class PersonalNumber {

    private Double cpfNumber;

    public PersonalNumber(){
    }

    public PersonalNumber(double cpfNumber){
        this.cpfNumber = cpfNumber;
    }

    public Double getCpfNumber() {
        return cpfNumber;
    }

    public void setCpfNumber(Double cpfNumber) {
        this.cpfNumber = cpfNumber;
    }
}
