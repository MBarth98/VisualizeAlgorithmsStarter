package visualizealgorithms.bll.algorithm;

public class InsertionSort extends GenericAlgorithm
{

    public InsertionSort() {
        super("insertion sort", "", AlgorithmType.SORTING);
    }

    @Override
    public void doWork()
    {
        int[] array = (int[])super.getData();

        for (int i = 1; i < array.length; i++)
        {
            int current = array[i];
            int j;

            // backtrack
            for (j = i - 1; j >= 0 && current < array[j]; j--)
            {
                array[j + 1] = array[j];
            }

            if (j != i - 1) {
                array[j + 1] = current;
            }
        }
    }
}
