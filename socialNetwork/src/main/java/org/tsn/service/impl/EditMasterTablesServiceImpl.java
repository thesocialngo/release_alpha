package org.tsn.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import org.tsn.logic.IMasterDataManager;
import org.tsn.service.IEditMasterTablesService;
import org.tsn.tos.MasterRecords;

@RestController
public class EditMasterTablesServiceImpl implements IEditMasterTablesService
{
	final static Logger			logger	= Logger.getLogger(EditMasterTablesServiceImpl.class);

	private IMasterDataManager	masterDataManager;

	@Autowired(required = true)
	@Qualifier(value = "masterDataManager")
	public void setMasterDataManager(IMasterDataManager masterDataManager)
	{
		this.masterDataManager = masterDataManager;
	}

	@Override
	public MasterRecords getAllMasterRecords()
	{
		return masterDataManager.getRecords();
	}

	@Override
	public MasterRecords addMasterRecord(String tableName, String text)
	{
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + tableName
			+ ", text ::" + text);

		String id = masterDataManager.addRecord(tableName, text);// TSN_Constants.MASTER_TABLES[0]

		return masterDataManager.getRecords();
	}

	@Override
	public MasterRecords deleteMasterRecord(String tableName, String tableID)
	{
		logger.info("inside delete....tableName" + tableName
				+ ", masterDataID :" + tableID);
		masterDataManager.deleteRecord(tableName, Integer.valueOf(tableID));

		return masterDataManager.getRecords();
	}

	/*@Override
	public MasterRecords getJSONMessage(HttpServletResponse response)
	{
		response.setHeader("Access-Control-Allow-Origin", "*");
		return masterDataManager.getRecords();
	}*/

	/*@Override
	public List<SecurityQuestion> getSecurityQuestions()
	{

		System.out.println("i am here........");
		SecurityQuestion[] questions = masterDataManager.getRecords()
				.getSecurityQuestions();
		List<SecurityQuestion> secQuestions = Arrays.asList(questions);

		return secQuestions;
	}
	 */
}
