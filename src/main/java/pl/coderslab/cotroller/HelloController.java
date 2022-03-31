package pl.coderslab.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

@Controller
public class HelloController {

    @GetMapping ("/workers")

    public String showRandom(Model model ) throws Exception {
        File file = new File("/home/emil/Pulpit/Coders Lab/Homework_02/Workers.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        HashMap<Integer,String> workers = new HashMap<>();

        while ((st = br.readLine()) != null){
            String[] detrails = st.split(",");
            Integer nr = Integer.parseInt(detrails[0]);
            String worker = detrails[1];
            workers.put(nr, worker);
        }

        Random liczba = new Random();
        int los = liczba.nextInt(10)+1;

//        return "Wylosowano liczbę : " + los;

        model.addAttribute("worker", workers.get(los));
        System.out.println(workers.get(los));
        return "workers";
    }

}
