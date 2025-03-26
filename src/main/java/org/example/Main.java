package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void scriere(List<PerecheNumere>perechi) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        File f=new File("src/main/resources/perechi.json");
        mapper.writeValue(f, perechi); //functionalitati de baza pentru citire si scriere fisiere JSON
    }
    public static List<PerecheNumere> citire() throws IOException {
        File f=new File("src/main/resources/perechi.json");
        ObjectMapper mapper=new ObjectMapper();
        List<PerecheNumere> p=mapper.readValue(f, new TypeReference<List<PerecheNumere>>(){});
        return p;
    }
    public static void main(String[] args) throws IOException {
        List<PerecheNumere>perechi=citire();

        System.out.println(perechi);

       perechi.forEach(System.out::println);

       perechi.add(new PerecheNumere(1,2));
       scriere(perechi);

    }
}