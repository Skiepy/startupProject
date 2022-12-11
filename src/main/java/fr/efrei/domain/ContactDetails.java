package fr.efrei.domain;

public class ContactDetails {
    private String cellPhoneNumber;
    private String homeNumber;
    private String email;

    private ContactDetails(){}

    private ContactDetails(Builder builder){
        this.cellPhoneNumber = builder.cellPhoneNumber;
        this.homeNumber = builder.homeNumber;
        this.email = builder.email;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Cellphone number : " + cellPhoneNumber + "\n"
                + "Home phone number : " + homeNumber + "\n"
                + "Email : " + email + "\n";
    }

    public static class Builder{
        private String cellPhoneNumber;
        private String homeNumber;
        private String email;

        public Builder setCellPhoneNumber(String cellPhoneNumber) {
            this.cellPhoneNumber = cellPhoneNumber;
            return this;
        }

        public Builder setHomeNumber(String homeNumber) {
            this.homeNumber = homeNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder copy(ContactDetails details){
            this.cellPhoneNumber = details.cellPhoneNumber;
            this.homeNumber = details.homeNumber;
            this.email = details.email;
            return this;
        }

        public ContactDetails build(){
            return new ContactDetails(this);
        }
    }
}
