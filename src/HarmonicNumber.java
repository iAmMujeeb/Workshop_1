import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        float h = 0;
        float temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for Harmonic Values = ");
        int n = sc.nextInt();
        if(n !=0){
            for(int i=1; i<=n; i++){
                temp = h;
                float j = i;
                temp = (temp+(1/j));
                h = temp;
            }
        }else
            System.out.println("Value is Zero");
        System.out.println("Harmonic Value for N("+n+") = "+h);
    }
}
