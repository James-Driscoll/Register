package uk.ac.shu.webarch.register

class RegistrationSheet {

  String date
  String comment
  Session session


  static hasMany = [RegEntries: RegisterEntry]
  static mappedBy = [RegEntries: "RegistrationSheet"]
  
  static constraints = {
    date(nullable:false, blank:false, maxSize:10);
    comment(nullable:true, blank:true);
  }
}
