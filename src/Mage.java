public class Mage extends Hero{
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.print("Маг атакует врага");
        enemy.takeDamage(5);
    }
}
