DROP TABLE IF EXISTS orders;

CREATE TABLE orders (ID INT PRIMARY KEY, amount decimal);

INSERT INTO orders (ID,amount) VALUES (1,2000);
INSERT INTO orders (ID,amount) VALUES (2,2001);
INSERT INTO orders (ID,amount) VALUES (3,2002);
INSERT INTO orders (ID,amount) VALUES (4,2003);
INSERT INTO orders (ID,amount) VALUES (5,2004);
INSERT INTO orders (ID,amount) VALUES (6,2005);
insert into orders(id,amount) values (7, 2006);
insert into orders(id,amount) values (8, 2007);
insert into orders(id,amount) values (9, 2008);
insert into orders(id,amount) values (10, 2009);
insert into orders(id,amount) values (11, 2010);
insert into orders(id,amount) values (12, 2011);
insert into orders(id,amount) values (13, 2012);
insert into orders(id,amount) values (14, 2013);
insert into orders(id,amount) values (15, 2014);
insert into orders(id,amount) values (16, 2015);
insert into orders(id,amount) values (17, 2016);
insert into orders(id,amount) values (18, 2017);
insert into orders(id,amount) values (19, 2018);
insert into orders(id,amount) values (20, 2019);
insert into orders(id,amount) values (21, 2020);
insert into orders(id,amount) values (22, 2021);
insert into orders(id,amount) values (23, 2022);
insert into orders(id,amount) values (24, 2023);
insert into orders(id,amount) values (25, 2024);
insert into orders(id,amount) values (26, 2025);
insert into orders(id,amount) values (27, 2026);
insert into orders(id,amount) values (28, 2027);
insert into orders(id,amount) values (29, 2028);
insert into orders(id,amount) values (30, 2029);

DROP TABLE IF EXISTS order_lines;

CREATE TABLE order_lines (ID INT PRIMARY KEY, product varchar(32), order_id int,
           quantity int, unit_price decimal);
insert into order_lines(id, product,order_id, quantity, unit_price)
      values(1,'prod11',1,5,200);
insert into order_lines(id, product,order_id, quantity, unit_price)
      values(2,'prod12',1,10,100);

insert into order_lines(id, product,order_id, quantity, unit_price)
      values(3,'prod21',2,5,200);
insert into order_lines(id, product,order_id, quantity, unit_price)
      values(4,'prod22',2,10,100);
insert into order_lines(id, product,order_id, quantity, unit_price)
      values(5,'prod23',2,1,1);

insert into order_lines(id,product,order_id, quantity, unit_price) values(6,'prod31', 3,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(7,'prod31', 3,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(8,'prod31', 3,1,2);

insert into order_lines(id,product,order_id, quantity, unit_price) values(9,'prod41', 4,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(10,'prod41', 4,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(11,'prod41', 4,1,3);

insert into order_lines(id,product,order_id, quantity, unit_price) values(12,'prod51', 5,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(13,'prod51', 5,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(14,'prod51', 5,1,4);

insert into order_lines(id,product,order_id, quantity, unit_price) values(15,'prod61', 6,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(16,'prod61', 6,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(17,'prod61', 6,1,5);

insert into order_lines(id,product,order_id, quantity, unit_price) values(18,'prod71', 7,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(19,'prod71', 7,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(20,'prod71', 7,1,6);

insert into order_lines(id,product,order_id, quantity, unit_price) values(21,'prod81', 8,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(22,'prod81', 8,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(23,'prod81', 8,1,7);

insert into order_lines(id,product,order_id, quantity, unit_price) values(24,'prod91', 9,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(25,'prod91', 9,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(26,'prod91', 9,1,8);

insert into order_lines(id,product,order_id, quantity, unit_price) values(27,'prod101', 10,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(28,'prod101', 10,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(29,'prod101', 10,1,9);

insert into order_lines(id,product,order_id, quantity, unit_price) values(30,'prod111', 11,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(31,'prod111', 11,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(32,'prod111', 11,1,10);

insert into order_lines(id,product,order_id, quantity, unit_price) values(33,'prod121', 12,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(34,'prod121', 12,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(35,'prod121', 12,1,11);

insert into order_lines(id,product,order_id, quantity, unit_price) values(36,'prod131', 13,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(37,'prod131', 13,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(38,'prod131', 13,1,12);

insert into order_lines(id,product,order_id, quantity, unit_price) values(39,'prod141', 14,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(40,'prod141', 14,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(41,'prod141', 14,1,13);

insert into order_lines(id,product,order_id, quantity, unit_price) values(42,'prod151', 15,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(43,'prod151', 15,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(44,'prod151', 15,1,14);

insert into order_lines(id,product,order_id, quantity, unit_price) values(45,'prod161', 16,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(46,'prod161', 16,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(47,'prod161', 16,1,15);

insert into order_lines(id,product,order_id, quantity, unit_price) values(48,'prod171', 17,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(49,'prod171', 17,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(50,'prod171', 17,1,16);

insert into order_lines(id,product,order_id, quantity, unit_price) values(51,'prod181', 18,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(52,'prod181', 18,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(53,'prod181', 18,1,17);

insert into order_lines(id,product,order_id, quantity, unit_price) values(54,'prod191', 19,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(55,'prod191', 19,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(56,'prod191', 19,1,18);

insert into order_lines(id,product,order_id, quantity, unit_price) values(57,'prod201', 20,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(58,'prod201', 20,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(59,'prod201', 20,1,19);

insert into order_lines(id,product,order_id, quantity, unit_price) values(60,'prod211', 21,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(61,'prod211', 21,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(62,'prod211', 21,1,20);

insert into order_lines(id,product,order_id, quantity, unit_price) values(63,'prod221', 22,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(64,'prod221', 22,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(65,'prod221', 22,1,21);

insert into order_lines(id,product,order_id, quantity, unit_price) values(66,'prod231', 23,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(67,'prod231', 23,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(68,'prod231', 23,1,22);

insert into order_lines(id,product,order_id, quantity, unit_price) values(69,'prod241', 24,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(70,'prod241', 24,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(71,'prod241', 24,1,23);

insert into order_lines(id,product,order_id, quantity, unit_price) values(72,'prod251', 25,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(73,'prod251', 25,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(74,'prod251', 25,1,24);

insert into order_lines(id,product,order_id, quantity, unit_price) values(75,'prod261', 26,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(76,'prod261', 26,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(77,'prod261', 26,1,25);

insert into order_lines(id,product,order_id, quantity, unit_price) values(78,'prod271', 27,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(79,'prod271', 27,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(80,'prod271', 27,1,26);

insert into order_lines(id,product,order_id, quantity, unit_price) values(81,'prod281', 28,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(82,'prod281', 28,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(83,'prod281', 28,1,27);

insert into order_lines(id,product,order_id, quantity, unit_price) values(84,'prod291', 29,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(85,'prod291', 29,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(86,'prod291', 29,1,28);

insert into order_lines(id,product,order_id, quantity, unit_price) values(87,'prod301', 30,5,200);
insert into order_lines(id,product,order_id, quantity, unit_price) values(88,'prod301', 30,10,100);
insert into order_lines(id,product,order_id, quantity, unit_price) values(89,'prod301', 30,1,29);
