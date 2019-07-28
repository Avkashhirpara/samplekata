import mockit.Mock
import mockit.MockUp
import spock.lang.Unroll

class StringCalculaterSpec extends spock.lang.Specification {

//    def obj = Mock(InputString)
//
//    def setup(){
//        obj.remove(10) >> 10
//    }

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
        "10,20" | 30
    }

    def "this feature mock the method with interface"(){

        given:
            SimpleInterface obj = Stub(SimpleInterface.class)
            obj.remove(10) >> 11
        when:

            def result = obj.remove(10)

        then:

          result == 25
    }

    def "this feature mock method without interface using jmockit"(){
        setup:
            new MockUp<InputString>(){
                @Mock
                public int remove(int a){
                    return 25
                }
            }

            def obj = new InputString();
        when:
            def result = obj.remove(10)
        then:
             result == 25
        
    }

}
