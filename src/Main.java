
import Empresa.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Empresa minhaEmpresa = new Empresa("SamSam Tech", "1234");

        Departamento tecnologia = new Departamento("SamSam Tech","1234", "Tecnologia");

        Funcionario tiago = new Funcionario("SamSam Tech", "1234", "Tecnologia",1700,"Tiago" , "05-10-2023");
        Funcionario joao = new Funcionario("SamSam Tech", "1234", "Tecnologia",1700,"João" , "08-10-2023");

        tecnologia.adicionarFuncionario(tiago);
        tecnologia.adicionarFuncionario(joao);

        System.out.println("Antes do aumento:");
        System.out.println(tecnologia);

        tecnologia.concederAumento(30.0);

        System.out.println("Antes do aumento:");
        System.out.println(tecnologia);

    }
}

