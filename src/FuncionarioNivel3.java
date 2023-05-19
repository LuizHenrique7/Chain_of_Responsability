public class FuncionarioNivel3 extends Funcionario {

    public FuncionarioNivel3(Funcionario superior) {
        listaSuporte.add(TipoSuporte3.getTipoSuporte3());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoNivel() {
        return "Funcionário Nível 3";
    }

}
