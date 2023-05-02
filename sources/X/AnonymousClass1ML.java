package X;

import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1ML  reason: invalid class name */
public final class AnonymousClass1ML {
    public final C16040sK A00;
    public final C16440t3 A01;
    public final AnonymousClass01D A02;
    public final AnonymousClass01D A03;
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final AtomicLong A05 = new AtomicLong(0);
    public final AnonymousClass01J A06;
    public final AnonymousClass01J A07;
    public final AnonymousClass01J A08;

    public AnonymousClass1ML(C16040sK r4, C16440t3 r5, AnonymousClass01D r6, AnonymousClass01D r7, AnonymousClass01J r8, AnonymousClass01J r9, AnonymousClass01J r10) {
        C18450wi.A0H(r5, 1);
        C18450wi.A0H(r4, 2);
        C18450wi.A0H(r8, 3);
        C18450wi.A0H(r6, 4);
        C18450wi.A0H(r9, 5);
        C18450wi.A0H(r7, 6);
        C18450wi.A0H(r10, 7);
        this.A01 = r5;
        this.A00 = r4;
        this.A07 = r8;
        this.A02 = r6;
        this.A08 = r9;
        this.A03 = r7;
        this.A06 = r10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r3.isDestroyed() == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C14550pN A00(java.lang.ref.WeakReference r3) {
        /*
            java.lang.Object r3 = r3.get()
            X.0pN r3 = (X.C14550pN) r3
            r2 = 0
            if (r3 == 0) goto L_0x001e
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            if (r1 < r0) goto L_0x0016
            boolean r0 = r3.isDestroyed()
            r1 = r2
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r1 = r3
        L_0x0017:
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L_0x001e
            return r1
        L_0x001e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ML.A00(java.lang.ref.WeakReference):X.0pN");
    }

    public static /* synthetic */ void A01(AnonymousClass1ML r17, String str, WeakReference weakReference) {
        String str2;
        AnonymousClass1ML r13 = r17;
        AtomicBoolean atomicBoolean = r13.A04;
        if (atomicBoolean.get() || r13.A01.A00() - r13.A05.get() <= 500) {
            str2 = "Avatar Editor is already launching.";
        } else {
            WeakReference weakReference2 = weakReference;
            C14550pN A002 = A00(weakReference2);
            if (A002 == null) {
                str2 = "Unable to obtain Activity reference.";
            } else {
                atomicBoolean.set(true);
                C211613a r14 = (C211613a) r13.A07.get();
                C27121Qn r3 = (C27121Qn) r13.A08.get();
                C26141Mm r6 = (C26141Mm) r13.A06.get();
                A002.Afr(0, R.string.str1bf0);
                C214013y r15 = (C214013y) r13.A03.get();
                C19500yX r2 = r15.A00;
                r2.ALE(354170068);
                r15.A01("launch_editor");
                C78063x2 r0 = C78063x2.A00;
                String str3 = str;
                C18450wi.A0H(str3, 1);
                r2.AKi(354170068, r0.A00, str3);
                C82934Es r22 = new C82934Es();
                String str4 = r14.A02;
                if (str4 == null) {
                    str4 = UUID.randomUUID().toString();
                    r14.A02 = str4;
                }
                C18450wi.A0F(str4);
                C18450wi.A0H(str4, 1);
                Map map = r22.A00;
                map.put("logging_session_id", str4);
                map.put("logging_surface", "wa_settings");
                map.put("logging_mechanism", "wa_settings_item");
                StringBuilder sb = new StringBuilder("{\"server_params\":{");
                int i2 = 0;
                for (Map.Entry entry : map.entrySet()) {
                    sb.append("\"");
                    sb.append((String) entry.getKey());
                    sb.append("\":\"");
                    sb.append((String) entry.getValue());
                    sb.append("\"");
                    if (i2 < map.size() - 1) {
                        sb.append(",");
                    }
                    i2++;
                }
                sb.append("}}");
                String obj = sb.toString();
                C18450wi.A0B(obj);
                r15.A01("editor_params_ready");
                boolean A012 = r6.A01();
                r14.A04((Integer) null, (String) null, 1, A012);
                if (((C17330uu) r3.A04.get()).A00() == null) {
                    r15.A01("create_user");
                    r3.A01.Aco(new RunnableRunnableShape9S0200000_I0_7(r3, 34, new AnonymousClass3GO(r13, r14, r15, obj, weakReference2, A012)));
                    return;
                }
                r13.A02(r14, r15, obj, weakReference2, A012);
                return;
            }
        }
        Log.e(str2);
    }

    public final void A02(C211613a r17, C214013y r18, String str, WeakReference weakReference, boolean z2) {
        WeakReference weakReference2 = weakReference;
        C14550pN A002 = A00(weakReference2);
        if (A002 == null) {
            Log.e("Unable to obtain Activity reference.");
            this.A04.set(false);
            return;
        }
        WeakReference weakReference3 = new WeakReference(A002);
        boolean A09 = C434920f.A09(A002);
        C16040sK r0 = this.A00;
        r0.A0B();
        AnonymousClass1ZT r02 = r0.A05;
        C18450wi.A0F(r02);
        String rawString = r02.getRawString();
        C18450wi.A0B(rawString);
        ((AnonymousClass1MS) this.A02.get()).A00(new AnonymousClass3HQ(this, r17, r18, weakReference2, z2), C817449o.A00, "com.bloks.www.avatar.editor.cds.launcher.async", rawString, str, weakReference3, A09);
    }

    public final void A03(WeakReference weakReference) {
        A01(this, "sticker_info_dialog", weakReference);
    }
}
