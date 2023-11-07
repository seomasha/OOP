package OOP.WEEK6LABS.HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PromissoryNote {

    private Map<String, Double> debtList = new HashMap<>();
    public void setLoan(String toWhom, double value) {
        debtList.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        return debtList.get(whose);
    }
}
