package at.glu.Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Sorter> sorters = new ArrayList<>();
        sorters.add(new BubbleSort());
        sorters.add(new InsertionSort());
        sorters.add(new SelectionSort());

        System.out.println("Wählen Sie einen Sortieralgorithmus:");
        System.out.println("1: " + sorters.get(0).getName());
        System.out.println("2: " + sorters.get(1).getName());
        System.out.println("3: " + sorters.get(2).getName());
        System.out.println("0: Beenden");

        System.out.println("Input: ");
        int choice = scanner.nextInt();
        int[] data = {57, 4, 1, 42, 17, 12, 2};

        switch (choice) {
            case 0:
                System.out.println("Programm beendet");
                break;
            case 1:
                sorters.get(0).sort(data);
                break;
            case 2:
                sorters.get(1).sort(data);
                break;
            case 3:
                sorters.get(2).sort(data);
                break;
            default:
                System.out.println("Ungültig");
                break;
        }

        scanner.close();
    }
}
