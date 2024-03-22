import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        ArrayList <String> serieA;
        serieA = new ArrayList<>();
        int golFatti, golSubiti, partiteVinte, partitePareggiate, partitePerse;
        String nome;
        String squadr;

        File file = new File("Recupero/serieA.csv");

        try{
            Scanner fileReader = new Scanner(file);
            Scanner newSquadra = new Scanner(System.in);

            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] data = line.split(";");
                nome = data[0];
                golFatti = Integer.parseInt(data[1]);
                golSubiti = Integer.parseInt(data[2]);
                partiteVinte = Integer.parseInt(data[3]);
                partitePareggiate = Integer.parseInt(data[4]);
                partitePerse = Integer.parseInt(data[5]);
                serieA.add(new Squadra(nome, golFatti, golSubiti, partiteVinte, partitePareggiate, partitePerse));
            }
		        for(Squadra squadra : serieA){
                    System.out.println("Inserisci nome squadra: " + nome);
                    if (nome == squadra.nome) {
                        System.out.println("\nnome: " + nome + "\ngolFatti: " + golFatti + "\ngolSubiti: " + golSubiti + "\npartiteVinte: " + partiteVinte + "\npartitePareggiate: " + partitePareggiate + "\npartitePerse: " + partitePerse);
                    }
                }

            fileReader.close();
        } catch (Exception e){
            System.out.println("Errore nella lettura del file serieA.csv");
            e.printStackTrace();
        }

    }
}
