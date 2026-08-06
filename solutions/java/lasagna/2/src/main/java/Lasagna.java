public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int timePassed){
        int remainingTime = expectedMinutesInOven() - timePassed;
        return remainingTime;
    }

    public int preparationTimeInMinutes(int layers){
        int time = layers * 2;
        return time;
    }

    public int totalTimeInMinutes(int layers, int timePassed){
        int time = preparationTimeInMinutes(layers) + timePassed;
        return time;
    }
}
