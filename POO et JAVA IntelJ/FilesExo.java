package fr.training.samples.spring.shop.application.epita.javaapi.exeolist;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class FilesExo {

    private static final String FILE_PATH = "C:\\tmp\\fileexo\\article.txt";
    private static final String FILE_OUTPUT_RESULT_PATH = "C:\\tmp\\fileexo\\occurrence.txt";
    static int nbrTotale = 0;

    public static void main(String[] args) {

        createFileIfExists(FILE_PATH);
        try {
            Map<String, Integer> occurences = getOccurences(FILE_PATH);
            printOutputResultFile(occurences, FILE_OUTPUT_RESULT_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void printOutputResultFile(Map<String, Integer> occurences, String fileOutPutPath) throws IOException{
        Path path = Paths.get(fileOutPutPath);
        Files.delete(path);
        Files.createFile(path);

        occurences.forEach(new BiConsumer<String, Integer>() {

            @Override
            public void accept(String term, Integer nbrOccurence) {
                nbrTotale = nbrTotale + nbrOccurence;
                String line = "term: " + term + "; nbr occurence: " + nbrOccurence + "\n";
                try {
                    Files.writeString(path, line, StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        try {
            Files.writeString(path, "nbrTotale de mots: " + nbrTotale, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Integer> getOccurences(String filePath) throws IOException{
        Map<String, Integer> occurences = new HashMap<>();
        Path fichier = Paths.get(FILE_PATH);
        List<String> lignes = Files.readAllLines(fichier);
        for(String line : lignes){
            // La petite pomme s’ennuie     // de n'être pas encore ceuillie  // Les grosses pomme sont parties
            String[] terms = line.split(" ");
            for(String term : terms){
                int currentOccurence = occurences.getOrDefault(term, 0);
                occurences.put(term, ++currentOccurence);
            }
        }
        return occurences;
    }


    public static void createFileIfExists(String nomFichier){
        Path path = Paths.get(nomFichier);
        if (!Files.exists(path)){
            try {
                Files.createFile(path);
                Files.writeString(path, "La petite pomme s’ennuie\n", StandardOpenOption.APPEND);
                Files.writeString(path, "De n’être pas encore cueillie\n" , StandardOpenOption.APPEND);
                Files.writeString(path, "Les grosses pomme sont parties\n" , StandardOpenOption.APPEND);
                Files.writeString(path, "Petite pomme est sans amie\n" , StandardOpenOption.APPEND);
                Files.writeString(path, "Comme il fait froid dans cet automne !\n" , StandardOpenOption.APPEND);
                Files.writeString(path, "Les jours sont courts ! Il va pleuvoir\n" , StandardOpenOption.APPEND);
                Files.writeString(path, "Comme on a peur au verger noir\n" , StandardOpenOption.APPEND);
                Files.writeString(path, "quand on est seule et qu’on est pomme\n" , StandardOpenOption.APPEND);
                Files.writeString(path, "Je n’en puis plus, viens me cueillir\n" , StandardOpenOption.APPEND);
                Files.writeString(path, "Tu viens me cueillir, Isabelle\n" , StandardOpenOption.APPEND);
                Files.writeString(path, "Comme c’est triste de vieillir\n" , StandardOpenOption.APPEND);
                Files.writeString(path, "Quand on est pomme et qu’on est belle\n" , StandardOpenOption.APPEND);
                Files.writeString(path, "Prends moi doucement dans ta main\n" , StandardOpenOption.APPEND);
                Files.writeString(path, "Mais fais-moi vivre une journée\n" , StandardOpenOption.APPEND);
                Files.writeString(path, "Bien au chaud sur ta cheminée\n" , StandardOpenOption.APPEND);
                Files.writeString(path, "Et tu me mangeras demain\n" , StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

}
