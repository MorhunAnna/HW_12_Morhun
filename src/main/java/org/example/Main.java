package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        StringBuilder csv = new StringBuilder();

        System.out.println("Enter text:");

        while (true)
        {
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("end"))
            {
                break;
            }
            if (input.equalsIgnoreCase("next"))
            {
                csv.append("\n");
            }
            else
            {
                csv.append(input);
            }
        }

        try (FileWriter writer = new FileWriter("file.csv")) {
            writer.write(csv.toString());
            System.out.println("CSV file was create");
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}