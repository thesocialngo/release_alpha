package org.tsn.logic;

import org.tsn.tos.MasterRecords;
import org.tsn.tos.ProjectType;

public interface IMasterDataManager extends IBaseManager
{

	// public void addRecord(TCategories catagory);

	public MasterRecords getRecords();

	public String addRecord(String string, String question);

	public void deleteRecord(String tableName, Integer id);

	public ProjectType getProjectTypeById(int id);

	public ProjectType[] getProjectTypes();

}
