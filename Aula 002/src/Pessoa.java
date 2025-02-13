public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private boolean maiorDeIdade;

    //Constructor
    Pessoa (String nome, int idade){
        this.nome = nome;
        setIdade(idade);

        this.maiorDeIdade = (idade >=18);

//        if (idade<18){
//            this.maiorDeIdade = false;
//        }else{
//            this.maiorDeIdade = true;
//        }
    }


    //Exercicio
    public void niver(){
        setIdade(this.idade + 1);
    }

    //Setters e Getters
    private void setNome(String nome){
        this.nome = nome;
    }
    private void setIdade(int idade){
        if (idade < 0){
            this.idade = 0;
        }else {
            this.idade = idade;
        }
        this.maiorDeIdade = (this.idade >=18);
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }

    void mostraInfo (){
        System.out.println(nome + ", " + idade + " anos.");
    }
}
