package Classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpaceCrafts {

    private ArrayList<Spacecraft> spacecrafts;

    public SpaceCrafts() {
        spacecrafts = new ArrayList<>();
    }


    public SpaceCrafts(ArrayList<Spacecraft> spacecrafts) {
        this.spacecrafts = spacecrafts;
    }

    public ArrayList<Spacecraft> getList() {
        return spacecrafts;
    }

    public ArrayList<Spacecraft> getSpacecrafts() {
        return spacecrafts;
    }

    public void setSpacecrafts(ArrayList<Spacecraft> spacecrafts) {
        this.spacecrafts = spacecrafts;
    }

    public void add(Spacecraft spacecraft) {
        this.spacecrafts.add(spacecraft);
    }

    @Override
    public String toString() {

        String result = "Spacecrafts (" + (new Date()).toLocaleString() + ") " + System.lineSeparator();
        for (Spacecraft spacecraft : spacecrafts) {
            result += spacecraft + System.lineSeparator();
        }
        return result;
    }

}
