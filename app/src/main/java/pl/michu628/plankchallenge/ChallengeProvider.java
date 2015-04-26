package pl.michu628.plankchallenge;

import java.util.ArrayList;

/**
 * Created by Michał on 2015-04-24.
 */
public interface ChallengeProvider {

    ArrayList<ChallengeDay> getChallenge(String name);
}
