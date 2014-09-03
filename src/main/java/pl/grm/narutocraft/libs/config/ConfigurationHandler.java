package pl.grm.narutocraft.libs.config;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConfigurationHandler {

    private static ArrayList<String> lines = new ArrayList<String>();
    private File path;

    public static boolean printErrors = false;
    
    
    public ConfigurationHandler(File path) {
        this.path = path;
    }

    public void readConfig() {
        BufferedReader reader = getReader();
        if (reader == null) {
            writeConfig();
            return;
        }

        try {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().startsWith("#") || line.isEmpty()) continue;
                line = line.trim();
                lines.add(line);
                //MainClass.addID(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    public static List<String> getLines() {
        return Collections.unmodifiableList(lines);
    }

    private BufferedReader getReader() {
        try {
            FileInputStream fis = new FileInputStream(path);
            DataInputStream dis = new DataInputStream(fis);
            return new BufferedReader(new InputStreamReader(dis));
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    private void writeConfig() {
        try {
            FileWriter fw = new FileWriter(path, true);
            BufferedWriter writer = new BufferedWriter(fw);

            writer.write("# Format: <id>:<metadata>\n");
            writer.write("# If no metadata ");

            writer.close();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}