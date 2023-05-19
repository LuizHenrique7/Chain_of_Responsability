public class FuncionarioNivel1 extends Funcionario {

    public FuncionarioNivel1(Funcionario superior) {
        listaSuporte.add(TipoSuporte1.getTipoSuporte1());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Funcionário Nível 1";
    }

}
