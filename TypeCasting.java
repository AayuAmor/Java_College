public class TypeCasting{
    
    public static void main(String[] args) {
        long longNum = 123;
        double newNum = longNum;
        newNum = 2.34;
            

        System.out.println(longNum);
        System.out.println(newNum);
        
        double newLong = (long) newNum;
        newLong =2390909;
        System.out.println(newLong);


    }
}