package X;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.0Vz  reason: invalid class name and case insensitive filesystem */
public final class C06450Vz {
    public static C06450Vz A05;
    public static final Object A06 = new Object();
    public final Context A00;
    public final Handler A01;
    public final ArrayList A02 = AnonymousClass000.A0u();
    public final HashMap A03 = AnonymousClass000.A0x();
    public final HashMap A04 = AnonymousClass000.A0x();

    public C06450Vz(Context context) {
        this.A00 = context;
        this.A01 = new AnonymousClass0BJ(context.getMainLooper(), this);
    }

    public static C06450Vz A00(Context context) {
        C06450Vz r1;
        synchronized (A06) {
            r1 = A05;
            if (r1 == null) {
                r1 = new C06450Vz(context.getApplicationContext());
                A05 = r1;
            }
        }
        return r1;
    }
}
