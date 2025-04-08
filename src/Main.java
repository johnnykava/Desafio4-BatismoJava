public class Main {
    public static void main(String[] args) {
        NinjaBasico ninjaBasico = new NinjaBasico("Iruka", 40, TipoHabilidade.NINJUTSU);

        ninjaBasico.mostrarInformacoes();
        ninjaBasico.excutarHabilidade();

        NinjaAvancado ninjaAvancado = new NinjaAvancado("Sasuke Uchiha", 18, TipoHabilidade.KATON, TipoHabilidade.RINNEGAN);

        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.excutarHabilidade();
        ninjaAvancado.executarHabilidadeEspecial();
    }
}
