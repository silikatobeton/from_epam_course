public class Main {

    public static void main(String[] args) {


        IntCombiner combiner=(x,y)->x+y; //реализовали метод
        combiner.combine(2,5);
        System.out.println(combiner.combine(2,1)); // ввели переменные и получили значение

        combiner= Integer::sum; // то же самое
        combiner=(x,y)->x*y; //
        combiner.zalupa(2,4);
        IntCombiner combiner1=new IntCombiner() { // заменяет
            @Override
            public int combine(int a, int b) {
                return 0;
            }
        };
        record Person(int id, String name){}


    }


}