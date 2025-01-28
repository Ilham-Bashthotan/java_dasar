package ilham.application;

import ilham.data.City;
// import ilham.data.Location;

public class locationApp {
    public static void main(String[] args) {
        // var location = new Location(); //  ERROR
        var ctiy = new City();
        ctiy.name = "Bekasi";
        System.out.println(ctiy.name);
    }
}
