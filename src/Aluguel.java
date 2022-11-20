public class Aluguel {
    private String dataFesta;
    private String horarioInicio;
    private String horarioTermino;
    private double valorCobrado;
    private Endereco endereco = new Endereco();
    private Cliente cliente = new Cliente();
    private Tema tema = new Tema();


    public String getDataFesta() {
        return dataFesta;
    }
    public void setDataFesta(String dataFesta) {
        this.dataFesta = dataFesta;
    }
    public String getHorarioInicio() {
        return horarioInicio;
    }
    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }
    public String getHorarioTermino() {
        return horarioTermino;
    }
    public void setHorarioTermino(String horarioTermino) {
        this.horarioTermino = horarioTermino;
    }
    public double getValorCobrado() {
        return valorCobrado;
    }
    public void setValorCobrado(double valorCobrado) {
        this.valorCobrado = valorCobrado;
    }
    public Tema getTema() {
        return tema;
    }
    public void setTema(Tema tema) {
        this.tema = tema;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void novoAluguel(String nome, String telefone, String endereco, String numero,
                                 String complemento, String cep, String uf, String cidade, String bairro, String dataFesta,
                                 String horarioInicio, String horarioTermino, double valorCobrado, String nomeTema) {

        this.cliente.setNome(nome);
        this.cliente.setTelefone(telefone);

        this.endereco.setLogradouro(endereco);
        this.endereco.setCep(cep);
        this.endereco.setBairro(bairro);
        this.endereco.setCidade(cidade);
        this.endereco.setComplemento(complemento);
        this.endereco.setUf(uf);
        this.endereco.setNumero(numero);

        this.tema.setNome(nomeTema);

        this.dataFesta = dataFesta;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
        this.valorCobrado = valorCobrado;
    }

    public void listarAluguel() {
        System.out.println("Nome: "+ this.cliente.getNome());
        System.out.println("Telefone: "+ this.cliente.getTelefone());
        System.out.println("Endereço: "+ this.endereco.getLogradouro());
        System.out.println("CEP: "+ this.endereco.getCep());
        System.out.println("Bairro: "+ this.endereco.getBairro());
        System.out.println("Cidade: "+ this.endereco.getCidade());
        System.out.println("Complemento: "+ this.endereco.getComplemento());
        System.out.println("UF: "+ this.endereco.getUf());
        System.out.println("Número: "+ this.endereco.getNumero());
        System.out.println("Tema: "+ this.tema.getNome());
        System.out.println("Data da Festa: "+ this.dataFesta);
        System.out.println("Horário de Início: "+ this.horarioInicio);
        System.out.println("Horario de Término: "+ this.horarioTermino);
        System.out.println("Valor cobrado: "+ this.valorCobrado);

    }
}
