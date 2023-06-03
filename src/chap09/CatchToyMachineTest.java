package chap09;

class CatchToyMachineTest {
    public static void main(String[] args) {
        CatchToyMachine c = new CatchToyMachine();
        c.catchToyMachine();

        for (int i = 0; i < 10; i++) {
            System.out.println(c.catchToy().ToString());
        }
    }
}
