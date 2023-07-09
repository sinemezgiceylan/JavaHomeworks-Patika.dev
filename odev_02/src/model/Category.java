package model;

import java.util.ArrayList;

public class Category {

    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    //Eklenen kategorileri ekrana listeleme
    public void categoryNumber(ArrayList<String> num) {
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i) + ": " + (i + 1));
        }
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                '}';
    }
}
