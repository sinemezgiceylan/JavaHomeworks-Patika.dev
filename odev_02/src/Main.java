import model.Category;
import model.Film;
import model.Platform;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> platformList = new ArrayList<>();
        ArrayList<String> categoryList = new ArrayList<>();

        ArrayList<Platform> tempPlatformList = new ArrayList<>();
        ArrayList<Category> tempCategoryList = new ArrayList<>();

        List<Film> filmList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        boolean isTrue = true;

        do {
            // Kullanıcı seçimi
            System.out.println("Welcome to Java Cinema!\nAdmin Login: 1 - Client Login: 2 - Exit: 0");
            int user = input.nextInt();

            switch (user) {
                // Admin kullanıcı ekranı oluşturuldu
                case 1:
                    System.out.println("Add Platform: 1\nAdd Category: 2\nAdd Film: 3");
                    int adminControl = input.nextInt();

                    switch (adminControl) {

                        case 1:
                            // Yeni platform ekleme ekranı oluşturuldu
                            input.nextLine();
                            System.out.println("Enter a platform name: ");
                            String newPlatformName = input.nextLine();
                            platformList.add(newPlatformName);
                            System.out.println("Platform added");

                            while(true) {
                                System.out.println("Do you want to add another platform? (Yes: 1/No: 2): ");
                                int answer = Integer.parseInt(input.nextLine());
                                if (answer == 1) {
                                    System.out.println("Enter a platform name: ");
                                    String anotherPlatformName = input.nextLine();
                                    platformList.add(anotherPlatformName);
                                    System.out.println("Platform added");
                                } else if (answer == 2) {
                                    break;
                                } else {
                                    System.out.println("Incorrect entry!");
                                    break;
                                }
                            }
                            break;

                        case 2:
                            // Yeni kategori ekleme ekranı oluşturuldu
                            input.nextLine();
                            System.out.println("Enter a category name: ");
                            String newCategoryName = input.nextLine();
                            categoryList.add(newCategoryName);
                            System.out.println("Category added");

                            while(true) {
                                System.out.println("Do you want to add another category? (Yes: 1/No: 2): ");
                                int answer = Integer.parseInt(input.nextLine());
                                if (answer == 1) {
                                    System.out.println("Enter a category name: ");
                                    String anotherPlatformName = input.nextLine();
                                    platformList.add(anotherPlatformName);
                                    System.out.println("Category added");
                                } else if (answer == 2) {
                                    break;
                                } else {
                                    System.out.println("Incorrect entry!");
                                    break;
                                }
                            }
                            break;

                        case 3:
                            // Yeni film ekleme ekranı oluşturuldu
                            System.out.println("Choice a platform: ");
                            Platform newPlatform = new Platform();
                            newPlatform.platformNumber(platformList);
                            int platformNum = input.nextInt();
                            input.nextLine();

                            System.out.println("Choice a category: ");
                            Category newCategory = new Category();
                            newCategory.categoryNumber(categoryList);
                            int categoryNum = input.nextInt();
                            input.nextLine();

                            System.out.println("Enter a film name: ");
                            String filmName = input.nextLine();

                            System.out.println("Enter a film year: ");
                            int filmYear = Integer.parseInt(input.nextLine());

                            System.out.println("Enter a director: ");
                            String filmDirector = input.nextLine();

                            System.out.println("Enter a film duration: ");
                            int filmRunTime = Integer.parseInt(input.nextLine());


                            System.out.println("Enter a film showtime: ");
                            String filmShowTime = input.nextLine();

                            System.out.println("Enter a IMDB point: ");
                            double filmImdbPoint = Double.parseDouble(input.nextLine());

                            // Film özellikleri eklendi

                            Film newFilm = new Film(filmName,filmYear,filmDirector,filmRunTime,filmShowTime,filmImdbPoint);

                            newPlatform.setPlatformName(platformList.get(platformNum - 1));
                            tempPlatformList.add(newPlatform);
                            newFilm.setPlatformArrayList(tempPlatformList);

                            newCategory.setCategoryName(categoryList.get(categoryNum - 1));
                            tempCategoryList.add(newCategory);
                            newFilm.setCategoryArrayList(tempCategoryList);

                            filmList.add(newFilm);
                            System.out.println("Film added.");

                            break;
                    }

            }


        } while(isTrue);
    }
}