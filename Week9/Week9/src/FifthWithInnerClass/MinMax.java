package FifthWithInnerClass;

public class MinMax {
    static class PairMinMax{
        int min, max;
        public PairMinMax(int max, int min){
            this.max= max;
            this.min= min;
        }
        public static PairMinMax minmax(int values[]){
            int min= values[0];
            int max= values[0];
            for(int i=0; i<values.length; ++i){
                if(values[i]>max) max=values[i];
                if(values[i]<min)min= values[i];
            }
            PairMinMax pair= new PairMinMax(max, min);
            return pair;
        }
    }
}
