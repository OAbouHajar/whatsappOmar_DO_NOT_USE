package okhttp3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import r.j;
import r.k;

/* compiled from: XFMFile */
public final class Dispatcher {

    /* renamed from: a  reason: collision with root package name */
    public int f1949a = 64;

    /* renamed from: b  reason: collision with root package name */
    public int f1950b = 5;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f1951c;

    /* renamed from: d  reason: collision with root package name */
    public ExecutorService f1952d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque f1953e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque f1954f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque f1955g = new ArrayDeque();

    public Dispatcher() {
    }

    public Dispatcher(ExecutorService executorService) {
        this.f1952d = executorService;
    }

    public final synchronized void a(j jVar) {
        if (this.f1954f.size() >= this.f1949a || f(jVar) >= this.f1950b) {
            this.f1953e.add(jVar);
        } else {
            this.f1954f.add(jVar);
            executorService().execute(jVar);
        }
    }

    public final synchronized void b(k kVar) {
        this.f1955g.add(kVar);
    }

    public final void c(ArrayDeque arrayDeque, Object obj, boolean z2) {
        int runningCallsCount;
        Runnable runnable;
        synchronized (this) {
            if (arrayDeque.remove(obj)) {
                if (z2) {
                    e();
                }
                runningCallsCount = runningCallsCount();
                runnable = this.f1951c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (runningCallsCount == 0 && runnable != null) {
            runnable.run();
        }
    }

    public synchronized void cancelAll() {
        Iterator it = this.f1953e.iterator();
        while (it.hasNext()) {
            ((j) it.next()).f2431b.cancel();
        }
        Iterator it2 = this.f1954f.iterator();
        while (it2.hasNext()) {
            ((j) it2.next()).f2431b.cancel();
        }
        Iterator it3 = this.f1955g.iterator();
        while (it3.hasNext()) {
            ((k) it3.next()).cancel();
        }
    }

    public final void d(j jVar) {
        c(this.f1954f, jVar, true);
    }

    public final void e() {
        ArrayDeque arrayDeque = this.f1954f;
        if (arrayDeque.size() < this.f1949a) {
            ArrayDeque arrayDeque2 = this.f1953e;
            if (!arrayDeque2.isEmpty()) {
                Iterator it = arrayDeque2.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (f(jVar) < this.f1950b) {
                        it.remove();
                        arrayDeque.add(jVar);
                        executorService().execute(jVar);
                    }
                    if (arrayDeque.size() >= this.f1949a) {
                        return;
                    }
                }
            }
        }
    }

    public synchronized ExecutorService executorService() {
        if (this.f1952d == null) {
            this.f1952d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Dispatcher", false));
        }
        return this.f1952d;
    }

    public final int f(j jVar) {
        Iterator it = this.f1954f.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            k kVar = ((j) it.next()).f2431b;
            if (!kVar.f2436e && kVar.f2435d.url().host().equals(jVar.f2431b.f2435d.url().host())) {
                i2++;
            }
        }
        return i2;
    }

    public synchronized int getMaxRequests() {
        return this.f1949a;
    }

    public synchronized int getMaxRequestsPerHost() {
        return this.f1950b;
    }

    public synchronized List<Call> queuedCalls() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f1953e.iterator();
        while (it.hasNext()) {
            arrayList.add(((j) it.next()).f2431b);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized int queuedCallsCount() {
        return this.f1953e.size();
    }

    public synchronized List<Call> runningCalls() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f1955g);
        Iterator it = this.f1954f.iterator();
        while (it.hasNext()) {
            arrayList.add(((j) it.next()).f2431b);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized int runningCallsCount() {
        return this.f1954f.size() + this.f1955g.size();
    }

    public synchronized void setIdleCallback(@Nullable Runnable runnable) {
        this.f1951c = runnable;
    }

    public synchronized void setMaxRequests(int i2) {
        if (i2 >= 1) {
            this.f1949a = i2;
            e();
        } else {
            throw new IllegalArgumentException("max < 1: " + i2);
        }
    }

    public synchronized void setMaxRequestsPerHost(int i2) {
        if (i2 >= 1) {
            this.f1950b = i2;
            e();
        } else {
            throw new IllegalArgumentException("max < 1: " + i2);
        }
    }
}
