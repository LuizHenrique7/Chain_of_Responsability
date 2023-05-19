public class FuncionarioNivel4 extends Funcionario {

    public FuncionarioNivel4(Funcionario superior) {
        listaSuporte.add(TipoSuporte4.getTipoSuporte4());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Funcionário Nível 4";
    }

}
