public class ParkingGarage {

    public double ParkingCost(double hours){
        hours = Math.round(hours);
        double baseValue = 2.00;
        double extraHoursValue = 0.50;
        double totalCost;
        if(hours <= 3.00 && hours > 0.00){
            return baseValue;
        }
        else if(hours >3.00 && hours <=24.00) {
            totalCost = baseValue + (hours - 3.00) * extraHoursValue;
            if(totalCost > 10.00)
                totalCost = 10.00;
            return totalCost;
        }
        else return -99.00;
    }
}
