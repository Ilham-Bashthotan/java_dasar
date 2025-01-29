package app;

import error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        // tidak disarankan try catch
        connectDatabase("Ilham", null);
        System.out.println("sukses");
    }
    public static void connectDatabase(String username, String pass) {
        if (username == null || pass == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
