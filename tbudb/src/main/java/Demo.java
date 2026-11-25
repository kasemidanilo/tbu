import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {


    public static void main(String[] args){

        String url = "jdbc:mysql://localhost:3306/tbu";
        String username = "root";
        String password = "root";

        List<Users> usersList = new ArrayList<>();

        try(Connection conn = DriverManager.getConnection(url, username, password)) {

            String query = "Select * from tbu_users;";

            PreparedStatement statement = conn.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery(query);


            while (resultSet.next()){

                usersList.add(

                        new Users(resultSet.getInt("id"),
                                resultSet.getString("username"),
                                resultSet.getString("password"))

                );

            }


            System.out.println();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
