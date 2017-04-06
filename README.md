# Tiny Java App (Swing) to validate usernames.

### The .jar file is in ./dist

## You should restore MySQL DB to use app successfully - The user&pass must be "root"

 $ mysql -uroot -proot < appuser.sql

 ### OR

 $ mysql -uroot -proot -h localhost appuser < appuser.sql 

 ## OR

 $ mysql -uroot -proot -h localhost

  	> create database appuser;
	> use appuser;
	\. appuser.sql or
