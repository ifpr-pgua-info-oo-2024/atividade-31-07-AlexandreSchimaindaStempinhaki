import java.util.Date;

public class Aluno {

    private String nome;
    private String nivel;
    private Date data_nascimento;
    private String genero;
    private double altura;
    private double peso;

    public Aluno(String nome, String nivel, Date data_nascimento, String genero, double altura, double peso) {
        this.nome = nome;
        this.nivel = nivel;
        this.data_nascimento = data_nascimento;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    public Aluno(String nome, String nivel, Date nascimento){
        this(nome,nivel,nascimento,"",0,0);
    }

    public String getNome(){
        return nome;
    }

    public String getNivel(){
        return nivel;
    }

    public Date getData_nascimento(){
        return data_nascimento;
    }

    public String getGenero(){
        return genero;
    }

    public double getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNivel(String nivel){
        this.nivel = nivel;
    }

    public void setData_nascimento(Date data_nascimento){
        this.data_nascimento = data_nascimento;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public String toString() {
        return "Aluno [nome=" + nome + ", nivel=" + nivel + ", data_nascimento=" + data_nascimento + ", genero="
                + genero + ", altura=" + altura + ", peso=" + peso + "]";
    }

}