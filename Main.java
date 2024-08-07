import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

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

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Date data = formato.parse("28/01/2008");
        Date data2 = formato.parse("29/01/2008");
        Date data3 = formato.parse("04/07/1976");
        Date data4 = formato.parse("28/03/1967");
        Date data5 = formato.parse("08/04/1974");
        Date data6 = formato.parse("04/12/1981");

        academia1.alunos.add(new Aluno("Sucrilhos", "Cansado", data, "Decimal", 0.80, 0.5));
        academia1.alunos.add(new Aluno("Jorlan Vieira", "Old School", data2, "Masculino", 1.68, 115));
        academia1.alunos.add(new Aluno("Renato Cariani", "Noob", data3, "Masculino", 1.82, 100));

        academia2.alunos.add(new Aluno("Serjão Foguetes", "Pro Player", data4, "Masculino", 1.80, 120));
        academia2.alunos.add(new Aluno("Pedro Loss", "Aspirante a Pro Player", data5, "Masculino", 1.78, 85));
        academia2.alunos.add(new Aluno("Iberê Thenório", "Entusiasta do Minecraft", data6, "Masculino", 1.74, 75));

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