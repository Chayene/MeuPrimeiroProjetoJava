package AtividadeJava;

public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private String situacao;

    private float salario ;

    //construtor
    public Funcionario (String nome, int idade, String cargo, String situacao, float salario){
        this.nome=nome;
        this.idade=idade;
        this.cargo=cargo;
        this.situacao=situacao;
        this.salario=salario;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;

    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) { ;
        this.salario = salario;
    }

//metodos
    public void demitirFuncionario () {
        System.out.println("O Funcionário "+getNome()+" está inativo(a) e não faz mais parte do quadro de funcionários.");
    }

    public void trocarCargoFuncionario() {
        System.out.println("O Funcionário " +getNome()+" será promovido(a) de " +getCargo()+ " para:");
        if (cargo=="auxiliar"){
            System.out.println("Parabéns!!! Você agora é Analista.");
        } else if (cargo=="analista") {
            System.out.println("Parabéns!!! Você agora é Analista Sênior.");
        } else if (cargo=="analista senior") {
            System.out.println("Parabéns!!! Você agora é Coordernador.");
        }
    }

    public void fazerAniversario() {
        System.out.println("O funcionário " +getNome()+" está aniversariando de: " +getIdade()+ " anos.");
        if(idade==idade){
            System.out.println("Parabéns!!! " +getNome()+ " você completou " +(idade=idade+1)+ " anos.");
        }
    }

    public void pagarSalari0() {
        System.out.format("O funcinário(a) "+getNome()+" receberá o salário de R$ %.2f", salario);
        //System.out.format("%.2f", salario);
    }

}

