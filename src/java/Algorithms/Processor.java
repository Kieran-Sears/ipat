package Algorithms;

import Src.Artifact;
import Src.Profile;



/**
 * The Interface Processor.
 */
public interface Processor {
	
    /**
     *
     * @param profile
     * @param artifact
     * @param outputFolder
     * @return
     */
    public Artifact applyProfileToArtifact(Profile profile, Artifact artifact, String outputFolder); 

}
