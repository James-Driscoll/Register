package uk.ac.shu.webarch.register		//Packages.

class Enrollment {				//Class name.

  Student student				//Student object.
  Session session 				//Session object.

    static constraints = {			//No constraints necessary as they are already in the session and student classes.
    }

  static mapping = {				
    table 'course_student'			//Set link table name.
    student column: 'student_fk'		//Set foreign key column names to more understandable names.
    session column: 'session_fk'
    }

}
