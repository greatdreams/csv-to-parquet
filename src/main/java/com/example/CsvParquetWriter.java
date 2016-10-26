package com.example;

import org.apache.parquet.hadoop.ParquetWriter;
import org.apache.parquet.hadoop.api.WriteSupport;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by greatdreams on 10/24/16.
 */
public class CsvParquetWriter extends ParquetWriter<List<String>> {
    public CsvParquetWriter(org.apache.hadoop.fs.Path file, WriteSupport<List<String>> writeSupport) throws IOException {
        super(file, writeSupport);
    }
}
