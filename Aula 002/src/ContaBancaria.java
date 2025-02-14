public class ContaBancaria {

    private String titular;
    private String cpf;
    private double saldo;
    private String tipo;

    ContaBancaria(String titular, String cpf, String tipo){
        this.titular = titular;
        this.cpf = cpf;
        this.tipo = tipo;
        if(this.tipo.equals("cc")){
            this.saldo = 50;
        }else if(this.tipo.equals("cp")){
            this.saldo = 0;
        }else{
            System.out.println("ERRO! Conta inválida");
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if(this.saldo - valor < 0){
            System.out.println("Você não possui saldo suficiente!");
        }else if(valor <= 0){
            System.out.println("Valor Inválido!");
        }else{
            this.saldo -= valor;
            System.out.println("Você sacou R$ " + valor);
        }
    }

    public void verSaldo(){
        System.out.println("Seu saldo é de: " + this.saldo);
    }

}
