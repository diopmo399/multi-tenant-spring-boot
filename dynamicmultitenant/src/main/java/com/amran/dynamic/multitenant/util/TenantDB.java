package com.amran.dynamic.multitenant.util;

import org.apache.ibatis.jdbc.ScriptRunner;

import java.io.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface TenantDB {

    public default void creatNewTenant(String nomdb) {
        nomdb = nomdb + "_db";
        String script = "C:\\Users\\DIOP\\Documents\\Intellij_Project\\" +
                "Dynamic-Multi-Tenancy-Using-Java-Spring-Boot-Security-JWT-Rest-API-MySQL-Postgresql-full-example-master" +
                "\\dynamicmultitenant\\src\\main\\resources\\script.sql";
        ScriptRunner scriptRunner;
        List<String> lines = new ArrayList<>();
        String line = null;


        {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(script));

                scriptRunner = new ScriptRunner(
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/master_db?" +
                                "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=" +
                                "false&serverTimezone=UTC&useSSL=false", "root" , ""));
                //scriptRunner.runScript(bufferedReader);

                while ((line = bufferedReader.readLine()) != null) {
                    if (line.contains("nomdb"))
                        line = line.replace("nomdb", nomdb);
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
                scriptRunner.runScript(new BufferedReader(new FileReader(script)));
                scriptRunner.closeConnection();

            } catch (SQLException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
