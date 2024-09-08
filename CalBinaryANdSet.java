public class CalBinaryANdSet {
        public static void main(String[] args) {
            int n = 15;int count=0;
            while (n>0) {
                count+=15&1;
                n>>=1;
            }
            System.out.println("Binary and set zero is "+count);
        }
}
