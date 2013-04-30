package uk.ac.shu.webarch.register

class Course {
  
  String courseCode
  String Name
  String description

  Set sessions

  static hasMany = [sessions: Session]
  static mappedBy = [sessions: "course"]
 

    static constraints = {
    courseCode(nullable:false, blank:false, maxSize:10);
    name(nullable:false, blank:false, maxSize:50);
    description(nullable:true, blank:true);
    }
}
