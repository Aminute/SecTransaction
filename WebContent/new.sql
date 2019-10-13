use sectrans;
alter table user add user_school VARCHAR(30) not NULL;
alter table user add user_major VARCHAR(30) not NULL;
alter table user add user_sid VARCHAR(30) not NULL;
alter table user add user_res1 VARCHAR(30) not NULL;
alter table user add user_res2 VARCHAR(30) not NULL;
//创建表
CREATE TABLE goods_sell (
  goods_id varchar(10) NOT NULL,
  user_id varchar(18) not null ,
  goods_price int not null,
	goods_class varchar(10) not null,
	goods_comment VARCHAR(30) not null,
	goods_picture VARCHAR(30) not null,
	goods_res1 VARCHAR(30),
	goods_res2 VARCHAR(30)
) DEFAULT CHARSET=UTF8; 
alter table goods_sell add goods_name VARCHAR(30) not NULL;