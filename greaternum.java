import java.util.Scanner;

class greaternum{

    public static void greater(int n, int m){
        if (n>m){
            System.out.println(n);
        }
        else{
            System.out.println(m);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        greater(n,m);
    }

}