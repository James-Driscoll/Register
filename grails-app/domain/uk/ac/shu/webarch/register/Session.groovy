package uk.ac.shu.webarch.register

class Session {

  String sessionCode
  String name
  Course course
  Instructor instructor

  Set registrationSheets
  Set enrolledStudents

  static hasMnay = [registrationSheets: RegistrationSheet, enrolledStudents: Enrollment]
  
  static mappedBy = [registrationSheets: "session", enrolledStudents: "session"]

  static constraints = {
    sessionCode(nullable:false, blank:false, maxSize:10);
    name(nullable:false, blank:false, maxSize:10);
  }
  
  static mapping = {
    instructor column:'instructor_fk'
    course column:'course_fk'
  }
}
