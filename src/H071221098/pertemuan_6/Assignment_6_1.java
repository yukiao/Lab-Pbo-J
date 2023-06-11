package H071221098.pertemuan_6;
abstract class Dog implements Moveable{
    int position;
    int averageLenght;
    abstract void describe();

}

class Pitbull extends Dog{

    @Override
    public void move() {
    position += 3;
    System.out.println("Anjing ini bergeser ke sebelah kanan sejauh " + position);
        
    }

    @Override
    void describe() {
    System.out.println("Mempunyai otot yang sangar");
        
    }

}

class SiberianHusky extends Dog{

    @Override
    public void move() {
    position += 2;
    System.out.println("Anjing ini bergeser ke sebelah kanan sejauh"+ position);
        
    }

    @Override
    void describe() {
    System.out.println("Mirip dengan srigala");
        
    }

}

class Bulldog extends Dog{

    @Override
    public void move() {
    position +=1;
    System.out.println("Anjing ini bergerak ke sebelah kanan sejauh"+ position);
        
    }

    @Override
    void describe() {
    System.out.println("Memiliki pipi yang turun");
        
    }
    
}

class GermanShepherd extends Dog{

    @Override
    public void move() {
    position += 3;
    System.out.println("Anjing ini bergerak ke sebelah kanan sejauh"+ position);
        
    }

    @Override
    void describe() {
    System.out.println("Merupakan anjing yang pintar");
        
    }
    

}


