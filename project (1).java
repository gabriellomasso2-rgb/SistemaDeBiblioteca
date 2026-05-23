package SistemaDeControleDeBiblioteca;

import java.util.Scanner;

public class aluno {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a sua matricula: ");
        int m = sc.nextInt();


        System.out.println("Insira o código do livro:");
        int codL = sc.nextInt();

        System.out.println("Quantos livros você pegou emprestado: ");
        int L = sc.nextInt();

        System.out.println("O livro está disponível? ");
        String dis = sc.nextLine();
        project pr = new project(dis, L, codL, m);


        sc.close();
    }

}












