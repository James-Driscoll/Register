package uk.ac.shu.webarch.register			//Packages.

class RegistrationSheet {				//Class name.

  String date						//Date of registration.
  String comment					//Any comments necessary.
  Session session					//Session object.

  Set regEntries					//Registration sheet contains many register entries.

  static hasMany = [regEntries: RegisterEntry]		//One-to-many expression.
  static mappedBy = [regEntries: "registrationSheet"]	//Link.
  
  static constraints = {				//Constraints that need to be met for successful record creation.	
    date(nullable:false, blank:false, maxSize:50);
    comment(nullable:true, blank:true);
  }
  
  static mapping = {
    comment column: 'regsheet_comment', type:'text'	//Long text field.
  }
}
