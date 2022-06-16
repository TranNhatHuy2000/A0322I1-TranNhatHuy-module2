package ss04_Class_Object.baitap.StopWatch;


public class SelectionSortTime {
    public static void main(String[] args) {
        int[] array =new int[100000];
        for (int i=0;i<array.length;i++){
            array[i] = (int)(Math.random()*100000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        array = selectionSort(array);
        stopWatch.stop();
        System.out.println("Time: "+stopWatch.getElapsedTime()+" milisecond");
        for (int x:array
             ) {
            System.out.print(x+" ");

        }

    }

    public static int[] selectionSort(int[] array){
        for (int i = 0;i < array.length;i++){
            for (int j = i+1;j< array.length;j++){
                if (array[j]<array[i]){
                    int tempt = array[i];
                    array[i] = array[j];
                    array[j]= tempt;
                }
            }
        }
        return array;
    }
}
