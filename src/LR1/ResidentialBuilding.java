package LR1;

public class ResidentialBuilding extends Building {
    int numOfLivingRooms;

    public ResidentialBuilding(int numOfLevels, String address, int numOfLivingRooms){
        super(numOfLevels, address);
        this.numOfLivingRooms = numOfLivingRooms;
    }
}
