//Pacote - pasta para organizar

package programacaoi;

//Classe - um objeto do mundo real

public class Principal {

    //Métodos - ação
    //Método principal - main
    public static void main(String[] args) {

        //Objeto - instância de uma classe - um objeto em específico
        // Classe objeto = novo Construtor();
        Cliente willian = new Cliente();

        Cliente danilo = new Cliente();
        Cliente dion = new Cliente();

        willian.nome = "Willian Santos";
        willian.sexo = "Masculino";

        //Criação do Objeto conta_willian
        Conta conta_willian = new Conta();

        //Atribuicao da conta_willian para o Objeto Willian
        willian.conta = conta_willian;

        conta_willian.saldo = 1000.00;
        conta_willian.limite = 500.00;
        conta_willian.tipo = "corrente";

        danilo.nome = "Danilo Melo";
        dion.nome = "Dion Laranjeira";


        Conta conta_danilo = new Conta();

        danilo.conta = conta_danilo;

        conta_danilo.saldo = 5000.00;
        conta_danilo.limite = 1000.00;


        System.out.println("-------------");
        System.out.println("Cliente:"+willian.nome);
        willian.conta.consultarSaldo();
        willian.conta.consultarLimite();
        System.out.println("-------------");

        System.out.println("Cliente:"+danilo.nome);
        danilo.conta.consultarSaldo();
        danilo.conta.consultarLimite();

//        danilo.conta.sacar(1000000);
//        danilo.conta.consultarSaldo();


        danilo.conta.transferirPara(willian, 500);

        System.out.println("Cliente:"+danilo.nome);
        danilo.conta.consultarSaldo();

        System.out.println("Cliente:"+willian.nome);
        willian.conta.consultarSaldo();

        System.out.println("-------------");
    }


}
