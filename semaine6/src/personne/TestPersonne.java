public class TestPersonne {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        Personne p = new Salarie("Albert");
        p.ajouterEnfant();
        System.out.println(p.prime());
        System.out.println(p.estEnL2());
    }
}
