package com.datto.rmm.test.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;

/**
 * 
 * @author tejoakkala entity class
 */
@Entity
public class Device implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String uid;

	@Enumerated(EnumType.STRING)
	@Column(length = 4)
	private ProfileType profileType;
	private String hostName;
	private String description;
	private String ipAddress;
	private String extIpAddr;
	private String lastUser;
	private int agentVersion;
	private String model;
	private String os;
	private String serialNumber;
	private String motherboard;
	
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = CustomField.class)
//	@JoinTable(name = "Custom_Field", joinColumns = { @JoinColumn(name = "device_id") }, inverseJoinColumns = { @JoinColumn(name = "Field_ID") })
//	//@CollectionOfElements 
//	private Set<CustomField> customFields;
	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="device_id")
//	@MapKeyColumn(name="field_id")
	//private Map<Integer,CustomField> customFields;
	private String customField1;
	private String customField2;
	private String customField3;
	private String customField4;
	private String customField5;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getExtIpAddr() {
		return extIpAddr;
	}

	public void setExtIpAddr(String extIpAddr) {
		this.extIpAddr = extIpAddr;
	}

	public String getLastUser() {
		return lastUser;
	}

	public void setLastUser(String lastUser) {
		this.lastUser = lastUser;
	}

	public int getAgentVersion() {
		return agentVersion;
	}

	public void setAgentVersion(int agentVersion) {
		this.agentVersion = agentVersion;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}

//	public Set<CustomField> getCustomFields() {
//		return customFields;
//	}
//
//	public void setCustomFields(Set<CustomField> customFields) {
//		this.customFields = customFields;
//	}

	public ProfileType getProfileType() {
		return profileType;
	}

	public void setProfileType(ProfileType profileType) {
		this.profileType = profileType;
	}

	public String getCustomField1() {
		return customField1;
	}

	public void setCustomField1(String customField1) {
		this.customField1 = customField1;
	}

	public String getCustomField2() {
		return customField2;
	}

	public void setCustomField2(String customField2) {
		this.customField2 = customField2;
	}

	public String getCustomField3() {
		return customField3;
	}

	public void setCustomField3(String customField3) {
		this.customField3 = customField3;
	}

	public String getCustomField4() {
		return customField4;
	}

	public void setCustomField4(String customField4) {
		this.customField4 = customField4;
	}

	public String getCustomField5() {
		return customField5;
	}

	public void setCustomField5(String customField5) {
		this.customField5 = customField5;
	}

//	public Map<Integer, CustomField> getCustomFields() {
//		return customFields;
//	}
//
//	public void setCustomFields(Map<Integer, CustomField> customFields) {
//		this.customFields = customFields;
//	}

}
