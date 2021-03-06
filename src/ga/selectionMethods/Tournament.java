package ga.selectionMethods;

import ga.GeneticAlgorithm;
import ga.Individual;
import ga.Population;
import ga.Problem;

public class Tournament <I extends Individual, P extends Problem<I>> extends SelectionMethod<I, P> {

    private int size;

    public Tournament(int popSize) {
        this(popSize, 2);
    }

    public Tournament(int popSize, int size) {
        super(popSize);
        this.size = size;
    }

    public Population<I, P> run(Population<I, P> original) {
        Population<I, P> result = new Population<I, P>(original.getSize());        

        for (int i = 0; i < popSize; i++) {
            result.addIndividual(tournament(original));
        }
        return result;
    }

    private I tournament(Population<I, P> population) {
        I best = randomlyChooseIndividual(population);

        for (int i = 1; i < size; i++) {
            I aux = randomlyChooseIndividual(population);
            best = (aux.getFitness() > best.getFitness()) ? aux : best;
        }

        return (I) best.clone();
    }

    private I randomlyChooseIndividual(Population<I, P> population){
        return population.getIndividual(GeneticAlgorithm.random.nextInt(popSize));
    }

    @Override
    public String toString(){
        return "Tournament(" + size + ")";
    }    
}