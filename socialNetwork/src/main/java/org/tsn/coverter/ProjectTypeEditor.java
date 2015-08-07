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

	@Override
	public void setAsText(String id)
	{
		ProjectType projectType = new ProjectType();

		if (null != id && StringUtils.isNotBlank(id) && !id.equals("NONE"))
		{
			projectType.setId(Integer.valueOf(id));
		}
		else
		{
			projectType = null;
		}

		this.setValue(projectType);
	}

}
