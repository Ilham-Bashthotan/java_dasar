package app;

import data.Application;
import static data.Constant.*;
import data.Country;
import util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);
        System.out.println(MathUtil.sum(1, 2, 3, 4, 5));
        Country.City city = new Country.City();
        city.setName("Bekasi");
        System.out.println(city.getName());
        System.out.println(Application.PROCESSORS);
    }
}
