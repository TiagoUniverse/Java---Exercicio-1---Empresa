package Departamento;

import Empresa.Empresa;
import Funcionario.Funcionario;

Departamentoimport java.util.ArrayList;
//import java.util.List;
//

// Classe Departamento que herda de Empresa
class Departamento extends Empresa {


    private String nomeDepartamento;
    private List<Funcionario> funcionarios;


    public Departamento(String nomeEmpresa, String cnpj, String nomeDepartamento) {
        super(nomeEmpresa, cnpj);
        this.nomeDepartamento = nomeDepartamento;
        this.funcionarios = new ArrayList<>();
    }


    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }


    public void concederAumento(double percentualAumento) {
        for (Funcionario funcionario : funcionarios) {
            funcionario.concederAumento(percentualAumento);
        }
    }


    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nomeDepartamento + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", funcionarios=" + funcionarios +
                '}';
    }
}