package octopus.api.projects;

import octopus.api.database.Database;

public class OctopusProjectWrapper {

	private OctopusProject oProject;

	public void setWrappedProject(OctopusProject project)
	{
		oProject = project;
	}

	 public String getPathToProjectDir()
     {
             return oProject.getPathToProjectDir();
     }

     public Database getDatabase()
     {
    	 return oProject.getDatabase();
     }

     public String getName()
     {
    	 return oProject.getName();
 	}

}