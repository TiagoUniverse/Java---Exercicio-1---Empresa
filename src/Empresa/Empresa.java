package Empresa;

public class Empresa {
    protected String nomeEmpresa;
    protected String cnpj;

    public Empresa(String nomeEmpresa, String cnpj) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
    }


    @Override
    public String toString() {
        return "Empresa{" +
                "nomeEmpresa='" + nomeEmpresa + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }

}

