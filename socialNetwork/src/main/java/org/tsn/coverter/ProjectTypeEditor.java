package org.tsn.coverter;

import java.beans.PropertyEditorSupport;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.tsn.service.interfaces.IMasterDataManager;
import org.tsn.tos.ProjectType;

public class ProjectTypeEditor extends PropertyEditorSupport
{
	@Autowired
	private IMasterDataManager	masterDataManager;

	/*@Autowired(required = true)
	@Qualifier(value = "masterDataManager")
	public void setMasterDataDAO(IMasterDataManager masterDataManager)
	{
		this.masterDataManager = masterDataManager;
	}*/

	// This will be called when user HTTP Post to server a field bound to
	// ProjectType
	@Override
	public void setAsText(String id)
	{
		ProjectType projectType = new ProjectType();

		if (null != id && StringUtils.isNotBlank(id) && !id.equals("NONE"))
		{
			// projectType =
			// masterDataManager.getProjectTypeById(JavaUtility.shared.toInt(id));
			// projectType = new ProjectType();//
			projectType.setId(Integer.valueOf(id));
			/*projectType.setDescription("test");*/
		}
		else
		{
			projectType = null;
		}

		this.setValue(projectType);
	}

	/*@Override
	public void setAsText(String text)
			throws IllegalArgumentException
	{
		Employee employee = new Employee();
		employee.setId(Integer.valueOf(text));
	}*/

	@SuppressWarnings("unchecked")
	@Override
	public String getAsText()
	{
		ProjectType projectType = (ProjectType) getValue();
		if (projectType == null)
		{
			return null;
		}

		return String.valueOf(projectType.getId());
	}
}
