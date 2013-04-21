package uk.ac.shu.webarch.register

class Enrollment {

  Student student
  RegClass regClass

  static constraints = {
  }

  static mapping = {
    table 'course_student'
    student column: 'student_fk'		//FK's linkning to Student & RegClass classes.
    regClass column: 'reg_class_fk'
  }
}
