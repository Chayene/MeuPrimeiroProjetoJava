package Aula2;

public class metodos {
    public static void main(String[] args) {
        impressao() ;// faz a chamada do metodo fora do main
//-------------------------------------------------------------------------------------------------------------------//
        mensagem ("Java é vida!");
//----------------------------------------------------------------------------------------------------------------//
        System.out.println ("o dobro do numero é: "+dobro(10)); //calculo fatorial
        for (int i=1; i<11; i++){
            System.out.println ("o fatorial de: "+i+" é "+ fatorial (i));
        }
//----------------------------------------------------------------------------------------------------------------//
        System.out.println("o resultado é: "+ calc(2,3)); //sobrecarga de métodos

        System.out.println("o resultado é: "+ calc(2.5,3.1)); //sobrecarga de métodos

        System.out.println("o resultado é: "+ calc(2,3,4)); //sobrecarga de métodos
        // --------------------------------------------------------------------------------------------------------//
        double[] notas={9.5,5.8,8.9,9,8};
        System.out.println("A media das notas é: " +calc(notas));
        System.out.printf("%s%.2f", "A media das notas é: " , calc(notas)); //limitao numero de linhas "%s%.2f"
    }
    //----aqui acaba o método main----------------------------------------------------------------------------------------------------------//

    //métodos (função) sem retorno e sem parametros
    public static void impressao(){ //1 cria o metodo- e void é sem retorno e na impressao() não tá passando nenhum parametro
        System.out.println("Java é lindo!!");
    }
    //------------------------------------------------------------------------------------------------------------//
    //métodos (função) sem retorno e com parametros
    public static void mensagem(String msg){
            System.out.println(msg);
        }

    //------------------------------------------------------------------------------------------------------------//
        //métodos (função) com retorno e com parametros
        public static int dobro(int numero){ //1 cria o metodo- e void é sem retorno e na impressao() não tá passando nenhum parametro
            return numero * 2;
        }
    //-------------------------------------------------------------------------------------------------------------//
        public static int fatorial (int numero){
        int fatorial=1;
        for (int cont=numero;cont>0;cont--){
            fatorial *=cont;
        }
        return fatorial;
        }
    //--------------------------------------------------------------------------------------------------------------//
        //sobrecarga de métodos
        public static int calc(int num1, int num2){
        return num1 + num2;
        }

    public static double calc(double num1, double num2){
        return num1 + num2;
    }

    public static int calc(int num1, int num2, int num3){
        return num1 + num2+ num3;
    }
    public static double calc(double [] numeros){
        double soma=0;
        for (double n:numeros){
            soma+=n;
        }
        return soma/numeros.length;
    }



}































