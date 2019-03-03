package ga.geneticOperators;

import ga.GeneticAlgorithm;
import ga.Individual;

public class RecombinationUniform <I extends Individual> extends Recombination<I> {

    public RecombinationUniform(double probability) {
        super(probability);
    }

    public void run(I ind1, I ind2) {
        for (int i = 0; i < ind1.getNumGenes(); i++) {
            if(GeneticAlgorithm.random.nextInt(2) == 0)
                ind1.swapGenes(ind2, i);
        }
    }
    
    @Override
    public String toString(){
        return "uniform recombination (" + probability + ")";
    }
}