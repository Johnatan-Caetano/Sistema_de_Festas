import java.util.ArrayList;
import java.util.List;

public class Tema {
    private String nome;
    private double valorAluguel;
    private String corToalha;
    private List<ItemTema> itens = new ArrayList<ItemTema>();
    private List<Tema> listaTemas = new ArrayList<Tema>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValorAluguel() {
        return valorAluguel;
    }
    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
    public String getCorToalha() {
        return corToalha;
    }
    public void setCorToalha(String corToalha) {
        this.corToalha = corToalha;
    }
    public List<ItemTema> getItens() {
        return itens;
    }
    public void setItens(List<ItemTema> itens) {
        this.itens = itens;
    }


    public void listarTemas() {
        Tema temaIromMan = new Tema();
        temaIromMan.setCorToalha("Vermelho");
        temaIromMan.setNome("Irom Man");
        temaIromMan.setValorAluguel(380.00);
        itens.add(new ItemTema("Sede Vingadores"));
        itens.add(new ItemTema("Balão Vermelho e amarelo"));
        itens.add(new ItemTema("Armadura Iron Man"));
        itens.add(new ItemTema("Bolo decorado Iron Man"));
        itens.add(new ItemTema("Banner do Cliente vestido com a armadura"));
        temaIromMan.setItens(itens);

        Tema temaFrozen = new Tema();
        temaFrozen.setCorToalha("Rosa e Azul");
        temaFrozen.setNome("Frozen");
        temaFrozen.setValorAluguel(250.00);
        itens = new ArrayList<>();
        itens.add(new ItemTema("Castelo"));
        itens.add(new ItemTema("Neve artificial"));
        itens.add(new ItemTema("Fantasia"));
        itens.add(new ItemTema("Atriz vestida das personagens"));
        temaFrozen.setItens(itens);

        Tema temaDragonBall = new Tema();
        temaDragonBall.setCorToalha("vermelho e Azul");
        temaDragonBall.setNome("Dragon Ball");
        temaDragonBall.setValorAluguel(480.00);
        itens = new ArrayList<>();
        itens.add(new ItemTema("Esferas do dragão"));
        itens.add(new ItemTema("Fantasia"));
        itens.add(new ItemTema("Personagens vestidos"));
        itens.add(new ItemTema("Bolo decorado"));
        temaDragonBall.setItens(itens);

        Tema temaBarbie = new Tema();
        temaBarbie.setCorToalha("Rosa");
        temaBarbie.setNome("Barbie");
        temaBarbie.setValorAluguel(700.00);
        itens = new ArrayList<>();
        itens.add(new ItemTema("Casa da Barbie"));
        itens.add(new ItemTema("Fantasia"));
        itens.add(new ItemTema("Personagens vestidos"));
        itens.add(new ItemTema("Bolo decorado"));
        temaBarbie.setItens(itens);

        listaTemas.add(temaIromMan);
        listaTemas.add(temaFrozen);
        listaTemas.add(temaDragonBall);
        listaTemas.add(temaBarbie);
        listaTemas.forEach(tema ->{
            System.out.println("**********************************************");
            System.out.println("Tema: "+tema.getNome());
            System.out.println("Valor do Aluguel: "+tema.getValorAluguel());
            System.out.println("Cor da Toalha: "+tema.getCorToalha());
            System.out.println("**********************************************");
        });
    }

    public void consultarTema(String nomeTema) {
        for (Tema tema : listaTemas) {
            if(tema.getNome().equals(nomeTema)) {
                System.out.println("**********************************************");
                System.out.println("Tema: "+tema.getNome());
                System.out.println("Valor do Aluguel: "+tema.getValorAluguel());
                System.out.println("Cor da Toalha: "+tema.getCorToalha());
                System.out.println("**********************************************");
                tema.getItens().forEach(item -> {
                    System.out.println("Itens: ");
                    System.out.println(item.getItem());
                });
            }
        }
    }

}
