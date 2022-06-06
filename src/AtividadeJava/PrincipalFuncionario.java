package AtividadeJava;

public class PrincipalFuncionario {
    public static void main(String[] args) {
        Funcionario a1= new Funcionario("Paulo", 35, "auxiliar","ativo",1200);
        Funcionario a2= new Funcionario("Alice", 18, "analista","ativo",2000);
        Funcionario a3= new Funcionario("Caio", 55, "analista senior","ativo",3000);
        Funcionario a4= new Funcionario("Maria", 45, "coodernadora","ativo", 4500);

        System.out.println("O Funcionário a1 é: " +a1.getNome());
        a1.demitirFuncionario();
        System.out.println("O funcionario a2 é: " +a2.getNome());
        a2.trocarCargoFuncionario();
        System.out.println("O funcionario a3 é: " +a3.getNome());
        a3.fazerAniversario();
        System.out.println("O funcionario a4 é: " +a4.getNome());
        a4.pagarSalari0();
    }

}
