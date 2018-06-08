package groupsrandomscore;

import java.util.Random;

public class GroupsRandomScore {

    public static void main(String[] args) {
        for (int group = 1; group <= 8; group++) {
        Random random = new Random();
        int RandomEqA = random.nextInt(5);
        int RandomEqB = random.nextInt(5);
        int RandomEqC = random.nextInt(5);
        int RandomEqD = random.nextInt(5);
        System.out.println("Resultado Grupo" + group + ":\n" + (" Equipo A: " + RandomEqA )+(" - Equipo B: " + RandomEqB) + " & " + (" Equipo C: " + RandomEqC )+(" - Equipo D: " + RandomEqD));        
        }   
    }
}
