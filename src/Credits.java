import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Credits {
    public static void credits() {

        List<String> creditsX = new ArrayList<>();
        Random random = new Random();

        creditsX.add("Tesfaab Asmeslash (Houston)");
        creditsX.add("Gulmanat Astana (Kazakhstan)");
        creditsX.add("Alena Bubenshchykava (Belarus)");
        creditsX.add("Joseph Goldman (Boston)");
        creditsX.add("Hilal Parlak (Houston)");
for (int i=1; i< creditsX.size();i++) {
    int tempIndex = random.nextInt(creditsX.size() - 1);
    String tempName = creditsX.get(tempIndex);
    creditsX.set(tempIndex, creditsX.get(i));
    creditsX.set(i, tempName);
}
for (String name : creditsX) {
    System.out.println(name);

}

}

    }

