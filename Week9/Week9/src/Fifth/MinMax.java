package Fifth;

public class MinMax implements MinAndMax {
    private int[] numbers;
    public MinMax(){}
    public MinMax(int[] numbers){
        this.numbers= numbers;
    }
    @Override
    public int maxInArray() {
        int k=-1111111111;
        for(int i=0; i<numbers.length; ++i){
            if(numbers[i]>k) k=numbers[i];
        }return k;
    }

    @Override
    public int minInArray() {
        int k=1111111111;
        for(int i=0; i<numbers.length; ++i){
            if(numbers[i]<k) k=numbers[i];
        }return k;
    }

    @Override
    public String toString() {
        return "Max - "+ maxInArray()+", min - "+ minInArray();
    }
}
