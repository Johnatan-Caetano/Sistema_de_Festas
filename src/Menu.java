import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcao;
        Tema tema = new Tema();
        Aluguel aluguel = new Aluguel();


        do {
            System.out.println("********* Sistema de cadastro de festas *********\n"
                    + "1 - Consultar todos os temas cadastrados \n"
                    + "2 - Consultar tema individual\n"
                    + "3 - Realizar novo aluguel \n"
                    + "4 - Imprimir aluguel salvo\n"
                    + "5 - Sair\n"
                    + "********************************");
            opcao = entrada.next();
            switch(opcao) {
                case "1":
                    tema.listarTemas();
                    break;
                case "2":
                    System.out.println("Informe o tema desejado: ");
                    String nomeTema=entrada.next();
                    tema.consultarTema(nomeTema);
                    break;
                case "3":
                    aluguel.novoAluguel("Johnatan", "(61)98504-3864", "QC 05 Conjunto 03 Lote 03 Bloco H Apartamento 103", "103", "Condomínio 19", "71882-203", "DF", "Brasília", "Riacho Fundo II", "04/12/2022", "15:00", "19:00", 480.00, "Dragon Ball" );
                    break;
                case "4":
                    aluguel.listarAluguel();
                    break;
                case "5":
                    System.out.println("Encerrando o sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(opcao!="5");


    }
}