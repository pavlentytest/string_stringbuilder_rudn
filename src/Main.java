public class Main {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        // нельзя так сравнить
        System.out.println(str1==str2); // true

        String st1 = new String("School");
        String st2 = new String("School");
        // нелья так сравнить строки
        System.out.println(st1==st2); // false

        // Вот так сравнивать правильно!
        System.out.println(st1.equals(st2));

        // immutable - неизменяемые
        String test = "To do!";
        System.out.println(test.hashCode());
        test += " Something!"; // "To do! Something"
        System.out.println(test);
        System.out.println(test.hashCode());

        // mutable строки
        // StringBuilder (StringBuffer)
        StringBuilder stringBuilder = new StringBuilder("Moscow!");
        System.out.println(stringBuilder.hashCode());
        stringBuilder.append(" asdfasdgadfg");
        System.out.println(stringBuilder.hashCode());

        System.out.println(stringBuilder.toString());

        int a = 100;
        Integer b = 100;
        a = b;
        b = a;

    }
}