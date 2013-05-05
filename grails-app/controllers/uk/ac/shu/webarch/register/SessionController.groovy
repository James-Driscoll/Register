package uk.ac.shu.webarch.register

import grails.converters.*

class SessionController {

    def index() {
        
      def result=[
        classList:'one',
        b:'two'
      ]

      withFormat {
        html result
        xml { render result as XML }
        json { render result as JSON }
      }  
 }

}
