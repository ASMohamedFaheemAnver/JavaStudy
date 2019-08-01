package com.construction.operation;

import com.construction.ProjectRecord;
import com.construction.repository.DatabaseRepository;
import com.construction.repository.Repository;

import java.sql.SQLException;

public class OperationFactory {
    public BillCalculater getInstance(String arg) throws SQLException {
        BillCalculater billCalculater = null;
        Repository data = new DatabaseRepository();
        ProjectRecord projectRecord = data.read(arg);
        if("fixed".equals(projectRecord.type))
            billCalculater = new FixedCalculateProject(projectRecord);
        else if("variable".equals(projectRecord.type))
            billCalculater = new VariableCostProject(projectRecord);
        return billCalculater;
    }
}
