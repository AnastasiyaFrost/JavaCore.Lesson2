public abstract class HogwartsStudent {
    protected String fullName;
    protected int powerOfSorcery;
    protected int transgressionDistance;
    protected int magicAbility;


    public HogwartsStudent(String fullName, int powerOfSorcery, int transgressionDistance) {
        this.fullName = fullName;
        this.powerOfSorcery = powerOfSorcery;
        this.transgressionDistance = transgressionDistance;
        this.magicAbility = powerOfSorcery + transgressionDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPowerOfSorcery() {
        return powerOfSorcery;
    }

    public void setPowerOfSorcery(int powerOfSorcery) {
        this.powerOfSorcery = powerOfSorcery;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagicAbility() {
        return magicAbility;
    }

    @Override
    public String toString() {
        return "Студент " + fullName + ", сила магии: " + powerOfSorcery +
                ", расстояние трансгрессии: " + transgressionDistance +
                ", итого общая сила магии: " + magicAbility + ". ";
    }

    public void compareStudentsByMagicAbility(HogwartsStudent hogwartsStudent) {
        if (this.magicAbility > hogwartsStudent.magicAbility) {
            System.out.println(this.fullName + " более сильный маг, чем " + hogwartsStudent.fullName
                    + ". " + this.magicAbility + " VS " + hogwartsStudent.magicAbility);
        } else {
            System.out.println(hogwartsStudent.fullName + " более сильный маг, чем " + this.fullName +
                    ". " + hogwartsStudent.magicAbility + " VS " + this.magicAbility);
        }
    }
}
