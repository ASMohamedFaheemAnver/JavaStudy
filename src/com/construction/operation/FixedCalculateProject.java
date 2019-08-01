package com.construction.operation;


import com.construction.ProjectRecord;

public class FixedCalculateProject implements BillCalculater {
    ProjectRecord projectRecorde;

    public FixedCalculateProject(ProjectRecord projectRecorde){
        this.projectRecorde = projectRecorde;
    }

    public int calculate(){
        return projectRecorde.rate * projectRecorde.duration;
    }
}