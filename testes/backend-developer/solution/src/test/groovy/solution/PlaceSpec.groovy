package solution

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PlaceSpec extends Specification implements DomainUnitTest<Place> {

    def setup() {
    }

    def cleanup() {
    }

    void "Try to save invalid data"() {
        when: 'A domain class is saved with invalid data'
        Place place = new Place(name: '', slug: '', city: '', state: '')
        place.save()

        then: 'There were errors and the data was not saved'
        place.hasErrors()
        place.errors.getFieldError('name')
        place.errors.getFieldError('slug')
        place.errors.getFieldError('city')
        place.errors.getFieldError('state')
        Place.count() == 0
    }
}
