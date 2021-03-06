package com.rokt.filedemo.util;

import com.rokt.filedemo.entity.Rokt;
import com.rokt.filedemo.exception.FileStorageException;
import com.google.gson.Gson;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileUtil {

    public  static String uploadFiles(InputStream inputStream, String from, String to){
        Gson gson = new Gson();
        List list=new ArrayList<>();

        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        df.setTimeZone(tz);

        try{

            Date fromDate=df.parse(from);
            Date toDate=df.parse(to);

            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String str = br.readLine();

            while(str!=null){

                if(!str.equals("null")) {

                    String[] arr = str.split(" ");

                    Date eventTime = df.parse(arr[0]);

                    if (fromDate.compareTo(eventTime) * eventTime.compareTo(toDate) >= 0) {
                        Rokt bean = new Rokt(df.format(eventTime), arr[1], arr[2]);
                        list.add(bean);
                    }

                }
                str = br.readLine();
              }

            //order eventtime
            Collections.sort(list, new Comparator<Rokt>() {
                @Override

                public int compare(Rokt r1,Rokt r2){
                    return r1.getEventTime().compareTo(r2.getEventTime());
                }
            });

        } catch (IOException | ParseException ex) {
            throw new FileStorageException("Could not upload parse file", ex);
        }

        return gson.toJson(list);
    }
}
