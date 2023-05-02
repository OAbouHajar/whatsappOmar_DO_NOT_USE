package org.apache.commons.io;

import java.io.File;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FileCleaningTracker {
    final List<String> deleteFailures = Collections.synchronizedList(new ArrayList());
    volatile boolean exitWhenFinished = false;

    /* renamed from: q  reason: collision with root package name */
    ReferenceQueue<Object> f136q = new ReferenceQueue<>();
    Thread reaper;
    final Collection<Tracker> trackers = Collections.synchronizedSet(new HashSet());

    private final class Reaper extends Thread {
        Reaper() {
            super("File Reaper");
            setPriority(10);
            setDaemon(true);
        }

        public void run() {
            while (true) {
                if (!FileCleaningTracker.this.exitWhenFinished || FileCleaningTracker.this.trackers.size() > 0) {
                    try {
                        Tracker tracker = (Tracker) FileCleaningTracker.this.f136q.remove();
                        FileCleaningTracker.this.trackers.remove(tracker);
                        if (!tracker.delete()) {
                            FileCleaningTracker.this.deleteFailures.add(tracker.getPath());
                        }
                        tracker.clear();
                    } catch (InterruptedException e2) {
                    }
                } else {
                    return;
                }
            }
        }
    }

    private static final class Tracker extends PhantomReference<Object> {
        private final FileDeleteStrategy deleteStrategy;
        private final String path;

        Tracker(String str, FileDeleteStrategy fileDeleteStrategy, Object obj, ReferenceQueue<? super Object> referenceQueue) {
            super(obj, referenceQueue);
            this.path = str;
            this.deleteStrategy = fileDeleteStrategy == null ? FileDeleteStrategy.NORMAL : fileDeleteStrategy;
        }

        public boolean delete() {
            return this.deleteStrategy.deleteQuietly(new File(this.path));
        }

        public String getPath() {
            return this.path;
        }
    }

    private synchronized void addTracker(String str, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        if (!this.exitWhenFinished) {
            if (this.reaper == null) {
                Reaper reaper2 = new Reaper();
                this.reaper = reaper2;
                reaper2.start();
            }
            this.trackers.add(new Tracker(str, fileDeleteStrategy, obj, this.f136q));
        } else {
            throw new IllegalStateException("No new trackers can be added once exitWhenFinished() is called");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0013, code lost:
        r1 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void exitWhenFinished() {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            r2.exitWhenFinished = r0     // Catch:{ all -> 0x0017 }
            java.lang.Thread r0 = r2.reaper     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0015
            monitor-enter(r0)     // Catch:{ all -> 0x0017 }
            java.lang.Thread r1 = r2.reaper     // Catch:{ all -> 0x0010 }
            r1.interrupt()     // Catch:{ all -> 0x0010 }
            monitor-exit(r0)     // Catch:{ all -> 0x0010 }
            goto L_0x0015
        L_0x0010:
            r1 = move-exception
        L_0x0011:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0013:
            r1 = move-exception
            goto L_0x0011
        L_0x0015:
            monitor-exit(r2)
            return
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x001b
        L_0x001a:
            throw r0
        L_0x001b:
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.FileCleaningTracker.exitWhenFinished():void");
    }

    public List<String> getDeleteFailures() {
        return this.deleteFailures;
    }

    public int getTrackCount() {
        return this.trackers.size();
    }

    public void track(File file, Object obj) {
        track(file, obj, (FileDeleteStrategy) null);
    }

    public void track(File file, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        if (file != null) {
            addTracker(file.getPath(), obj, fileDeleteStrategy);
            return;
        }
        throw new NullPointerException("The file must not be null");
    }

    public void track(String str, Object obj) {
        track(str, obj, (FileDeleteStrategy) null);
    }

    public void track(String str, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        if (str != null) {
            addTracker(str, obj, fileDeleteStrategy);
            return;
        }
        throw new NullPointerException("The path must not be null");
    }
}
