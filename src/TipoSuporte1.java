public class TipoSuporte1 implements TipoSuporte {

    private static TipoSuporte1 tipoSuporte1 = new TipoSuporte1();

    private TipoSuporte1() {};

    public static TipoSuporte1 getTipoSuporte1() {
        return tipoSuporte1;
    }

}
