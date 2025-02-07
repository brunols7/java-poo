public class Carro{

    String cor = "vermelho";
    int ano = 1973;
    double potencia = 2.0;
    boolean funcionando = true;
    double combustivel = 15;

    // void = Metodo que não tem retorno
    // metodo de mostrar as informaçoes do carro
    void mostraInfo(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Cor do carro: " + cor);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Potência do carro: " + potencia);
        if(funcionando){
            System.out.println("O carro está funcionando!");
        }else {
            System.out.println("O carro está quebrado!");
        }
    }

    // metodo de andar (so vai andar se estiver funcionando)
    void andar(){
        System.out.println("=-=-=-=-=-=-=-=-=");
        if(funcionando){
            System.out.println("Carro começou a andar...");
            if(combustivel > 0){
                combustivel -= 7;
                System.out.println("Carro gastou 7 litros de combustivel e começou a andar...");
            }else{
                System.out.println("Carro está sem gasolina para continuar andando...");
            }
        }else{
            System.out.println("Carro não consegue andar porque está quebrado.");
        }
    }

    void abastecer(){
        combustivel = 25;
        System.out.println("Carro está abastecendo...");
    }
}
