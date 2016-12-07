package BoltovIgnat;
import java.util.*;
import java.io.*;


public class Sort {

	public static void main(String[] args) {
		BufferedReader br;
        FileWriter fw;
        BufferedWriter bw;
        String line;
        System.out.println("!"+args[0]);
        
        List<String> tsString = new ArrayList<String>();
        List<Integer> tsInt = new ArrayList<Integer>();
        
        String agrs2 ="";
        String agrs3 ="";
        for(int i = 0; i <= args[2].length() - 1; i++) {
        	agrs2 = agrs2+args[i];
        }
        for(int i = 0; i <= args[3].length() - 1; i++) {
        	agrs3 = agrs2+args[i];
        }
        
        try
          {
            br = new BufferedReader(new FileReader(args[0]));
            while ((line =br.readLine()) != null)
            {
            	if(agrs2 == "-i"){
            		tsInt.add(Integer.valueOf(line));
            	}else{
            		tsString.add(line);
            	}
            }
            
            if(agrs3 == "-a"){
            	if(agrs2 == "-i"){
            		Collections.sort(tsInt);
            	}else{
            		Collections.sort(tsString);
            	}
        	}else{
        		if(agrs2 == "-i"){
            		Collections.sort(tsInt);
            	}else{
            		Collections.sort(tsString);
            	}
        	}
            
            Iterator it = tsString.iterator();
            fw = new FileWriter(args [1]);
            bw = new BufferedWriter(fw);
            while(it.hasNext())
            {
              bw.write((String)it.next());
              bw.newLine();
            }
          bw.close();
          fw.close();
           }
         catch(Exception e)
         {
           System.out.println("Error in process");
         }
       }

	}
