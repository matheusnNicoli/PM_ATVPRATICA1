import java.util.Scanner;

import model.Organizador;
import model.Reserva;
import model.Salao;

public class Main {
    public static void main(){
    Scanner scan = new Scanner(System.in);
    
    Organizador o1 = new Organizador("carlos",13123,31232,"cozinha");
    Organizador o2 = new Organizador("matheus",18393,12312,"animador");
    Organizador o3 = new Organizador("caio",2342,3204578,"limpeza");

    Salao s1 = new Salao(1,20,"bh","tipo1");
    Salao s2 = new Salao(2,25,"bh2","tipo2");
    Salao s3 = new Salao(3,30,"bh3",tipo3);
    
    int flag =1;
    int opc;
    while (flag ==1) {
        menu();
       System.out.print("Escolha a opc: ");
       opc = scan.nextInt();

       switch (opc) {
        case 1:
         System.out.print("Cadastro:\n");
         System.out.print("Digite o codigo:\n");
         int cod = scan.nextInt();
         System.out.print("Digite o nome do cliente:\n");

       }




    }
    
    





}

public static void menu(){
 System.out.print("Menu do sistema:\n");
 System.out.print("-----------------------------------------------------------\n");
 System.out.print("1. Cadastrar uma reserva\n");
 System.out.print("2. Associar um organizador a um salão\n");
 System.out.print("3. Reservas confirmadas em um salão\n");
 System.out.print("4. Quantidade total de reservas finalizadas em um salão\n");
 System.out.print("6. Buscar reservas por status\n");
 System.out.print("7. Exibir os detalhes completos de uma reserva específica\n");
 
}
}
