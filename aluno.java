package SistemaDeControle;

import java.util.Scanner;

public class aluno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a sua matricula: ");
        int m = sc.nextInt();


        System.out.println("Insira o código do livro:");
        int codL = sc.nextInt();

        System.out.println("Quantos livros você pegou emprestado: ");
        int L = sc.nextInt();

        System.out.println("O livro está disponível? ");
        String dis = sc.next();

        System.out.println();

        project pr = new project(dis, L, codL, m);

        System.out.println("Matricula: "+m);
        System.out.println("Código do livro: "+codL);
        System.out.println("Livros pegados: "+L);
        System.out.println("Disponível: "+dis);

        pr.calculo();
        pr.Livro();
        pr.con();
    }
}
