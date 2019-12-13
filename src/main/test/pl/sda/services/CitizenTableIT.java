package pl.sda.services;

import org.junit.jupiter.api.*;
import pl.sda.models.Person;
import pl.sda.utils.MySqlDriver;

import java.sql.*;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CitizenTableIT {


    private final Connection connection = MySqlDriver.createConnection();

    private Statement statement;


    @BeforeEach
    void setUp() throws SQLException {
        statement = connection.createStatement();
    }

    @AfterEach
    void tearDown() throws SQLException {
        connection.close();
        statement.close();
    }

    @Order(1)
    @Test
    @Timeout(5)
    void checkConnectionWithDataBase() throws SQLException {
    }

    @Order(2)
    @Test
    void addNewPerson() throws SQLException {
    }

    @Order(3)
    @Test
    void getPersonByIdSimpleQuery() throws SQLException {
    }


    @Order(4)
    @Test
    void getPersonByIdBindingQuery() throws SQLException {
    }

    @Order(5)
    @Test
    void addNewPhoneToPerson() throws SQLException {
    }

    @Order(6)
    @Test
    void modifyModelOfPhone() throws SQLException {
    }

    @Order(7)
    @Test
    void getAllPersonsAndParseToListOfObjects() throws SQLException {
    }

    @Order(8)
    @Test
    void getListOfPhonesByPerson() throws SQLException {
    }


    @Order(9)
    @Test
    void removeOnePersonAndRelatedPhone() throws SQLException {
    }
}