package org.opentaps.base.entities;

/*
 * Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
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

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity TimeEntry.
 */
@javax.persistence.Entity
@Table(name="TIME_ENTRY")
public class TimeEntry extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("timeEntryId", "TIME_ENTRY_ID");
        fields.put("partyId", "PARTY_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("rateTypeId", "RATE_TYPE_ID");
        fields.put("workEffortId", "WORK_EFFORT_ID");
        fields.put("timesheetId", "TIMESHEET_ID");
        fields.put("invoiceId", "INVOICE_ID");
        fields.put("invoiceItemSeqId", "INVOICE_ITEM_SEQ_ID");
        fields.put("hours", "HOURS");
        fields.put("comments", "COMMENTS");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("TimeEntry", fields);
}
  public static enum Fields implements EntityFieldInterface<TimeEntry> {
    timeEntryId("timeEntryId"),
    partyId("partyId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    rateTypeId("rateTypeId"),
    workEffortId("workEffortId"),
    timesheetId("timesheetId"),
    invoiceId("invoiceId"),
    invoiceItemSeqId("invoiceItemSeqId"),
    hours("hours"),
    comments("comments"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @org.hibernate.annotations.GenericGenerator(name="TimeEntry_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="TimeEntry_GEN")
   @Id
   @Column(name="TIME_ENTRY_ID")
   private String timeEntryId;
   @Column(name="PARTY_ID")
   private String partyId;
   @Column(name="FROM_DATE")
   private Timestamp fromDate;
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="RATE_TYPE_ID")
   private String rateTypeId;
   @Column(name="WORK_EFFORT_ID")
   private String workEffortId;
   @Column(name="TIMESHEET_ID")
   private String timesheetId;
   @Column(name="INVOICE_ID")
   private String invoiceId;
   @Column(name="INVOICE_ITEM_SEQ_ID")
   private String invoiceItemSeqId;
   @Column(name="HOURS")
   private BigDecimal hours;
   @Column(name="COMMENTS")
   private String comments;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RATE_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private RateType rateType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WORK_EFFORT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffort workEffort = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="TIMESHEET_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Timesheet timesheet = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVOICE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Invoice invoice = null;
   private transient InvoiceItem invoiceItem = null;

  /**
   * Default constructor.
   */
  public TimeEntry() {
      super();
      this.baseEntityName = "TimeEntry";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("timeEntryId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("timeEntryId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("rateTypeId");this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("timesheetId");this.allFieldsNames.add("invoiceId");this.allFieldsNames.add("invoiceItemSeqId");this.allFieldsNames.add("hours");this.allFieldsNames.add("comments");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public TimeEntry(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param timeEntryId the timeEntryId to set
     */
    public void setTimeEntryId(String timeEntryId) {
        this.timeEntryId = timeEntryId;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param rateTypeId the rateTypeId to set
     */
    public void setRateTypeId(String rateTypeId) {
        this.rateTypeId = rateTypeId;
    }
    /**
     * Auto generated value setter.
     * @param workEffortId the workEffortId to set
     */
    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
    /**
     * Auto generated value setter.
     * @param timesheetId the timesheetId to set
     */
    public void setTimesheetId(String timesheetId) {
        this.timesheetId = timesheetId;
    }
    /**
     * Auto generated value setter.
     * @param invoiceId the invoiceId to set
     */
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
    /**
     * Auto generated value setter.
     * @param invoiceItemSeqId the invoiceItemSeqId to set
     */
    public void setInvoiceItemSeqId(String invoiceItemSeqId) {
        this.invoiceItemSeqId = invoiceItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param hours the hours to set
     */
    public void setHours(BigDecimal hours) {
        this.hours = hours;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTimeEntryId() {
        return this.timeEntryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRateTypeId() {
        return this.rateTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortId() {
        return this.workEffortId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTimesheetId() {
        return this.timesheetId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceId() {
        return this.invoiceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInvoiceItemSeqId() {
        return this.invoiceItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getHours() {
        return this.hours;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
    }

    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>Party</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getParty() throws RepositoryException {
        if (this.party == null) {
            this.party = getRelatedOne(Party.class, "Party");
        }
        return this.party;
    }
    /**
     * Auto generated method that gets the related <code>RateType</code> by the relation named <code>RateType</code>.
     * @return the <code>RateType</code>
     * @throws RepositoryException if an error occurs
     */
    public RateType getRateType() throws RepositoryException {
        if (this.rateType == null) {
            this.rateType = getRelatedOne(RateType.class, "RateType");
        }
        return this.rateType;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>WorkEffort</code>.
     * @return the <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffort getWorkEffort() throws RepositoryException {
        if (this.workEffort == null) {
            this.workEffort = getRelatedOne(WorkEffort.class, "WorkEffort");
        }
        return this.workEffort;
    }
    /**
     * Auto generated method that gets the related <code>Timesheet</code> by the relation named <code>Timesheet</code>.
     * @return the <code>Timesheet</code>
     * @throws RepositoryException if an error occurs
     */
    public Timesheet getTimesheet() throws RepositoryException {
        if (this.timesheet == null) {
            this.timesheet = getRelatedOne(Timesheet.class, "Timesheet");
        }
        return this.timesheet;
    }
    /**
     * Auto generated method that gets the related <code>Invoice</code> by the relation named <code>Invoice</code>.
     * @return the <code>Invoice</code>
     * @throws RepositoryException if an error occurs
     */
    public Invoice getInvoice() throws RepositoryException {
        if (this.invoice == null) {
            this.invoice = getRelatedOne(Invoice.class, "Invoice");
        }
        return this.invoice;
    }
    /**
     * Auto generated method that gets the related <code>InvoiceItem</code> by the relation named <code>InvoiceItem</code>.
     * @return the <code>InvoiceItem</code>
     * @throws RepositoryException if an error occurs
     */
    public InvoiceItem getInvoiceItem() throws RepositoryException {
        if (this.invoiceItem == null) {
            this.invoiceItem = getRelatedOne(InvoiceItem.class, "InvoiceItem");
        }
        return this.invoiceItem;
    }

    /**
     * Auto generated value setter.
     * @param party the party to set
    */
    public void setParty(Party party) {
        this.party = party;
    }
    /**
     * Auto generated value setter.
     * @param rateType the rateType to set
    */
    public void setRateType(RateType rateType) {
        this.rateType = rateType;
    }
    /**
     * Auto generated value setter.
     * @param workEffort the workEffort to set
    */
    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }
    /**
     * Auto generated value setter.
     * @param timesheet the timesheet to set
    */
    public void setTimesheet(Timesheet timesheet) {
        this.timesheet = timesheet;
    }
    /**
     * Auto generated value setter.
     * @param invoice the invoice to set
    */
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    /**
     * Auto generated value setter.
     * @param invoiceItem the invoiceItem to set
    */
    public void setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setTimeEntryId((String) mapValue.get("timeEntryId"));
        setPartyId((String) mapValue.get("partyId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setRateTypeId((String) mapValue.get("rateTypeId"));
        setWorkEffortId((String) mapValue.get("workEffortId"));
        setTimesheetId((String) mapValue.get("timesheetId"));
        setInvoiceId((String) mapValue.get("invoiceId"));
        setInvoiceItemSeqId((String) mapValue.get("invoiceItemSeqId"));
        setHours(convertToBigDecimal(mapValue.get("hours")));
        setComments((String) mapValue.get("comments"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("timeEntryId", getTimeEntryId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("rateTypeId", getRateTypeId());
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("timesheetId", getTimesheetId());
        mapValue.put("invoiceId", getInvoiceId());
        mapValue.put("invoiceItemSeqId", getInvoiceItemSeqId());
        mapValue.put("hours", getHours());
        mapValue.put("comments", getComments());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}