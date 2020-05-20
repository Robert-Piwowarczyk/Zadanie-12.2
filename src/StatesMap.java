import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StatesMap {
    static Map<String, State> readStates(String fileName) throws FileNotFoundException {
        Map<String, State> states = new TreeMap<>();
        Scanner sc = new Scanner(new File(fileName));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] split = line.split(";");
            State state = new State(split[0], split[1], Integer.valueOf(split[2]));
            states.put(state.getCode(), state);
        }
        return states;
    }
}

