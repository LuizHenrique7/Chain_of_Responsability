public class TipoSuporte3 implements TipoSuporte {

    private static TipoSuporte3 tipoSuporte3 = new TipoSuporte3();

    private TipoSuporte3() {};

    public static TipoSuporte3 getTipoSuporte3() {
        return tipoSuporte3;
    }
}
