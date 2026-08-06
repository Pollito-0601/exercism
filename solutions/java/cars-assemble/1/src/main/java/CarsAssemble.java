public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int rate = speed * 221;
        double success = 0;
        if (speed <= 4 && speed > 0){
            success = rate;
        } else if (speed <= 8){
            success = rate * 0.9;
        } else if (speed == 9){
            success = rate * 0.8;
        } else if (speed == 10){
            success = rate * 0.77;
        }

        return success;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
