Create table Student(
  sid varchar(10) primary key,
  sname varchar(20) not null,
  spassword varchar(10) not null,
  sEmailId varchar(15),
  cpi decimal(4,2) not null,
  placementStatus bit(1) not null,
  placedCompany varchar(20),
  salary decimal(3,2)
);

Create table TechStudent(
  sid varchar(10) primary key,
  branch varchar(10) not null
  Constraint fk_sidt Foreign key(sid) references Student(sid)
);

Create table NonTechStudent(
  sid varchar(10) primary key,
  interest varchar(20)
  Constraint fk_sidn Foreign key(sid) references Student(sid)
);

Create table Company(
  cIN int(3) primary key,
  cname varchar(20) not null,
  cEmailId varchar(15),
  cpiCriteria decimal(4,2) not null,
  city varchar(10),
  visitDate date,
  salary decimal(3,2) not null
);

Create table TechCompany(
  cIN int(3) primary key,
  branch varchar(10) not null,
  requirements varchar(20)
  Constraint fk_cidt Foreign key(cIN) references Company(cIN)
);

Create table NonTechCompany(
  cIN int(3) primary key,
  requirements varchar(20)
  Constraint fk_cidn Foreign key(cIN) references Company(cIN)
);

Create table CellMember(
  cid int(3) primary key,
  cname varchar(20) not null,
  cpassword varchar(10) not null,
  cEmailId varchar(15),
  ContactNumber int(10) not null unique,
  year char(3),
  gender char(1),
  category varchar(20)
);
