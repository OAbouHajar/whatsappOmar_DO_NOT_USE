package X;

import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0SM  reason: invalid class name */
public abstract class AnonymousClass0SM {
    public C13590md A00;
    public List A01;
    public Map A02 = new LinkedHashMap();
    public Executor A03;
    public Executor A04;
    public boolean A05;
    public final C06100Ug A06 = new C06100Ug(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    public final ThreadLocal A07 = new ThreadLocal();
    public final Map A08;
    public final Map A09;
    public final ReentrantReadWriteLock A0A = new ReentrantReadWriteLock();
    public volatile C13620mg A0B;

    public AnonymousClass0SM() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        C18450wi.A0B(synchronizedMap);
        this.A08 = synchronizedMap;
        this.A09 = new LinkedHashMap();
    }

    public C13590md A00() {
        C13590md r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18450wi.A0O("internalOpenHelper");
        throw AnonymousClass000.A0Z();
    }

    public C13500mT A01(String str) {
        C18450wi.A0H(str, 0);
        A08();
        A09();
        return ((C07730cN) A00()).A00().A05().A6T(str);
    }

    public Object A02(Callable callable) {
        A0A();
        try {
            Object call = callable.call();
            A0C();
            return call;
        } finally {
            A0B();
        }
    }

    public List A03(Map map) {
        return AnonymousClass1JA.A0P();
    }

    public Map A04() {
        return C25411Jr.A01();
    }

    public Set A05() {
        return AnonymousClass1F9.A00();
    }

    public Executor A06() {
        Executor executor = this.A03;
        if (executor != null) {
            return executor;
        }
        C18450wi.A0O("internalQueryExecutor");
        throw AnonymousClass000.A0Z();
    }

    public final Lock A07() {
        ReentrantReadWriteLock.ReadLock readLock = this.A0A.readLock();
        C18450wi.A0B(readLock);
        return readLock;
    }

    public void A08() {
        if (!this.A05 && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw AnonymousClass000.A0V("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void A09() {
        if (!((C07700cK) AnonymousClass0AP.A00(this)).A00.inTransaction() && this.A07.get() != null) {
            throw AnonymousClass000.A0V("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void A0A() {
        A08();
        A08();
        C13620mg A002 = AnonymousClass0AP.A00(this);
        this.A06.A00(A002);
        SQLiteDatabase sQLiteDatabase = ((C07700cK) A002).A00;
        if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
            sQLiteDatabase.beginTransactionNonExclusive();
        } else {
            sQLiteDatabase.beginTransaction();
        }
    }

    public void A0B() {
        ((C07700cK) AnonymousClass0AP.A00(this)).A00.endTransaction();
        if (!((C07700cK) AnonymousClass0AP.A00(this)).A00.inTransaction()) {
            C06100Ug r3 = this.A06;
            if (r3.A0A.compareAndSet(false, true)) {
                r3.A03.A06().execute(r3.A06);
            }
        }
    }

    public void A0C() {
        ((C07700cK) ((C07730cN) A00()).A00().A05()).A00.setTransactionSuccessful();
    }

    public boolean A0D() {
        C13620mg r0 = this.A0B;
        return C18450wi.A0R(r0 != null ? Boolean.valueOf(((C07700cK) r0).A00.isOpen()) : null, Boolean.TRUE);
    }
}
