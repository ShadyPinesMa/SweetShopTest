package com.sweetshop.tests.utils;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;

public class CsvUtils {

    public static Object[][] getCsvData(String filePath) throws Exception {
        CSVReader reader = new CSVReader(new FileReader(filePath));

        List<String[]> csvData = reader.readAll();

        reader.close();

        List<Object[]> records = new ArrayList<>();

        // Skip header row
        for (int i = 1; i < csvData.size(); i++) {

            String[] row = csvData.get(i);

            records.add(new Object[] {
                    row[0],
                    row[1],
                    row[2],
                    row[3],
                    row[4],
                    row[5],
                    row[6],
                    row[7],
                    row[8],
                    row[9],
                    row[10]
            });
        }

        return records.toArray(new Object[0][]);
    }
}
