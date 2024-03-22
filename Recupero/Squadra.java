
public class Squadra {
    String nome;
    int golFatti;
    int golSubiti;
    int partiteVinte;
    int partitePareggiate;
    int partitePerse;

    public Squadra(String nome, int golFatti, int golSubiti, int partiteVinte, int partitePareggiate, int partitePerse) {
        this.nome = nome;
        this.golFatti = golFatti;
        this.golSubiti = golSubiti;
        this.partiteVinte = partiteVinte;
        this.partitePareggiate = partitePareggiate;
        this.partitePerse = partitePerse;
    }

    public int calcolaDifferenzaReti(){
        if(golFatti > golSubiti) {
            return golFatti - golSubiti;
        } else {
            System.out.println("Goal meno di quelli subiti");
        }
        return golFatti;
    }
    
    public int calcolaPunti() {
        //partiteVinte *3
        //partitePareggiate *2
        //partitePerse *1
        int punti = partiteVinte * 3 + partitePareggiate * 2 + partitePerse * 1;
        return punti;
    }
    
    public String toString() {
        String nome = "Inter";
        int punti = calcolaPunti();
        int differenzaReti = calcolaDifferenzaReti();
        return "Punti " + nome + ": " + punti + "\n Differenza Reti " + nome + ": " + differenzaReti + "\n";
    }
    
}


























