//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Mariana", 88);
        Pessoa p2 = new Pessoa("Bruno", 99);
        Pessoa p3 = new Pessoa("Marcos", 35);
        p1.niver();

        p3.niver();
        p3.niver();
        p3.niver();

        p3.mostraInfo();
        p2.mostraInfo();
        p1.mostraInfo();
        //System.out.println(p1.nome);
        //System.out.println(p1.idade);
    }
}