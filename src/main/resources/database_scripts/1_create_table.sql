ENUM('org1','org2','org3');

CREATE TABLE VENDOR(

 id varchar;
 name varchar;
 org varchar;
 
)

CREATE TABLE FEEDBACK(

 id varchar;
 vendor_id varchar;
 comments varchar;
 rating varchar;
 
)