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
        return "ContactDetails{" +
                "cellPhoneNumber='" + cellPhoneNumber + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder{
        private String cellPhoneNumber;
        private String homeNumber;
        private String email;

        public void setCellPhoneNumber(String cellPhoneNumber) {
            this.cellPhoneNumber = cellPhoneNumber;
        }

        public void setHomeNumber(String homeNumber) {
            this.homeNumber = homeNumber;
        }

        public void setEmail(String email) {
            this.email = email;
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
