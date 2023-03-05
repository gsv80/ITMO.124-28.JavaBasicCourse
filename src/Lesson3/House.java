package Lesson3;

import java.net.HttpURLConnection;
import java.time.Year;

public class House {
    int yearNow;
    private Long floors;
    private Long buildYear;
    private String building;

    public House() {

    }
    public House(Long buildYear, String building){
        this.buildYear = buildYear;
        this.building = building;
    }
    public House(Long floors, Long buildYear, String building){
        this.floors = floors;
        this.buildYear = buildYear;
        this.building = building;
    }

    public Long getFloors(){
        return floors;
    }
    public void setFloors(Long floors){
        this.floors = floors;
    }
    public Long getBuildYear(){
        return buildYear;
    }
    public void setBuildYear(Long buildYear){
        this.buildYear = buildYear;
    }
    public String getBuilding(){
        return building;
    }
    public void setBuilding(String building){
        this.building = building;
    }
    public long getAge() {
        yearNow = Year.now().getValue();
        return yearNow-this.buildYear;
    }

    @Override
    public String toString() {
        return "House{" +
                " floors=" + floors +
                ", buildYear=" + buildYear +
                ", building='" + building + '\'' +
                '}';
    }
}
