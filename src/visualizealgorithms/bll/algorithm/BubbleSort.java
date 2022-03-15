package visualizealgorithms.bll.algorithm;

import java.util.Arrays;

public class BubbleSort extends GenericAlgorithm
{

    public BubbleSort() {
        super("bubble sort", "algorithm for sorting bubbles", AlgorithmType.SORTING);
    }

    @Override
    public void doWork()
    {
        int[] array = (int[])super.getData();

        for (int i = 1, size = array.length; i < size; ++i)
        {
            boolean swapped = false;

            for (int j = 0; j < size - i; ++j)
            {
                if (array[j] > array[j + 1])
                {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;

                    swapped = true;
                }
            }
            if (!swapped)
            {
                break;
            }
        }
    }
}
