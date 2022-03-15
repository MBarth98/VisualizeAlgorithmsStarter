package visualizealgorithms;

//Project imports
import visualizealgorithms.bll.algorithm.*;

//Java imports
import java.util.ArrayList;

/**
 * Convenience class that adds algorithms and handles inputs
 */
public class AlgorithmLoader {

    private String inputs = "";
    private final ArrayList<IAlgorithm> algorithms = new ArrayList<>();

    public AlgorithmLoader() {
        //Modify default inputs
        inputs = "1000;2500;5000;10000;25000;50000;100000;250000;500000;1000000";


        algorithms.add(new BubbleSort());
        algorithms.add(new InsertionSort());
        algorithms.add(new SelectionSort());
        algorithms.add(new JavaSort());

        algorithms.add(new QuickSort());

        // stack overflow exception
        // algorithms.add(new RecursiveBubbleSort());
    }

    public String getInputs() {
        return inputs;
    }

    public ArrayList<IAlgorithm> getAlgorithms() {
        return algorithms;
    }
}
