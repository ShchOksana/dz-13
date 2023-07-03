package utils;

import com.rd.person.Man;
import com.rd.person.Person;
import com.rd.person.Woman;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBReader {
    private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
    private final static String USER_NAME = "postgres";
    private final static String USER_PASSWORD = "postgres";
    private final static String QUERY_MAN = "select * from Persons where gender = 'M'";
    private final static String QUERY_WOMAN = "select * from Persons where gender = 'W'";

    public static List<Person> getPersonFromDB() {
        List<Person> personList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD)) {
            Statement sqlStatement = connection.createStatement();
            ResultSet resultSetMan = sqlStatement.executeQuery(QUERY_MAN);
            ResultSet resultSetWoman = sqlStatement.executeQuery(QUERY_WOMAN);
            while (resultSetMan.next()) {
                Man man = new Man(
                        resultSetMan.getString("firstName"),
                        resultSetMan.getString("lastName"),
                        resultSetMan.getInt("age"));
                personList.add(man);
            }
 /*           while (resultSetWoman.next()){
                Woman woman = new Woman(
                        resultSetMan.getString("firstName"),
                        resultSetMan.getString("lastName"),
                        resultSetMan.getInt("age"));
                personList.add(woman);
            }

  */
        } catch (SQLException exception) {
            throw new RuntimeException(String.format("Please check connection string" +
                    ". URL [%s], name [%s], pass [%s] ", URL, USER_NAME, USER_PASSWORD));
        }
        return personList;
    }

    public static void main(String[] args) {
        List<Person> personFromDB = getPersonFromDB();
        for (Person p :
                personFromDB) {
            System.out.println(p.getLastName());
        }
    }
}
