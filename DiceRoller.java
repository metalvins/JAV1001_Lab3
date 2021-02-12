
public class DiceRoller {
    private Die sixDie = new Die();
    private Die polyhedra = new Die(120);
    private Die dddice = new Die(20, "DnD");

    public static void main(String args[]) {

        DiceRoller tester = new DiceRoller();
    
        System.out.println("Six sided die shows " + tester.sixDie.roll());
        System.out.println("Polyhedra die shows " + tester.polyhedra.roll());
        System.out.println("DnD die shows " + tester.dddice.roll());

        System.out.println();

        System.out.println("Setting 101 face up for polyhedra. Currently shows " + tester.polyhedra.getSideUp());
        tester.polyhedra.setSideUp(101);

        System.out.println("Polyhedra die now shows " + tester.polyhedra.getSideUp());

        System.out.println();

        System.out.println("Now lets YAHTZEE!!");
        tester.yahtzee();
    }

    private void yahtzee() {

        Die[] dice = new Die[5];
        int numRolls = 0;

        while(true) {
            boolean equal = true;
            int prev = 0;

            for(int i=0; i<dice.length; i++) {
                dice[i] = new Die();
            }

            for(Die d: dice) {
                if(prev == 0) {
                    prev = d.roll();
                } else {
                    if(prev != d.roll()) {
                        equal = false;
                        break;
                    }
                    else
                        prev = d.getSideUp();
                }
            }

            numRolls++;
            if(equal == true)
            {
                String times = "";
                for(Die d: dice) {
                    times += Integer.toString(d.getSideUp()) + ",";
                }
                times = times.substring(0, times.length() - 1);
                System.out.println("We got YAHTZEE in " + numRolls + " tries with " + times);
                break;
            }
        }
    }
}
