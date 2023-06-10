interface teknologi {
    abstract void move();

    abstract void showDetails();
}

class Smartphone implements teknologi {
    private int price = 100;
    private String brand = "lacoste";

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }

    @Override
    public void showDetails() {
        System.out.println("price :" + price);
        System.out.println("brand : " + brand);
    }
}

class Car implements teknologi {
    private int totalForwardGear = 89;
    private String color = "kuning";
    private int maxSpeed = 200;

    @Override
    public void move() {
        System.out.println("total forward gear : " + totalForwardGear);
    }

    @Override
    public void showDetails() {
        System.out.println("total forward gear : " + totalForwardGear);
        System.out.println("color              : " + color);
        System.out.println("max speed          : " + maxSpeed);
    }

}