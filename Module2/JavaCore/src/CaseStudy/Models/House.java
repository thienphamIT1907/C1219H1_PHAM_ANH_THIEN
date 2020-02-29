package CaseStudy.Models;

public class House extends Service {
    private String roomStandard;
    private String convenientDescription;
    private int numberOfFloors;

    @Override
    public String showInfo() {
        return (
            "\nId Service: " + super.getId() +
            "\nName Service: " + super.getNameService() +
            "\nArea used: " + super.getAreaUsed() +
            "\nRental Costs: " + super.getRentalCosts() +
            "\nMaximum number of people: " + super.getMaxNumberOfPeople() +
            "\nType rent: " + super.getTypeRent() +
            "\nRoom standard: " + this.getRoomStandard() +
            "\nConvenient Description: " + this.getConvenientDescription() +
            "\nNumber of floors: " + this.getNumberOfFloors()
        );
    }

    public House() {
    }

    public House(String id, String nameService, double areUsed, double rentalCosts, int maxNumberOfPeople, String typeRent, String roomStandard, String convenientDescription, int numberOfFloors) {
        super(id, nameService, areUsed, rentalCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
