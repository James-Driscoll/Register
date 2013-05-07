package uk.ac.shu.webarch.register				//Packages.

class Session {							//Class name.

  String sessionCode						//Unique Session identifier.
  String name
  Course course							//Course object.
  Instructor instructor						//Instructor object.

  Set registrationSheets			//Session has set of registration sheets for defferent instances, eg week1, week2..
  Set enrolledStudents						//Session has a set of enrolled students.	

  static hasMnay = [registrationSheets: RegistrationSheet, enrolledStudents: Enrollment]
  
  static mappedBy = [registrationSheets: "session", enrolledStudents: "session"]

  static constraints = {					//Constraints that need to be met for successful record creation.
    sessionCode(nullable:false, blank:false, maxSize:50);
    name(nullable:false, blank:false, maxSize:150);
  }
  
  static mapping = {
    instructor column:'instructor_fk'				//Set foreign key column names.
    course column:'course_fk'
  }
}
