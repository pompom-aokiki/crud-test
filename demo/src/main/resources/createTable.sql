DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS supplier;

create table customer( id int NOT NULL PRIMARY KEY, name varchar(10) NOT NULL, age tinyint, buy_count int NOT NULL, ins_dt DATE NOT NULL,  upd_dt DATE NOT NULL );
create table product( id int NOT NULL PRIMARY KEY, name varchar(10) NOT NULL, price int NOT NULL, stok_count int NOT NULL, ins_dt DATE NOT NULL,  upd_dt DATE NOT NULL );
create table supplier( id int NOT NULL PRIMARY KEY, name varchar(10) NOT NULL, price int NOT NULL, stok_count int NOT NULL, ins_dt DATE NOT NULL,  upd_dt DATE NOT NULL );
