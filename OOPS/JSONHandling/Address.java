package OOPS.JSONHandling;

import java.util.List;

public class Address {
    private int id;
    private String name;
    private List<Address> AddressDetails;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddressDetails() {
        return AddressDetails;
    }

    public void setAddressDetails(List<Address> addressDetails) {
        AddressDetails = addressDetails;
    }
}
