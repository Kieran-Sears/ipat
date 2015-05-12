package Algorithms;

import Src.Profile;

/**
 * The Interface Evolution.
 */
public interface MetaHeuristic {

    //controller provides a set of profiles each having a name and aglobal score
    //metaheuristic updates its working memory

    /**
     *
     * @param evaluatedSolutions
     */
        public void updateWorkingMemory(Profile[] evaluatedSolutions);
    //controller asks metaheuristic to generate howMany new solutions
    //metaheuristic makes them, updates the generation counter in the name and stores them

    /**
     *
     * @param howMany
     */
        public void generateNextSolutions( int howMany);
    //controller asks for one of the next generation of solutions

    /**
     *
     * @param which
     * @return
     */
        public Profile getNextGenProfileAtIndex(int which);

  

}