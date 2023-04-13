import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    
    private ArrayList<String> tasks;

    public TodoList() {
        tasks = new ArrayList<String>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        tasks.remove(index);
    }

    public void printTasks() {
        if (tasks.size() == 0) {
            System.out.println("No tasks in the list");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i+1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        
        while (!input.equals("exit")) {
            System.out.println("Enter a command: (add, remove, print, exit)");
            input = scanner.nextLine();

            switch(input) {
                case "add":
                    System.out.println("Enter a task:");
                    String task = scanner.nextLine();
                    todoList.addTask(task);
                    break;
                case "remove":
                    System.out.println("Enter the task number:");
                    int index = Integer.parseInt(scanner.nextLine()) - 1;
                    todoList.removeTask(index);
                    break;
                case "print":
                    todoList.printTasks();
                    break;
                case "exit":
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
        scanner.close();
    }
}
