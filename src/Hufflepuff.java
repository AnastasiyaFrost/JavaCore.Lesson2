public class Hufflepuff extends HogwartsStudent {
    private int industriousness;
    private int honesty;
    private int loyalty;
    private int hufflepuffQualities;

    public Hufflepuff(String fullName, int powerOfSorcery, int transgressionDistance,
                      int industriousness, int honesty, int loyalty) {
        super(fullName, powerOfSorcery, transgressionDistance);
        this.industriousness = industriousness;
        this.honesty = honesty;
        this.loyalty = loyalty;
        this.hufflepuffQualities = industriousness + honesty + loyalty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHufflepuffQualities() {
        return hufflepuffQualities;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Показатели личных качеств пуффендуйца: " +
                "трудолюбие: " + industriousness +
                ", честность: " + honesty +
                ", верность: " + loyalty +
                ". ";
    }
    public void compareStudentsByHufflepuffQualities(Hufflepuff hufflepuff) {
        if (this.hufflepuffQualities > hufflepuff.hufflepuffQualities) {
            System.out.println(this.fullName + " лучший пуффендуец, чем " + hufflepuff.fullName
                    + ". " + this.hufflepuffQualities + " VS " + hufflepuff.hufflepuffQualities);
        } else {
            System.out.println(hufflepuff.fullName + " лучший пуффендуец, чем " + this.fullName +
                    ". " + hufflepuff.hufflepuffQualities + " VS " + this.hufflepuffQualities);
        }
    }
}
