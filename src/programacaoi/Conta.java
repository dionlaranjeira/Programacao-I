package programacaoi;

public class Conta {

    //atributos
    int numero;
    int agencia;
    double saldo;
    String tipo;
    double limite;

    //Métodos - ações
    void sacar(double valor){
        if(valor < (saldo + limite) ) {
            System.out.println("Efetuando saque de " + valor);
            saldo = saldo - valor;
        }else{
            System.out.println("Saldo insuficiente para saque");
        }
    }


    void consultarSaldo(){
        System.out.println("Saldo:"+saldo);
    }

    void consultarLimite(){
        System.out.println("Limite do cliente:"+limite);
    }

    void depositar(){
        System.out.println("Efetuando deposito!");
    }

    void pagarCartao(){
        System.out.println("Pagando o cartão");
    }

    void transferir(){
        System.out.println("Efetuando transferências");
    }

}
