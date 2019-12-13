package pl.sda.services;

import pl.sda.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CitizenTable {

    public static Person convertOneRow(ResultSet citizenRow) throws SQLException {

        return null;
    }


    public static List<Person> conevertRows(ResultSet resultSet) throws SQLException {
        List<Person> persons = new ArrayList<>();

        if (Objects.nonNull(resultSet)) {
            while (resultSet.next()) {
                persons.add(convertOneRow(resultSet));
            }
        }
        return persons;
    }

}
