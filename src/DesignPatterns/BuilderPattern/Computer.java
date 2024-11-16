package DesignPatterns.BuilderPattern;

public class Computer {
    //required attributes
    private String processor;
    private String motherboard;

    //optional attributes
    private int ram;
    private int storage;
    private String memoryCard;

    public Computer(ComputerBuilder builder) {
        this.processor = builder.processor;
        this.motherboard = builder.motherboard;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.memoryCard = builder.memoryCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", memoryCard='" + memoryCard + '\'' +
                '}';
    }

    public static class ComputerBuilder{
        //required attributes
        private String processor;
        private String motherboard;

        //optional attributes
        private int ram;
        private int storage;
        private String memoryCard;

        public ComputerBuilder(String processor, String motherboard) {
            this.processor = processor;
            this.motherboard = motherboard;
        }

        public ComputerBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setMemoryCard(String memoryCard) {
            this.memoryCard = memoryCard;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
