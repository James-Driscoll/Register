package uk.ac.shu.webarch.register

class RegClass {		//Class Name

				//Attributes
				
  String sessionCode		//Class code - Used in URLs to generate short clean COOL URLs
  String sessionName  

  
  Instructor classInstructor	//Instructor teaching this class

  Course course			//This class is an occurrence of which course?

  
  Set enrolledSudents		//The set of students enrolled on this class
  Set registrationSheets



				//Relationships
  static hasMany = [
    enrolledStudents:Enrollment, registrationSheets:RegistrationSheet
  ]

  static mappedBy = [
    enrolledStudents:'regClass', registrationSheets:'regClass'
  ]

  static constraints = {
  }
				//Constraints
  static mapping = {
    classInstructor column:'instructor_fk'
    course column:'course_fk'
    sessionCode column: 'session_code'
    sessionName column: 'session_name'
  }

   
}
