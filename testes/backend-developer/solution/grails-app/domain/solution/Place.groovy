package solution

class Place {
    String name
    String slug
    String city
    String state
    Date dateCreated
    Date lastUpdated

    static constraints = {
        name blank:false
        slug blank:false
        city blank:false
        state blank:false
    }
}
