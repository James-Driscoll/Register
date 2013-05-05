package uk.ac.shu.webarch.register

class Instructor {

  String instructorNo
  String name
  String password
  
  Set sessions

  static hasMany = [sessions: Session]
  static mappedBy = [sessions: "instructor"]

  static constraints = {
    instructorNo(nullable:false, blank:false, maxSize:50);
    name(nullable:false, blank:false, maxSize:150);
    password(nullable:true, black:true, maxsize:50);
  }
}
