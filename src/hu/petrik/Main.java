package hu.petrik;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static FileReader fr;
    public static BufferedReader bf;

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

        List<Bejegyzes> bejegyzesLista = new ArrayList<>();



        try {
            fr = new FileReader("bejegyzesek.txt");
            bf = new BufferedReader(fr);
            String sor = bf.readLine();
            while(sor != null){
                String[] adatok = sor.split(";");
                bejegyzesLista.add(new Bejegyzes(adatok[0], adatok[1]));
                sor = bf.readLine();
            }
            bf.close();
            fr.close();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }









    }
}