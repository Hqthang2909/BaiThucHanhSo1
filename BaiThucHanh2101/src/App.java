import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       //Khai bao cac bien
       double heSoA, heSoB, heSoC, delta;
       double x1, x2;
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Nhap vao he so A: ");
        heSoA = sc.nextDouble();
        System.out.println("Nhap vao he so B: ");
        heSoB = sc.nextDouble();
        System.out.println("Nhap vao he so C: ");
        heSoC = sc.nextDouble();

        delta = heSoB * heSoB - 4 * heSoA * heSoC;
        System.out.println("Phuong trinh co delta = " + delta);
        //neu delta > 0 phuong trinh co 2 nghiem phan biet
        if (delta > 0){
            x1 = (-heSoB + Math.sqrt(delta)) / (2 * heSoA);
            x2 = (-heSoB - Math.sqrt(delta)) / (2 * heSoA);
        }else{
            System.out.println("Phuong trinh co 2 nghiem voi x1 = " + x1 + " voi x2 = " +x2);
        //neu delta = 0 phuong trinh co nghiem kep
        if (delta == 0){
            x1= ( -heSoB / (2 * heSoA));
        }else{
        System.out.println("Phương trinh có 1 nghiệm là x1 = x2 = " + x1);
        }
        //neu delta < 0 phuong trinh vo nghiem
        if (delta < 0){

        }else{
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}