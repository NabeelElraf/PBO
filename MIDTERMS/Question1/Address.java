class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    public Address(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public boolean validate() {
        return notBlank(street) && notBlank(city) && notBlank(state)
                && notBlank(postalCode) && notBlank(country);
    }

    private boolean notBlank(String value) { return value != null && !value.trim().isEmpty(); }

    public String outputAsLabel() {
        if (!validate()) throw new IllegalStateException("Address is incomplete.");
        return street + "\n" + city + ", " + state + " " + postalCode + "\n" + country;
    }
}
