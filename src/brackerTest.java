public class brackerTest {
    public static void main(String[] args) {
        myStack<String> myList = new myStack<>(10);
        String myString = "s * (s – a) * s – b) * (s – c)";
        String[] myStringElement = myString.split("");
        boolean isWell = true;
        for (String element: myStringElement) {
            if(element.equals("(")) {
                myList.push(element);
            }else if( element.equals(")") && myList.isEmpty()){
                isWell = false;
                break;
            }
            else if( element.equals(")")){
                    myList.pop();
            }
        }
        if(!myList.isEmpty()){
            isWell = false;
        }
        System.out.println(isWell);
    }
}
