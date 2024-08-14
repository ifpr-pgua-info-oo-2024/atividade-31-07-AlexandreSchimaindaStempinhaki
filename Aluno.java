import java.text.ParseException;
import java.util.Date;

public class Aluno extends Pessoa{

    private String nivel;
    

    public Aluno(String nome, String genero, String nascimento, double altura, double peso, String nivel) throws ParseException {
        super(nome, genero, nascimento, altura, peso);
        this.nivel = nivel;
    }

    public Aluno(String nome, String nivel, String nascimento) throws ParseException{
        this(nome, "", nascimento, 0, 0 , nivel);
    }

    public String getNivel(){
        return nivel;
    }


    public void setNivel(String nivel){
        this.nivel = nivel;
    }

    public String toString() {
        return super.toString() + ", nivel=" + nivel;
    }

    
   

}