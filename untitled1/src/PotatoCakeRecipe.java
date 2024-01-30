import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class PotatoCakeRecipe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("potato_cake_recipe.txt");


            System.out.println("Введите количество печенья (г): ");
            int biscuit = scanner.nextInt();
            System.out.println("Введите количество сливочного масла (г): ");
            int butter = scanner.nextInt();
            System.out.println("Введите количество сахара (г): ");
            int sugar = scanner.nextInt();
            System.out.println("Введите количество какао-порошка (г): ");
            int cocoa = scanner.nextInt();
            System.out.println("Введите количество молока (мл): ");
            int milk = scanner.nextInt();


            String recipe = "Рецепт 'Пирожного картошка':\n" +
                    "Ингредиенты:\n" +
                    "Печенье: " + biscuit + " г\n" +
                    "Сливочное масло: " + butter + " г\n" +
                    "Сахар: " + sugar + " г\n" +
                    "Какао-порошок: " + cocoa + " г\n" +
                    "Молоко: " + milk + " мл\n\n" +
                    "Способ приготовления:\n" +
                    "1. Измельчить печенье.\n" +
                    "2. Растопить масло и смешать его с молоком, сахаром и какао.\n" +
                    "3. Соединить смесь с печеньем и тщательно перемешать.\n" +
                    "4. Сформировать пирожные в виде картошки и дать остыть.\n";

            writer.write(recipe);
            writer.close();
            System.out.println("Рецепт успешно сохранен в файл 'potato_cake_recipe.txt'.");

        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи файла.");
            e.printStackTrace();
        }
    }
}
