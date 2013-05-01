package uk.ac.shu.webarch.register

class RegisterEntry {

  String time
  RegistrationSheet registrationSheet 
  Student student  

  static constraints = {
    time(nullable:false, blank:false, maxSize:20);  
    }

  static mapping = {
    table 'student_register_enter'
    student column: 'student_fk'
  }


}
