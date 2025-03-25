public class helloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println(args[0]);
        System.out.println(args[2]);
    }
}
/*so arguments me multiple words strong likhni hai and then it'll print the according to word-indexing
eg. 
PS D:\JavaLearn> javac helloWorld.java
PS D:\JavaLearn> java helloWorld Hemangi loves chocolates and spice
Hello World
Hemangi
chocolates
*/