package uk.ac.shu.webarch.register		//Packages.

class Student {					//Class name.

  String studentNo				//Unique identifier.
  String name
  String comment				//Long datatype.
  String password				
  
  Set courses					
  Set regEntries				//Has a set of register entries.
  

  static hasMany = [courses: Enrollment, regEntries: RegisterEntry]

  static mappedBy = [courses: "student", regEntries: "student"]

  static constraints = {			//Constraints that need to be met for successful record creation.
    studentNo(nullable:false, blank:false, maxSize:50);
    name(nullable:false, blank:false, maxSize:150);
    comment(nullable:true, blank:true);
    password(nullable:false, blank:false, maxSize:50);
  }

  static mapping = {
    comment column: 'student_comment', type:'text'
  }

}
