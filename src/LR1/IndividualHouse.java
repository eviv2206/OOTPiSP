package LR1;

public class IndividualHouse extends ResidentialBuilding {
    String owner;

    public IndividualHouse(int numOfLevels, String address, int numOfLivingRooms, String owner){
        super(numOfLevels, address, numOfLivingRooms);
        this.owner = owner;
    }
}
