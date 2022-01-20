
import java.io.IOException;
import java.util.Scanner;

public class MAIN1 {
    public static void main(String[] args) throws excep {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe la cadena de caracteres que desees ");
        String arg = leer.next();
        int num;
        //System.out.println("Escribe la pocicion que deseas evaluar ");
        //num = Integer.parseInt(leer.next());
        num=7;
        try {
            caracterEn.caracterEn(arg, num);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
