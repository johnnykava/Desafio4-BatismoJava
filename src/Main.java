public class Main {
    public static void main(String[] args) {
        NinjaBasico ninjaBasico = new NinjaBasico("Iruka", 40, "Multiplas Shurikens");

        ninjaBasico.mostrarInformacoes();
        ninjaBasico.excutarHabilidade();

        NinjaAvancado ninjaAvancado = new NinjaAvancado("Sasuke Uchiha", 18, "Chidory", "Sharingan");

        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.excutarHabilidade();
        ninjaAvancado.executarHabilidadeEspecial();
    }
}
