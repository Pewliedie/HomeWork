import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aquarium aquarium = new Aquarium();
        boolean flag = true;

        while (flag) {
            System.out.println("Menu: Add, Remove, Change, Print all, Exit");
            String input = scanner.nextLine();

            switch (input.toLowerCase()) {
                case "add":
                    System.out.println("Now many fish do you want to add?");
                    int times = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < times; i++) {
                        System.out.println("Enter name: " + "#" + i);
                        String name = scanner.nextLine();

                        System.out.println("Enter size: ");
                        int size = Integer.parseInt(scanner.nextLine());

                        System.out.println("Enter age: ");
                        int age = Integer.parseInt(scanner.nextLine());
                        aquarium.addSpecies(name, size, age);
                    }
                    break;

                case "remove":
                    System.out.println("Enter index: ");
                    aquarium.remove(Integer.parseInt(scanner.nextLine()));
                    break;

                case "change":
                    System.out.println("What do you want to change?: Age, Size");
                    String change = scanner.nextLine();
                    switch (change.toLowerCase()) {
                        case "age":
                            System.out.println("Enter index: ");
                            int index1 = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter new age: ");
                            int newAge = Integer.parseInt(scanner.nextLine());
                            aquarium.changeAge(index1, newAge);
                            break;

                        case "size":
                            System.out.println("Enter index: ");
                            int index2 = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter new size: ");
                            int newSize = Integer.parseInt(scanner.nextLine());
                            aquarium.changeSize(index2, newSize);
                            break;
                    }
                    break;

                case "print all":
                    aquarium.printAllSpecies();
                    break;

                case "exit":
                    flag = false;
                    System.out.println("Bye bye");
                    break;

                default:
                    System.out.println("There is no such action, please try again.");
                    break;
            }
        }
    }
}