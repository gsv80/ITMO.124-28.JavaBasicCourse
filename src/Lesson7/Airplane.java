package Lesson7;
class Plane {
    class Wing{
        double wingWeight;
        void showWing(){
            System.out.println("Вес крыла: "+ wingWeight);
        }
        void setWeight(double wingWeight){
            this.wingWeight = wingWeight;
        }
    }
    public void innerMethod(double weight){
        Plane.Wing obj = new Plane.Wing();
        obj.setWeight(weight);
        obj.showWing();
    }


}

