package com.blogspot.pavankreddy.jokeslib;

import java.util.Random;

public class RandomJokes
{
    private String[] jokes;
    private Random random;

    public RandomJokes() {
        jokes = new String[5];
        jokes[0] = "Can a kangaroo jump higher than a house? \nOf course, a house does not jump at all\n";
        jokes[1] = "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.\n";
        jokes[2] = "A computer once beat me at chess, but it was no match for me at kick boxing.";
        jokes[3] = "As long as there are tests, there will be prayer in schools.";
        jokes[4] = "Born free, taxed to death.";
        random = new Random();
    }

    public String[] getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}
