//pacote
package programacaoi;

public class Cliente {

    //Atributos
    String nome;
    String cpf;
    String data_nascimento;
    String sexo;
    int conta;
    String endereco;
    String tipo_cartao;

    //Métodos - ações
    void sacar(){
        System.out.println("Efetuando saque!");
    }

    void consultarSaldo(){
        System.out.println("Consultando saldo!");
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
