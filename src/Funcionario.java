import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaSuporte = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoNivel();

    public String solucionarSuporte(Suporte suporte) {
        if (listaSuporte.contains(suporte.getTipoSuporte())) {
            return getDescricaoNivel();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.solucionarSuporte(suporte);
            }
            else
            {
                return "Sem Suporte";
            }
        }
    }
}
