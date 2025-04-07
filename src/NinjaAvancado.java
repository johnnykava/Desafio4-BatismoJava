public class NinjaAvancado extends NinjaBasico implements Ninja{
    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String habilidadeEspecial) {
        super(nome, idade, habilidade);
        this.especialidade = habilidadeEspecial;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("--------------- INFORMAÇÕES NINJA ---------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Habilidade: " + this.habilidade);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("-------------------------------------------------");
    }
}
