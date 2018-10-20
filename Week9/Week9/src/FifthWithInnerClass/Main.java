package FifthWithInnerClass;

public class Main {
    public static void main(String[] args){
        int[] values={0,8,-3,20};
        MinMax.PairMinMax pairMinMax= MinMax.PairMinMax.minmax(values);
        System.out.println(pairMinMax.max+ " "+ pairMinMax.min);
    }
}
