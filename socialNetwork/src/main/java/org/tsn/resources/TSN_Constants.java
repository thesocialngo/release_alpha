package org.tsn.resources;

public interface TSN_Constants {

	String[] MASTER_TABLES = {"SECURITY_QUESTIONS","CATEGORIES","CAUSES","EDUCATION","OCCUPATION"};
	   
	String[][] MASTER_TABLE_COLUMNS = {{"QUESTION_TEXT"},
			 {"CATEGORY_DESCR"},
			 {"CAUSE_dESCR"},
			 {"EDUCATION_TEXT"},
			 {"OCCUPATION_TEXT"}
			
	};
	/*String[] SECURITY_QUESTION_COLUMNS = {"QUESTION_TEXT"};
	String[] CATEGORIES_COLUMNS = {"CATEGORY_DESCR"};
	String[] CAUSES_COLUMNS = {"CAUSE_dESCR"};
	String[] EDUCATION_COLUMNS = {"EDUCATION_TEXT"};
	String[] OCCUPATION_COLUMNS = {"OCCUPATION_TEXT"};*/
	
	public final static int	DEFAULT_TABLE_ID	= 1;
	public final static String	DEFAULT_TABLE_TEXT	= "default";
	
	public final static double	NOT_APPLICABLE	= Double.parseDouble(String.valueOf(Integer.MIN_VALUE));
}
