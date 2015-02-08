package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SCHOOL_SUBJECTS")
public class SchoolSubjects implements Serializable {

	@SequenceGenerator (name="seqSchoolSubjects", sequenceName="SEQ_SCHOOL_SUBJECTS", allocationSize=1)
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqSchoolSubjects")
	@Column(name="SUBJECT_CODE")
	private Integer subjectCode;
	
	@Column(name="SUBJECT_NAME")
	private String subjectName;
	
	@Column(name="SUBJECT_STATUS")
	private String subjectStatus;
	
	@Column(name="SUBJECT_INACTIVE_REASON")
	private String subjectInactiveReason;
	
	@Column(name="SUBJECT_INACTIVE_DATE_TIME")
	private String subjectInactiveDateTime;
	
	@Column(name="CREATED_USER_ID")
	private String createdUserId;
	
	@Column(name="MODIFIED_USER_ID")
	private String modifiedUserId;
	
	@Column(name="CREATED_DATE_TIME")
	private String createdDateTime;
	
	@Column(name="MODIFIED_DATE_TIME")
	private String modifiedDateTime;
	
	public Integer getSubjectCode(){
	 return subjectCode;
	}
	
	public void setSubjectCode(Integer subjectCode){
	 this.subjectCode=subjectCode;
	}
	
	public String getSubjectName(){
	 return subjectName;
	}
	
	public void setSubjectName(String subjectName){
	 this.subjectName=subjectName;
	}
	
	public String getSubjectStatus(){
	 return subjectStatus;
	}
	
	public void setSubjectStatus(String subjectStatus){
	 this.subjectStatus=subjectStatus;
	}
	
	public String getSubjectInactiveReason(){
	 return subjectInactiveReason;
	}
	
	public void setSubjectInactiveReason(String subjectInactiveReason){
	 this.subjectInactiveReason=subjectInactiveReason;
	}
	
	public String getSubjectInactiveDateTime(){
	 return subjectInactiveDateTime;
	}
	
	public void setSubjectInactiveDateTime(String subjectInactiveDateTime){
	 this.subjectInactiveDateTime=subjectInactiveDateTime;
	}
	
	public String getCreatedUserId(){
	 return createdUserId;
	}
	
	public void setCreatedUserId(String createdUserId){
	 this.createdUserId=createdUserId;
	}
	
	public String getModifiedUserId(){
	 return modifiedUserId;
	}
	
	public void setModifiedUserId(String modifiedUserId){
	 this.modifiedUserId=modifiedUserId;
	}
	
	public String getCreatedDateTime(){
	 return createdDateTime;
	}
	
	public void setCreatedDateTime(String createdDateTime){
	 this.createdDateTime=createdDateTime;
	}
	
	public String getModifiedDateTime(){
	 return modifiedDateTime;
	}
	
	public void setModifiedDateTime(String modifiedDateTime){
	 this.modifiedDateTime=modifiedDateTime;
	}

}