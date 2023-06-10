abstract class dogy {
    abstract void move();

    abstract void describe();
}

class Pitbull extends dogy {
    protected int position = 0;
    protected int averageLength = 9;

    @Override
    void move() {
        position += 3;
        System.out.println("anjing pitbull ada di nomor" + position);
    }

    @Override
    void describe() {
        System.out.println("deskripsi : anjingnya berwarna ungu" + averageLength);
    }
}

class SiberianHusky extends dogy {
    protected int position = 0;
    protected int averageLength = 6;

    @Override
    void move() {
        position += 2;
        System.out.println("anjing siberian husky ada di nomor" + position);
    }

    @Override
    void describe() {
        System.out.println("deskripsi : anjingnya berwarna pink" + averageLength);
    }
}

class Bulldog extends dogy {
    protected int position = 0;
    protected int averageLength = 9;

    @Override
    void move() {
        position += 1;
        System.out.println("anjing bulldog ada di nomor " + position);
    }

    @Override
    void describe() {
        System.out.println("deskripsi : anjingnya berwarna kuning " + averageLength);
    }
}

class GermanShepherd extends dogy {
    protected int position = 0;
    protected int averageLength = 14;

    @Override
    void move() {
        position += 1;
        System.out.println("anjing German Shepherd ada di nomor" + position);
    }

    @Override
    void describe() {
        System.out.println("deskripsi : anjingnya berwarna merah" + averageLength);
    }
}
