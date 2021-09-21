//Pacote - pasta para organizar

package programacaoi;

//Classe - um objeto do mundo real

public class Principal {

    //Atributos - caracteristicas
    float tamanho;
    int idade;
    String sexo;
    String cpf;
    boolean salvavel;
    boolean editavel;


    //Métodos - ação
    //Método principal - main
    public static void main(String[] args) {
        //variável
        float altura;
        float nota;
        mostrarMensagem();

        //Objeto - instância de uma classe - um objeto em específico
        // Classe objeto = novo Construtor();
        Cliente willian = new Cliente();
        Cliente danilo = new Cliente();
        Cliente dion = new Cliente();

        willian.nome = "Willian Santos";
        danilo.nome = "Danilo Melo";
        dion.nome = "Dion Laranjeira";

        System.out.println(dion.endereco);

    }

    public static void mostrarMensagem(){
        System.out.println("Olá mundo!");
        mostrarOutraMensagem();
    }

    public static void mostrarOutraMensagem(){
        System.out.println("Olá alunos de Programação I");
    }


}
