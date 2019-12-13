package pl.sda.utils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetProcessor {
    private ResultSet resultSet;

    public ResultSetProcessor(ResultSet resultSet) {
        this.resultSet = resultSet;
    }


    public void processResultSet() throws SQLException {

        ResultSetMetaData metaData = resultSet.getMetaData();

        int columnCount = metaData.getColumnCount();
        String columnData;


        System.out.println(metaData.getTableName(1));

        for (int i = 1; i <= columnCount; i++) {
            System.out.print(metaData.getColumnName(i) + " ");
        }

        System.out.println();
        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {

                if (resultSet.getObject(i) != null) {
                    columnData = resultSet.getObject(i).toString();
                } else {
                    columnData = "NULL";
                }
                System.out.print(columnData + " ");
            }

            System.out.println();
        }

        resultSet.close();
    }

}
