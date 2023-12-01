package Departamento;

import Empresa.Empresa;

public class Departamento extends Empresa {

    protected String nome;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
