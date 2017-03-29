Create table Student(
  sid int(3) primary key,
  sname varchar(20) not null,
  spassword varchar(10) not null,
  sEmailId varchar(15),
  cpi decimal(2,2) not null,
  placementStatus bit(1) not null,
  placedCompany varchar(20),
  salary decimal(3,2) not null
);

Create table TechStudent(
  sid int(3) primary key,
  branch varchar(10) not null,
  requirements varchar(20)
  Constraint fk_sidt Foreign key(sid) references Student(sid)
);

Create table NonTechStudent(
  sid int(3) primary key,
  requirements varchar(20)
  Constraint fk_sidn Foreign key(sid) references Student(sid)
);

Create table Company(
  cid int(3) primary key,
  cname varchar(20) not null,
  cpassword varchar(10) not null,
  cEmailId varchar(15),
  cpiCriteria decimal(2,2) not null,
  city varchar(10),
  StudentsRequired int(3) not null,
  salary decimal(3,2) not null
);

Create table TechCompany(
  cid int(3) primary key,
  branch varchar(10) not null,
  requirements varchar(20)
  Constraint fk_cidt Foreign key(cid) references Company(cid)
);

Create table NonTechCompany(
  sid int(3) primary key,
  requirements varchar(20)
  Constraint fk_cidn Foreign key(cid) references Company(cid)
);

Create table CellMember(
  clid int(3) primary key,
  clname varchar(20) not null,
  clpassword varchar(10) not null,
  clEmailId varchar(15),
  ContactNumber int(10) not null unique,
  year char(3),
  category varchar(20)
);
