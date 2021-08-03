import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//TreeMap yardýmýyla String bir ifadenin içinde bulunan harflerin adetlerini bulma
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Cümlenizi (Küçük harflerle yazýnýz) Giriniz : ");
        String cumle = scan.nextLine(); // Cümle Giriþi saðlanýyor
        Map<Character,Integer> analiz = new TreeMap<Character,Integer>(); /* yüzde adýnda bir Map
nesnesi oluþturuluyor*/
        for (int i = 0 ; i<cumle.length() ; i++) { 
            // Girilen tüm karakterler saydýrýlýyor 
        	char c = cumle.charAt(i); // Girilen karakterler c olarak tanýmlanýyor
            
            if (analiz.containsKey(c)) { 
            	// Girilen karakterin daha önceden girildiði durum sorgulanýyor
            	analiz.replace(c, analiz.get(c) + 1); // Daha önce girilen deðer 1 arttýrýlarak girilir. 
               
            }
            else { // Girilen karakterin daha önce girilmediði durum sorgulanýyor
            	analiz.put(c, 1); // Girilen karakter 1. kez sayýlýyor
                
            }
           
        }

        System.out.println("----------------------");
        // for each ile tüm öðeler bastýrýlýyor
        for (Map.Entry<Character,Integer> entry : analiz.entrySet()) {
            System.out.println("'"+entry.getKey() + "' Karakteri : " + entry.getValue() + " Kez Girilmiþtir.");
        // Tek tek tüm karakterlerin kaç kez kullanýldýðý basýlýyor.    
        }
 
    }
    
}
