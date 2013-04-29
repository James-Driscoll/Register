package uk.ac.shu.webarch.register

class Session {

  String sessionCode
  String name
  Course course
  Instructor instructor

  static hasMnay = [registrationSheets: RegistrationSheet]
  static mappedBy = [registrationSheets: "session"]

  static constraints = {
    sessionCode(nullable:false, blank:false, maxSize:10);
    name(nullable:false, blank:false, maxSize:10);
    }
}
