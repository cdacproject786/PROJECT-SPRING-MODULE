create table Admin_Primary
 (
 Admin_ID int(10) primary key auto_increment,
 Email varchar(100) not null unique key,
 Pwd varchar(250) not null,
 Last_Updated_Date datetime default now(),
 Ext_Col_1 varchar(100),
 Ext_Col_2 varchar(100),
 Ext_Col_3 varchar(100) 
 );

alter table Admin_Primary Auto_Increment = 10001;

create table Doctor_Med_Registration
(
 Medical_Reg_Id int(10) primary key,
 Registration_Council Varchar(100) not null,
 Registration_Year Year not null,
 Degree Varchar(20) not null, 
 College Varchar(100) not null,
 Year_Of_Completion Year not null,
 Last_Updated datetime default now(), 
 Extra_Col1 Varchar(100) default null,
 Extra_Col2 Varchar(100) default null,
 Extra_Col3 Varchar(100) default null
);
 
create table Doctor_Establishment(
EID int(10) primary key auto_increment,
Establishment char(1) NOT NULL,
Establishment_Name varchar(100) NOT NULL,
Establishment_Location varchar(100) NOT NULL,
Establishment_City varchar(100) NOT NULL,
Establishment_Proof varchar(100),
Establishment_Pin char(6) NOT NULL,
Last_Updated datetime default now() NOT NULL,
Extra_Col1 varchar(200) NULL,
Extra_Col2 varchar(200) NULL,
Extra_Col3 varchar(200) NULL
);

alter table Doctor_Establishment Auto_Increment = 10001;
CREATE TABLE SECURITY_QUESTIONS
(
SECURITY_QUESTIONS_ID INT(10) PRIMARY KEY AUTO_INCREMENT,
SECURITY_QUESTION VARCHAR(50) NOT NULL,
LAST_UPDATED DATETIME DEFAULT NOW(),
EXTRA_COL1 VARCHAR(200),
EXTRA_COL2 VARCHAR(200),
EXTRA_COL3 VARCHAR(200)
);

create table Address
(
 Address_ID int(10) primary key auto_increment,
 Address_line_1 Varchar(100) not null,
 User_State Varchar(50) not null,
 City Varchar(50) not null,
 PinCode Char(6) not null,
 Country Varchar(40) not null,
 Last_Updated datetime default now(),
 Extra_Col1 Varchar(100) default null,
 Extra_Col2 Varchar(100) default null,
 Extra_Col3 Varchar(100) default null
);

alter table Address Auto_Increment = 10001;

CREATE TABLE PATIENT_MED_RECORD(
MED_RECORD_ID INT(10) PRIMARY KEY AUTO_INCREMENT,
BLOOD_PRESSURE CHAR(7) NOT NULL, 
WEIGHT DECIMAL(7,2) NOT NULL,
SUGAR_LEVEL CHAR(3) NOT NULL,
BLOOD_GROUP CHAR(3) NOT NULL,
DISABILITY CHAR(1) NOT NULL DEFAULT 'N',
LAST_UPDATED_DATE DATETIME DEFAULT NOW(), 
INSURANCE_ID VARCHAR(20) UNIQUE KEY,
INSURANCE_NAME VARCHAR(50),
INSURANCE_EXPIRE_DATE DATE,
ABHA_NUMBER CHAR(17) UNIQUE KEY,
EXT_COL_1 VARCHAR(100),
EXT_COL_2 VARCHAR(100),
EXT_COL_3 VARCHAR(100),
CHECK (DISABILITY IN ('Y','N'))
);


ALTER TABLE PATIENT_MED_RECORD AUTO_INCREMENT = 10001;

CREATE TABLE PATIENT_PRIMARY
(

UID INT(10) PRIMARY KEY AUTO_INCREMENT,

MED_RECORD_ID INT(10),

PROFILE_PHOTO VARCHAR(100),

FNAME VARCHAR(50) NOT NULL,

LNAME VARCHAR(50) NOT NULL,

EMAIL VARCHAR(100) NOT NULL UNIQUE KEY,

Pwd varchar(255) NOT NULL,

Date_of_Birth DATE NOT NULL,

ADHAAR_CARD CHAR(12) NOT NULL UNIQUE KEY,

PHONE CHAR(13) NOT NULL UNIQUE KEY,

GENDER CHAR(1) NOT NULL,

MARITAL_STATUS CHAR(1) NOT NULL,

OCCUPATION VARCHAR(100) NOT NULL,

ADDRESS_ID INT(10) UNIQUE,

SECURITY_QUESTIONS_ID INT(10),

SECURITY_QUESTIONS_ANSWER VARCHAR(100),

LAST_UPDATED DATETIME DEFAULT NOW()NOT NULL, 

EXT_COL_1 VARCHAR(100) NULL,
EXT_COL_2 VARCHAR(100) NULL,
EXT_COL_3 VARCHAR(100) NULL,
CHECK (MARITAL_STATUS IN('M','U','D')),
CHECK (GENDER IN('M','F','T','O')),
CONSTRAINT fk_question_id FOREIGN KEY (SECURITY_QUESTIONS_ID) REFERENCES SECURITY_QUESTIONS(SECURITY_QUESTIONS_ID) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT fk_patient_med_record FOREIGN KEY (MED_RECORD_ID) REFERENCES PATIENT_MED_RECORD(MED_RECORD_ID) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT fk_address_id FOREIGN KEY (ADDRESS_ID) REFERENCES ADDRESS(ADDRESS_ID) ON DELETE CASCADE ON UPDATE CASCADE
);

ALTER TABLE PATIENT_PRIMARY AUTO_INCREMENT = 10001;

CREATE TABLE PATIENT_MED_LOG(
MED_LOG_ID INT(10) PRIMARY KEY AUTO_INCREMENT,
PRESCRIPTION VARCHAR(255),
LAB_REPORT VARCHAR(255),
LAST_UPDATED DATETIME DEFAULT NOW() NOT NULL,
UID INT(10),
DRUG_NAME VARCHAR(255),
MORNING BOOLEAN,
AFTERNOON BOOLEAN,
EVENING BOOLEAN,
EXTRA_COL1 VARCHAR(200) NULL,
EXTRA_COL2 VARCHAR(200) NULL,
EXTRA_COL3 VARCHAR(200) NULL,
CONSTRAINT FK_UID FOREIGN KEY (UID) REFERENCES PATIENT_PRIMARY(UID) ON UPDATE CASCADE ON DELETE CASCADE
);

ALTER TABLE PATIENT_MED_LOG AUTO_INCREMENT = 10001;


create table Doctor_Avail_Master(
Doctor_ID int(10) primary key auto_increment,
Doctor_Avail_Time varchar(20) NOT NULL,
Doctor_Avail_Day varchar(20) NOT NULL,
Fees decimal(10,2) NOT NULL,
Last_Updated datetime default now(),
Extra_Col1 varchar(200) NULL,
Extra_Col2 varchar(200) NULL,
Extra_Col3 varchar(200) NULL
);
alter table Doctor_Avail_Master Auto_Increment = 10001;

CREATE TABLE DOCTOR_PRIMARY
( 
 DOCTOR_ID INT(10) PRIMARY KEY,
 SECURITY_QUESTIONS_ANSWER VARCHAR(50),
 ADDRESS_ID int(10) NOT NULL,
 MEDICAL_REG_ID int(10) NOT NULL UNIQUE KEY,
 EID INT(10) NOT NULL,
 SECURITY_QUESTIONS_ID int(10) NOT NULL,
 FNAME VARCHAR(50) NOT NULL,
 LNAME VARCHAR(50) NOT NULL,
 EMAIL VARCHAR(50) UNIQUE KEY NOT NULL,
 PWD VARCHAR(255) NOT NULL,
 PHONE_NUMBER CHAR(13) UNIQUE KEY NOT NULL,
 GENDER CHAR(1) NOT NULL,
 PAN_CARD CHAR(10) UNIQUE KEY NOT NULL,
 ADHAAR_CARD CHAR(12) UNIQUE KEY NOT NULL,
 SPECIALIZATION VARCHAR(50) NOT NULL,
 YEAR_OF_EXPERIENCE INT(2) NOT NULL,
 PROFILE_STATUS CHAR(1) NOT NULL DEFAULT 'U',
 PROFILE_PHOTO VARCHAR(100),
 LAST_UPDATED DATETIME DEFAULT NOW(),
 EXTRA_COL1 VARCHAR(100),
 EXTRA_COL2 VARCHAR(100),
 EXTRA_COL3 VARCHAR(100),
 CHECK (GENDER IN ('M','F','T','O')),
 CHECK (PROFILE_STATUS IN ('U','V')),

 CONSTRAINT fk_DOCTOR_ID FOREIGN KEY (DOCTOR_ID)  
 REFERENCES DOCTOR_AVAIL_MASTER(DOCTOR_ID)  
 ON DELETE CASCADE  
 ON UPDATE CASCADE,

 CONSTRAINT fk__DocPrim_ADDRESS_ID FOREIGN KEY (ADDRESS_ID)  
 REFERENCES ADDRESS(ADDRESS_ID)  
 ON DELETE CASCADE  
 ON UPDATE CASCADE,
 
 CONSTRAINT fk_MEDICAL_REG_ID FOREIGN KEY (MEDICAL_REG_ID)  
 REFERENCES DOCTOR_MED_REGISTRATION(MEDICAL_REG_ID)  
 ON DELETE CASCADE  
 ON UPDATE CASCADE,

 CONSTRAINT fk_EID FOREIGN KEY (EID)  
 REFERENCES DOCTOR_ESTABLISHMENT(EID)  
 ON DELETE CASCADE  
 ON UPDATE CASCADE,

 CONSTRAINT fk_SECURITY_QUESTIONS_ID FOREIGN KEY (SECURITY_QUESTIONS_ID)  
 REFERENCES SECURITY_QUESTIONS(SECURITY_QUESTIONS_ID)  
 ON DELETE CASCADE  
 ON UPDATE CASCADE
);

insert into admin_primary (Email,Pwd) values 
('admin.medlogapp@gmail.com','9c4636ddbef417a1e18b394eaf633d45e49315933eed8398bc4d180b070a5a61');
##sadmin-pass (AdminPassword)

## inserting values in doctor_med_registration
insert into Doctor_Med_Registration 
(Medical_Reg_Id,Registration_Council,Registration_Year,Degree,College,Year_Of_Completion)
values
(123456,'Maharashtra Doctors Ass.','2020','M.B.B.S','Rajiv Gandhi Medical College','2018');


insert into Doctor_Med_Registration 
(Medical_Reg_Id,Registration_Council,Registration_Year,Degree,College,Year_Of_Completion)
values
(452136,'Maharashtra Doctors Ass.','2012','M.D.','K. J. Somaiya Medical College','2010');

insert into Doctor_Med_Registration 
(Medical_Reg_Id,Registration_Council,Registration_Year,Degree,College,Year_Of_Completion)
values
(785698,'India Medical Association','2005','M.D.','AIIMS Nagpur','2003');

insert into Doctor_Med_Registration 
(Medical_Reg_Id,Registration_Council,Registration_Year,Degree,College,Year_Of_Completion)
values
(8512365,'Maharashtra Doctors Ass.','1995','M.D.','B.J. Medical College Pune','1994');

insert into Doctor_Med_Registration 
(Medical_Reg_Id,Registration_Council,Registration_Year,Degree,College,Year_Of_Completion)
values
(256952,'Maharashtra Doctors Ass.','2003','M.D.','D.Y.Patil Medical College','2001');

##Doctor_Establishment
insert into Doctor_Establishment (Establishment,Establishment_Name,Establishment_Location,Establishment_City,Establishment_Pin)
values
('P','Ashakiran Clinic','Dadar West','Mumbai','400014');

insert into Doctor_Establishment (Establishment,Establishment_Name,Establishment_Location,Establishment_City,Establishment_Pin)
values
('P','Dr. Biswas Clinic','Andheri East','Mumbai','400069');

insert into Doctor_Establishment (Establishment,Establishment_Name,Establishment_Location,Establishment_City,Establishment_Pin)
values
('P','Patanhali Clinic','Byculla','Mumbai','400011');


insert into Doctor_Establishment (Establishment,Establishment_Name,Establishment_Location,Establishment_City,Establishment_Pin)
values
('P','Dr. Batra Medical Center','Lower Parel','Mumbai','400013');

insert into Doctor_Establishment (Establishment,Establishment_Name,Establishment_Location,Establishment_City,Establishment_Pin)
values
('P','Instant cure Medicare','Lower Parel','Mumbai','400013');


##Doctor_avail_master
insert into doctor_avail_master (Doctor_Avail_Time,Doctor_Avail_Day,Fees) values
('9:00 am - 8:00pm','Mon-Fri',650);

insert into doctor_avail_master (Doctor_Avail_Time,Doctor_Avail_Day,Fees) values
('10:00 am - 10:00pm','Mon-Sat',500);

insert into doctor_avail_master (Doctor_Avail_Time,Doctor_Avail_Day,Fees) values
('9:00 am - 9:00pm','Mon-Fri',450);

insert into doctor_avail_master (Doctor_Avail_Time,Doctor_Avail_Day,Fees) values
('11:00 am - 7:00pm','Mon-Sat',700);

insert into doctor_avail_master (Doctor_Avail_Time,Doctor_Avail_Day,Fees) values
('10:00 am - 8:00pm','Mon-Fri',350);


##security_questions
insert into security_questions (SECURITY_QUESTION) 
values ("Name of your pet");

insert into security_questions (SECURITY_QUESTION) 
values ("Your favourite sport");

insert into security_questions (SECURITY_QUESTION) 
values ("Your grandfathers Name");

##address
insert into address (Address_line_1,User_State,City,PinCode,Country)
values
('H. No. 54 Kamat Towers','Maharashtra','Mumbai','400015','India');

insert into address (Address_line_1,User_State,City,PinCode,Country)
values
('H. No. 85 Rizwi Conclave','Maharashtra','Mumbai','400035','India');

insert into address (Address_line_1,User_State,City,PinCode,Country)
values
('Flat No.63 Aparna Towers','Maharashtra','Mumbai','400020','India');

insert into address (Address_line_1,User_State,City,PinCode,Country)
values
('Flat No. 23 Will Smith Society','Maharashtra','Mumbai','400085','India');

insert into address (Address_line_1,User_State,City,PinCode,Country)
values
('H. No. 119','Maharashtra','Mumbai','400085','India');

##doctor_primary
insert into doctor_primary
(DOCTOR_ID,SECURITY_QUESTIONS_ANSWER,ADDRESS_ID,MEDICAL_REG_ID,EID,SECURITY_QUESTIONS_ID,
 FNAME,LNAME,EMAIL,PWD,PHONE_NUMBER,GENDER,PAN_CARD,ADHAAR_CARD,SPECIALIZATION,YEAR_OF_EXPERIENCE)
values
(10001,'Tommy',10001,123456,10001,1,'Nitin','Kamat','nitinkamat@gmail.com','6369c414ca3b9d05c4e303e1d646d0a7a16fd3260d092287528da583855f1104',
 '9822140878','M','FDR87654FR','256536521452','General',3);

insert into doctor_primary
(DOCTOR_ID,SECURITY_QUESTIONS_ANSWER,ADDRESS_ID,MEDICAL_REG_ID,EID,SECURITY_QUESTIONS_ID,
 FNAME,LNAME,EMAIL,PWD,PHONE_NUMBER,GENDER,PAN_CARD,ADHAAR_CARD,SPECIALIZATION,YEAR_OF_EXPERIENCE)
values
(10002,'Arjun',10002,256952,10002,1,'Anil','Jain','aniljain@gmail.com','77a01ca35e4ccb42fd1576b2b8f7c0d249d7ea5bf9f71c629f758f43c6d08a6b',
 '8390816370','M','FDR5467GFR','965236545821','Cardiac',20);

insert into doctor_primary
(DOCTOR_ID,SECURITY_QUESTIONS_ANSWER,ADDRESS_ID,MEDICAL_REG_ID,EID,SECURITY_QUESTIONS_ID,
 FNAME,LNAME,EMAIL,PWD,PHONE_NUMBER,GENDER,PAN_CARD,ADHAAR_CARD,SPECIALIZATION,YEAR_OF_EXPERIENCE)
values
(10003,'Brandy',10003,452136 ,10003,1,'Mukesh','Sharma','mukeshsharma@gmail.com','55cc2a54fd898e4879d1e52c97cf3847fc243de2ef6b7920eeb083425d9ffa07',
 '9822543658','M','FD6798DFRG','658961364525','Sergion',11);

insert into doctor_primary
(DOCTOR_ID,SECURITY_QUESTIONS_ANSWER,ADDRESS_ID,MEDICAL_REG_ID,EID,SECURITY_QUESTIONS_ID,
 FNAME,LNAME,EMAIL,PWD,PHONE_NUMBER,GENDER,PAN_CARD,ADHAAR_CARD,SPECIALIZATION,YEAR_OF_EXPERIENCE)
values
(10004,'Lovely',10004,785698,10004,1,'Asif','Shaikh','asifshaikh@gmail.com','86c5f5144a021c5bceae77eb6e7c7bc7c4338ae6b1c21aa29f3b11024217ae33',
 '9658962536','M','ASDF6598FR','586952365220','Pediatric',18);

insert into doctor_primary
(DOCTOR_ID,SECURITY_QUESTIONS_ANSWER,ADDRESS_ID,MEDICAL_REG_ID,EID,SECURITY_QUESTIONS_ID,
 FNAME,LNAME,EMAIL,PWD,PHONE_NUMBER,GENDER,PAN_CARD,ADHAAR_CARD,SPECIALIZATION,YEAR_OF_EXPERIENCE)
values
(10005,'Maddy',10005,8512365,10005,1,'Rajiv','Puranik','rajivpuranik@gmail.com','97fe2bfc53a73ae78191d63011d91413835ddfa8bb6c6ab2252f33ac896cb4a9',
 '8563965214','M','AKHT67545D','120259635214','General',28);

##patient_med_record

insert into patient_med_record 
(BLOOD_PRESSURE,WEIGHT,SUGAR_LEVEL,BLOOD_GROUP,DISABILITY) values
('125/95',65.35,'135','AB+','N');

insert into patient_med_record 
(BLOOD_PRESSURE,WEIGHT,SUGAR_LEVEL,BLOOD_GROUP,DISABILITY) values
('145/105',85.35,'145','B+','N');

insert into patient_med_record 
(BLOOD_PRESSURE,WEIGHT,SUGAR_LEVEL,BLOOD_GROUP,DISABILITY) values
('115/85',95.52,'145','A+','N');

insert into patient_med_record 
(BLOOD_PRESSURE,WEIGHT,SUGAR_LEVEL,BLOOD_GROUP,DISABILITY) values
('125/95',85.35,'125','A+','N');

insert into patient_med_record 
(BLOOD_PRESSURE,WEIGHT,SUGAR_LEVEL,BLOOD_GROUP,DISABILITY) values
('110/80',90.35,'145','B+','N');

##address_patient
insert into address (Address_line_1,User_State,City,PinCode,Country)
values
('H. No. 25 Mittal Towers','Maharashtra','Mumbai','400065','India');

insert into address (Address_line_1,User_State,City,PinCode,Country)
values
('H. No. 45 Ranjiani conclave','Maharashtra','Mumbai','400085','India');

insert into address (Address_line_1,User_State,City,PinCode,Country)
values
('Flat No.34 Y. B. Chavan Center','Maharashtra','Mumbai','400010','India');

insert into address (Address_line_1,User_State,City,PinCode,Country)
values
('Flat No. 23 Royal Orchids','Maharashtra','Mumbai','400042','India');

insert into address (Address_line_1,User_State,City,PinCode,Country)
values
('H. No.32 Raheja Towers','Maharashtra','Mumbai','400085','India');
