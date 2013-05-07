package uk.ac.shu.webarch.register			//Packages.

class Instructor {					//Class Name.

  String instructorNo					//Unique instructor identifier.
  String name
  String password
  
  Set sessions						//Instructor teaches a set of sessions.
							//Set because the order is not important.

  static hasMany = [sessions: Session]			//One-to-many expression.
  static mappedBy = [sessions: "instructor"]		//Linked by.

  static constraints = {				//Constraints that need to be met for successful record creation.
    instructorNo(nullable:false, blank:false, maxSize:50);
    name(nullable:false, blank:false, maxSize:150);
    password(nullable:true, black:true, maxsize:50);
  }
}
