package Empresa;

public class Empresa {

    protected String nome;

    protected int cnpj;

    public Empresa() {
        this.nome = "SamSam Tech";
        this.cnpj = 1234;
    }

    public String getNome() {
        return nome;
    }

    public int getCnpj() {
        return cnpj;
    }
}
