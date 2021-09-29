package hu.petrik;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now.format(formatter));
        LocalDateTime egyik = LocalDateTime.parse("2021-09-25 15:03:15",formatter);
        LocalDateTime masik = LocalDateTime.parse("2021-09-25 15:03:15",formatter);
        LocalDateTime harmadik = LocalDateTime.parse("2021-09-25 15:20:15",formatter);
        if (egyik.equals(masik)){
            System.out.println("Ugyan az az időpont");
        }else {
            System.out.println("Nem");
        }

        if (egyik.equals(harmadik)){
            System.out.println("Ugyan az az időpont");
        }else {
            System.out.println("Nem egyezik");
        }

    }
}