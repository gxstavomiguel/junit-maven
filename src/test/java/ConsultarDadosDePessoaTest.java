import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraconexao(){
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou configuraConexao");
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 15, 0)));
    }

    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 15, 0)));
    }

    @Test
    void validardadosderetorno(){
        Assertions.assertTrue(true);
    }

    @Test
    void validardadosderetorno2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        System.out.println("Rodou finalizarConexao");
    }
}
