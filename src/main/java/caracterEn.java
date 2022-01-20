public class caracterEn {
    public static int caracterEn (String cadena, int num) throws excep{
            if (num <= 0 || num > cadena.length()) {
                throw new excep("Has intentado recuperar una posicion de la cadena de caracteres que no existe");
            }else{
                    System.out.println("El caracter en esa pocicion " + num + " es: " + cadena.charAt(num-1));
            }
        return 0;
    }
}
class excep extends Exception{

    public excep(String inf) {
        super(inf);
    }

}