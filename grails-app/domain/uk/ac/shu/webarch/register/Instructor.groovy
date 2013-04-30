package uk.ac.shu.webarch.register

class Instructor {

  String instructorNo
  String name
  
  Set sessions

  static hasMany = [sessions: Session]
  static mappedBy = [sessions: "instructor"]

  static constraints = {
    instructorNo(nullable:false, blank:false, maxSize:10);
    name(nullable:false, blank:false, maxSize:50);
  }
}
