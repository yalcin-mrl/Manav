import java.util.Scanner;
public class manav {
    public static void main(String[] args){
        float armut=2.14f,elma=3.67f,domates=1.11f,muz=0.95f,patlican=5f,toplam;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ürünlerin kilo değerlerini girin?");
        System.out.println("Armut");
        armut = sc.nextFloat();
        System.out.println("Elma");
        elma= sc.nextFloat();
        System.out.println("Domates");
        domates = sc.nextFloat();
        System.out.println("Muz");
        muz = sc.nextFloat();
        System.out.println("Patlican");
        patlican = sc.nextFloat();
        toplam = armut+elma+domates+muz+patlican;
        System.out.println("Toplam fiyat : "+toplam);
    }
}
