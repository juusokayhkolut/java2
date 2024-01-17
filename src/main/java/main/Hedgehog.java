public class Siili {
    private String nimi;
    private int ika;

    public Siili() {
        this.nimi = "Pikseli";
        this.ika = 5;
    }

    public Siili(String nimi, int ika) {
        this.nimi = nimi;
        this.ika = ika;
    }

    public void puhu(String text) {
        System.out.println(this.nimi + ": " + text);
    }

    public void run(int kierrokset) {
        for (int i = 0; i < kierrokset; i++) {
            System.out.println(this.nimi + " juoksee kovaa vauhtia!");
        }
    }
}