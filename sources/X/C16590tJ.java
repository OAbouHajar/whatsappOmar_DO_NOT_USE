package X;

import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.0tJ  reason: invalid class name and case insensitive filesystem */
public abstract class C16590tJ {
    public final AnonymousClass1UY A00;

    public C16590tJ() {
        this(new AnonymousClass01T(Collections.emptySet(), (AnonymousClass01J) null));
    }

    public C16590tJ(AnonymousClass01D r2) {
        this.A00 = new AnonymousClass1UY(r2);
    }

    public static Iterator A00(C16590tJ r0) {
        return r0.A01().iterator();
    }

    public Iterable A01() {
        if (this instanceof AnonymousClass1UZ) {
            AnonymousClass00B.A00();
        } else if (this instanceof C16580tI) {
            AnonymousClass00B.A01();
        }
        AnonymousClass1UY r1 = this.A00;
        synchronized (r1) {
        }
        return r1;
    }

    public void A02(Object obj) {
        AnonymousClass00B.A06(obj);
        if (this instanceof AnonymousClass1UZ) {
            AnonymousClass00B.A00();
        } else if (this instanceof C16580tI) {
            AnonymousClass00B.A01();
        }
        AnonymousClass1UY r3 = this.A00;
        synchronized (r3) {
            AnonymousClass00B.A06(obj);
            ConcurrentLinkedQueue concurrentLinkedQueue = r3.A01;
            if (concurrentLinkedQueue.contains(obj)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Observer ");
                sb.append(obj);
                sb.append(" is already registered.");
                String obj2 = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getClass().getSimpleName());
                sb2.append(":");
                sb2.append(obj2);
                Log.e(sb2.toString());
            } else {
                AnonymousClass00B.A06(obj);
                concurrentLinkedQueue.add(obj);
            }
        }
    }

    public void A03(Object obj) {
        AnonymousClass00B.A06(obj);
        if (this instanceof AnonymousClass1UZ) {
            AnonymousClass00B.A00();
        } else if (this instanceof C16580tI) {
            AnonymousClass00B.A01();
        }
        AnonymousClass1UY r2 = this.A00;
        synchronized (r2) {
            AnonymousClass00B.A06(obj);
            if (!r2.A01.remove(obj)) {
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getSimpleName());
                sb.append(":Observer ");
                sb.append(obj);
                sb.append(" was not registered.");
                Log.e(sb.toString());
            }
        }
    }
}
