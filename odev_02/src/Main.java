import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> platformList = new ArrayList<>();
        ArrayList<String> categoryList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        boolean isTrue = true;

        do {
            // Kullanıcı seçimi.
            System.out.println("Welcome to Java Cinema!\nAdmin Login: 1 - Client Login: 2 - Exit: 0");
            int user = input.nextInt();

            switch (user) {
                // Admin kullanıcı ekranı oluşturma.
                case 1:
                    System.out.println("Add Platform: 1\nAdd Category: 2\nAdd Film: 3");
                    int adminControl = input.nextInt();

                    switch (adminControl) {

                        case 1:
                            // Yeni platform ekleme ekranı.
                            input.nextLine();
                            System.out.println("Enter a platform name: ");
                            String newPlatformName = input.nextLine();
                            platformList.add(newPlatformName);
                            break;

                        case 2:
                            // Yeni kategori ekleme ekranı.
                            input.nextLine();
                            System.out.println("Enter a category name: ");
                            String newCategoryName = input.nextLine();
                            categoryList.add(newCategoryName);
                            break;


                    }
            }


        } while(isTrue);
    }
}