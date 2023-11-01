package OOP.WEEK5LABS.labtasks.task1;

public class CivilService implements NationalService {
    private int daysLeft;

    public CivilService() {
        this.daysLeft = 1;
    }

    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }

    @Override
    public void work() {
        if(this.daysLeft > 0) {
            this.daysLeft--;
        }
    }


    public void setDaysLeft(int days) {
        this.daysLeft = days;
    }
}
