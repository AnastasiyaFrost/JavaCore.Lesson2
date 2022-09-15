public class Ravenclaw extends HogwartsStudent {
    private int intelligence;
    private int wisdom;
    private int wittiness;
    private int creativity;
    private int ravenclawQualities;

    public Ravenclaw(String fullName, int powerOfSorcery, int transgressionDistance,
                     int intelligence, int wisdom, int wittiness, int creativity) {
        super(fullName, powerOfSorcery, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
        this.ravenclawQualities = intelligence + wisdom + wittiness + creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getRavenclawQualities() {
        return ravenclawQualities;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Показатели личных качеств когтевранца: " +
                "ум: " + intelligence +
                ", мудрость: " + wisdom +
                ", остроумие: " + wittiness +
                ", творчество: " + creativity +
                ". ";
    }
    public void compareStudentsByRavenclawQualities(Ravenclaw ravenclaw) {
        if (this.ravenclawQualities > ravenclaw.ravenclawQualities) {
            System.out.println(this.fullName + " лучший когтевранец, чем " + ravenclaw.fullName
                    + ". " + this.ravenclawQualities + " VS " + ravenclaw.ravenclawQualities);
        } else {
            System.out.println(ravenclaw.fullName + " лучший когтевранец, чем " + this.fullName +
                    ". " + ravenclaw.ravenclawQualities + " VS " + this.ravenclawQualities);
        }
    }
}
