package org.tsn.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.tsn.dao.interfaces.IMasterDataDAO;
import org.tsn.entity.IBaseEntity;
import org.tsn.entity.TCategories;
import org.tsn.entity.TEducation;
import org.tsn.entity.TOccupation;
import org.tsn.entity.TProjectType;
import org.tsn.entity.TSecurityQuestions;
import org.tsn.resources.TSN_Constants;
import org.tsn.tos.MasterRecords;
import org.tsn.utility.MasterDataConversionUtility;

public class MasterDataDAOImpl implements IMasterDataDAO
{

	@Autowired
	private SessionFactory	sessionFactory;

	final static Logger		logger	= Logger.getLogger(MasterDataDAOImpl.class);

	@Override
	@SuppressWarnings("unchecked")
	@Transactional
	public MasterRecords getAllRecords()
	{

		// logs an error message with parameter
		// logger.error("This is error : " + parameter);

		// logs an exception thrown from somewhere
		// logger.error("This is error", exception);

		List<TSecurityQuestions> securityQuestions = this.sessionFactory.getCurrentSession()
				.createQuery("from TSecurityQuestions")
				.list();
		List<TOccupation> occupations = this.sessionFactory.getCurrentSession()
				.createQuery("from TOccupation")
				.list();

		List<TEducation> educations = this.sessionFactory.getCurrentSession()
				.createQuery("from TEducation")
				.list();

		List<TProjectType> projectTypes = this.sessionFactory.getCurrentSession()
				.createQuery("from TProjectType")
				.list();

		List<TCategories> categories = this.sessionFactory.getCurrentSession()
				.createQuery("from TCategories")
				.list();

		return MasterDataConversionUtility.shared.getMasterRecords(
				securityQuestions, occupations, educations, projectTypes,
				categories);
	}

	@Transactional
	public String addRecord(String tableName, String dataDescription)
	{
		logger.info("TableName :" + tableName + ", data description  :"
			+ dataDescription);

		if (TSN_Constants.MASTER_TABLES[0].equals(tableName))
		{
			TSecurityQuestions securityQuestions = MasterDataConversionUtility.shared.getSecurityQuestion(dataDescription);
			this.sessionFactory.getCurrentSession().save(securityQuestions);
		}

		if (TSN_Constants.MASTER_TABLES[1].equals(tableName))
		{
			TCategories categories = MasterDataConversionUtility.shared.getCategories(dataDescription);
			this.sessionFactory.getCurrentSession().save(categories);
		}
		if (TSN_Constants.MASTER_TABLES[2].equals(tableName))
		{
			TProjectType projectType = MasterDataConversionUtility.shared.getProjectTypes(dataDescription);
			this.sessionFactory.getCurrentSession().save(projectType);
		}
		if (TSN_Constants.MASTER_TABLES[3].equals(tableName))
		{
			TEducation education = MasterDataConversionUtility.shared.getEducation(dataDescription);
			this.sessionFactory.getCurrentSession().save(education);
		}
		if (TSN_Constants.MASTER_TABLES[4].equals(tableName))
		{
			TOccupation occupation = MasterDataConversionUtility.shared.getOccupation(dataDescription);
			this.sessionFactory.getCurrentSession().save(occupation);
		}

		return "";// questions.getQuestionText();
	}

	@Override
	@Transactional
	public void deleteRecord(String tableName, Integer id)
	{
		logger.info("deleting............" + id);

		IBaseEntity entity = null;

		if (TSN_Constants.MASTER_TABLES[0].equals(tableName))
		{
			entity = (TSecurityQuestions) sessionFactory.getCurrentSession()
					.load(TSecurityQuestions.class, id);
		}

		if (TSN_Constants.MASTER_TABLES[1].equals(tableName))
		{
			entity = (TCategories) sessionFactory.getCurrentSession().load(
					TCategories.class, id);
		}
		if (TSN_Constants.MASTER_TABLES[2].equals(tableName))
		{
			entity = (TProjectType) sessionFactory.getCurrentSession().load(
					TProjectType.class, id);
		}
		if (TSN_Constants.MASTER_TABLES[3].equals(tableName))
		{
			entity = (TEducation) sessionFactory.getCurrentSession().load(
					TEducation.class, id);
		}
		if (TSN_Constants.MASTER_TABLES[4].equals(tableName))
		{
			entity = (TOccupation) sessionFactory.getCurrentSession().load(
					TOccupation.class, id);
		}

		if (null != entity)
		{
			logger.info("deleting.........xxxxxx....." + entity);
			this.sessionFactory.getCurrentSession().delete(entity);
		}
	}

}
