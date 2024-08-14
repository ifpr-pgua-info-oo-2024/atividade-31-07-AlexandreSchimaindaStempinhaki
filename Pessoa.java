import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Pessoa {
    protected String nome;
    protected String genero;
    protected Date nascimento;
    protected double altura;
    protected double peso;

    public Pessoa(String nome, String genero, String nascimento2, double altura, double peso) throws ParseException {
        this.nome = nome;   
        this.genero = genero;
        this.nascimento = convertStringToDate(nascimento2);
        this.altura = altura;
        this.peso = peso;
    }

   

    public Pessoa(String nome, String nascimento) throws ParseException{
        this(nome, "", nascimento, 0, 0);
    }

    public static Date convertStringToDate(String nascimento) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.parse(nascimento);
    }

    public static String converDateToString(Date nascimento) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(nascimento);
    }

    public int calcularIdade(Date nascimento){
        Date actualDate = new Date();

        long diffInMillies = Math.abs(actualDate.getTime() - nascimento.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        return (int) diff/365;
    }



    public String getNome(){
        return nome;
    }


    public Date getnascimento(){
        return nascimento;
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



    public void setnascimento(Date nascimento){
        this.nascimento = nascimento;
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
        return "Pessoa [nome=" + nome + ", genero=" + genero + ", nascimento=" + nascimento + ", altura=" + altura
                + ", peso=" + peso + "]";
    }

    
}



//Criem a classe pessoa, que contenha os atributos, nome, genero, 
    //nascimento, altura e peso

    //Criem o método calcular nascimentoToString e nascimentoToDate