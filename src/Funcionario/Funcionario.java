package Funcionario;

import Departamento.Departamento;

public class Funcionario extends Departamento {

    protected String nome;

    protected  double salario;

    protected  String data_admissao;

    public Funcionario(String nome_departamento, String nome_funcionario, double salario, String data_admissao) {
        super(nome_departamento);
        this.nome = nome_funcionario;
        this.salario = salario;
        this.data_admissao = data_admissao;
    }

    //    @Override
//    public String toString() {
//        return "Funcionario{" +
//                "nome='" + nome + '\'' +
//                ", salario=" + salario +
//                '}';
//    }


    @Override
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getData_admissao() {
        return data_admissao;
    }
}
