public class Velo extends Vehicule{
    protected double vitesse;
    protected int nbPlaces;

    public Velo(double v, int np) {
        super();
        vitesse = v;
        nbPlaces = np;
    }

    @Override
    public String toString() {
        return super.toString() + " :: Velo [nbPlaces=" + nbPlaces + ", vitesse=" + vitesse + "]";
    }

    public void transporter(String depart, String arrivee){
        System.out.println("Le vélo n°" + super.getNumero() + 
        " a transporté " + nbPlaces + " personne de " + depart + " à " + arrivee + ".");
    }
}
