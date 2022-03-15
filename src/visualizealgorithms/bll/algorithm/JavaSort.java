package visualizealgorithms.bll.algorithm;

import java.util.Arrays;

public class JavaSort extends GenericAlgorithm
{

    public JavaSort()
    {
        super("java sort", "", AlgorithmType.SORTING);
    }

    @Override
    public void doWork()
    {
        int[] array = (int[])super.getData();
        Arrays.sort(array);
    }
}
