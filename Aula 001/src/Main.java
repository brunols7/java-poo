//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Carro c1 = new Carro();
        System.out.println("Cor do Carro 1: " + c1.cor);
        System.out.println("Ano do Carro 1: " + c1.ano);
        System.out.println("Potência do Carro 1: " + c1.potencia);

        Carro c2 = new Carro();
        c2.ano = 2015;
        c2.potencia = 2.0;
        c2.cor = "preto";
        System.out.println("---------------------------------");
        System.out.println("Cor do Carro 2: " + c2.cor);
        System.out.println("Ano do Carro 2: " + c2.ano);
        System.out.println("Potência do Carro 2: " + c2.potencia);
    }
}

