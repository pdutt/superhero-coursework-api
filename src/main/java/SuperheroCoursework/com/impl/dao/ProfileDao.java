package SuperheroCoursework.com.impl.dao;

import SuperheroCoursework.com.Model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.sql.DataSource;
import java.sql.*;

public class ProfileDao {

    @Autowired
    @Qualifier ("customDataSource")
    private DataSource datasource;

    String query = "SELECT * FROM PROFILE ";

    public Profile getProfile(String username, String password) {
        return null;
    }

    public String getProfileInfo(String uuid) throws SQLException {
        datasource.getConnection().prepareStatement(query).execute();
    }

    public void mapProfile(String query) {
        try (Connection connection = datasource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            // ... add parameters to the SQL query using PreparedStatement methods:
            //     setInt, setString, etc.
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    return profileM
                    // ... do something with result set
                }
            }
        } catch (SQLException e) {
            // ... handle SQL exception
        }
    }
}
