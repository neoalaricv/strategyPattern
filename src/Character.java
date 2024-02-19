public class Character {
    private String type;
    private DefenseStrategy defenseStrategy;
    private AttackStrategy attackStrategy;

    public Character(String type) {
        this.type = type;
        setDefaultStrategies();
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void attack() {
        System.out.print(type + " ");
        attackStrategy.attack();
    }

    public void defend() {
        System.out.print(type + " ");
        defenseStrategy.defend();
    }

    private void setDefaultStrategies() {
        if (type.equals("Knight")) {
            defenseStrategy = new KnightDefense();
            attackStrategy = new KnightAttack();
        } else if (type.equals("Wizard")) {
            defenseStrategy = new WizardDefense();
            attackStrategy = new WizardAttack();
        } else if (type.equals("Archer")) {
            defenseStrategy = new ArcherDefense();
            attackStrategy = new ArcherAttack();
        }
    }
}