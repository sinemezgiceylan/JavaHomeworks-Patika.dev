package model;

import java.util.ArrayList;
import java.util.List;

public class Platform {

    private String platformName;

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    //Eklenen platformları ekrana listeleme
    public void platformNumber(ArrayList<String> num) {
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i) + ": " + (i + 1));
        }
    }


    @Override
    public String toString() {
        return "Platform{" +
                "platformName='" + platformName + '\'' +
                '}';
    }
}
