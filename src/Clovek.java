class Clovek {
    protected String jmeno;
    protected int unava;
    public Clovek(String jmeno) {
        this.jmeno = jmeno;
        this.unava = 0;
    }
    public void run(int vzda) {
        if (this.unava + vzda > 30) {
            System.out.println("tahle vzdalenost je přes limit.");
        } else {
            this.unava += vzda;
        }
    }
    public void sleep(int hodiny) {
        this.unava -= hodiny * 5;
        if (this.unava < 0) {
            this.unava = 0;
        }
    }
    public String toString() {
        return "Jméno: " + this.jmeno + ", Únava: " + this.unava;
    }
}
class Javista extends Clovek {
    private final String IDE;
    public Javista(String jmeno, String IDE) {
        super(jmeno);
        this.IDE = IDE;
    }
    public void programuj(int radky) {
        int unaveny = radky / 10;
        if (this.unava + unaveny > 30) {
            System.out.println("nemužu programovat, pretože som unavený.");
        } else {
            this.unava += unaveny;
        }
        if (this.unava > 30) {
            this.unava = 30;
        }
    }
    public String toString() {
        return "Jméno: " + this.jmeno + ", Únava: " + this.unava + ", IDE: " + this.IDE;
    }
}
class Main {
    public static void main(String[] args) {
        Javista karel = new Javista("Karel Nový", "Eclipse");
        System.out.println(karel);
        karel.run(10);

        karel.programuj(50);
        karel.run(10);
        karel.programuj(30);
        karel.run(10);
        karel.programuj(5);
        karel.programuj(50);
        karel.sleep(8);
        karel.programuj(100);
        karel.run(10);
        System.out.println(karel);
    }
}