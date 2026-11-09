public class StepTracker{
    private final int activeSteps;
    private int sumSteps;
    private int sumDays;
    private int activeDays;
    
    public StepTracker(int input){
        activeSteps = input;
        sumSteps = 0;
        sumDays = 0;
        activeDays = 0;
    }
    public void addDailySteps(int steps){
        sumSteps = sumSteps+steps;
        sumDays = sumDays + 1;
        if (steps >= activeSteps){
            activeDays++;
        }
    }
    public int activeDays(){
        return activeDays;
    }
    public double avgsteps(){
       double output = ((double)sumSteps)/((double)sumDays);
       return output;
    }


    
    public static void main (String [] args){
        StepTracker tr = new StepTracker(100);
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        tr.activeDays();
        tr.avgsteps();
        tr.addDailySteps(13000);
        tr.activeDays();
        tr.avgsteps();
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        tr.activeDays();
        tr.avgsteps();
    }
}