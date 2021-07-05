public class ProgConta {
    public static void main(String[] args) {

        Conta Conta1 = new Conta("Bem-vindo", " Aang", "Banco do Brasil", "01/07/2021", 1500.00, 200, 150, 0.02, " Obrigada por usar nosso banco! ");
        

        System.out.println(Conta1.returninicio() + ","+ " Sua agencia e: " + Conta1.returnagencia() + " que foi aberta na data: " + Conta1.returndata_abertura());
        
        
        Conta1.opcoes();
        
        System.out.println("Obrigada por usar nosso banco! "  );
        
        //Conta.inicio();
       
    }
}
