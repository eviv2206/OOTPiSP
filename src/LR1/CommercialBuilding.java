package LR1;

public class CommercialBuilding extends Building {
    int numOfTenants;

    public CommercialBuilding(int numOfLevels, String address, int numOfTenants){
        super(numOfLevels, address);
        this.numOfTenants = numOfTenants;
    }
}
