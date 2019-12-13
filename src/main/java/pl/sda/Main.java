package pl.sda;

import pl.sda.utils.MySqlDriver;
import pl.sda.utils.ResultSetProcessor;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {

//        PgDriver driver = new PgDriver();

        Connection connection = MySqlDriver.createConnection();

//        SimpleStatement simpleStatement = new SimpleStatement(connection);
//
//        System.out.println("Insert new value");
//        int createdValues = simpleStatement.updateStatement("INSERT INTO authors (first_name, last_name)VALUES ('Jan', 'Drugi');");
//        System.out.println("Rows updated: " + createdValues);
//
//        simpleStatement.closeConnection();

//        PostgreSql

//        Get all values from table
        System.out.println("Get all values from table");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM citizens.persons");
//        resultSet.updateRow();
        ResultSetProcessor rp = new ResultSetProcessor(resultSet);
        rp.processResultSet();

        connection.close();
        /*
        //Insert new value
        System.out.println("Insert new value");
        int createdValues = simpleStatement.updateStatement("INSERT INTO public.\"AUTHORS\"(first_name, last_name)VALUES ('Bogumił', 'Jedyny');");
        System.out.println("Rows updated: " + createdValues);

        //Update value and show results
        System.out.println("Update value ");
        int updatedRows = simpleStatement.updateStatement("UPDATE public.\"AUTHORS\" SET last_name = 'Konieczny' WHERE id=9");
        System.out.println("Rows updated: " + updatedRows);


        //Delete and show results
        System.out.println("Delete and show results");
        int deletedRows = simpleStatement.updateStatement("DELETE FROM public.\"AUTHORS\" WHERE id=9");
        System.out.println("Rows deleted: " + deletedRows);
*/




//        String query = "SELECT * FROM Foo";
//        String query = "SELECT * FROM public.\"BOOKS_BY_AUTHOR\"";
//        String query = "INSERT INTO public.\"AUTHORS\"(first_name, last_name)VALUES ('Zygmunt', 'Zmęczony');";
//        String query = "\tselect * from public.\"BOOKS\" join public.\"BOOKS_BY_AUTHOR\" using (issbn)";


//        Statement statement = connection.createStatement();



//        ResultSet updateSet = statement.executeQuery(query);
//
//        while ((updateSet.next())){
//            System.out.println(updateSet.getMetaData().getTableName(1));
//        }


//        while (updateSet.next()){
//            System.out.println("id: " + updateSet.getString(1)+", imie: "+updateSet.getString(2)+", nazwisko: "+updateSet.getString(3) );
//            System.out.println(updateSet.getString(4));
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your nationality: ");
//        String nationality = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.println("Nationality: " +nationality + " ,age:  "+age);
    }
}
