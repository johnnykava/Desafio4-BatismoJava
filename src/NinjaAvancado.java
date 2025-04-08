public class NinjaAvancado extends NinjaBasico implements Ninja{
    TipoHabilidade especialidade;

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, TipoHabilidade habilidadeEspecial) {
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

    public void executarHabilidadeEspecial(){
        System.out.println("O ninja " + this.nome + " executou a habilidade Especial " + this.especialidade.getTipoHabilidade());
    }
}
