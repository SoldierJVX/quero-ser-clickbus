package solution


import grails.rest.*
import grails.converters.*

class PlaceController extends RestfulController {
    static responseFormats = ['json']
    PlaceController() {
        super(Place)
    }

    def search(String q, Integer max ) {
        if (q) {
            def query = Place.where {
                name ==~ "%${q}%"
            }
            respond query.list(max: Math.min( max ?: 10, 100))
        }
        else {
            respond([])
        }
    }
}
