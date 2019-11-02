package ejercicio7.proxy;

import java.util.ArrayList;
import java.util.List;

public class ServidorSecundario{
    private List<String> logs;

    public ServidorSecundario(){
        logs = new ArrayList<>();
    }

    public void addLog(String log){
        logs.add(log);
    }

    public void printLogs(){
        System.out.println("Logs:");
        for(String log : logs){
            System.out.println(log);
        }
    }
}
