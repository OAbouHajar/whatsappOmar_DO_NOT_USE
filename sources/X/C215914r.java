package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.14r  reason: invalid class name and case insensitive filesystem */
public class C215914r {
    public final C18260wP A00;
    public final C16440t3 A01;
    public final C14710pd A02;
    public final C16490t9 A03;
    public final C215814q A04;

    public C215914r(C18260wP r1, C16440t3 r2, C14710pd r3, C16490t9 r4, C215814q r5) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final int A00() {
        Integer A002 = AnonymousClass2CG.A00(this.A00.A06());
        if (A002 == null) {
            return 0;
        }
        return A002.intValue();
    }

    public final long A01() {
        long A002 = this.A01.A00();
        return A002 - (A002 % 86400000);
    }

    public synchronized void A02(int i2, int i3) {
        synchronized (this) {
            long A012 = A01();
            int A002 = A00();
            C215814q r5 = this.A04;
            int i4 = i2;
            int i5 = i3;
            AnonymousClass25Q A013 = r5.A01(i5, A002, i4, A012, false);
            A013.A05++;
            r5.A02(A013, i5, A002, i4, A012, false);
        }
    }

    public synchronized void A03(int i2, int i3) {
        synchronized (this) {
            long A012 = A01();
            int A002 = A00();
            C215814q r5 = this.A04;
            int i4 = i2;
            int i5 = i3;
            AnonymousClass25Q A013 = r5.A01(i4, A002, i5, A012, false);
            A013.A08++;
            r5.A02(A013, i4, A002, i5, A012, false);
        }
    }

    public void A04(boolean z2) {
        AnonymousClass25Q A002;
        if (z2 || !this.A02.A0E(C16620tM.A02, 2441)) {
            long A012 = A01();
            C215814q r3 = this.A04;
            ArrayList arrayList = new ArrayList();
            SharedPreferences sharedPreferences = r3.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r3.A01.A00("media_daily_usage_preferences_v1");
                r3.A00 = sharedPreferences;
            }
            Map<String, ?> all = sharedPreferences.getAll();
            SharedPreferences sharedPreferences2 = r3.A00;
            if (sharedPreferences2 == null) {
                sharedPreferences2 = r3.A01.A00("media_daily_usage_preferences_v1");
                r3.A00 = sharedPreferences2;
            }
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            for (Map.Entry next : all.entrySet()) {
                String obj = next.getValue().toString();
                if (!obj.isEmpty() && (A002 = AnonymousClass25Q.A00(obj)) != null && A002.A0C < A012) {
                    arrayList.add(A002);
                    edit.remove((String) next.getKey());
                }
            }
            edit.apply();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass25Q r4 = (AnonymousClass25Q) it.next();
                C16490t9 r32 = this.A03;
                C75943sy r2 = new C75943sy();
                long j2 = r4.A01;
                Long l2 = null;
                r2.A02 = j2 == 0 ? null : Double.valueOf((double) j2);
                long j3 = r4.A00;
                r2.A01 = j3 == 0 ? null : Double.valueOf((double) j3);
                long j4 = r4.A05;
                r2.A09 = j4 == 0 ? null : Long.valueOf(j4);
                long j5 = r4.A04;
                r2.A08 = j5 == 0 ? null : Long.valueOf(j5);
                long j6 = r4.A07;
                r2.A0B = j6 == 0 ? null : Long.valueOf(j6);
                long j7 = r4.A02;
                r2.A06 = j7 == 0 ? null : Long.valueOf(j7);
                long j8 = r4.A03;
                r2.A07 = j8 == 0 ? null : Long.valueOf(j8);
                long j9 = r4.A06;
                r2.A0A = j9 == 0 ? null : Long.valueOf(j9);
                long j10 = r4.A08;
                if (j10 != 0) {
                    l2 = Long.valueOf(j10);
                }
                r2.A0C = l2;
                r2.A0D = Long.valueOf(r4.A0C);
                r2.A04 = Integer.valueOf(r4.A0A);
                r2.A05 = Integer.valueOf(r4.A0B);
                r2.A03 = Integer.valueOf(r4.A09);
                r2.A00 = Boolean.valueOf(r4.A0D);
                r32.A06(r2);
            }
        }
    }
}
