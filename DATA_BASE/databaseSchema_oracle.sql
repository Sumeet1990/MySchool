CREATE TABLE "STAFF_ADDRESS" (
	"STAFF_ADDRESS_ID"     		NUMBER(16,0) NOT NULL,
	"ADDRESS_LINE_1"			VARCHAR2(120 BYTE) NOT NULL,
	"TOWN_DISTRICT"				VARCHAR2(30 BYTE),
	"DISTRICT_CITY"				VARCHAR2(30 BYTE),
	"PINCODE"					NUMBER(6,0) NOT NULL,
	"STATE"						VARCHAR2(30 BYTE) NOT NULL,
	"COUNTRY"					VARCHAR2(30 BYTE) NOT NULL,
	"PERSONAL_CONTACT_NUMBER"	VARCHAR2(30 BYTE) NOT NULL,
	"EMERGENCY_CONTACT_NUMBER"	VARCHAR2(30 BYTE),
	"EMAIL_ID"					VARCHAR2(60 BYTE),	
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_STAFF_ADDRESS_ID" PRIMARY KEY ("STAFF_ADDRESS_ID")
)
/
CREATE TABLE "STAFF_APPOINTMENT" (
	"APPOINTMENT_TYPE_ID"		NUMBER(16,0) NOT NULL,	
    "APPOINTMENT_TYPE"			VARCHAR2(30 BYTE) NOT NULL,	
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"		VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"	VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_APPOINTMENT_TYPE_ID" PRIMARY KEY ("APPOINTMENT_TYPE_ID")
)
/
CREATE TABLE "STAFF_DETAILS" (
	"STAFF_ID"     				NUMBER(16,0) NOT NULL,	
	"STAFF_TITLE"   			VARCHAR2(12 BYTE),
	"STAFF_GIVEN_FULL_NAME" 	VARCHAR2(75 BYTE) NOT NULL,
	"STAFF_SURNAME" 			VARCHAR2(25 BYTE),
	"STAFF_DOB"        			VARCHAR2(11 BYTE) NOT NULL,
	"STAFF_GENDER"				VARCHAR2(6 BYTE) NOT NULL,		
	"STAFF_QUALIFICATION"  		VARCHAR2(120 BYTE) NOT NULL,
	"STAFF_DESIGNATION"			VARCHAR2(60 BYTE),
	"TEACHER_STAFF_FLAG"		VARCHAR2(3 BYTE) NOT NULL,
	"CLASS_TEACHER_FLAG"		VARCHAR2(3 BYTE) DEFAULT 'NO' NOT NULL,
	"SUBJECT_CODES_LIST"		VARCHAR2(3 BYTE),	
	"APPOINTMENT_TYPE_ID"		NUMBER(16,0),	
	"STAFF_ADDRESS_ID"     		NUMBER(16,0) NOT NULL,
	"PHOTO"						VARCHAR2(3 BYTE) NOT NULL,
	"STAFF_STATUS"				VARCHAR2(8 BYTE) NOT NULL,
	"STAFF_INACTIVE_REASON"		VARCHAR2(60 BYTE),
	"STAFF_INACTIVE_DATE_TIME"	VARCHAR2(20 BYTE),
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_STAFF_ID" PRIMARY KEY ("STAFF_ID"),
	FOREIGN KEY ("APPOINTMENT_TYPE_ID") REFERENCES "STAFF_APPOINTMENT" ("APPOINTMENT_TYPE_ID"),
	FOREIGN KEY ("STAFF_ADDRESS_ID") REFERENCES "STAFF_ADDRESS" ("STAFF_ADDRESS_ID"),
	CONSTRAINT "CK_STAFF_GENDER" CHECK (STAFF_GENDER IN ('MALE', 'FEMALE')),
	CONSTRAINT "CK_STAFF_STATUS" CHECK (STAFF_STATUS IN ('ACTIVE', 'INACTIVE')),
	CONSTRAINT "CK_TEACHER_STAFF_FLAG" CHECK (TEACHER_STAFF_FLAG IN ('YES', 'NO')),
	CONSTRAINT "CK_CLASS_TEACHER_FLAG" CHECK (CLASS_TEACHER_FLAG IN ('YES', 'NO')) 	
)
/
CREATE TABLE "USER_ROLE" (
	"USER_ROLES_ID"     		NUMBER(16,0) NOT NULL,
	"USER_ROLES_NAME"   		VARCHAR2(18 BYTE) NOT NULL,	
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
    CONSTRAINT "PK_USER_ROLES_ID" PRIMARY KEY ("USER_ROLES_ID")	
)
/
CREATE TABLE "USER_ROLE_ACCESS" (
	"USER_ROLE_ACCESS_ID"     	NUMBER(16,0) NOT NULL,	
	"USER_ROLES_ID"     		NUMBER(16,0) NOT NULL,	
	"MENU_CATEGORY"   			VARCHAR2(18 BYTE) NOT NULL,
	"MENU_SUB_CATEGORY"   		VARCHAR2(18 BYTE) NOT NULL,
	"CREATE_ADD"		   		VARCHAR2(18 BYTE),
	"MODIFY_EDIT"   			VARCHAR2(18 BYTE),
	"DELETE_REMOVE"		   		VARCHAR2(18 BYTE),
	"VIEW_SHOW"			   		VARCHAR2(18 BYTE),
	"MIGRATE"			   		VARCHAR2(18 BYTE),	
	"GENERATE" 					VARCHAR2(18 BYTE),	
	"SMS"				   		VARCHAR2(18 BYTE),
	"EMAIL"				   		VARCHAR2(18 BYTE),	
	"COLLECT"			   		VARCHAR2(18 BYTE),
	"ASSIGN"					VARCHAR2(18 BYTE),
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
    CONSTRAINT "PK_USER_ROLE_ACCESS_ID" PRIMARY KEY ("USER_ROLE_ACCESS_ID"),
	FOREIGN KEY ("USER_ROLES_ID") REFERENCES "USER_ROLE" ("USER_ROLES_ID")
)
/
CREATE TABLE "USER_DETAILS" (
	"USER_ID"     				NUMBER(16,0) NOT NULL,
	"USER_NAME"   				VARCHAR2(18 BYTE) NOT NULL UNIQUE,
	"USER_ROLES_ID"     		NUMBER(16,0) NOT NULL,
	"PASSWORD"					VARCHAR2(18 BYTE) NOT NULL,
	"USER_GIVEN_FULL_NAME" 		VARCHAR2(75 BYTE) NOT NULL,
	"USER_SURNAME" 				VARCHAR2(25 BYTE),
	"USER_DOB"        			VARCHAR2(11 BYTE) NOT NULL,
	"USER_GENDER"				VARCHAR2(6 BYTE) NOT NULL,		
	"INVALID_ATTEMPTS"			NUMBER(1,0) DEFAULT 0 NOT NULL ,
	"STAFF_ADDRESS_ID"			NUMBER(16,0) NOT NULL,
	"STAFF_ID"					NUMBER(16,0),
	"SECURITY_QUESTION"			VARCHAR2(90 BYTE) NOT NULL,
	"SECURITY_ANSWER"			VARCHAR2(25 BYTE) NOT NULL,	
	"LAST_LOGEDIN_DATE_TIME"	VARCHAR2(20 BYTE) NOT NULL,
	"USER_STATUS"				VARCHAR2(8 BYTE) NOT NULL,
	"USER_INACTIVE_REASON"		VARCHAR2(60 BYTE),
	"USER_INACTIVE_DATE_TIME"	VARCHAR2(20 BYTE),
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
    CONSTRAINT "PK_USER_ID" PRIMARY KEY ("USER_ID"),
	FOREIGN KEY ("USER_ROLES_ID") REFERENCES "USER_ROLE" ("USER_ROLES_ID"),
	FOREIGN KEY ("STAFF_ADDRESS_ID") REFERENCES "STAFF_ADDRESS" ("STAFF_ADDRESS_ID"),
   	CONSTRAINT "CK_USER_GENDER" CHECK (USER_GENDER IN ('MALE', 'FEMALE')),	
	CONSTRAINT "CK_USER_STATUS" CHECK (USER_STATUS IN ('ACTIVE', 'INACTIVE'))	
)
/
CREATE TABLE "STAFF_LEAVES" (
	"STAFFT_LEAVES_ID" 				NUMBER(16,0) NOT NULL, 
	"APPOINTMENT_TYPE_ID"			NUMBER(16,0) NOT NULL,
	"STAFF_LEAVE_TYPE"	     		VARCHAR2(30 BYTE) NOT NULL,	
	"MAX_LEAVE_DAYS"				NUMBER(3,0) NOT NULL,
	"MAX_CONSECUTIVE_LEAVE_DAYS"	VARCHAR2(12 BYTE),
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"				VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"			VARCHAR2(20 BYTE),
	
    CONSTRAINT "PK_STAFF_LEAVES_ID" PRIMARY KEY ("STAFFT_LEAVES_ID"),
    FOREIGN KEY ("APPOINTMENT_TYPE_ID") REFERENCES "STAFF_APPOINTMENT" ("APPOINTMENT_TYPE_ID")
)
/
CREATE TABLE "STAFF_ATTENDANCE" (
	"STAFFT_ATTENDANCE_ID"	 	NUMBER(16,0) NOT NULL, 
	"STAFF_ID"     				NUMBER(16,0) NOT NULL,	
	"STAFFT_LEAVES_ID" 			NUMBER(16,0) NOT NULL, 		
	"REASON"		     		VARCHAR2(30 BYTE) NOT NULL,
	"LEAVE_FROM"				VARCHAR2(12 BYTE) NOT NULL,
	"LEAVE_TO"					VARCHAR2(12 BYTE) NOT NULL,
	"NO_OF_DAYS"				NUMBER(3, 0) NOT NULL,
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
    CONSTRAINT "PK_STAFF_ATTENDANCE_ID" PRIMARY KEY ("STAFFT_ATTENDANCE_ID"),
	FOREIGN KEY ("STAFFT_LEAVES_ID") REFERENCES "STAFF_LEAVES" ("STAFFT_LEAVES_ID"),	
    FOREIGN KEY ("STAFF_ID") REFERENCES "STAFF_DETAILS" ("STAFF_ID")			
)
/
CREATE TABLE "SCHOOL_CLASS" (
	"SCHOOL_CLASS_ID"     		NUMBER(16,0) NOT NULL,	
	"SCHOOL_CLASS_NAME"     	VARCHAR2(30 BYTE) NOT NULL UNIQUE,
	"MIN_AGE_CRITERIA"			NUMBER(2,0) NOT NULL,		
	"MAX_AGE_CRITERIA"			NUMBER(2,0) NOT NULL,		
	"PERIODS_PER_DAY"     		NUMBER(2,0) NOT NULL,	
	"PERIOD_MINUTES_DURATION"	NUMBER(30,0) NOT NULL,	
	"TEACHER_PERIODS_PER_DAY"	NUMBER(2,0) NOT NULL,		
	"SUBJECT_CODES_LIST"		VARCHAR2(300 BYTE),	
	"CLASS_MAXIMUM_STRENGTH"	NUMBER(3,0),	
	"CLASS_STATUS"				VARCHAR2(8 BYTE),
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
    CONSTRAINT "PK_SCHOOL_CLASS_ID" PRIMARY KEY ("SCHOOL_CLASS_ID"),
	CONSTRAINT "CK_CLASS_STATUS" CHECK (CLASS_STATUS IN ('ACTIVE', 'INACTIVE')) 	
)
/
CREATE TABLE "CLASS_SECTION" (
	"CLASS_SECTION_ID" 				NUMBER(16,0) NOT NULL,	
	"SCHOOL_CLASS_ID"     			NUMBER(16,0) NOT NULL,	
	"SECTION"						VARCHAR2(30 BYTE) NOT NULL,
	"STAFF_ID"     					NUMBER(16,0) NOT NULL,
	"SECTION_MAXIMUM_STRENGTH"		NUMBER(3,0),	
	"MIGRATION_STATUS"				NUMBER(3,0),
	"SECTION_STATUS"				VARCHAR2(8),
	"SECTION_INACTIVE_REASON"		VARCHAR2(60 BYTE),
	"SECTION_INACTIVE_DATE_TIME"	VARCHAR2(20 BYTE),
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"				VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"			VARCHAR2(20 BYTE),
	
    CONSTRAINT "PK_CLASS_SECTION_ID" PRIMARY KEY ("CLASS_SECTION_ID"),
    FOREIGN KEY ("SCHOOL_CLASS_ID") REFERENCES "SCHOOL_CLASS" ("SCHOOL_CLASS_ID"),
    FOREIGN KEY ("STAFF_ID") REFERENCES "STAFF_DETAILS" ("STAFF_ID"),
	CONSTRAINT "CK_SECTION_STATUS" CHECK (SECTION_STATUS IN ('ACTIVE', 'INACTIVE')) 
)
/
CREATE TABLE "SCHOOL_TIMINGS" (
	"SCHOOL_TIMINGS_ID"    		NUMBER(16,0) NOT NULL,	
	"SCHOOL_CLASS_ID"     		NUMBER(16,0) NOT NULL,		
	"ACADEMIC_OPENING_DAY"		VARCHAR2(20 BYTE),
	"ACADEMIC_CLOSING_DAY"		VARCHAR2(20 BYTE),
	"TIMING_DURATION_FROM"		VARCHAR2(20 BYTE) NOT NULL,
	"TIMING_DURATION_TO"		VARCHAR2(20 BYTE) NOT NULL,
	"WEEK_DAY"		     		VARCHAR2(9 BYTE) NOT NULL,		
	"SCHOOL_START_TIME"		    VARCHAR2(20 BYTE) NOT NULL,
	"START_OFFSET_TIME"		    VARCHAR2(20 BYTE),
	"OFFSET_TIME_MEASURE"     	VARCHAR2(20 BYTE),
	"SCHOOL_FINISH_TIME"		VARCHAR2(20 BYTE) NOT NULL,		
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"		VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"	VARCHAR2(20 BYTE),
	
    CONSTRAINT "PK_SCHOOL_TIMINGS_ID" PRIMARY KEY ("SCHOOL_TIMINGS_ID"),
	FOREIGN KEY ("SCHOOL_CLASS_ID") REFERENCES "SCHOOL_CLASS" ("SCHOOL_CLASS_ID"),
	CONSTRAINT "CK_WEEK_DAY" CHECK (WEEK_DAY IN ('SUNDAY','MONDAY', 'TUESDAY', 'WEDNESDAY','THURSDAY','FRIDAY','SATURDAY'))	
)
/
CREATE TABLE "SCHOOL_SUBJECTS" (
	"SUBJECT_CODE"					NUMBER(16,0) NOT NULL,	
    "SUBJECT_NAME"					VARCHAR2(60 BYTE) NOT NULL,	
    "SUBJECT_STATUS"				VARCHAR2(9 BYTE) NOT NULL,
	"SUBJECT_INACTIVE_REASON"		VARCHAR2(60 BYTE),
	"SUBJECT_INACTIVE_DATE_TIME"	VARCHAR2(20 BYTE),
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"				VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"			VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_SUBJECT_CODE" PRIMARY KEY ("SUBJECT_CODE"),
	CONSTRAINT "CK_SUBJECT_STATUS" CHECK (SUBJECT_STATUS IN ('ACTIVE', 'INACTIVE'))
)
/
CREATE TABLE "CLASS_EXAMS" (
	"CLASS_EXAMS_ID"			VARCHAR2(12 BYTE) NOT NULL,
	"SCHOOL_CLASS_ID"     		NUMBER(16,0) NOT NULL,	
	"EXAM_NAME"					VARCHAR2(30 BYTE) NOT NULL,	
	"EXAM_START_DATE"			VARCHAR2(30 BYTE),
	"EXAM_END_DATE"				VARCHAR2(30 BYTE),
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_CLASS_EXAMS_ID" PRIMARY KEY ("CLASS_EXAMS_ID"),
	FOREIGN KEY ("SCHOOL_CLASS_ID") REFERENCES "SCHOOL_CLASS" ("SCHOOL_CLASS_ID") 
)
/
CREATE TABLE "EXAM_SUBJECT_SCHEDULE" (
	"EXAM_SUBJECT_SCHEDULE_ID"	NUMBER(16,0) NOT NULL,
	"SCHOOL_CLASS_ID"     		NUMBER(16,0) NOT NULL,
	"EXAM_NAME" 				VARCHAR2(30 BYTE) NOT NULL,	
	"SUBJECT_NAME"				VARCHAR2(20 BYTE) NOT NULL,				
	"SUBJECT_EXAM_DATE"			VARCHAR2(12 BYTE) NOT NULL,		
	"SYLLABUS"					VARCHAR2(300 BYTE),
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_EXAM_SUBJECT_SCHEDULE_ID" PRIMARY KEY ("EXAM_SUBJECT_SCHEDULE_ID"),
	FOREIGN KEY ("SCHOOL_CLASS_ID") REFERENCES "SCHOOL_CLASS" ("SCHOOL_CLASS_ID") 
)
/
CREATE TABLE "GENERAL_HOLIDAY_LIST" (
	"GENERAL_HOLIDAY_ID"		NUMBER(16,0) NOT NULL,
	"GENERAL_HOLIDAY_FOR"  		VARCHAR2(30 BYTE) NOT NULL,	
	"GENERAL_HOLIDAY_FROM"		VARCHAR2(20 BYTE),		
	"GENERAL_HOLIDAY_TO"		VARCHAR2(20 BYTE),
	"NO_OF_DAYS"				NUMBER(2,0) DEFAULT 0 NOT NULL ,
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_GENERAL_HOLIDAY_ID" PRIMARY KEY ("GENERAL_HOLIDAY_ID")	
)

/
CREATE TABLE "CLASS_HOLIDAY_LIST" (
	"CLASS_HOLIDAY_ID"			NUMBER(16,0) NOT NULL,
	"SCHOOL_CLASS_ID"     		NUMBER(16,0) NOT NULL,
	"LASS_HOLIDAY_FOR"  		VARCHAR2(30 BYTE)NULL,	
	"LASS_HOLIDAY_FROM"			VARCHAR2(20 BYTE),		
	"LASS_HOLIDAY_TO"			VARCHAR2(20 BYTE),	
	"NO_OF_DAYS"				NUMBER(2,0) DEFAULT 0 NOT NULL,
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_CLASS_HOLIDAY_ID" PRIMARY KEY ("CLASS_HOLIDAY_ID"),
	FOREIGN KEY ("SCHOOL_CLASS_ID") REFERENCES "SCHOOL_CLASS" ("SCHOOL_CLASS_ID") 
)
/
CREATE TABLE "GENERAL_EVENTS" (
	"GENERAL_EVENT_ID"			NUMBER(16,0) NOT NULL,
	"GENERAL_EVENT_NAME"  		VARCHAR2(30 BYTE) NOT NULL,	
	"GENERAL_EVENT_FROM"		VARCHAR2(20 BYTE),		
	"GENERAL_EVENT_TO"			VARCHAR2(20 BYTE),	
	"NO_OF_DAYS"				NUMBER(2,0) DEFAULT 0 NOT NULL,
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"		VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"	VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_GENERAL_EVENT_ID" PRIMARY KEY ("GENERAL_EVENT_ID")	
)
/
CREATE TABLE "CLASS_EVENTS" (    
	"CLASS_EVENT_ID"			NUMBER(16,0) NOT NULL,
	"SCHOOL_CLASS_ID"     		NUMBER(16,0) NOT NULL,
	"CLASS_EVENT_NAME" 			VARCHAR2(30 BYTE) NOT NULL,	
	"CLASS_EVENT_FROM"			VARCHAR2(20 BYTE),		
	"CLASS_EVENT_TO"			VARCHAR2(20 BYTE),
	"NO_OF_DAYS"				NUMBER(2,0) DEFAULT 0 NOT NULL,
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_CLASS_EVENT_ID" PRIMARY KEY ("CLASS_EVENT_ID"),
	FOREIGN KEY ("SCHOOL_CLASS_ID") REFERENCES "SCHOOL_CLASS" ("SCHOOL_CLASS_ID") 
)
/
CREATE TABLE "STUDENT_ADDRESS" (
	"STUDENT_ADDRESS_ID"   		NUMBER(16,0) NOT NULL,
	"CAREOFF_NAME"				VARCHAR2(75 BYTE),
	"ADDRESS_LINE_1"			VARCHAR2(120 BYTE) NOT NULL,
	"TOWN_DISTRICT"				VARCHAR2(30 BYTE),
	"DISTRICT_CITY"				VARCHAR2(30 BYTE),
	"PINCODE"					NUMBER(6,0) NOT NULL,
	"STATE"						VARCHAR2(30 BYTE) NOT NULL,
	"COUNTRY"					VARCHAR2(60 BYTE) NOT NULL,
	"FATHER_CONTACT_NUMBER"		VARCHAR2(60 BYTE),
	"MOTHER_CONTACT_NUMBER"		VARCHAR2(60 BYTE),
	"GUARDAIN_CONTACT_NUMBER"	VARCHAR2(60 BYTE),
	"FATHER_WORK_NUMBER"		VARCHAR2(60 BYTE),
	"MOTHER_WORK_NUMBER"		VARCHAR2(60 BYTE),
	"GUARDAIN_WORK_NUMBER"		VARCHAR2(60 BYTE),
	"FATHER_EMAIL_ID"			VARCHAR2(60 BYTE),
	"SEND_MAIL_TO_FATHER"		VARCHAR2(3 BYTE),
	"MOTHER_EMAIL_ID"			VARCHAR2(60 BYTE),
	"SEND_MAIL_TO_MOTHER"		VARCHAR2(3 BYTE),
	"GUARDAIN_EMAIL_ID"			VARCHAR2(60 BYTE),
	"SEND_MAIL_TO_GUARDAIN"		VARCHAR2(3 BYTE),
	"FATHER_OCCUPATION"			VARCHAR2(200 BYTE),
	"MOTHER_OCCUPATION"			VARCHAR2(200 BYTE),
	"GUARDAIN_OCCUPATION"		VARCHAR2(200 BYTE),	
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_STUDENT_ADDRESS_ID" PRIMARY KEY ("STUDENT_ADDRESS_ID")
)
/
CREATE TABLE "STUDENT_REGISTRATION" (
	"STUDENT_REG_DETAILS_ID" 		NUMBER(16,0) NOT NULL, 
	"STUDENT_REGISTRATION_ID" 		NUMBER(16,0) NOT NULL, 	
	"STUDENT_TITLE"   				VARCHAR2(12 BYTE),
	"STUDENT_GIVEN_FULL_NAME" 		VARCHAR2(75 BYTE) NOT NULL,
	"STUDENT_SURNAME" 				VARCHAR2(25 BYTE),
	"STUDENT_DOB"        			VARCHAR2(11 BYTE) NOT NULL,
	"STUDENT_GENDER"				VARCHAR2(4 BYTE) NOT NULL,
	"MOTHER_TOUNGE"					VARCHAR2(30 BYTE),
	"STUDENT_FATHER_NAME"			VARCHAR2(75 BYTE), 
	"STUDENT_MOTHER_NAME"  			VARCHAR2(75 BYTE),
	"STUDENT_GUARDIAN_NAME"			VARCHAR2(75 BYTE),
	"ADMISSION_CLASS"				VARCHAR2(5 BYTE) NOT NULL,
	"ADMISSION_SECTION"				VARCHAR2(5 BYTE),
	"STUDENT_CLASS_TEACHER"			VARCHAR2(75 BYTE),	
	"STUDENT_ADDRESS_ID"   			NUMBER(16,0) NOT NULL,	
	"ADMISSION_DATE"   				VARCHAR2(20 BYTE),		
	"TRANSPORTATION_REQUIRED"		NUMBER(16,0) NOT NULL
	"PHOTO"							VARCHAR2(3 BYTE) NOT NULL,
	"STUDENT_STATUS"				VARCHAR2(9 BYTE),
	"STUDENT_INACTIVE_REASON"		VARCHAR2(60 BYTE),
	"STUDENT_INACTIVE_DATE_TIME"	VARCHAR2(20 BYTE),
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"				VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"			VARCHAR2(20 BYTE),
	
    CONSTRAINT "PK_STUDENT_REGISTRATION_ID" PRIMARY KEY ("STUDENT_REGISTRATION_ID"),
    FOREIGN KEY ("STUDENT_ADDRESS_ID") REFERENCES "STUDENT_ADDRESS" ("STUDENT_ADDRESS_ID"),
	CONSTRAINT "CK_STUDENT_GENDER" CHECK (STUDENT_GENDER IN ('BOY', 'GIRL')),
	CONSTRAINT "CK_STUDENT_STATUS" CHECK (STUDENT_STATUS IN ('ACTIVE', 'INACTIVE')),
	CONSTRAINT "CK_TRANSPORT_REQUIRED" CHECK (STUDENT_STATUS IN ('NO', 'PICKUP', 'DROP', 'BOTH')) 
)
/
CREATE TABLE "STUDENT_CURRENT_DETAILS" (
	"STUDENT_CURRENT_DETAILS_ID"	NUMBER(16,0) NOT NULL,
	"STUDENT_REGISTRATION_ID" 		NUMBER(16,0) NOT NULL,  	
	"STUDENT_ROLL_NO" 				NUMBER(16,0) NOT NULL,
	"CLASS_SECTION_ID" 				NUMBER(16,0) NOT NULL,
	"FINAL_EXAM_RESULT" 			VARCHAR2(8),		
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
    CONSTRAINT "PK_STUDENT_CURRENT_DETAILS_ID" PRIMARY KEY ("STUDENT_CURRENT_DETAILS_ID"),
    FOREIGN KEY ("STUDENT_REGISTRATION_ID") REFERENCES "STUDENT_REGISTRATION" ("STUDENT_REGISTRATION_ID"),
	FOREIGN KEY ("CLASS_SECTION_ID") REFERENCES "CLASS_SECTION" ("CLASS_SECTION_ID"),
	CONSTRAINT "CK_FINAL_EXAM_RESULT" CHECK (FINAL_EXAM_RESULT IN ('PROMOTED', 'FAILED')) 	
)
/
CREATE TABLE "STUDENT_ATTENDANCE" (
	"STUDENT_ATTENDANCE_ID" 	NUMBER(16,0) NOT NULL, 
	"STUDENT_ROLL_NO"     		VARCHAR2(12 BYTE) NOT NULL,
	"CLASS_SECTION_ID"     		NUMBER(16,0) NOT NULL,
	"LEAVE_ABSENT"     			VARCHAR2(6 BYTE) NOT NULL,	
	"LEAVE_ABESNT_REASON"  		VARCHAR2(30 BYTE) NOT NULL,
	"LEAVE_ABSENT_FROM"			VARCHAR2(12 BYTE) NOT NULL,
	"LEAVE_ABSENT_TO"			VARCHAR2(12 BYTE) NOT NULL,
	"NO_OF_DAYS"				NUMBER(3, 0) NOT NULL,
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
    CONSTRAINT "PK_STUDENT_ATTENDANCE_ID" PRIMARY KEY ("STUDENT_ATTENDANCE_ID"),	
	FOREIGN KEY ("CLASS_SECTION_ID") REFERENCES "CLASS_SECTION" ("CLASS_SECTION_ID"),
	CONSTRAINT "CK_LEAVE_ABSENT" CHECK (LEAVE_ABSENT IN ('LEAVE', 'ABESNT')) 	
)
/
CREATE TABLE "STUDENT_REPORT" (
	"STUDENT_REPORT_ID"			VARCHAR2(18 BYTE) NOT NULL,
	"STUDENT_REGISTRATION_ID" 	NUMBER(16,0) NOT NULL, 
	"STUDENT_ROLL_NO"     		VARCHAR2(12 BYTE) NOT NULL,
	"SCHOOL_CLASS_NAME"     	VARCHAR2(30 BYTE) NOT NULL,
	"SECTION"     				VARCHAR2(30 BYTE) NOT NULL,   
	"TEST_NAME"					VARCHAR2(30 BYTE) NOT NULL,
	"SUBJECTS_AND_MARKS"		VARCHAR2(900 BYTE) NOT NULL,	
	"SUBJECTS_FAILED"			NUMBER(2,0) DEFAULT 0 NOT NULL,
	"TOTAL_MARKS"				NUMBER(6,2),
	"PERCENTAGE_OF_MARKS"		NUMBER(6,2),
	"RANK"						NUMBER(2,0),
	"GRADE"						VARCHAR2(2 BYTE),
	"EXAM_RESULT"				VARCHAR2(4 BYTE),
	"TOTAL_PRESENT_DAYS"		NUMBER(3,0) NOT NULL,	
	"TOTAL_LEAVE_DAYS"			NUMBER(3,0) DEFAULT 0 NOT NULL ,
	"TOTAL_ABSENT_DAYS"			NUMBER(3,0) DEFAULT 0 NOT NULL ,
	"TOTAL_WORKING_DAYS"		NUMBER(3,0) NOT NULL,
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_STUDENT_REPORT_ID" PRIMARY KEY ("STUDENT_REPORT_ID"),	 
	FOREIGN KEY ("STUDENT_REGISTRATION_ID") REFERENCES "STUDENT_REGISTRATION" ("STUDENT_REGISTRATION_ID"),
	CONSTRAINT "CK_RANK" CHECK (RANK IN ('1', '2', '3', '4', '5', '6', '7', '8', '9', '10')),
	CONSTRAINT "CK_GRADE" CHECK (GRADE IN ('A+', 'A', 'B+', 'B', 'C+', 'C'))			
)
/
CREATE TABLE "SCHOOL_ACHIVENETS" (
	"SCHOOL_ACHIVENETS_ID"		NUMBER(16,0) NOT NULL,
	"EVENT"     				VARCHAR2(12) NOT NULL,
	"ACHIEVEMENT_FOR"			VARCHAR2(12) NOT NULL,	
	"STAFF_ID" 					NUMBER(16,0),
	"STUDENT_ROLL_NO"			NUMBER(16,0),
	"ACHIEVEMENT_DATE"			VARCHAR2(12 BYTE),	
	"DOCUMENT"					VARCHAR2(3 BYTE) NOT NULL,	
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_SCHOOL_ACHIVENETS_ID" PRIMARY KEY ("SCHOOL_ACHIVENETS_ID"),
	FOREIGN KEY ("STAFF_ID") REFERENCES "STAFF_DETAILS" ("STAFF_ID")  
)
/
CREATE TABLE "TUTION_FEE_STRUCTURE" (
	"TUTION_FEE_STRUCTURE_ID"	NUMBER(16,0) NOT NULL,
	"SCHOOL_CLASS_ID"     		NUMBER(16,0) NOT NULL,	
	"AMOUNT_PER_INSTALMENT" 	NUMBER(15,2),
	"NUMBER_OF_INSTALMENTS"		NUMBER(2,0),
	"TOTAL_TUTION_FEE"			NUMBER(15,2) NOT NULL,		
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_TUTION_FEE_STRUCTURE_ID" PRIMARY KEY ("TUTION_FEE_STRUCTURE_ID"),
	FOREIGN KEY ("SCHOOL_CLASS_ID") REFERENCES "SCHOOL_CLASS" ("SCHOOL_CLASS_ID") 
)
/
CREATE TABLE "TUTION_FEE_PAYMENT" (
	"STUDNT_TUTIN_FEE_PYNT_ID"	VARCHAR2(18 BYTE) NOT NULL,
	"STUDENT_ROLL_NO"     		VARCHAR2(12 BYTE) NOT NULL,
	"TUTION_FEE_STRUCTURE_ID"	NUMBER(16,0) NOT NULL,
	"SCHOOL_CLASS_ID"     		NUMBER(16,0) NOT NULL,	
	"TUTION_FEE_PAID_RCPT_NO"	NUMBER(16,0) NOT NULL,
	"FEE_PAID"   				NUMBER(15,2) NOT NULL,
	"INSTALMENT_NUMBER"			NUMBER(2,0) NOT NULL,
	"BALANCE_TUTION_FEE"		NUMBER(15,2) NOT NULL,	
	"PAYMENT_MODE"				VARCHAR2(30 BYTE),	
	"PAYMENT_DATE_TIME"			VARCHAR2(20 BYTE),	
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_STUDNT_TUTIN_FEE_PYNT_ID" PRIMARY KEY ("STUDNT_TUTIN_FEE_PYNT_ID"),	 
	FOREIGN KEY ("TUTION_FEE_STRUCTURE_ID") REFERENCES "TUTION_FEE_STRUCTURE" ("TUTION_FEE_STRUCTURE_ID"),
	FOREIGN KEY ("SCHOOL_CLASS_ID") REFERENCES "SCHOOL_CLASS" ("SCHOOL_CLASS_ID") 
)
/
CREATE TABLE "OTHER_FEE_STRUCTURE" (
	"OTHER_FEE_STRUCTURE_ID"	NUMBER(16,0) NOT NULL,
	"SCHOOL_CLASS_ID"     		NUMBER(16,0) NOT NULL,	
	"OTHER_FEE_NAME"   			VARCHAR2(60 BYTE) NOT NULL UNIQUE,
	"OTHER_FEE_AMOUNT"			NUMBER(15,2),	
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_OTHER_FEE_STRUCTURE_ID" PRIMARY KEY ("OTHER_FEE_STRUCTURE_ID"),
	FOREIGN KEY ("SCHOOL_CLASS_ID") REFERENCES "SCHOOL_CLASS" ("SCHOOL_CLASS_ID") 
)
/
CREATE TABLE "OTHER_FEE_PAYMENT" (
	"OTHER_FEE_PYNT_ID"				NUMBER(16,0) NOT NULL,
	"STUDENT_ROLL_NO"     			VARCHAR2(12 BYTE) NOT NULL,
	"OTHER_FEE_STRUCTURE_ID"		NUMBER(16,0) NOT NULL,
	"OTHER_FEE_PAID_RCPT_NO"		NUMBER(16,0) NOT NULL,
	"SCHOOL_CLASS_ID"     			NUMBER(16,0) NOT NULL,
	"OTHER_FEE_NAME"   				VARCHAR2(60 BYTE),
	"OTHER_FEE_AMOUNT_PAID"			NUMBER(15,0),
	"OTHER_FEE_AMOUNT_BALANCE"		NUMBER(15,0),
	"PAYMENT_MODE"					VARCHAR2(30 BYTE),	
	"PAYMENT_DATE_TIME"				VARCHAR2(20 BYTE),
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"				VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"			VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_OTHER_FEE_PYNT_ID" PRIMARY KEY ("OTHER_FEE_PYNT_ID"),	 
	FOREIGN KEY ("OTHER_FEE_STRUCTURE_ID") REFERENCES "OTHER_FEE_STRUCTURE" ("OTHER_FEE_STRUCTURE_ID"),
	FOREIGN KEY ("SCHOOL_CLASS_ID") REFERENCES "SCHOOL_CLASS" ("SCHOOL_CLASS_ID") 
)
/
CREATE TABLE "VEHICLE_DETAILS" (
	"VEHICLE_DETAILS_ID"			NUMBER(16,0) NOT NULL,
	"VEHICLE_REG_NO"				VARCHAR2(12 BYTE) NOT NULL UNIQUE,	
	"VEHICLE_RC_NO"					VARCHAR2(12 BYTE) NOT NULL UNIQUE,
	"POLUTION_DUE_DATE"				VARCHAR2(6 BYTE) NOT NULL,	
	"INSURANCE_DUE_DATE"			VARCHAR2(500 BYTE) NOT NULL,	
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"SEATION_CAPACITY_EXC_DRIVER" 	VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"				VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"			VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_VEHICLE_DETAILS_ID" PRIMARY KEY ("VEHICLE_DETAILS_ID")	
)
/
CREATE TABLE "DRIVER_DETAILS" (
	"DRIVER_DETAILS_ID"				NUMBER(16,0) NOT NULL,
	"DRIVER_TITLE"   				VARCHAR2(12 BYTE),
	"DRIVER_GIVEN_FULL_NAME" 		VARCHAR2(75 BYTE) NOT NULL,
	"DRIVER_SURNAME" 				VARCHAR2(25 BYTE),
	"DRIVER_DOB"        			VARCHAR2(11 BYTE) NOT NULL,
	"DRIVER_GENDER"					VARCHAR2(6 BYTE) NOT NULL,	 
	"DRIVER_QUALIFICATION"  		VARCHAR2(120 BYTE) NOT NULL,
	"PHOTO"							VARCHAR2(3 BYTE) NOT NULL,
	"DRIVER_LICENSE_NO"				VARCHAR2(30 BYTE) NOT NULL,
	"LICENSE_EXP_DATE"				VARCHAR2(20 BYTE),
	"DRIVER_STATUS"					VARCHAR2(8 BYTE) NOT NULL,
	"DRIVER_INACTIVE_REASON"		VARCHAR2(60 BYTE),
	"DRIVER_INACTIVE_DATE_TIME"		VARCHAR2(20 BYTE),
	"ADDRESS_LINE_1"				VARCHAR2(30 BYTE) NOT NULL,
	"ADDRESS_LINE_2"				VARCHAR2(30 BYTE),
	"ADDRESS_LINE_3"				VARCHAR2(30 BYTE),
	"ADDRESS_LINE_4"				VARCHAR2(30 BYTE),
	"ADDRESS_LINE_5"				VARCHAR2(30 BYTE),
	"ADDRESS_LINE_6"				VARCHAR2(30 BYTE),
	"PINCODE"						NUMBER(6,0) NOT NULL,
	"STATE"							VARCHAR2(30 BYTE) NOT NULL,
	"COUNTRY"						VARCHAR2(30 BYTE) NOT NULL,
	"PERSONAL_CONTACT_NUMBER"		VARCHAR2(30 BYTE) NOT NULL,
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"				VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"			VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_DRIVER_DETAILS_ID" PRIMARY KEY ("DRIVER_DETAILS_ID"),	
	CONSTRAINT "CK_DRIVER_GENDER" CHECK (DRIVER_GENDER IN ('MALE', 'FEMALE')),
	CONSTRAINT "CK_DRIVER_STATUS" CHECK (DRIVER_STATUS IN ('ACTIVE', 'INACTIVE'))
)
/
CREATE TABLE "TRANSPORT_ROUT_DETAILS" (
	"TRANSPORTATION_ID"			NUMBER(16,0) NOT NULL,
	"ROUT_NO"     				VARCHAR2(12 BYTE) NOT NULL UNIQUE,	
	"VEHICLE_REG_NO"			VARCHAR2(12 BYTE),
	"STARTING_POINT"			VARCHAR2(6 BYTE) NOT NULL,
	"END_POINT"					VARCHAR2(6 BYTE) NOT NULL,
	"STOPS"						VARCHAR2(500 BYTE) NOT NULL,		
	"TOTAL_STOPS"				VARCHAR2(500 BYTE) NOT NULL,
	"STARTING_TIME"				VARCHAR2(20 BYTE),
	"REACHING_TIME"				VARCHAR2(20 BYTE),
	"SEATES_LEFT"				VARCHAR2(12 BYTE)  NOT NULL,	
	"CREATED_USER_ID"			VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"			VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"			VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"		VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_TRANSPORTATION_ID" PRIMARY KEY ("TRANSPORTATION_ID"),
	FOREIGN KEY ("VEHICLE_REG_NO") REFERENCES "VEHICLE_DETAILS" ("VEHICLE_REG_NO") 
)
/
CREATE TABLE "TRANSPORTATION_ALLOCATION" (
	"TRANSPORTATION_ALLOCATION_ID"	NUMBER(16,0) NOT NULL,	
	"STUDENT_ROLL_NO"     			NUMBER(16,0),	
	"STAFF_ID" 		    			NUMBER(16,0),			
	"ROUT_NO"     					VARCHAR2(12 BYTE) NOT NULL,	
	"TRANSPORT_START_DATE"			VARCHAR2(20 BYTE),
	"TRANSPORT_END_DATE"			VARCHAR2(20 BYTE),
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"				VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"			VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_TRANS_ALOC_ID" PRIMARY KEY ("TRANSPORTATION_ALLOCATION_ID"),	 
	FOREIGN KEY ("STAFF_ID") REFERENCES "STAFF_DETAILS" ("STAFF_ID"),
	FOREIGN KEY ("ROUT_NO") REFERENCES "TRANSPORT_ROUT_DETAILS" ("ROUT_NO") 	
)
/
CREATE TABLE "LIBRARY_BOOK_CATEGORIES" (
	"BOOK_CATEGORY_ID"				NUMBER(16,0) NOT NULL,	
	"CATEGORY_NAME"	     			VARCHAR2(12 BYTE) NOT NULL,	
	"CATEGORIES_ID"  				VARCHAR2(12 BYTE) NOT NULL,	
	"TOTAL_AVAILABLE_BOOKS"	     	NUMBER(4,0),
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"				VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"			VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_BOOK_CATEGORY_ID" PRIMARY KEY ("BOOK_CATEGORY_ID")	
)
/
CREATE TABLE "LIBRARY_BOOK_DETAILS" (
	"BOOK_DETAIL_ID"				NUMBER(16,0) NOT NULL,	
	"BOOK_CATEGORY_ID"				NUMBER(16,0) NOT NULL,	
	"BOOK_CODE"		     			VARCHAR2(30 BYTE) NOT NULL,	
	"BOOK_NAME"		     			VARCHAR2(30 BYTE) NOT NULL,	
	"AUTHOR_NAME"	     			VARCHAR2(30 BYTE) NOT NULL,	
	"PUBLISHER_NAME"				VARCHAR2(30 BYTE) NOT NULL,	
	"NO_OF_PAGES"	     			NUMBER(4,0) NOT NULL,
	"BOOK_ACCESSORIES"	     		VARCHAR2(300 BYTE) NOT NULL,
	"PURCHASED_DATE"  				VARCHAR2(12 BYTE) NOT NULL,	
	"BOOK_PRICE"	  				NUMBER(4,0) NOT NULL,	
	"BOOK_PRICE_MEASURE"			VARCHAR2(12 BYTE) NOT NULL,	
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"				VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"			VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_BOOK_DETAIL_ID" PRIMARY KEY ("BOOK_DETAIL_ID"),
	FOREIGN KEY ("BOOK_CATEGORY_ID") REFERENCES "LIBRARY_BOOK_CATEGORIES" ("BOOK_CATEGORY_ID") 
)
/
CREATE TABLE "LIBRARY_BOOK_ALLOCATION" (
	"LIBRARY_BOOK_ALOC_ID"	NUMBER(16,0) NOT NULL,	
	"STUDENT_ROLL_NO"     			NUMBER(16,0),	
	"STAFF_ID" 		    			NUMBER(16,0),	
	"BOOK_CODE"		     			VARCHAR2(30 BYTE) NOT NULL,	
	"BOOK_ALLOCATED_DATE_TIME"		VARCHAR2(20 BYTE) NOT NULL,
	"BOOK_DUE_DATE"					VARCHAR2(20 BYTE) NOT NULL,
	"BOOK_RETURNED_DATE_TIME"		VARCHAR2(20 BYTE),
	"CREATED_USER_ID"				VARCHAR2(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"				VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"			VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_LIBRARY_BOOK_ALOC_ID" PRIMARY KEY ("LIBRARY_BOOK_ALOC_ID"),
	FOREIGN KEY ("STAFF_ID") REFERENCES "STAFF_DETAILS" ("STAFF_ID") 
)
/
CREATE TABLE "TRANSACTION_LOG" (
	"TRANSACTION_LOG_ID"			NUMBER(16,0) NOT NULL,	
	"USER_ID"     					NUMBER(16,0) NOT NULL,		
	"MENU_CATEGORY"   				VARCHAR2(18) NOT NULL,
	"MENU_SUB_CATEGORY"   			VARCHAR2(18) NOT NULL,
	"ACTION_TYPE"   				VARCHAR2(18) NOT NULL,
	"ACTION_PERFORMED_DATE_TIME"	VARCHAR2(18) NOT NULL,
	"CREATED_USER_ID"				VARCHAR(12 BYTE),
	"MODIFIED_USER_ID"				VARCHAR2(12 BYTE),
	"CREATED_DATE_TIME"				VARCHAR2(20 BYTE),
	"MODIFIED_DATE_TIME"			VARCHAR2(20 BYTE),
	
	CONSTRAINT "PK_TRANSACTION_LOG_ID" PRIMARY KEY ("TRANSACTION_LOG_ID"),
	FOREIGN KEY ("USER_ID") REFERENCES "USER_DETAILS" ("USER_ID") 
)
/