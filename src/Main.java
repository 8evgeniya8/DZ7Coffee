import coffee.order.CoffeeOrderBoard;

public class Main {
    public static void main(String[]args){
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Naruto");
        coffeeOrderBoard.add("Itachi");
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver();

    }
}
