package SistemaDeControle;

public class project {

    private boolean D;
    private String dis;
    private int codL;
    private int L;
    private int m;
    private int[] matricula = {1231, 3453, 5675};
    private int[] livro = {86, 53, 12};

    public project(String dis, int codL, boolean D, int L, int m) {
        this.dis = dis;
        this.codL = codL;
        this.L = L;
        this.m = m;
        this.D = D;
    }

    public project(String dis, int l, int codL, int m) {
        this.dis = dis;
        this.L = l;
        this.codL = codL;
        this.m = m;
        this.D = true;
    }

    public boolean getD (boolean D) {
        return D;
    }


    public void setDis(String dis) {
        this.dis = dis;
    }

    public String getDis() {
        return dis;
    }

    public void setCodL(int codL) {
        this.codL = codL;
    }

    public int getCodL() {
        return codL;
    }

    public int calculo() {

        for (int i = 0; i < matricula.length; i++) {
            if (m == matricula[i]) {
            }
            if (m == 1231) {
                System.out.println("Empréstimo bloqueado por multa. ");
                System.exit(0);
            } else {
                System.out.println("Bem vindo!");
                return 1;
            }
        }
        return 0;
    }

    public int Livro() {

        if (L >= 3) {
            System.out.println("Limite de empréstimo atingido.");
            return 0;
        }
        for (int i = 0; i < livro.length; i++) {
            if (codL == livro[i]) {
                System.out.println("Livro encontrado.");
                return 1;
            }
        }
        System.out.println("Livro não encontrado");
        return 0;
    }


    public void Disponivel() {
        D = true;
        System.out.println("Empréstimo realizado com sucesso.");

    }

    public void Indisponivel() {
        D = false;
        System.out.println("Livro indisponível");
    }

    public void con() {
        if (dis.equalsIgnoreCase("sim")) {
            Disponivel();
        } else if (dis.equalsIgnoreCase("não")) {
            Indisponivel();

        }
    }
}
