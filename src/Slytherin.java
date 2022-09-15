public class Slytherin extends HogwartsStudent {
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int readiness;
    private int lustForPower;
    private int slytherinQualities;

    public Slytherin(String fullName, int powerOfSorcery, int transgressionDistance, int cunning,
                     int resoluteness, int ambition, int readiness, int lustForPower) {
        super(fullName, powerOfSorcery, transgressionDistance);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.readiness = readiness;
        this.lustForPower = lustForPower;
        this.slytherinQualities = cunning+resoluteness+ambition+readiness+lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getReadiness() {
        return readiness;
    }

    public void setReadiness(int readiness) {
        this.readiness = readiness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int getSlytherinQualities() {
        return slytherinQualities;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Показатели личных качеств слизеринца: " +
                "хитрость: " + cunning +
                ", решительность: " + resoluteness +
                ", амбициозность: " + ambition +
                ", находчивость: " + readiness +
                ", жажда власти: " + lustForPower +
                ". ";
    }
    public void compareStudentsBySlytherinQualities(Slytherin slytherin) {
        if (this.slytherinQualities > slytherin.slytherinQualities) {
            System.out.println(this.fullName + " лучший слизеринец, чем " + slytherin.fullName
                    + ". " + this.slytherinQualities + " VS " + slytherin.slytherinQualities);
        } else {
            System.out.println(slytherin.fullName + " лучший слизеринец, чем " + this.fullName +
                    ". " + slytherin.slytherinQualities + " VS " + this.slytherinQualities);
        }
    }
}
