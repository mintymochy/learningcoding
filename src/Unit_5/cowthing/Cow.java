package Unit_5.cowthing;

/* 
 August Jones 
 01-25-2024
 AP CSA
 :3
*/
public class Cow {
    private String cowType;
    private String sound;
    private int timesMilked;

    public Cow() {
        sound = "";
        cowType = "";
        timesMilked = 0;
    }

    public Cow(String cowType, String sound, int timesMilked) {
        this.cowType = cowType;
        this.sound = sound;
        this.timesMilked = timesMilked;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setCowType(String cowType) {
        this.cowType = cowType;
    }

    public String getCowType() {
        return cowType;
    }

    public void setTimesMilked(int timesMilked) {
        this.timesMilked = timesMilked;
    }

    public int getTimesMilked() {
        return timesMilked;
    }

    public void milkCow() {
        timesMilked++;
    }
}