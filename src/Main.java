import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//TreeMap yard�m�yla String bir ifadenin i�inde bulunan harflerin adetlerini bulma
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("L�tfen C�mlenizi (K���k harflerle yaz�n�z) Giriniz : ");
        String cumle = scan.nextLine(); // C�mle Giri�i sa�lan�yor
        Map<Character,Integer> analiz = new TreeMap<Character,Integer>(); /* y�zde ad�nda bir Map
nesnesi olu�turuluyor*/
        for (int i = 0 ; i<cumle.length() ; i++) { 
            // Girilen t�m karakterler sayd�r�l�yor 
        	char c = cumle.charAt(i); // Girilen karakterler c olarak tan�mlan�yor
            
            if (analiz.containsKey(c)) { 
            	// Girilen karakterin daha �nceden girildi�i durum sorgulan�yor
            	analiz.replace(c, analiz.get(c) + 1); // Daha �nce girilen de�er 1 artt�r�larak girilir. 
               
            }
            else { // Girilen karakterin daha �nce girilmedi�i durum sorgulan�yor
            	analiz.put(c, 1); // Girilen karakter 1. kez say�l�yor
                
            }
           
        }

        System.out.println("----------------------");
        // for each ile t�m ��eler bast�r�l�yor
        for (Map.Entry<Character,Integer> entry : analiz.entrySet()) {
            System.out.println("'"+entry.getKey() + "' Karakteri : " + entry.getValue() + " Kez Girilmi�tir.");
        // Tek tek t�m karakterlerin ka� kez kullan�ld��� bas�l�yor.    
        }
 
    }
    
}
