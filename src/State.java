import java.util.Objects;

class State {
    private String code;
    private String nameState;
    private int population;

    public State(String code, String nameState, int population) {
        this.code = code;
        this.nameState = nameState;
        this.population = population;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameState() {
        return nameState;
    }

    public void setNameState(String nameState) {
        this.nameState = nameState;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return code + ";" + nameState + ";" + population;
    }


}

