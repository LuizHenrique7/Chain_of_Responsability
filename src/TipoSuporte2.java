public class TipoSuporte2 implements TipoSuporte {

    private static TipoSuporte2 tipoSuporte2 = new TipoSuporte2();

    private TipoSuporte2() {};

    public static TipoSuporte2 getTipoSuporte2() {
        return tipoSuporte2;
    }

}
