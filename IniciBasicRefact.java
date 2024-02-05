import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IniciBasicRefact {
    public static void main(String[] args) throws IOException {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclat = new BufferedReader(entrada);

        String pregunta = "2+6=?";
        String resposta = "";
        String correcta = "8";
        int punts = 0;

        System.out.println("Comen�a el test!!!\n Per superar els test has de contestar la pregunta correctament.\n");
        System.out.println(pregunta);

        resposta = teclat.readLine();

        if (compararResultats(resposta,correcta)) {
            punts = 10;
        } else {
            punts = 0;
        }

        if (punts != 10) {
            System.out.println("\nPunts totals: " + punts);
            System.out.println("Ho sento no has superat el test!!!");
        } else {
            System.out.println("\nPunts totals: " + punts);
            System.out.println("Felcitats, resposta correcta!!!");
        }
    }
    private static boolean compararResultats(String resposta_user, String resposta_correcta){
        return resposta_user.equals(resposta_correcta);
    }
}