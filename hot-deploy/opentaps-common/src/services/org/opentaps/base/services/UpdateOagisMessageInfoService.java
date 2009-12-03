package org.opentaps.base.services;

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
 * Update MessageInfo.
 * Auto generated base service entity updateOagisMessageInfo.
 *
 * Engine: simple
 * Location: component://oagis/script/org/ofbiz/oagis/OagisMessageServices.xml
 * Invoke: updateOagisMessageInfo
 * Defined in: file:/home/jeremy/programmation/opentaps-git/specialpurpose/oagis/servicedef/services.xml
 */
public class UpdateOagisMessageInfoService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateOagisMessageInfo";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.TRUE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        authId("authId"),
        bsrNoun("bsrNoun"),
        bsrRevision("bsrRevision"),
        bsrVerb("bsrVerb"),
        component("component"),
        confirmation("confirmation"),
        fullMessageXml("fullMessageXml"),
        locale("locale"),
        logicalId("logicalId"),
        orderId("orderId"),
        origRef("origRef"),
        outgoingMessage("outgoingMessage"),
        processingStatusId("processingStatusId"),
        receivedDate("receivedDate"),
        referenceId("referenceId"),
        returnId("returnId"),
        sentDate("sentDate"),
        shipmentId("shipmentId"),
        task("task"),
        timeZone("timeZone"),
        userLogin("userLogin");
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
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>UpdateOagisMessageInfoService</code> instance.
     */
    public UpdateOagisMessageInfoService() {
        super();
    }

    /**
     * Creates a new <code>UpdateOagisMessageInfoService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateOagisMessageInfoService(User user) {
        super(user);
    }

    private String inAuthId;
    private String inBsrNoun;
    private String inBsrRevision;
    private String inBsrVerb;
    private String inComponent;
    private String inConfirmation;
    private String inFullMessageXml;
    private Locale inLocale;
    private String inLogicalId;
    private String inOrderId;
    private String inOrigRef;
    private String inOutgoingMessage;
    private String inProcessingStatusId;
    private Timestamp inReceivedDate;
    private String inReferenceId;
    private String inReturnId;
    private Timestamp inSentDate;
    private String inShipmentId;
    private String inTask;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAuthId() {
        return this.inAuthId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInBsrNoun() {
        return this.inBsrNoun;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInBsrRevision() {
        return this.inBsrRevision;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInBsrVerb() {
        return this.inBsrVerb;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInComponent() {
        return this.inComponent;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInConfirmation() {
        return this.inConfirmation;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFullMessageXml() {
        return this.inFullMessageXml;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInLogicalId() {
        return this.inLogicalId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOrderId() {
        return this.inOrderId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOrigRef() {
        return this.inOrigRef;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOutgoingMessage() {
        return this.inOutgoingMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProcessingStatusId() {
        return this.inProcessingStatusId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInReceivedDate() {
        return this.inReceivedDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInReferenceId() {
        return this.inReferenceId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInReturnId() {
        return this.inReturnId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInSentDate() {
        return this.inSentDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInShipmentId() {
        return this.inShipmentId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInTask() {
        return this.inTask;
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
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAuthId the inAuthId to set
    */
    public void setInAuthId(String inAuthId) {
        this.inParameters.add("authId");
        this.inAuthId = inAuthId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBsrNoun the inBsrNoun to set
    */
    public void setInBsrNoun(String inBsrNoun) {
        this.inParameters.add("bsrNoun");
        this.inBsrNoun = inBsrNoun;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBsrRevision the inBsrRevision to set
    */
    public void setInBsrRevision(String inBsrRevision) {
        this.inParameters.add("bsrRevision");
        this.inBsrRevision = inBsrRevision;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBsrVerb the inBsrVerb to set
    */
    public void setInBsrVerb(String inBsrVerb) {
        this.inParameters.add("bsrVerb");
        this.inBsrVerb = inBsrVerb;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inComponent the inComponent to set
    */
    public void setInComponent(String inComponent) {
        this.inParameters.add("component");
        this.inComponent = inComponent;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inConfirmation the inConfirmation to set
    */
    public void setInConfirmation(String inConfirmation) {
        this.inParameters.add("confirmation");
        this.inConfirmation = inConfirmation;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFullMessageXml the inFullMessageXml to set
    */
    public void setInFullMessageXml(String inFullMessageXml) {
        this.inParameters.add("fullMessageXml");
        this.inFullMessageXml = inFullMessageXml;
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
     * This parameter is required.
     * @param inLogicalId the inLogicalId to set
    */
    public void setInLogicalId(String inLogicalId) {
        this.inParameters.add("logicalId");
        this.inLogicalId = inLogicalId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOrderId the inOrderId to set
    */
    public void setInOrderId(String inOrderId) {
        this.inParameters.add("orderId");
        this.inOrderId = inOrderId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOrigRef the inOrigRef to set
    */
    public void setInOrigRef(String inOrigRef) {
        this.inParameters.add("origRef");
        this.inOrigRef = inOrigRef;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOutgoingMessage the inOutgoingMessage to set
    */
    public void setInOutgoingMessage(String inOutgoingMessage) {
        this.inParameters.add("outgoingMessage");
        this.inOutgoingMessage = inOutgoingMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProcessingStatusId the inProcessingStatusId to set
    */
    public void setInProcessingStatusId(String inProcessingStatusId) {
        this.inParameters.add("processingStatusId");
        this.inProcessingStatusId = inProcessingStatusId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReceivedDate the inReceivedDate to set
    */
    public void setInReceivedDate(Timestamp inReceivedDate) {
        this.inParameters.add("receivedDate");
        this.inReceivedDate = inReceivedDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inReferenceId the inReferenceId to set
    */
    public void setInReferenceId(String inReferenceId) {
        this.inParameters.add("referenceId");
        this.inReferenceId = inReferenceId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReturnId the inReturnId to set
    */
    public void setInReturnId(String inReturnId) {
        this.inParameters.add("returnId");
        this.inReturnId = inReturnId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSentDate the inSentDate to set
    */
    public void setInSentDate(Timestamp inSentDate) {
        this.inParameters.add("sentDate");
        this.inSentDate = inSentDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inShipmentId the inShipmentId to set
    */
    public void setInShipmentId(String inShipmentId) {
        this.inParameters.add("shipmentId");
        this.inShipmentId = inShipmentId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inTask the inTask to set
    */
    public void setInTask(String inTask) {
        this.inParameters.add("task");
        this.inTask = inTask;
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
        if (inParameters.contains("authId")) mapValue.put("authId", getInAuthId());
        if (inParameters.contains("bsrNoun")) mapValue.put("bsrNoun", getInBsrNoun());
        if (inParameters.contains("bsrRevision")) mapValue.put("bsrRevision", getInBsrRevision());
        if (inParameters.contains("bsrVerb")) mapValue.put("bsrVerb", getInBsrVerb());
        if (inParameters.contains("component")) mapValue.put("component", getInComponent());
        if (inParameters.contains("confirmation")) mapValue.put("confirmation", getInConfirmation());
        if (inParameters.contains("fullMessageXml")) mapValue.put("fullMessageXml", getInFullMessageXml());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("logicalId")) mapValue.put("logicalId", getInLogicalId());
        if (inParameters.contains("orderId")) mapValue.put("orderId", getInOrderId());
        if (inParameters.contains("origRef")) mapValue.put("origRef", getInOrigRef());
        if (inParameters.contains("outgoingMessage")) mapValue.put("outgoingMessage", getInOutgoingMessage());
        if (inParameters.contains("processingStatusId")) mapValue.put("processingStatusId", getInProcessingStatusId());
        if (inParameters.contains("receivedDate")) mapValue.put("receivedDate", getInReceivedDate());
        if (inParameters.contains("referenceId")) mapValue.put("referenceId", getInReferenceId());
        if (inParameters.contains("returnId")) mapValue.put("returnId", getInReturnId());
        if (inParameters.contains("sentDate")) mapValue.put("sentDate", getInSentDate());
        if (inParameters.contains("shipmentId")) mapValue.put("shipmentId", getInShipmentId());
        if (inParameters.contains("task")) mapValue.put("task", getInTask());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
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
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("authId")) setInAuthId((String) mapValue.get("authId"));
        if (mapValue.containsKey("bsrNoun")) setInBsrNoun((String) mapValue.get("bsrNoun"));
        if (mapValue.containsKey("bsrRevision")) setInBsrRevision((String) mapValue.get("bsrRevision"));
        if (mapValue.containsKey("bsrVerb")) setInBsrVerb((String) mapValue.get("bsrVerb"));
        if (mapValue.containsKey("component")) setInComponent((String) mapValue.get("component"));
        if (mapValue.containsKey("confirmation")) setInConfirmation((String) mapValue.get("confirmation"));
        if (mapValue.containsKey("fullMessageXml")) setInFullMessageXml((String) mapValue.get("fullMessageXml"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("logicalId")) setInLogicalId((String) mapValue.get("logicalId"));
        if (mapValue.containsKey("orderId")) setInOrderId((String) mapValue.get("orderId"));
        if (mapValue.containsKey("origRef")) setInOrigRef((String) mapValue.get("origRef"));
        if (mapValue.containsKey("outgoingMessage")) setInOutgoingMessage((String) mapValue.get("outgoingMessage"));
        if (mapValue.containsKey("processingStatusId")) setInProcessingStatusId((String) mapValue.get("processingStatusId"));
        if (mapValue.containsKey("receivedDate")) setInReceivedDate((Timestamp) mapValue.get("receivedDate"));
        if (mapValue.containsKey("referenceId")) setInReferenceId((String) mapValue.get("referenceId"));
        if (mapValue.containsKey("returnId")) setInReturnId((String) mapValue.get("returnId"));
        if (mapValue.containsKey("sentDate")) setInSentDate((Timestamp) mapValue.get("sentDate"));
        if (mapValue.containsKey("shipmentId")) setInShipmentId((String) mapValue.get("shipmentId"));
        if (mapValue.containsKey("task")) setInTask((String) mapValue.get("task"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
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
    }

    /**
     * Construct a <code>UpdateOagisMessageInfoService</code> from the input values of the given <code>UpdateOagisMessageInfoService</code>.
     * @param input a <code>UpdateOagisMessageInfoService</code>
     */
    public static UpdateOagisMessageInfoService fromInput(UpdateOagisMessageInfoService input) {
        UpdateOagisMessageInfoService service = new UpdateOagisMessageInfoService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateOagisMessageInfoService</code> from the output values of the given <code>UpdateOagisMessageInfoService</code>.
     * @param output a <code>UpdateOagisMessageInfoService</code>
     */
    public static UpdateOagisMessageInfoService fromOutput(UpdateOagisMessageInfoService output) {
        UpdateOagisMessageInfoService service = new UpdateOagisMessageInfoService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateOagisMessageInfoService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateOagisMessageInfoService fromInput(Map<String, Object> mapValue) {
        UpdateOagisMessageInfoService service = new UpdateOagisMessageInfoService();
        service.putAllInput(mapValue);
        if (mapValue.containsKey("userLogin")) {
            GenericValue userGv = (GenericValue) mapValue.get("userLogin");
            if (userGv != null) {
                service.setUser(new User(userGv, userGv.getDelegator()));
            }
        }
        return service;
    }

    /**
     * Construct a <code>UpdateOagisMessageInfoService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateOagisMessageInfoService fromOutput(Map<String, Object> mapValue) {
        UpdateOagisMessageInfoService service = new UpdateOagisMessageInfoService();
        service.putAllOutput(mapValue);
        return service;
    }
}