package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.5iZ  reason: invalid class name and case insensitive filesystem */
public class C112485iZ extends AnonymousClass2HA {
    public int A00 = 0;
    public AnonymousClass61W A01 = null;
    public C112715ix A02 = null;
    public String A03 = null;
    public final AnonymousClass4XO A04;
    public final String A05;

    public C112485iZ(Context context, C14870pt r4, C18340wX r5, AnonymousClass4XO r6, AnonymousClass61W r7, C112715ix r8, String str, String str2, int i2) {
        super(context, r5, r4);
        this.A05 = str;
        this.A04 = r6;
        this.A01 = r7;
        this.A00 = i2;
        this.A03 = str2;
        this.A02 = r8;
    }

    public C112485iZ(Context context, C14870pt r4, C18340wX r5, AnonymousClass4XO r6, AnonymousClass61W r7, String str, int i2) {
        super(context, r5, r4);
        this.A05 = str;
        this.A04 = r6;
        this.A01 = r7;
        this.A00 = i2;
    }

    public C112485iZ(Context context, C14870pt r4, C18340wX r5, AnonymousClass4XO r6, String str) {
        super(context, r5, r4);
        this.A05 = str;
        this.A04 = r6;
    }

    public static C53872gR A01(C28371Vv r5) {
        return new C53872gR(new C35301lh(new C53852gP(), String.class, r5.A0N("alias_value", (String) null), "upiAlias"), r5.A0M("alias_type"), r5.A0M("alias_id"), r5.A0M("alias_status").toLowerCase(Locale.US));
    }

    public static String A02(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(" seqNumPrefix: ");
        sb.append(str2);
        sb.append(" bindID: ");
        return AnonymousClass5x3.A01(str3);
    }

    public void A03(AnonymousClass2HJ r5) {
        String str;
        StringBuilder A0r = AnonymousClass000.A0r("PAY: onRequestError action: ");
        String str2 = this.A05;
        A0r.append(str2);
        Log.i(AnonymousClass000.A0e(r5, " error: ", A0r));
        AnonymousClass61W r2 = this.A01;
        if (r2 != null) {
            r2.A06(r5, this.A00, 1);
        }
        AnonymousClass4XO r1 = this.A04;
        if (r1 != null) {
            r1.A06(str2, r5.A00);
        }
        C112715ix r12 = this.A02;
        if (r12 != null && (str = this.A03) != null) {
            r12.A08(r5, str);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A04(X.AnonymousClass2HJ r6) {
        /*
            r5 = this;
            java.lang.String r0 = "PAY: onResponseError action: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r4 = r5.A05
            r1.append(r4)
            java.lang.String r0 = " error: "
            java.lang.String r0 = X.AnonymousClass000.A0e(r6, r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.61W r2 = r5.A01
            if (r2 == 0) goto L_0x001e
            int r1 = r5.A00
            r0 = 1
            r2.A06(r6, r1, r0)
        L_0x001e:
            X.5ix r1 = r5.A02
            if (r1 == 0) goto L_0x0029
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x0029
            r1.A08(r6, r0)
        L_0x0029:
            X.4XO r3 = r5.A04
            if (r3 == 0) goto L_0x0089
            int r0 = r6.A00
            r3.A06(r4, r0)
            int r4 = r6.A00
            r0 = 403(0x193, float:5.65E-43)
            if (r4 == r0) goto L_0x006f
            r0 = 405(0x195, float:5.68E-43)
            if (r4 == r0) goto L_0x006f
            r0 = 406(0x196, float:5.69E-43)
            if (r4 == r0) goto L_0x006f
            r0 = 426(0x1aa, float:5.97E-43)
            if (r4 == r0) goto L_0x006f
            r0 = 460(0x1cc, float:6.45E-43)
            if (r4 == r0) goto L_0x006f
            r0 = 410(0x19a, float:5.75E-43)
            if (r4 == r0) goto L_0x006f
            r0 = 409(0x199, float:5.73E-43)
            if (r4 == r0) goto L_0x006f
            r0 = 2826008(0x2b1f18, float:3.96008E-39)
            if (r4 == r0) goto L_0x006f
            r0 = 440(0x1b8, float:6.17E-43)
            if (r4 != r0) goto L_0x0089
            monitor-enter(r3)
            r3.A02 = r4     // Catch:{ all -> 0x0085 }
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.A07     // Catch:{ all -> 0x0085 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "tos-"
            r1.append(r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r4)     // Catch:{ all -> 0x0085 }
            r2.add(r0)     // Catch:{ all -> 0x0085 }
            goto L_0x0088
        L_0x006f:
            monitor-enter(r3)
            r3.A01 = r4     // Catch:{ all -> 0x0085 }
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.A07     // Catch:{ all -> 0x0085 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "payability-"
            r1.append(r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r4)     // Catch:{ all -> 0x0085 }
            r2.add(r0)     // Catch:{ all -> 0x0085 }
            goto L_0x0088
        L_0x0085:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0088:
            monitor-exit(r3)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112485iZ.A04(X.2HJ):void");
    }

    public void A05(C28371Vv r6) {
        String str;
        C31081dR A002;
        StringBuilder A0r = AnonymousClass000.A0r("PAY: onResponseSuccess for op: action: ");
        String str2 = this.A05;
        Log.i(AnonymousClass000.A0h(str2, A0r));
        AnonymousClass61W r2 = this.A01;
        if (r2 != null) {
            r2.A06((AnonymousClass2HJ) null, this.A00, 2);
        }
        C112715ix r22 = this.A02;
        if (!(r22 == null || (str = this.A03) == null || (A002 = r22.A00((Integer) null, str)) == null)) {
            A002.A0C(2);
            r22.A04.remove(str);
        }
        AnonymousClass4XO r0 = this.A04;
        if (r0 != null) {
            r0.A05(str2);
        }
    }
}
