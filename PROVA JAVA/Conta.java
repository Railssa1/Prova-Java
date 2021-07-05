import java.util.*; 
class Conta {
    int opcoes;
    Scanner sc = new Scanner(System.in); 
    String saida;
    String inicio;
    String titular;
    String agencia;
    String data_abertura;
    Double saldo;
    int sacar;
    int depositar;
    Double rendimento;
    
 ;
    


//Método construtor

public Conta(String inicio, String titular, String agencia, String data_abertura, Double saldo, int sacar, int depositar, Double rendimento, String saida) {
    this.inicio = inicio;
    this.titular = titular;
    this.agencia = agencia;
    this.data_abertura = data_abertura;
    this.saldo = saldo;
    this.sacar = sacar;
    this.depositar = depositar;
    this.rendimento = rendimento;
    this.saida = saida; 
 
} 



static void inicio() {
    
}


public void opcoes() {
    
        System.out.println("Digite seu nome");
        titular = sc.nextLine();
        System.out.println(" Bem-vindo ao banco do Brasil " + ","+ titular);
      
    System.out.println(" Algumas informacoes da conta: \n 1-Saldo: \n 2-Sacar:  \n 3-Deposito:  \n 4-Rendimento: \n Escolha o que deseja saber");
    opcoes = sc.nextInt ();

    switch(opcoes) {

    case 1: 
    System.out.println("Seu saldo e de: " + saldo);
    break;

    case 2: 
    System.out.println("Seu saldo e de: " + saldo + " Digite o valor que deseja sacar: ");
    sacar = sc.nextInt();
    saldo = saldo - sacar;
    System.out.println("Seu saldo atual e de: " + saldo );
    break;

    case 3: 
    System.out.println("Seu saldo e de: " + saldo +" Digite o valor que deseja depositar: ");
    depositar = sc.nextInt();
    saldo = saldo + depositar;
    System.out.println("Seu saldo atual e de: " + saldo );
    break;

    case 4: 
    System.out.println("O seu dinheiro tem um rendimento de 0.02% mensalmente");
    break;

    }
}

public String returninicio() {
    return this.inicio;
}



public String returnagencia() {
    return this.agencia;
}

public Double Saldo(){
return saldo = 1500.00;
}    

public void sacar() {
    System.out.println("Digite a quantidade que deseja sacar: ");
    sacar = sc.nextInt ();
}

public void depositar() {
    System.out.println("Digite quanto voce quer depositar: ");
    depositar = sc.nextInt();
}

public Double returnrendimento() {
    return this.rendimento;
}

public String returndata_abertura() {
    return this.data_abertura;
}

public String returntitular() {
    return null;
}
}