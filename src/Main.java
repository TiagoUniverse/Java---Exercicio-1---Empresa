import Departamento.Departamento;
import Empresa.Empresa;
import Funcionario.Funcionario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listaFuncionarios = new ArrayList<>();

        // Adicionando elementos à lista
        listaFuncionarios.add("Papi");

        System.out.println(listaFuncionarios);

        // Exibindo os elementos da lista
//        System.out.println("Lista de Nomes:");
//        for (int i = 0; i < listaFuncionarios.size(); i++) {
//            System.out.println(listaFuncionarios.get(i));
//        }

        Departamento design = new Departamento("design");
        Departamento tecnologia = new Departamento("tecnologia");

        Funcionario tiago = new Funcionario("tecnologia", "tiago", 1200, "05-10-2023");
        Funcionario Diego = new Funcionario("tecnologia", "Diego", 1200, "05-10-2023");


//        System.out.println(tiago.getNome());
//        System.out.println(Diego.getNome());
    }
}