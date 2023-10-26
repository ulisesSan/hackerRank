import java.io.IOException;
import java.util.*;

public class HackerRankMid {
    public static void main(String[] args)throws IOException {
        Scanner in = new Scanner(System.in);
        boolean isIp = true;
        while (in.hasNext()) {
            String Ip = in.next();
            int numeroIP = Ip.split("\\.").length;
            String[] ipCadena = Ip.split("\\.");

            isIp = (Ip.matches(regEx.pattern()));
            try{
                for(int i = 0; i <= ipCadena.length-1; i ++){
                    isIp = ((Integer.parseInt(ipCadena[i]) >= 0) &&
                            ((Integer.parseInt(ipCadena[i]) <= 255) && isIp &&
                                    Integer.parseInt(ipCadena[i]) != 4));
                }
            }
            catch(Exception ex){
                isIp = false;
            }//maybe
            System.out.println(isIp);
        }
    }

    static class regEx{
        public static String pattern (){
            return "([0-2]?\\d?\\d)\\.([0-2]?\\d?\\d)\\.([0-2]?\\d?\\d)\\.([0-2]?\\d?\\d)";
        }
    }
}