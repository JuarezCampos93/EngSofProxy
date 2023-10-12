import java.util.List;
public class FuncionarioProxy implements IFuncionario {
    private Funcionario funcionario;
    private String matricula;

    public FuncionarioProxy(String matricula){
        this.matricula = matricula;
    }


    @Override
    public List<String> obterDadosPessoais() {
        if(this.funcionario == null){
            this.funcionario = new Funcionario(this.matricula);
        }
        return this.funcionario.obterDadosPessoais();
    }

    @Override
    public List<Float> obterSalario(Diretor proprietario) {
        if(!proprietario.isAdministrador()){
            throw new IllegalArgumentException("Dados Incorretos");
        }
        if(this.funcionario == null){
            this.funcionario = new Funcionario(this.matricula);
        }

        return this.funcionario.obterSalario(proprietario);
    }
}
