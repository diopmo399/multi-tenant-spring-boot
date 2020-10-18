package com.amran.dynamic.multitenant.util;

import org.apache.ibatis.jdbc.ScriptRunner;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public interface InitializeDB {

    default public void initializeDB(String nomInit){
        nomInit = nomInit + "_db";
        String script = "C:\\Users\\DIOP\\Documents\\Intellij_Project\\" +
                "Dynamic-Multi-Tenancy-Using-Java-Spring-Boot-Security-JWT-Rest-API-MySQL-Postgresql-full-example-master" +
                "\\dynamicmultitenant\\src\\main\\resources\\script.sql";
        List<String> lines = new ArrayList<>();
        String line = null;


        {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(script));

                //scriptRunner.runScript(bufferedReader);

                while ((line = bufferedReader.readLine()) != null) {
                    if (line.contains(nomInit))
                        line = line.replace(nomInit ,"nomdb");
                    lines.add(line);
                }

                FileWriter fw = new FileWriter(script);
                BufferedWriter out = new BufferedWriter(fw);
                for(String s : lines) {
                    s = s + "\n";
                    out.write(s);
                }
                out.close();
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
