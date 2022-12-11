package fr.efrei.domain;

public class Employee {
    private int employeeNumber;
    private Name name;
    private Gender gender;
    private Race race;
    private ContactDetails contactDetails;
    private AddressDetails addressDetails;
    private Identity identity;

    private Employee() {}

    private Employee (Builder builder){
        this.employeeNumber = builder.employeeNumber;
        this.name = builder.name;
        this.gender = builder.gender;
        this.race = builder.race;
        this.contactDetails = builder.contactDetails;
        this.addressDetails = builder.addressDetails;
        this.identity = builder.identity;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public Name getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Race getRace() {
        return race;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    public Identity getIdentity() {
        return identity;
    }

    @Override
    public String toString() {
        return "Employee N°" + employeeNumber + " :\n"
                + name.toString()
                + gender.toString()
                + race.toString()
                + contactDetails.toString()
                + addressDetails.toString()
                + identity.toString();
    }

    public static class Builder{
        private int employeeNumber;
        private Name name;
        private Gender gender;
        private Race race;
        private ContactDetails contactDetails;
        private AddressDetails addressDetails;
        private Identity identity;

        public Builder setEmployeeNumber(int employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder setRace(Race race) {
            this.race = race;
            return this;
        }

        public Builder setContactDetails(ContactDetails contactDetails) {
            this.contactDetails = contactDetails;
            return this;
        }

        public Builder setAddressDetails(AddressDetails addressDetails) {
            this.addressDetails = addressDetails;
            return this;
        }

        public Builder setIdentity(Identity identity) {
            this.identity = identity;
            return this;
        }

        public Builder copy(Employee employee){
            this.employeeNumber = employee.employeeNumber;
            this.name = employee.name;
            this.gender = employee.gender;
            this.race = employee.race;
            this.contactDetails = employee.contactDetails;
            this.addressDetails = employee.addressDetails;
            this.identity = employee.identity;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
