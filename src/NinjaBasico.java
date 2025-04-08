import javax.swing.plaf.multi.MultiPopupMenuUI;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    TipoHabilidade habilidade;

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("--------------- INFORMAÇÕES NINJA ---------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Habilidade: " + this.habilidade);
        System.out.println("-------------------------------------------------");
    }

    @Override
    public void excutarHabilidade() {
        System.out.println("O ninja " + this.nome + " executou a habilidade " + this.habilidade.getTipoHabilidade());
    }
}
