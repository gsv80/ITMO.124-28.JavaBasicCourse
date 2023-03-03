package Lesson2;

//task2
public class Pump {
    private PumpType type;
    private Installation installation;
    private String pumpingMedia;
    private Double designedCapacity;
    private Double designedHead;
    private Boolean isMotorized;
    private Double motor;

    public Pump() {
    }

    public Pump(PumpType type, Installation installation, String pumpingMedia, Boolean isMotorized) {
        this.type = type;
        this.installation = installation;
        this.pumpingMedia = pumpingMedia;
        this.isMotorized = isMotorized;
    }

    public Pump(PumpType type, Installation installation, String pumpingMedia, Double designedCapacity, Double designedHead, Boolean isMotorized, Double motor) {
        this.type = type;
        this.installation = installation;
        this.pumpingMedia = pumpingMedia;
        this.designedCapacity = designedCapacity;
        this.designedHead = designedHead;
        this.isMotorized = isMotorized;
        this.motor = motor;
    }

    public PumpType getType(){
        return type;
    }
    public void setType(PumpType type){
        this.type = type;
    }
    public Installation getInstallation(){
        return installation;
    }
    public void setInstallation(Installation installation){
        this.installation = installation;
    }

    public String getMedia(){
        return pumpingMedia;
    }
    public void setMedia(String pumpingMedia){
        this.pumpingMedia = pumpingMedia;
    }
    public Double getCapacity(){
        return designedCapacity;
    }
    public void setCapacity(Double designedCapacity){
        this.designedCapacity = designedCapacity;
    }
    public Double getHead(){
        return designedHead;
    }
    public void setHead(Double designedHead){
        this.designedHead = designedHead;
    }
    public Boolean getMotorized(){
        return isMotorized;
    }
    public void setMotorized(Boolean isMotorized){
        this.isMotorized = isMotorized;
    }
    public Double getMotor(){
        return motor;
    }
    public void setMotor(Double motor ){
        this.motor= motor;
    }

    @Override
    public String toString() {
        return "Pump{" +
                "type=" + type +
                ", installation=" + installation +
                ", pumpingMedia='" + pumpingMedia + '\'' +
                ", designedCapacity=" + designedCapacity +
                ", designedHead=" + designedHead +
                ", isMotorized=" + isMotorized +
                ", motor=" + motor +
                '}';
    }
}
