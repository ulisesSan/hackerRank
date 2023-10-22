import java.io.IOException;
import java.util.*;

public class HackerRankMid {
    public static void main(String[] args)throws IOException {
        Scanner in = new Scanner(System.in);
        boolean isIp = true;
        while (in.hasNext()) {
            String Ip = in.next();
            int numeroIP = Ip.split("\\.").length;
            String[] Ipcadena = Ip.split("\\.");

            try{


                    for(int i = 0; i <= Ipcadena.length-1; i ++){
                        isIp = (Integer.parseInt(Ipcadena[i]) >= 0) && (Integer.parseInt(Ipcadena[i]) <= 255 && (Ipcadena[i] != "0"));
                    }
                if (numeroIP != 4) {
                    isIp = false;
                    }
                numeroIP = 0;
            }

            catch(Exception ex){
                isIp = false;
            }

            System.out.println(isIp);
        }
    }
}
