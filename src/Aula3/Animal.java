package Aula3;

public class Animal {
    private String nome;
    private String especie;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade<0){
            System.out.println("Não existe idade negativa");
        } else{
        this.idade = idade;
        }
    }

    public Animal(String nome, String especie, int idade){ //construtor para a classe animal
        this.nome=nome;
        this.especie=especie;
        this.idade=idade;
    }
    public void vacinar() {
        System.out.println("O animal "+getNome()+" está vacinado");
    }

    }


