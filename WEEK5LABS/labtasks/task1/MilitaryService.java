package OOP.WEEK5LABS.labtasks.task1;


public class MilitaryService implements NationalService {

    private int daysLeft;

    public MilitaryService(int days) {
        this.daysLeft = days;
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
}
