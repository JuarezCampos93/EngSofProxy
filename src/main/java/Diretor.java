public class Diretor {
    private String nome;



    private boolean administrador;

    public Diretor(String nome, boolean administrador){
        this.nome = nome;
        this.administrador = administrador;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
}
