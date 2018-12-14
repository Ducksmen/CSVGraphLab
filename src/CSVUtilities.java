import javafx.application.Application;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVUtilities
{
    public static List<InfantData> fromCSV(){

        List<InfantData> z = new ArrayList<>();
        Path pathToFile = Paths.get("src/Infant_Mortality.csv");

        try(BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)){
            String line = br.readLine();
            line = br.readLine();
            while(line != null){
                String[] attributes = line.split(",");

                InfantData temp = findDeath(attributes);

                z.add(temp);
                line = br.readLine();
            }

        } catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        return z;
    }
    private static InfantData findDeath(String[] metadata)
    {
        int year = Integer.parseInt(metadata[0]);
        String race = metadata[1];
        double imr = Double.parseDouble(metadata[2]);
        double nmr = Double.parseDouble(metadata[3]);
        double pnmr = Double.parseDouble(metadata[4]);
        int id = Integer.parseInt(metadata[5]);
        int nid = Integer.parseInt(metadata[6]);
        int pnid = Integer.parseInt(metadata[7]);
        int livebirths = Integer.parseInt(metadata[8]);
        return new InfantData(race,imr,nmr,pnmr,id,nid,pnid,livebirths,year);
    }
}
