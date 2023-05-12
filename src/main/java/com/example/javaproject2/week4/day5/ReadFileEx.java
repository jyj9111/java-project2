package com.example.javaproject2.week4.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {
    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName, Charset.forName("EUC-KR")));

        String line;

        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        return lines;
    }

    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for(String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }
    public static void main(String[] args) throws IOException {
        ReadFileEx readFileEx = new ReadFileEx();
        List<String> strLines = readFileEx.getLines("hospital_info_0920.csv");
        List<Hospital> parseHospital = readFileEx.getHospitals(strLines);
        System.out.println(parseHospital.get(0));
    }
}

