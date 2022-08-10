import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class cell {
    private int strength;
    private int x;
    private int y;
    private int id;
    private HashMap<String, Double> chemicals;
    private HashSet<String> signalmolecules;
    private ArrayList<String> checkcells ;


    public cell() {
        this.strength = 0;
        this.x = 0;
        this.y = 0;
        this.id = 0;
        this.chemicals = new HashMap<>();
        this.signalmolecules = new HashSet<>();
        this.checkcells = new ArrayList<>();
    }

    public cell(int strength, int x, int y, int id, HashMap<String, Double> chemicals, HashSet<String> signals, ArrayList<String> cells) {
        this.strength = strength;
        this.x = x;
        this.y = y;
        this.id = id;
        this.chemicals = new HashMap<>(chemicals);
        this.signalmolecules = new HashSet<>(signals);
        this.checkcells = new ArrayList<>(cells);

    }

    public int getStrength() {
        return strength;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getId() {
        return id;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void interactNeighbors(ArrayList<cell> neighbors) {
        // saving for later
    }

    public double getChemicalConcentration(String chemical)
        {
        return this.chemicals.getOrDefault(chemical, 0.0);
        }
    public void setChemicalConcentration(String chemical, double concentration)
        {
        this.chemicals.put(chemical, concentration);
        }
    public HashMap<String, Double> getChemicals()
        {
        return new HashMap<>(chemicals);
        }
    public void setChemicals(HashMap<String, Double> chemicals)
        {
         this.chemicals = new HashMap<>(chemicals);
        }
    public HashSet<String> getSignalmolecules()
        {
         return signalmolecules;
        }
    public void setSignalmolecules(HashSet<String> signalmolecules)
        {
        this.signalmolecules = signalmolecules;
        }
    public boolean hasSignal(String Signal)
        {
        return this.signalmolecules.contains(Signal);
        }
    public boolean activateSignal(String signal)
        {
        if (this.signalmolecules.contains(signal))
            {
                //do something
                return true;
            }
            return false;
        }
    private boolean checkAdjacent(ArrayList<Integer> checkcells ){

        int size = checkcells.size();
        for(int i=0; i<size; i++){

            if(checkcells.get(i) == checkcells.get(i+1)){

                //adjacent cells, do something

                return true;

            }
        }
        return false;
    }
}