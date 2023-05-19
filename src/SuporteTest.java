import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuporteTest {

    FuncionarioNivel1 nivel1;
    FuncionarioNivel2 nivel2;
    FuncionarioNivel3 nivel3;
    FuncionarioNivel4 nivel4;

    @BeforeEach
    void setUp() {
        nivel1 = new FuncionarioNivel1(null);
        nivel2 = new FuncionarioNivel2(nivel1);
        nivel3 = new FuncionarioNivel3(nivel2);
        nivel4 = new FuncionarioNivel4(nivel3);
    }

    @Test
    void deveRetornarFuncionarioNivel1ParaSolucionarTipoSuporte1() {
        assertEquals("Funcionário Nível 1", nivel1.solucionarSuporte(new Suporte(TipoSuporte1.getTipoSuporte1())));
    }

    @Test
    void deveRetornarFuncionarioNivel2ParaSolucionarTipoSuporte2() {
        assertEquals("Funcionário Nível 2", nivel2.solucionarSuporte(new Suporte(TipoSuporte2.getTipoSuporte2())));
    }

    @Test
    void deveRetornarFuncionarioNivel3ParaSolucionarTipoSuporte3() {
        assertEquals("Funcionário Nível 3", nivel3.solucionarSuporte(new Suporte(TipoSuporte3.getTipoSuporte3())));
    }

    @Test
    void deveRetornarFuncionarioNivel4ParaSolucionarTipoSuporte4() {
        assertEquals("Funcionário Nível 4", nivel4.solucionarSuporte(new Suporte(TipoSuporte4.getTipoSuporte4())));
    }

    @Test
    void deveRetornarSemSuporte() {
        assertEquals("Sem Suporte", nivel1.solucionarSuporte(new Suporte(TipoSuporte4.getTipoSuporte4())));
    }
}