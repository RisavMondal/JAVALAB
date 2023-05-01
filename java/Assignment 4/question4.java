import java.lang.reflect.Array;

class Distance {
    float distance;

    public void setDistance(float distance) {
        this.distance = distance;
    }

    float travelTime(){
        return (distance/60);
    }
}


class DistanceMKS extends Distance{
    public DistanceMKS(float value){
        super.setDistance(value);
    }

    @Override
    float travelTime() {
       
        return (distance / 36000);
    }
}

public class question4 {
    public static void main(String[] args) {
        System.out.println("Distance Converter");
        System.out.println("Name:- Ramprasad Dolai Roll- 13");
        Distance d = new Distance();
        d.setDistance(240);
        DistanceMKS ds = new DistanceMKS(120);
        System.out.println(d.travelTime() + " Hours");
        System.out.println(ds.travelTime() + " Hours");

    }
}