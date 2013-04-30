package uk.ac.shu.webarch.register

class Student {

  String studentNo
  String name
  String comment
  
  Set courses
  Set regEntries
  

  static hasMany = [courses: Enrollment, regEntries: RegisterEntry]

  static mappedBy = [courses: "student", regEntries: "student"]

  static constraints = {
    studentNo(nullable:false, blank:false, maxSize:10);
    name(nullable:false, blank:false, maxSize:50);
    comment(nullable:true, blank:true);
  }
}
