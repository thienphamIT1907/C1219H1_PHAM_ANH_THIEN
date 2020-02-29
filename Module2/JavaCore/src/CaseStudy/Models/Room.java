package CaseStudy.Models;

public class Room extends Service{
    private String freeService;

    @Override
    public String showInfo() {
        return (
            "\nId Service: " + super.getId() +
            "\nName Service: " + super.getNameService() +
            "\nArea used: " + super.getAreaUsed() +
            "\nRental Costs: " + super.getRentalCosts() +
            "\nMaximum number of people: " + super.getMaxNumberOfPeople() +
            "\nType rent: " + super.getTypeRent() +
            "\nFree service: " + this.getFreeService()
        );
    }

    public Room() {
    }

    public Room(String id, String nameService, double areUsed, double rentalCosts, int maxNumberOfPeople, String typeRent, String freeService) {
        super(id, nameService, areUsed, rentalCosts, maxNumberOfPeople, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
