package fr.efrei.domain;

public class AddressDetails {
    private String streetAddress;
    private String postalAddress;

    private AddressDetails(){}

    private AddressDetails(Builder builder){
        this.streetAddress = builder.streetAddress;
        this.postalAddress = builder.postalAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    @Override
    public String toString() {
        return "Street address : " + streetAddress + "\n"
                + "Postal address : " + postalAddress + "\n";
    }

    public static class Builder{
        private String streetAddress;
        private String postalAddress;

        public Builder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public Builder setPostalAddress(String postalAddress) {
            this.postalAddress = postalAddress;
            return this;
        }

        public Builder copy(AddressDetails details){
            this.streetAddress = details.streetAddress;
            this.postalAddress = details.postalAddress;
            return this;
        }

        public AddressDetails build(){
            return new AddressDetails(this);
        }
    }
}
