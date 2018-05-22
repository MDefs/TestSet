import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        MySet<Object> set = new MySet<Object>();

        System.out.println("******** MENU ********");
        System.out.println("1. Add data");
        System.out.println("2. Remove data");
        System.out.println("3. Check for existence");
        System.out.println("4. Show Data");
        System.out.println("0. Exit");

        int choice = 5;
        while (choice != 0) {
            System.out.println();
            System.out.println("Choose 1, 2, 3, 4 or 0");
            choice = Integer.parseInt(r.readLine());
            switch (choice) {
                case 1:
                    System.out.println("If you want to stop input, press \"Enter\"");
                    while (true) {
                        String s = r.readLine();
                        if (s.isEmpty()) break;
                        set.add(s);
                    }
                    System.out.println("Input stopped");
                break;
                case 2:
                    System.out.println("Input element to remove");
                    Object o = r.readLine();
                    set.remove(o);
                break;
                case 3:
                    System.out.println("Input element to check");
                    o = r.readLine();
                    set.contains(o);
                break;
                case 4:
                    set.show();
                break;
            }
        }

    }

}
