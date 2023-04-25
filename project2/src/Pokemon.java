public class Pokemon
{
    private final String name;
    private int hitPoints;
    private int attackSpeed;
    private int movePower;
    private String move;


    public Pokemon(String name, int hitPoints, String move, int movePower, int attackSpeed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.move = move;
        this.movePower = movePower;
        this.attackSpeed = attackSpeed;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public int getMovePower() {
        return movePower;
    }

    public void setMovePower(int movePower) {
        this.movePower = movePower;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public String displayPokemonStats() {
        return String.format("Name: %s\nHit Points: %d\nMove: %s\nMove Power: %d\nAttack Speed: %d\n", this.name, this.hitPoints, this.move, this.movePower, this.attackSpeed);
    }
}
