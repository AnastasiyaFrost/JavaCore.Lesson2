public class Griffindor extends HogwartsStudent {
    private int nobility;
    private int honour;
    private int courage;
    private int griffindorQualities;

    public Griffindor(String fullName, int powerOfSorcery, int transgressionDistance,
                      int nobility, int honour, int courage) {
        super(fullName, powerOfSorcery, transgressionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.courage = courage;
        this.griffindorQualities = nobility + honour + courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int getGriffindorQualities() {
        return griffindorQualities;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Показатели личных качеств гриффиндорца: " +
                "благородство: " + nobility +
                ", честь: " + honour +
                ", смелость: " + courage +
                ". ";
    }

    public void compareStudentsByGriffindorQualities(Griffindor griffindor) {
        if (this.griffindorQualities > griffindor.griffindorQualities) {
            System.out.println(this.fullName + " лучший гриффиндорец, чем " + griffindor.fullName
                    + ". " + this.griffindorQualities + " VS " + griffindor.griffindorQualities);
        } else {
            System.out.println(griffindor.fullName + " лучший гриффиндорец, чем " + this.fullName +
                    ". " + griffindor.griffindorQualities + " VS " + this.griffindorQualities);
        }
    }


}
