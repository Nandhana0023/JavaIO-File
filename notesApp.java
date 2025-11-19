import java.io.*;
import java.util.Scanner;

public class notesApp {

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Notes Manager ---");
            System.out.print("1. Write Notes\n2. Read Notes\n3. Exit\nEnter choice: ");
            int choice = z.nextInt();
            z.nextLine(); 

            switch (choice) {

                case 1:  
                    System.out.print("Enter file name: ");
                    String writeFile = z.nextLine();

                    System.out.println("Enter notes (type 'N' to stop):");
                    try {
                        FileWriter fw = new FileWriter(writeFile, true); // append mode
                        while (true) {
                            String line = z.nextLine();
                            if (line.equalsIgnoreCase("N")) break;
                            fw.write(line + "\n");
                        }
                        fw.close();
                        System.out.println("Notes saved successfully!");
                    } catch (Exception e) {
                        System.out.println("Error writing to file!");
                    }
                    break;

                case 2: 
                    System.out.print("Enter file name: ");
                    String readFile = z.nextLine();

                    try {
                        BufferedReader br = new BufferedReader(new FileReader(readFile));
                        String line;
                        System.out.println("\n--- File Content ---");
                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }
                        br.close();
                    } catch (Exception e) {
                        System.out.println("Error reading file!");
                    }
                    break;

                case 3:
                    System.out.println("Exiting ... Thank you!");
                    z.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

