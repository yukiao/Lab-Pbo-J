class Laptop {
    String processor;
    int ram;
    String gpu;
    boolean isOn;

    public Laptop(String processor, int ram, String gpu){
        this.processor = processor;
        this.gpu = gpu;
        this.ram = ram;
        this.isOn = false;
    }

    public void tekanTombolPower(){
        this.isOn = !isOn;
    }

        
}

