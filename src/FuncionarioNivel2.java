public class FuncionarioNivel2 extends Funcionario {

    public FuncionarioNivel2(Funcionario superior) {
        listaSuporte.add(TipoSuporte2.getTipoSuporte2());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Funcionário Nível 2";
    }
}
