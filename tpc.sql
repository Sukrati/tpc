Create table Student(
  sid varchar(10) primary key,
  sname varchar(20) not null,
  spassword varchar(10) not null,
  sEmailId varchar(15),
  cpi decimal(4,2) not null,
  placementStatus bit(1) not null,
  placedCompany varchar(20),
  salary decimal(4,2)
);

Create table TechStudent(
  sid varchar(10) primary key,
  interest varchar(20),
  branch varchar(10) not null,
  Constraint fk_sidt Foreign key(sid) references Student(sid)
);

Create table NonTechStudent(
  sid varchar(10) primary key,
  interest varchar(20),
  Constraint fk_sidn Foreign key(sid) references Student(sid)
);

Create table Company(
  cIN int primary key,
  cname varchar(20) not null,
  cEmailId varchar(25),
  cpiCriteria decimal(4,2) not null,
  city varchar(10),
  visitDate date,
  salary decimal(4,2) not null
);

Create table TechCompany(
  cIN int primary key,
  branch varchar(10) not null,
  requirements varchar(20),
  Constraint fk_cidt Foreign key(cIN) references Company(cIN)
);

Create table NonTechCompany(
  cIN int primary key,
  requirements varchar(20),
  Constraint fk_cidn Foreign key(cIN) references Company(cIN)
);

Create table CellMember(
  cid varchar(10) primary key,
  cname varchar(20) not null,
  cpassword varchar(10) not null,
  cEmailId varchar(30);
  ContactNumber varchar(15) unique,
  year char(3),
  gender char(1),
  category varchar(20)
);
