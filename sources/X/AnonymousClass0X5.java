package X;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0X5  reason: invalid class name */
public final class AnonymousClass0X5 {
    public AnonymousClass0WJ A00 = null;
    public C13410lz A01 = null;
    public AnonymousClass5OO A02 = null;
    public final C05390Qt A03;
    public final C09010el A04;
    public final C05280Qa A05;
    public final AnonymousClass01m A06;
    public final C12850l4 A07;
    public final AnonymousClass4DF A08;
    public final AtomicLong A09 = new AtomicLong();
    public final AtomicReference A0A = new AtomicReference(C88894bG.A02);
    public final AtomicReference A0B = new AtomicReference();

    public AnonymousClass0X5(C09010el r4, C05280Qa r5, AnonymousClass4DF r6) {
        AnonymousClass01m A032 = C90154da.A00().A03();
        this.A06 = A032;
        C12850l4 AGR = A032.AGR();
        this.A07 = AGR;
        this.A04 = r4;
        this.A05 = r5;
        this.A08 = r6;
        this.A03 = new C05390Qt(AGR.now());
    }

    public static AnonymousClass0X5 A00(Context context, SparseArray sparseArray, C05280Qa r10, AnonymousClass2Wa r11, AnonymousClass22A r12, AnonymousClass4DF r13) {
        SparseArray clone = r10.A03.clone();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            clone.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
        }
        Map map = r10.A09;
        int i3 = r10.A00;
        HashMap A0x = AnonymousClass000.A0x();
        A0x.putAll(map);
        String valueOf = String.valueOf(i3);
        A0x.put("ttrc_instance_id", valueOf);
        Map map2 = r10.A08;
        HashMap A0x2 = AnonymousClass000.A0x();
        A0x2.putAll(map2);
        A0x2.put("ttrc_instance_id", valueOf);
        return new AnonymousClass0X5(new C09010el(context, clone, r11, r12, A0x, A0x2), r10, r13);
    }

    public static AnonymousClass0WJ A01(Context context, AnonymousClass4DF r11, String str, Map map) {
        String str2 = str;
        C83354Gi r3 = C90154da.A00().A05;
        if (r3.A01 == null) {
            synchronized (r3) {
                if (r3.A01 == null) {
                    AnonymousClass4HE r2 = r3.A00;
                    r3.A01 = new C04590Nd(r2.A01.A06.A6u(r2.A00));
                }
            }
        }
        C18450wi.A0H(context, 0);
        C18450wi.A0H(map, 2);
        AnonymousClass0WJ r32 = new AnonymousClass0WJ((AnonymousClass5OO) null);
        C12150jv r22 = ((C04590Nd) r3.A01).A00;
        C04580Nc r1 = new C04580Nc(r32);
        C95494mj r23 = (C95494mj) r22;
        String str3 = (String) map.get("params");
        C20150za r4 = (C20150za) r23.A01.get();
        String str4 = r11.A00;
        if (str4 != null) {
            str2 = str4;
        }
        r4.A01((C35001lD) null, new AnonymousClass53Q(context, r1, r23), (Boolean) null, str2, str3, (String) null);
        return r32;
    }

    public static String A02(int i2, String str) {
        boolean A1R = AnonymousClass000.A1R(i2, 2);
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(A1R ? "cc_" : "nc_");
        return AnonymousClass000.A0h(str, A0o);
    }

    /* JADX INFO: finally extract failed */
    public Pair A04(Context context) {
        try {
            C09010el r1 = this.A04;
            Pair A052 = r1.A05(context);
            AnonymousClass0WJ r0 = this.A00;
            if (r0 != null) {
                r0.A03(r1);
                AnonymousClass5OO A053 = A05(r1);
                this.A02 = A053;
                this.A00.A02(A053);
            }
            return A052;
        } catch (Throwable th) {
            AnonymousClass0WJ r12 = this.A00;
            if (r12 != null) {
                C09010el r02 = this.A04;
                r12.A03(r02);
                AnonymousClass5OO A054 = A05(r02);
                this.A02 = A054;
                this.A00.A02(A054);
            }
            throw th;
        }
    }

    public final AnonymousClass5OO A05(AnonymousClass5OO r2) {
        return new C09000ek(this, r2);
    }

    public Throwable A06() {
        AnonymousClass4Q1 r1 = (AnonymousClass4Q1) this.A0B.get();
        if (r1 instanceof AnonymousClass0J2) {
            return ((AnonymousClass0J2) r1).A01();
        }
        return null;
    }

    public void A07() {
        AnonymousClass0WJ r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
        this.A00 = null;
        this.A04.A07();
        this.A0B.set((Object) null);
    }

    public void A08() {
        try {
            AnonymousClass5OO r1 = this.A02;
            if (r1 != null) {
                AnonymousClass0WJ r0 = this.A00;
                if (r0 != null) {
                    r0.A03(r1);
                }
                this.A02 = null;
            }
        } finally {
            C13410lz r02 = this.A01;
            if (r02 != null) {
                r02.AK6("BloksSurfaceController_onDestroyView");
            }
        }
    }

    public final void A09(Context context) {
        C05280Qa r0 = this.A05;
        String str = r0.A04;
        if (str != null) {
            this.A00 = A01(context, this.A08, str, r0.A05);
        }
    }

    public void A0A(Context context, C12710kq r13) {
        if (this.A01 == null) {
            C05390Qt r2 = this.A03;
            AnonymousClass01m r5 = this.A06;
            C05280Qa r4 = this.A05;
            C13410lz AgC = r5.AgC(r4.A04, r4.A01, r4.A00, r4.A02);
            Iterator A0y = AnonymousClass000.A0y(r4.A07);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                String str = (String) A0z.getKey();
                Object value = A0z.getValue();
                if (value instanceof Number) {
                    AgC.AKk(str, ((Number) value).longValue());
                } else if (value instanceof Boolean) {
                    AgC.AKm(str, AnonymousClass000.A1X(value));
                } else {
                    AgC.AKl(str, value.toString());
                }
            }
            Iterator it = r4.A06.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0W("onStart");
            } else {
                this.A01 = AgC;
                AgC.AL8("surface_core_created_at", r2.A00);
            }
        }
        C13410lz r42 = this.A01;
        if (this.A05.A04 != null) {
            r42.A4i("bloks_query", TimeUnit.SECONDS, 86400);
        } else {
            r42.A4j("initial_content_step");
        }
        if (this.A00 == null) {
            A09(context);
        }
        this.A04.A0C(new C08660e0(this, r13, r42));
    }

    public final void A0B(C13410lz r11, C88894bG r12) {
        long now = this.A07.now();
        C13410lz r3 = r11;
        if (r12.A00 != 2) {
            r11.ALi("bloks_query", true);
        } else {
            r3.A5o("bloks_query", 0, now, r12.A01());
        }
    }
}
