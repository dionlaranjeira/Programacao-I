package programacaoi;

public class Conta {

    //atributos
    int numero;
    int agencia;
    double saldo;
    String tipo;
    double limite;

    //Métodos - ações
    boolean sacar(double valor){
        if(valor < (saldo + limite) ) {
            System.out.println("Efetuando saque de " + valor);
            saldo = saldo - valor;
            return true;
        }else{
            System.out.println("Saldo insuficiente para saque");
            return false;
        }
    }

    void consultarSaldo(){
        System.out.println("Saldo:"+saldo);
    }

    void consultarLimite(){
        System.out.println("Limite do cliente:"+limite);
    }

    //Exercicio para os alunos - implementar o método depositar
    void depositar(){
        System.out.println("Efetuando deposito!");
    }

    //Exercicio para os alunos - implementar o método pagarCartao
    void pagarCartao(){
        System.out.println("Pagando o cartão");
    }

    void transferirPara(Cliente cliente_destino, double valor_transferido){
        System.out.println("Efetuando transferências");
        System.out.println("Retirando da conta do cliente");
        System.out.println("Valor transferido: "+ valor_transferido);
        if(sacar(valor_transferido)){
            System.out.println("Depositando na conta do cliente:" + cliente_destino.nome);
            cliente_destino.conta.saldo += valor_transferido;
        }else{
            System.out.println("Transferência não executada, saldo insuficiente");
        }
    }

}
