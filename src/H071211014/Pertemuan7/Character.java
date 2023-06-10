abstract class Character{
    private String name;

    public String getName() {
        return name;
    }

    abstract int attack();
    abstract int attack(String attackType);
}