package solution


import grails.rest.*
import grails.converters.*

class PlaceController extends RestfulController {
    static responseFormats = ['json']
    PlaceController() {
        super(Place)
    }
}
