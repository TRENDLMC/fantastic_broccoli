drop table accountnum;

CREATE table accnum(
customername varchar2(10),
customernum NUMBER PRIMARY key,
accountnumber varchar2(20) not null,
passward number,
meney number
);

drop view view_num_meney;

INSERT into accnum VALUES('임명철',numadd.nextval,'1241224-1',1231,10000);

CREATE VIEW view_num_meney_name as SELECT
accountnumber,meney,customername
FROM accnum;

CREATE view view_meney as 
SELECT
meney
FROM accnum;

select
*
from accnum;

SELECT
*
from view_meney where customername='임명철';

CREATE SEQUENCE numadd
INCREMENT by 1
START with 1;


       
