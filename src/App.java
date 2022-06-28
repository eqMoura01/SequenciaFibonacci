import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int c, t1, t2, aux, n;

        System.out.println("Digite ate qual posicao da sequencia de fibonacci voce deseja ver");
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        s.close();

        System.out.println("----------------------");
        System.out.println("SEQUENCIA DE FIBONACCI");
        System.out.println("----------------------");
        t1 = 0;
        System.out.println(t1);
        t2 = 1;
        System.out.println(t2);

        for (c = 3; c <= n; c++) {
            aux = t1 + t2;
            System.out.println(aux);
            t1 = t2;
            t2 = aux;
        }
    }
}
