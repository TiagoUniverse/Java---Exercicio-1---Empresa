package Funcionario;

import Departamento.Departamento;

public class Funcionario extends Departamento {

    protected String nome;

    protected  double salario;

    protected String data_admissao;

    public Funcionario(String nome, int cnpj, String nome1, String nome_funcionario, double salario, String data_admissao) {
        super(nome, cnpj, nome1);
        this.nome = nome_funcionario;
        this.salario = salario;
        this.data_admissao = data_admissao;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getData_admissao() {
        return data_admissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
