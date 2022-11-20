1. Faça um programa que receba dois números e mostre o maior e o menor. Emita uma mensagem, caso os dois sejam iguais.
import java.util.Scanner;


public class ExerciciosAlex {

    public static void main(String[] args) {
     /*1. Faça um programa que receba dois números e mostre o maior e o menor. Emita uma mensagem, caso os dois sejam iguais.
*/
        Scanner leia = new Scanner(System.in);
        double n1, n2;
        
        System.out.println("Digite o primeiro número: ");
        n1 = leia.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        n2 = leia.nextDouble();
        
        if (n1>n2) {
            System.out.println( n1+ "é maior");
            
            } else if (n1<n2) {
                System.out.println(n2 + "é maior");
            }
            else {
                System.out.println("Os números são iguais");
            }

2. Faça um programa que receba as duas notas de um aluno, calcule sua média, e que imprima a sua situação: 
>= 7 -> Aprovado
< 7 -> Reprovado
 double nota1, nota2;
         double media;
         System.out.println("Digite sua 1ª nota: ");
         nota1 = leia.nextDouble();
         
         System.out.println("Digite sua 2º nota: ");
         nota2 = leia.nextDouble();
         
      media =  (nota1+nota2)/2;
         
         if (media >= 7){
             System.out.println("Aprovado!");
         } else {
             System.out.println("Reprovado!");
         }
3. Faça um programa que receba 3 notas de um aluno, calcule e mostre uma mensagem de acordo com sua média:
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
		 double notas[] = new double[3];
        double media, soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite sua nota: ");
            notas[i] = leia.nextDouble();
            soma = soma + notas[i];
        }
        media = soma / notas.length;

        if (media >= 0 && media < 3) {
            System.out.println("REPROVADO");
        } else if (media >= 3 && media < 7) {
            System.out.println("EXAME");
        } else if (media>= 7 && media<= 10){
        System.out.println("APROVADO ");
	}
	}
}

4. Dados três valores X,Y,Z, verificar se eles podem ser os comprimentos dos lados de um triângulo. Se eles não formarem um triângulo escrever uma mensagem. Considerar que o comprimento de cada lado de um triângulo é menor que a soma dos outros dois lados.
      System.out.println("Digite os lados do triângulo: ");
        double l1, l2, l3;
        l1 = leia.nextDouble();
        l2 = leia.nextDouble();
        l3 = leia.nextDouble();

        if (l1 < l2 + l3) {
            System.out.println(l1+"Pode ser o lado de um triângulo");
        } else if (l2 < l1 + l3) {
            System.out.println(l2+"Pode ser o lado de um triângulo");
        } else if (l3 < l1 + l2) {
            System.out.println(l3+"Pode ser o lado de um triângulo");

       } else {
            System.out.println("Esses lados não formam um triângulo");
        }

    }

5. Faça um programa que leia o sexo e a altura (H - em metros) de uma pessoa, calcule e apresente seu peso ideal utilizando as seguintes fórmulas: 
Peso ideal (homens) = (72,7 * H) – 58. 
Peso ideal (mulheres) = (62,1 * H) – 44,7
Sugestão: para identificar o sexo da pessoa, solicite ao usuário que informe 1 para homens, e 2 para mulheres

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	
        double altura, pesoIdeal;
        int sexo;
    
      
        System.out.println("Digite sua altura em metros: ");
        altura = leia.nextDouble();
        
        System.out.println("Qual o seu sexo: (1)Masculino (2)Feminino");
        sexo = leia.nextInt();
       
        
        switch (sexo){
            case 1:
                pesoIdeal = 72.7 * altura - 58;
                System.out.println("Seu peso ideal é: " + pesoIdeal);
                break;
            case 2: 
                pesoIdeal= 62.1 * altura - 44.7;
                System.out.println("Seu peso ideal é: " + pesoIdeal);
                
                default:
                System.out.println("Número inválido");  
        }
	}
}

6. Construa um programa para determinar se o indivíduo está com um peso favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida como sendo a relação entre o peso (PESO – em kg) e o quadrado da Altura (ALTURA – em m) do indivíduo. Ou seja,
IMC= PESO/ALTURA2
e, a situação do peso é determinada pela tabela abaixo:

Condição
Situação
IMC abaixo de 20
Abaixo do peso
IMC de 20 até 25
Peso Normal
IMC de 25 até 30
Sobre Peso
IMC de 30 até 40
Obeso
IMC de 40 e acima
Obeso Mórbido



import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);

double peso, altura, imc;
        
        System.out.println("Digite seu peso: ");
        peso= leia.nextDouble();
        
        System.out.println("Digite sua altura: ");
        altura = leia.nextDouble();
        
        imc= peso/(altura*altura);
        
        if (imc<20){
            System.out.println("Abaixo do peso");
        } else if (imc>20 && imc<25){
            System.out.println("Peso normal");
            
        } else if (imc>25 && imc<30){
            System.out.println("Sobre peso");
        }else if (imc>30 && imc<40) {
            System.out.println("Obeso");
        }else if (imc>40){
            System.out.println("Obeso Mórbido");
        }
    }
}
7. Uma empresa decide dar aumento de 30% aos funcionários com salários inferiores a R$1000,00. Faça um programa que receba o salário do funcionário e mostre o valor do salário reajustado ou uma mensagem, caso o funcionário não tenha direito ao aumento.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
 double salario, aumento;
        System.out.println("Digite seu salário: ");
        salario=leia.nextDouble();
        if (salario<1000){
            aumento = (salario/10)*3 + salario;
            System.out.println( "Você ganhou um aumento de 30%, agora seu salário é R$ " + aumento);
        } else {
            System.out.println("Você não tem direito a aumento.");
        }
        
    }
}


8. Faça um programa que receba a idade de um nadador e mostre a sua categoria
IDADE
CATEGORIA
até 7 anos
INFANTIL
8 a 10 anos
JUVENIL
11 a 15 anos
ADOLESCENTE
16 a 30 anos
ADULTO
acima de 30 anos
SENIOR

        
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);

 int idade;
                System.out.println("Digite sua idade: ");
                idade = leia.nextInt();
                
               if (idade<7) {
                   System.out.println("categoria infantil");
               } else if (idade>8 && idade<10){
                   System.out.println("categoria juvenil");
               } else if (idade>11 && idade<15) {
                   System.out.println("categoria adolescente");
               } else if (idade >16 && idade < 30){
                   System.out.println("categoria adulto");
               }else if (idade >30){
                   System.out.println("categoria sênior");
               }
                }
                        
    }

9. Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral: 
- não eleitor (abaixo de 16 anos); 
- eleitor obrigatório (entre a faixa de 18 e menor de 65 anos); 
- eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive);
import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
 	int idade;
		System.out.println ("Digite sua idade");
		idade = leia.nextInt();
		if (idade<16){
		    System.out.println("Não eleitor.");
		}else if (idade>18 && idade<65){
		    System.out.println("eleitor obrigatório");
		} else if (idade>16 && idade<18 || idade>65 ){
		    System.out.println("eleitor facultativo");
		} 
		}
	}
10. Faça um programa que leia o um número inteiro entre 1 e 7 e escreva o dia da semana correspondente. Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe dia da semana com esse número.
import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
 int numero;
 System.out.println("Digite um número inteiro entre 1 e 7: ");
 numero=leia.nextInt();
 switch(numero) {
    case 1:
     System.out.println(numero++ + " Domingo");
     break;
    case 2: 
     System.out.println(numero++ + " Segunda");
     break;
    case 3:
     System.out.println(numero++ + " Terça");
     break;
     case 4:
     System.out.println(numero++ + " Quarta");
     break;
     case 5:
     System.out.println(numero++ + " Quinta");
     break;
     case 6:
     System.out.println(numero++ + " Sexta");
     break;
     case 7:
     System.out.println(numero++ + " Sábado");
     break;
      default :
      System.out.println("Não existe dia da semana com esse número");
 }
		}
}
11. Faça um programa que leia um número inteiro entre 1 e 12 e escrever o mês correspondente. Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe mês com este número.
import java.util.Scanner;

public class aula1 {
    public static void main(String[] args){
    Scanner teclado=new Scanner(System.in);
    int mes;
    System.out.println("Digite o número do mês: ");
    mes=teclado.nextInt();
    switch (mes) {
        case 1:
            System.out.println("Janeiro");
            break;
        case 2:
            System.out.println("Fevereiro");
            break;
        case 3: 
            System.out.println("Março");
            break;
        case 4:
            System.out.println("Abril");
            break;
        case 5:
            System.out.println("Maio");
        break;
        case 6:
            System.out.println("Junho");
            break;
        case 7:
            System.out.println("Julho");
            break;
        case 8:
            System.out.println("Agosto");
            break;
        case 9:
            System.out.println("Setembro");
            break;
        case 10:
            System.out.println("Outubro");
            break;
        case 11:
            System.out.println("Novembro");
            break;
        case 12:
            System.out.println("Dezembro");
        default:
            System.out.println("Número inválido");
    }
    
}
}
12. Faça um programa que solicite ao usuário que informe dois números e que exiba o seguinte menu:
1 – Somar
2 – Subtrair 
3 – Multiplicar
4 – Dividir
5 – Sair
Em seguida, leia a opção escolhida e exiba o resultado de acordo com a opção.
import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    double n1,n2, soma, subtração, multiplicação, divisão;
    int opcao;
    System.out.println("Digite um valor");
    n1=leia.nextDouble();
    System.out.println("Digite um valor");
    n2=leia.nextDouble();
  do{
            System.out.println(" 1: SOMAR");
            System.out.println(" 2: SUBTRAIR");
            System.out.println(" 3: MULTIPLICAR");
            System.out.println(" 4: DIVIDIR");
            System.out.println(" 5: SAIR");

            opcao = leia.nextInt();
switch (opcao){
                case 1: 
                   soma=  n1+n2;
                   System.out.print(n1+" + "+n2+" = "+soma);
                    break;
                case 2: 
                    subtração=  n1-n2;
                   System.out.print(n1+" - "+n2+" = "+subtração);
                    break;
                case 3: 
                   multiplicação=  n1*n2;
                   System.out.print(n1+" x "+n2+" = "+multiplicação);
                    break;
                case 4: 
                    divisão =  n1/n2;
                   System.out.print(n1+" : "+n2+" = "+divisão);
                    break;
                    case 5: 
                  System.out.print("Fim do programa!");
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }
        } while (opcao != 5);     
}
}
