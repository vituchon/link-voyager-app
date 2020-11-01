/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vituchon.util.google;

import com.google.appengine.api.ThreadManager;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Administrador
 */
public class ExecutorUtils {

    private static final RejectedExecutionHandler defaultHandler
            = new ThreadPoolExecutor.AbortPolicy();

    public static ThreadPoolExecutor newFixedThreadPool(int corePoolSize) {
        return new ThreadPoolExecutor(corePoolSize, corePoolSize, 50L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(),
                ThreadManager.currentRequestThreadFactory(), defaultHandler);
    }
}
