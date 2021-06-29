
public class Demo {
    public static void main(String args[]){
        /*
        Write a program to make a new string with all the consonants deleted from the 
        string "Hello, have a good day". 
        */
        String original="Hello, have a good day";
        StringBuffer buffer=new StringBuffer(original);
        int length=buffer.length();
        for(int i=0; i<length; i++){
            char ch=buffer.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                System.out.println(i+ " "+ch);
                buffer.deleteCharAt(i);
                i--;length--;
            }
        }
        String newStr=buffer.toString();
        System.out.println(original);
        System.out.println(newStr);
               
    }
}
