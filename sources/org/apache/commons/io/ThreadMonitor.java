package org.apache.commons.io;

class ThreadMonitor implements Runnable {
    private final Thread thread;
    private final long timeout;

    private ThreadMonitor(Thread thread2, long j2) {
        this.thread = thread2;
        this.timeout = j2;
    }

    public static Thread start(long j2) {
        return start(Thread.currentThread(), j2);
    }

    public static Thread start(Thread thread2, long j2) {
        if (j2 <= 0) {
            return null;
        }
        Thread thread3 = new Thread(new ThreadMonitor(thread2, j2), ThreadMonitor.class.getSimpleName());
        thread3.setDaemon(true);
        thread3.start();
        return thread3;
    }

    public static void stop(Thread thread2) {
        if (thread2 != null) {
            thread2.interrupt();
        }
    }

    public void run() {
        try {
            Thread.sleep(this.timeout);
            this.thread.interrupt();
        } catch (InterruptedException e2) {
        }
    }
}
