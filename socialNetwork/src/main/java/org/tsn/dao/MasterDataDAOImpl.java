package org.tsn.dao;

import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.hibernate.Session;
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
import org.tsn.tos.ProjectType;
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

	@Override
	@Transactional
	public String addRecord(String tableName, String dataDescription)
	{

		logger.info("TableName :" + tableName + ", data description  :"
			+ dataDescription);

		if (!validate(tableName, dataDescription))
		{
			return "-1";
		}

		Integer result = -1;
		Session session = sessionFactory.getCurrentSession();
		if (TSN_Constants.MASTER_TABLES[0].equals(tableName))
		{
			TSecurityQuestions securityQuestions = MasterDataConversionUtility.shared.getSecurityQuestion(dataDescription);
			result = (Integer) session.save(securityQuestions);
		}

		if (TSN_Constants.MASTER_TABLES[1].equals(tableName))
		{
			TCategories categories = MasterDataConversionUtility.shared.getCategories(dataDescription);
			result = (Integer) session.save(categories);
		}
		if (TSN_Constants.MASTER_TABLES[2].equals(tableName))
		{
			TProjectType projectType = MasterDataConversionUtility.shared.getProjectTypes(dataDescription);
			result = (Integer) session.save(projectType);
		}
		if (TSN_Constants.MASTER_TABLES[3].equals(tableName))
		{
			TEducation education = MasterDataConversionUtility.shared.getEducation(dataDescription);
			result = (Integer) session.save(education);
		}
		if (TSN_Constants.MASTER_TABLES[4].equals(tableName))
		{
			TOccupation occupation = MasterDataConversionUtility.shared.getOccupation(dataDescription);
			result = (Integer) session.save(occupation);
		}

		return Integer.toString(result);// questions.getQuestionText();
	}

	private boolean validate(String tableName, String description)
	{
		if (ArrayUtils.contains(TSN_Constants.MASTER_TABLES, tableName)
				&& StringUtils.isNotBlank(description))
		{
			return true;
		}

		return false;
	}

	@Override
	@Transactional
	public void deleteRecord(String tableName, Integer id)
	{
		logger.info("deleting............" + id);

		Session session = sessionFactory.getCurrentSession();
		IBaseEntity entity = null;

		if (TSN_Constants.MASTER_TABLES[0].equals(tableName))
		{
			entity = (TSecurityQuestions) session.load(
					TSecurityQuestions.class, id);
		}

		if (TSN_Constants.MASTER_TABLES[1].equals(tableName))
		{
			entity = (TCategories) session.load(TCategories.class, id);
		}
		if (TSN_Constants.MASTER_TABLES[2].equals(tableName))
		{
			entity = (TProjectType) session.load(TProjectType.class, id);
		}
		if (TSN_Constants.MASTER_TABLES[3].equals(tableName))
		{
			entity = (TEducation) session.load(TEducation.class, id);
		}
		if (TSN_Constants.MASTER_TABLES[4].equals(tableName))
		{
			entity = (TOccupation) session.load(TOccupation.class, id);
		}

		if (null != entity)
		{
			logger.info("deleting.........xxxxxx....." + entity);
			session.delete(entity);
		}
	}

	@Override
	public ProjectType getProjectTypeById(int id)
	{
		TProjectType instance = (TProjectType) this.sessionFactory.getCurrentSession()
				.get(TProjectType.class, id);

		return MasterDataConversionUtility.shared.getProjectType(instance);
	}

	@Transactional
	@Override
	public ProjectType[] getProjectTypes()
	{
		List<TProjectType> projectTypes = this.sessionFactory.getCurrentSession()
				.createQuery("from TProjectType")
				.list();

		return MasterDataConversionUtility.shared.getProjectTypes(projectTypes);
	}

}
