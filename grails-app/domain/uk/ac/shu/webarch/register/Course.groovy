package uk.ac.shu.webarch.register

class Course {					//Class Name
  			
  String courseCode				//Attributes
  String courseName
  String courseDescription
  

  Set classes					//The set of classes where this course is being taught

  static constraints = {			//Constraints
  courseCode maxSize: 5			
  courseName maxSize: 50
  }

  static hasMany = [classes: RegClass]		//Relationship to RegClass.
  static mappedBy = [classes: 'course']		//Where to form the join.


  static mapping = {
    table 'course'
    courseName column: 'course_name'
    courseCode column: 'mapped_course_code'
    courseDescription column: 'course_desc', type:'text'	//Lob text for large text field.
  }
}
