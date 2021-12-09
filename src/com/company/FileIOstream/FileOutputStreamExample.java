package com.company.FileIOstream;

import java.nio.charset.StandardCharsets;

// Stream itself means "stream of bytes of data"

public class FileOutputStreamExample {
    public FileOutputStreamExample(String s) {
    }

    public static void main(String[]args){
        try{
            java.io.FileOutputStream fr = new java.io.FileOutputStream("/home/vasu/IdeaProjects/javaPrograms/src/com/company/text.txt");
            String st = "Hello I am vasu Rastogi.";

            byte [] sttb = st.getBytes(StandardCharsets.UTF_8); // only byte array is supported in write fn of fileOutputStream.

            fr.write(sttb);
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}

    }
}