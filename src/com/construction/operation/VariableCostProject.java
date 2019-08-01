package com.construction.operation;


import com.construction.ProjectRecord;

public class VariableCostProject implements BillCalculater {
    ProjectRecord projectRecorde;

    public VariableCostProject(ProjectRecord projectRecorde){
        this.projectRecorde = projectRecorde;
    }

    public int calculate(){
        return projectRecorde.rate * projectRecorde.duration * projectRecorde.numberOfAllocatedResources;
    }
}