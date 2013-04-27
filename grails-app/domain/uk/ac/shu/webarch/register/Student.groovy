package uk.ac.shu.webarch.register

class Student {					//Class Name.

  String studentFirstName			//Attributes.
  String studentLastName
  String studentNumber
  String studentNotes

  
  Set courses					//The courses this student is enrolled on.
  
  Set classAtts					//The set of classes this student has attended.

  /* This demonstrates why the hasMany structure is a list.. in this case we have a
     domain class with many set objects, so the hasMany metadata needs to specify several
     different sets */

  static hasMany = [				//Relationships.
    courses: Enrollment,
    classAtts: RegisterEntry
  ]

  static mappedBy = [				//Where to form the join.
    courses:'student',
    classAtts:'student'
  ]

						//Contraints.
  static constraints = {
    studentFirstName(nullable:false, blank:false,maxSize:256);
    studentNumber(nullable:false, blank:false,maxSize:256);
    }

  static mapping = {			
    table 'student'
    studentFirstName column: 'first_name'
    studentLastName column: 'last_name'
    studentNumber column: 'student_number'
    studentNotes column: 'student_notes', type:'text'	  

  }
}
