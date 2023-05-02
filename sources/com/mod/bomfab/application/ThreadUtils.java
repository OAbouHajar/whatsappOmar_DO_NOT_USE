package com.mod.bomfab.application;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicInteger;

public final class ThreadUtils implements Runnable {
    private static AtomicInteger sCounter;
    private static Runnable sStopper;

    public static class ObjAsRunnableCallback implements Handler.Callback {
        public static final ObjAsRunnableCallback INSTANCE = new ObjAsRunnableCallback();

        ObjAsRunnableCallback() {
        }

        @Override
        public boolean handleMessage(Message message) {
            if (!(message.obj instanceof Runnable)) {
                return false;
            }
            ((Runnable) message.obj).run();
            return true;
        }
    }

    ThreadUtils() {
    }

    public static Handler newHandler(Handler handler, Handler.Callback callback) {
        return new Handler(handler.getLooper(), callback);
    }

    private static String newName() {
        AtomicInteger atomicInteger = sCounter;
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger();
            sCounter = atomicInteger;
        }
        try {
            return new StringBuffer().append(new StringBuffer().append(Class.forName("com.mod.bomfab.application.ThreadUtils").getSimpleName()).append('-').toString()).append(atomicInteger.incrementAndGet()).toString();
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError(e2.getMessage());
        }
    }

    public static Handler newThread(Handler.Callback callback) {
        return newThread((String) null, 19, callback);
    }

    public static Handler newThread(String str, int i2, Handler.Callback callback) {
        if (str == null) {
            str = newName();
        }
        HandlerThread handlerThread = new HandlerThread(str, i2);
        handlerThread.start();
        return new Handler(handlerThread.getLooper(), callback);
    }

    public static Handler newThread(String str, Handler.Callback callback) {
        return newThread(str, 19, callback);
    }

    public static void stopThread(Handler handler) {
        stopThread(handler, true);
    }

    public static void stopThread(Handler handler, boolean z2) {
        Runnable runnable = sStopper;
        if (runnable == null) {
            runnable = new ThreadUtils();
            sStopper = runnable;
        }
        if (z2) {
            handler.postAtFrontOfQueue(runnable);
        } else {
            handler.post(runnable);
        }
    }

    @Override
    public void run() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }
}
