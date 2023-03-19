package java_project;

public class Main {
    public static void main(String[] args) {
       
        Toys bear = new Toys(1, "Bear");
        Toys car = new Toys(2, "Car");
        Toys cubes = new Toys(3, "Cubes");
        Toys lego = new Toys(4, "Lego");
        Toys balloons = new Toys(5, "Balloons");
        Toys ball = new Toys(6, "Ball");
        Toys sword = new Toys(7, "Sword");

        
        Toy_Lottery toy_lottery = new Toy_Lottery();
        toy_lottery.add_toy_in_listToy(bear);
        toy_lottery.add_toy_in_listToy(car);
        toy_lottery.add_toy_in_listToy(cubes);
        toy_lottery.add_toy_in_listToy(lego);
        toy_lottery.add_toy_in_listToy(balloons);
        toy_lottery.add_toy_in_listToy(ball);
        toy_lottery.add_toy_in_listToy(sword);

       
        toy_lottery.lottteryToy();
        toy_lottery.readFile();
        toy_lottery.lottteryToy();
        toy_lottery.readFile();
       
        toy_lottery.getToy();
        
        toy_lottery.getToy_count();
    }
}