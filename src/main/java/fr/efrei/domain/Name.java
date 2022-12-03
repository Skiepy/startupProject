package fr.efrei.domain;

public class Name {
    private String firstname;
    private String middleName;
    private String lastName;
    
    private Name(){}

    // MUST BE PRIVATE
    private Name(Builder builder){
        this.firstname = builder.firstname;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstname='" + firstname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder {
        private String firstname;
        private String middleName;
        private String lastName;

        public Builder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        // copy

        // build
        public Name build(){
            return new Name(this);
        }
    }
}
