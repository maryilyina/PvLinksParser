import com.axway.ats.expectj.*;

import java.io.*;
import java.lang.*;

public class PvReader {
    public PvReader (){
    }

    public void ReadPv(){

        ExpectJ expectinator = new ExpectJ(5);
        try{
            Spawn pult6connect = expectinator.spawn(new SshSpawn("vepp4-pult6",22,"vepp4","vepp4vepp4"));
            //pult6connect.send("vepp4@vepp4-pult6\r");
            //pult6connect.expect("password:",false);
            //pult6connect.send("vepp4vepp4\r");
            //pult6connect.expect("%",false);
            pult6connect.send("v4bpmd telnet stap\r");
            pult6connect.send("dbDumpRecord\r");
            System.out.print("Output->"+pult6connect.getCurrentStandardOutContents());
            //pult6connect.expect("%",false);
            try{
                pult6connect.expectClose();
            }catch(TimeoutException|ExpectJException e){

            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }



    }
}
