class Work extends Thread{
        public void run(){
            double z = 2.4;
            int k = 0;

            while (true){
                z = Math.cos(z);
                k++;
            }
        }
    }

class Keikka extends Thread{
    public void run(){

    }
}

public class Gobbler{
    public static void main(String[]args){
            Keikka vm = new Keikka();
            vm.start();

            Work nak = new Work();
            Work v = new Work();
// pyöritetään useampaa koodia yhtä aikaa

            nak.start();
            v.start();

           /* double z = 2.4;
            int k = 0;
            while (true){
                z = Math.cos(z);
                k++;

            */
            }
        }



