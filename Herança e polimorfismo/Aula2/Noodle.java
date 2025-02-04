public class Noodle {
    protected int lengthInCentimeters;
    protected String shape;
    protected String texture;

    public Noodle(int lengthInCentimeters, String shape, String texture) {
        this.lengthInCentimeters = lengthInCentimeters;
        this.shape = shape;
        this.texture = texture;
    }

    public void cook() {
        System.out.println("Cooking the noodle...");
    }
}
