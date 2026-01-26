public class CoffeeMaker {
    private Boolean on = false;
    private int amount;
    private String coffee;

    public void CoffeeMaker() {
        coffee = "Normal";
    }

    public void setType(int type) {
        if (type == 1) {
            coffee = "Normal";
        }
        if (type == 2) {
            coffee = "Espresso";
        }

    }

    public void setAmount(int ml) {
        amount = ml;
    }

    boolean isOn(){
        if (on) {
            return true;
        }
        else {
            return false;
        }
    }

    void pressOnOff() {
        if (on) {
            on = false;
        }
        else{
            on = true;
        }
    }

    public String getType(){
        return coffee;
    }

    public int getAmount(){
        return amount;
    }
}
