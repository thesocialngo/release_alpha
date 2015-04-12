package org.tsn.dao.interfaces;

import java.util.List;

import org.tsn.entity.TOccupation;
import org.tsn.tos.MasterRecords;
import org.tsn.tos.SecurityQuestion;

public interface IMasterDataDAO {

	public MasterRecords getAllRecords();

	public String addRecord(String table, String question);

	public void deleteRecord(String tableName, Integer id);
}
