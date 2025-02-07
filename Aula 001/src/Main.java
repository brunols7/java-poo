//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Parte 1 - Classes e Atributos
        System.out.println("Hello World!");
        Carro c1 = new Carro();
        System.out.println("Cor do Carro 1: " + c1.cor);
        System.out.println("Ano do Carro 1: " + c1.ano);
        System.out.println("Potência do Carro 1: " + c1.potencia);

        Carro c2 = new Carro();
        c2.ano = 2015;
        c2.potencia = 2.0;
        c2.combustivel = 6.5;
        c2.cor = "preto";
        System.out.println("---------------------------------");
        System.out.println("Cor do Carro 2: " + c2.cor);
        System.out.println("Ano do Carro 2: " + c2.ano);
        System.out.println("Potência do Carro 2: " + c2.potencia);

        // Parte 2 - Métodos
        Carro c3 = new Carro();
        c3.ano = 2024;
        c3.combustivel = 6.3;
        c3.potencia = 2.6;
        c3.cor = "amarelo";
        c3.funcionando = false;

        //c1.mostraInfo();
        //c2.mostraInfo();
        c3.mostraInfo();

        c1.andar();
        c2.andar();
        c3.andar();
        System.out.println("=-=-=-=-=-=-=-=-=-=");
        for(int i = 0; i < 5; i++){
            c1.andar();
        }
        c1.abastecer();
        c1.andar();

    }
}

