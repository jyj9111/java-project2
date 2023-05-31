package com.example.javaproject2.week7.day3;

import com.example.javaproject2.week7.day3.model.BaseDAO;
import com.example.javaproject2.week7.day3.model.Person;
import com.example.javaproject2.week7.day3.model.PersonDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DBMain {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        personDAO.initPerson();
        System.out.println(personDAO.insertPerson("leo"));
        System.out.println(personDAO.insertPerson("yui"));
        List<Person> personList =personDAO.findAllPerson();
        System.out.println(personList.toString());
        //System.out.println(personDAO.findByNamePerson("leo"));
    }
}