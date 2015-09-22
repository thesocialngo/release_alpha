package org.tsn.dao.interfaces;

import org.tsn.tos.ProjectMovement;
import org.tsn.tos.UserProfile;

public interface IProjectDAO
{

	public void addMovement(ProjectMovement movement, UserProfile profile);

	ProjectMovement getMovement(ProjectMovement movement);

	public void updateMovement(ProjectMovement movement);
}
