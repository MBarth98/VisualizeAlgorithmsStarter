package visualizealgorithms.bll.algorithm;

import java.util.*;

public class QuickSort extends GenericAlgorithm
{
    public QuickSort()
    {
        super("quick sort", "", AlgorithmType.SORTING);
    }

    void sort(int[] array, int start, int end)
    {
        if (start < end)
        {
            int partition = divideAndConquer(array, start, end);

            sort(array, start, partition - 1);
            sort(array, partition, end);
        }
    }

    int divideAndConquer(int[] array, int start, int end)
    {
        int randomIndex = start + (int) (Math.random() * (end - start + 1));

        int tmp = array[end];
        array[end] = array[randomIndex];
        array[randomIndex] = tmp;

        return terminal(array, start, end);
    }


    int terminal(int[] array, int start, int end)
    {
        int middle = (start + end) >>> 1;

        while (start <= end)
        {
            while (array[start] < array[middle])
            {
                start++;
            }
            while (array[middle] < array[end])
            {
                end--;
            }

            if (start <= end)
            {
                int tmp = array[end];
                array[end] = array[start];
                array[start] = tmp;

                start++;
                end--;
            }
        }

        return start;
    }


    @Override
    public void doWork()
    {
        int[] array = (int[])super.getData();

        sort(array, 0, array.length - 1);
    }
}
