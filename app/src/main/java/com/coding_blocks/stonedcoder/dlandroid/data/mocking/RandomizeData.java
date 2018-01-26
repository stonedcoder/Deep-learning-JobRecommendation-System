package com.coding_blocks.stonedcoder.dlandroid.data.mocking;

import com.coding_blocks.stonedcoder.dlandroid.data.model.Job;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created by stonedcoder on 25/01/18.
 */

public class RandomizeData {

    public static Job randomizeJob() {
        return new Job(randomNumber(0,5),randomNumber(5,20),0);
    }

    public static List<LearnableModel> randomizeJobs(int number) {
        List<LearnableModel> jobs = new LinkedList<>();
        for (int i=0;i<number;i++) {
            jobs.add(randomizeJob());
        }
        return jobs;
    }

    private static int randomNumber(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
}
