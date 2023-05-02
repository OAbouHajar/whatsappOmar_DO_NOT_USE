package X;

import com.mod2.fblibs.FacebookFacade;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Ba  reason: invalid class name and case insensitive filesystem */
public class C61943Ba {
    public static final List A04 = AnonymousClass000.A0u();
    public final List A00 = AnonymousClass000.A0u();
    public final List A01 = AnonymousClass000.A0u();
    public final List A02 = AnonymousClass000.A0u();
    public final List A03 = AnonymousClass000.A0u();

    public C61943Ba() {
    }

    public C61943Ba(C28371Vv r10) {
        C28371Vv[] r0;
        AnonymousClass4M7 r3;
        C28371Vv A0J;
        C28371Vv[] r02;
        C28371Vv A0J2 = r10.A0J("sync");
        if (A0J2 != null) {
            Iterator it = A0J2.A0O("collection").iterator();
            while (it.hasNext()) {
                C28371Vv A0S = C13690nt.A0S(it);
                if ("error".equals(A0S.A0N("type", (String) null))) {
                    C28371Vv A0J3 = A0S.A0J("error");
                    AnonymousClass00B.A06(A0J3);
                    try {
                        int A0A = A0J3.A0A("code", -1);
                        String A0N = A0J3.A0N("text", (String) null);
                        if (A0A != 409 || (A0J = A0S.A0J("patches")) == null || (r02 = A0J.A03) == null || r02.length <= 0) {
                            r3 = new AnonymousClass4M7((AnonymousClass1XB) null, A01(A0S), A04, "true".equals(A0S.A0N("has_more_patches", (String) null)));
                        } else {
                            r3 = A00(A0S);
                        }
                        this.A01.add(new AnonymousClass4RY(r3, A0N, A01(A0S), A0A));
                    } catch (AnonymousClass1W9 e2) {
                        StringBuilder A0r = AnonymousClass000.A0r("Expected attribute code in ");
                        A0r.append(A0J3);
                        A0r.append(" exception");
                        throw new AnonymousClass259(AnonymousClass000.A0h(e2.getMessage(), A0r), true);
                    }
                } else if (A0S.A0N("version", (String) null) != null) {
                    try {
                        long A0D = A0S.A0D("version", -1);
                        if (A0D != -1) {
                            this.A03.add(new C83554Hd(A01(A0S), A0D));
                        } else {
                            throw new AnonymousClass259(AnonymousClass000.A0f(A0S, AnonymousClass000.A0q("Expected attribute version in ")), true);
                        }
                    } catch (AnonymousClass1W9 e3) {
                        StringBuilder A0q = AnonymousClass000.A0q("Expected attribute version in ");
                        A0q.append(A0S);
                        A0q.append(" exception");
                        throw new AnonymousClass259(AnonymousClass000.A0h(e3.getMessage(), A0q), true);
                    }
                } else {
                    C28371Vv A0J4 = A0S.A0J("patches");
                    if ((A0J4 == null || (r0 = A0J4.A03) == null || r0.length <= 0) && A0S.A0J("snapshot") == null) {
                        this.A00.add(A01(A0S));
                    } else {
                        this.A02.add(A00(A0S));
                    }
                }
            }
            return;
        }
        throw new AnonymousClass259("Expected node sync in response, but not found", true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.1XB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r2 != null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f9, code lost:
        if (r5 != 101) goto L_0x00fb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4M7 A00(X.C28371Vv r10) {
        /*
            r9 = this;
            java.lang.String r5 = "snapshot"
            X.1Vv r3 = r10.A0J(r5)
            java.lang.String r0 = "patches"
            X.1Vv r2 = r10.A0J(r0)
            if (r3 != 0) goto L_0x0012
            r1 = 0
            if (r2 == 0) goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            java.lang.String r0 = "SyncResponse/parseCollectionWithPatches both snapshot and patches node is null"
            X.AnonymousClass00B.A0C(r0, r1)
            r4 = 0
            if (r3 == 0) goto L_0x005d
            X.1Vv r0 = r10.A0J(r5)
            X.AnonymousClass00B.A06(r0)
            byte[] r1 = r0.A01
            if (r1 == 0) goto L_0x004c
            int r0 = r1.length
            if (r0 == 0) goto L_0x004c
            X.1XB r0 = X.AnonymousClass1XB.A07     // Catch:{ 1bD -> 0x0033 }
            X.1Wm r0 = X.C28541Wm.A0E(r0, r1)     // Catch:{ 1bD -> 0x0033 }
            X.1XB r0 = (X.AnonymousClass1XB) r0     // Catch:{ 1bD -> 0x0033 }
            r4 = r0
            goto L_0x005d
        L_0x0033:
            r1 = move-exception
            java.lang.String r0 = "sync-response/parseCollectionWithSnapshot failed to parse patch data in "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r10)
            com.whatsapp.util.Log.e(r0, r1)
            r2 = 69
            java.lang.String r0 = "name"
            java.lang.String r1 = r10.A0N(r0, r4)
            X.1X9 r0 = new X.1X9
            r0.<init>(r2, r1)
            throw r0
        L_0x004c:
            r2 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r5)
            java.lang.String r0 = " body was empty."
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            X.259 r0 = new X.259
            r0.<init>(r1, r2)
            throw r0
        L_0x005d:
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            if (r2 == 0) goto L_0x014e
            java.lang.String r5 = "patch"
            java.util.List r0 = r2.A0O(r5)
            java.util.Iterator r2 = r0.iterator()
        L_0x006d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b2
            X.1Vv r0 = X.C13690nt.A0S(r2)
            byte[] r1 = r0.A01
            if (r1 == 0) goto L_0x00a1
            int r0 = r1.length
            if (r0 == 0) goto L_0x00a1
            X.1XC r0 = X.AnonymousClass1XC.A09     // Catch:{ 1bD -> 0x0088 }
            X.1Wm r0 = X.C28541Wm.A0E(r0, r1)     // Catch:{ 1bD -> 0x0088 }
            r3.add(r0)     // Catch:{ 1bD -> 0x0088 }
            goto L_0x006d
        L_0x0088:
            r1 = move-exception
            java.lang.String r0 = "sync-response/parseCollectionWithPatches failed to parse patch data in "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r10)
            com.whatsapp.util.Log.e(r0, r1)
            r2 = 18
            java.lang.String r0 = "name"
            java.lang.String r1 = X.C28371Vv.A05(r10, r0)
            X.1X9 r0 = new X.1X9
            r0.<init>(r2, r1)
            throw r0
        L_0x00a1:
            r2 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r5)
            java.lang.String r0 = " body was empty."
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            X.259 r0 = new X.259
            r0.<init>(r1, r2)
            throw r0
        L_0x00b2:
            java.lang.String r0 = "name"
            java.lang.String r2 = X.C28371Vv.A05(r10, r0)
            int r0 = r3.size()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r0)
            java.util.Iterator r8 = r3.iterator()
        L_0x00c5:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x014e
            java.lang.Object r6 = r8.next()
            X.1XC r6 = (X.AnonymousClass1XC) r6
            int r7 = r6.A00
            r1 = 32
            r0 = r7 & 32
            if (r0 != r1) goto L_0x0106
            X.2Mu r0 = r6.A05
            r3 = r0
            if (r0 != 0) goto L_0x00e0
            X.2Mu r0 = X.C48342Mu.A03
        L_0x00e0:
            int r0 = r0.A00
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x00fb
            if (r3 != 0) goto L_0x00eb
            X.2Mu r3 = X.C48342Mu.A03
        L_0x00eb:
            long r5 = r3.A01
            r3 = 100
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0103
            r3 = 101(0x65, double:5.0E-322)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r1 = 37
            if (r0 == 0) goto L_0x00fd
        L_0x00fb:
            r1 = 38
        L_0x00fd:
            X.1X9 r0 = new X.1X9
            r0.<init>(r1, r2)
            throw r0
        L_0x0103:
            r1 = 36
            goto L_0x00fd
        L_0x0106:
            r1 = 1
            r0 = r7 & 1
            if (r0 != r1) goto L_0x0146
            X.1jt r0 = r6.A08
            if (r0 != 0) goto L_0x0111
            X.1jt r0 = X.C34211jt.A02
        L_0x0111:
            int r0 = r0.A00
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0146
            r1 = 2
            r0 = r7 & 2
            if (r0 != r1) goto L_0x012c
            X.1XE r0 = r6.A04
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x012c
            r1 = 14
            X.1X9 r0 = new X.1X9
            r0.<init>(r1, r2)
            throw r0
        L_0x012c:
            X.1jt r0 = r6.A08
            if (r0 != 0) goto L_0x0132
            X.1jt r0 = X.C34211jt.A02
        L_0x0132:
            long r0 = r0.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r5.add(r0)
            if (r0 != 0) goto L_0x00c5
            r1 = 9
            X.1X9 r0 = new X.1X9
            r0.<init>(r1, r2)
            throw r0
        L_0x0146:
            r1 = 8
            X.1X9 r0 = new X.1X9
            r0.<init>(r1, r2)
            throw r0
        L_0x014e:
            java.lang.String r0 = "has_more_patches"
            java.lang.String r1 = X.C28371Vv.A05(r10, r0)
            java.lang.String r0 = "true"
            boolean r2 = r0.equals(r1)
            java.lang.String r1 = r9.A01(r10)
            X.4M7 r0 = new X.4M7
            r0.<init>(r4, r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61943Ba.A00(X.1Vv):X.4M7");
    }

    public final String A01(C28371Vv r4) {
        String A05 = C28371Vv.A05(r4, FacebookFacade.RequestParameter.NAME);
        if (A05 != null) {
            return A05;
        }
        throw new AnonymousClass259(AnonymousClass000.A0g("Expected attribute name in ", r4), true);
    }
}
