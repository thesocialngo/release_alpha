package org.tsn.service.interfaces;

import org.tsn.tos.ProjectMovement;

public interface IProjectMovement
{

	public void addMovement(ProjectMovement movement);

	ProjectMovement getMovement(ProjectMovement movement);

	public void updateMovement(ProjectMovement movement);
}
