import Departamento.Departamento;
import Empresa.Empresa;
import Funcionario.Funcionario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Departamento design = new Departamento("design");
        Departamento tecnologia = new Departamento("tecnologia");

        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();



        Funcionario tiago = new Funcionario("tecnologia", "tiago", 1200, "05-10-2023");
        Funcionario Diego = new Funcionario("tecnologia", "Diego", 1200, "05-10-2023");

        // Adicionando elementos à lista
        listaFuncionarios.add(tiago);
        listaFuncionarios.add(Diego);

        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println(funcionario);
        }


//        System.out.println(tiago.getNome());
//        System.out.println(Diego.getNome());
    }
}
