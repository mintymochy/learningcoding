package Unit_5.pokemon;

/*
 * August Jones
 * 2024 -1-8 07:55
 * AP CSA
 * :3
 */
public class Pokemon {
    private boolean isFishing;
    private boolean isFighting;
    private int hitPoints;

    public Pokemon(boolean isFishing, boolean isFighting, int hitPoints) {
        this.hitPoints = hitPoints;
        this.isFighting = isFighting;
        this.isFishing = isFishing;
    }

    public void setFishing(boolean newFishing) {
        this.isFishing = newFishing;
    }

    public void setFighting(boolean newFighting) {
        this.isFighting = newFighting;
    }

    public void setHitPoints(int newHitPoints) {
        this.hitPoints = newHitPoints;
    }

    public boolean getFighting() {
        return this.isFighting;
    }

    public boolean getFishing() {
        return this.isFishing;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public void damage(int amountOfDamage) {
        if (hitPoints - amountOfDamage < 0)
            return;
        hitPoints -= amountOfDamage;
    }

    public String toString() {
        return "has " + hitPoints + " hit points\nFishing: " + isFishing + "\nFighting: " + isFighting;
    }
}