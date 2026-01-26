public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker moccaMaster = new CoffeeMaker();
        moccaMaster.setType(2);
        moccaMaster.setAmount(50);

        if (!moccaMaster.isOn()) {
            moccaMaster.pressOnOff();
        }
        while (moccaMaster.isOn()) {
            System.out.println("Coffee maker is on");
            System.out.println("Coffee type is " + moccaMaster.getType());
            System.out.println("Coffee amount is " + moccaMaster.getAmount() + " ml");
            moccaMaster.pressOnOff();
        }
        System.out.println("Coffee maker is off");

    }
}
