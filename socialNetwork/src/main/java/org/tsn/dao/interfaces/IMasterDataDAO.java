package org.tsn.dao.interfaces;

import org.tsn.tos.MasterRecords;
import org.tsn.tos.ProjectType;

public interface IMasterDataDAO
{

	public MasterRecords getAllRecords();

	public String addRecord(String table, String question);

	public void deleteRecord(String tableName, Integer id);

	public ProjectType getProjectTypeById(int id);

	public ProjectType[] getProjectTypes();

}
