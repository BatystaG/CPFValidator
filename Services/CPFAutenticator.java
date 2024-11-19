package Services;

public class CPFAutenticator {

    private String cpf;

    public CPFAutenticator(){
    }

    public CPFAutenticator(String cpf){
        this.cpf = cpf;
    }

    public String getPersonalNumber() {
        return cpf;
    }

    public void setPersonalNumber(String cpf) {
        this.cpf = cpf;
    }

    public boolean cpfValidate() throws Exception {

        boolean valid = false;

        if (cpf.length() != 11 || cpf.matches("(.)\\1{10}")){
            throw new IllegalArgumentException("Número Inválido.") ;
        }

        int acumuladorPrimeiroDigito = 0;
        int acumuladorSegundoDigito = 0;
        char primeiroDigito = cpf.charAt(9);
        char segundoDigito = cpf.charAt(10);

        for (int i = 0; i< cpf.length() -2; i++){
           int num = Integer.parseInt(String.valueOf(cpf.charAt(i))) * (10 - i);
            acumuladorPrimeiroDigito += num;
        }

        double resto1 = acumuladorPrimeiroDigito % 11;

        if (resto1 < 2){
            if (Integer.parseInt(String.valueOf(primeiroDigito)) == 0){
                for (int i = 0; i< cpf.length() -1; i++){
                    int num = Integer.parseInt(String.valueOf(cpf.charAt(i))) * (11 - i);
                    acumuladorSegundoDigito += num;
                }
            }else {
                throw new Exception("CPF Inválido");
            }
        } else if (Integer.parseInt(String.valueOf(primeiroDigito)) == 11 - resto1){
            for (int i = 0; i< cpf.length() -1; i++){
                int num = Integer.parseInt(String.valueOf(cpf.charAt(i))) * (11 - i);
                acumuladorSegundoDigito += num;
            }
        }else {
            throw new Exception("CPF Inválido");
        }

        double resto2 = acumuladorSegundoDigito % 11;

        if (resto2 < 2){
            if (Integer.parseInt(String.valueOf(segundoDigito)) == 0){
                valid = true;
            }else {
                throw new Exception("CPF Inválido");
            }
        }else if (Integer.parseInt(String.valueOf(segundoDigito)) == (11 - resto2)){
            valid = true;
        } else {
            throw new Exception("CPF Inválido");
        }

        return valid;
    }


}
