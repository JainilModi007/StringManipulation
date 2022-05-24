import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();     // input string
        int skip = sc.nextInt();        // no. of skip words
        int count = 0;                  // total sentences in paragraph
        
        String[] res = str.split("[.]", 0);             // split the paragraph by dot 
        for(String Str: res) {
            count++;                            // count total sentence.
        }
       
        for(int i=0;i<count;i++)
            reverse(res[i] , skip);            // pass every sentence and no.of skip word in reverse function
    }

    public static void reverse(String sub , int key){
        String rev = "";
       
        String s[] = sub.split(" ");            // split sentence into words
       
        for(int i=0;i<s.length-key;i++){        // reverse the sentence according to skip 
            rev = s[i]+" "+rev;
        }
       

        for(int i=s.length-key ; i<s.length ; i++){
            rev = rev + s[i] + " ";             // add remaining word of sentence
        }
       
        System.out.print(rev + ".");            // final sentence
    }   
}












// Test cases :

// Input String : Hi there . My name is Sam . This is my lucky day . I like coding so much . This is it.
// No . of skip word : 2

// Output : Hi there .name My  is Sam .my is This  lucky day .coding like I  so much .This  is it .


// Input String : Hi there . My name is Sam . This is my lucky day . I like coding so much . This is it.
// No . of skip word : 1

// Output : Hi there .is name My  Sam .lucky my is This  day .so coding like I  much .is This  it .
