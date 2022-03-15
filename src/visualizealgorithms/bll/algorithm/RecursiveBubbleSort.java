package visualizealgorithms.bll.algorithm;

public class RecursiveBubbleSort extends GenericAlgorithm
{

    public RecursiveBubbleSort() {
        super("Recursive bubble sort", "Sorting bubbles inside bubbles", AlgorithmType.SORTING);
    }

    private void sort(int[] array, int len)
    {
        boolean swapped = false;

        for (int i = 0; i < len - 1; ++i)
        {
            if (array[i] > array[i + 1])
            {
                int tmp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = tmp;

                swapped = true;
            }
        }
        if (swapped)
        {
            sort(array, len - 1);
        }
    }

    @Override
    public void doWork()
    {
        int[] array = (int[])super.getData();

        sort(array, array.length);
    }
}
