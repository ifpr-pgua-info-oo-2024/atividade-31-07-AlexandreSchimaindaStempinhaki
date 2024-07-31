public class Main {
    
    
    public static void main(String[] args) {

        Academia academia1 = new Academia("Iron Work", "Rua pizza, 58", "999228022");
        Academia academia2 = new Academia("IronBerg", "São Paulo, zona leste, rua hamburguer, 53", "989372589");

        System.out.println(academia1.getNome() + " - " +academia1.getEndereco() + " - " + academia1.getTelefone());
        System.out.println(academia2.getNome() + " - " +academia2.getEndereco() + " - " + academia2.getTelefone());

        academia1.setNome("Ct da Growth");
        academia1.setEndereco("São paulo, zona sul, rua batata, 52");
        academia1.setTelefone("997654389");

        academia2.setNome("Ct da Integral");
        academia2.setEndereco("São paulo, zona sul, rua batata, 58");
        academia2.setTelefone("978592234");

        System.out.println(academia1.getNome() + " - " +academia1.getEndereco() + " - " + academia1.getTelefone());
        System.out.println(academia2.getNome() + " - " +academia2.getEndereco() + " - " + academia2.getTelefone());


    }
}