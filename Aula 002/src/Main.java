//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Pessoa p1 = new Pessoa("Mariana", 88);
//        Pessoa p2 = new Pessoa("Bruno", 99);
//        Pessoa p3 = new Pessoa("Marcos", 14);
//        p1.niver();
//
//        for(int i = 0; i < 4; i++){
//            p3.mostraInfo();
//            p3.niver();
//        }
//
//        p3.mostraInfo();
//        p2.mostraInfo();
//        p1.mostraInfo();
        //System.out.println(p1.nome);
        //System.out.println(p1.idade);

        // Parte 2 - Conta Bancária
        ContaBancaria c1 = new ContaBancaria("Fulano", "123456789", "cc");
        ContaBancaria c2 = new ContaBancaria("Ciclano", "987654321", "cp");
        ContaBancaria c3 = new ContaBancaria("Beltrano", "543216789", "cc");

        c1.verSaldo();
        c2.verSaldo();
        c3.verSaldo();

        c1.sacar(15);
        c2.sacar(100);

        c1.verSaldo();
        c2.verSaldo();

        c2.depositar(200);
        c2.verSaldo();
    }
}