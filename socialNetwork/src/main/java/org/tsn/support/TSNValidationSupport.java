package org.tsn.support;

import org.hibernate.engine.spi.EntityKey;

public class TSNValidationSupport
// public class AARValidationSupport extends ApplicationObject
{
	public static final TSNValidationSupport	shared	= new TSNValidationSupport();

	private TSNValidationSupport()
	{
	}

	// EntityKey/BusinessPartyID validation methods
	/*public void validateBusinessPartyID(EntityKey entityKey)
	{
		validateNotNull(entityKey);
		BasicAssertion.shared.isGreaterThanZero(
				entityKey.getIDMBusinessPartyID(),
				"Business Party ID must be greater than zero.");
	}

	public void validateOnlyBusinessPartyID(EntityKey entityKey)
	{
		if (entityKey == null)
		{
			return;
		}
		BasicAssertion.shared.isGreaterThanZero(
				entityKey.getIDMBusinessPartyID(),
				"Business Party ID must be greater than zero.");
	}

	public void validateUniversalBusinessEntityRelationshipID(
			EntityKey entityKey)
	{
		validateNotNull(entityKey);
		BasicAssertion.shared.notEmpty(
				entityKey.getUniversalBusinessEntityRelationshipID(),
				"Universal Business Entity Relationship ID is required.");
	}

	public boolean hasInvalidBusinessPartyID(EntityKey entityKey)
	{
		return entityKey == null || entityKey.getIDMBusinessPartyID() <= 0;
	}

	*/public void validateNotNull(EntityKey entityKey)
	 {
		 validateNotNull(entityKey, "EntityKey");
	 }

	 // Participant/Plan validation methods
	 /*public void validateEntityPlan(EntityKey entityKey, PlanKey planKey)
	{
		validateNotNull(entityKey);

		validateNotNull(entityKey.getParticipantID(), "Participant ID");
		BasicAssertion.shared.notEmpty(entityKey.getParticipantID(),
				"Participant ID is blank");

		validatePlanNumber(planKey);
	}
	*/
	/*	public void validateLoginID(EntityKey entityKey)
		{
			validateNotNull(entityKey);
			validateNotNull(entityKey.getLoginID(), "Login ID");
			BasicAssertion.shared.notEmpty(entityKey.getLoginID(),
					"Login ID is blank");
		}

		public void validatePlanNumber(PlanKey planKey)
		{
			validateNotNull(planKey, "PlanKey");

			validateNotNull(planKey.getPlanNumber(), "Plan Number");
			BasicAssertion.shared.notEmpty(planKey.getPlanNumber(),
					"Plan Number is blank");
		}

		public boolean hasInvalidEntityPlan(
				EntityKey entityKey,
				PlanKey planKey,
				boolean assertNonNull)
		{
			if (assertNonNull)
			{
				validateNotNull(entityKey);
				validateNotNull(planKey, "PlanKey");
			}

			return entityKey == null || planKey == null
				|| StringUtils.isBlank(entityKey.getParticipantID())
				|| StringUtils.isBlank(planKey.getPlanNumber());
		}

		public boolean hasInvalidPlanNumber(PlanKey key)
		{
			return key == null || StringUtils.isEmpty(key.getPlanNumber());
		}

		public boolean hasInvalidParticipantID(EntityKey key)
		{
			return key == null || StringUtils.isEmpty(key.getParticipantID());
		}
	*/
	 // Generic validation methods
	 public void validateNotEmpty(Object[] value, String dataName)
	 {
		 validateNotNull(value, dataName);
		 BasicAssertion.shared.notEmpty(value, dataName + " is empty");
	 }

	 public void validateNotNull(Object value, String dataName)
	 {
		 BasicAssertion.shared.notNull(value, dataName + " is null");
	 }

	/*	public void validateAgreementID(AgreementKey agreementKey)
		{
			validateNotNull(agreementKey, "AgreementKey");
			BasicAssertion.shared.notBlank(agreementKey.getAgreementID(),
					"AgreementID is not set");
		}

		// Participant validation methods
		public void validateParticipantID(EntityKey entityKey)
		{
			validateNotNull(entityKey);

			validateNotNull(entityKey.getParticipantID(), "Participant ID");
			BasicAssertion.shared.notEmpty(entityKey.getParticipantID(),
					"Participant ID is blank");

		}
	*/
}
