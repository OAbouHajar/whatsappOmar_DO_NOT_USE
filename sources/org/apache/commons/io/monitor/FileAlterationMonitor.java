package org.apache.commons.io.monitor;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;

public final class FileAlterationMonitor implements Runnable {
    private final long interval;
    private final List<FileAlterationObserver> observers;
    private volatile boolean running;
    private Thread thread;
    private ThreadFactory threadFactory;

    public FileAlterationMonitor() {
        this(10000);
    }

    public FileAlterationMonitor(long j2) {
        this.observers = new CopyOnWriteArrayList();
        this.thread = null;
        this.running = false;
        this.interval = j2;
    }

    public FileAlterationMonitor(long j2, FileAlterationObserver... fileAlterationObserverArr) {
        this(j2);
        if (fileAlterationObserverArr != null) {
            for (FileAlterationObserver addObserver : fileAlterationObserverArr) {
                addObserver(addObserver);
            }
        }
    }

    public void addObserver(FileAlterationObserver fileAlterationObserver) {
        if (fileAlterationObserver != null) {
            this.observers.add(fileAlterationObserver);
        }
    }

    public long getInterval() {
        return this.interval;
    }

    public Iterable<FileAlterationObserver> getObservers() {
        return this.observers;
    }

    public void removeObserver(FileAlterationObserver fileAlterationObserver) {
        if (fileAlterationObserver != null) {
            do {
            } while (this.observers.remove(fileAlterationObserver));
        }
    }

    public void run() {
        while (this.running) {
            for (FileAlterationObserver checkAndNotify : this.observers) {
                checkAndNotify.checkAndNotify();
            }
            if (this.running) {
                try {
                    Thread.sleep(this.interval);
                } catch (InterruptedException e2) {
                }
            } else {
                return;
            }
        }
    }

    public synchronized void setThreadFactory(ThreadFactory threadFactory2) {
        this.threadFactory = threadFactory2;
    }

    public synchronized void start() throws Exception {
        if (!this.running) {
            for (FileAlterationObserver initialize : this.observers) {
                initialize.initialize();
            }
            this.running = true;
            ThreadFactory threadFactory2 = this.threadFactory;
            if (threadFactory2 != null) {
                this.thread = threadFactory2.newThread(this);
            } else {
                this.thread = new Thread(this);
            }
            this.thread.start();
        } else {
            throw new IllegalStateException("Monitor is already running");
        }
    }

    public synchronized void stop() throws Exception {
        stop(this.interval);
    }

    public synchronized void stop(long j2) throws Exception {
        if (this.running) {
            this.running = false;
            try {
                this.thread.join(j2);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
            }
            for (FileAlterationObserver destroy : this.observers) {
                destroy.destroy();
            }
        } else {
            throw new IllegalStateException("Monitor is not running");
        }
    }
}
