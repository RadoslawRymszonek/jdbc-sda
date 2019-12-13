package pl.sda.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class SimpleStatement {
    private Connection connection;

    SimpleStatement(Connection connection) {
        this.connection = connection;
    }


    void insertQueryOld(String insert) {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeQuery(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    ResultSet getAllFromTable(String table) {
        ResultSet resultSet = null;

        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM public." + table);
            resultSet.updateRow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    int updateStatement(String sqlInput) {
        int out = 0;

        try (Statement statement = connection.createStatement()) {
            out = statement.executeUpdate(sqlInput);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return out;
    }


    void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
