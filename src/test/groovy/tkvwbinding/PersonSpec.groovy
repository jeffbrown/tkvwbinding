package tkvwbinding

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PersonSpec extends Specification implements DomainUnitTest<Person> {

    void "test binding to properties property"() {
        when:
        def p = new Person()
        p.properties = [firstName: 'Robert', lastName: 'Fripp']

        then:
        p.firstName == 'Robert'
        p.lastName == 'Fripp'
    }
}
