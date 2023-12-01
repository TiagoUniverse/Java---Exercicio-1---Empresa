package Departamento;

import Empresa.Empresa;

public class Departamento extends Empresa {

    protected String nome;

    public Departamento(String nome, int cnpj, String nome_departamento) {
        super(nome, cnpj);
        this.nome = nome_departamento;
    }
}
