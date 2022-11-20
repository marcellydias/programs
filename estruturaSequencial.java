Leia três números inteiros e imprima a média aritmética entre esses números.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner leia= new Scanner(System.in);
	    int n1,n2,n3,media;
	    System.out.println("Digite três números inteiros: ");
	    n1=leia.nextInt();
	    n2=leia.nextInt();
	    n3=leia.nextInt();
	    media= (n1+n2+n3)/3;
	    System.out.printf("A média é: %d",media);
	    
	    
	}
}

2.	Faça um programa que receba o ano de nascimento de uma pessoa, o ano atual e imprima:
A idade da pessoa no ano atual
A idade que a pessoa terá em 2050
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner leia= new Scanner(System.in);
	   int idadeAtual, idadeFutura, anoAtual, anoNasc;
	   System.out.println("digite o ano que você nasceu:");
	   anoNasc = leia.nextInt();
	   
	   System.out.println("digite o ano atual:");
	   anoAtual = leia.nextInt();
	   
	   idadeAtual= anoAtual-anoNasc;
	   idadeFutura= 2050-anoNasc;
	   
	   System.out.println("Sua idade atual é: "+idadeAtual);
	   System.out.println("Sua idade em 2050 será de: "+idadeFutura);
	  
	}
}

3.	Faça um programa que receba a cotação do dólar em reais, e um valor que o usuário possui em dólares. Imprima este valor em reais.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner leia= new Scanner(System.in);
	   double cotacao, dolar, reais;
	   System.out.println("Digite a cotação do dolar em reais: ");
	   cotacao=leia.nextDouble();
	   System.out.println("Digite o valor de reais que você possui: ");
	   reais=leia.nextDouble();
	    dolar=cotacao*reais;
	    System.out.println("Você possui $ "+dolar);
	  
	}
}

4.	Faça um programa que calcule e mostre a área de um losango AREA = (DIAGONAL MAIOR * DIAGONAL MENOR)/2

	import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner leia= new Scanner(System.in);
	   double dMaior, dMenor, areaTotal; 
	   
	   System.out.println("Digite a diagonal maior do losango: ");
	   dMaior=leia.nextDouble();
	   
	   System.out.println("Digite a diagonal menor do losango: ");
	   dMenor=leia.nextDouble();
	   
	  areaTotal = (dMaior * dMenor) / 2;
	  
	  System.out.println("A area do losango seu cuzao é: "+areaTotal);
	  
	  
	}
}

5.	Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit (F = (C*1,8) + 32); 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner leia= new Scanner(System.in);
	   double C, F; 
	   
	   System.out.println("Digite sua temperatura em graus Cº ");
	   C =leia.nextDouble();
	   
	   F =  (C * 1.8) + 32;
	  
	  System.out.println("A temperatura convertida em Fahrenheit: "+F);

	}
}
6. 	Faça um programa que solicite ao usuário que informe os coeficientes a, b e c de uma equação de segundo grau, e que imprima as raízes desta equação (considere que os valores informados sempre retornarão raízes reais para a equação).

import java.util.Scanner;
public class Main{
    
	public static void main(String[] args) {
	    Scanner leia= new Scanner(System.in);
	   float a, b, c, delta, x1, x2; 
	   
	   System.out.println("Digite o valor de A ");
	   a =leia.nextFloat();
	   
	   System.out.println("Digite o valor de B ");
	   b =leia.nextFloat();
	   
	   System.out.println("Digite o valor de C ");
	   c =leia.nextFloat();
	   
	   delta = b * b - 4 * a * c; 
	   
	   if(delta > 0){
	    
	    x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a)); 
	    x2 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
	  
	    System.out.println("O valor de x1 é: "+x1+ "\nValor de X2 é" +x2);
	   }   
	   else{ 
	    System.out.println("Não foi possivel calcular esta Raiz, não e um numero real");
	       
	   }
	}
}

7. Faça um programa que receba o valor do salário mínimo e o valor do salário de um funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse funcionário.
import java.util.Scanner;
public class Main{
    
	public static void main(String[] args) {
	    Scanner leia= new Scanner(System.in);
	   double salarioMin, qtdSalario, salarioFun; 
	   
	   System.out.println("Digite o valor do seu salario: ");
	   salarioFun =leia.nextDouble();
	   
	   System.out.println("Digite o valor do salario minino: ");
	   salarioMin =leia.nextDouble();
	   
	   qtdSalario = salarioFun/salarioMin;  
	  
	   System.out.println("O Funcionario ganhar "+qtdSalario+ " salários mininos");
	   
	}
}
8. Leia um número e imprima a tabuada de multiplicar deste número. Por exemplo, para o número 5:
import java.util.Scanner;
public class Main{
    
	public static void main(String[] args) {
	    Scanner leia= new Scanner(System.in);
	    
	   int num;
	   
	   System.out.println("Digite um número");
	   num=leia.nextInt();
	   
	   for(int i=0; i < 10; i++){
	   System.out.println(num+"x"+i+"="+(num*i));
	   }
	}
}
9.Receba um número positivo, calcule e mostre:
O número digitado ao quadrado
O número digitado ao cubo
A raiz quadrada do número digitado
A raiz cúbica do número digitado.
import java.util.Scanner;
public class Main{
    
	public static void main(String[] args) {
	    Scanner leia= new Scanner(System.in);
	    
	   int num;
	   
	   System.out.println("Digite um número positivo: ");
	   num=leia.nextInt();
	   
	    System.out.println(+num+"quando elevado ao quadrado é: "+Math.pow(num,2));
	   System.out.println(+num+"quando elevado ao cúbico é: "+Math.pow(num,3));
	    System.out.println("A raiz quadrada de "+num+" é: " +Math.sqrt(num));
	     System.out.println("A raiz cúbica de "+num+" é: " +Math.cbrt(num));
	   
	   
	}
}

10.Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% para o garçom. Faça um programa que leia o valor gasto pelo cliente e informe o valor a ser pago de gorjeta.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	double gasto, gorjeta, gastoF;
	Scanner leia = new Scanner(System.in);
	System.out.println("Gasto do cliente: ");
	gasto = leia.nextDouble();
	gorjeta = (gasto/100)*10; //10% da gorjeta 
	gastoF = gorjeta + gasto; 
	System.out.println("O valor da gorjeta é: "+gorjeta);
	System.out.println("O valor a ser pago no total é: "+gastoF);
	
	}
}
11. Faça um programa que receba um número inteiro e que imprima o antecessor, o sucessor, o dobro e a metade do número informado. 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	int num, dobroNum, metNum, antNum, sucNum;
	Scanner leia = new Scanner (System.in);
    System.out.println("Digite um número inteiro: ");
    num = leia.nextInt();
    
    dobroNum = num*2;
    metNum= num/2;
    antNum= num-1;
    sucNum = num+1;
    
    System.out.println("O antecessor de " +num+ " é " +antNum);
    System.out.println("O sucesorr de " +num+ " é " +sucNum);
    System.out.println("O dobro de " +num+ " é " +dobroNum);
    System.out.println("A metade de " +num+ " é " +metNum); 
    
	}   
}

12. Faça um programa que, tendo como dados de entrada a altura (H - em metros) de um homem, calcule e apresente seu peso ideal utilizando a seguinte fórmula: 
Peso ideal (P) = (72,7 * H) – 58. 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
    double altura, pesoIdeal;
    System.out.println("Digite sua altura em metros: ");
    altura = leia.nextDouble();
    pesoIdeal =  (72.7 * altura) - 58;
    System.out.println("Seu peso ideal é: " + pesoIdeal);
	}   
}

13. Faça o mesmo programa do item anterior, utilizando a fórmula para o cálculo do peso ideal para mulheres:
Peso ideal (P) = (62,1 * H) – 44,7

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
    double altura, pesoIdeal;
    System.out.println("Digite sua altura em metros: ");
    altura = leia.nextDouble();
   pesoIdeal = (62.1 * altura) - 44,7;
    System.out.println("Seu peso ideal é: " + pesoIdeal);
	}   
}
14. Faça um programa que leia duas variáveis e troque o conteúdo dessas duas variáveis. Em seguida, imprima o valor dessas variáveis invertido. Exemplo: A = 7, B = 9. Saída: A = 9, B = 7.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
    int ano, mes;
    System.out.println("Digite o ano atual: ");
    mes = leia.nextInt();
    System.out.println("Digite o mês atual: ");
    ano = leia.nextInt();
    System.out.println("O ano atual é: "+ano+ " \nO mês atual é: "+mes);
	}   
}

15. Considerando uma eleição de apenas dois candidatos, faça um programa que leia o número total de eleitores, o número de votos do primeiro candidato e o número de votos do segundo candidato. Em seguida, o programa deverá apresentar o percentual de votos de cada um dos candidatos e o percentual de votos nulos.

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {


    Scanner ler = new Scanner(System.in);
    System.out.println("-------URNA-------");
    System.out.println("(69) Leo da Padaria");
    System.out.println("(10) Marcelo do Arena");
    System.out.println("(0) Nulo ou Branco");
    System.out.println("-------URNA-------");

    int votoTotal = 0;
    int votoMarcelo = 0;
    int votoLeo = 0;
    int votoNuloBranco = 0;

    System.out.println("Qual a quantidade total de eleitores?");
    votoTotal = ler.nextInt();

    System.out.println("Quantas pessoas votaram no primeiro candidato?");
    votoLeo = ler.nextInt();

    System.out.println("Quantas pessoas votaram no segundo candidato?");
    votoMarcelo = ler.nextInt();

    votoNuloBranco = votoTotal - votoMarcelo - votoLeo;

    double votoMarceloPct = votoMarcelo * 100 / votoTotal;
    double votoLeoPct = votoLeo * 100 / votoTotal;
    double votoNuloBrancoPct = votoNuloBranco * 100 / votoTotal;

    System.out.println("O total de votos foi de " + votoTotal);

    System.out.println("A quantidade total de votos no Marcelo do Arena foi de " + votoMarcelo + " com " + votoMarceloPct  + "% dos votos");

    System.out.println("A quantidade total de votos no Leo da Padaria foi de " + votoLeo + " com " + votoLeoPct   + "% dos votos");

    System.out.println(  "Quantidade de votos nulos ou brancos foi de " + votoNuloBranco + " com " + votoNuloBrancoPct + "% dos votos");


    }
}

