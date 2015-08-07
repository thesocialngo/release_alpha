package org.tsn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.tsn.dao.interfaces.IMasterDataDAO;
import org.tsn.service.interfaces.IMasterDataManager;
import org.tsn.tos.MasterRecords;
import org.tsn.tos.ProjectType;

public class MasterDataManagerImpl implements IMasterDataManager
{

	private IMasterDataDAO	masterDataDAO;

	public IMasterDataDAO getMasterDataDAO()
	{
		return masterDataDAO;
	}

	@Autowired(required = true)
	@Qualifier(value = "masterDataDAO")
	public void setMasterDataDAO(IMasterDataDAO masterDataDAO)
	{
		this.masterDataDAO = masterDataDAO;
	}

	@Override
	public MasterRecords getRecords()
	{

		MasterRecords masterRecords = masterDataDAO.getAllRecords();

		return masterRecords;
	}

	@Override
	public String addRecord(String table, String question)
	{
		return masterDataDAO.addRecord(table, question);
	}

	@Override
	public void deleteRecord(String tableName, Integer id)
	{
		masterDataDAO.deleteRecord(tableName, id);

	}

	@Override
	public ProjectType getProjectTypeById(int id)
	{
		return masterDataDAO.getProjectTypeById(id);
	}

	@Override
	public ProjectType[] getProjectTypes()
	{
		return masterDataDAO.getProjectTypes();
	}

}
