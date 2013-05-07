package uk.ac.shu.webarch.register			//Packages.

class RegisterEntry {					//Classs name.

  String time						//Timestamp - exact time that the student signed the register. 
  RegistrationSheet registrationSheet 			//RegistrationSheet object.
  Student student  					//Student object.

  static constraints = {				//Constraints that need to be met for successful record creation.
    time(nullable:false, blank:false, maxSize:100);  
    }

  static mapping = {					
    table 'student_register_enter'			//Set table name.
    student column: 'student_fk'			//Set foreign key column name.
  }


}
