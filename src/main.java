
import java.util.Scanner;

public class main {
    
    /*
        Kullanıcıdan aldığımız boy ve kilo değerlerine göre kullanıcının benden kitle indeksini bulunuz
        Beden Kitle indeksi = Kilo/ Boy (m)*Boy (m)
    */
    
    
    
    public static void main(String[] args) {
        
         double boy =0;
         double kilo =0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lütfen Kilo nuzu giriniz : " );
        kilo = scanner.nextInt();
        System.out.println("Lütfen boy unuzu giriniz :");
        boy = scanner.nextDouble();
        
        double bedenKitleIndeksi = kilo / (boy * boy);
        
        System.out.println("Beden Kitle İndekisiniz : " + bedenKitleIndeksi);
        
        
    
}
}
