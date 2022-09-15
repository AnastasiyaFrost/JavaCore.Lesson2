import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Griffindor harryPotter = generateGriffindor("Гарри Поттер");
        Griffindor hermioneGranger = generateGriffindor("Гермиона Грейнджер");
        Griffindor ronWeasley = generateGriffindor("Рон Уизли");

        Slytherin dracoMalfoy = generateSlytherin("Драко Малфой");
        Slytherin grahamMontagu = generateSlytherin("Грэхэм Монтегю");
        Slytherin gregoryGoyle = generateSlytherin("Грегори Гойл");

        Hufflepuff zachariasSmith = generateHufflepuff("Захария Смит");
        Hufflepuff cedricDiggory = generateHufflepuff("Седрик Диггори");
        Hufflepuff justinFinchFletchley = generateHufflepuff("Джастин Финч-Флетчли");

        Ravenclaw zhouChang = generateRavenclaw("Чжоу Чанг");
        Ravenclaw padmaPatil = generateRavenclaw("Падма Патил");
        Ravenclaw marcusBelby = generateRavenclaw("Маркус Белби");

        hermioneGranger.compareStudentsByMagicAbility(marcusBelby);
        dracoMalfoy.compareStudentsByMagicAbility(ronWeasley);

        harryPotter.compareStudentsByGriffindorQualities(hermioneGranger);
        dracoMalfoy.compareStudentsBySlytherinQualities(grahamMontagu);
        padmaPatil.compareStudentsByRavenclawQualities(zhouChang);
        justinFinchFletchley.compareStudentsByHufflepuffQualities(zachariasSmith);
    }
private static Griffindor generateGriffindor (String fullname) {
        return new Griffindor(
                fullname,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

private static Hufflepuff generateHufflepuff (String fullname) {
        return new Hufflepuff(
                fullname,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
}
    private static Ravenclaw generateRavenclaw (String fullname) {
        return new Ravenclaw(
                fullname,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
                );
    }
    private static Slytherin generateSlytherin (String fullname) {
        return new Slytherin(
                fullname,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
                );
    }
}