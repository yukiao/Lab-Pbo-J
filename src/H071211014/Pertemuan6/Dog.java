abstract class Dog implements Move{
    int position;
    int averageLength;
    abstract void describe();

    Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
}

