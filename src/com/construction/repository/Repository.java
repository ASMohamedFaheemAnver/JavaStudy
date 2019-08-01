package com.construction.repository;

import com.construction.ProjectRecord;

import java.sql.SQLException;

public interface Repository {
    ProjectRecord read(String projId) throws SQLException;
}
