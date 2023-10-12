import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class FuncionarioProxyTest {


        @BeforeEach
        void setUp() {
            BD.addColaborador(new Funcionario("1", "Felipe", 1000.0f));
            BD.addColaborador(new Funcionario("2", "Carlos", 1000.0f));
        }

        @Test
        void deveRetornarDadosPessoaisDosColaboradores() {
            FuncionarioProxy colaborador = new FuncionarioProxy("1");
            assertEquals(Arrays.asList("Felipe"), colaborador.obterDadosPessoais());
        }

        @Test
        void deveRetonarSalarioolaborador() {
            Diretor proprietario = new Diretor("Juarez", true);
            FuncionarioProxy colaborador = new FuncionarioProxy("1");

            assertEquals(Arrays.asList(1000.0f), colaborador.obterSalario(proprietario));
        }

        @Test
        void deveRetonarExcecaoUsuarioNaoAutorizadoConsultarSalarioColaborador() {
            try {
                Diretor proprietario = new Diretor("Marco Antonio", false);
                FuncionarioProxy colaborador = new FuncionarioProxy("2");

                colaborador.obterSalario(proprietario);
                fail();
            }
            catch (IllegalArgumentException e) {
                assertEquals("Dados Incorretos", e.getMessage());
            }
        }
}