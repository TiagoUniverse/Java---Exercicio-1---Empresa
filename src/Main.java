import Departamento.Departamento;
import Empresa.Empresa;
import Funcionario.Funcionario;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

    Empresa empresa = new Empresa("empresa TI", 1234);

    Departamento tecnologia = new Departamento("empresa TI", 1234, "Tecnologia" );

        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        // Adicionando elementos à lista
        listaFuncionarios.add( new Funcionario("empresa TI", 1234, "Tecnologia", "Tiago", 1200
        , "05-10-2023"));
        listaFuncionarios.add( new Funcionario("empresa TI", 1234, "Tecnologia", "Tiago", 1200
                , "05-10-2023"));
        listaFuncionarios.add( new Funcionario("empresa TI", 1234, "Tecnologia", "Tiago", 1200
                , "05-10-2023"));

        // Exibindo os elementos da lista
        System.out.println("Lista de Nomes:");
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            System.out.println(listaFuncionarios.get(i));
        }

    }
}