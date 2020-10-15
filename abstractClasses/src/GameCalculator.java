public abstract class GameCalculator { /* an abstract class forces classes who
                                    inherited for it to have its abstract methods*/
    public abstract void calculate();

    public void gameOver() {
        System.out.println("Game over ..");
    }

}
