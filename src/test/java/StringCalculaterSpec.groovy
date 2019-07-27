import spock.lang.Unroll

class StringCalculaterSpec extends spock.lang.Specification {

    @Unroll
    def "add operation #inputstring"() {
        given: "there is an input string #inputstring"
        InputString obj= new InputString()
        when: "an input string is empty"
             //result = obj.add(inputstring)
        then:
             result == obj.add(inputstring)
        where:
        inputstring | result
        "1"   |   1
        "2"   |   2
        "1,2" |    3
    }


}
