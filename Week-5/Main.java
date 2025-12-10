import java.util.*;
import CIE.*;
import SEE.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Personal p[] = new Personal[n];
        Internals cie[] = new Internals[n];
        External see[] = new External[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Semester: ");
            int sem = sc.nextInt();

            int[] cieMarks = new int[5];
            System.out.println("Enter 5 CIE internal marks:");
            for (int j = 0; j < 5; j++)
                cieMarks[j] = sc.nextInt();

            int[] seeMarks = new int[5];
            System.out.println("Enter 5 SEE marks:");
            for (int j = 0; j < 5; j++)
                seeMarks[j] = sc.nextInt();

            p[i] = new Personal(usn, name, sem);
            cie[i] = new Internals(cieMarks);
            see[i] = new External(usn, name, sem, seeMarks);
        }

        System.out.println("\n\nFINAL MARKS OF STUDENTS:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("USN : " + p[i].usn);
            System.out.println("Name: " + p[i].name);
            System.out.println("Sem : " + p[i].sem);

            System.out.print("Final Marks (CIE+SEE): ");

            for (int j = 0; j < 5; j++) {
                int finalMarks = cie[i].internalMarks[j] + (see[i].seeMarks[j] / 2);
                System.out.print(finalMarks + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
