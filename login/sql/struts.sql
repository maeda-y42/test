set names utf8;
set foreign_key_checks = 0;
drop database if exists logindb_maeda;
create database logindb_maeda;
use logindb_maeda;

create table user(
id int,
user_name varchar(255),
password vachar(255)
);

insert into user values
(1,"taro","123"),
(2,"jiro","123"),
(3,"hanako","123"),
(4,"saburo","123");