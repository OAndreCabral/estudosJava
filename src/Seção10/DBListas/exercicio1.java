package Seção10.DBListas;

import java.util.*;

public class exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tecladoUsuario = new Scanner(System.in);

        List<Empregado> listaDeEmpregado = new ArrayList<>();

        System.out.println("Quantos funcionarios serão contratados?");
        int numeroFuncionario = tecladoUsuario.nextInt();

        for (int i = 0; i < numeroFuncionario; i++) {
            System.out.println();
            System.out.println("Funcionario #" + (i+1));

            System.out.print("Id: ");
            Integer idEmpregado = tecladoUsuario.nextInt();
            while (hasId(listaDeEmpregado, idEmpregado)) {
                System.out.println("Já existe um registro com esse ID, tente novamente:");
                idEmpregado = tecladoUsuario.nextInt();
            }

            System.out.print("Nome: ");
            String nome = tecladoUsuario.next();

            //Limpar o buffer de entrada
            tecladoUsuario.nextLine();

            System.out.print("Salary: ");
            Double salary = tecladoUsuario.nextDouble();

            Empregado empregado = new Empregado(idEmpregado, nome, salary);

            listaDeEmpregado.add(empregado);
        }
        System.out.println("Qual Id do Funcionário que irá receber aumento: ");
        Integer IdFuncionarioAumento = tecladoUsuario.nextInt();

        Integer position = findIdInList(listaDeEmpregado, IdFuncionarioAumento);
        if (position == null) {
            System.out.println("Id inexistente");
        }else {
            System.out.println("Digite o percentual de aumento");
            double percentual = tecladoUsuario.nextDouble();
            listaDeEmpregado.get(position).increseSalary(percentual);
        }

        System.out.println("Lista de Empregados");
        for (Empregado empregado : listaDeEmpregado) {
            System.out.println(empregado);
        }
    }

    public static Integer findIdInList(List<Empregado> list, Integer id) {
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(list.get(i).getId(), id)) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Empregado> list, Integer id) {
        Empregado empregado = list
                .stream()
                .filter(item -> Objects.equals(item.getId(), id))
                .findFirst()
                .orElse(null);
        return empregado != null;
    }
}
