// package controller;

import javax.swing.JOptionPane;
import model.classess.User;

public class UserController {

    public static User[] getUsers() {
        return new User[]{
            new User("John Doe", "Jl. A No.1", "1 Januari 1990", "081234567890"),
            new User("Jane Smith", "Jl. B No.2", "5 Februari 1985", "081234567891"),
            new User("Mark Johnson", "Jl. C No.3", "15 Maret 1988", "081234567892"),
            new User("Emily Davis", "Jl. D No.4", "25 Juni 1992", "081234567893"),
            new User("Michael Brown", "Jl. E No.5", "10 Oktober 1980", "081234567894")
        };
    }

    public static void PrintUserData() {
        String nama = JOptionPane.showInputDialog("Masukkan nama user:");

        User[] users = getUsers();
        User foundUser = null;
        
        for (User user : users) {
            if (user.getNama().equalsIgnoreCase(nama)) {
                foundUser = user;
                break;
            }
        }

        if (foundUser != null) {
            JOptionPane.showMessageDialog(
                null,
                "Nama: " + foundUser.getNama() + "\nAlamat: " + foundUser.getAlamat() +
                "\nTTL: " + foundUser.getTtl() + "\nTelepon: " + foundUser.getTelepon()
            );
        } else {
            JOptionPane.showMessageDialog(
                null,
                "User dengan nama " + nama + " tidak ditemukan."
            );
        }
    }

    public static void main(String[] args) {
        PrintUserData();
    }
}
