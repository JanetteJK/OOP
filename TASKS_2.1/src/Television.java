public class Television {
    private int channel;
    private boolean on = false;

    public void Television() {
        channel = 0;
    }

    void setChannel(int number) {
        channel = number;
    }

    boolean isOn() {
        if (on) {
            return true;
        }
        else {
            return false;
        }
    }


    void pressOnOff() {
        if (on){
            on = false;
        }
        else {
            on = true;
        }
    }

    public int getChannel() {
        if (channel > 10){
            channel = 1;
        }
        return channel;
    }
}