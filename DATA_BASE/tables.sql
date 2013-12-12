CREATE TABLE "MYSCHOOL"."TEACHING_STAFF" (
    "TEACHING_STAFF_ID"     		VARCHAR2(12 BYTE) NOT NULL,
    "TEACHING_STAFF_TITLE"   		VARCHAR2(12 BYTE),
    "TEACHING_STAFF_GIVEN_FULL_NAME" 	VARCHAR2(75 BYTE) NOT NULL,
    "TEACHING_STAFF_SURNAME" 	VARCHAR2(25 BYTE),
    "TEACHING_STAFF_DOB"        	VARCHAR2 (11 BYTE) NOT NULL,
	"TEACHING_STAFF_GENDER"			VARCHAR2 (6 BYTE) NOT NULL,
	"TEACHING_STAFF_STATUS"			VARCHAR2 (9 BYTE), 
	"TEACHING_STAFF_QUALIFICATION"  VARCHAR2(120 BYTE) NOT NULL,
	"TEACHING_STAFF_DESIGNATION"	VARCHAR2(60 BYTE),
	"CLASS_TEACHER_FLAG"			VARCHAR2(3 BYTE) NOT NULL,
	"APPOINTMENT_TYPE"				VARCHAR2(9 BYTE),
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_AND_TIME"			VARCHAR2 (20),
	"MODIFIED_DATE_AND_TIME"		VARCHAR2 (20),
	
    CONSTRAINT "PK_TEACHING_STAFF_ID" PRIMARY KEY ("TEACHING_STAFF_ID"),
	CONSTRAINT "CK_TEACHING_STAFF_GENDER" CHECK (TEACHING_STAFF_GENDER IN ('MALE', 'FEMALE')) ENABLE,
	CONSTRAINT "CK_TEACHING_STAFF_STATUS" CHECK (TEACHING_STAFF_STATUS IN ('ACTIVE', 'NOT_ACTIVE')) ENABLE,
	CONSTRAINT "CK_CLASS_TEACHER_FLAG" CHECK (CLASS_TEACHER_FLAG IN ('YES', 'NO')) ENABLE,
	CONSTRAINT "CK_APPOINTMENT_TYPE" CHECK (APPOINTMENT_TYPE IN ('PERMANENT', 'CONTRACT')) ENABLE
)
  
CREATE TABLE "MYSCHOOL"."STUDENT_DETAILS" (
    "STUDENT_ROLL_NO"     			VARCHAR2(12 BYTE) NOT NULL,
    "STUDENT_TITLE"   				VARCHAR2(12 BYTE),
     "STUDENT_GIVEN_FULL_NAME" 	VARCHAR2(75 BYTE) NOT NULL,
    "STUDENT_SURNAME" 	VARCHAR2(25 BYTE),
    "STUDENT_DOB"        			VARCHAR2 (11 BYTE) NOT NULL,
	"STUDENT_GENDER"				VARCHAR2 (4 BYTE) NOT NULL,
	"STUDENT_FATHER_NAME"			VARCHAR2 (75 BYTE), 
	"STUDENT_MOTHER_NAME"  			VARCHAR2(75 BYTE),
	"STUDENT_GUARDIAN_NAME"			VARCHAR2(75 BYTE),
	"STUDENT_CLASS"					VARCHAR2(5 BYTE) NOT NULL,
	"STUDENT_SECTION"				VARCHAR2(5 BYTE),
	"STUDENT_CLASS_TEACHER"			VARCHAR2(75 BYTE),
	"STUDENT_STATUS"				VARCHAR2 (9 BYTE),
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_AND_TIME"			VARCHAR2 (20),
	"MODIFIED_DATE_AND_TIME"		VARCHAR2 (20),
	
    CONSTRAINT "PK_STUDENT_ROLL_NO" PRIMARY KEY ("STUDENT_ROLL_NO"),
	CONSTRAINT "CK_STUDENT_GENDER" CHECK (STUDENT_GENDER IN ('BOY', 'GIRL')) ENABLE,
	CONSTRAINT "CK_STUDENT_STATUS" CHECK (STUDENT_STATUS IN ('ACTIVE', 'NOT_ACTIVE')) ENABLE
)
  
CREATE TABLE "MYSCHOOL"."USER_DETAILS" (
    "USER_DETAILS_ID"     				VARCHAR2(12 BYTE) NOT NULL,
    "USER_NAME"   				VARCHAR2(18 BYTE),
	"PASSWORD"					VARCHAR2(60 BYTE),
	"USER_ROLE_ID"					NUMBER(2,0) NOT NULL,
    "USER_GIVEN_FULL_NAME" 	VARCHAR2(75 BYTE) NOT NULL,
    "USER_SURNAME" 	VARCHAR2(25 BYTE),
    "USER_DOB"        			VARCHAR2 (11 BYTE) NOT NULL,
	"USER_GENDER"				VARCHAR2 (4 BYTE) NOT NULL,	
	"USER_STATUS"				VARCHAR2 (8 BYTE) NOT NULL,
	"USER_MAIL_ID"				VARCHAR2 (80 BYTE) NOT NULL,
	"CHANGE_PASSWORD_QUESTION"	VARCHAR2 (90 BYTE) NOT NULL,
	"CHANGE_PASSWORD_ANSWER"		VARCHAR2 (25 BYTE) NOT NULL,
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_AND_TIME"		VARCHAR2 (20),
	"MODIFIED_DATE_AND_TIME"	VARCHAR2 (20),
	
    CONSTRAINT "PK_USER_ID" PRIMARY KEY ("USER_DETAILS_ID"),
	CONSTRAINT "CK_USER_GENDER" CHECK (USER_GENDER IN ('MALE', 'FEMALE')) ENABLE,
	CONSTRAINT "CK_USER_STATUS" CHECK (USER_STATUS IN ('ACTIVE', 'NOT_ACTIVE')) ENABLE
)

CREATE TABLE "MYSCHOOL"."USER_ROLE" (
    "USER_ROLE_ID"     				NUMBER(2,0) NOT NULL,
    "USER_ROLE_NAME"   				VARCHAR2(18 BYTE),
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_AND_TIME"		VARCHAR2 (20),
	"MODIFIED_DATE_AND_TIME"	VARCHAR2 (20),
	
    CONSTRAINT "PK_USER_ROLE_ID" PRIMARY KEY ("USER_ROLE_ID")	
)

CREATE TABLE "MYSCHOOL"."SCHOOL_CLASS" (
	"CLASS_ID"     				VARCHAR2(18 BYTE) NOT NULL,
    "CLASS_NAME"     			VARCHAR2(15 BYTE) NOT NULL,
    "SECTION"   				VARCHAR2(15 BYTE),	
    "TEACHING_STAFF_ID"     	VARCHAR2(12 BYTE),
    "CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_AND_TIME"		VARCHAR2 (20),
	"MODIFIED_DATE_AND_TIME"	VARCHAR2 (20),
	
    CONSTRAINT "PK_CLASS_ID" PRIMARY KEY ("CLASS_ID")
)

CREATE TABLE "MYSCHOOL"."CLASS_SUBJECTS" (
	"SUBJECT_ID"					VARCHAR2(12 BYTE) NOT NULL,	
    "CLASS_NAME"   					VARCHAR2(5 BYTE) NOT NULL,
	"SUBJECT_CODES"				VARCHAR2(300 BYTE),	
	"TOTAL_SUBJECTS"				NUMBER(2,0) NOT NULL,	
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_AND_TIME"			VARCHAR2 (20),
	"MODIFIED_DATE_AND_TIME"		VARCHAR2 (20),
	
	CONSTRAINT "PK_SUBJECT_ID" PRIMARY KEY ("SUBJECT_ID")
)

CREATE TABLE "MYSCHOOL"."SUBJECT_CODES" (
	"SUBJECT_CODE"					VARCHAR2(12 BYTE) NOT NULL,	
    "SUBJECT_NAME"				VARCHAR2(30 BYTE) NOT NULL,	
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_AND_TIME"			VARCHAR2 (20),
	"MODIFIED_DATE_AND_TIME"		VARCHAR2 (20),	
	CONSTRAINT "PK_SUBJECT_CODE" PRIMARY KEY ("SUBJECT_CODE")
)

CREATE TABLE "MYSCHOOL"."STUDENT_REPORT" (
	"STUDENT_REPORT_ID"					VARCHAR2(18 BYTE) NOT NULL,	
    "STUDENT_FULL_NAME"   				VARCHAR2(75 BYTE) NOT NULL,
	"STUDENT_DOB"        				VARCHAR2 (11 BYTE) NOT NULL,
	"STUDENT_GENDER"					VARCHAR2 (4 BYTE) NOT NULL,
	"CLASS_TEACHER_FULL_NAME"	        VARCHAR2(75 BYTE) NOT NULL,
	"TEST_NAME"							VARCHAR2(30 BYTE) NOT NULL,
	"SUBJECT_CODES_MARKS"					VARCHAR2(600 BYTE),	
	"SUBJECTS_FAILED"					NUMBER(2,0) NOT NULL,
	"TOTAL_MARKS"						NUMBER(6,2),
	"PERCENTAGE_OF_MARKS"				NUMBER(6,2),
	"RANK"								NUMBER(2,0),
	"GRADE"								VARCHAR2(2 BYTE),
	"TOTAL_PRESENT_DAYS"				NUMBER(3,0),
	"TOTAL_WORKING_DAYS"				NUMBER(3,0),
	"CREATED_USER_ID"					VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"					VARCHAR2(12 BYTE),
	"CREATED_DATE_AND_TIME"				VARCHAR2 (20),
	"MODIFIED_DATE_AND_TIME"			VARCHAR2 (20),
	
	CONSTRAINT "PK_STUDENT_REPORT_ID" PRIMARY KEY ("STUDENT_REPORT_ID"),
	CONSTRAINT "CK_RANK" CHECK (RANK IN ('1', '2', '3', '4', '5', '6', '7', '8', '9', '10')) ENABLE,
	CONSTRAINT "CK_GRADE" CHECK (GRADE IN ('A+', 'A', 'B+', 'B', 'C+', 'C')) ENABLE	
)

CREATE TABLE "MYSCHOOL"."STAFF_ADDRESS" (
	"STAFF_ADDRESS_ID"     			VARCHAR2(12 BYTE) NOT NULL,
	"ADDRESS_LINE_1"				VARCHAR2(30 BYTE),
	"ADDRESS_LINE_2"				VARCHAR2(30 BYTE),
	"ADDRESS_LINE_3"				VARCHAR2(30 BYTE),
	"ADDRESS_LINE_4"				VARCHAR2(30 BYTE),
	"ADDRESS_LINE_5"				VARCHAR2(30 BYTE),
	"ADDRESS_LINE_6"				VARCHAR2(30 BYTE),
	"PINCODE"						NUMBER(6,0) NOT NULL,
	"STATE"							VARCHAR2(30 BYTE),
	"COUNTRY"						VARCHAR2(60 BYTE),
	"PERSONAL_CONTACT_NUMBE"		VARCHAR2(60 BYTE),
	"EMERGENCY_CONTACT_NUMBER"		VARCHAR2(60 BYTE),
	"EMAIL_ID"						VARCHAR2(60 BYTE),
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_AND_TIME"			VARCHAR2 (20),
	"MODIFIED_DATE_AND_TIME"		VARCHAR2 (20),
	
	CONSTRAINT "PK_STAFF_ADDRESS_ID" PRIMARY KEY ("STAFF_ADDRESS_ID")
)

CREATE TABLE "MYSCHOOL"."STUDENT_ADDRESS" (
	"STUDENT_ADDRESS_ID"   			VARCHAR2(12 BYTE) NOT NULL,
	"STUDENT_ROLL_NO"   			VARCHAR2(12 BYTE),
	"CAREOFF_NAME"					VARCHAR2(75 BYTE),
	"ADDRESS_LINE_1"				VARCHAR2(30 BYTE),	
	"ADDRESS_LINE_2"				VARCHAR2(30 BYTE),
	"ADDRESS_LINE_3"				VARCHAR2(30 BYTE),
	"ADDRESS_LINE_4"				VARCHAR2(30 BYTE),
	"ADDRESS_LINE_5"				VARCHAR2(30 BYTE),
	"ADDRESS_LINE_6"				VARCHAR2(30 BYTE),
	"PINCODE"						NUMBER(6,0) NOT NULL,
	"STATE"							VARCHAR2(30 BYTE),
	"COUNTRY"						VARCHAR2(60 BYTE),
	"FATHER_CONTACT_NUMBER"			VARCHAR2(60 BYTE),
	"MOTHER_CONTACT_NUMBER"			VARCHAR2(60 BYTE),
	"GUARDAIN_CONTACT_NUMBER"		VARCHAR2(60 BYTE),
	"FATHER_OFFICE_NUMBER"			VARCHAR2(60 BYTE),
	"MOTHER_OFFICE_NUMBER"			VARCHAR2(60 BYTE),
	"GUARDAIN_OFFICE_NUMBER"		VARCHAR2(60 BYTE),
	"FATHER_EMAIL_ID"				VARCHAR2(60 BYTE),
	"MOTHER_EMAIL_ID"				VARCHAR2(60 BYTE),
	"GUARDAIN_EMAIL_ID"				VARCHAR2(60 BYTE),
	"FATHER_OCCUPATION"				VARCHAR2(200 BYTE),
	"MOTHER_OCCUPATION"				VARCHAR2(200 BYTE),
	"GUARDAIN_OCCUPATION"			VARCHAR2(200 BYTE),	
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_AND_TIME"			VARCHAR2 (20),
	"MODIFIED_DATE_AND_TIME"		VARCHAR2 (20),
	
	CONSTRAINT "PK_STUDENT_ADDRESS_ID" PRIMARY KEY ("STUDENT_ADDRESS_ID")
)


CREATE TABLE "MYSCHOOL"."TUTION_FEE_STRUCTUDE" (
	"TUTION_FEE_STRUCTUDE_ID"	VARCHAR2(12 BYTE) NOT NULL,
	"CLASS_NAME"   				VARCHAR2(5 BYTE) NOT NULL,
	"INSTALMENT_AMOUNT"   		NUMBER(15,2) NOT NULL,
	"NUMBER_OF_INSTALMENTS"		NUMBER(2,0) NOT NULL,
	"TOTAL_TUTION_FEE"			NUMBER(15,2) NOT NULL,		
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_AND_TIME"			VARCHAR2 (20),
	"MODIFIED_DATE_AND_TIME"		VARCHAR2 (20),
	
	CONSTRAINT "PK_TUTION_FEE_STRUCTUDE_ID" PRIMARY KEY ("TUTION_FEE_STRUCTUDE_ID")
)

CREATE TABLE "MYSCHOOL"."TUTION_FEE_PAYMENT" (
	"STUDNT_TUTIN_FEE_PYNT_ID"		VARCHAR2(18 BYTE) NOT NULL,
	"TOTAL_TUTION_FEE"   				VARCHAR2(15 BYTE) NOT NULL,
	"FEE_PAID"   						NUMBER(15,2) NOT NULL,
	"INSTALMENT_NUMBER"					NUMBER(2,0) NOT NULL,
	"BALANCE_TUTION_FEE"					NUMBER(15,2) NOT NULL,		
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_AND_TIME"			VARCHAR2 (20),
	"MODIFIED_DATE_AND_TIME"		VARCHAR2 (20),
	
	CONSTRAINT "PK_STUDNT_TUTIN_FEE_PYNT_ID" PRIMARY KEY ("STUDNT_TUTIN_FEE_PYNT_ID")
)
