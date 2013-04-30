package uk.ac.shu.webarch.register

class Enrollment {

  Student student
  Session session 

    static constraints = {
    }

  static mapping = {
    table 'course_student'
    student column: 'student_fk'
    session column: 'session_fk'
    }

}
