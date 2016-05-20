package org.tsn.logic;

import org.tsn.tos.ProjectMovement;
import org.tsn.tos.UserProfile;

public interface IProjectMovement
{

	public void addMovement(ProjectMovement movement, UserProfile profile);

	ProjectMovement getMovement(ProjectMovement movement);

	public void updateMovement(ProjectMovement movement);
}
