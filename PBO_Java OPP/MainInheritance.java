package inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        // Single inheritance
        Kucing kucing = new Kucing();
        kucing.makan();
        kucing.suara();

        // Multilevel inheritance
        Persia persia = new Persia();
        persia.makan();
        persia.suara();
        persia.jenis();

        // Hierarchical inheritance
        Anjing anjing = new Anjing();
        anjing.makan();
        anjing.suara();

        // Hybrid inheritance (class + interface)
        Mamalia mamalia = new Mamalia();
        mamalia.makan();
        mamalia.jinak();
    }
}
