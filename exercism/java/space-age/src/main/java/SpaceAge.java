class SpaceAge {

    private static final double earthOrbitalPeriod = 60*60*24*365;
    private static final double mercuryOrbitalPeriod = 0.2408467;
    private static final double venusOrbitalPeriod = 0.61519726;
    private static final double marsOrbitalPeriod = 1.8808158;
    private static final double jupiterOrbitalPeriod = 11.862615;
    private static final double saturnOrbitalPeriod = 29.447498;
    private static final double uranusOrbitalPeriod = 84.016846;
    private static final double neptuneOrbitalPeriod = 164.79132;

    private double ageInSeconds;

    SpaceAge(double seconds) {
        this.ageInSeconds = seconds / earthOrbitalPeriod;
    }

    double getSeconds() {
        return ageInSeconds;
    }

    double onEarth() {
        return ageInSeconds / earthOrbitalPeriod;
    }

    double onMercury() {
        return ageInSeconds / mercuryOrbitalPeriod;
    }

    double onVenus() {
        return ageInSeconds / venusOrbitalPeriod;
    }

    double onMars() {
        return ageInSeconds / marsOrbitalPeriod;
    }

    double onJupiter() {
        return ageInSeconds / jupiterOrbitalPeriod;
    }

    double onSaturn() {
        return ageInSeconds / saturnOrbitalPeriod;
    }

    double onUranus() {
        return ageInSeconds / uranusOrbitalPeriod;
    }

    double onNeptune() {
        return ageInSeconds / neptuneOrbitalPeriod;
    }

}
