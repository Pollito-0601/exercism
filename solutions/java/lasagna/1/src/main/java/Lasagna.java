public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timePassed){
        int remainingTime = expectedMinutesInOven() - timePassed;
        return remainingTime;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int time = layers * 2;
        return time;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int timePassed){
        int time = preparationTimeInMinutes(layers) + timePassed;
        return time;
    }
}
