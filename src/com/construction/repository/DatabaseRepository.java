package com.construction.repository;

import com.construction.DbConnection;
import com.construction.ProjectRecord;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseRepository implements Repository{
    @Override
    public ProjectRecord read(String projId) throws SQLException {
        String query = "SELECT * FROM PROJECT WHERE projectId = '" + projId+ "'";
        DbConnection db = new DbConnection();
        Connection con = db.getConnnection();
        Statement s = con.createStatement();
        ResultSet resultSet = s.executeQuery(query);
        while (resultSet.next()){
            ProjectRecord projectRecord = new ProjectRecord();
            projectRecord.id = resultSet.getString("projectId");
            projectRecord.title = resultSet.getString("title");
            projectRecord.clientId = resultSet.getString("clientId");
            projectRecord.duration = resultSet.getInt("duration");
            projectRecord.rate = resultSet.getInt("rate");
            projectRecord.numberOfAllocatedResources = resultSet.getInt("numberOfAllocatedResources");
            projectRecord.type = resultSet.getString("type");
            return projectRecord;
        }
        return null;
    }
}
