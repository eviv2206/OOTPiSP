package LR1;

public class ApartmentBuilding extends ResidentialBuilding {
    int numOfApartments;

    public ApartmentBuilding(int numOfLevels, String address, int numOfLivingRooms, int numOfApartments){
        super(numOfLevels, address, numOfLivingRooms);
        this.numOfApartments = numOfApartments;
    }
}
