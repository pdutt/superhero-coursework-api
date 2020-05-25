package SuperheroCoursework.com.impl.dao;

import SuperheroCoursework.com.Model.Profile;
import SuperheroCoursework.com.config.DataSourceConfig;
import SuperheroCoursework.com.impl.mapper.ProfileMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.*;
import javax.sql.DataSource;


@Repository
@Slf4j
public class ProfileDao {

    @Autowired
    @Qualifier ("customDataSource")
    private DataSource datasource;

    String query = "SELECT * FROM PROFILE WHERE PROFILE_ID = ?";

    //TODO: Make sure to modify connection to database using DataSourceConfig and Application properties
    public Profile getProfile(String profileID) throws Exception {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("");
            //Connection connection = DataSourceConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, profileID);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                        return ProfileMapper.mapRow(resultSet);
                    }
            } catch (Exception ex) {
                throw new Exception ("Mapping Profile Unsuccessful");
            }
        } catch (SQLException e) {
            throw new Exception("Could not connect to database.");
        }

        return null;
    }

}
