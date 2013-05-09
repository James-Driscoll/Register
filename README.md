Register
========

Web Architectures - Assignment 2

This project is a portfolio entry for the Sheffield Hallam Web Architectures module. It is used to develop an MVC Application designed to monitor attendance - called Register.

I am a Computing student, and this is my first implementation using a Model View Controller framework. The Register application unfortunately does not contain all the functionality required for a release grade development however it does portray a journey of experimentation with an unfamiliar system. It is recommended you view the commit history for a detailed timeline of development.




Project Download
------------------------

In order to fully test the application locally it is possible to download the project to a local directory from the git remote repository. To do this there are a small variety of requirements that target computer must have. 

•  A Linux operating system is recommended, and furthermore a Debian distribution for best results.
o	Here is a link to the download page for Debian if it is required: http://www.debian.org/distrib/netinst

•	A working installation of Grails is crucial.
o	Grails download: http://grails.org/download
o	Grails apt package manager install for Ubuntu: http://grails.org/download/ubuntu

•	A working installation of MySQL, with Register database setup.
o	Here is the command necessary to install MySQL via the Linux apt package management system: sudo apt-get install mysql-server mysql-client
o	Log into the newly installed MySQL, it is recommended that you change the default password and hostname from the root account.
o	This command creates the database necessary for the Register application: create database register default charset utf8 default collate utf8_bin;
o	This commands grants access to the database by a local user, called ‘webarch’: grant all on register.* to 'webarch'@'localhost' identified by 'webarch';

•	A working installation of Git. To install on Debian, it is possible to use: apt-get install git

•	Now the target machine should be ready to download the project data. Open the Terminal and navigate using cd and ls to the parent directory that you would like the application to be installed into. Type:
o	git clone git://github.com/b1015297/Register.git
o	This will download a read-only copy of the git project to your local directory.

•	The application is now ready to be run. Type grails run-app

•	When this operation has completed it should display a link, open this link in a web browser to use the application.

•	When finished testing the application, the project directory can simply be deleted from the local machine.
o	It is also recommended that the database is removed. To do this open MySQL in the Terminal and type drop database register;



