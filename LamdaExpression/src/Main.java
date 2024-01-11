import com.info.demo.FuncInterface;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        FuncInterface str = s-> {
            int a=s.length();
            System.out.println("test");
            return a;
        };

        System.out.println(str.strLength("Hello World"));



    }
}