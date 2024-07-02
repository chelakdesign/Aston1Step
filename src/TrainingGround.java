public class TrainingGround {
    public static void main(String[] args) {
        Mage vita = new Mage("Вита");

        Enemy enemy = new Enemy(100);

        vita.attackEnemy(enemy);
    }
}
