package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.2f2  reason: invalid class name */
public abstract class AnonymousClass2f2 implements C53132f4 {
    public final int A00;
    public final Context A01;
    public final Looper A02;
    public final AnonymousClass5TV A03;
    public final C437721l A04;
    public final C437121f A05;
    public final C86834Ui A06;
    public final AnonymousClass3CL A07;
    public final C107775Lj A08;
    public final String A09;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.2n3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: X.2n3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: X.2n3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: X.2n3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: com.google.android.gms.common.api.internal.zzd} */
    /* JADX WARNING: type inference failed for: r5v8, types: [X.01A, com.google.android.gms.common.api.internal.zzd] */
    /* JADX WARNING: type inference failed for: r5v10, types: [X.01A, com.google.android.gms.common.api.internal.zzd] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0087, code lost:
        if (r5 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b1, code lost:
        if (r5 == null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c3, code lost:
        if (r0 != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ed, code lost:
        if (r0 != false) goto L_0x00ef;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2f2(android.app.Activity r8, android.content.Context r9, X.AnonymousClass5TV r10, X.C437721l r11, X.C87944Zh r12) {
        /*
            r7 = this;
            r7.<init>()
            java.lang.String r0 = "Null context is not permitted."
            X.C13710nw.A02(r9, r0)
            java.lang.String r0 = "Api must not be null."
            X.C13710nw.A02(r11, r0)
            java.lang.String r0 = "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."
            X.C13710nw.A02(r12, r0)
            android.content.Context r0 = r9.getApplicationContext()
            r7.A01 = r0
            boolean r0 = X.C14320oy.A04()
            r4 = 0
            if (r0 == 0) goto L_0x0033
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.String r1 = "getAttributionTag"
            r2 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0033 }
            java.lang.reflect.Method r1 = r3.getMethod(r1, r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0033 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0033 }
            java.lang.Object r0 = r1.invoke(r9, r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0033 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0033 }
            r4 = r0
        L_0x0033:
            r7.A09 = r4
            r7.A04 = r11
            r7.A03 = r10
            android.os.Looper r0 = r12.A00
            r7.A02 = r0
            X.4Ui r2 = new X.4Ui
            r2.<init>(r10, r11, r4)
            r7.A06 = r2
            X.3WW r0 = new X.3WW
            r0.<init>(r7)
            r7.A05 = r0
            android.content.Context r0 = r7.A01
            X.3CL r3 = X.AnonymousClass3CL.A01(r0)
            r7.A07 = r3
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A0C
            int r0 = r0.getAndIncrement()
            r7.A00 = r0
            X.5Lj r0 = r12.A01
            r7.A08 = r0
            if (r8 == 0) goto L_0x0126
            boolean r0 = r8 instanceof com.google.android.gms.common.api.GoogleApiActivity
            if (r0 != 0) goto L_0x0126
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 != r0) goto L_0x0126
            boolean r0 = r8 instanceof X.C001000l
            if (r0 == 0) goto L_0x009f
            X.00l r8 = (X.C001000l) r8
            java.lang.String r6 = "SupportLifecycleFragmentImpl"
            java.util.WeakHashMap r4 = com.google.android.gms.common.api.internal.zzd.A03
            java.lang.Object r0 = r4.get(r8)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0089
            java.lang.Object r5 = r0.get()
            com.google.android.gms.common.api.internal.zzd r5 = (com.google.android.gms.common.api.internal.zzd) r5
            if (r5 != 0) goto L_0x010b
        L_0x0089:
            X.02C r0 = r8.AGM()     // Catch:{ ClassCastException -> 0x0096 }
            X.01A r5 = r0.A0B(r6)     // Catch:{ ClassCastException -> 0x0096 }
            com.google.android.gms.common.api.internal.zzd r5 = (com.google.android.gms.common.api.internal.zzd) r5     // Catch:{ ClassCastException -> 0x0096 }
            if (r5 == 0) goto L_0x00ef
            goto L_0x00eb
        L_0x0096:
            r2 = move-exception
            java.lang.String r1 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x009f:
            java.lang.String r4 = "LifecycleFragmentImpl"
            java.util.WeakHashMap r1 = X.C56202n3.A03
            java.lang.Object r0 = r1.get(r8)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r5 = r0.get()
            X.2n3 r5 = (X.C56202n3) r5
            if (r5 != 0) goto L_0x010b
        L_0x00b3:
            android.app.FragmentManager r0 = r8.getFragmentManager()     // Catch:{ ClassCastException -> 0x00e2 }
            android.app.Fragment r5 = r0.findFragmentByTag(r4)     // Catch:{ ClassCastException -> 0x00e2 }
            X.2n3 r5 = (X.C56202n3) r5     // Catch:{ ClassCastException -> 0x00e2 }
            if (r5 == 0) goto L_0x00c5
            boolean r0 = r5.isRemoving()
            if (r0 == 0) goto L_0x00d9
        L_0x00c5:
            X.2n3 r5 = new X.2n3
            r5.<init>()
            android.app.FragmentManager r0 = r8.getFragmentManager()
            android.app.FragmentTransaction r0 = r0.beginTransaction()
            android.app.FragmentTransaction r0 = r0.add(r5, r4)
            r0.commitAllowingStateLoss()
        L_0x00d9:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            r1.put(r8, r0)
            goto L_0x010b
        L_0x00e2:
            r2 = move-exception
            java.lang.String r1 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        L_0x00eb:
            boolean r0 = r5.A0g
            if (r0 == 0) goto L_0x0103
        L_0x00ef:
            com.google.android.gms.common.api.internal.zzd r5 = new com.google.android.gms.common.api.internal.zzd
            r5.<init>()
            X.02C r1 = r8.AGM()
            X.050 r0 = new X.050
            r0.<init>(r1)
            r0.A0C(r5, r6)
            r0.A02()
        L_0x0103:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            r4.put(r8, r0)
        L_0x010b:
            java.lang.Class<X.2sC> r1 = X.C57922sC.class
            java.lang.String r0 = "ConnectionlessLifecycleHelper"
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = r5.AAN(r1, r0)
            X.2sC r1 = (X.C57922sC) r1
            if (r1 != 0) goto L_0x011e
            X.2s9 r0 = X.C57892s9.A00
            X.2sC r1 = new X.2sC
            r1.<init>(r0, r3, r5)
        L_0x011e:
            X.01i r0 = r1.A01
            r0.add(r2)
            r3.A05(r1)
        L_0x0126:
            android.os.Handler r1 = r3.A06
            r0 = 7
            android.os.Message r0 = r1.obtainMessage(r0, r7)
            r1.sendMessage(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2f2.<init>(android.app.Activity, android.content.Context, X.5TV, X.21l, X.4Zh):void");
    }

    @Deprecated
    public AnonymousClass2f2(Context context, AnonymousClass5TV r8, C437721l r9, C107775Lj r10) {
        this((Activity) null, context, r8, r9, new C87944Zh(Looper.getMainLooper(), r10));
    }

    public C84594Ld A00() {
        C84594Ld r3 = new C84594Ld();
        Set emptySet = Collections.emptySet();
        C003001i r1 = r3.A00;
        if (r1 == null) {
            r1 = new C003001i(0);
            r3.A00 = r1;
        }
        r1.addAll(emptySet);
        Context context = this.A01;
        r3.A03 = context.getClass().getName();
        r3.A02 = context.getPackageName();
        return r3;
    }

    public final C14210on A01(C55202j2 r15, int i2) {
        long currentTimeMillis;
        long elapsedRealtime;
        C14370p3 r4 = new C14370p3();
        AnonymousClass3CL r8 = this.A07;
        C107775Lj r3 = this.A08;
        int i3 = r15.A00;
        if (i3 != 0) {
            C86834Ui r7 = this.A06;
            if (r8.A06()) {
                C65933Xd r1 = C89874d5.A00().A00;
                if (r1 != null) {
                    if (r1.A03) {
                        boolean z2 = r1.A04;
                        C15730rl r2 = (C15730rl) r8.A09.get(r7);
                        if (r2 != null) {
                            C15750rn r12 = r2.A04;
                            if (r12 instanceof C15770rp) {
                                C15770rp r13 = (C15770rp) r12;
                                if (r13.A0Q != null && !r13.AIg()) {
                                    C65943Xe A002 = AnonymousClass3EP.A00(r2, r13, i3);
                                    if (A002 != null) {
                                        r2.A00++;
                                        z2 = A002.A03;
                                    }
                                }
                            }
                        }
                        if (!z2) {
                            currentTimeMillis = 0;
                            elapsedRealtime = 0;
                            AnonymousClass3EP r6 = new AnonymousClass3EP(r7, r8, i3, currentTimeMillis, elapsedRealtime);
                            C14210on r5 = r4.A00;
                            r5.A03.A00(new C98874t7(r6, new AnonymousClass58F(r8.A06)));
                            r5.A04();
                        }
                    }
                }
                currentTimeMillis = System.currentTimeMillis();
                elapsedRealtime = SystemClock.elapsedRealtime();
                AnonymousClass3EP r62 = new AnonymousClass3EP(r7, r8, i3, currentTimeMillis, elapsedRealtime);
                C14210on r52 = r4.A00;
                r52.A03.A00(new C98874t7(r62, new AnonymousClass58F(r8.A06)));
                r52.A04();
            }
        }
        C57942sE r53 = new C57942sE(r3, r15, r4, i2);
        Handler handler = r8.A06;
        handler.sendMessage(handler.obtainMessage(4, new C84124Ji(this, r53, r8.A0D.get())));
        return r4.A00;
    }

    public final void A02(C438121p r5, int i2) {
        r5.zak();
        AnonymousClass3CL r0 = this.A07;
        C57952sF r3 = new C57952sF(r5, i2);
        Handler handler = r0.A06;
        handler.sendMessage(handler.obtainMessage(4, new C84124Ji(this, r3, r0.A0D.get())));
    }
}
