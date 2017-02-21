package File_to_net;

import java.io.IOException;
import  java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by suffee on 2017/2/20.
 */
public class File_to_net {


    private int Size_Of_File;
    private FileOutputStream file_Output;
    private FileInputStream file_Input;
    private Scanner input = new Scanner(System.in);


    private  void  openFile(){

        System.out.println("please input the file name of input.");

        try{

            file_Input =new FileInputStream(input.next());

            if(file_Input!=null)
                Size_Of_File = file_Input.available();

        }catch (IOException ioe){
            System.out.println("Input File Not found.");

        }

        System.out.println("please output the file name of input.");

        try{
            file_Output =new FileOutputStream(input.next());
        }catch (IOException ioe){
            System.out.println("Output File Not found.");

        }

    }


    private byte[] readFile(){


    byte[] data = new byte[Size_Of_File];


        try{
            file_Input.read(data);

        }catch (IOException ioe){

            System.err.println("Fine Cant't Read.");
        }
        return data;

    }

    private void writeFile(byte[] data){

        try{
            file_Output.write(data);

        }catch (IOException ioe){

            System.err.println("Fine Cant't Write.");
        }

    }

    private void closeFile(){

        try{

            file_Output.close();

        }catch (IOException ioe){

            System.err.println("Closing Output Error.");
            System.exit(1);
        }

        try{

            file_Input.close();

        }catch (IOException ioe){

            System.err.println("Closing Output Error.");
            System.exit(1);
        }


    }









}
