import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static float calculateTotalPrice(List<? extends  Product> products)
    {
        float sum = 0f;
        for(Product product : products)
        {
            sum += product.price;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("********************");
        System.out.println("Задача 1");
        System.out.println("********************");
        Box<Integer> integerBox = new Box<Integer>();
        Box<Double> doubleBox = new Box<Double>();
        Box<String> stringBox = new Box<String>();
        System.out.printf("Is integer box empty? %b\n", integerBox.isEmpty());
        System.out.printf("Is double box empty? %b\n", doubleBox.isEmpty());
        System.out.printf("Is string box empty? %b\n", stringBox.isEmpty());
        integerBox.box(1);
        doubleBox.box(3.1415);
        stringBox.box("Hello, World!");
        System.out.printf("Is integer box empty? %b\n", integerBox.isEmpty());
        System.out.printf("Is double box empty? %b\n", doubleBox.isEmpty());
        System.out.printf("Is string box empty? %b\n", stringBox.isEmpty());
        System.out.printf("Integer box contains %d\n", integerBox.unbox());
        System.out.printf("Double box contains %f\n", doubleBox.unbox());
        System.out.printf("String box contains %s\n", stringBox.unbox());

        System.out.println("********************");
        System.out.println("Задача 2");
        System.out.println("********************");
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Fruit(100));
        products.add(new Vegetable(90.5f));
        System.out.println("Сумма: " + calculateTotalPrice(products));
        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Fruit(100));
        fruits.add(new Fruit(123.5f));
        System.out.println("Сумма: " + calculateTotalPrice(fruits));
    }
}