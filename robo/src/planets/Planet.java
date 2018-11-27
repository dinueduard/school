package planets;

public enum Planet {
    EARTH(5.976e+24, 6.37814e6),
    JUPITER(1.9e+27, 7.1492e7),
    MARS(6.421e+23, 3.3972e6),
    MERCURY(3.303e+23, 2.4397e6),
    NEPTUNE(1.024e+26, 2.4746e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    VENUS(4.869e+24, 6.0518e6),
    PLUTO(1.303E+22, 1.188e7);




    private final double mass; // in kilograms
    private final double radius; // in meters

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    // universal gravitational constant
    public static final double G = 6.67300E-11;

    double surfaceGravity() {
        return G * mass / (radius * radius);
    }

    double surfaceWeight(double yourMass) {
        return yourMass * surfaceGravity();
    }
}
