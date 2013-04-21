package uk.ac.shu.webarch.register

class Course {
  
  String courseCode
  String courseName
  String description
  

  /* The set of classes where this course is being taught */
  Set classes

  static constraints = {
    courseCode maxSize: 5		//Set maximum sizes for course name and code.
    courseName maxSize: 50
  }

  static hasMany = [classes: RegClass]		//Relationship to RegClass.
  static mappedBy = [classes: 'course']


  static mapping = {
    table 'course'
    courseName column: 'course_name'
    courseCode column: 'mapped_course_code'
    courseDescription column: 'course_desc', type:'text'	//Lob text for large text field.
  }
}
