package daySeven;

public class StringBuilders {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Hello World");
//        System.out.println(sb);
//        sb.append(" how are you");
//        System.out.println(sb);
//        sb.insert(5, "!");
//        System.out.println(sb);
//        sb.delete(0, 5);
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);
//        sb.replace(0, 5, "ROUTE ".toLowerCase());
//        System.out.println(sb);

        addSpace("EgyptianNationalTeamWillPlayToday");

    }
    static void addSpace(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(Character.isUpperCase(c) && i > 0){
            sb.append(" ");
            }
            sb.append(c);
        }
        System.out.println(sb);

    }
}
