import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;


class CountryStatistic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj kod państwa które Cię interesuje:");
        String code = sc.nextLine();
        try{
            Map<String, State> states = StatesMap.readStates("states.csv");
            State state = states.get(code);
            System.out.println("Statystyki wybranego państwa: "+ state);
        }catch (FileNotFoundException e) {
            System.err.println("Nie ma pliku states.csv");
        }
    }
}