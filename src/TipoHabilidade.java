public enum TipoHabilidade {

    TAIJUTSU("Soco mega forte"),
    NINJUTSU("Jutsu mil anos de dor"),
    GENJUTSU("Izanami"),
    KATON("Super bola de fogo"),
    RINNEGAN("Shinra Tensei");

    private String tipoHabilidade;

    TipoHabilidade(String tipoHabilidade){
        this.tipoHabilidade = tipoHabilidade;
    }

    public String getTipoHabilidade(){
        return this.tipoHabilidade;
    }
}
