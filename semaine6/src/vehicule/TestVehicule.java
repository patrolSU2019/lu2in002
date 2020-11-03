public class TestVehicule {
    public static void main(String[] args) {
        Velo vl = new Velo(15, 3);
        System.out.println(vl.toString());
        vl.transporter("Angers", "Paris");
    }
}
