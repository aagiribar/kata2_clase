package software.ulpgc.kata2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvFileLaptopLoader implements CustomerLoader {
    private final File file;

    public CsvFileLaptopLoader(File file) {
        this.file = file;
    }

    @Override
    public List<Laptop> load() {
        List<Laptop> customers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.readLine();
            while (true) {
                String line = reader.readLine();
                if(line == null) break;
                customers.add(toCustomer(line));
            }
        } catch (IOException e) {
        }
        return customers;
    }

    private Laptop toCustomer(String line) {
        return toCustomer(line.split(","));
    }

    private Laptop toCustomer(String[] fields) {
        return new Laptop(
                fields[0],
                fields[1],
                fields[2],
                fields[3],
                fields[4],
                fields[5],
                fields[6],
                fields[7],
                fields[8],
                fields[9],
                fields[10],
                fields[11],
                fields[12]
        );
    }
}
