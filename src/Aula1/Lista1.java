package Aula1;

import java.util.Scanner;

public class Lista1 {

   public static void main (String[] args) {
       Scanner leitor= new Scanner(System.in);


       System.out.println("Alo Java");

       //existe essas duas formas de declarar um vetor
       //int[] numeros2={10,20,30,40,50}; // já colocou as posições dentro(populou)
       //------------------------------------------------------------------------------------------------------//
       int[] numeros=new int[5]; // primeiro criou e depois colocou as posições dentro(populou)
       numeros[0]=10;
       numeros[1]=20;
       numeros[2]=30;
       numeros[3]=40;
       numeros[4]=50;
       System.out.println("Na posição 4, temos o elemento "+ numeros[4]);
       System.out.println ("No meu vetor exitem "+numeros.length+ " elementos");

       for (int posicao=0; posicao<numeros.length;posicao++){
           System.out.println("o elemento "+(posicao+1)+ " é "+numeros[posicao]); // so posição mostra os indices, +1 mostra os elementos
       }
       //-------------------------------------------------------------------------------------------------------------------------//

//      char[] gabarito ={'a','b','c','d','b'};
//      char[] resposta= new char[5];
//
//      for (int pos=0; pos<gabarito.length;pos++){
//
//          System.out.println("Digite a resposta da pergunta "+(pos+1)+ " : ");
//          resposta [pos]=leitor.next().charAt(0); // next serve para ler string mas temos um char por isso do .chart
//      }
//      int nota=0;
//      for(int pos=0; pos<resposta.length;pos++){
//          if(gabarito[pos]==resposta [pos]){
//              nota++;
//          }
//      }
//       System.out.println("Você acertou" + nota + "perguntas");


       String[] palavras={"casa","papel", "mercado", "cachooro", "gato"};
       for (String elemento:palavras){
           System.out.println(elemento);
       }
       int[] meusNumeros={1,2,3,4,5};
       for (int num:meusNumeros){
           System.out.println(num);
       }
   }
}
