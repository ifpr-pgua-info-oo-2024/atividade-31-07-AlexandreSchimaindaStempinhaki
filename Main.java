import java.text.ParseException;


public class Main {

    public static void main(String[] args) throws ParseException {

        Academia academia1 = new Academia("Iron Work", "Rua pizza, 58", "999228022");
        Academia academia2 = new Academia("IronBerg", "São Paulo, zona leste, rua hamburguer, 53", "989372589");

        System.out.println(academia1.getNome() + " - " + academia1.getEndereco() + " - " + academia1.getTelefone());
        System.out.println(academia2.getNome() + " - " + academia2.getEndereco() + " - " + academia2.getTelefone());

        academia1.setNome("Ct da Growth");
        academia1.setEndereco("São paulo, zona sul, rua batata, 52");
        academia1.setTelefone("997654389");

        academia2.setNome("Ct da Integral");
        academia2.setEndereco("São paulo, zona sul, rua batata, 58");
        academia2.setTelefone("978592234");

        System.out.println(academia1.getNome() + " - " + academia1.getEndereco() + " - " + academia1.getTelefone());
        System.out.println(academia2.getNome() + " - " + academia2.getEndereco() + " - " + academia2.getTelefone());


        academia1.alunos.add(new Aluno("Sucrilhos", "Cansado", "28/01/2008", 0.5, 0.80, "Noob"));
        academia1.alunos.add(new Aluno("Jorlan Vieira", "Old School", "29/01/2008", 1.68, 115, "É a essência"));
        academia1.alunos.add(new Aluno("Renato Cariani", "Beta", "04/07/1976", 1.82, 100, "Pro Player"));

        academia2.alunos.add(new Aluno("Serjão Foguetes", "Sigma", "28/03/1967",  1.80, 120,"Deus do minecraft"));
        academia2.alunos.add(new Aluno("Pedro Loss", "Ciência", "08/04/1974", 1.78, 85, "Aspirante a pro player"));
        academia2.alunos.add(new Aluno("Iberê Thenório", "Alfa", "04/12/1981", 1.74, 75, "Entusiasta do minecraft"));

        for (Aluno aluno : academia1.getAlunos()) {
            System.out.println(aluno.toString());
        }

        for (Aluno aluno : academia2.getAlunos()) {
            System.out.println(aluno.toString());
        }

        // printar o obj;

        // CADASTRE TRÊS ALUNOS EM CADA ACADEMIA;

    }
}