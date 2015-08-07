package org.tsn.tos;

import javax.validation.constraints.NotNull;

public class ProjectMovement extends BaseTransferObject
{
	private static final long	serialVersionUID	= -5642463611131001829L;

	@NotNull
	private ProjectType			projectType;
	private String				title;

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public ProjectType getProjectType()
	{
		return projectType;
	}

	public void setProjectType(ProjectType projectType)
	{
		this.projectType = projectType;
	}

	@Override
	public String toString()
	{
		return "ProjectMovement [projectType=" + projectType + "]";
	}

}
