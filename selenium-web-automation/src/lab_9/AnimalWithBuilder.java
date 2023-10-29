package lab_9;

public class AnimalWithBuilder {
    private String name;
    private int maxSpeed;
    private boolean wings;


    protected AnimalWithBuilder(Builder builder){
        this.name = builder.name;
        this.maxSpeed = builder.maxSpeed;
        this.wings = builder.wings;

    }

    // Read only
    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isWings() {
        return wings;
    }

    // Inner class
    public static class Builder{
        private String name;
        private int maxSpeed;
        private boolean wings;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setWings(boolean wings) {
            this.wings = wings;
            return this;
        }

        public AnimalWithBuilder build(){
           return new AnimalWithBuilder(this);
        }
    }
}
