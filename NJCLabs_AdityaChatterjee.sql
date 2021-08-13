create database NJC_Labs;

show databases;

create table movies
(
  Movie_Name varchar(50),
  Lead_Actor varchar(50),
  Release_Year  int(4),
  Director_Name varchar(50)
  );
  show tables;
  
  insert into movies
  values("Dilwale","Shah Rukh Khan",2015,"Rohit Shetty");
  
  insert into movies
  values("Rambo","John Rambo",1972,"Sam Trautman");

select * from movies;  