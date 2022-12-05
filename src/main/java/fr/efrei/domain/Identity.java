package fr.efrei.domain;

public class Identity {
    private String identityType;
    private String identityValue;

    private Identity(){}

    private Identity(Builder builder){
        this.identityType = builder.identityType;
        this.identityValue = builder.identityValue;
    }

    public String getIdentityType() {
        return identityType;
    }

    public String getIdentityValue() {
        return identityValue;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "identityType='" + identityType + '\'' +
                ", identityValue='" + identityValue + '\'' +
                '}';
    }

    public static class Builder{
        private String identityType;
        private String identityValue;

        public Builder setIdentityType(String identityType) {
            this.identityType = identityType;
            return this;
        }

        public Builder setIdentityValue(String identityValue) {
            this.identityValue = identityValue;
            return this;
        }

        public Builder copy(Identity identity){
            this.identityType = identity.identityType;
            this.identityValue = identity.identityValue;
            return this;
        }

        public Identity build(){
            return new Identity(this);
        }
    }
}
