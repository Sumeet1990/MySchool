CREATE TABLE "STAFF_ADDRESS" (
	`STAFF_ADDRESS_ID`     		BIGINT NOT NULL,
	`ADDRESS_LINE_1`			VARCHAR(30) NOT NULL,
	`ADDRESS_LINE_2`			VARCHAR(30),
	`ADDRESS_LINE_3`			VARCHAR(30),
	`ADDRESS_LINE_4`			VARCHAR(30),
	`ADDRESS_LINE_5`			VARCHAR(30),
	`ADDRESS_LINE_6`			VARCHAR(30),
	`PINCODE`					INT NOT NULL,
	`STATE`						VARCHAR(30) NOT NULL,
	`COUNTRY`					VARCHAR(30) NOT NULL,
	`PERSONAL_CONTACT_NUMBER`	VARCHAR(30) NOT NULL,
	`EMERGENCY_CONTACT_NUMBER`	VARCHAR(30),
	`EMAIL_ID`					VARCHAR(60),	
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
	CONSTRAINT `PK_STAFF_ADDRESS_ID` PRIMARY KEY (`STAFF_ADDRESS_ID`)
)
/
CREATE TABLE "STAFF_APPOINTMENT" (
	`APPOINTMENT_TYPE_ID`		BIGINT NOT NULL,	
    `APPOINTMENT_TYPE`			VARCHAR(30) NOT NULL,	
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`		VARCHAR(20),
	`MODIFIED_DATE_TIME`	VARCHAR(20),
	
	CONSTRAINT `PK_APPOINTMENT_TYPE_ID` PRIMARY KEY (`APPOINTMENT_TYPE_ID`)
)
/
CREATE TABLE "STAFF_DETAILS" (
	`STAFF_ID`     				BIGINT NOT NULL,	
	`STAFF_TITLE`   			VARCHAR(12),
	`STAFF_GIVEN_FULL_NAME` 	VARCHAR(75) NOT NULL,
	`STAFF_SURNAME` 			VARCHAR(25),
	`STAFF_DOB`        			VARCHAR(11) NOT NULL,
	`STAFF_GENDER`				VARCHAR(6) NOT NULL,		
	`STAFF_QUALIFICATION`  		VARCHAR(120) NOT NULL,
	`STAFF_DESIGNATION`			VARCHAR(60),
	`TEACHER_STAFF_FLAG`		VARCHAR(3) NOT NULL,
	`CLASS_TEACHER_FLAG`		VARCHAR(3) DEFAULT 'NO' NOT NULL,
	`SUBJECT_CODES_LIST`		VARCHAR(3),	
	`APPOINTMENT_TYPE_ID`		BIGINT,	
	`STAFF_STATUS`				VARCHAR(8) NOT NULL, 
	`PHOTO`						VARCHAR(3) NOT NULL,
	`STAFF_ADDRESS_ID`     		BIGINT NOT NULL,
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`		VARCHAR(20),
	`MODIFIED_DATE_TIME`	VARCHAR(20),
	
	CONSTRAINT `PK_STAFF_ID` PRIMARY KEY (`STAFF_ID`),
	FOREIGN KEY (`APPOINTMENT_TYPE_ID`) REFERENCES "STAFF_APPOINTMENT" (`APPOINTMENT_TYPE_ID`),
	FOREIGN KEY (`STAFF_ADDRESS_ID`) REFERENCES "STAFF_ADDRESS" (`STAFF_ADDRESS_ID`),
	CONSTRAINT `CK_STAFF_GENDER` CHECK (STAFF_GENDER IN ('MALE', 'FEMALE')),
	CONSTRAINT `CK_STAFF_STATUS` CHECK (STAFF_STATUS IN ('ACTIVE', 'INACTIVE')),
	CONSTRAINT `CK_TEACHER_STAFF_FLAG` CHECK (TEACHER_STAFF_FLAG IN ('YES', 'NO')),
	CONSTRAINT `CK_CLASS_TEACHER_FLAG` CHECK (CLASS_TEACHER_FLAG IN ('YES', 'NO')) 	
)
/
CREATE TABLE "USER_ROLE" (
	`USER_ROLES_ID`     		BIGINT NOT NULL,
	`USER_ROLES_NAME`   		VARCHAR(18) NOT NULL,	
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
    CONSTRAINT `PK_USER_ROLES_ID` PRIMARY KEY (`USER_ROLES_ID`)	
)
/
CREATE TABLE "USER_ROLE_ACCESS" (
	`USER_ROLE_ACCESS_ID`     	BIGINT NOT NULL,	
	`USER_ROLES_ID`     		BIGINT NOT NULL,	
	`MENU_CATEGORY`   			VARCHAR(18) NOT NULL,
	`MENU_SUB_CATEGORY`   		VARCHAR(18) NOT NULL,
	`CREATE_ADD`		   		VARCHAR(18),
	`MODIFY_EDIT`   			VARCHAR(18),
	`DELETE_REMOVE`		   		VARCHAR(18),
	`VIEW_SHOW`			   		VARCHAR(18),
	`MIGRATE`			   		VARCHAR(18),	
	`GENERATE` 					VARCHAR(18),	
	`SMS`				   		VARCHAR(18),
	`EMAIL`				   		VARCHAR(18),	
	`COLLECT`			   		VARCHAR(18),
	`ASSIGN`					VARCHAR(18),
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
    CONSTRAINT `PK_USER_ROLE_ACCESS_ID` PRIMARY KEY (`USER_ROLE_ACCESS_ID`),
	FOREIGN KEY (`USER_ROLES_ID`) REFERENCES "USER_ROLE" (`USER_ROLES_ID`)
)
/
CREATE TABLE "USER_DETAILS" (
	`USER_ID`     				BIGINT NOT NULL,
	`USER_NAME`   				VARCHAR(18) NOT NULL UNIQUE,
	`USER_ROLES_ID`     		BIGINT NOT NULL,
	`PASSWORD`					VARCHAR(18) NOT NULL,
	`USER_GIVEN_FULL_NAME` 		VARCHAR(75) NOT NULL,
	`USER_SURNAME` 				VARCHAR(25),
	`USER_DOB`        			VARCHAR(11) NOT NULL,
	`USER_GENDER`				VARCHAR(6) NOT NULL,	
	`USER_STATUS`				VARCHAR(8) NOT NULL,	
	`INVALID_ATTEMPTS`			TINYINT DEFAULT 0 NOT NULL ,
	`STAFF_ADDRESS_ID`			BIGINT NOT NULL,
	`STAFF_ID`					BIGINT,
	`SECURITY_QUESTION`			VARCHAR(90) NOT NULL,
	`SECURITY_ANSWER`			VARCHAR(25) NOT NULL,	
	`LAST_LOGEDIN_DATE_TIME`	VARCHAR(20) NOT NULL,
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`		VARCHAR(20),
	`MODIFIED_DATE_TIME`	VARCHAR(20),
	
    CONSTRAINT `PK_USER_ID` PRIMARY KEY (`USER_ID`),
	FOREIGN KEY (`USER_ROLES_ID`) REFERENCES "USER_ROLE" (`USER_ROLES_ID`),
	FOREIGN KEY (`STAFF_ADDRESS_ID`) REFERENCES "STAFF_ADDRESS" (`STAFF_ADDRESS_ID`),
   	CONSTRAINT `CK_USER_GENDER` CHECK (USER_GENDER IN ('MALE', 'FEMALE')),	
	CONSTRAINT `CK_USER_STATUS` CHECK (USER_STATUS IN ('ACTIVE', 'NOT_ACTIVE'))	
)
/
CREATE TABLE "STAFF_LEAVES" (
	`STAFFT_LEAVES_ID` 				BIGINT NOT NULL, 	
	`STAFF_LEAVE_TYPE`	     		VARCHAR(30) NOT NULL,			
	`MAX_LEAVE_DAYS`				SMALLINT NOT NULL,
	`MAX_CONSECUTIVE_LEAVE_DAYS`	VARCHAR(12),
	`CREATED_USER_ID`				VARCHAR(12),
	`MODIFIED_USER_ID`				VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
    CONSTRAINT `PK_STAFF_LEAVES_ID` PRIMARY KEY (`STAFFT_LEAVES_ID`)   
)
/
CREATE TABLE "STAFF_ATTENDANCE" (
	`STAFFT_ATTENDANCE_ID`	 	BIGINT NOT NULL, 
	`STAFF_ID`     				BIGINT NOT NULL,	
	`STAFFT_LEAVES_ID` 			BIGINT NOT NULL, 		
	`REASON`		     		VARCHAR(30) NOT NULL,
	`LEAVE_FROM`				VARCHAR(12) NOT NULL,
	`LEAVE_TO`					VARCHAR(12) NOT NULL,
	`NO_OF_DAYS`				SMALLINT NOT NULL,
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`		VARCHAR(20),
	`MODIFIED_DATE_TIME`	VARCHAR(20),
	
    CONSTRAINT `PK_STAFF_ATTENDANCE_ID` PRIMARY KEY (`STAFFT_ATTENDANCE_ID`),
	FOREIGN KEY (`STAFFT_LEAVES_ID`) REFERENCES "STAFF_LEAVES" (`STAFFT_LEAVES_ID`),	
    FOREIGN KEY (`STAFF_ID`) REFERENCES "STAFF_DETAILS" (`STAFF_ID`)			
)
/
CREATE TABLE "SCHOOL_CLASS" (
	`SCHOOL_CLASS_ID`     		BIGINT NOT NULL,	
	`SCHOOL_CLASS_NAME`     	VARCHAR(30) NOT NULL UNIQUE,
	`MIN_AGE_CRITERIA`			TINYINT NOT NULL,		
	`MAX_AGE_CRITERIA`			TINYINT NOT NULL,		
	`PERIODS_PER_DAY`     		TINYINT NOT NULL,	
	`PERIOD_MINUTES_DURATION`	DECIMAL(30,0) NOT NULL,	
	`TEACHER_PERIODS_PER_DAY`	TINYINT NOT NULL,		
	`SUBJECT_CODES_LIST`				VARCHAR(300),	
	`CLASS_MAXIMUM_STRENGTH`	SMALLINT,	
	`CLASS_STATUS`				VARCHAR(8),
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`		VARCHAR(20),
	`MODIFIED_DATE_TIME`	VARCHAR(20),
	
    CONSTRAINT `PK_SCHOOL_CLASS_ID` PRIMARY KEY (`SCHOOL_CLASS_ID`),
	CONSTRAINT `CK_CLASS_STATUS` CHECK (CLASS_STATUS IN ('ACTIVE', 'INACTIVE')) 	
)
/
CREATE TABLE "CLASS_SECTION" (
	`CLASS_SECTION_ID` 			BIGINT NOT NULL,	
	`SCHOOL_CLASS_ID`     		BIGINT NOT NULL,	
	`SECTION`					VARCHAR(30) NOT NULL,
	`STAFF_ID`     				BIGINT NOT NULL,
	`SECTION_MAXIMUM_STRENGTH`	SMALLINT,	
	`SECTION_STATUS`			VARCHAR(8),
	`MIGRATION_STATUS`			SMALLINT,
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`		VARCHAR(20),
	`MODIFIED_DATE_TIME`	VARCHAR(20),
	
    CONSTRAINT `PK_CLASS_SECTION_ID` PRIMARY KEY (`CLASS_SECTION_ID`),
    FOREIGN KEY (`SCHOOL_CLASS_ID`) REFERENCES "SCHOOL_CLASS" (`SCHOOL_CLASS_ID`),
    FOREIGN KEY (`STAFF_ID`) REFERENCES "STAFF_DETAILS" (`STAFF_ID`),
	CONSTRAINT `CK_SECTION_STATUS` CHECK (SECTION_STATUS IN ('ACTIVE', 'INACTIVE')) 
)
/
CREATE TABLE "SCHOOL_TIMINGS" (
	`SCHOOL_TIMINGS_ID`    		BIGINT NOT NULL,	
	`SCHOOL_CLASS_ID`     		BIGINT NOT NULL,		
	`ACADEMIC_OPENING_DAY`		VARCHAR(20),
	`ACADEMIC_CLOSING_DAY`		VARCHAR(20),
	`TIMING_DURATION_FROM`		VARCHAR(20) NOT NULL,
	`TIMING_DURATION_TO`		VARCHAR(20) NOT NULL,
	`WEEK_DAY`		     		VARCHAR(9) NOT NULL,		
	`SCHOOL_START_TIME`		    VARCHAR(20) NOT NULL,
	`START_OFFSET_TIME`		    VARCHAR(20),
	`OFFSET_TIME_MEASURE`     	VARCHAR(20),
	`SCHOOL_FINISH_TIME`		VARCHAR(20) NOT NULL,		
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`		VARCHAR(20),
	`MODIFIED_DATE_TIME`	VARCHAR(20),
	
    CONSTRAINT `PK_SCHOOL_TIMINGS_ID` PRIMARY KEY (`SCHOOL_TIMINGS_ID`),
	FOREIGN KEY (`SCHOOL_CLASS_ID`) REFERENCES "SCHOOL_CLASS" (`SCHOOL_CLASS_ID`),
	CONSTRAINT `CK_WEEK_DAY` CHECK (WEEK_DAY IN ('SUNDAY','MONDAY', 'TUESDAY', 'WEDNESDAY','THURSDAY','FRIDAY','SATURDAY'))	
)
/
CREATE TABLE "SCHOOL_SUBJECTS" (
	`SUBJECT_CODE`				BIGINT NOT NULL,	
    `SUBJECT_NAME`				VARCHAR(60) NOT NULL,	
    `SUBJECT_STATUS`			VARCHAR(9) DEFAULT 'ACTIVE' NOT NULL,
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`		VARCHAR(20),
	`MODIFIED_DATE_TIME`	VARCHAR(20),
	
	CONSTRAINT `PK_SUBJECT_CODE` PRIMARY KEY (`SUBJECT_CODE`),
	CONSTRAINT `CK_SUBJECT_STATUS` CHECK (SUBJECT_STATUS IN ('ACTIVE', 'NOT_ACTIVE'))
)
/
CREATE TABLE "CLASS_EXAMS" (
	`CLASS_EXAMS_ID`			VARCHAR(12) NOT NULL,
	`SCHOOL_CLASS_ID`     		BIGINT NOT NULL,	
	`EXAM_NAME`					VARCHAR(30) NOT NULL,	
	`EXAM_START_DATE`			VARCHAR(30),
	`EXAM_END_DATE`				VARCHAR(30),
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
	CONSTRAINT `PK_CLASS_EXAMS_ID` PRIMARY KEY (`CLASS_EXAMS_ID`),
	 FOREIGN KEY (`SCHOOL_CLASS_ID`) REFERENCES "SCHOOL_CLASS" (`SCHOOL_CLASS_ID`) 
)
/
CREATE TABLE "EXAM_SUBJECT_SCHEDULE" (
	`EXAM_SUBJECT_SCHEDULE_ID`	BIGINT NOT NULL,
	`SCHOOL_CLASS_ID`     		BIGINT NOT NULL,
	`EXAM_NAME` 				VARCHAR(30) NOT NULL,	
	`SUBJECT_NAME`				VARCHAR(20) NOT NULL,				
	`SUBJECT_EXAM_DATE`			VARCHAR(12) NOT NULL,		
	`SYLLABUS`					VARCHAR(300),
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
	CONSTRAINT `PK_EXAM_SUBJECT_SCHEDULE_ID` PRIMARY KEY (`EXAM_SUBJECT_SCHEDULE_ID`),
	FOREIGN KEY (`SCHOOL_CLASS_ID`) REFERENCES "SCHOOL_CLASS" (`SCHOOL_CLASS_ID`) 
)
/
CREATE TABLE "GENERAL_HOLIDAY_LIST" (
	`GENERAL_HOLIDAY_ID`		BIGINT NOT NULL,
	`GENERAL_HOLIDAY_FOR`  		VARCHAR(30) NOT NULL,	
	`GENERAL_HOLIDAY_FROM`		VARCHAR(20),		
	`GENERAL_HOLIDAY_TO`		VARCHAR(20),
	`NO_OF_DAYS`				TINYINT DEFAULT 0 NOT NULL ,
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
	CONSTRAINT `PK_GENERAL_HOLIDAY_ID` PRIMARY KEY (`GENERAL_HOLIDAY_ID`)	
)

/
CREATE TABLE "CLASS_HOLIDAY_LIST" (
	`CLASS_HOLIDAY_ID`			BIGINT NOT NULL,
	`SCHOOL_CLASS_ID`     		BIGINT NOT NULL,
	`LASS_HOLIDAY_FOR`  		VARCHAR(30)NULL,	
	`LASS_HOLIDAY_FROM`			VARCHAR(20),		
	`LASS_HOLIDAY_TO`			VARCHAR(20),	
	`NO_OF_DAYS`				TINYINT DEFAULT 0 NOT NULL,
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
	CONSTRAINT `PK_CLASS_HOLIDAY_ID` PRIMARY KEY (`CLASS_HOLIDAY_ID`),
	FOREIGN KEY (`SCHOOL_CLASS_ID`) REFERENCES "SCHOOL_CLASS" (`SCHOOL_CLASS_ID`) 
)
/
CREATE TABLE "GENERAL_EVENTS" (
	`GENERAL_EVENT_ID`			BIGINT NOT NULL,
	`GENERAL_EVENT_NAME`  		VARCHAR(30) NOT NULL,	
	`GENERAL_EVENT_FROM`		VARCHAR(20),		
	`GENERAL_EVENT_TO`			VARCHAR(20),	
	`NO_OF_DAYS`				TINYINT DEFAULT 0 NOT NULL,
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`		VARCHAR(20),
	`MODIFIED_DATE_TIME`	VARCHAR(20),
	
	CONSTRAINT `PK_GENERAL_EVENT_ID` PRIMARY KEY (`GENERAL_EVENT_ID`)	
)
/
CREATE TABLE "CLASS_EVENTS" (    
	`CLASS_EVENT_ID`			BIGINT NOT NULL,
	`SCHOOL_CLASS_ID`     		BIGINT NOT NULL,
	`CLASS_EVENT_NAME` 			VARCHAR(30) NOT NULL,	
	`CLASS_EVENT_FROM`			VARCHAR(20),		
	`CLASS_EVENT_TO`			VARCHAR(20),
	`NO_OF_DAYS`				TINYINT DEFAULT 0 NOT NULL,
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
	CONSTRAINT `PK_CLASS_EVENT_ID` PRIMARY KEY (`CLASS_EVENT_ID`),
	 FOREIGN KEY (`SCHOOL_CLASS_ID`) REFERENCES "SCHOOL_CLASS" (`SCHOOL_CLASS_ID`) 
)
/
CREATE TABLE "STUDENT_ADDRESS" (
	`STUDENT_ADDRESS_ID`   		BIGINT NOT NULL,
	`CAREOFF_NAME`				VARCHAR(75),
	`ADDRESS_LINE_1`			VARCHAR(30),	
	`ADDRESS_LINE_2`			VARCHAR(30),
	`ADDRESS_LINE_3`			VARCHAR(30),
	`ADDRESS_LINE_4`			VARCHAR(30),
	`ADDRESS_LINE_5`			VARCHAR(30),
	`ADDRESS_LINE_6`			VARCHAR(30),
	`PINCODE`					INT NOT NULL,
	`STATE`						VARCHAR(30) NOT NULL,
	`COUNTRY`					VARCHAR(60) NOT NULL,
	`FATHER_CONTACT_NUMBER`		VARCHAR(60),
	`MOTHER_CONTACT_NUMBER`		VARCHAR(60),
	`GUARDAIN_CONTACT_NUMBER`	VARCHAR(60),
	`FATHER_WORK_NUMBER`		VARCHAR(60),
	`MOTHER_WORK_NUMBER`		VARCHAR(60),
	`GUARDAIN_WORK_NUMBER`		VARCHAR(60),
	`FATHER_EMAIL_ID`			VARCHAR(60),
	`SEND_MAIL_TO_FATHER`		VARCHAR(3),
	`MOTHER_EMAIL_ID`			VARCHAR(60),
	`SEND_MAIL_TO_MOTHER`		VARCHAR(3),
	`GUARDAIN_EMAIL_ID`			VARCHAR(60),
	`SEND_MAIL_TO_GUARDAIN`		VARCHAR(3),
	`FATHER_OCCUPATION`			VARCHAR(200),
	`MOTHER_OCCUPATION`			VARCHAR(200),
	`GUARDAIN_OCCUPATION`		VARCHAR(200),	
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
	CONSTRAINT `PK_STUDENT_ADDRESS_ID` PRIMARY KEY (`STUDENT_ADDRESS_ID`)
)
/
CREATE TABLE "STUDENT_REGISTRATION" (
	`STUDENT_REG_DETAILS_ID` 	BIGINT NOT NULL, 
	`STUDENT_REGISTRATION_ID` 	BIGINT NOT NULL, 	
	`STUDENT_TITLE`   			VARCHAR(12),
	`STUDENT_GIVEN_FULL_NAME` 	VARCHAR(75) NOT NULL,
	`STUDENT_SURNAME` 			VARCHAR(25),
	`STUDENT_DOB`        		VARCHAR(11) NOT NULL,
	`STUDENT_GENDER`			VARCHAR(4) NOT NULL,
	`MOTHER_TOUNGE`				VARCHAR(30),
	`STUDENT_FATHER_NAME`		VARCHAR(75), 
	`STUDENT_MOTHER_NAME`  		VARCHAR(75),
	`STUDENT_GUARDIAN_NAME`		VARCHAR(75),
	`ADMISSION_CLASS`			VARCHAR(5) NOT NULL,
	`ADMISSION_SECTION`			VARCHAR(5),
	`STUDENT_CLASS_TEACHER`		VARCHAR(75),
	`STUDENT_STATUS`			VARCHAR(9),
	`STUDENT_ADDRESS_ID`   		BIGINT NOT NULL,	
	`ADMISSION_DATE`   			VARCHAR(20),
	`PHOTO`						VARCHAR(3) NOT NULL,	
	`TRANSPORTATION_REQUIRED`	BIGINT NOT NULL,
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
    CONSTRAINT `PK_STUDENT_REGISTRATION_ID` PRIMARY KEY (`STUDENT_REGISTRATION_ID`),
    FOREIGN KEY (`STUDENT_ADDRESS_ID`) REFERENCES "STUDENT_ADDRESS" (`STUDENT_ADDRESS_ID`),
	CONSTRAINT `CK_STUDENT_GENDER` CHECK (STUDENT_GENDER IN ('BOY', 'GIRL')),
	CONSTRAINT `CK_STUDENT_STATUS` CHECK (STUDENT_STATUS IN ('ACTIVE', 'NOT_ACTIVE')),
	CONSTRAINT `CK_TRANSPORT_REQUIRED` CHECK (STUDENT_STATUS IN ('NO', 'PICKUP', 'DROP', 'BOTH')) 
)
/
CREATE TABLE "STUDENT_CURRENT_DETAILS" (
	`STUDENT_CURRENT_DETAILS_ID`	BIGINT NOT NULL,
	`STUDENT_REGISTRATION_ID` 		BIGINT NOT NULL,  	
	`STUDENT_ROLL_NO` 				BIGINT NOT NULL,
	`CLASS_SECTION_ID` 				BIGINT NOT NULL,
	`FINAL_EXAM_RESULT` 			VARCHAR(8),		
	`CREATED_USER_ID`				VARCHAR(12),
	`MODIFIED_USER_ID`				VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
    CONSTRAINT `PK_STUDENT_CURRENT_DETAILS_ID` PRIMARY KEY (`STUDENT_CURRENT_DETAILS_ID`),
    FOREIGN KEY (`STUDENT_REGISTRATION_ID`) REFERENCES "STUDENT_REGISTRATION" (`STUDENT_REGISTRATION_ID`),
	FOREIGN KEY (`CLASS_SECTION_ID`) REFERENCES "CLASS_SECTION" (`CLASS_SECTION_ID`),
	CONSTRAINT `CK_FINAL_EXAM_RESULT` CHECK (FINAL_EXAM_RESULT IN ('PROMOTED', 'FAILED')) 	
)
/
CREATE TABLE "STUDENT_ATTENDANCE" (
	`STUDENT_ATTENDANCE_ID` 	BIGINT NOT NULL, 
	`STUDENT_ROLL_NO`     		VARCHAR(12) NOT NULL,
	`CLASS_SECTION_ID`     		BIGINT NOT NULL,
	`LEAVE_ABSENT`     			VARCHAR(6) NOT NULL,	
	`REASON`		     		VARCHAR(30) NOT NULL,
	`LEAVE_ABSENT_FROM`			VARCHAR(12) NOT NULL,
	`LEAVE_ABSENT_TO`			VARCHAR(12) NOT NULL,
	`NO_OF_DAYS`				SMALLINT NOT NULL,
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`		VARCHAR(20),
	`MODIFIED_DATE_TIME`	VARCHAR(20),
	
    CONSTRAINT `PK_STUDENT_ATTENDANCE_ID` PRIMARY KEY (`STUDENT_ATTENDANCE_ID`),	
	FOREIGN KEY (`CLASS_SECTION_ID`) REFERENCES "CLASS_SECTION" (`CLASS_SECTION_ID`),
	CONSTRAINT `CK_LEAVE_ABSENT` CHECK (LEAVE_ABSENT IN ('LEAVE', 'ABESNT')) 	
)
/
CREATE TABLE "STUDENT_REPORT" (
	`STUDENT_REPORT_ID`			VARCHAR(18) NOT NULL,
	`STUDENT_REGISTRATION_ID` 	BIGINT NOT NULL, 
	`STUDENT_ROLL_NO`     		VARCHAR(12) NOT NULL,
	`SCHOOL_CLASS_NAME`     	VARCHAR(30) NOT NULL,
	`SECTION`     				VARCHAR(30) NOT NULL,   
	`TEST_NAME`					VARCHAR(30) NOT NULL,
	`SUBJECT_CODES_MARKS`		VARCHAR(600) NOT NULL,	
	`SUBJECTS_FAILED`			TINYINT DEFAULT 0 NOT NULL,
	`TOTAL_MARKS`				DECIMAL(6,2),
	`PERCENTAGE_OF_MARKS`		DECIMAL(6,2),
	`RANK`						TINYINT,
	`GRADE`						VARCHAR(2),
	`EXAM_RESULT`				VARCHAR(4),
	`TOTAL_PRESENT_DAYS`		SMALLINT NOT NULL,	
	`TOTAL_LEAVE_DAYS`			SMALLINT DEFAULT 0 NOT NULL ,
	`TOTAL_ABSENT_DAYS`			SMALLINT DEFAULT 0 NOT NULL ,
	`TOTAL_WORKING_DAYS`		SMALLINT NOT NULL,
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
	CONSTRAINT `PK_STUDENT_REPORT_ID` PRIMARY KEY (`STUDENT_REPORT_ID`),	 
	FOREIGN KEY (`STUDENT_REGISTRATION_ID`) REFERENCES "STUDENT_REGISTRATION" (`STUDENT_REGISTRATION_ID`),
	CONSTRAINT `CK_RANK` CHECK (RANK IN ('1', '2', '3', '4', '5', '6', '7', '8', '9', '10')),
	CONSTRAINT `CK_GRADE` CHECK (GRADE IN ('A+', 'A', 'B+', 'B', 'C+', 'C'))			
)
/
CREATE TABLE "SCHOOL_ACHIVENETS" (
	`SCHOOL_ACHIVENETS_ID`		BIGINT NOT NULL,
	`EVENT`     				VARCHAR(12) NOT NULL,
	`ACHIEVEMENT_FOR`			VARCHAR(12) NOT NULL,	
	`STAFF_ID` 					BIGINT,
	`STUDENT_ROLL_NO`			BIGINT,
	`ACHIEVEMENT_DATE`			VARCHAR(12),	
	`DOCUMENT`					VARCHAR(3) NOT NULL,	
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
	CONSTRAINT `PK_SCHOOL_ACHIVENETS_ID` PRIMARY KEY (`SCHOOL_ACHIVENETS_ID`),
	FOREIGN KEY (`STAFF_ID`) REFERENCES "STAFF_DETAILS" (`STAFF_ID`)  
)
/
CREATE TABLE "TUTION_FEE_STRUCTURE" (
	`TUTION_FEE_STRUCTURE_ID`	BIGINT NOT NULL,
	`SCHOOL_CLASS_ID`     		BIGINT NOT NULL,	
	`AMOUNT_PER_INSTALMENT` 	DECIMAL(15,2),
	`NUMBER_OF_INSTALMENTS`		TINYINT,
	`TOTAL_TUTION_FEE`			DECIMAL(15,2) NOT NULL,		
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
	CONSTRAINT `PK_TUTION_FEE_STRUCTURE_ID` PRIMARY KEY (`TUTION_FEE_STRUCTURE_ID`),
	FOREIGN KEY (`SCHOOL_CLASS_ID`) REFERENCES "SCHOOL_CLASS" (`SCHOOL_CLASS_ID`) 
)
/
CREATE TABLE "TUTION_FEE_PAYMENT" (
	`STUDNT_TUTIN_FEE_PYNT_ID`	VARCHAR(18) NOT NULL,
	`STUDENT_ROLL_NO`     		VARCHAR(12) NOT NULL,
	`TUTION_FEE_STRUCTURE_ID`	BIGINT NOT NULL,
	`SCHOOL_CLASS_ID`     		BIGINT NOT NULL,	
	`TUTION_FEE_PAID_RCPT_NO`	BIGINT NOT NULL,
	`FEE_PAID`   				DECIMAL(15,2) NOT NULL,
	`INSTALMENT_NUMBER`			TINYINT NOT NULL,
	`BALANCE_TUTION_FEE`		DECIMAL(15,2) NOT NULL,	
	`PAYMENT_MODE`				VARCHAR(30),	
	`PAYMENT_DATE_TIME`			VARCHAR(20),	
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
	CONSTRAINT `PK_STUDNT_TUTIN_FEE_PYNT_ID` PRIMARY KEY (`STUDNT_TUTIN_FEE_PYNT_ID`),	 
	FOREIGN KEY (`TUTION_FEE_STRUCTURE_ID`) REFERENCES "TUTION_FEE_STRUCTURE" (`TUTION_FEE_STRUCTURE_ID`),
	FOREIGN KEY (`SCHOOL_CLASS_ID`) REFERENCES "SCHOOL_CLASS" (`SCHOOL_CLASS_ID`) 
)
/
CREATE TABLE "OTHER_FEE_STRUCTURE" (
	`OTHER_FEE_STRUCTURE_ID`	BIGINT NOT NULL,
	`SCHOOL_CLASS_ID`     		BIGINT NOT NULL,	
	`OTHER_FEE_NAME`   			VARCHAR(60) NOT NULL UNIQUE,
	`OTHER_FEE_AMOUNT`			DECIMAL(15,2),	
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
	CONSTRAINT `PK_OTHER_FEE_STRUCTURE_ID` PRIMARY KEY (`OTHER_FEE_STRUCTURE_ID`),
	FOREIGN KEY (`SCHOOL_CLASS_ID`) REFERENCES "SCHOOL_CLASS" (`SCHOOL_CLASS_ID`) 
)
/
CREATE TABLE "OTHER_FEE_PAYMENT" (
	`OTHER_FEE_PYNT_ID`				BIGINT NOT NULL,
	`STUDENT_ROLL_NO`     			VARCHAR(12) NOT NULL,
	`OTHER_FEE_STRUCTURE_ID`		BIGINT NOT NULL,
	`OTHER_FEE_PAID_RCPT_NO`		BIGINT NOT NULL,
	`SCHOOL_CLASS_ID`     			BIGINT NOT NULL,
	`OTHER_FEE_NAME`   				VARCHAR(60),
	`OTHER_FEE_AMOUNT_PAID`			BIGINT,
	`OTHER_FEE_AMOUNT_BALANCE`		BIGINT,
	`PAYMENT_MODE`					VARCHAR(30),	
	`PAYMENT_DATE_TIME`				VARCHAR(20),
	`CREATED_USER_ID`				VARCHAR(12),
	`MODIFIED_USER_ID`				VARCHAR(12),
	`CREATED_DATE_TIME`				VARCHAR(20),
	`MODIFIED_DATE_TIME`			VARCHAR(20),
	
	CONSTRAINT `PK_OTHER_FEE_PYNT_ID` PRIMARY KEY (`OTHER_FEE_PYNT_ID`),	 
	 FOREIGN KEY (`OTHER_FEE_STRUCTURE_ID`) REFERENCES "OTHER_FEE_STRUCTURE" (`OTHER_FEE_STRUCTURE_ID`),
	 FOREIGN KEY (`SCHOOL_CLASS_ID`) REFERENCES "SCHOOL_CLASS" (`SCHOOL_CLASS_ID`) 
)
/
CREATE TABLE "VEHICLE_DETAILS" (
	`VEHICLE_DETAILS_ID`			BIGINT NOT NULL,
	`VEHICLE_REG_NO`				VARCHAR(12) NOT NULL UNIQUE,	
	`VEHICLE_RC_NO`					VARCHAR(12) NOT NULL UNIQUE,
	`POLUTION_DUE_DATE`				VARCHAR(6) NOT NULL,	
	`INSURANCE_DUE_DATE`			VARCHAR(500) NOT NULL,	
	`CREATED_USER_ID`				VARCHAR(12),
	`SEATION_CAPACITY_EXC_DRIVER` 	VARCHAR(12),
	`MODIFIED_USER_ID`				VARCHAR(12),
	`CREATED_DATE_TIME`				VARCHAR(20),
	`MODIFIED_DATE_TIME`			VARCHAR(20),
	
	CONSTRAINT `PK_VEHICLE_DETAILS_ID` PRIMARY KEY (`VEHICLE_DETAILS_ID`)	
)
/
CREATE TABLE "DRIVER_DETAILS" (
	`DRIVER_DETAILS_ID`			BIGINT NOT NULL,
	`DRIVER_TITLE`   			VARCHAR(12),
	`DRIVER_GIVEN_FULL_NAME` 	VARCHAR(75) NOT NULL,
	`DRIVER_SURNAME` 			VARCHAR(25),
	`DRIVER_DOB`        		VARCHAR(11) NOT NULL,
	`DRIVER_GENDER`				VARCHAR(6) NOT NULL,
	`DRIVER_STATUS`				VARCHAR(8) NOT NULL, 
	`DRIVER_QUALIFICATION`  	VARCHAR(120) NOT NULL,
	`PHOTO`						VARCHAR(3) NOT NULL,
	`DRIVER_LICENSE_NO`			VARCHAR(30) NOT NULL,
	`LICENSE_EXP_DATE`			VARCHAR(20),
	`ADDRESS_LINE_1`			VARCHAR(30) NOT NULL,
	`ADDRESS_LINE_2`			VARCHAR(30),
	`ADDRESS_LINE_3`			VARCHAR(30),
	`ADDRESS_LINE_4`			VARCHAR(30),
	`ADDRESS_LINE_5`			VARCHAR(30),
	`ADDRESS_LINE_6`			VARCHAR(30),
	`PINCODE`					INT NOT NULL,
	`STATE`						VARCHAR(30) NOT NULL,
	`COUNTRY`					VARCHAR(30) NOT NULL,
	`PERSONAL_CONTACT_NUMBER`	VARCHAR(30) NOT NULL,
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
	CONSTRAINT `PK_DRIVER_DETAILS_ID` PRIMARY KEY (`DRIVER_DETAILS_ID`),	
	CONSTRAINT `CK_DRIVER_GENDER` CHECK (DRIVER_GENDER IN ('MALE', 'FEMALE')),
	CONSTRAINT `CK_DRIVER_STATUS` CHECK (DRIVER_STATUS IN ('ACTIVE', 'INACTIVE'))
)
/
CREATE TABLE "TRANSPORT_ROUT_DETAILS" (
	`TRANSPORTATION_ID`			BIGINT NOT NULL,
	`ROUT_NO`     				VARCHAR(12) NOT NULL UNIQUE,	
	`VEHICLE_REG_NO`			VARCHAR(12),
	`STARTING_POINT`			VARCHAR(6) NOT NULL,
	`END_POINT`					VARCHAR(6) NOT NULL,
	`STOPS`						VARCHAR(500) NOT NULL,		
	`TOTAL_STOPS`				VARCHAR(500) NOT NULL,
	`STARTING_TIME`				VARCHAR(20),
	`REACHING_TIME`				VARCHAR(20),
	`SEATES_LEFT`				VARCHAR(12)  NOT NULL,	
	`CREATED_USER_ID`			VARCHAR(12),
	`MODIFIED_USER_ID`			VARCHAR(12),
	`CREATED_DATE_TIME`			VARCHAR(20),
	`MODIFIED_DATE_TIME`		VARCHAR(20),
	
	CONSTRAINT `PK_TRANSPORTATION_ID` PRIMARY KEY (`TRANSPORTATION_ID`),
	FOREIGN KEY (`VEHICLE_REG_NO`) REFERENCES "VEHICLE_DETAILS" (`VEHICLE_REG_NO`) 
)
/
CREATE TABLE "TRANSPORTATION_ALLOCATION" (
	`TRANSPORTATION_ALLOCATION_ID`	BIGINT NOT NULL,	
	`STUDENT_ROLL_NO`     			BIGINT,	
	`STAFF_ID` 		    			BIGINT,			
	`ROUT_NO`     					VARCHAR(12) NOT NULL,	
	`TRANSPORT_START_DATE`			VARCHAR(20),
	`TRANSPORT_END_DATE`			VARCHAR(20),
	`CREATED_USER_ID`				VARCHAR(12),
	`MODIFIED_USER_ID`				VARCHAR(12),
	`CREATED_DATE_TIME`				VARCHAR(20),
	`MODIFIED_DATE_TIME`			VARCHAR(20),
	
	CONSTRAINT `PK_TRANS_ALOC_ID` PRIMARY KEY (`TRANSPORTATION_ALLOCATION_ID`),	 
	FOREIGN KEY (`STAFF_ID`) REFERENCES "STAFF_DETAILS" (`STAFF_ID`),
	FOREIGN KEY (`ROUT_NO`) REFERENCES "TRANSPORT_ROUT_DETAILS" (`ROUT_NO`) 	
)
/
CREATE TABLE "LIBRARY_BOOK_CATEGORIES" (
	`BOOK_CATEGORY_ID`				BIGINT NOT NULL,	
	`CATEGORY_NAME`	     			VARCHAR(12) NOT NULL,	
	`CATEGORIES_ID`  				VARCHAR(12) NOT NULL,	
	`TOTAL_AVAILABLE_BOOKS`	     	SMALLINT,
	`CREATED_USER_ID`				VARCHAR(12),
	`MODIFIED_USER_ID`				VARCHAR(12),
	`CREATED_DATE_TIME`				VARCHAR(20),
	`MODIFIED_DATE_TIME`			VARCHAR(20),
	
	CONSTRAINT `PK_BOOK_CATEGORY_ID` PRIMARY KEY (`BOOK_CATEGORY_ID`)	
)
/
CREATE TABLE "LIBRARY_BOOK_DETAILS" (
	`BOOK_DETAIL_ID`				BIGINT NOT NULL,	
	`BOOK_CATEGORY_ID`				BIGINT NOT NULL,	
	`BOOK_CODE`		     			VARCHAR(30) NOT NULL,	
	`BOOK_NAME`		     			VARCHAR(30) NOT NULL,	
	`AUTHOR_NAME`	     			VARCHAR(30) NOT NULL,	
	`PUBLISHER_NAME`				VARCHAR(30) NOT NULL,	
	`NO_OF_PAGES`	     			SMALLINT NOT NULL,
	`BOOK_ACCESSORIES`	     		VARCHAR(300) NOT NULL,
	`PURCHASED_DATE`  				VARCHAR(12) NOT NULL,	
	`BOOK_PRICE`	  				SMALLINT NOT NULL,	
	`BOOK_PRICE_MEASURE`			VARCHAR(12) NOT NULL,	
	`CREATED_USER_ID`				VARCHAR(12),
	`MODIFIED_USER_ID`				VARCHAR(12),
	`CREATED_DATE_TIME`				VARCHAR(20),
	`MODIFIED_DATE_TIME`			VARCHAR(20),
	
	CONSTRAINT `PK_BOOK_DETAIL_ID` PRIMARY KEY (`BOOK_DETAIL_ID`),
	FOREIGN KEY (`BOOK_CATEGORY_ID`) REFERENCES "LIBRARY_BOOK_CATEGORIES" (`BOOK_CATEGORY_ID`) 
)
/
CREATE TABLE "LIBRARY_BOOK_ALLOCATION" (
	`LIBRARY_BOOK_ALOC_ID`	BIGINT NOT NULL,	
	`STUDENT_ROLL_NO`     			BIGINT,	
	`STAFF_ID` 		    			BIGINT,	
	`BOOK_CODE`		     			VARCHAR(30) NOT NULL,	
	`BOOK_ALLOCATED_DATE_TIME`		VARCHAR(20) NOT NULL,
	`BOOK_DUE_DATE`					VARCHAR(20) NOT NULL,
	`BOOK_RETURNED_DATE_TIME`		VARCHAR(20),
	`CREATED_USER_ID`				VARCHAR(12),
	`MODIFIED_USER_ID`				VARCHAR(12),
	`CREATED_DATE_TIME`				VARCHAR(20),
	`MODIFIED_DATE_TIME`			VARCHAR(20),
	
	CONSTRAINT `PK_LIBRARY_BOOK_ALOC_ID` PRIMARY KEY (`LIBRARY_BOOK_ALOC_ID`),
	FOREIGN KEY (`STAFF_ID`) REFERENCES "STAFF_DETAILS" (`STAFF_ID`) 
)
/
CREATE TABLE "TRANSACTION_LOG" (
	`TRANSACTION_LOG_ID`			BIGINT NOT NULL,	
	`USER_ID`     					BIGINT NOT NULL,		
	`MENU_CATEGORY`   				VARCHAR(18) NOT NULL,
	`MENU_SUB_CATEGORY`   			VARCHAR(18) NOT NULL,
	`ACTION_TYPE`   				VARCHAR(18) NOT NULL,
	`ACTION_PERFORMED_DATE_TIME`	VARCHAR(18) NOT NULL,
	`CREATED_USER_ID`				VARCHAR(12),
	`MODIFIED_USER_ID`				VARCHAR(12),
	`CREATED_DATE_TIME`				VARCHAR(20),
	`MODIFIED_DATE_TIME`			VARCHAR(20),
	
	CONSTRAINT `PK_TRANSACTION_LOG_ID` PRIMARY KEY (`TRANSACTION_LOG_ID`),
	FOREIGN KEY (`USER_ID`) REFERENCES "USER_DETAILS" (`USER_ID`) 
)
/