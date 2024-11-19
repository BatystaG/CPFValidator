package Services;

public class CPFAutenticator {

    public CPFAutenticator(){
    }

    public void verificaResto(double resto, char digito) throws Exception {
        if (resto < 2){
            if (!(Integer.parseInt(String.valueOf(digito)) == 0)){
                throw new Exception("CPF Inválido");
            }
        } else if (!(Integer.parseInt(String.valueOf(digito)) == 11 - resto)){
            throw new Exception("CPF Inválido");
        }
    }

    public void cpfValidate(String cpf) throws Exception {

        // verifica se a entrada tem 11 digitos e não são iguais
        if (cpf.length() != 11 || cpf.matches("(.)\\1{10}")){
            throw new IllegalArgumentException("Número Inválido.") ;
        }

        int acumuladorPrimeiroDigito = 0;
        int acumuladorSegundoDigito = 0;
        char primeiroDigito = cpf.charAt(9);
        char segundoDigito = cpf.charAt(10);

        // primeira etapa de validação ( Primeiro Digito )
         for (int i = 0; i< cpf.length() -2; i++){
           int num = Integer.parseInt(String.valueOf(cpf.charAt(i))) * (10 - i);
            acumuladorPrimeiroDigito += num;
        }

        double resto1 = acumuladorPrimeiroDigito % 11;

        verificaResto(resto1,primeiroDigito);

        // segunda etapa de validação ( Segundo Digito )

        for (int i = 0; i< cpf.length() -1; i++){
            int num = Integer.parseInt(String.valueOf(cpf.charAt(i))) * (11 - i);
            acumuladorSegundoDigito += num;
        }

        double resto2 = acumuladorSegundoDigito % 11;

        verificaResto(resto2,segundoDigito);

    }


}
