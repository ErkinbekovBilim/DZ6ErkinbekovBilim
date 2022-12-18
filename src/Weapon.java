public class Weapon {

    private WeaponType LASER;
    private WeaponType BLADE;
    private WeaponType GRAVITY;

    private String LaserGum;
    private String bladeOfChaos;
    private String gravityGum;

    public WeaponType getLASER() {
        return LASER;
    }

    public void setLASER(WeaponType LASER) {
        this.LASER = LASER;
    }

    public WeaponType getBLADE() {
        return BLADE;
    }

    public void setBLADE(WeaponType BLADE) {
        this.BLADE = BLADE;
    }

    public WeaponType getGRAVITY() {
        return GRAVITY;
    }

    public void setGRAVITY(WeaponType GRAVITY) {
        this.GRAVITY = GRAVITY;
    }

    public String getLaserGum() {
        return LaserGum;
    }

    public void setLaserGum(String laserGum) {
        LaserGum = laserGum;
    }

    public String getBladeOfChaos() {
        return bladeOfChaos;
    }

    public void setBladeOfChaos(String bladeOfChaos) {
        this.bladeOfChaos = bladeOfChaos;
    }

    public String getGravityGum() {
        return gravityGum;
    }

    public void setGravityGum(String gravityGum) {
        this.gravityGum = gravityGum;
    }
}
