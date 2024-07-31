
public class Academia {

    private String nome = "Iron Work";
    private String endereco = "Praia de leste, rua Getulio Varga, em frente a Hiperfarma";
    private String telefone = "998765543";

    Academia(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getTelefone(){
        return telefone;
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

}





