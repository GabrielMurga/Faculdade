public  final class Validador {
    private Validador(){}
    public static boolean validarCPF(String cpf){
        if (cpf == null || !cpf.matches("^(\\d{3}\\.?){2}\\d{3}-?\\d{2}$")) {

            return false;
        }
        return true;
    }
    public  static boolean validarCEP(String cep){
        if(cep == null || !cep.matches("^[0-9]{5}-?[0-9]{3}$")){
            return false;
        }
        return true;
    }

}
