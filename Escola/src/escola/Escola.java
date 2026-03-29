package escola;

public class Escola {

    String nome;
    int idade;
    int matricula;
    char turma;
    boolean isFrequante;
    boolean estadoMatricula;
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setTurma(char turma) {
        this.turma = turma;
    }

    public void setIsFrequante(boolean isFrequante) {
        this.isFrequante = isFrequante;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public char getTurma() {
        return turma;
    }

    public boolean isIsFrequante() {
        return isFrequante;
    }
    
    
    void estadoMatricula(boolean isFrequente){
        if(isFrequente){
            this.estadoMatricula = true;
        } else{
            this.estadoMatricula = false;
        }
        
    }

    
}
