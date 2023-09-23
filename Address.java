class Address {
    int number;
    String street;
    boolean isApartment;
    int apartmentNumber;
    String county;
    String state;
    int zipCode;
    String country;

    public Address(int number, String street, boolean isApartment, int apartmentNumber, String county, String state, int zipCode, String country){
        this.number = number;
        this.street = street;
        this.isApartment = isApartment;
        this.apartmentNumber = apartmentNumber;
        this.county = county;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }
    public Address(int number, String street, String county, String state, int zipCode, String country){
        this.number = number;
        this.street = street;
        this.county = county;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.isApartment = false;
        this.apartmentNumber = 1;
    }

    public boolean isApartment() {
        return isApartment;
    }
    public int getApartmentNumber() {
        return apartmentNumber;
    }
    public int getNumber() {
        return number;
    }
    public String getStreet() {
        return street;
    }
    public String getCounty() {
        return county;
    }
    public String getState() {
        return state;
    }
    public int getZipCode() {
        return zipCode;
    }
    public String getCountry() {
        return country;
    }
    public String toString() {
        if (isApartment) {
            return number + " " + street + ", Apt " + apartmentNumber + "\n" + county + ", " + state + " " + zipCode + "\n" + country;

        } else {
            return number + " " + street + "\n" + county + ", " + state + " " + zipCode + "\n" + country;
        }

    }
    public boolean equals(Address address) { 
        return number == address.getNumber() && street.equals(address.getStreet()) && county.equals(address.getCounty()) && state.equals(address.getState()) && zipCode == address.getZipCode() && country.equals(address.getCountry()) && isApartment == address.isApartment() && apartmentNumber == address.getApartmentNumber();
    }
}
