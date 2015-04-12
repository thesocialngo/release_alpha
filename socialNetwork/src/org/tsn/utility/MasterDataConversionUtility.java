package org.tsn.utility;

import java.util.List;

import org.apache.log4j.Logger;
import org.tsn.entity.TCategories;
import org.tsn.entity.TCauses;
import org.tsn.entity.TEducation;
import org.tsn.entity.TOccupation;
import org.tsn.entity.TSecurityQuestions;
import org.tsn.tos.Category;
import org.tsn.tos.Cause;
import org.tsn.tos.Education;
import org.tsn.tos.MasterRecords;
import org.tsn.tos.Occupation;
import org.tsn.tos.SecurityQuestion;

public class MasterDataConversionUtility {

	final static Logger logger = Logger.getLogger(MasterDataConversionUtility.class);
	
	public static MasterDataConversionUtility shared = new MasterDataConversionUtility();

	private MasterDataConversionUtility() {
	}

	public MasterRecords getMasterRecords(
			List<TSecurityQuestions> securityQuestions,
			List<TOccupation> occupations, 
			List<TEducation> educations,
			List<TCauses> causes,
			List<TCategories> categories) 
	{
		MasterRecords result = new MasterRecords();
		
		logger.info ("fetched all records, THIS IS INFO");
		logger.debug("securityQuestion :"+securityQuestions);
		logger.debug("occupations :" +occupations);
		logger.debug("educations :"+educations);
		logger.debug("causes :"+causes);
		logger.debug("categories :"+categories);
		
		Occupation[] occupationArray = new Occupation[occupations.size()];
		Education[] educationArray = new Education[educations.size()];
		Cause[] causeArray = new Cause[causes.size()];
		Category[] categoryArray = new Category[categories.size()];

		SecurityQuestion[] questions = new SecurityQuestion[securityQuestions.size()];
		
		for ( int i=0 ; i<securityQuestions.size();i++ ) {
			questions[i] = new SecurityQuestion(securityQuestions.get(i).getQuestionId(),
					securityQuestions.get(i).getQuestionText() );
		}
		
		for ( int i=0 ; i<occupations.size();i++ ) {
			occupationArray[i] = new Occupation( occupations.get(i).getOccupationId(),
					occupations.get(i).getOccupationText()) ;
		}
		
		for ( int i=0 ; i<educations.size();i++ ) {
			educationArray[i] = new Education( educations.get(i).getEducationId(),
					educations.get(i).getEducationText());
		}

		for ( int i=0 ; i<causes.size();i++ ) {
			causeArray[i] = new Cause(causes.get(i).getCauseId(), causes.get(i).getCauseDescr());
		}
		for ( int i=0 ; i<categories.size();i++ ) {
			categoryArray[i] = new Category( categories.get(i).getCategoryId(), categories.get(i).getCategoryDescr());
		}
		
		result.setCategories(categoryArray);;
		result.setCauses(causeArray);
		result.setEducations(educationArray);
		result.setOccupations(occupationArray);
		result.setSecurityQuestions(questions);
		return result;
	}

	public TSecurityQuestions getSecurityQuestion(String questionText) {
		return new TSecurityQuestions(questionText);
	}

	public TSecurityQuestions getSecurityQuestion(int id, String questionText) {
		return new TSecurityQuestions(questionText);
	}
	public TCategories getCategories(String categoryText) {
		return new TCategories(categoryText);
		
	}

	public TCauses getCauses(String desc) {
		return new TCauses(desc);
	}

	public TEducation getEducation(String desc) {
		return new TEducation(desc);
	}

	public TOccupation getOccupation(String desc) {
		return new TOccupation(desc);
	}

}
