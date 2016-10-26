package com.example;

import org.apache.hadoop.fs.Path;
import org.apache.parquet.hadoop.api.WriteSupport;
import org.apache.parquet.schema.MessageType;
import org.apache.parquet.schema.MessageTypeParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/** the main class of the program
 *
 *@author greatdreams
 */
public class Hello {
    private static Logger LOGGER = LoggerFactory.getLogger(Hello.class);
    /** the entry method of the program
     * @param args application arguments
     */
    private final static String FILEINPATH= "/home/greatdreams/temp/students.csv";
    private final static String FILEOUTPATH= "/home/greatdreams/temp/students.parquet";
    private final static String SEPARATOR = ",";

    public static void main(String[] args) throws Exception {
        LOGGER.info("This application is build with the sbt tool");
        MessageType messageType = MessageTypeParser.parseMessageType(
                "message csv {required binary name = 1; \n" +
                "    required binary email = 2; }");
        WriteSupport<List<String>> writeSupport = new CsvWriteSupport(messageType);
        String line;
        Path outPath = new Path(FILEOUTPATH);
        try(CsvParquetWriter writer = new CsvParquetWriter(outPath, writeSupport);
                BufferedReader br = new BufferedReader(new FileReader(new File(FILEINPATH)))) {
            while((line = br.readLine()) != null) {
                String[] fields = line.split(Pattern.quote(SEPARATOR));
                writer.write(Arrays.asList(fields));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
