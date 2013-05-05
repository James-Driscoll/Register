package uk.ac.shu.webarch.register

class Course {
  
  String courseCode
  String name
  String description

  Set sessions

  static hasMany = [sessions: Session]
  static mappedBy = [sessions: "course"]
 
  static constraints = {
    courseCode(nullable:false, blank:false, maxSize:50);
    name(nullable:false, blank:false, maxSize:150);
    description(nullable:true, blank:true);
    }

  static mapping = {
    table 'course'
    description column: 'course_desc', type:'text'
  }

}
