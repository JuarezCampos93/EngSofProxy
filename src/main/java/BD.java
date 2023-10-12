import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<String, Funcionario> funcionario = new HashMap<>();

    public static Funcionario getFuncionario(String matricula){
        return funcionario.get(matricula);
    }

    public static void addColaborador(Funcionario colaborador){
        funcionario.put(colaborador.getMatricula(), colaborador);
    }



}
