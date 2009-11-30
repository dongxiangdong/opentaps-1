package org.opentaps.domain.base.entities;

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
import java.sql.Timestamp;

/**
 * Auto generated base entity PartyAndTelecomNumber.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectPartyAndTelecomNumbers", query="SELECT CM.CONTACT_MECH_ID AS \"contactMechId\",PTY.PARTY_ID AS \"partyId\",PTY.STATUS_ID AS \"statusId\",PCM.FROM_DATE AS \"fromDate\",PCM.THRU_DATE AS \"thruDate\",PTY.PARTY_TYPE_ID AS \"partyTypeId\",CM.CONTACT_MECH_TYPE_ID AS \"contactMechTypeId\",CM.INFO_STRING AS \"infoString\",PCM.COMMENTS AS \"comments\",PCM.EXTENSION AS \"extension\",PCM.ALLOW_SOLICITATION AS \"allowSolicitation\",TN.COUNTRY_CODE AS \"countryCode\",TN.AREA_CODE AS \"areaCode\",TN.CONTACT_NUMBER AS \"contactNumber\" FROM PARTY PTY INNER JOIN PARTY_CONTACT_MECH PCM ON PTY.PARTY_ID = PCM.PARTY_ID INNER JOIN CONTACT_MECH CM ON PCM.CONTACT_MECH_ID = CM.CONTACT_MECH_ID INNER JOIN TELECOM_NUMBER TN ON CM.CONTACT_MECH_ID = TN.CONTACT_MECH_ID", resultSetMapping="PartyAndTelecomNumberMapping")
@SqlResultSetMapping(name="PartyAndTelecomNumberMapping", entities={
@EntityResult(entityClass=PartyAndTelecomNumber.class, fields = {
@FieldResult(name="contactMechId", column="contactMechId")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="partyTypeId", column="partyTypeId")
,@FieldResult(name="contactMechTypeId", column="contactMechTypeId")
,@FieldResult(name="infoString", column="infoString")
,@FieldResult(name="comments", column="comments")
,@FieldResult(name="extension", column="extension")
,@FieldResult(name="allowSolicitation", column="allowSolicitation")
,@FieldResult(name="countryCode", column="countryCode")
,@FieldResult(name="areaCode", column="areaCode")
,@FieldResult(name="contactNumber", column="contactNumber")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class PartyAndTelecomNumber extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("contactMechId", "CM.CONTACT_MECH_ID");
        fields.put("partyId", "PTY.PARTY_ID");
        fields.put("statusId", "PTY.STATUS_ID");
        fields.put("fromDate", "PCM.FROM_DATE");
        fields.put("thruDate", "PCM.THRU_DATE");
        fields.put("partyTypeId", "PTY.PARTY_TYPE_ID");
        fields.put("contactMechTypeId", "CM.CONTACT_MECH_TYPE_ID");
        fields.put("infoString", "CM.INFO_STRING");
        fields.put("comments", "PCM.COMMENTS");
        fields.put("extension", "PCM.EXTENSION");
        fields.put("allowSolicitation", "PCM.ALLOW_SOLICITATION");
        fields.put("countryCode", "TN.COUNTRY_CODE");
        fields.put("areaCode", "TN.AREA_CODE");
        fields.put("contactNumber", "TN.CONTACT_NUMBER");
fieldMapColumns.put("PartyAndTelecomNumber", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyAndTelecomNumber> {
    contactMechId("contactMechId"),
    partyId("partyId"),
    statusId("statusId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    partyTypeId("partyTypeId"),
    contactMechTypeId("contactMechTypeId"),
    infoString("infoString"),
    comments("comments"),
    extension("extension"),
    allowSolicitation("allowSolicitation"),
    countryCode("countryCode"),
    areaCode("areaCode"),
    contactNumber("contactNumber");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String contactMechId;
    @Id
   private String partyId;
    
   private String statusId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String partyTypeId;
    
   private String contactMechTypeId;
    
   private String infoString;
    
   private String comments;
    
   private String extension;
    
   private String allowSolicitation;
    
   private String countryCode;
    
   private String areaCode;
    
   private String contactNumber;
   private transient List<PartyContactMech> partyContactMeches = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTACT_MECH_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ContactMech contactMech = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTACT_MECH_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private TelecomNumber telecomNumber = null;

  /**
   * Default constructor.
   */
  public PartyAndTelecomNumber() {
      super();
      this.baseEntityName = "PartyAndTelecomNumber";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("contactMechId");this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("partyTypeId");this.allFieldsNames.add("contactMechTypeId");this.allFieldsNames.add("infoString");this.allFieldsNames.add("comments");this.allFieldsNames.add("extension");this.allFieldsNames.add("allowSolicitation");this.allFieldsNames.add("countryCode");this.allFieldsNames.add("areaCode");this.allFieldsNames.add("contactNumber");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyAndTelecomNumber(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param contactMechId the contactMechId to set
     */
    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
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
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
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
     * @param partyTypeId the partyTypeId to set
     */
    public void setPartyTypeId(String partyTypeId) {
        this.partyTypeId = partyTypeId;
    }
    /**
     * Auto generated value setter.
     * @param contactMechTypeId the contactMechTypeId to set
     */
    public void setContactMechTypeId(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }
    /**
     * Auto generated value setter.
     * @param infoString the infoString to set
     */
    public void setInfoString(String infoString) {
        this.infoString = infoString;
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
     * @param extension the extension to set
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }
    /**
     * Auto generated value setter.
     * @param allowSolicitation the allowSolicitation to set
     */
    public void setAllowSolicitation(String allowSolicitation) {
        this.allowSolicitation = allowSolicitation;
    }
    /**
     * Auto generated value setter.
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    /**
     * Auto generated value setter.
     * @param areaCode the areaCode to set
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    /**
     * Auto generated value setter.
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechId() {
        return this.contactMechId;
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
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
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
    public String getPartyTypeId() {
        return this.partyTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechTypeId() {
        return this.contactMechTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInfoString() {
        return this.infoString;
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
     * @return <code>String</code>
     */
    public String getExtension() {
        return this.extension;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAllowSolicitation() {
        return this.allowSolicitation;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAreaCode() {
        return this.areaCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactNumber() {
        return this.contactNumber;
    }

    /**
     * Auto generated method that gets the related <code>PartyContactMech</code> by the relation named <code>PartyContactMech</code>.
     * @return the list of <code>PartyContactMech</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PartyContactMech> getPartyContactMeches() throws RepositoryException {
        if (this.partyContactMeches == null) {
            this.partyContactMeches = getRelated(PartyContactMech.class, "PartyContactMech");
        }
        return this.partyContactMeches;
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
     * Auto generated method that gets the related <code>ContactMech</code> by the relation named <code>ContactMech</code>.
     * @return the <code>ContactMech</code>
     * @throws RepositoryException if an error occurs
     */
    public ContactMech getContactMech() throws RepositoryException {
        if (this.contactMech == null) {
            this.contactMech = getRelatedOne(ContactMech.class, "ContactMech");
        }
        return this.contactMech;
    }
    /**
     * Auto generated method that gets the related <code>TelecomNumber</code> by the relation named <code>TelecomNumber</code>.
     * @return the <code>TelecomNumber</code>
     * @throws RepositoryException if an error occurs
     */
    public TelecomNumber getTelecomNumber() throws RepositoryException {
        if (this.telecomNumber == null) {
            this.telecomNumber = getRelatedOne(TelecomNumber.class, "TelecomNumber");
        }
        return this.telecomNumber;
    }

    /**
     * Auto generated value setter.
     * @param partyContactMeches the partyContactMeches to set
    */
    public void setPartyContactMeches(List<PartyContactMech> partyContactMeches) {
        this.partyContactMeches = partyContactMeches;
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
     * @param contactMech the contactMech to set
    */
    public void setContactMech(ContactMech contactMech) {
        this.contactMech = contactMech;
    }
    /**
     * Auto generated value setter.
     * @param telecomNumber the telecomNumber to set
    */
    public void setTelecomNumber(TelecomNumber telecomNumber) {
        this.telecomNumber = telecomNumber;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setContactMechId((String) mapValue.get("contactMechId"));
        setPartyId((String) mapValue.get("partyId"));
        setStatusId((String) mapValue.get("statusId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setPartyTypeId((String) mapValue.get("partyTypeId"));
        setContactMechTypeId((String) mapValue.get("contactMechTypeId"));
        setInfoString((String) mapValue.get("infoString"));
        setComments((String) mapValue.get("comments"));
        setExtension((String) mapValue.get("extension"));
        setAllowSolicitation((String) mapValue.get("allowSolicitation"));
        setCountryCode((String) mapValue.get("countryCode"));
        setAreaCode((String) mapValue.get("areaCode"));
        setContactNumber((String) mapValue.get("contactNumber"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("contactMechId", getContactMechId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("partyTypeId", getPartyTypeId());
        mapValue.put("contactMechTypeId", getContactMechTypeId());
        mapValue.put("infoString", getInfoString());
        mapValue.put("comments", getComments());
        mapValue.put("extension", getExtension());
        mapValue.put("allowSolicitation", getAllowSolicitation());
        mapValue.put("countryCode", getCountryCode());
        mapValue.put("areaCode", getAreaCode());
        mapValue.put("contactNumber", getContactNumber());
        return mapValue;
    }


}