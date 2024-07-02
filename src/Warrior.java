public class Warrior extends Hero{
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print("Воин атакует врага");
        enemy.takeDamage(7);
    }
}
