package X;

import android.content.ComponentName;

/* renamed from: X.0f2  reason: invalid class name and case insensitive filesystem */
public class C09160f2 implements Comparable {
    public final ComponentName A00;
    public final AnonymousClass04S A01;

    public C09160f2(ComponentName componentName, AnonymousClass04S r2) {
        this.A01 = r2;
        this.A00 = componentName;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A01.A02 - ((C09160f2) obj).A01.A02;
    }
}
