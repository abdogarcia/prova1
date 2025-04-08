import paquet1.Alumne;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * Li passes nom i edat i retorna tot
     * @param nom Açò és el nom
     * @param edat aásddfñjk edat
     * @return cadena conjuntaaa
     */
    public static String pep(String nom, int edat){
        return nom + " " + edat;
    }
    public static void main(String[] args) {
        ArrayList<String> noms = new ArrayList();

        noms.add("111");
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int w = 1; w <= 5; w++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("w ==== " + w);
        }
        System.out.println(pep("Abdó", 54));
        Alumne alu = new Alumne("pep", 10);
        Alumne a1 = new Alumne("pepet");
        System.out.println("ojo2");
    }
}