package X;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.rendercore.RootHostView;
import com.obwhatsapp.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0el  reason: invalid class name and case insensitive filesystem */
public class C09010el implements AnonymousClass5OO {
    public RootHostView A00 = null;
    public C49852We A01 = null;
    public final Context A02;
    public final SparseArray A03;
    public final AnonymousClass0BL A04 = new AnonymousClass0BL(Looper.getMainLooper(), new C06770Xr(this));
    public final AnonymousClass4Q1 A05;
    public final AnonymousClass22A A06;
    public final Map A07;
    public final Map A08;
    public final Set A09 = new HashSet();
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public final AtomicReference A0B = new AtomicReference();
    public volatile boolean A0C = false;

    public C09010el(Context context, SparseArray sparseArray, AnonymousClass2Wa r7, AnonymousClass22A r8, Map map, Map map2) {
        AnonymousClass0J3 r2 = null;
        this.A06 = r8;
        this.A02 = context;
        this.A03 = sparseArray;
        this.A05 = r7 != null ? new AnonymousClass0J3(r7, C88894bG.A02) : r2;
        this.A08 = map;
        this.A07 = map2;
    }

    public static /* synthetic */ void A03(C09010el r1, int i2) {
        if (i2 != -1) {
            r1.A09(i2);
        }
    }

    public static void A04(C29661az r0, C14990q7 r1, C14950q3 r2, Map map) {
        C14980q6.A00(C29701b3.A00(r0, r1, map), r2, r0.A01);
    }

    public Pair A05(Context context) {
        boolean z2;
        RootHostView rootHostView = new RootHostView(context);
        this.A00 = rootHostView;
        C49852We r1 = this.A01;
        if (r1 != null) {
            z2 = true;
            r1.A05(rootHostView);
        } else {
            z2 = false;
            A08();
        }
        return Pair.create(this.A00, Boolean.valueOf(z2));
    }

    public final C49852We A06(AnonymousClass0J3 r6, Runnable runnable) {
        C99324tq r4 = C99324tq.A00;
        r4.A01("BloksSurface_create_bloks_hosting_component");
        try {
            Map map = this.A08;
            map.putAll(r6.A03());
            C49862Wf A002 = C49852We.A00(this.A02, r6.A01(), this.A06);
            A002.A03(map);
            A002.A04(this.A07);
            A002.A01(0);
            SparseArray clone = this.A03.clone();
            clone.put(R.id.bloks_surface_on_data_rendered_runnable, runnable);
            A002.A02(clone);
            return A002.A00();
        } finally {
            r4.A00();
        }
    }

    public void A07() {
        C49852We r0 = this.A01;
        if (r0 != null) {
            r0.A03();
        }
        this.A01 = null;
        this.A0B.set((Object) null);
    }

    public void A08() {
        if (this.A0A.compareAndSet(false, true)) {
            AnonymousClass4Q1 r2 = this.A05;
            if (r2 == null) {
                A09(0);
                return;
            }
            A09(1);
            A0D((AnonymousClass0J3) r2, 2, 3);
        }
    }

    public final void A09(int i2) {
        C12710kq r2 = (C12710kq) this.A0B.get();
        if (r2 != null) {
            C99324tq r1 = C99324tq.A00;
            r1.A01(AnonymousClass000.A0l(AnonymousClass000.A0r("BloksSurface_notify_on_render_surface_"), i2));
            try {
                r2.AW3(i2);
            } finally {
                r1.A00();
            }
        }
    }

    public final void A0A(C03100Hf r11) {
        C49852We r2 = this.A01;
        if (r2 != null) {
            Map map = this.A08;
            map.putAll(r11.A01);
            HashMap hashMap = new HashMap(map);
            Set set = this.A09;
            HashSet hashSet = new HashSet(set);
            try {
                C14990q7 A022 = r2.A02();
                List<C29661az> list = r11.A00;
                for (C29661az r3 : list) {
                    if (!hashSet.contains(r3)) {
                        Map A042 = AnonymousClass2Wa.A04(r3.A00(), hashMap);
                        C14940q2 r1 = new C14940q2();
                        r1.A03(A022, 0);
                        A04(r3, A022, r1.A01(), A042);
                        hashSet.add(r3);
                    }
                }
                set.addAll(list);
                A09(13);
            } catch (Throwable th) {
                set.addAll(r11.A00);
                A09(13);
                throw th;
            }
        }
    }

    public final void A0B(C03110Hg r3) {
        try {
            C49852We r0 = this.A01;
            if (r0 != null) {
                r0.A04();
            }
            RootHostView rootHostView = this.A00;
            if (rootHostView == null) {
                A09(8);
            } else {
                r3.A00().A05(rootHostView);
            }
        } finally {
            this.A01 = r3.A00();
            A09(r3.A00);
        }
    }

    public void A0C(C12710kq r2) {
        this.A0B.set(r2);
    }

    public final void A0D(AnonymousClass0J3 r4, int i2, int i3) {
        A09(10);
        C03110Hg r2 = new C03110Hg(A06(r4, new C10110gb(this, i3)), i2);
        AnonymousClass0BL r1 = this.A04;
        r1.A00(r1.obtainMessage(1, r2));
    }

    public void AWG(AnonymousClass4Q1 r7) {
        C88894bG A002 = r7.A00();
        int i2 = A002.A00;
        int i3 = 4;
        if (i2 != 4) {
            boolean z2 = false;
            if (i2 == 3) {
                z2 = true;
                i3 = 5;
            }
            A09(i3);
            if (!z2) {
                A09(6);
                int i4 = -1;
                if (A002.A00()) {
                    i4 = 9;
                }
                if (r7 instanceof AnonymousClass0J3) {
                    AnonymousClass0J3 r72 = (AnonymousClass0J3) r7;
                    if (this.A0C) {
                        List A022 = r72.A02();
                        Map A032 = r72.A03();
                        if (!A022.isEmpty()) {
                            A09(12);
                            AnonymousClass0BL r2 = this.A04;
                            r2.A00(r2.obtainMessage(2, new C03100Hf(A022, A032)));
                            return;
                        }
                        return;
                    }
                    A0D(r72, 7, i4);
                    List A023 = r72.A02();
                    Map A033 = r72.A03();
                    if (!A023.isEmpty()) {
                        A09(12);
                        AnonymousClass0BL r22 = this.A04;
                        r22.A00(r22.obtainMessage(2, new C03100Hf(A023, A033)));
                    }
                    this.A0C = true;
                }
            }
        }
    }
}
