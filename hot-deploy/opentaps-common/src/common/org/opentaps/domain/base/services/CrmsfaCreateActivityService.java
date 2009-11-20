package org.opentaps.domain.base.services;

/*
 * Copyright (c) 2009 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE SERVICE MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import org.opentaps.foundation.infrastructure.InfrastructureException;
import org.opentaps.foundation.service.ServiceWrapper;

import java.sql.Timestamp;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import javolution.util.FastMap;
import javolution.util.FastSet;
import org.ofbiz.entity.GenericValue;
import org.opentaps.foundation.infrastructure.User;

/**
 * Create an Event or Task. Will create associations between the resulting WorkEffort and the party, case and opportunity specified.
            In order to complete this successfully, the userLogin must have the correct _UPDATE permissions for the associated party, case and opportunity in
            addition to basic CRMSFA_ACT_CREATE permission..
 * Auto generated base service entity crmsfa.createActivity.
 *
 * Engine: java
 * Location: com.opensourcestrategies.crmsfa.activities.ActivitiesServices
 * Invoke: createActivity
 * Defined in: file:/home/jeremy/programmation/opentaps-git/hot-deploy/crmsfa/servicedef/services_activities.xml
 */
public class CrmsfaCreateActivityService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "crmsfa.createActivity";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        availabilityStatusId("availabilityStatusId"),
        currentStatusId("currentStatusId"),
        custRequestId("custRequestId"),
        description("description"),
        duration("duration"),
        estimatedCompletionDate("estimatedCompletionDate"),
        estimatedStartDate("estimatedStartDate"),
        forceIfConflicts("forceIfConflicts"),
        internalPartyId("internalPartyId"),
        locale("locale"),
        locationDesc("locationDesc"),
        salesOpportunityId("salesOpportunityId"),
        scopeEnumId("scopeEnumId"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        workEffortName("workEffortName"),
        workEffortPurposeTypeId("workEffortPurposeTypeId"),
        workEffortTypeId("workEffortTypeId");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        workEffortId("workEffortId");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>CrmsfaCreateActivityService</code> instance.
     */
    public CrmsfaCreateActivityService() {
        super();
    }


    private String inAvailabilityStatusId;
    private String inCurrentStatusId;
    private String inCustRequestId;
    private String inDescription;
    private String inDuration;
    private Timestamp inEstimatedCompletionDate;
    private Timestamp inEstimatedStartDate;
    private String inForceIfConflicts;
    private String inInternalPartyId;
    private Locale inLocale;
    private String inLocationDesc;
    private String inSalesOpportunityId;
    private String inScopeEnumId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String inWorkEffortName;
    private String inWorkEffortPurposeTypeId;
    private String inWorkEffortTypeId;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;
    private String outWorkEffortId;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInAvailabilityStatusId() {
        return this.inAvailabilityStatusId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInCurrentStatusId() {
        return this.inCurrentStatusId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCustRequestId() {
        return this.inCustRequestId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDescription() {
        return this.inDescription;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDuration() {
        return this.inDuration;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInEstimatedCompletionDate() {
        return this.inEstimatedCompletionDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInEstimatedStartDate() {
        return this.inEstimatedStartDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInForceIfConflicts() {
        return this.inForceIfConflicts;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInternalPartyId() {
        return this.inInternalPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getInLocale() {
        return this.inLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInLocationDesc() {
        return this.inLocationDesc;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSalesOpportunityId() {
        return this.inSalesOpportunityId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInScopeEnumId() {
        return this.inScopeEnumId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getInTimeZone() {
        return this.inTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getInUserLogin() {
        return this.inUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInWorkEffortName() {
        return this.inWorkEffortName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInWorkEffortPurposeTypeId() {
        return this.inWorkEffortPurposeTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInWorkEffortTypeId() {
        return this.inWorkEffortTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutErrorMessage() {
        return this.outErrorMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutErrorMessageList() {
        return this.outErrorMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getOutLocale() {
        return this.outLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutResponseMessage() {
        return this.outResponseMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutSuccessMessage() {
        return this.outSuccessMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutSuccessMessageList() {
        return this.outSuccessMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getOutTimeZone() {
        return this.outTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutUserLogin() {
        return this.outUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutWorkEffortId() {
        return this.outWorkEffortId;
    }

    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inAvailabilityStatusId the inAvailabilityStatusId to set
    */
    public void setInAvailabilityStatusId(String inAvailabilityStatusId) {
        this.inParameters.add("availabilityStatusId");
        this.inAvailabilityStatusId = inAvailabilityStatusId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inCurrentStatusId the inCurrentStatusId to set
    */
    public void setInCurrentStatusId(String inCurrentStatusId) {
        this.inParameters.add("currentStatusId");
        this.inCurrentStatusId = inCurrentStatusId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCustRequestId the inCustRequestId to set
    */
    public void setInCustRequestId(String inCustRequestId) {
        this.inParameters.add("custRequestId");
        this.inCustRequestId = inCustRequestId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDescription the inDescription to set
    */
    public void setInDescription(String inDescription) {
        this.inParameters.add("description");
        this.inDescription = inDescription;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDuration the inDuration to set
    */
    public void setInDuration(String inDuration) {
        this.inParameters.add("duration");
        this.inDuration = inDuration;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inEstimatedCompletionDate the inEstimatedCompletionDate to set
    */
    public void setInEstimatedCompletionDate(Timestamp inEstimatedCompletionDate) {
        this.inParameters.add("estimatedCompletionDate");
        this.inEstimatedCompletionDate = inEstimatedCompletionDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inEstimatedStartDate the inEstimatedStartDate to set
    */
    public void setInEstimatedStartDate(Timestamp inEstimatedStartDate) {
        this.inParameters.add("estimatedStartDate");
        this.inEstimatedStartDate = inEstimatedStartDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inForceIfConflicts the inForceIfConflicts to set
    */
    public void setInForceIfConflicts(String inForceIfConflicts) {
        this.inParameters.add("forceIfConflicts");
        this.inForceIfConflicts = inForceIfConflicts;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInternalPartyId the inInternalPartyId to set
    */
    public void setInInternalPartyId(String inInternalPartyId) {
        this.inParameters.add("internalPartyId");
        this.inInternalPartyId = inInternalPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocale the inLocale to set
    */
    public void setInLocale(Locale inLocale) {
        this.inParameters.add("locale");
        this.inLocale = inLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocationDesc the inLocationDesc to set
    */
    public void setInLocationDesc(String inLocationDesc) {
        this.inParameters.add("locationDesc");
        this.inLocationDesc = inLocationDesc;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSalesOpportunityId the inSalesOpportunityId to set
    */
    public void setInSalesOpportunityId(String inSalesOpportunityId) {
        this.inParameters.add("salesOpportunityId");
        this.inSalesOpportunityId = inSalesOpportunityId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inScopeEnumId the inScopeEnumId to set
    */
    public void setInScopeEnumId(String inScopeEnumId) {
        this.inParameters.add("scopeEnumId");
        this.inScopeEnumId = inScopeEnumId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTimeZone the inTimeZone to set
    */
    public void setInTimeZone(TimeZone inTimeZone) {
        this.inParameters.add("timeZone");
        this.inTimeZone = inTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUserLogin the inUserLogin to set
    */
    public void setInUserLogin(GenericValue inUserLogin) {
        this.inParameters.add("userLogin");
        this.inUserLogin = inUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inWorkEffortName the inWorkEffortName to set
    */
    public void setInWorkEffortName(String inWorkEffortName) {
        this.inParameters.add("workEffortName");
        this.inWorkEffortName = inWorkEffortName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inWorkEffortPurposeTypeId the inWorkEffortPurposeTypeId to set
    */
    public void setInWorkEffortPurposeTypeId(String inWorkEffortPurposeTypeId) {
        this.inParameters.add("workEffortPurposeTypeId");
        this.inWorkEffortPurposeTypeId = inWorkEffortPurposeTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inWorkEffortTypeId the inWorkEffortTypeId to set
    */
    public void setInWorkEffortTypeId(String inWorkEffortTypeId) {
        this.inParameters.add("workEffortTypeId");
        this.inWorkEffortTypeId = inWorkEffortTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessage the outErrorMessage to set
    */
    public void setOutErrorMessage(String outErrorMessage) {
        this.outParameters.add("errorMessage");
        this.outErrorMessage = outErrorMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessageList the outErrorMessageList to set
    */
    public void setOutErrorMessageList(List outErrorMessageList) {
        this.outParameters.add("errorMessageList");
        this.outErrorMessageList = outErrorMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outLocale the outLocale to set
    */
    public void setOutLocale(Locale outLocale) {
        this.outParameters.add("locale");
        this.outLocale = outLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outResponseMessage the outResponseMessage to set
    */
    public void setOutResponseMessage(String outResponseMessage) {
        this.outParameters.add("responseMessage");
        this.outResponseMessage = outResponseMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessage the outSuccessMessage to set
    */
    public void setOutSuccessMessage(String outSuccessMessage) {
        this.outParameters.add("successMessage");
        this.outSuccessMessage = outSuccessMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessageList the outSuccessMessageList to set
    */
    public void setOutSuccessMessageList(List outSuccessMessageList) {
        this.outParameters.add("successMessageList");
        this.outSuccessMessageList = outSuccessMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outTimeZone the outTimeZone to set
    */
    public void setOutTimeZone(TimeZone outTimeZone) {
        this.outParameters.add("timeZone");
        this.outTimeZone = outTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outUserLogin the outUserLogin to set
    */
    public void setOutUserLogin(GenericValue outUserLogin) {
        this.outParameters.add("userLogin");
        this.outUserLogin = outUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outWorkEffortId the outWorkEffortId to set
    */
    public void setOutWorkEffortId(String outWorkEffortId) {
        this.outParameters.add("workEffortId");
        this.outWorkEffortId = outWorkEffortId;
    }

    /** {@inheritDoc} */
    public String name() {
        return NAME;
    }

    /** {@inheritDoc} */
    public Boolean requiresAuthentication() {
        return REQUIRES_AUTHENTICATION;
    }

    /** {@inheritDoc} */
    public Boolean requiresNewTransaction() {
        return REQUIRES_NEW_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Boolean usesTransaction() {
        return USES_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Map<String, Object> inputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (inParameters.contains("availabilityStatusId")) mapValue.put("availabilityStatusId", getInAvailabilityStatusId());
        if (inParameters.contains("currentStatusId")) mapValue.put("currentStatusId", getInCurrentStatusId());
        if (inParameters.contains("custRequestId")) mapValue.put("custRequestId", getInCustRequestId());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("duration")) mapValue.put("duration", getInDuration());
        if (inParameters.contains("estimatedCompletionDate")) mapValue.put("estimatedCompletionDate", getInEstimatedCompletionDate());
        if (inParameters.contains("estimatedStartDate")) mapValue.put("estimatedStartDate", getInEstimatedStartDate());
        if (inParameters.contains("forceIfConflicts")) mapValue.put("forceIfConflicts", getInForceIfConflicts());
        if (inParameters.contains("internalPartyId")) mapValue.put("internalPartyId", getInInternalPartyId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("locationDesc")) mapValue.put("locationDesc", getInLocationDesc());
        if (inParameters.contains("salesOpportunityId")) mapValue.put("salesOpportunityId", getInSalesOpportunityId());
        if (inParameters.contains("scopeEnumId")) mapValue.put("scopeEnumId", getInScopeEnumId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("workEffortName")) mapValue.put("workEffortName", getInWorkEffortName());
        if (inParameters.contains("workEffortPurposeTypeId")) mapValue.put("workEffortPurposeTypeId", getInWorkEffortPurposeTypeId());
        if (inParameters.contains("workEffortTypeId")) mapValue.put("workEffortTypeId", getInWorkEffortTypeId());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        if (outParameters.contains("workEffortId")) mapValue.put("workEffortId", getOutWorkEffortId());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("availabilityStatusId")) setInAvailabilityStatusId((String) mapValue.get("availabilityStatusId"));
        if (mapValue.containsKey("currentStatusId")) setInCurrentStatusId((String) mapValue.get("currentStatusId"));
        if (mapValue.containsKey("custRequestId")) setInCustRequestId((String) mapValue.get("custRequestId"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("duration")) setInDuration((String) mapValue.get("duration"));
        if (mapValue.containsKey("estimatedCompletionDate")) setInEstimatedCompletionDate((Timestamp) mapValue.get("estimatedCompletionDate"));
        if (mapValue.containsKey("estimatedStartDate")) setInEstimatedStartDate((Timestamp) mapValue.get("estimatedStartDate"));
        if (mapValue.containsKey("forceIfConflicts")) setInForceIfConflicts((String) mapValue.get("forceIfConflicts"));
        if (mapValue.containsKey("internalPartyId")) setInInternalPartyId((String) mapValue.get("internalPartyId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("locationDesc")) setInLocationDesc((String) mapValue.get("locationDesc"));
        if (mapValue.containsKey("salesOpportunityId")) setInSalesOpportunityId((String) mapValue.get("salesOpportunityId"));
        if (mapValue.containsKey("scopeEnumId")) setInScopeEnumId((String) mapValue.get("scopeEnumId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("workEffortName")) setInWorkEffortName((String) mapValue.get("workEffortName"));
        if (mapValue.containsKey("workEffortPurposeTypeId")) setInWorkEffortPurposeTypeId((String) mapValue.get("workEffortPurposeTypeId"));
        if (mapValue.containsKey("workEffortTypeId")) setInWorkEffortTypeId((String) mapValue.get("workEffortTypeId"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("workEffortId")) setOutWorkEffortId((String) mapValue.get("workEffortId"));
    }

    /**
     * Construct a <code>CrmsfaCreateActivityService</code> from the input values of the given <code>CrmsfaCreateActivityService</code>.
     * @param input a <code>CrmsfaCreateActivityService</code>
     */
    public static CrmsfaCreateActivityService fromInput(CrmsfaCreateActivityService input) {
        CrmsfaCreateActivityService service = new CrmsfaCreateActivityService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CrmsfaCreateActivityService</code> from the output values of the given <code>CrmsfaCreateActivityService</code>.
     * @param output a <code>CrmsfaCreateActivityService</code>
     */
    public static CrmsfaCreateActivityService fromOutput(CrmsfaCreateActivityService output) {
        CrmsfaCreateActivityService service = new CrmsfaCreateActivityService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CrmsfaCreateActivityService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CrmsfaCreateActivityService fromInput(Map<String, Object> mapValue) {
        CrmsfaCreateActivityService service = new CrmsfaCreateActivityService();
        service.putAllInput(mapValue);
        if (mapValue.containsKey("userLogin")) {
            GenericValue userGv = (GenericValue) mapValue.get("userLogin");
            if (userGv != null) {
                try {
                    service.setUser(new User(userGv, userGv.getDelegator()));
                } catch (InfrastructureException e) { }
            }
        }
        return service;
    }

    /**
     * Construct a <code>CrmsfaCreateActivityService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CrmsfaCreateActivityService fromOutput(Map<String, Object> mapValue) {
        CrmsfaCreateActivityService service = new CrmsfaCreateActivityService();
        service.putAllOutput(mapValue);
        return service;
    }
}