import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        Scanner s = new Scanner(System.in);
        int n,k;
        System.out.println("K: ");
        k = s.nextInt();
        System.out.println("N: ");
        n = s.nextInt();

        Fattoriale f1 = new Fattoriale("N!", n);
        Fattoriale f2 = new Fattoriale("K!", k);

        Fattoriale f3 = new Fattoriale("(N-K)!", n-k);

        f1.start();
        f2.start();
        f3.start();
        f1.join();
        f2.join();
        f3.join();
        System.out.println("Risultato = " + f1.getVal()/(f2.getVal()*f3.getVal()));
    }
}