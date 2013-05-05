package uk.ac.shu.webarch.register

class RegistrationSheet {

  String date
  String comment
  Session session

  Set regEntries

  static hasMany = [regEntries: RegisterEntry]
  static mappedBy = [regEntries: "registrationSheet"]
  
  static constraints = {
    date(nullable:false, blank:false, maxSize:50);
    comment(nullable:true, blank:true);
  }
}
