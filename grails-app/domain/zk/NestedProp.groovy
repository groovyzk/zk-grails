package zk

class NestedProp {

    Long id
    String  strField = "data"
    Boolean boolField = true
    Integer intField = 10
    Date    dateField = new Date()
    Double  doubleField = 20.50
    User    user

    static constraints = {
    }

}
