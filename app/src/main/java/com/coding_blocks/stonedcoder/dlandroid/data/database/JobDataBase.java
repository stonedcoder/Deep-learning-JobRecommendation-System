package com.coding_blocks.stonedcoder.dlandroid.data.database;

import java.util.LinkedList;

/**
 * Created by stonedcoder on 25/01/18.
 */

public class JobDataBase {
    private static List<LearnableModel> savedModels = new LinkedList<>();

    public static void writeJobs(List<LearnableModel> models) {
        savedModels.addAll(models);
    }

    public static List<LearnableModel> readJobs() {
        return savedModels;
    }
}
