
public class Walter1 {

    public interface Operation {
        public int operate( int a, int b );
    }

    public Operation add = new Operation() {
        public int operate( int a, int b ) { return a + b; } };
    public static Operation subtract = new Operation() {
        public int operate( int a, int b ) { return a - b; } };
    public static Operation divide = new Operation() {
        public int operate( int a, int b ) { return a / b; } };
    public static Operation multiply = new Operation() {
        public int operate( int a, int b ) { return a * b; } };

    public static int calculate( Operation op, int a, int b ) {
        return op.operate( a, b );
    }


    public static class Addition implements Operation {

        @Override
        public int operate( int a, int b ) {
            return a + b;
        }

    }


    public static void main( String[] args ) {
        System.out.println( calculate( new Addition(), 27, 30 ) );
        System.out.println( calculate( subtract, 42, 33 ) );
        System.out.println( calculate( multiply, 2, 36 ) );
        System.out.println( calculate( divide, 72, 36) );
    }
}
