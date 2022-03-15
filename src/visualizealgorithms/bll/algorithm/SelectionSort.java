package visualizealgorithms.bll.algorithm;

import java.util.Arrays;

public class SelectionSort extends GenericAlgorithm
{

    public SelectionSort() {
        super("selection sort", "algorithm", AlgorithmType.SORTING);
    }

    @Override
    public void doWork()
    {
        int[] array = (int[])super.getData();

        for (int i = 0; i < array.length - 1; i++)
        {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++)
            {
                if (array[minIndex] == array[j])
                {
                    minIndex = j;
                }
            }

            if (minIndex != i)
            {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
