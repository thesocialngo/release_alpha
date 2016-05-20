package org.tsn.service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.tsn.tos.MasterRecords;

@RequestMapping("service/admin/masterData/")
@CrossOrigin(origins = "*")
public interface IEditMasterTablesService
{

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public MasterRecords getAllMasterRecords();

	@RequestMapping(value = "/SecurityQuestions", method = RequestMethod.POST)
	public MasterRecords addMasterRecord(
			@RequestParam("tableName") String tableName,
			@RequestParam("text") String text);

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public MasterRecords deleteMasterRecord(
			@RequestParam("tableName") String tableName,
			@RequestParam("tableID") String tableID);

}
