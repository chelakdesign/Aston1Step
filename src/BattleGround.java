public class BattleGround {
    public static void main(String[] args) {
        Mage vita = new Mage("Вита");
        Warrior alex = new Warrior("Алекс");
        Archer bob = new Archer("Боби");

        Enemy enemy = new Enemy(100);

        vita.attackEnemy(enemy);
        System.out.println(" " + enemy.getHealth());
        alex.attackEnemy(enemy);
        System.out.println(" " + enemy.getHealth());
        bob.attackEnemy(enemy);
        System.out.println(" " + enemy.getHealth());
    }
}
