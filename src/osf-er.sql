
/* Drop Tables */

DROP TABLE Board CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE Board
(
	num number(10,0) NOT NULL,
	Title varchar2(150),
	Content varchar2(4000)
);



