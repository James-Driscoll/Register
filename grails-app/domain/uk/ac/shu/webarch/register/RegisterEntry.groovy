package uk.ac.shu.webarch.register

class RegisterEntry {

  /* The student signing this register */
  Student student

  /* The register being signed */
  RegistrationSheet regSheet

  /* Date/Time of the signing */
  Long timestamp

  /* 
   * No constraints for this simple domian class
   */
  static constraints = {
    timestamp(nullable:false, blank:false);
  }

  /*
   * Again, we use a cleaner and more traditional join table name
   */
  static mapping = {
    table 'student_register_entry'
    student column: 'student_fk'
  }
}
