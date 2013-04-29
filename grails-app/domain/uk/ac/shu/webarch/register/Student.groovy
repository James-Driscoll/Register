package uk.ac.shu.webarch.register

class Student {

  String studentNo
  String name
  String comment
  
  static hasMany = [RegEntries: RegisterEntry]
  static mappedBy = [RegEntries: "RegistrationSheet"]

  static constraints = {
    studentNo(nullable:false, blank:false, maxSize:10);
    name(nullable:false, blank:false, maxSize:50);
    comment(nullable:true, blank:true);
  }
}
