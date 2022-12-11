package fr.efrei.domain;

public class Position {
    private String code;
    private boolean open; // True = position OPEN | False = position CLOSED

    private Position() {}

    private Position(Builder builder){
        this.code = builder.code ;
        this.open = builder.open;
    }

    public String getCode() {
        return code;
    }

    public boolean isOpen() {
        return open;
    }

    @Override
    public String toString() {
        return "Position{" +
                "code='" + code + '\'' +
                ", open=" + open +
                '}';
    }

    public static class Builder {
        private String code;
        private boolean open;

        public Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public Builder setOpen(boolean open) {
            this.open = open;
            return this;
        }

        public Builder copy(Position position){
            this.code = position.code;
            this.open = position.open;
            return this;
        }

        public Position build() { return new Position(this); }
    }
}
