package com.dicoding.moviecatalogue.core.utils

import java.util.concurrent.Executor

class TestExecutors : Executor {
    override fun execute(runnable: Runnable) {
        runnable.run()
    }
}