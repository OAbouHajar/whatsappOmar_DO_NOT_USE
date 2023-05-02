package X;

import android.support.v4.view.GravityCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1vA  reason: invalid class name and case insensitive filesystem */
public final class C41061vA extends C41071vB {
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r0.A01 == 5) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C27161Qr A00(X.C18180wH r4, X.C33211iD r5) {
        /*
            int r0 = r5.A01
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0046
            X.2uG r0 = r5.A03
            r1 = r0
            if (r0 != 0) goto L_0x000e
            X.2uG r0 = X.C58852uG.A08
        L_0x000e:
            X.1XE r0 = r0.A03
            if (r0 == 0) goto L_0x0046
            if (r1 != 0) goto L_0x0016
            X.2uG r1 = X.C58852uG.A08
        L_0x0016:
            X.1XE r0 = r1.A03
            java.util.Iterator r3 = r0.iterator()
        L_0x001c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r2 = r3.next()
            X.2u3 r2 = (X.AnonymousClass2u3) r2
            int r0 = r2.A00
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x001c
            X.2tP r1 = r2.A03
            r0 = r1
            if (r1 != 0) goto L_0x0037
            X.2tP r1 = X.C58382tP.A03
        L_0x0037:
            java.lang.String r1 = r1.A01
            if (r0 != 0) goto L_0x003d
            X.2tP r0 = X.C58382tP.A03
        L_0x003d:
            java.lang.String r0 = r0.A02
            X.1Qr r0 = r4.A01(r1, r0)
            if (r0 == 0) goto L_0x001c
            return r0
        L_0x0046:
            boolean r0 = r5.A0f()
            if (r0 == 0) goto L_0x008c
            X.2uY r0 = r5.A0k
            if (r0 != 0) goto L_0x0052
            X.2uY r0 = X.C59022uY.A06
        L_0x0052:
            int r1 = r0.A01
            r0 = 5
            if (r1 != r0) goto L_0x008c
        L_0x0057:
            X.220 r0 = X.C439021z.A00(r5)
            int r1 = r0.A01
            r0 = 6
            if (r1 != r0) goto L_0x0095
            X.220 r0 = X.C439021z.A00(r5)
            X.221 r0 = r0.A0d()
            X.1XE r0 = r0.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x006e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r2 = r3.next()
            X.222 r2 = (X.AnonymousClass222) r2
            int r0 = r2.A00
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x006e
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r2.A01
            X.1Qr r0 = r4.A01(r1, r0)
            if (r0 == 0) goto L_0x006e
            return r0
        L_0x008c:
            int r0 = r5.A01
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x0095
            goto L_0x0057
        L_0x0095:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41061vA.A00(X.0wH, X.1iD):X.1Qr");
    }

    /* JADX WARNING: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass21S A01(X.C14710pd r7, X.C33211iD r8) {
        /*
            X.1iD r5 = A03(r7, r8)
            int r2 = r5.A00
            r3 = 8
            r1 = r2 & 8
            r0 = 0
            if (r1 != r3) goto L_0x000e
            r0 = 1
        L_0x000e:
            r3 = 0
            if (r0 == 0) goto L_0x0025
            X.2tk r2 = r5.A08
            if (r2 != 0) goto L_0x0017
            X.2tk r2 = X.C58592tk.A04
        L_0x0017:
            int r0 = r2.A00
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto L_0x0024
            X.21S r3 = r2.A01
        L_0x0020:
            if (r3 != 0) goto L_0x0024
            X.21S r3 = X.AnonymousClass21S.A0R
        L_0x0024:
            return r3
        L_0x0025:
            r1 = 16
            r0 = r2 & 16
            if (r0 != r1) goto L_0x003b
            X.2uT r2 = r5.A0U
            if (r2 != 0) goto L_0x0031
            X.2uT r2 = X.C58982uT.A0D
        L_0x0031:
            int r1 = r2.A04
            r0 = 2048(0x800, float:2.87E-42)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0024
            X.21S r3 = r2.A07
            goto L_0x0020
        L_0x003b:
            r4 = 65536(0x10000, float:9.18355E-41)
            r0 = r2 & r4
            if (r0 != r4) goto L_0x0051
            X.21v r2 = r5.A0T
            if (r2 != 0) goto L_0x0047
            X.21v r2 = X.C438621v.A0B
        L_0x0047:
            int r1 = r2.A04
            r0 = 512(0x200, float:7.175E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0024
            X.21S r3 = r2.A09
            goto L_0x0020
        L_0x0051:
            r6 = 32
            r0 = r2 & 32
            if (r0 == r6) goto L_0x00ba
            r1 = 4
            r0 = r2 & 4
            if (r0 == r1) goto L_0x0251
            r1 = 128(0x80, float:1.794E-43)
            r0 = r2 & r1
            if (r0 != r1) goto L_0x0072
            X.24m r2 = r5.A02
            if (r2 != 0) goto L_0x0068
            X.24m r2 = X.C445424m.A0F
        L_0x0068:
            int r1 = r2.A01
            r0 = 1024(0x400, float:1.435E-42)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0024
            X.21S r3 = r2.A0A
            goto L_0x0020
        L_0x0072:
            r1 = 256(0x100, float:3.59E-43)
            r0 = r2 & r1
            if (r0 == r1) goto L_0x0240
            boolean r0 = r5.A0c()
            if (r0 == 0) goto L_0x008c
            X.24l r1 = r5.A0C
            if (r1 != 0) goto L_0x0084
            X.24l r1 = X.C445324l.A0L
        L_0x0084:
            int r0 = r1.A00
            r0 = r0 & r4
            if (r0 != r4) goto L_0x0024
            X.21S r3 = r1.A0C
            goto L_0x0020
        L_0x008c:
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r2 & r1
            if (r0 != r1) goto L_0x00f4
            X.2tl r2 = r5.A09
            if (r2 != 0) goto L_0x0098
            X.2tl r2 = X.C58602tl.A04
        L_0x0098:
            int r0 = r2.A00
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x0024
            X.21S r3 = r2.A02
            goto L_0x0020
        L_0x00a3:
            X.1iD r5 = A02(r7, r5)
            if (r5 == 0) goto L_0x0024
            int r2 = r5.A00
            r1 = 4
            r0 = r2 & 4
            if (r0 == r1) goto L_0x0251
            r1 = 256(0x100, float:3.59E-43)
            r0 = r2 & r1
            if (r0 == r1) goto L_0x0240
            r0 = r2 & 32
            if (r0 != r6) goto L_0x0024
        L_0x00ba:
            X.2ep r2 = r5.A0E
            goto L_0x00df
        L_0x00bd:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r2 & r1
            if (r0 != r1) goto L_0x010b
            X.2ty r2 = r5.A0f
            if (r2 != 0) goto L_0x00ca
            X.2ty r2 = X.C58732ty.A04
        L_0x00ca:
            int r0 = r2.A00
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0024
            X.1iD r2 = r2.A01
        L_0x00d3:
            if (r2 != 0) goto L_0x00d7
            X.1iD r2 = X.C33211iD.A0o
        L_0x00d7:
            int r1 = r2.A00
            r0 = r1 & 32
            if (r0 != r6) goto L_0x00ee
            X.2ep r2 = r2.A0E
        L_0x00df:
            if (r2 != 0) goto L_0x00e3
            X.2ep r2 = X.C53012ep.A0P
        L_0x00e3:
            int r1 = r2.A01
            r0 = 1024(0x400, float:1.435E-42)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0024
            X.21S r3 = r2.A0F
            goto L_0x0020
        L_0x00ee:
            r1 = r1 & r4
            if (r1 != r4) goto L_0x0024
            X.1pI r2 = r2.A0i
            goto L_0x00fc
        L_0x00f4:
            r4 = 2097152(0x200000, float:2.938736E-39)
            r0 = r2 & r4
            if (r0 != r4) goto L_0x00bd
            X.1pI r2 = r5.A0i
        L_0x00fc:
            if (r2 != 0) goto L_0x0100
            X.1pI r2 = X.C37521pI.A0I
        L_0x0100:
            int r1 = r2.A00
            r0 = 16384(0x4000, float:2.2959E-41)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0024
            X.21S r3 = r2.A0C
            goto L_0x0020
        L_0x010b:
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r2 & r1
            if (r0 != r1) goto L_0x0121
            X.2uI r2 = r5.A0d
            if (r2 != 0) goto L_0x0117
            X.2uI r2 = X.C58872uI.A08
        L_0x0117:
            int r0 = r2.A00
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0024
            X.1iD r2 = r2.A03
            goto L_0x00d3
        L_0x0121:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r2 & r1
            if (r0 != r1) goto L_0x0137
            X.2uE r1 = r5.A0a
            if (r1 != 0) goto L_0x012d
            X.2uE r1 = X.AnonymousClass2uE.A07
        L_0x012d:
            int r0 = r1.A00
            r0 = r0 & 32
            if (r0 != r6) goto L_0x0024
            X.21S r3 = r1.A01
            goto L_0x0020
        L_0x0137:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r2 & r1
            if (r0 != r1) goto L_0x014f
            X.2uL r2 = r5.A0L
            if (r2 != 0) goto L_0x0143
            X.2uL r2 = X.C58902uL.A09
        L_0x0143:
            int r0 = r2.A00
            r1 = 64
            r0 = r0 & 64
            if (r0 != r1) goto L_0x0024
            X.21S r3 = r2.A04
            goto L_0x0020
        L_0x014f:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r2 & r1
            if (r0 != r1) goto L_0x0166
            X.2u5 r2 = r5.A0j
            if (r2 != 0) goto L_0x015b
            X.2u5 r2 = X.C58772u5.A05
        L_0x015b:
            int r0 = r2.A00
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto L_0x0024
            X.21S r3 = r2.A02
            goto L_0x0020
        L_0x0166:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r2 & r1
            if (r0 == r1) goto L_0x00a3
            int r4 = r5.A01
            r1 = 2048(0x800, float:2.87E-42)
            r0 = r4 & r1
            if (r0 == r1) goto L_0x00a3
            r1 = 16384(0x4000, float:2.2959E-41)
            r0 = r4 & r1
            if (r0 == r1) goto L_0x00a3
            r1 = 512(0x200, float:7.175E-43)
            r0 = r4 & r1
            if (r0 == r1) goto L_0x0024
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r2 & r1
            if (r0 != r1) goto L_0x0197
            X.2uU r2 = r5.A0V
            if (r2 != 0) goto L_0x018c
            X.2uU r2 = X.C58992uU.A0D
        L_0x018c:
            int r1 = r2.A00
            r0 = 2048(0x800, float:2.87E-42)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0024
            X.21S r3 = r2.A06
            goto L_0x0020
        L_0x0197:
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r2 & r1
            if (r0 != r1) goto L_0x01af
            X.2uB r2 = r5.A0S
            if (r2 != 0) goto L_0x01a3
            X.2uB r2 = X.C58822uB.A06
        L_0x01a3:
            int r0 = r2.A00
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x0024
            X.21S r3 = r2.A02
            goto L_0x0020
        L_0x01af:
            r1 = 1
            r0 = r4 & 1
            if (r0 != r1) goto L_0x01c5
            X.2uG r2 = r5.A03
            if (r2 != 0) goto L_0x01ba
            X.2uG r2 = X.C58852uG.A08
        L_0x01ba:
            int r1 = r2.A00
            r0 = 128(0x80, float:1.794E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0024
            X.21S r3 = r2.A04
            goto L_0x0020
        L_0x01c5:
            r1 = 2
            r0 = r4 & 2
            if (r0 != r1) goto L_0x01db
            X.2uA r2 = r5.A04
            if (r2 != 0) goto L_0x01d0
            X.2uA r2 = X.C58812uA.A06
        L_0x01d0:
            int r0 = r2.A00
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto L_0x0024
            X.21S r3 = r2.A03
            goto L_0x0020
        L_0x01db:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r2 = r2 & r0
            if (r2 != r0) goto L_0x01f2
            X.2ua r2 = r5.A0R
            if (r2 != 0) goto L_0x01e6
            X.2ua r2 = X.C59042ua.A09
        L_0x01e6:
            int r0 = r2.A00
            r1 = 64
            r0 = r0 & 64
            if (r0 != r1) goto L_0x0024
            X.21S r3 = r2.A03
            goto L_0x0020
        L_0x01f2:
            r2 = 8
            r0 = r4 & 8
            if (r0 != r2) goto L_0x020a
            X.220 r2 = r5.A0O
            if (r2 != 0) goto L_0x01fe
            X.220 r2 = X.AnonymousClass220.A07
        L_0x01fe:
            int r0 = r2.A00
            r1 = 64
            r0 = r0 & 64
            if (r0 != r1) goto L_0x0024
            X.21S r3 = r2.A02
            goto L_0x0020
        L_0x020a:
            r1 = 64
            r0 = r4 & 64
            if (r0 != r1) goto L_0x0220
            X.2uC r1 = r5.A0Y
        L_0x0212:
            if (r1 != 0) goto L_0x0216
            X.2uC r1 = X.AnonymousClass2uC.A06
        L_0x0216:
            int r0 = r1.A00
            r0 = r0 & 8
            if (r0 != r2) goto L_0x0024
            X.21S r3 = r1.A04
            goto L_0x0020
        L_0x0220:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r4 & r1
            if (r0 != r1) goto L_0x022a
            X.2uC r1 = r5.A0X
            goto L_0x0212
        L_0x022a:
            r0 = 1024(0x400, float:1.435E-42)
            r4 = r4 & r0
            if (r4 != r0) goto L_0x0024
            X.2tF r2 = r5.A0e
            if (r2 != 0) goto L_0x0235
            X.2tF r2 = X.C58282tF.A02
        L_0x0235:
            int r0 = r2.A00
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0024
            X.21S r3 = r2.A01
            goto L_0x0020
        L_0x0240:
            X.24n r2 = r5.A0l
            if (r2 != 0) goto L_0x0246
            X.24n r2 = X.C445524n.A0O
        L_0x0246:
            int r1 = r2.A00
            r0 = 16384(0x4000, float:2.2959E-41)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0024
            X.21S r3 = r2.A0F
            goto L_0x0020
        L_0x0251:
            X.24k r2 = r5.A0N
            if (r2 != 0) goto L_0x0257
            X.24k r2 = X.C445224k.A0R
        L_0x0257:
            int r1 = r2.A00
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0024
            X.21S r3 = r2.A0J
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41061vA.A01(X.0pd, X.1iD):X.21S");
    }

    public static C33211iD A02(C14710pd r3, C33211iD r4) {
        C52992en r0;
        int i2 = r4.A01;
        if ((i2 & 16384) == 16384) {
            r0 = r4.A0I;
        } else if ((i2 & 2048) == 2048) {
            r0 = r4.A0J;
        } else if ((r4.A00 & 268435456) == 268435456) {
            r0 = r4.A0K;
        } else if (r4.A0d()) {
            r0 = r4.A0H;
        } else if ((i2 & 512) == 512) {
            r0 = r4.A0F;
        } else if ((i2 & 8192) != 8192 || !r3.A0E(C16620tM.A02, 2189)) {
            return null;
        } else {
            r0 = r4.A0G;
        }
        if (r0 == null) {
            r0 = C52992en.A02;
        }
        C33211iD r02 = r0.A01;
        return r02 == null ? C33211iD.A0o : r02;
    }

    public static C33211iD A03(C14710pd r1, C33211iD r2) {
        if (r2.A0d()) {
            C52992en r0 = r2.A0H;
            if (r0 == null) {
                r0 = C52992en.A02;
            }
            r2 = r0.A01;
            if (r2 == null) {
                r2 = C33211iD.A0o;
            }
        }
        C33211iD A02 = A02(r1, r2);
        return A02 != null ? A02 : r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v162, resolved type: X.1rI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v167, resolved type: X.1rM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v169, resolved type: X.1rF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v170, resolved type: X.1rA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: X.1lv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v456, resolved type: X.1rT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v471, resolved type: X.1s1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v526, resolved type: X.1rI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v529, resolved type: X.1rI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v530, resolved type: X.1rI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v13, resolved type: X.1rI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v14, resolved type: X.1rI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v532, resolved type: X.1rI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v533, resolved type: X.1rI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v535, resolved type: X.1rI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v536, resolved type: X.1rI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v579, resolved type: X.1rT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v580, resolved type: X.1rT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v589, resolved type: X.1s9} */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r0v41, types: [X.1s6] */
    /* JADX WARNING: type inference failed for: r0v163 */
    /* JADX WARNING: type inference failed for: r29v4, types: [X.1ru] */
    /* JADX WARNING: type inference failed for: r0v165, types: [X.0tZ] */
    /* JADX WARNING: type inference failed for: r0v346, types: [X.0tZ] */
    /* JADX WARNING: type inference failed for: r0v520 */
    /* JADX WARNING: type inference failed for: r0v522 */
    /* JADX WARNING: type inference failed for: r0v523 */
    /* JADX WARNING: type inference failed for: r4v224, types: [X.1rQ] */
    /* JADX WARNING: type inference failed for: r4v225, types: [X.1rQ] */
    /* JADX WARNING: type inference failed for: r9v56, types: [X.1s2] */
    /* JADX WARNING: type inference failed for: r4v226, types: [X.1rQ] */
    /* JADX WARNING: type inference failed for: r9v57, types: [X.1s2] */
    /* JADX WARNING: type inference failed for: r29v10, types: [X.1rv] */
    /* JADX WARNING: type inference failed for: r29v11, types: [X.1rv] */
    /* JADX WARNING: type inference failed for: r4v227, types: [X.1rQ] */
    /* JADX WARNING: type inference failed for: r0v524 */
    /* JADX WARNING: type inference failed for: r0v525 */
    /* JADX WARNING: type inference failed for: r0v527 */
    /* JADX WARNING: type inference failed for: r0v528 */
    /* JADX WARNING: type inference failed for: r29v12, types: [X.1rI] */
    /* JADX WARNING: type inference failed for: r0v531 */
    /* JADX WARNING: type inference failed for: r0v534 */
    /* JADX WARNING: type inference failed for: r0v537 */
    /* JADX WARNING: type inference failed for: r0v538 */
    /* JADX WARNING: type inference failed for: r0v539 */
    /* JADX WARNING: type inference failed for: r4v228, types: [X.1rQ] */
    /* JADX WARNING: type inference failed for: r0v540 */
    /* JADX WARNING: type inference failed for: r4v229, types: [X.1rQ] */
    /* JADX WARNING: type inference failed for: r5v113, types: [X.1rq] */
    /* JADX WARNING: type inference failed for: r0v542 */
    /* JADX WARNING: type inference failed for: r4v230, types: [X.1rQ] */
    /* JADX WARNING: type inference failed for: r0v544 */
    /* JADX WARNING: type inference failed for: r0v545 */
    /* JADX WARNING: type inference failed for: r4v231, types: [X.1rQ] */
    /* JADX WARNING: type inference failed for: r4v232, types: [X.1rQ] */
    /* JADX WARNING: type inference failed for: r0v546 */
    /* JADX WARNING: type inference failed for: r0v547 */
    /* JADX WARNING: type inference failed for: r0v548 */
    /* JADX WARNING: type inference failed for: r0v549 */
    /* JADX WARNING: type inference failed for: r0v550 */
    /* JADX WARNING: type inference failed for: r0v551 */
    /* JADX WARNING: type inference failed for: r0v552 */
    /* JADX WARNING: type inference failed for: r0v553 */
    /* JADX WARNING: type inference failed for: r0v554 */
    /* JADX WARNING: type inference failed for: r0v555 */
    /* JADX WARNING: type inference failed for: r10v41 */
    /* JADX WARNING: type inference failed for: r10v42 */
    /* JADX WARNING: type inference failed for: r10v43 */
    /* JADX WARNING: type inference failed for: r0v556 */
    /* JADX WARNING: type inference failed for: r0v557 */
    /* JADX WARNING: type inference failed for: r0v558 */
    /* JADX WARNING: type inference failed for: r0v559 */
    /* JADX WARNING: type inference failed for: r0v560 */
    /* JADX WARNING: type inference failed for: r8v47, types: [X.1rB] */
    /* JADX WARNING: type inference failed for: r0v561 */
    /* JADX WARNING: type inference failed for: r0v562 */
    /* JADX WARNING: type inference failed for: r0v563 */
    /* JADX WARNING: type inference failed for: r0v564 */
    /* JADX WARNING: type inference failed for: r0v565 */
    /* JADX WARNING: type inference failed for: r0v566 */
    /* JADX WARNING: type inference failed for: r0v567 */
    /* JADX WARNING: type inference failed for: r10v44 */
    /* JADX WARNING: type inference failed for: r0v568 */
    /* JADX WARNING: type inference failed for: r0v569 */
    /* JADX WARNING: type inference failed for: r0v570 */
    /* JADX WARNING: type inference failed for: r0v571 */
    /* JADX WARNING: type inference failed for: r0v572 */
    /* JADX WARNING: type inference failed for: r0v573 */
    /* JADX WARNING: type inference failed for: r6v100, types: [X.1pS] */
    /* JADX WARNING: type inference failed for: r0v574 */
    /* JADX WARNING: type inference failed for: r0v575 */
    /* JADX WARNING: type inference failed for: r0v576 */
    /* JADX WARNING: type inference failed for: r0v577 */
    /* JADX WARNING: type inference failed for: r0v578 */
    /* JADX WARNING: type inference failed for: r0v581 */
    /* JADX WARNING: type inference failed for: r4v233, types: [X.1rQ] */
    /* JADX WARNING: type inference failed for: r0v582 */
    /* JADX WARNING: type inference failed for: r0v583 */
    /* JADX WARNING: type inference failed for: r8v48, types: [X.1rI] */
    /* JADX WARNING: type inference failed for: r8v49, types: [X.1rm] */
    /* JADX WARNING: type inference failed for: r8v50, types: [X.1rR] */
    /* JADX WARNING: type inference failed for: r0v584 */
    /* JADX WARNING: type inference failed for: r0v585 */
    /* JADX WARNING: type inference failed for: r0v586 */
    /* JADX WARNING: type inference failed for: r0v588 */
    /* JADX WARNING: type inference failed for: r0v590 */
    /* JADX WARNING: type inference failed for: r0v591 */
    /* JADX WARNING: type inference failed for: r0v592 */
    /* JADX WARNING: type inference failed for: r0v593 */
    /* JADX WARNING: type inference failed for: r0v594 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:597|598|599|600|601|(1:603)|604|(1:606)|607|(1:609)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:576|577|578|579|580|(1:582)|583|(4:585|586|587|588)|589|(1:591)|592|(2:594|1371)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:585|586|587|588) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:656|657|658|659) */
    /* JADX WARNING: Code restructure failed: missing block: B:1147:0x148f, code lost:
        if (r61.A0E(r11, 2035) == false) goto L_0x1491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1272:0x165a, code lost:
        if (r79 == null) goto L_0x165c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1377:0x1881, code lost:
        if (r7 != false) goto L_0x1883;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x0d56, code lost:
        if (r4.A01 == 5) goto L_0x0d58;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r100 != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:985:0x1212, code lost:
        if ("pending".equals(r6) == false) goto L_0x13c5;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Missing exception handler attribute for start block: B:579:0x0b50 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:587:0x0b93 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:600:0x0bcc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:658:0x0cf7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1011:0x127d A[Catch:{ 1W4 -> 0x0ca9, all -> 0x193a }] */
    /* JADX WARNING: Removed duplicated region for block: B:1037:0x12c5 A[Catch:{ 1W4 -> 0x0ca9, all -> 0x193a }] */
    /* JADX WARNING: Removed duplicated region for block: B:1040:0x12cd A[Catch:{ 1W4 -> 0x0ca9, all -> 0x193a }] */
    /* JADX WARNING: Removed duplicated region for block: B:1050:0x12e0 A[Catch:{ 1W4 -> 0x0ca9, all -> 0x193a }] */
    /* JADX WARNING: Removed duplicated region for block: B:1051:0x12e3 A[Catch:{ 1W4 -> 0x0ca9, all -> 0x193a }] */
    /* JADX WARNING: Removed duplicated region for block: B:1361:0x17de A[Catch:{ 1W4 -> 0x0ca9, all -> 0x193a }] */
    /* JADX WARNING: Removed duplicated region for block: B:1362:0x1802 A[Catch:{ 1W4 -> 0x0ca9, all -> 0x193a }] */
    /* JADX WARNING: Removed duplicated region for block: B:1436:0x0ff4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1439:0x13c5 A[EDGE_INSN: B:1439:0x13c5->B:1093:0x13c5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:582:0x0b54 A[Catch:{ 1W4 -> 0x0ca9, all -> 0x193a }] */
    /* JADX WARNING: Removed duplicated region for block: B:585:0x0b74 A[SYNTHETIC, Splitter:B:585:0x0b74] */
    /* JADX WARNING: Removed duplicated region for block: B:591:0x0ba5 A[Catch:{ 1W4 -> 0x0ca9, all -> 0x193a }] */
    /* JADX WARNING: Removed duplicated region for block: B:594:0x0bae A[Catch:{ 1W4 -> 0x0ca9, all -> 0x193a }] */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x0bd0 A[Catch:{ 1W4 -> 0x0ca9, all -> 0x193a }] */
    /* JADX WARNING: Removed duplicated region for block: B:606:0x0bde A[Catch:{ 1W4 -> 0x0ca9, all -> 0x193a }] */
    /* JADX WARNING: Removed duplicated region for block: B:609:0x0be7 A[Catch:{ 1W4 -> 0x0ca9, all -> 0x193a }] */
    /* JADX WARNING: Removed duplicated region for block: B:838:0x0fb4 A[Catch:{ 1W4 -> 0x0ca9, all -> 0x193a }] */
    /* JADX WARNING: Removed duplicated region for block: B:847:0x0fcb A[Catch:{ 1W4 -> 0x0ca9, all -> 0x193a }] */
    /* JADX WARNING: Removed duplicated region for block: B:892:0x1043 A[Catch:{ 1W4 -> 0x0ca9, all -> 0x193a }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:579:0x0b50=Splitter:B:579:0x0b50, B:587:0x0b93=Splitter:B:587:0x0b93, B:658:0x0cf7=Splitter:B:658:0x0cf7, B:600:0x0bcc=Splitter:B:600:0x0bcc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C16740tZ A04(X.C16300so r65, X.C16040sK r66, X.C17150uc r67, X.C16000sG r68, X.C18180wH r69, X.C16980tz r70, X.AnonymousClass013 r71, X.AnonymousClass1GG r72, X.C15810rt r73, X.C16460t6 r74, X.C223417o r75, X.AnonymousClass173 r76, X.AnonymousClass1Vt r77, X.C14710pd r78, X.C15830rv r79, X.C222517f r80, X.C18290wS r81, X.AnonymousClass1GF r82, X.AnonymousClass21S r83, X.C33211iD r84, X.C28381Vw r85, X.C222617g r86, X.AnonymousClass1TS r87, com.whatsapp.wamsys.JniBridge r88, java.lang.Long r89, java.lang.String r90, java.lang.String r91, java.lang.String r92, java.lang.String r93, int r94, int r95, long r96, boolean r98, boolean r99, boolean r100) {
        /*
            r9 = r79
            r60 = r82
            r0 = r60
            X.0pd r1 = r0.A01
            r0 = 1531(0x5fb, float:2.145E-42)
            X.0tM r11 = X.C16620tM.A02
            int r1 = r1.A03(r11, r0)
            if (r1 != 0) goto L_0x001f
            r16 = 0
        L_0x0014:
            r55 = r99
            r5 = r100
            if (r99 != 0) goto L_0x001d
            r7 = 0
            if (r100 == 0) goto L_0x0036
        L_0x001d:
            r7 = 1
            goto L_0x0036
        L_0x001f:
            r0 = r60
            X.0sq r4 = r0.A02
            com.facebook.redex.RunnableRunnableShape0S1100000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S1100000_I0
            r3.<init>((X.AnonymousClass1GF) r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = (long) r1
            long r1 = r2.toMillis(r0)
            java.lang.String r0 = "SlowMethodWatcher/start"
            java.lang.Runnable r16 = r4.Ad4(r3, r0, r1)
            goto L_0x0014
        L_0x0036:
            r61 = r78
            r25 = r84
            r1 = r61
            r0 = r25
            X.1iD r8 = A03(r1, r0)     // Catch:{ all -> 0x193a }
            int r12 = r8.A00     // Catch:{ all -> 0x193a }
            r4 = 1
            r0 = r12 & 1
            r57 = r91
            r58 = r90
            r62 = r76
            r17 = r95
            r64 = r66
            r2 = r96
            r23 = r67
            r28 = r72
            r54 = r98
            r63 = r69
            r26 = r70
            r27 = r71
            r24 = r68
            r37 = r81
            r1 = r85
            r59 = r86
            if (r0 != r4) goto L_0x007b
            java.lang.String r4 = r8.A0n     // Catch:{ all -> 0x193a }
            X.1cc r0 = new X.1cc     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r2 = X.AnonymousClass1ZW.A04(r2, r4)     // Catch:{ all -> 0x193a }
            r0.A0k(r2)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x007b:
            r4 = 8
            r0 = r12 & 8
            if (r0 != r4) goto L_0x00a5
            X.2tk r4 = r8.A08     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x0087
            X.2tk r4 = X.C58592tk.A04     // Catch:{ all -> 0x193a }
        L_0x0087:
            X.1rL r0 = new X.1rL     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            int r2 = r4.A00     // Catch:{ all -> 0x193a }
            r3 = 2
            r2 = r2 & 2
            if (r2 != r3) goto L_0x0098
            java.lang.String r2 = r4.A03     // Catch:{ all -> 0x193a }
            r0.A13(r2)     // Catch:{ all -> 0x193a }
        L_0x0098:
            int r2 = r4.A00     // Catch:{ all -> 0x193a }
            r3 = 1
            r2 = r2 & 1
            if (r2 != r3) goto L_0x17ca
            java.lang.String r2 = r4.A02     // Catch:{ all -> 0x193a }
            r0.A00 = r2     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x00a5:
            r4 = 16
            r0 = r12 & 16
            if (r0 != r4) goto L_0x00bb
            X.2uT r4 = r8.A0U     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x00b1
            X.2uT r4 = X.C58982uT.A0D     // Catch:{ all -> 0x193a }
        L_0x00b1:
            X.1rM r0 = new X.1rM     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A17(r4, r5)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x00bb:
            r4 = 65536(0x10000, float:9.18355E-41)
            r0 = r12 & r4
            r13 = r94
            if (r0 != r4) goto L_0x0101
            X.21v r4 = r8.A0T     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x00c9
            X.21v r4 = X.C438621v.A0B     // Catch:{ all -> 0x193a }
        L_0x00c9:
            X.1rV r0 = new X.1rV     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r2 = 1
            r0.A02 = r2     // Catch:{ all -> 0x193a }
            double r2 = r4.A00     // Catch:{ all -> 0x193a }
            r0.A00 = r2     // Catch:{ all -> 0x193a }
            double r2 = r4.A01     // Catch:{ all -> 0x193a }
            r0.A01 = r2     // Catch:{ all -> 0x193a }
            int r3 = r4.A04     // Catch:{ all -> 0x193a }
            r2 = 256(0x100, float:3.59E-43)
            r3 = r3 & r2
            if (r3 != r2) goto L_0x00ed
            X.0tm r3 = r0.A0F()     // Catch:{ all -> 0x193a }
            X.1Ww r2 = r4.A08     // Catch:{ all -> 0x193a }
            byte[] r2 = r2.A04()     // Catch:{ all -> 0x193a }
            r3.A03(r2, r5)     // Catch:{ all -> 0x193a }
        L_0x00ed:
            int r2 = r4.A04     // Catch:{ all -> 0x193a }
            r3 = 32
            r2 = r2 & 32
            if (r2 != r3) goto L_0x00f9
            java.lang.String r2 = r4.A0A     // Catch:{ all -> 0x193a }
            r0.A03 = r2     // Catch:{ all -> 0x193a }
        L_0x00f9:
            long r2 = r4.A07     // Catch:{ all -> 0x193a }
            r0.A01 = r2     // Catch:{ all -> 0x193a }
            r0.A00 = r13     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0101:
            r6 = 32
            r0 = r12 & 32
            r14 = r92
            if (r0 != r6) goto L_0x012f
            X.2ep r5 = r8.A0E     // Catch:{ all -> 0x193a }
            if (r5 != 0) goto L_0x010f
            X.2ep r5 = X.C53012ep.A0P     // Catch:{ all -> 0x193a }
        L_0x010f:
            int r4 = r5.A01     // Catch:{ all -> 0x193a }
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 & r0
            if (r4 != r0) goto L_0x0126
            boolean r0 = r5.A0O     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x0126
            X.1s9 r0 = new X.1s9     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A15(r5)     // Catch:{ all -> 0x193a }
        L_0x0122:
            r0.A03 = r14     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0126:
            X.1cc r0 = new X.1cc     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A15(r5)     // Catch:{ all -> 0x193a }
            goto L_0x0122
        L_0x012f:
            r4 = 4
            r0 = r12 & 4
            if (r0 != r4) goto L_0x0159
            X.24k r6 = r8.A0N     // Catch:{ all -> 0x193a }
            if (r6 != 0) goto L_0x013a
            X.24k r6 = X.C445224k.A0R     // Catch:{ all -> 0x193a }
        L_0x013a:
            int r4 = r6.A00     // Catch:{ all -> 0x193a }
            r0 = 524288(0x80000, float:7.34684E-40)
            r4 = r4 & r0
            if (r4 != r0) goto L_0x014f
            boolean r0 = r6.A0Q     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x014f
            X.1rk r0 = new X.1rk     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A1B(r6, r7, r5)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x014f:
            X.1rF r0 = new X.1rF     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A1B(r6, r7, r5)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0159:
            r4 = 128(0x80, float:1.794E-43)
            r0 = r12 & r4
            if (r0 != r4) goto L_0x029a
            X.24m r4 = r8.A02     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x0165
            X.24m r4 = X.C445424m.A0F     // Catch:{ all -> 0x193a }
        L_0x0165:
            X.1rH r0 = new X.1rH     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            boolean r2 = r4.A0E     // Catch:{ all -> 0x193a }
            r0.A08 = r2     // Catch:{ all -> 0x193a }
            X.0ta r8 = new X.0ta     // Catch:{ all -> 0x193a }
            r8.<init>()     // Catch:{ all -> 0x193a }
            r0.A02 = r8     // Catch:{ all -> 0x193a }
            r10 = 0
            r9 = 0
            int r3 = r4.A01     // Catch:{ all -> 0x193a }
            r2 = 4096(0x1000, float:5.74E-42)
            r3 = r3 & r2
            if (r3 != r2) goto L_0x018e
            X.1Ww r5 = r4.A09     // Catch:{ all -> 0x193a }
            int r3 = r5.A03()     // Catch:{ all -> 0x193a }
            if (r3 <= 0) goto L_0x018e
            r2 = 192(0xc0, float:2.69E-43)
            if (r3 > r2) goto L_0x018e
            byte[] r10 = r5.A04()     // Catch:{ all -> 0x193a }
        L_0x018e:
            int r3 = r4.A01     // Catch:{ all -> 0x193a }
            r2 = 8192(0x2000, float:1.14794E-41)
            r3 = r3 & r2
            if (r3 != r2) goto L_0x0197
            int r9 = r4.A00     // Catch:{ all -> 0x193a }
        L_0x0197:
            if (r10 != 0) goto L_0x019b
            if (r9 == 0) goto L_0x01a3
        L_0x019b:
            X.1yC r2 = new X.1yC     // Catch:{ all -> 0x193a }
            r2.<init>(r10, r9)     // Catch:{ all -> 0x193a }
            r0.A19(r2)     // Catch:{ all -> 0x193a }
        L_0x01a3:
            int r2 = r4.A01     // Catch:{ all -> 0x193a }
            r3 = 64
            r2 = r2 & 64
            if (r2 != r3) goto L_0x01c8
            X.1Ww r2 = r4.A07     // Catch:{ all -> 0x193a }
            byte[] r2 = r2.A04()     // Catch:{ all -> 0x193a }
            X.C42941yx.A00(r8, r0, r2)     // Catch:{ all -> 0x193a }
        L_0x01b4:
            int r11 = r4.A01     // Catch:{ all -> 0x193a }
            r3 = 512(0x200, float:7.175E-43)
            r2 = r11 & r3
            if (r2 != r3) goto L_0x01c3
            long r2 = r4.A04     // Catch:{ all -> 0x193a }
            r9 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r9
            r8.A0B = r2     // Catch:{ all -> 0x193a }
        L_0x01c3:
            java.lang.String r5 = "; message.key="
            if (r7 == 0) goto L_0x01d2
            goto L_0x01cc
        L_0x01c8:
            if (r7 != 0) goto L_0x01b4
            goto L_0x027c
        L_0x01cc:
            r3 = 8
            r2 = r11 & 8
            if (r2 != r3) goto L_0x01dc
        L_0x01d2:
            long r2 = r4.A03     // Catch:{ all -> 0x193a }
            r12 = 0
            int r9 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x0258
            r0.A01 = r2     // Catch:{ all -> 0x193a }
        L_0x01dc:
            r12 = 14
            java.lang.String r9 = "FMessageAudio/bogus sha-256 hash received; length="
            r10 = 2
            if (r7 == 0) goto L_0x01e8
            r3 = 4
            r2 = r11 & 4
            if (r2 != r3) goto L_0x01f7
        L_0x01e8:
            X.1Ww r2 = r4.A06     // Catch:{ all -> 0x193a }
            byte[] r3 = r2.A04()     // Catch:{ all -> 0x193a }
            int r2 = r3.length     // Catch:{ all -> 0x193a }
            if (r2 != r6) goto L_0x0235
            java.lang.String r2 = android.util.Base64.encodeToString(r3, r10)     // Catch:{ all -> 0x193a }
            r0.A05 = r2     // Catch:{ all -> 0x193a }
        L_0x01f7:
            int r3 = r4.A01     // Catch:{ all -> 0x193a }
            r2 = 128(0x80, float:1.794E-43)
            r3 = r3 & r2
            if (r3 != r2) goto L_0x0231
            X.1Ww r2 = r4.A05     // Catch:{ all -> 0x193a }
            byte[] r3 = r2.A04()     // Catch:{ all -> 0x193a }
            int r2 = r3.length     // Catch:{ all -> 0x193a }
            if (r2 != r6) goto L_0x020e
            java.lang.String r2 = android.util.Base64.encodeToString(r3, r10)     // Catch:{ all -> 0x193a }
            r0.A04 = r2     // Catch:{ all -> 0x193a }
            goto L_0x0231
        L_0x020e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r0.<init>()     // Catch:{ all -> 0x193a }
            r0.append(r9)     // Catch:{ all -> 0x193a }
            r0.append(r2)     // Catch:{ all -> 0x193a }
            r0.append(r5)     // Catch:{ all -> 0x193a }
            r0.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x193a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x193a }
            X.23S r1 = new X.23S     // Catch:{ all -> 0x193a }
            r1.<init>(r0)     // Catch:{ all -> 0x193a }
            goto L_0x186e
        L_0x0231:
            if (r7 != 0) goto L_0x186f
            goto L_0x1841
        L_0x0235:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r0.<init>()     // Catch:{ all -> 0x193a }
            r0.append(r9)     // Catch:{ all -> 0x193a }
            r0.append(r2)     // Catch:{ all -> 0x193a }
            r0.append(r5)     // Catch:{ all -> 0x193a }
            r0.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x193a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x193a }
            X.23S r1 = new X.23S     // Catch:{ all -> 0x193a }
            r1.<init>(r0)     // Catch:{ all -> 0x193a }
            goto L_0x186e
        L_0x0258:
            java.lang.String r4 = "FMessageAudio/bogus media size received; fileLength="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r0.<init>(r4)     // Catch:{ all -> 0x193a }
            r0.append(r2)     // Catch:{ all -> 0x193a }
            r0.append(r5)     // Catch:{ all -> 0x193a }
            r0.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x193a }
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x193a }
            X.23S r1 = new X.23S     // Catch:{ all -> 0x193a }
            r1.<init>(r0)     // Catch:{ all -> 0x193a }
            goto L_0x186e
        L_0x027c:
            java.lang.String r2 = "FMessageAudio/missing media key; message.key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r0.<init>(r2)     // Catch:{ all -> 0x193a }
            r0.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x193a }
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x193a }
            X.23S r1 = new X.23S     // Catch:{ all -> 0x193a }
            r1.<init>(r0)     // Catch:{ all -> 0x193a }
            goto L_0x186e
        L_0x029a:
            r4 = 256(0x100, float:3.59E-43)
            r0 = r12 & r4
            if (r0 != r4) goto L_0x02dc
            X.24n r6 = r8.A0l     // Catch:{ all -> 0x193a }
            if (r6 != 0) goto L_0x02a6
            X.24n r6 = X.C445524n.A0O     // Catch:{ all -> 0x193a }
        L_0x02a6:
            boolean r0 = r6.A0M     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x02b7
            X.1rR r0 = new X.1rR     // Catch:{ all -> 0x193a }
            r8 = r0
            r9 = r6
            r10 = r1
            r11 = r2
            r13 = r7
            r14 = r5
            r8.<init>((X.C445524n) r9, (X.C28381Vw) r10, (long) r11, (boolean) r13, (boolean) r14)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x02b7:
            int r4 = r6.A00     // Catch:{ all -> 0x193a }
            r0 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r0
            if (r4 != r0) goto L_0x02cf
            boolean r0 = r6.A0N     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x02cf
            X.1rm r0 = new X.1rm     // Catch:{ all -> 0x193a }
            r8 = r0
            r9 = r6
            r10 = r1
            r11 = r2
            r13 = r7
            r14 = r5
            r8.<init>(r9, r10, r11, r13, r14)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x02cf:
            X.1rI r0 = new X.1rI     // Catch:{ all -> 0x193a }
            r8 = r0
            r9 = r6
            r10 = r1
            r11 = r2
            r13 = r7
            r14 = r5
            r8.<init>((X.C445524n) r9, (X.C28381Vw) r10, (long) r11, (boolean) r13, (boolean) r14)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x02dc:
            boolean r0 = r8.A0c()     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x0303
            X.24l r6 = r8.A0C     // Catch:{ all -> 0x193a }
            if (r6 != 0) goto L_0x02e8
            X.24l r6 = X.C445324l.A0L     // Catch:{ all -> 0x193a }
        L_0x02e8:
            java.lang.String r4 = "medianotify"
            r0 = r58
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x02f9
            X.1s5 r0 = new X.1s5     // Catch:{ all -> 0x193a }
            r0.<init>(r6, r1, r2)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x02f9:
            X.1rA r0 = new X.1rA     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A1B(r6, r7, r5)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0303:
            int r0 = r8.A01     // Catch:{ all -> 0x193a }
            r10 = 512(0x200, float:7.175E-43)
            r4 = r0 & r10
            if (r4 != r10) goto L_0x031a
            byte[] r6 = r25.A02()     // Catch:{ all -> 0x193a }
            r7 = 2
            X.1rQ r0 = new X.1rQ     // Catch:{ all -> 0x193a }
            r4 = r0
            r5 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x031a:
            r10 = 4096(0x1000, float:5.74E-42)
            r4 = r12 & r10
            if (r4 != r10) goto L_0x0367
            X.2tl r4 = r8.A09     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x0326
            X.2tl r4 = X.C58602tl.A04     // Catch:{ all -> 0x193a }
        L_0x0326:
            X.1rS r0 = new X.1rS     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            int r2 = r4.A00     // Catch:{ all -> 0x193a }
            r3 = 1
            r2 = r2 & 1
            if (r2 != r3) goto L_0x0336
            java.lang.String r2 = r4.A03     // Catch:{ all -> 0x193a }
            r0.A00 = r2     // Catch:{ all -> 0x193a }
        L_0x0336:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x193a }
            r6.<init>()     // Catch:{ all -> 0x193a }
            X.1XE r2 = r4.A01     // Catch:{ all -> 0x193a }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x193a }
        L_0x0341:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x0362
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x193a }
            X.2tk r4 = (X.C58592tk) r4     // Catch:{ all -> 0x193a }
            int r2 = r4.A00     // Catch:{ all -> 0x193a }
            r3 = 2
            r2 = r2 & 2
            if (r2 != r3) goto L_0x0341
            int r3 = r6.size()     // Catch:{ all -> 0x193a }
            r2 = 257(0x101, float:3.6E-43)
            if (r3 >= r2) goto L_0x0362
            java.lang.String r2 = r4.A03     // Catch:{ all -> 0x193a }
            r6.add(r2)     // Catch:{ all -> 0x193a }
            goto L_0x0341
        L_0x0362:
            r0.A13(r6)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0367:
            r10 = 2048(0x800, float:2.87E-42)
            r4 = r12 & r10
            r15 = 0
            if (r4 != r10) goto L_0x036f
            r15 = 1
        L_0x036f:
            r10 = 0
            r49 = r93
            r45 = r89
            r44 = r88
            r21 = r75
            r4 = r77
            r22 = r73
            r19 = r74
            r36 = r80
            r20 = r87
            if (r15 == 0) goto L_0x08b1
            X.2eo r6 = r8.A0b     // Catch:{ all -> 0x193a }
            if (r6 != 0) goto L_0x038a
            X.2eo r6 = X.C53002eo.A0F     // Catch:{ all -> 0x193a }
        L_0x038a:
            int r0 = r6.A00     // Catch:{ all -> 0x193a }
            r7 = 2
            r0 = r0 & 2
            if (r0 != r7) goto L_0x08a4
            int r0 = r6.A02     // Catch:{ all -> 0x193a }
            X.43A r8 = X.AnonymousClass43A.A00(r0)     // Catch:{ all -> 0x193a }
            if (r8 != 0) goto L_0x039b
            X.43A r8 = X.AnonymousClass43A.A0C     // Catch:{ all -> 0x193a }
        L_0x039b:
            X.43A r0 = X.AnonymousClass43A.A0C     // Catch:{ all -> 0x193a }
            if (r8 != r0) goto L_0x040a
            r4 = 8
            r0 = r17
            if (r0 != r4) goto L_0x03f9
            X.1iF r0 = r6.A0E     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x03ab
            X.1iF r0 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x03ab:
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x193a }
            X.0rv r0 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x193a }
            X.0rv r7 = r1.A00     // Catch:{ all -> 0x193a }
            boolean r0 = X.C34901l3.A00(r7, r0)     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x03ed
            X.1iF r0 = r6.A0E     // Catch:{ all -> 0x193a }
            r4 = r0
            if (r0 != 0) goto L_0x03c0
            X.1iF r0 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x03c0:
            boolean r0 = r0.A04     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x03ed
            if (r4 != 0) goto L_0x03c8
            X.1iF r4 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x03c8:
            java.lang.String r0 = r4.A02     // Catch:{ all -> 0x193a }
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ all -> 0x193a }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x193a }
            r0 = r64
            boolean r5 = r0.A0I(r4)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x193a }
            X.1Vw r4 = new X.1Vw     // Catch:{ all -> 0x193a }
            r4.<init>(r7, r0, r5)     // Catch:{ all -> 0x193a }
            X.1s1 r0 = new X.1s1     // Catch:{ all -> 0x193a }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x193a }
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.of(r9)     // Catch:{ all -> 0x193a }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x193a }
            r0.A00 = r2     // Catch:{ all -> 0x193a }
            goto L_0x03fe
        L_0x03ed:
            r0 = 27
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x193a }
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x03f9:
            X.1rT r0 = new X.1rT     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
        L_0x03fe:
            X.1iF r2 = r6.A0E     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x0404
            X.1iF r2 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x0404:
            java.lang.String r2 = r2.A01     // Catch:{ all -> 0x193a }
            r0.A01 = r2     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x040a:
            X.43A r0 = X.AnonymousClass43A.A04     // Catch:{ all -> 0x193a }
            if (r8 != r0) goto L_0x0419
            int r4 = r6.A01     // Catch:{ all -> 0x193a }
            X.1ri r0 = new X.1ri     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A00 = r4     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0419:
            X.43A r0 = X.AnonymousClass43A.A05     // Catch:{ all -> 0x193a }
            if (r8 != r0) goto L_0x0430
            int r7 = r6.A01     // Catch:{ all -> 0x193a }
            long r4 = r6.A03     // Catch:{ all -> 0x193a }
            r0 = 1
            X.C18450wi.A0H(r1, r0)     // Catch:{ all -> 0x193a }
            X.1s8 r0 = new X.1s8     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A00 = r7     // Catch:{ all -> 0x193a }
            r0.A01 = r4     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0430:
            X.43A r0 = X.AnonymousClass43A.A03     // Catch:{ all -> 0x193a }
            if (r8 != r0) goto L_0x0443
            X.1pP r4 = r6.A08     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x043a
            X.1pP r4 = X.C37591pP.A01     // Catch:{ all -> 0x193a }
        L_0x043a:
            X.1pN r0 = new X.1pN     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A00 = r4     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0443:
            X.43A r0 = X.AnonymousClass43A.A02     // Catch:{ all -> 0x193a }
            if (r8 != r0) goto L_0x048e
            X.2sz r4 = r6.A07     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x044d
            X.2sz r4 = X.AnonymousClass2sz.A01     // Catch:{ all -> 0x193a }
        L_0x044d:
            X.1pQ r0 = new X.1pQ     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            X.1XE r2 = r4.A00     // Catch:{ all -> 0x193a }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x193a }
        L_0x0458:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x17ca
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x193a }
            X.1pR r4 = (X.C37611pR) r4     // Catch:{ all -> 0x193a }
            int r2 = r4.A00     // Catch:{ all -> 0x193a }
            r3 = 1
            r2 = r2 & 1
            if (r2 != r3) goto L_0x047c
            X.1Ww r2 = r4.A01     // Catch:{ all -> 0x193a }
            byte[] r2 = r2.A04()     // Catch:{ all -> 0x193a }
            X.1WK r3 = new X.1WK     // Catch:{ all -> 0x193a }
            r3.<init>(r2)     // Catch:{ all -> 0x193a }
            java.util.Set r2 = r0.A00     // Catch:{ all -> 0x193a }
            r2.add(r3)     // Catch:{ all -> 0x193a }
            goto L_0x0458
        L_0x047c:
            java.lang.String r3 = "FMessageAppStateSyncKeyRequest message missing fields for keyId: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r2.<init>(r3)     // Catch:{ all -> 0x193a }
            r2.append(r4)     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x193a }
            goto L_0x0458
        L_0x048e:
            X.43A r0 = X.AnonymousClass43A.A01     // Catch:{ all -> 0x193a }
            if (r8 != r0) goto L_0x04b0
            X.2tO r5 = r6.A06     // Catch:{ all -> 0x193a }
            if (r5 != 0) goto L_0x0498
            X.2tO r5 = X.C58372tO.A03     // Catch:{ all -> 0x193a }
        L_0x0498:
            X.1XE r4 = r5.A02     // Catch:{ all -> 0x193a }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x193a }
            r0.<init>(r4)     // Catch:{ all -> 0x193a }
            java.util.Set r8 = java.util.Collections.unmodifiableSet(r0)     // Catch:{ all -> 0x193a }
            long r4 = r5.A01     // Catch:{ all -> 0x193a }
            X.1pS r0 = new X.1pS     // Catch:{ all -> 0x193a }
            r6 = r0
            r7 = r1
            r9 = r2
            r11 = r4
            r6.<init>(r7, r8, r9, r11)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x04b0:
            X.43A r0 = X.AnonymousClass43A.A06     // Catch:{ all -> 0x193a }
            if (r8 != r0) goto L_0x0642
            X.2uN r5 = r6.A09     // Catch:{ all -> 0x193a }
            if (r5 != 0) goto L_0x04ba
            X.2uN r5 = X.C58922uN.A0B     // Catch:{ all -> 0x193a }
        L_0x04ba:
            X.1bM r0 = new X.1bM     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            int r2 = r5.A00     // Catch:{ all -> 0x193a }
            r3 = 4
            r2 = r2 & 4
            if (r2 != r3) goto L_0x0625
            X.1Ww r2 = r5.A08     // Catch:{ all -> 0x193a }
            byte[] r2 = r2.A04()     // Catch:{ all -> 0x193a }
            r0.A0H = r2     // Catch:{ all -> 0x193a }
            int r6 = r5.A00     // Catch:{ all -> 0x193a }
            r2 = r6 & 2
            if (r2 != r7) goto L_0x0608
            long r2 = r5.A04     // Catch:{ all -> 0x193a }
            r7 = 0
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0608
            r0.A05 = r2     // Catch:{ all -> 0x193a }
            r4 = 16
            r3 = r6 & 16
            r2 = 0
            if (r3 != r4) goto L_0x04e6
            r2 = 1
        L_0x04e6:
            r8 = 26
            if (r2 == 0) goto L_0x05ed
            java.lang.String r2 = r5.A09     // Catch:{ all -> 0x193a }
            r0.A0B = r2     // Catch:{ all -> 0x193a }
            r3 = 8
            r2 = r6 & 8
            if (r2 != r3) goto L_0x05d2
            r3 = 1
            r2 = r6 & 1
            if (r2 != r3) goto L_0x05d2
            X.1Ww r2 = r5.A07     // Catch:{ all -> 0x193a }
            byte[] r7 = r2.A04()     // Catch:{ all -> 0x193a }
            X.1Ww r2 = r5.A06     // Catch:{ all -> 0x193a }
            byte[] r4 = r2.A04()     // Catch:{ all -> 0x193a }
            int r2 = r7.length     // Catch:{ all -> 0x193a }
            r6 = 32
            if (r2 != r6) goto L_0x05b5
            int r2 = r4.length     // Catch:{ all -> 0x193a }
            if (r2 != r6) goto L_0x05b5
            r3 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r7, r3)     // Catch:{ all -> 0x193a }
            r0.A0D = r2     // Catch:{ all -> 0x193a }
            java.lang.String r2 = android.util.Base64.encodeToString(r4, r3)     // Catch:{ all -> 0x193a }
            r0.A0C = r2     // Catch:{ all -> 0x193a }
            int r4 = r5.A00     // Catch:{ all -> 0x193a }
            r2 = r4 & 32
            if (r2 != r6) goto L_0x059a
            int r2 = r5.A03     // Catch:{ all -> 0x193a }
            X.436 r3 = X.AnonymousClass436.A00(r2)     // Catch:{ all -> 0x193a }
            if (r3 != 0) goto L_0x052a
            X.436 r3 = X.AnonymousClass436.A02     // Catch:{ all -> 0x193a }
        L_0x052a:
            int r2 = r3.ordinal()     // Catch:{ all -> 0x193a }
            switch(r2) {
                case 0: goto L_0x0552;
                case 1: goto L_0x0550;
                case 2: goto L_0x054c;
                case 3: goto L_0x054e;
                case 4: goto L_0x054a;
                case 5: goto L_0x0554;
                default: goto L_0x0531;
            }     // Catch:{ all -> 0x193a }
        L_0x0531:
            java.lang.String r0 = "Unexpected type ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r1.<init>(r0)     // Catch:{ all -> 0x193a }
            r1.append(r3)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ all -> 0x193a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x193a }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x193a }
            r0.<init>(r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x054a:
            r2 = 4
            goto L_0x0555
        L_0x054c:
            r2 = 3
            goto L_0x0555
        L_0x054e:
            r2 = 2
            goto L_0x0555
        L_0x0550:
            r2 = 1
            goto L_0x0555
        L_0x0552:
            r2 = 0
            goto L_0x0555
        L_0x0554:
            r2 = 5
        L_0x0555:
            r0.A03 = r2     // Catch:{ all -> 0x193a }
            r3 = 64
            r2 = r4 & 64
            if (r2 != r3) goto L_0x0561
            int r2 = r5.A01     // Catch:{ all -> 0x193a }
            r0.A00 = r2     // Catch:{ all -> 0x193a }
        L_0x0561:
            r2 = 128(0x80, float:1.794E-43)
            r4 = r4 & r2
            if (r4 != r2) goto L_0x0567
            goto L_0x0579
        L_0x0567:
            java.lang.String r3 = "FMessageHistorySyncNotification/ message without original msg idmessage.key="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r2.<init>(r3)     // Catch:{ all -> 0x193a }
            r2.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x193a }
            goto L_0x057d
        L_0x0579:
            java.lang.String r2 = r5.A0A     // Catch:{ all -> 0x193a }
            r0.A0E = r2     // Catch:{ all -> 0x193a }
        L_0x057d:
            int r4 = r5.A00     // Catch:{ all -> 0x193a }
            r3 = 256(0x100, float:3.59E-43)
            r2 = r4 & r3
            if (r2 != r3) goto L_0x0589
            int r2 = r5.A02     // Catch:{ all -> 0x193a }
            r0.A01 = r2     // Catch:{ all -> 0x193a }
        L_0x0589:
            r2 = 512(0x200, float:7.175E-43)
            r4 = r4 & r2
            if (r4 != r2) goto L_0x17ca
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x193a }
            long r2 = r5.A05     // Catch:{ all -> 0x193a }
            long r2 = r4.toMillis(r2)     // Catch:{ all -> 0x193a }
            r0.A0A = r2     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x059a:
            java.lang.String r2 = "FMessageHistorySyncNotification/ message without sync typemessage.key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r0.<init>(r2)     // Catch:{ all -> 0x193a }
            r0.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x193a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x193a }
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x05b5:
            java.lang.String r2 = "FMessageHistorySyncNotification/ message with invalid sha-256 hash message.key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r0.<init>(r2)     // Catch:{ all -> 0x193a }
            r0.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x193a }
            r0 = 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x193a }
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x05d2:
            java.lang.String r2 = "FMessageHistorySyncNotification/ message with missing file hash info message.key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r0.<init>(r2)     // Catch:{ all -> 0x193a }
            r0.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x193a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x193a }
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x05ed:
            java.lang.String r2 = "FMessageHistorySyncNotification/ message with missing direct path message.key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r0.<init>(r2)     // Catch:{ all -> 0x193a }
            r0.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x193a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x193a }
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x0608:
            java.lang.String r2 = "FMessageHistorySyncNotification/ message with invalid file length message.key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r0.<init>(r2)     // Catch:{ all -> 0x193a }
            r0.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x193a }
            r0 = 13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x193a }
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x0625:
            java.lang.String r2 = "FMessageHistorySyncNotification/ message with invalid media key message.key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r0.<init>(r2)     // Catch:{ all -> 0x193a }
            r0.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x193a }
            r0 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x193a }
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x0642:
            X.43A r0 = X.AnonymousClass43A.A07     // Catch:{ all -> 0x193a }
            if (r8 != r0) goto L_0x0657
            X.2t6 r0 = r6.A0A     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x064c
            X.2t6 r0 = X.C58192t6.A02     // Catch:{ all -> 0x193a }
        L_0x064c:
            boolean r4 = r0.A01     // Catch:{ all -> 0x193a }
            X.1pM r0 = new X.1pM     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A00 = r4     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0657:
            r7 = -1
            X.43A r0 = X.AnonymousClass43A.A0A     // Catch:{ all -> 0x193a }
            if (r8 != r0) goto L_0x070a
            X.2tu r4 = r6.A0B     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x0662
            X.2tu r4 = X.C58692tu.A04     // Catch:{ all -> 0x193a }
        L_0x0662:
            int r0 = r4.A00     // Catch:{ all -> 0x193a }
            r5 = 1
            r0 = r0 & 1
            if (r0 != r5) goto L_0x067f
            int r0 = r4.A01     // Catch:{ all -> 0x193a }
            X.42z r0 = X.C802142z.A00(r0)     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x0673
            X.42z r0 = X.C802142z.A03     // Catch:{ all -> 0x193a }
        L_0x0673:
            int r0 = r0.value     // Catch:{ all -> 0x193a }
            r7 = 0
            if (r0 == 0) goto L_0x067f
            r7 = 1
            if (r0 == r5) goto L_0x067f
            r7 = 2
            if (r0 == r7) goto L_0x067f
            r7 = -1
        L_0x067f:
            X.1pD r0 = new X.1pD     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A00 = r7     // Catch:{ all -> 0x193a }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x193a }
            r2.<init>()     // Catch:{ all -> 0x193a }
            r0.A01 = r2     // Catch:{ all -> 0x193a }
            r2 = 26
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x193a }
            if (r7 != 0) goto L_0x06ce
            X.1XE r2 = r4.A02     // Catch:{ all -> 0x193a }
            int r2 = r2.size()     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x06c6
            X.1XE r2 = r4.A02     // Catch:{ all -> 0x193a }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ all -> 0x193a }
        L_0x06a3:
            boolean r2 = r6.hasNext()     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x17ca
            java.lang.Object r4 = r6.next()     // Catch:{ all -> 0x193a }
            X.2tC r4 = (X.C58252tC) r4     // Catch:{ all -> 0x193a }
            int r2 = r4.A00     // Catch:{ all -> 0x193a }
            r3 = 1
            r2 = r2 & 1
            if (r2 != r3) goto L_0x06be
            java.util.Set r3 = r0.A01     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r4.A01     // Catch:{ all -> 0x193a }
            r3.add(r2)     // Catch:{ all -> 0x193a }
            goto L_0x06a3
        L_0x06be:
            java.lang.String r1 = "missing sticker fileHash"
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x06c6:
            java.lang.String r1 = "missing sticker request msg"
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x06ce:
            r2 = 2
            if (r7 != r2) goto L_0x17ca
            X.1XE r2 = r4.A03     // Catch:{ all -> 0x193a }
            int r2 = r2.size()     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x0702
            X.1XE r2 = r4.A03     // Catch:{ all -> 0x193a }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ all -> 0x193a }
        L_0x06df:
            boolean r2 = r6.hasNext()     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x17ca
            java.lang.Object r4 = r6.next()     // Catch:{ all -> 0x193a }
            X.2tD r4 = (X.C58262tD) r4     // Catch:{ all -> 0x193a }
            int r2 = r4.A00     // Catch:{ all -> 0x193a }
            r3 = 1
            r2 = r2 & 1
            if (r2 != r3) goto L_0x06fa
            java.util.Set r3 = r0.A01     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r4.A01     // Catch:{ all -> 0x193a }
            r3.add(r2)     // Catch:{ all -> 0x193a }
            goto L_0x06df
        L_0x06fa:
            java.lang.String r1 = "missing link preview url"
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x0702:
            java.lang.String r1 = "missing url request msg"
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x070a:
            X.43A r0 = X.AnonymousClass43A.A0B     // Catch:{ all -> 0x193a }
            if (r8 != r0) goto L_0x0833
            X.2tw r5 = r6.A0C     // Catch:{ all -> 0x193a }
            if (r5 != 0) goto L_0x0714
            X.2tw r5 = X.C58712tw.A04     // Catch:{ all -> 0x193a }
        L_0x0714:
            int r6 = r5.A00     // Catch:{ all -> 0x193a }
            r4 = 1
            r0 = r6 & 1
            if (r0 != r4) goto L_0x0731
            int r0 = r5.A01     // Catch:{ all -> 0x193a }
            X.42z r0 = X.C802142z.A00(r0)     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x0725
            X.42z r0 = X.C802142z.A03     // Catch:{ all -> 0x193a }
        L_0x0725:
            int r0 = r0.value     // Catch:{ all -> 0x193a }
            r7 = 0
            if (r0 == 0) goto L_0x0731
            r7 = 1
            if (r0 == r4) goto L_0x0731
            r7 = 2
            if (r0 == r7) goto L_0x0731
            r7 = -1
        L_0x0731:
            r4 = 2
            r0 = r6 & 2
            if (r0 != r4) goto L_0x0738
            java.lang.String r10 = r5.A03     // Catch:{ all -> 0x193a }
        L_0x0738:
            if (r7 != 0) goto L_0x07b7
            X.1pF r0 = new X.1pF     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r10, r2)     // Catch:{ all -> 0x193a }
            X.1XE r4 = r5.A02     // Catch:{ all -> 0x193a }
            boolean r3 = r4.isEmpty()     // Catch:{ all -> 0x193a }
            r2 = 26
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x193a }
            if (r3 != 0) goto L_0x07af
            java.util.Iterator r9 = r4.iterator()     // Catch:{ all -> 0x193a }
        L_0x0751:
            boolean r2 = r9.hasNext()     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x17ca
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x193a }
            X.2tv r8 = (X.C58702tv) r8     // Catch:{ all -> 0x193a }
            int r4 = r8.A00     // Catch:{ all -> 0x193a }
            r3 = 1
            r2 = r4 & 1
            if (r2 != r3) goto L_0x07a7
            r3 = 2
            r2 = r4 & 2
            if (r2 != r3) goto L_0x079f
            X.1pI r2 = r8.A03     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x076f
            X.1pI r2 = X.C37521pI.A0I     // Catch:{ all -> 0x193a }
        L_0x076f:
            X.1Ww r2 = r2.A08     // Catch:{ all -> 0x193a }
            byte[] r3 = r2.A04()     // Catch:{ all -> 0x193a }
            r2 = 2
            java.lang.String r7 = android.util.Base64.encodeToString(r3, r2)     // Catch:{ all -> 0x193a }
            int r2 = r8.A01     // Catch:{ all -> 0x193a }
            X.1pH r6 = X.C37511pH.A00(r2)     // Catch:{ all -> 0x193a }
            if (r6 != 0) goto L_0x0784
            X.1pH r6 = X.C37511pH.A02     // Catch:{ all -> 0x193a }
        L_0x0784:
            X.1pH r3 = X.C37511pH.A04     // Catch:{ all -> 0x193a }
            r2 = 0
            if (r6 != r3) goto L_0x078a
            r2 = 1
        L_0x078a:
            java.util.Map r4 = r0.A00     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x079d
            X.1pI r3 = r8.A03     // Catch:{ all -> 0x193a }
            if (r3 != 0) goto L_0x0794
            X.1pI r3 = X.C37521pI.A0I     // Catch:{ all -> 0x193a }
        L_0x0794:
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x193a }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x193a }
            r4.put(r7, r2)     // Catch:{ all -> 0x193a }
            goto L_0x0751
        L_0x079d:
            r3 = 0
            goto L_0x0794
        L_0x079f:
            java.lang.String r1 = "missing sticker response msg"
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x07a7:
            java.lang.String r1 = "missing sticker result"
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x07af:
            java.lang.String r1 = "empty sticker result list"
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x07b7:
            if (r7 != r4) goto L_0x082c
            X.1pK r0 = new X.1pK     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r10, r2)     // Catch:{ all -> 0x193a }
            X.1XE r4 = r5.A02     // Catch:{ all -> 0x193a }
            boolean r3 = r4.isEmpty()     // Catch:{ all -> 0x193a }
            r2 = 26
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x193a }
            if (r3 != 0) goto L_0x0824
            java.util.Iterator r9 = r4.iterator()     // Catch:{ all -> 0x193a }
        L_0x07d0:
            boolean r2 = r9.hasNext()     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x17ca
            java.lang.Object r6 = r9.next()     // Catch:{ all -> 0x193a }
            X.2tv r6 = (X.C58702tv) r6     // Catch:{ all -> 0x193a }
            int r4 = r6.A00     // Catch:{ all -> 0x193a }
            r3 = 1
            r2 = r4 & 1
            if (r2 != r3) goto L_0x081c
            r3 = 4
            r2 = r4 & 4
            if (r2 != r3) goto L_0x0814
            X.1pL r2 = r6.A02     // Catch:{ all -> 0x193a }
            r8 = r2
            if (r2 != 0) goto L_0x07ef
            X.1pL r2 = X.C37551pL.A08     // Catch:{ all -> 0x193a }
        L_0x07ef:
            java.lang.String r7 = r2.A07     // Catch:{ all -> 0x193a }
            int r2 = r6.A01     // Catch:{ all -> 0x193a }
            X.1pH r6 = X.C37511pH.A00(r2)     // Catch:{ all -> 0x193a }
            if (r6 != 0) goto L_0x07fb
            X.1pH r6 = X.C37511pH.A02     // Catch:{ all -> 0x193a }
        L_0x07fb:
            X.1pH r3 = X.C37511pH.A04     // Catch:{ all -> 0x193a }
            r2 = 0
            if (r6 != r3) goto L_0x0801
            r2 = 1
        L_0x0801:
            java.util.Map r4 = r0.A00     // Catch:{ all -> 0x193a }
            r3 = 0
            if (r2 == 0) goto L_0x080b
            r3 = r8
            if (r8 != 0) goto L_0x080b
            X.1pL r3 = X.C37551pL.A08     // Catch:{ all -> 0x193a }
        L_0x080b:
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x193a }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x193a }
            r4.put(r7, r2)     // Catch:{ all -> 0x193a }
            goto L_0x07d0
        L_0x0814:
            java.lang.String r1 = "missing url response msg"
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x081c:
            java.lang.String r1 = "missing url result"
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x0824:
            java.lang.String r1 = "empty url result list"
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x082c:
            X.1pJ r0 = new X.1pJ     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r10, r2)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0833:
            X.43A r0 = X.AnonymousClass43A.A0D     // Catch:{ all -> 0x193a }
            if (r8 != r0) goto L_0x083e
            X.1s7 r0 = new X.1s7     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x083e:
            X.43A r0 = X.AnonymousClass43A.A08     // Catch:{ all -> 0x193a }
            if (r8 != r0) goto L_0x08a4
            X.1iD r7 = r6.A0D     // Catch:{ all -> 0x193a }
            if (r7 != 0) goto L_0x0848
            X.1iD r7 = X.C33211iD.A0o     // Catch:{ all -> 0x193a }
        L_0x0848:
            r0 = r61
            X.21S r39 = A01(r0, r7)     // Catch:{ all -> 0x193a }
            r25 = r63
            r29 = r22
            r30 = r19
            r31 = r21
            r32 = r62
            r33 = r4
            r34 = r0
            r35 = r9
            r38 = r60
            r40 = r7
            r41 = r1
            r42 = r59
            r43 = r20
            r46 = r58
            r47 = r57
            r48 = r14
            r50 = r13
            r51 = r17
            r52 = r2
            r56 = r5
            r21 = r65
            r22 = r64
            X.0tZ r0 = A04(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r54, r55, r56)     // Catch:{ all -> 0x193a }
            r2 = 131072(0x20000, float:1.83671E-40)
            r0.A0S(r2)     // Catch:{ all -> 0x193a }
            X.1Vw r2 = r0.A11     // Catch:{ all -> 0x193a }
            X.0rv r4 = r2.A00     // Catch:{ all -> 0x193a }
            boolean r3 = r2.A02     // Catch:{ all -> 0x193a }
            X.1iF r2 = r6.A0E     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x088f
            X.1iF r2 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x088f:
            java.lang.String r2 = r2.A01     // Catch:{ all -> 0x193a }
            X.1Vw r7 = new X.1Vw     // Catch:{ all -> 0x193a }
            r7.<init>(r4, r2, r3)     // Catch:{ all -> 0x193a }
            long r8 = r0.A0I     // Catch:{ all -> 0x193a }
            long r10 = r6.A04     // Catch:{ all -> 0x193a }
            X.1sC r6 = new X.1sC     // Catch:{ all -> 0x193a }
            r6.<init>(r7, r8, r10)     // Catch:{ all -> 0x193a }
            r0.A0g(r6)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x08a4:
            r0 = 22
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x193a }
            X.23S r1 = new X.23S     // Catch:{ all -> 0x193a }
            r1.<init>(r0)     // Catch:{ all -> 0x193a }
            goto L_0x186e
        L_0x08b1:
            r14 = 262144(0x40000, float:3.67342E-40)
            r13 = r12 & r14
            if (r13 != r14) goto L_0x08ce
            X.2t4 r0 = r8.A0A     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x08bd
            X.2t4 r0 = X.C58172t4.A02     // Catch:{ all -> 0x193a }
        L_0x08bd:
            X.1iF r0 = r0.A01     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x08c3
            X.1iF r0 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x08c3:
            java.lang.String r4 = r0.A01     // Catch:{ all -> 0x193a }
            X.1rX r0 = new X.1rX     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A00 = r4     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x08ce:
            r14 = 524288(0x80000, float:7.34684E-40)
            r13 = r12 & r14
            if (r13 != r14) goto L_0x08eb
            X.2t3 r0 = r8.A06     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x08da
            X.2t3 r0 = X.C58162t3.A02     // Catch:{ all -> 0x193a }
        L_0x08da:
            X.1iF r0 = r0.A01     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x08e0
            X.1iF r0 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x08e0:
            java.lang.String r4 = r0.A01     // Catch:{ all -> 0x193a }
            X.1rZ r0 = new X.1rZ     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A00 = r4     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x08eb:
            r14 = 2097152(0x200000, float:2.938736E-39)
            r13 = r12 & r14
            if (r13 != r14) goto L_0x0903
            X.1pI r4 = r8.A0i     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x08f7
            X.1pI r4 = X.C37521pI.A0I     // Catch:{ all -> 0x193a }
        L_0x08f7:
            X.1rB r0 = new X.1rB     // Catch:{ all -> 0x193a }
            r8 = r0
            r9 = r4
            r10 = r1
            r11 = r2
            r13 = r7
            r8.<init>(r9, r10, r11, r13)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0903:
            r14 = 32768(0x8000, float:4.5918E-41)
            r13 = r12 & r14
            r18 = 0
            if (r13 != r14) goto L_0x090e
            r18 = 1
        L_0x090e:
            java.lang.String r15 = "UNSET"
            if (r18 == 0) goto L_0x0988
            X.2ty r6 = r8.A0f     // Catch:{ all -> 0x193a }
            if (r6 != 0) goto L_0x0918
            X.2ty r6 = X.C58732ty.A04     // Catch:{ all -> 0x193a }
        L_0x0918:
            int r0 = r6.A00     // Catch:{ all -> 0x193a }
            r8 = 1
            r0 = r0 & 1
            if (r0 != r8) goto L_0x097f
            X.1iD r0 = r6.A01     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x0925
            X.1iD r0 = X.C33211iD.A0o     // Catch:{ all -> 0x193a }
        L_0x0925:
            r29 = r61
            r30 = r25
            r31 = r0
            r32 = r1
            r33 = r2
            r35 = r7
            X.0tZ r0 = A07(r29, r30, r31, r32, r33, r35)     // Catch:{ all -> 0x193a }
            X.1Vt r7 = r0.A0L     // Catch:{ all -> 0x193a }
            if (r7 != 0) goto L_0x0947
            if (r100 == 0) goto L_0x093f
            r0.A0n = r15     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x093f:
            long r2 = r0.A0I     // Catch:{ all -> 0x193a }
            X.1Vt r7 = X.AnonymousClass1W1.A00(r2)     // Catch:{ all -> 0x193a }
            r0.A0L = r7     // Catch:{ all -> 0x193a }
        L_0x0947:
            int r5 = r6.A00     // Catch:{ all -> 0x193a }
            r3 = 2
            r2 = r5 & 2
            if (r2 != r3) goto L_0x095c
            X.1iF r2 = r6.A03     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x0954
            X.1iF r2 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x0954:
            java.lang.String r2 = r2.A01     // Catch:{ all -> 0x193a }
            r7.A0M = r2     // Catch:{ all -> 0x193a }
            if (r77 == 0) goto L_0x095c
            r4.A0M = r2     // Catch:{ all -> 0x193a }
        L_0x095c:
            r3 = 4
            r2 = r5 & 4
            if (r2 != r3) goto L_0x17ca
            X.2uO r5 = r6.A02     // Catch:{ all -> 0x193a }
            if (r5 != 0) goto L_0x0967
            X.2uO r5 = X.C58932uO.A0B     // Catch:{ all -> 0x193a }
        L_0x0967:
            r3 = 1084(0x43c, float:1.519E-42)
            r2 = r61
            boolean r2 = r2.A0E(r11, r3)     // Catch:{ all -> 0x193a }
            X.1lo r3 = X.C35361lo.A00(r5, r2)     // Catch:{ all -> 0x193a }
            X.1Vt r2 = r0.A0L     // Catch:{ all -> 0x193a }
            r2.A05(r3)     // Catch:{ all -> 0x193a }
            if (r77 == 0) goto L_0x17ca
            r4.A05(r3)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x097f:
            r4 = 0
            r0 = r59
            X.0tZ r0 = r0.A01(r1, r4, r2)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0988:
            r14 = 131072(0x20000, float:1.83671E-40)
            r13 = r12 & r14
            if (r13 != r14) goto L_0x0b30
            X.2uI r5 = r8.A0d     // Catch:{ all -> 0x193a }
            if (r5 != 0) goto L_0x0994
            X.2uI r5 = X.C58872uI.A08     // Catch:{ all -> 0x193a }
        L_0x0994:
            int r0 = r5.A00     // Catch:{ all -> 0x193a }
            r8 = 1
            r0 = r0 & 1
            if (r0 != r8) goto L_0x0b27
            X.1iD r0 = r5.A03     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x09a1
            X.1iD r0 = X.C33211iD.A0o     // Catch:{ all -> 0x193a }
        L_0x09a1:
            r29 = r61
            r30 = r25
            r31 = r0
            r32 = r1
            r33 = r2
            r35 = r7
            X.0tZ r0 = A07(r29, r30, r31, r32, r33, r35)     // Catch:{ all -> 0x193a }
            java.lang.String r3 = r5.A06     // Catch:{ all -> 0x193a }
            r2 = r62
            X.1Vz r12 = r2.A01(r3)     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r5.A07     // Catch:{ all -> 0x193a }
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.getNullable(r2)     // Catch:{ all -> 0x193a }
            long r7 = r5.A01     // Catch:{ all -> 0x193a }
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ all -> 0x193a }
            r3.<init>(r7)     // Catch:{ all -> 0x193a }
            r7 = -3
            java.math.BigDecimal r8 = r3.scaleByPowerOfTen(r7)     // Catch:{ all -> 0x193a }
            r3 = r12
            X.1m1 r3 = (X.C35491m1) r3     // Catch:{ all -> 0x193a }
            int r7 = r3.A01     // Catch:{ all -> 0x193a }
            X.1Vy r18 = new X.1Vy     // Catch:{ all -> 0x193a }
            r3 = r18
            r3.<init>(r8, r7)     // Catch:{ all -> 0x193a }
            if (r77 == 0) goto L_0x09da
            goto L_0x09dc
        L_0x09da:
            r14 = r15
            goto L_0x09de
        L_0x09dc:
            java.lang.String r14 = r4.A0G     // Catch:{ all -> 0x193a }
        L_0x09de:
            X.1Vw r3 = r0.A11     // Catch:{ all -> 0x193a }
            X.0rv r3 = r3.A00     // Catch:{ all -> 0x193a }
            boolean r13 = X.C16030sJ.A0L(r3)     // Catch:{ all -> 0x193a }
            if (r13 != 0) goto L_0x09e9
            r9 = r3
        L_0x09e9:
            com.whatsapp.jid.UserJid r41 = com.whatsapp.jid.UserJid.of(r9)     // Catch:{ all -> 0x193a }
            if (r77 == 0) goto L_0x09f2
            int r3 = r4.A01     // Catch:{ all -> 0x193a }
            goto L_0x09f3
        L_0x09f2:
            r3 = 0
        L_0x09f3:
            if (r41 == 0) goto L_0x0a6c
            if (r77 == 0) goto L_0x0a3c
            int r8 = r4.A03     // Catch:{ all -> 0x193a }
            r7 = 5
            if (r8 != r7) goto L_0x0a3c
            if (r13 != 0) goto L_0x0a0c
            r64.A0B()     // Catch:{ all -> 0x193a }
            r2 = r64
            X.1Zb r2 = r2.A01     // Catch:{ all -> 0x193a }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x193a }
            X.0rv r2 = r2.A0E     // Catch:{ all -> 0x193a }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x193a }
        L_0x0a0c:
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x193a }
            java.lang.String r14 = r5.A06     // Catch:{ all -> 0x193a }
            long r6 = r0.A0I     // Catch:{ all -> 0x193a }
            java.lang.String r13 = r4.A0G     // Catch:{ all -> 0x193a }
            int r9 = r4.A04     // Catch:{ all -> 0x193a }
            byte[] r8 = r4.A0R     // Catch:{ all -> 0x193a }
            int r3 = r4.A01     // Catch:{ all -> 0x193a }
            r45 = 5
            r46 = 0
            r49 = 0
            r38 = r12
            r39 = r18
            r40 = r2
            r42 = r14
            r43 = r10
            r44 = r13
            r47 = r9
            r48 = r3
            r50 = r6
            X.1Vt r2 = X.AnonymousClass1W1.A01(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)     // Catch:{ all -> 0x193a }
            r2.A0R = r8     // Catch:{ all -> 0x193a }
            r0.A0L = r2     // Catch:{ all -> 0x193a }
            goto L_0x0a6c
        L_0x0a3c:
            if (r13 == 0) goto L_0x0a94
            r7 = r64
            boolean r7 = r7.A0I(r2)     // Catch:{ all -> 0x193a }
            if (r7 != 0) goto L_0x0aa2
            java.lang.String r8 = r5.A06     // Catch:{ all -> 0x193a }
            long r6 = r0.A0I     // Catch:{ all -> 0x193a }
            int r47 = X.AnonymousClass1W0.A00(r14)     // Catch:{ all -> 0x193a }
            r45 = 30
            r46 = 0
            r49 = 0
            r38 = r12
            r39 = r18
            r40 = r2
            r42 = r8
            r43 = r10
            r44 = r14
            r48 = r3
            r50 = r6
            X.1Vt r2 = X.AnonymousClass1W1.A01(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)     // Catch:{ all -> 0x193a }
            r0.A0L = r2     // Catch:{ all -> 0x193a }
            r0.A0n = r15     // Catch:{ all -> 0x193a }
        L_0x0a6c:
            int r2 = r5.A00     // Catch:{ all -> 0x193a }
            r3 = 64
            r2 = r2 & 64
            if (r2 != r3) goto L_0x0b1c
            X.2uO r5 = r5.A05     // Catch:{ all -> 0x193a }
            if (r5 != 0) goto L_0x0a7a
            X.2uO r5 = X.C58932uO.A0B     // Catch:{ all -> 0x193a }
        L_0x0a7a:
            r3 = 1084(0x43c, float:1.519E-42)
            r2 = r61
            boolean r2 = r2.A0E(r11, r3)     // Catch:{ all -> 0x193a }
            X.1lo r3 = X.C35361lo.A00(r5, r2)     // Catch:{ all -> 0x193a }
            if (r77 == 0) goto L_0x0a8b
            r4.A05(r3)     // Catch:{ all -> 0x193a }
        L_0x0a8b:
            X.1Vt r2 = r0.A0L     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x0b1c
            r2.A05(r3)     // Catch:{ all -> 0x193a }
            goto L_0x0b1c
        L_0x0a94:
            r64.A0B()     // Catch:{ all -> 0x193a }
            r2 = r64
            X.1Zb r2 = r2.A01     // Catch:{ all -> 0x193a }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x193a }
            X.0rv r2 = r2.A0E     // Catch:{ all -> 0x193a }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x193a }
        L_0x0aa2:
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x193a }
            java.lang.String r13 = r5.A06     // Catch:{ all -> 0x193a }
            long r8 = r0.A0I     // Catch:{ all -> 0x193a }
            int r47 = X.AnonymousClass1W0.A00(r14)     // Catch:{ all -> 0x193a }
            r7 = 20
            r46 = 12
            r49 = 0
            r45 = 20
            r38 = r12
            r39 = r18
            r40 = r2
            r42 = r13
            r43 = r10
            r44 = r14
            r48 = r3
            r50 = r8
            X.1Vt r3 = X.AnonymousClass1W1.A01(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)     // Catch:{ all -> 0x193a }
            r0.A0L = r3     // Catch:{ all -> 0x193a }
            if (r77 == 0) goto L_0x0a6c
            int r2 = r4.A03     // Catch:{ all -> 0x193a }
            if (r2 != r7) goto L_0x0a6c
            java.lang.String r2 = r4.A0K     // Catch:{ all -> 0x193a }
            r3.A0K = r2     // Catch:{ all -> 0x193a }
            X.1W2 r2 = r4.A0A     // Catch:{ all -> 0x193a }
            r3.A0A = r2     // Catch:{ all -> 0x193a }
            int r7 = r5.A00     // Catch:{ all -> 0x193a }
            r2 = r7 & 32
            if (r2 != r6) goto L_0x0b07
            X.2tz r6 = r5.A04     // Catch:{ all -> 0x193a }
            if (r6 != 0) goto L_0x0ae5
            X.2tz r6 = X.C58742tz.A04     // Catch:{ all -> 0x193a }
        L_0x0ae5:
            java.lang.String r3 = r6.A03     // Catch:{ all -> 0x193a }
            r2 = r62
            X.1Vz r7 = r2.A01(r3)     // Catch:{ all -> 0x193a }
            long r2 = r6.A02     // Catch:{ all -> 0x193a }
            int r6 = r6.A01     // Catch:{ all -> 0x193a }
            if (r6 > 0) goto L_0x0b01
            r6 = 1
            X.1lv r10 = new X.1lv     // Catch:{ all -> 0x193a }
            r10.<init>(r7, r6, r2)     // Catch:{ all -> 0x193a }
        L_0x0af9:
            X.1Vt r2 = r0.A0L     // Catch:{ all -> 0x193a }
            X.1W2 r2 = r2.A0A     // Catch:{ all -> 0x193a }
            r2.A01 = r10     // Catch:{ all -> 0x193a }
            goto L_0x0a6c
        L_0x0b01:
            X.1lv r10 = new X.1lv     // Catch:{ all -> 0x193a }
            r10.<init>(r7, r6, r2)     // Catch:{ all -> 0x193a }
            goto L_0x0af9
        L_0x0b07:
            r3 = 4
            r2 = r7 & 4
            if (r2 != r3) goto L_0x0b16
            long r2 = r5.A01     // Catch:{ all -> 0x193a }
            r6 = 1000(0x3e8, float:1.401E-42)
            X.1lv r10 = new X.1lv     // Catch:{ all -> 0x193a }
            r10.<init>(r12, r6, r2)     // Catch:{ all -> 0x193a }
            goto L_0x0af9
        L_0x0b16:
            java.lang.String r2 = "PAY: MessageUtils/buildFMessage paymentMoney is NULL."
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x193a }
            goto L_0x0af9
        L_0x0b1c:
            if (r77 == 0) goto L_0x17ca
            X.1Vt r2 = r0.A0L     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x17ca
            r4.A04(r2)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0b27:
            r4 = 0
            r0 = r59
            X.0tZ r0 = r0.A01(r1, r4, r2)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0b30:
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            r4 = r12 & r6
            if (r4 != r6) goto L_0x0bff
            X.2uE r6 = r8.A0a     // Catch:{ all -> 0x193a }
            if (r6 != 0) goto L_0x0b3c
            X.2uE r6 = X.AnonymousClass2uE.A07     // Catch:{ all -> 0x193a }
        L_0x0b3c:
            int r8 = r6.A00     // Catch:{ all -> 0x193a }
            r4 = 1
            r0 = r8 & 1
            if (r0 != r4) goto L_0x0bba
            X.1ra r0 = new X.1ra     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r6.A05     // Catch:{ 1W4 -> 0x0b50 }
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.get(r2)     // Catch:{ 1W4 -> 0x0b50 }
            r0.A01 = r2     // Catch:{ 1W4 -> 0x0b50 }
        L_0x0b50:
            X.2uQ r4 = r6.A03     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x0b56
            X.2uQ r4 = X.C58952uQ.A0C     // Catch:{ all -> 0x193a }
        L_0x0b56:
            java.lang.String r2 = r4.A08     // Catch:{ all -> 0x193a }
            r0.A06 = r2     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r4.A0A     // Catch:{ all -> 0x193a }
            r0.A09 = r2     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r6.A04     // Catch:{ all -> 0x193a }
            r0.A02 = r2     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r6.A06     // Catch:{ all -> 0x193a }
            r0.A05 = r2     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r4.A06     // Catch:{ all -> 0x193a }
            r0.A04 = r2     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r4.A05     // Catch:{ all -> 0x193a }
            r0.A03 = r2     // Catch:{ all -> 0x193a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x0b95
            java.lang.String r2 = r0.A03     // Catch:{ IllegalArgumentException -> 0x0b93 }
            X.1sq r6 = new X.1sq     // Catch:{ IllegalArgumentException -> 0x0b93 }
            r6.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0b93 }
            long r2 = r4.A02     // Catch:{ IllegalArgumentException -> 0x0b93 }
            java.math.BigDecimal r2 = X.C39641sp.A00(r6, r2)     // Catch:{ IllegalArgumentException -> 0x0b93 }
            r0.A0A = r2     // Catch:{ IllegalArgumentException -> 0x0b93 }
            java.lang.String r2 = r0.A03     // Catch:{ IllegalArgumentException -> 0x0b93 }
            X.1sq r6 = new X.1sq     // Catch:{ IllegalArgumentException -> 0x0b93 }
            r6.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0b93 }
            long r2 = r4.A03     // Catch:{ IllegalArgumentException -> 0x0b93 }
            java.math.BigDecimal r2 = X.C39641sp.A00(r6, r2)     // Catch:{ IllegalArgumentException -> 0x0b93 }
            r0.A0B = r2     // Catch:{ IllegalArgumentException -> 0x0b93 }
            goto L_0x0b95
        L_0x0b93:
            r0.A03 = r10     // Catch:{ all -> 0x193a }
        L_0x0b95:
            java.lang.String r2 = r4.A09     // Catch:{ all -> 0x193a }
            r0.A08 = r2     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r4.A0B     // Catch:{ all -> 0x193a }
            r0.A07 = r2     // Catch:{ all -> 0x193a }
            int r2 = r4.A01     // Catch:{ all -> 0x193a }
            r0.A00 = r2     // Catch:{ all -> 0x193a }
            X.24k r2 = r4.A04     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x0ba7
            X.24k r2 = X.C445224k.A0R     // Catch:{ all -> 0x193a }
        L_0x0ba7:
            r0.A1B(r2, r7, r5)     // Catch:{ all -> 0x193a }
            com.whatsapp.jid.UserJid r2 = r0.A01     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x17ca
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x193a }
            X.23S r1 = new X.23S     // Catch:{ all -> 0x193a }
            r1.<init>(r0)     // Catch:{ all -> 0x193a }
            goto L_0x186e
        L_0x0bba:
            r4 = 4
            r0 = r8 & 4
            if (r0 != r4) goto L_0x0bf3
            X.1rj r0 = new X.1rj     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r6.A05     // Catch:{ 1W4 -> 0x0bcc }
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.get(r2)     // Catch:{ 1W4 -> 0x0bcc }
            r0.A00 = r2     // Catch:{ 1W4 -> 0x0bcc }
        L_0x0bcc:
            X.2tx r3 = r6.A02     // Catch:{ all -> 0x193a }
            if (r3 != 0) goto L_0x0bd2
            X.2tx r3 = X.C58722tx.A04     // Catch:{ all -> 0x193a }
        L_0x0bd2:
            java.lang.String r2 = r3.A03     // Catch:{ all -> 0x193a }
            r0.A02 = r2     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r3.A02     // Catch:{ all -> 0x193a }
            r0.A01 = r2     // Catch:{ all -> 0x193a }
            X.24k r2 = r3.A01     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x0be0
            X.24k r2 = X.C445224k.A0R     // Catch:{ all -> 0x193a }
        L_0x0be0:
            r0.A1B(r2, r7, r5)     // Catch:{ all -> 0x193a }
            com.whatsapp.jid.UserJid r2 = r0.A00     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x17ca
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x193a }
            X.23S r1 = new X.23S     // Catch:{ all -> 0x193a }
            r1.<init>(r0)     // Catch:{ all -> 0x193a }
            goto L_0x186e
        L_0x0bf3:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x193a }
            X.23S r1 = new X.23S     // Catch:{ all -> 0x193a }
            r1.<init>(r0)     // Catch:{ all -> 0x193a }
            goto L_0x186e
        L_0x0bff:
            r6 = 4194304(0x400000, float:5.877472E-39)
            r4 = r12 & r6
            if (r4 != r6) goto L_0x0c6a
            X.2uL r6 = r8.A0L     // Catch:{ all -> 0x193a }
            if (r6 != 0) goto L_0x0c0b
            X.2uL r6 = X.C58902uL.A09     // Catch:{ all -> 0x193a }
        L_0x0c0b:
            X.1bh r0 = new X.1bh     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            boolean r2 = r1.A02     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x0c3a
            r64.A0B()     // Catch:{ all -> 0x193a }
            r2 = r64
            X.1ZT r2 = r2.A05     // Catch:{ all -> 0x193a }
        L_0x0c1b:
            r0.A03 = r2     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r6.A06     // Catch:{ all -> 0x193a }
            X.0sL r2 = X.C16050sL.A05(r2)     // Catch:{ all -> 0x193a }
            r0.A02 = r2     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r6.A07     // Catch:{ all -> 0x193a }
            r0.A05 = r2     // Catch:{ all -> 0x193a }
            long r2 = r6.A02     // Catch:{ all -> 0x193a }
            r0.A01 = r2     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r6.A08     // Catch:{ all -> 0x193a }
            r0.A06 = r2     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r6.A05     // Catch:{ all -> 0x193a }
            r0.A04 = r2     // Catch:{ all -> 0x193a }
            int r3 = r6.A01     // Catch:{ all -> 0x193a }
            if (r3 == 0) goto L_0x0c48
            goto L_0x0c41
        L_0x0c3a:
            X.0rv r2 = r1.A00     // Catch:{ all -> 0x193a }
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.of(r2)     // Catch:{ all -> 0x193a }
            goto L_0x0c1b
        L_0x0c41:
            r2 = 1
            if (r3 == r2) goto L_0x0c45
            goto L_0x0c4b
        L_0x0c45:
            X.42J r4 = X.AnonymousClass42J.A02     // Catch:{ all -> 0x193a }
            goto L_0x0c4d
        L_0x0c48:
            X.42J r4 = X.AnonymousClass42J.A01     // Catch:{ all -> 0x193a }
            goto L_0x0c4d
        L_0x0c4b:
            X.42J r4 = X.AnonymousClass42J.A01     // Catch:{ all -> 0x193a }
        L_0x0c4d:
            X.42J r3 = X.AnonymousClass42J.A02     // Catch:{ all -> 0x193a }
            r2 = 0
            if (r4 != r3) goto L_0x0c53
            r2 = 1
        L_0x0c53:
            r0.A00 = r2     // Catch:{ all -> 0x193a }
            X.1Ww r2 = r6.A03     // Catch:{ all -> 0x193a }
            byte[] r3 = r2.A04()     // Catch:{ all -> 0x193a }
            int r2 = r3.length     // Catch:{ all -> 0x193a }
            if (r2 <= 0) goto L_0x17ca
            r2 = 1
            r0.A02 = r2     // Catch:{ all -> 0x193a }
            X.0tm r2 = r0.A0F()     // Catch:{ all -> 0x193a }
            r2.A03(r3, r5)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0c6a:
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            r4 = r12 & r6
            if (r4 != r6) goto L_0x0cfb
            X.2uU r6 = r8.A0V     // Catch:{ all -> 0x193a }
            if (r6 != 0) goto L_0x0c76
            X.2uU r6 = X.C58992uU.A0D     // Catch:{ all -> 0x193a }
        L_0x0c76:
            X.1rn r0 = new X.1rn     // Catch:{ all -> 0x193a }
            r4 = r65
            r0.<init>(r4, r1, r2)     // Catch:{ all -> 0x193a }
            X.0ta r2 = new X.0ta     // Catch:{ all -> 0x193a }
            r2.<init>()     // Catch:{ all -> 0x193a }
            r0.A02 = r2     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r6.A08     // Catch:{ all -> 0x193a }
            r0.A06 = r2     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r6.A09     // Catch:{ all -> 0x193a }
            r0.A07 = r2     // Catch:{ all -> 0x193a }
            int r2 = r6.A01     // Catch:{ all -> 0x193a }
            r0.A00 = r2     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r6.A07     // Catch:{ all -> 0x193a }
            r0.A05 = r2     // Catch:{ all -> 0x193a }
            X.42A r2 = X.AnonymousClass42A.A01     // Catch:{ all -> 0x193a }
            int r2 = r2.value     // Catch:{ all -> 0x193a }
            r0.A01 = r2     // Catch:{ all -> 0x193a }
            X.42B r2 = X.AnonymousClass42B.A01     // Catch:{ all -> 0x193a }
            int r2 = r2.value     // Catch:{ all -> 0x193a }
            r0.A02 = r2     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r6.A0A     // Catch:{ 1W4 -> 0x0ca9 }
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.get(r2)     // Catch:{ 1W4 -> 0x0ca9 }
            r0.A03 = r2     // Catch:{ 1W4 -> 0x0ca9 }
            goto L_0x0cc1
        L_0x0ca9:
            java.lang.String r2 = "FMessageOrder/FMessageOrder invalid seller jid <"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r3.<init>(r2)     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r6.A0A     // Catch:{ all -> 0x193a }
            r3.append(r2)     // Catch:{ all -> 0x193a }
            java.lang.String r2 = ">"
            r3.append(r2)     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x193a }
        L_0x0cc1:
            java.lang.String r2 = r6.A0B     // Catch:{ all -> 0x193a }
            r0.A08 = r2     // Catch:{ all -> 0x193a }
            X.1Ww r2 = r6.A05     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x0cdc
            byte[] r3 = r2.A04()     // Catch:{ all -> 0x193a }
            int r2 = r3.length     // Catch:{ all -> 0x193a }
            if (r2 <= 0) goto L_0x0cdc
            r2 = 1
            r0.A02 = r2     // Catch:{ all -> 0x193a }
            X.0tm r2 = r0.A0F()     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x0cdc
            r2.A03(r3, r5)     // Catch:{ all -> 0x193a }
        L_0x0cdc:
            java.lang.String r2 = r6.A0C     // Catch:{ all -> 0x193a }
            r0.A04 = r2     // Catch:{ all -> 0x193a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x17ca
            java.lang.String r2 = r0.A04     // Catch:{ IllegalArgumentException -> 0x0cf7 }
            X.1sq r4 = new X.1sq     // Catch:{ IllegalArgumentException -> 0x0cf7 }
            r4.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0cf7 }
            long r2 = r6.A04     // Catch:{ IllegalArgumentException -> 0x0cf7 }
            java.math.BigDecimal r2 = X.C39641sp.A00(r4, r2)     // Catch:{ IllegalArgumentException -> 0x0cf7 }
            r0.A09 = r2     // Catch:{ IllegalArgumentException -> 0x0cf7 }
            goto L_0x17ca
        L_0x0cf7:
            r0.A04 = r10     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0cfb:
            r6 = 134217728(0x8000000, float:3.85186E-34)
            r4 = r12 & r6
            if (r4 != r6) goto L_0x0d47
            X.2ua r5 = r8.A0R     // Catch:{ all -> 0x193a }
            if (r5 != 0) goto L_0x0d07
            X.2ua r5 = X.C59042ua.A09     // Catch:{ all -> 0x193a }
        L_0x0d07:
            int r0 = r5.A00     // Catch:{ all -> 0x193a }
            r4 = 8
            r0 = r0 & 8
            if (r0 != r4) goto L_0x0d38
            X.42U r4 = r5.A0c()     // Catch:{ all -> 0x193a }
            X.42U r0 = X.AnonymousClass42U.A02     // Catch:{ all -> 0x193a }
            if (r4 != r0) goto L_0x0d1e
            X.1ro r0 = new X.1ro     // Catch:{ all -> 0x193a }
            r0.<init>(r5, r1, r2)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0d1e:
            X.42U r0 = X.AnonymousClass42U.A01     // Catch:{ all -> 0x193a }
            if (r4 != r0) goto L_0x0d29
            X.1rt r0 = new X.1rt     // Catch:{ all -> 0x193a }
            r0.<init>(r5, r1, r2)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0d29:
            byte[] r6 = r25.A02()     // Catch:{ all -> 0x193a }
            r7 = 2
            X.1rQ r0 = new X.1rQ     // Catch:{ all -> 0x193a }
            r4 = r0
            r5 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0d38:
            byte[] r6 = r25.A02()     // Catch:{ all -> 0x193a }
            r7 = 2
            X.1rQ r0 = new X.1rQ     // Catch:{ all -> 0x193a }
            r4 = r0
            r5 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0d47:
            boolean r15 = r8.A0f()     // Catch:{ all -> 0x193a }
            if (r15 == 0) goto L_0x0d8e
            X.2uY r4 = r8.A0k     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x0d53
            X.2uY r4 = X.C59022uY.A06     // Catch:{ all -> 0x193a }
        L_0x0d53:
            int r6 = r4.A01     // Catch:{ all -> 0x193a }
            r4 = 5
            if (r6 != r4) goto L_0x0d8e
        L_0x0d58:
            X.220 r4 = r8.A0O     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x0d5e
            X.220 r4 = X.AnonymousClass220.A07     // Catch:{ all -> 0x193a }
        L_0x0d5e:
            java.lang.String r0 = "review_order"
            boolean r0 = X.C61983Be.A03(r4, r0)     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x0d97
            r4 = 2688(0xa80, float:3.767E-42)
            r0 = r61
            boolean r0 = r0.A0E(r11, r4)     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x0d97
            X.220 r0 = r8.A0O     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x0d77
            X.220 r0 = X.AnonymousClass220.A07     // Catch:{ all -> 0x193a }
        L_0x0d77:
            X.1ru r9 = new X.1ru     // Catch:{ all -> 0x193a }
            r10 = r62
            r11 = r0
            r12 = r1
            r13 = r2
            r9.<init>((X.AnonymousClass173) r10, (X.AnonymousClass220) r11, (X.C28381Vw) r12, (long) r13)     // Catch:{ all -> 0x193a }
            r5 = r19
            r6 = r36
            r7 = r8
            r8 = r1
            r10 = r2
            X.0tZ r0 = A06(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0d8e:
            int r6 = r8.A01     // Catch:{ all -> 0x193a }
            r4 = 8
            r6 = r6 & 8
            if (r6 == r4) goto L_0x0d58
            goto L_0x0db3
        L_0x0d97:
            r38 = r65
            r39 = r19
            r40 = r62
            r41 = r61
            r42 = r36
            r43 = r8
            r44 = r1
            r45 = r59
            r46 = r2
            r48 = r7
            r49 = r5
            X.0tZ r0 = X.C61983Be.A01(r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r49)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0db3:
            r6 = 0
            r14 = 32
            r13 = r0 & 32
            if (r13 != r14) goto L_0x0e48
            X.2u4 r5 = r8.A0P     // Catch:{ all -> 0x193a }
            if (r5 != 0) goto L_0x0dc0
            X.2u4 r5 = X.C58762u4.A05     // Catch:{ all -> 0x193a }
        L_0x0dc0:
            int r4 = r5.A01     // Catch:{ all -> 0x193a }
            if (r4 == 0) goto L_0x0dcc
            r0 = 2
            if (r4 == r0) goto L_0x0dc9
            r11 = 0
            goto L_0x0dce
        L_0x0dc9:
            X.42L r11 = X.AnonymousClass42L.A02     // Catch:{ all -> 0x193a }
            goto L_0x0dce
        L_0x0dcc:
            X.42L r11 = X.AnonymousClass42L.A01     // Catch:{ all -> 0x193a }
        L_0x0dce:
            java.lang.String r7 = "FMessageInteractiveResponseFactory/isUnknownInteractiveMessage"
            r10 = 1
            if (r11 == 0) goto L_0x0e17
            X.42L r0 = X.AnonymousClass42L.A01     // Catch:{ all -> 0x193a }
            if (r11 == r0) goto L_0x0e17
            int r0 = r11.ordinal()     // Catch:{ all -> 0x193a }
            if (r0 == r6) goto L_0x0ddf
            r9 = -1
            goto L_0x0e1a
        L_0x0ddf:
            r0 = 2
            if (r4 != r0) goto L_0x0de3
            goto L_0x0de6
        L_0x0de3:
            X.2tr r0 = X.C58662tr.A04     // Catch:{ all -> 0x193a }
            goto L_0x0dea
        L_0x0de6:
            java.lang.Object r0 = r5.A04     // Catch:{ all -> 0x193a }
            X.2tr r0 = (X.C58662tr) r0     // Catch:{ all -> 0x193a }
        L_0x0dea:
            int r9 = r0.A01     // Catch:{ all -> 0x193a }
            if (r9 > r10) goto L_0x0e1a
            int r0 = r5.A00     // Catch:{ all -> 0x193a }
            r0 = r0 & 1
            if (r0 != r10) goto L_0x0dfd
            X.2t9 r0 = r5.A03     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x0dfa
            X.2t9 r0 = X.C58222t9.A02     // Catch:{ all -> 0x193a }
        L_0x0dfa:
            java.lang.String r8 = r0.A01     // Catch:{ all -> 0x193a }
            goto L_0x0dfe
        L_0x0dfd:
            r8 = 0
        L_0x0dfe:
            r0 = 2
            if (r4 != r0) goto L_0x0e03
            goto L_0x0ea2
        L_0x0e03:
            java.lang.String r1 = "Unexpected value: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r0.<init>(r1)     // Catch:{ all -> 0x193a }
            r0.append(r6)     // Catch:{ all -> 0x193a }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x193a }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x193a }
            r0.<init>(r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x0e17:
            java.lang.String r4 = "messageCase null/not_set"
            goto L_0x0e34
        L_0x0e1a:
            java.lang.String r0 = "message: "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r4.<init>(r0)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r11.name()     // Catch:{ all -> 0x193a }
            r4.append(r0)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = ", version: "
            r4.append(r0)     // Catch:{ all -> 0x193a }
            r4.append(r9)     // Catch:{ all -> 0x193a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x193a }
        L_0x0e34:
            r0 = r65
            r0.AcB(r7, r4, r6)     // Catch:{ all -> 0x193a }
            byte[] r6 = r8.A02()     // Catch:{ all -> 0x193a }
            r7 = 2
            X.1rQ r0 = new X.1rQ     // Catch:{ all -> 0x193a }
            r4 = r0
            r5 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0e48:
            r14 = 8388608(0x800000, float:1.17549435E-38)
            r13 = r12 & r14
            if (r13 != r14) goto L_0x0e72
            X.2u5 r0 = r8.A0j     // Catch:{ all -> 0x193a }
            r4 = r0
            if (r0 != 0) goto L_0x0e55
            X.2u5 r0 = X.C58772u5.A05     // Catch:{ all -> 0x193a }
        L_0x0e55:
            java.lang.String r6 = r0.A03     // Catch:{ all -> 0x193a }
            r0 = r4
            if (r4 != 0) goto L_0x0e5c
            X.2u5 r0 = X.C58772u5.A05     // Catch:{ all -> 0x193a }
        L_0x0e5c:
            java.lang.String r5 = r0.A04     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x0e62
            X.2u5 r4 = X.C58772u5.A05     // Catch:{ all -> 0x193a }
        L_0x0e62:
            int r4 = r4.A01     // Catch:{ all -> 0x193a }
            X.1rh r0 = new X.1rh     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A0k(r6)     // Catch:{ all -> 0x193a }
            r0.A01 = r5     // Catch:{ all -> 0x193a }
            r0.A00 = r4     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0e72:
            r13 = 1073741824(0x40000000, float:2.0)
            r12 = r12 & r13
            if (r12 != r13) goto L_0x0ed8
            X.2uB r7 = r8.A0S     // Catch:{ all -> 0x193a }
            if (r7 != 0) goto L_0x0e7d
            X.2uB r7 = X.C58822uB.A06     // Catch:{ all -> 0x193a }
        L_0x0e7d:
            X.1rp r0 = new X.1rp     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            java.lang.String r6 = r7.A05     // Catch:{ all -> 0x193a }
            java.lang.String r5 = r7.A04     // Catch:{ all -> 0x193a }
            X.2tB r2 = r7.A03     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x0e8c
            X.2tB r2 = X.C58242tB.A02     // Catch:{ all -> 0x193a }
        L_0x0e8c:
            java.lang.String r4 = r2.A01     // Catch:{ all -> 0x193a }
            int r3 = r7.A01     // Catch:{ all -> 0x193a }
            if (r3 == 0) goto L_0x0e98
            r2 = 1
            if (r3 != r2) goto L_0x0e98
            X.42M r2 = X.AnonymousClass42M.A01     // Catch:{ all -> 0x193a }
            goto L_0x0e9a
        L_0x0e98:
            X.42M r2 = X.AnonymousClass42M.A02     // Catch:{ all -> 0x193a }
        L_0x0e9a:
            int r2 = r2.value     // Catch:{ all -> 0x193a }
            X.1lN r7 = new X.1lN     // Catch:{ all -> 0x193a }
            r7.<init>(r6, r5, r4, r2)     // Catch:{ all -> 0x193a }
            goto L_0x0ec4
        L_0x0ea2:
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x0eca
            int r4 = r5.A01     // Catch:{ all -> 0x193a }
            r0 = 2
            if (r4 != r0) goto L_0x0ec8
            java.lang.Object r0 = r5.A04     // Catch:{ all -> 0x193a }
            X.2tr r0 = (X.C58662tr) r0     // Catch:{ all -> 0x193a }
            java.lang.String r5 = r0.A02     // Catch:{ all -> 0x193a }
            java.lang.String r4 = r0.A03     // Catch:{ all -> 0x193a }
            X.1lM r0 = new X.1lM     // Catch:{ all -> 0x193a }
            r0.<init>(r5, r4)     // Catch:{ all -> 0x193a }
        L_0x0eba:
            X.1lN r7 = new X.1lN     // Catch:{ all -> 0x193a }
            r7.<init>(r0, r8)     // Catch:{ all -> 0x193a }
            X.1rp r0 = new X.1rp     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
        L_0x0ec4:
            r0.A00 = r7     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0ec8:
            r0 = 0
            goto L_0x0eba
        L_0x0eca:
            r0 = 26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x193a }
            java.lang.String r1 = "NFM response message is required body"
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x0ed8:
            r13 = 2
            r12 = r0 & 2
            if (r12 != r13) goto L_0x0f2d
            X.2uA r0 = r8.A04     // Catch:{ all -> 0x193a }
            r5 = r0
            if (r0 != 0) goto L_0x0ee4
            X.2uA r0 = X.C58812uA.A06     // Catch:{ all -> 0x193a }
        L_0x0ee4:
            int r4 = r0.A02     // Catch:{ all -> 0x193a }
            if (r4 == 0) goto L_0x0eef
            r0 = 1
            if (r4 == r0) goto L_0x0eec
            goto L_0x0ef2
        L_0x0eec:
            X.42H r4 = X.AnonymousClass42H.A01     // Catch:{ all -> 0x193a }
            goto L_0x0ef4
        L_0x0eef:
            X.42H r4 = X.AnonymousClass42H.A02     // Catch:{ all -> 0x193a }
            goto L_0x0ef4
        L_0x0ef2:
            X.42H r4 = X.AnonymousClass42H.A02     // Catch:{ all -> 0x193a }
        L_0x0ef4:
            X.42H r0 = X.AnonymousClass42H.A02     // Catch:{ all -> 0x193a }
            if (r4 == r0) goto L_0x0f1e
            if (r5 != 0) goto L_0x0efc
            X.2uA r5 = X.C58812uA.A06     // Catch:{ all -> 0x193a }
        L_0x0efc:
            int r4 = r5.A01     // Catch:{ all -> 0x193a }
            if (r4 != r13) goto L_0x0f1b
            java.lang.Object r0 = r5.A04     // Catch:{ all -> 0x193a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x193a }
        L_0x0f04:
            java.lang.String r7 = X.C40651uT.A05(r0)     // Catch:{ all -> 0x193a }
            X.2uA r0 = r8.A04     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x0f0e
            X.2uA r0 = X.C58812uA.A06     // Catch:{ all -> 0x193a }
        L_0x0f0e:
            java.lang.String r4 = r0.A05     // Catch:{ all -> 0x193a }
            X.1rq r0 = new X.1rq     // Catch:{ all -> 0x193a }
            r5 = r0
            r6 = r1
            r8 = r4
            r9 = r2
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0f1b:
            java.lang.String r0 = ""
            goto L_0x0f04
        L_0x0f1e:
            byte[] r6 = r25.A02()     // Catch:{ all -> 0x193a }
            r7 = 2
            X.1rQ r0 = new X.1rQ     // Catch:{ all -> 0x193a }
            r4 = r0
            r5 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0f2d:
            if (r15 == 0) goto L_0x0f68
            X.2uY r12 = r8.A0k     // Catch:{ all -> 0x193a }
            r40 = r12
            if (r12 != 0) goto L_0x0f37
            X.2uY r12 = X.C59022uY.A06     // Catch:{ all -> 0x193a }
        L_0x0f37:
            int r12 = r12.A00     // Catch:{ all -> 0x193a }
            r13 = 16
            r12 = r12 & 16
            if (r12 != r13) goto L_0x0f68
            if (r40 != 0) goto L_0x0f43
            X.2uY r40 = X.C59022uY.A06     // Catch:{ all -> 0x193a }
        L_0x0f43:
            java.lang.String r4 = r1.A01     // Catch:{ all -> 0x193a }
            X.0rv r0 = r1.A00     // Catch:{ all -> 0x193a }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x193a }
            r42 = r10
            r46 = 0
            r47 = 0
            r38 = r0
            r39 = r10
            r41 = r59
            r43 = r45
            r44 = r4
            r45 = r49
            r48 = r2
            r50 = r7
            r51 = r5
            X.0tZ r0 = X.C439021z.A01(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r51)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x0f68:
            r13 = 1
            r12 = r0 & 1
            if (r12 != r13) goto L_0x13d4
            X.2uG r12 = r8.A03     // Catch:{ all -> 0x193a }
            if (r12 != 0) goto L_0x0f73
            X.2uG r12 = X.C58852uG.A08     // Catch:{ all -> 0x193a }
        L_0x0f73:
            int r0 = r12.A00     // Catch:{ all -> 0x193a }
            r9 = 32
            r0 = r0 & 32
            if (r0 != r9) goto L_0x0ff7
            java.lang.String r0 = r12.A06     // Catch:{ all -> 0x193a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x0ff7
            X.1XE r9 = r12.A03     // Catch:{ all -> 0x193a }
            if (r9 == 0) goto L_0x0ff7
            int r0 = r9.size()     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x0ff7
            java.util.Iterator r13 = r9.iterator()     // Catch:{ all -> 0x193a }
        L_0x0f91:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x0ff5
            java.lang.Object r10 = r13.next()     // Catch:{ all -> 0x193a }
            X.2u3 r10 = (X.AnonymousClass2u3) r10     // Catch:{ all -> 0x193a }
            int r9 = r10.A01     // Catch:{ all -> 0x193a }
            if (r9 == 0) goto L_0x0fab
            r0 = 1
            if (r9 == r0) goto L_0x0fa8
            r0 = 2
            if (r9 != r0) goto L_0x0fab
            goto L_0x0fae
        L_0x0fa8:
            X.42R r9 = X.AnonymousClass42R.A02     // Catch:{ all -> 0x193a }
            goto L_0x0fb0
        L_0x0fab:
            X.42R r9 = X.AnonymousClass42R.A03     // Catch:{ all -> 0x193a }
            goto L_0x0fb0
        L_0x0fae:
            X.42R r9 = X.AnonymousClass42R.A01     // Catch:{ all -> 0x193a }
        L_0x0fb0:
            X.42R r0 = X.AnonymousClass42R.A01     // Catch:{ all -> 0x193a }
            if (r9 != r0) goto L_0x0fcb
            int r0 = r10.A00     // Catch:{ all -> 0x193a }
            r0 = r0 & 8
            if (r0 != r4) goto L_0x0ff7
            X.2tP r0 = r10.A03     // Catch:{ all -> 0x193a }
            r10 = r0
            if (r0 != 0) goto L_0x0fc1
            X.2tP r0 = X.C58382tP.A03     // Catch:{ all -> 0x193a }
        L_0x0fc1:
            int r0 = r0.A00     // Catch:{ all -> 0x193a }
            r9 = 1
            r0 = r0 & 1
            if (r0 != r9) goto L_0x0ff7
            if (r10 != 0) goto L_0x0fec
            goto L_0x0fea
        L_0x0fcb:
            int r0 = r10.A00     // Catch:{ all -> 0x193a }
            r9 = 2
            r0 = r0 & 2
            if (r0 != r9) goto L_0x0ff7
            X.2t2 r0 = r10.A02     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x0fd8
            X.2t2 r0 = X.AnonymousClass2t2.A02     // Catch:{ all -> 0x193a }
        L_0x0fd8:
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x193a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x0ff7
            int r0 = r10.A00     // Catch:{ all -> 0x193a }
            r9 = 1
            r0 = r0 & 1
            if (r0 != r9) goto L_0x0ff7
            java.lang.String r0 = r10.A04     // Catch:{ all -> 0x193a }
            goto L_0x0fee
        L_0x0fea:
            X.2tP r10 = X.C58382tP.A03     // Catch:{ all -> 0x193a }
        L_0x0fec:
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x193a }
        L_0x0fee:
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x0f91
            goto L_0x0ff7
        L_0x0ff5:
            r0 = 1
            goto L_0x0ff8
        L_0x0ff7:
            r0 = 0
        L_0x0ff8:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x100e
            X.21S r0 = r12.A04     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x1004
            X.21S r0 = X.AnonymousClass21S.A0R     // Catch:{ all -> 0x193a }
        L_0x1004:
            boolean r0 = r0.A0P     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x100e
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r14)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x100e:
            int r0 = r12.A02     // Catch:{ all -> 0x193a }
            X.438 r10 = X.AnonymousClass438.A00(r0)     // Catch:{ all -> 0x193a }
            if (r10 != 0) goto L_0x1018
            X.438 r10 = X.AnonymousClass438.A06     // Catch:{ all -> 0x193a }
        L_0x1018:
            X.1XE r0 = r12.A03     // Catch:{ all -> 0x193a }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ all -> 0x193a }
            r9 = 0
        L_0x101f:
            r15 = 0
        L_0x1020:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x1084
            java.lang.Object r4 = r18.next()     // Catch:{ all -> 0x193a }
            X.2u3 r4 = (X.AnonymousClass2u3) r4     // Catch:{ all -> 0x193a }
            int r13 = r4.A01     // Catch:{ all -> 0x193a }
            if (r13 == 0) goto L_0x103a
            r0 = 1
            if (r13 == r0) goto L_0x1037
            r0 = 2
            if (r13 != r0) goto L_0x103a
            goto L_0x103d
        L_0x1037:
            X.42R r13 = X.AnonymousClass42R.A02     // Catch:{ all -> 0x193a }
            goto L_0x103f
        L_0x103a:
            X.42R r13 = X.AnonymousClass42R.A03     // Catch:{ all -> 0x193a }
            goto L_0x103f
        L_0x103d:
            X.42R r13 = X.AnonymousClass42R.A01     // Catch:{ all -> 0x193a }
        L_0x103f:
            X.42R r0 = X.AnonymousClass42R.A03     // Catch:{ all -> 0x193a }
            if (r13 == r0) goto L_0x13c5
            X.42R r0 = X.AnonymousClass42R.A01     // Catch:{ all -> 0x193a }
            if (r13 != r0) goto L_0x1020
            int r9 = r9 + 1
            if (r15 != 0) goto L_0x1082
            if (r10 == 0) goto L_0x1082
            int r0 = r4.A00     // Catch:{ all -> 0x193a }
            r13 = 8
            r0 = r0 & 8
            if (r0 != r13) goto L_0x1082
            r0 = r63
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x193a }
            X.2tP r4 = r4.A03     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x105f
            X.2tP r4 = X.C58382tP.A03     // Catch:{ all -> 0x193a }
        L_0x105f:
            java.lang.String r4 = r4.A01     // Catch:{ all -> 0x193a }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x193a }
            X.1Qr r0 = (X.C27161Qr) r0     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x1082
            boolean r0 = r0 instanceof X.AnonymousClass1R7     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x101f
            X.438 r0 = X.AnonymousClass438.A01     // Catch:{ all -> 0x193a }
            if (r10 == r0) goto L_0x101f
            X.438 r0 = X.AnonymousClass438.A05     // Catch:{ all -> 0x193a }
            if (r10 == r0) goto L_0x101f
            X.438 r0 = X.AnonymousClass438.A07     // Catch:{ all -> 0x193a }
            if (r10 == r0) goto L_0x101f
            X.438 r0 = X.AnonymousClass438.A03     // Catch:{ all -> 0x193a }
            if (r10 == r0) goto L_0x101f
            X.438 r0 = X.AnonymousClass438.A02     // Catch:{ all -> 0x193a }
            if (r10 != r0) goto L_0x1082
            goto L_0x101f
        L_0x1082:
            r15 = 1
            goto L_0x1020
        L_0x1084:
            r0 = 2
            if (r9 > r0) goto L_0x13c5
            if (r15 != 0) goto L_0x13c5
            int r0 = r12.A02     // Catch:{ all -> 0x193a }
            X.438 r0 = X.AnonymousClass438.A00(r0)     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x1093
            X.438 r0 = X.AnonymousClass438.A06     // Catch:{ all -> 0x193a }
        L_0x1093:
            java.lang.String r13 = "payment_status"
            boolean r18 = A0F(r12, r13)     // Catch:{ all -> 0x193a }
            java.lang.String r10 = "review_and_pay"
            boolean r15 = A0F(r12, r10)     // Catch:{ all -> 0x193a }
            java.lang.String r9 = "payment_method"
            java.lang.String r4 = "review_order"
            if (r15 != 0) goto L_0x11db
            if (r18 != 0) goto L_0x11db
            boolean r15 = A0F(r12, r4)     // Catch:{ all -> 0x193a }
            if (r15 == 0) goto L_0x113a
            X.AnonymousClass00B.A06(r19)     // Catch:{ all -> 0x193a }
            X.0rv r5 = r1.A00     // Catch:{ all -> 0x193a }
            X.AnonymousClass00B.A06(r5)     // Catch:{ all -> 0x193a }
            X.AnonymousClass00B.A06(r36)     // Catch:{ all -> 0x193a }
            r7 = 2688(0xa80, float:3.767E-42)
            r0 = r61
            boolean r0 = r0.A0E(r11, r7)     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x10e3
            X.1ru r33 = new X.1ru     // Catch:{ all -> 0x193a }
            r38 = r33
            r39 = r62
            r40 = r12
            r41 = r1
            r42 = r2
            r38.<init>((X.AnonymousClass173) r39, (X.C58852uG) r40, (X.C28381Vw) r41, (long) r42)     // Catch:{ all -> 0x193a }
            r29 = r19
            r30 = r36
            r31 = r8
            r32 = r1
            r34 = r2
            X.0tZ r0 = A06(r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x193a }
            goto L_0x122c
        L_0x10e3:
            java.lang.String r0 = X.C39801t5.A03(r8)     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x1134
            java.lang.String r7 = X.AnonymousClass3BX.A02(r0)     // Catch:{ all -> 0x193a }
            java.util.Map r0 = X.AnonymousClass3BX.A01     // Catch:{ all -> 0x193a }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x193a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x1134
            int r7 = r0.intValue()     // Catch:{ all -> 0x193a }
            r0 = r26
            java.lang.String r7 = r0.A02(r7)     // Catch:{ all -> 0x193a }
            java.lang.String r11 = X.AnonymousClass3BX.A01(r8)     // Catch:{ all -> 0x193a }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x1119
            r0 = 2
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]     // Catch:{ all -> 0x193a }
            r0[r6] = r7     // Catch:{ all -> 0x193a }
            r6 = 1
            r0[r6] = r11     // Catch:{ all -> 0x193a }
            java.lang.String r6 = "\n"
            java.lang.String r7 = X.AnonymousClass1ZW.A0B(r6, r0)     // Catch:{ all -> 0x193a }
        L_0x1119:
            if (r7 == 0) goto L_0x1134
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x193a }
            r6.<init>()     // Catch:{ all -> 0x193a }
            X.1cc r0 = new X.1cc     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A0k(r7)     // Catch:{ all -> 0x193a }
            r0.A0u(r6)     // Catch:{ all -> 0x193a }
            r3 = r19
            r2 = r36
            X.0tj r6 = X.C62013Bh.A00(r3, r5, r2, r8, r0)     // Catch:{ all -> 0x193a }
            goto L_0x11b2
        L_0x1134:
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r14)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x113a:
            boolean r11 = A0F(r12, r9)     // Catch:{ all -> 0x193a }
            if (r11 == 0) goto L_0x122e
            X.AnonymousClass00B.A06(r19)     // Catch:{ all -> 0x193a }
            X.0rv r0 = r1.A00     // Catch:{ all -> 0x193a }
            r18 = r0
            X.AnonymousClass00B.A06(r18)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = X.C39801t5.A03(r8)     // Catch:{ all -> 0x193a }
            java.lang.Integer r0 = X.AnonymousClass3BX.A00(r0)     // Catch:{ all -> 0x193a }
            r11 = 0
            if (r0 == 0) goto L_0x11d5
            int r5 = r0.intValue()     // Catch:{ all -> 0x193a }
            r0 = r26
            java.lang.String r7 = r0.A02(r5)     // Catch:{ all -> 0x193a }
            int r15 = r8.A01     // Catch:{ all -> 0x193a }
            r5 = 8
            r0 = r15 & 8
            if (r0 != r5) goto L_0x118a
            X.220 r0 = r8.A0O     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x116d
            X.220 r0 = X.AnonymousClass220.A07     // Catch:{ all -> 0x193a }
        L_0x116d:
            X.2t7 r0 = r0.A03     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x1173
            X.2t7 r0 = X.C58202t7.A02     // Catch:{ all -> 0x193a }
        L_0x1173:
            java.lang.String r11 = r0.A01     // Catch:{ all -> 0x193a }
        L_0x1175:
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x1198
            r0 = 2
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]     // Catch:{ all -> 0x193a }
            r0[r6] = r7     // Catch:{ all -> 0x193a }
            r5 = 1
            r0[r5] = r11     // Catch:{ all -> 0x193a }
            java.lang.String r5 = "\n"
            java.lang.String r7 = X.AnonymousClass1ZW.A0B(r5, r0)     // Catch:{ all -> 0x193a }
            goto L_0x1198
        L_0x118a:
            r0 = 1
            r5 = r15 & 1
            if (r5 != r0) goto L_0x1175
            X.2uG r0 = r8.A03     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x1195
            X.2uG r0 = X.C58852uG.A08     // Catch:{ all -> 0x193a }
        L_0x1195:
            java.lang.String r11 = r0.A06     // Catch:{ all -> 0x193a }
            goto L_0x1175
        L_0x1198:
            if (r7 == 0) goto L_0x11d5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x193a }
            r5.<init>()     // Catch:{ all -> 0x193a }
            X.1cc r0 = new X.1cc     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A0k(r7)     // Catch:{ all -> 0x193a }
            r0.A0u(r5)     // Catch:{ all -> 0x193a }
            r3 = r19
            r2 = r18
            X.0tj r6 = X.C62013Bh.A01(r3, r2, r8)     // Catch:{ all -> 0x193a }
        L_0x11b2:
            if (r6 == 0) goto L_0x122c
            r3 = r6
            X.0tZ r3 = (X.C16740tZ) r3     // Catch:{ all -> 0x193a }
            r2 = r59
            r2.A05(r0, r3)     // Catch:{ all -> 0x193a }
            if (r87 == 0) goto L_0x122c
            r2 = r20
            boolean r2 = r2.A03(r6)     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x122c
            r2 = r20
            X.0sq r7 = r2.A09     // Catch:{ all -> 0x193a }
            r5 = 34
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0     // Catch:{ all -> 0x193a }
            r3.<init>((X.C16840tj) r6, (X.AnonymousClass1TS) r2, (int) r5)     // Catch:{ all -> 0x193a }
            r7.Acl(r3)     // Catch:{ all -> 0x193a }
            goto L_0x122c
        L_0x11d5:
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r14)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x11db:
            X.1ru r0 = new X.1ru     // Catch:{ all -> 0x193a }
            r29 = r0
            r30 = r62
            r31 = r12
            r32 = r1
            r33 = r2
            r29.<init>((X.AnonymousClass173) r30, (X.C58852uG) r31, (X.C28381Vw) r32, (long) r33)     // Catch:{ all -> 0x193a }
            X.0tn r5 = r0.A00     // Catch:{ all -> 0x193a }
            if (r5 == 0) goto L_0x13c5
            X.1lc r5 = r5.A01     // Catch:{ all -> 0x193a }
            if (r5 == 0) goto L_0x13c5
            X.1lZ r5 = r5.A05     // Catch:{ all -> 0x193a }
            java.lang.String r5 = r5.A01     // Catch:{ all -> 0x193a }
            int r5 = X.C35251lc.A00(r5)     // Catch:{ all -> 0x193a }
            if (r5 == 0) goto L_0x13c5
            if (r18 == 0) goto L_0x1214
            X.0tn r5 = r0.A00     // Catch:{ all -> 0x193a }
            X.1lc r5 = r5.A01     // Catch:{ all -> 0x193a }
            java.lang.String r6 = r5.A02     // Catch:{ all -> 0x193a }
            java.lang.String r5 = "captured"
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x193a }
            if (r5 != 0) goto L_0x1214
            java.lang.String r5 = "pending"
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x193a }
            if (r5 == 0) goto L_0x13c5
        L_0x1214:
            if (r87 == 0) goto L_0x122c
            r2 = r20
            boolean r2 = r2.A03(r0)     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x122c
            r2 = r20
            X.0sq r6 = r2.A09     // Catch:{ all -> 0x193a }
            r5 = 33
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0     // Catch:{ all -> 0x193a }
            r3.<init>((X.C16840tj) r0, (X.AnonymousClass1TS) r2, (int) r5)     // Catch:{ all -> 0x193a }
            r6.Acl(r3)     // Catch:{ all -> 0x193a }
        L_0x122c:
            r3 = 0
            goto L_0x1250
        L_0x122e:
            X.438 r6 = X.AnonymousClass438.A01     // Catch:{ all -> 0x193a }
            if (r0 != r6) goto L_0x12ff
            int r8 = r12.A01     // Catch:{ all -> 0x193a }
            r6 = 2
            if (r8 != r6) goto L_0x12ff
            java.lang.Object r6 = r12.A05     // Catch:{ all -> 0x193a }
            X.24l r6 = (X.C445324l) r6     // Catch:{ all -> 0x193a }
            X.1rA r0 = new X.1rA     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A1B(r6, r7, r5)     // Catch:{ all -> 0x193a }
            int r3 = r6.A00     // Catch:{ all -> 0x193a }
            r2 = 65536(0x10000, float:9.18355E-41)
            r3 = r3 & r2
            if (r3 != r2) goto L_0x122c
            X.21S r3 = r6.A0C     // Catch:{ all -> 0x193a }
            if (r3 != 0) goto L_0x1250
            X.21S r3 = X.AnonymousClass21S.A0R     // Catch:{ all -> 0x193a }
        L_0x1250:
            boolean r2 = A0F(r12, r10)     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x13a0
            boolean r2 = A0F(r12, r4)     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x13a0
            boolean r2 = A0F(r12, r9)     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x13a0
            boolean r2 = A0F(r12, r13)     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x13a0
            java.lang.String r7 = r12.A06     // Catch:{ all -> 0x193a }
            java.lang.String r6 = r12.A07     // Catch:{ all -> 0x193a }
            X.1XE r2 = r12.A03     // Catch:{ all -> 0x193a }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x193a }
            r8.<init>()     // Catch:{ all -> 0x193a }
            java.util.Iterator r12 = r2.iterator()     // Catch:{ all -> 0x193a }
        L_0x1277:
            boolean r2 = r12.hasNext()     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x1398
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x193a }
            X.2u3 r10 = (X.AnonymousClass2u3) r10     // Catch:{ all -> 0x193a }
            r9 = 0
            int r11 = r10.A00     // Catch:{ all -> 0x193a }
            r4 = 8
            r2 = r11 & 8
            if (r2 != r4) goto L_0x12ac
            X.2tP r2 = r10.A03     // Catch:{ all -> 0x193a }
            r5 = r2
            if (r2 != 0) goto L_0x1293
            X.2tP r2 = X.C58382tP.A03     // Catch:{ all -> 0x193a }
        L_0x1293:
            int r2 = r2.A00     // Catch:{ all -> 0x193a }
            r4 = 1
            r2 = r2 & 1
            if (r2 != r4) goto L_0x12ac
            r2 = r5
            if (r5 != 0) goto L_0x129f
            X.2tP r2 = X.C58382tP.A03     // Catch:{ all -> 0x193a }
        L_0x129f:
            java.lang.String r4 = r2.A01     // Catch:{ all -> 0x193a }
            if (r5 != 0) goto L_0x12a5
            X.2tP r5 = X.C58382tP.A03     // Catch:{ all -> 0x193a }
        L_0x12a5:
            java.lang.String r2 = r5.A02     // Catch:{ all -> 0x193a }
            X.1lK r9 = new X.1lK     // Catch:{ all -> 0x193a }
            r9.<init>(r4, r2)     // Catch:{ all -> 0x193a }
        L_0x12ac:
            r5 = 1
            r2 = r11 & 1
            if (r2 != r5) goto L_0x12b7
            r4 = 2
            r2 = r11 & 2
            if (r2 != r4) goto L_0x12b8
            goto L_0x12bf
        L_0x12b7:
            r5 = 0
        L_0x12b8:
            if (r9 == 0) goto L_0x1277
            if (r5 != 0) goto L_0x12bf
            java.lang.String r5 = r9.A00     // Catch:{ all -> 0x193a }
            goto L_0x12c1
        L_0x12bf:
            java.lang.String r5 = r10.A04     // Catch:{ all -> 0x193a }
        L_0x12c1:
            X.2t2 r2 = r10.A02     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x12c7
            X.2t2 r2 = X.AnonymousClass2t2.A02     // Catch:{ all -> 0x193a }
        L_0x12c7:
            java.lang.String r4 = r2.A01     // Catch:{ all -> 0x193a }
            int r10 = r10.A01     // Catch:{ all -> 0x193a }
            if (r10 == 0) goto L_0x12d7
            r2 = 1
            if (r10 == r2) goto L_0x12d4
            r2 = 2
            if (r10 != r2) goto L_0x12d7
            goto L_0x12da
        L_0x12d4:
            X.42R r10 = X.AnonymousClass42R.A02     // Catch:{ all -> 0x193a }
            goto L_0x12dc
        L_0x12d7:
            X.42R r10 = X.AnonymousClass42R.A03     // Catch:{ all -> 0x193a }
            goto L_0x12dc
        L_0x12da:
            X.42R r10 = X.AnonymousClass42R.A01     // Catch:{ all -> 0x193a }
        L_0x12dc:
            X.42R r2 = X.AnonymousClass42R.A01     // Catch:{ all -> 0x193a }
            if (r10 != r2) goto L_0x12e3
            r33 = 2
            goto L_0x12eb
        L_0x12e3:
            X.42R r2 = X.AnonymousClass42R.A02     // Catch:{ all -> 0x193a }
            r33 = 0
            if (r10 != r2) goto L_0x12eb
            r33 = 1
        L_0x12eb:
            X.1t7 r2 = new X.1t7     // Catch:{ all -> 0x193a }
            r34 = 0
            r29 = r2
            r30 = r9
            r31 = r5
            r32 = r4
            r29.<init>(r30, r31, r32, r33, r34)     // Catch:{ all -> 0x193a }
            r8.add(r2)     // Catch:{ all -> 0x193a }
            goto L_0x1277
        L_0x12ff:
            X.438 r6 = X.AnonymousClass438.A03     // Catch:{ all -> 0x193a }
            if (r0 != r6) goto L_0x1323
            int r8 = r12.A01     // Catch:{ all -> 0x193a }
            r6 = 3
            if (r8 != r6) goto L_0x1323
            java.lang.Object r6 = r12.A05     // Catch:{ all -> 0x193a }
            X.24k r6 = (X.C445224k) r6     // Catch:{ all -> 0x193a }
            X.1rF r0 = new X.1rF     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A1B(r6, r7, r5)     // Catch:{ all -> 0x193a }
            int r3 = r6.A00     // Catch:{ all -> 0x193a }
            r2 = 4096(0x1000, float:5.74E-42)
            r3 = r3 & r2
            if (r3 != r2) goto L_0x122c
            X.21S r3 = r6.A0J     // Catch:{ all -> 0x193a }
            if (r3 != 0) goto L_0x1250
            X.21S r3 = X.AnonymousClass21S.A0R     // Catch:{ all -> 0x193a }
            goto L_0x1250
        L_0x1323:
            X.438 r6 = X.AnonymousClass438.A07     // Catch:{ all -> 0x193a }
            if (r0 != r6) goto L_0x1350
            int r8 = r12.A01     // Catch:{ all -> 0x193a }
            r6 = 4
            if (r8 != r6) goto L_0x1350
            java.lang.Object r6 = r12.A05     // Catch:{ all -> 0x193a }
            X.24n r6 = (X.C445524n) r6     // Catch:{ all -> 0x193a }
            X.1rI r0 = new X.1rI     // Catch:{ all -> 0x193a }
            r29 = r0
            r30 = r6
            r31 = r1
            r32 = r2
            r34 = r7
            r35 = r5
            r29.<init>((X.C445524n) r30, (X.C28381Vw) r31, (long) r32, (boolean) r34, (boolean) r35)     // Catch:{ all -> 0x193a }
            int r3 = r6.A00     // Catch:{ all -> 0x193a }
            r2 = 16384(0x4000, float:2.2959E-41)
            r3 = r3 & r2
            if (r3 != r2) goto L_0x122c
            X.21S r3 = r6.A0F     // Catch:{ all -> 0x193a }
            if (r3 != 0) goto L_0x1250
            X.21S r3 = X.AnonymousClass21S.A0R     // Catch:{ all -> 0x193a }
            goto L_0x1250
        L_0x1350:
            X.438 r6 = X.AnonymousClass438.A04     // Catch:{ all -> 0x193a }
            if (r0 != r6) goto L_0x1374
            int r7 = r12.A01     // Catch:{ all -> 0x193a }
            r6 = 5
            if (r7 != r6) goto L_0x1374
            java.lang.Object r6 = r12.A05     // Catch:{ all -> 0x193a }
            X.2uT r6 = (X.C58982uT) r6     // Catch:{ all -> 0x193a }
            X.1rM r0 = new X.1rM     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r0.A17(r6, r5)     // Catch:{ all -> 0x193a }
            int r3 = r6.A04     // Catch:{ all -> 0x193a }
            r2 = 2048(0x800, float:2.87E-42)
            r3 = r3 & r2
            if (r3 != r2) goto L_0x122c
            X.21S r3 = r6.A07     // Catch:{ all -> 0x193a }
            if (r3 != 0) goto L_0x1250
            X.21S r3 = X.AnonymousClass21S.A0R     // Catch:{ all -> 0x193a }
            goto L_0x1250
        L_0x1374:
            X.438 r5 = X.AnonymousClass438.A05     // Catch:{ all -> 0x193a }
            if (r0 != r5) goto L_0x1391
            int r6 = r12.A01     // Catch:{ all -> 0x193a }
            r5 = 1
            if (r6 != r5) goto L_0x1391
            java.lang.Object r5 = r12.A05     // Catch:{ all -> 0x193a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x193a }
        L_0x1381:
            X.1cc r0 = new X.1cc     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r2 = X.AnonymousClass1ZW.A04(r2, r5)     // Catch:{ all -> 0x193a }
            r0.A0k(r2)     // Catch:{ all -> 0x193a }
            goto L_0x122c
        L_0x1391:
            X.438 r5 = X.AnonymousClass438.A02     // Catch:{ all -> 0x193a }
            if (r0 != r5) goto L_0x13c5
            java.lang.String r5 = ""
            goto L_0x1381
        L_0x1398:
            X.1sB r2 = new X.1sB     // Catch:{ all -> 0x193a }
            r2.<init>(r7, r6, r8)     // Catch:{ all -> 0x193a }
            r0.A0f(r2)     // Catch:{ all -> 0x193a }
        L_0x13a0:
            r38 = r65
            r39 = r64
            r40 = r23
            r41 = r24
            r42 = r63
            r43 = r26
            r44 = r27
            r45 = r28
            r46 = r62
            r47 = r61
            r48 = r37
            r49 = r60
            r50 = r3
            r51 = r0
            r52 = r1
            r53 = r59
            A0A(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x13c5:
            byte[] r6 = r25.A02()     // Catch:{ all -> 0x193a }
            r7 = 2
            X.1rQ r0 = new X.1rQ     // Catch:{ all -> 0x193a }
            r4 = r0
            r5 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x13d4:
            r7 = 4
            r4 = r0 & 4
            if (r4 != r7) goto L_0x141d
            X.2tW r0 = r8.A0W     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x13df
            X.2tW r0 = X.C58452tW.A03     // Catch:{ all -> 0x193a }
        L_0x13df:
            int r0 = r0.A01     // Catch:{ all -> 0x193a }
            X.432 r4 = X.AnonymousClass432.A00(r0)     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x13e9
            X.432 r4 = X.AnonymousClass432.A03     // Catch:{ all -> 0x193a }
        L_0x13e9:
            X.432 r0 = X.AnonymousClass432.A03     // Catch:{ all -> 0x193a }
            if (r4 == r0) goto L_0x140e
            r4 = 423(0x1a7, float:5.93E-43)
            r0 = r61
            boolean r0 = r0.A0E(r11, r4)     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x1401
            r4 = 544(0x220, float:7.62E-43)
            r0 = r61
            boolean r0 = r0.A0E(r11, r4)     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x140e
        L_0x1401:
            X.2tW r4 = r8.A0W     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x1407
            X.2tW r4 = X.C58452tW.A03     // Catch:{ all -> 0x193a }
        L_0x1407:
            X.1rr r0 = new X.1rr     // Catch:{ all -> 0x193a }
            r0.<init>((X.C58452tW) r4, (X.C28381Vw) r1, (long) r2)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x140e:
            byte[] r6 = r25.A02()     // Catch:{ all -> 0x193a }
            r7 = 2
            X.1rQ r0 = new X.1rQ     // Catch:{ all -> 0x193a }
            r4 = r0
            r5 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x141d:
            r4 = 16
            r0 = r0 & 16
            if (r0 != r4) goto L_0x143f
            X.2eu r4 = r8.A0c     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x1429
            X.2eu r4 = X.C53052eu.A05     // Catch:{ all -> 0x193a }
        L_0x1429:
            if (r95 == 0) goto L_0x144d
            int r0 = r4.A00     // Catch:{ all -> 0x193a }
            r7 = 2
            r0 = r0 & 2
            if (r0 != r7) goto L_0x144d
            java.lang.String r0 = r4.A04     // Catch:{ all -> 0x193a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x144d
            java.lang.String r0 = "MessageUtils/hasValidReactionMessage edit version and text message are both set"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x193a }
        L_0x143f:
            X.0rv r4 = r1.A00     // Catch:{ all -> 0x193a }
            int r7 = r8.A01     // Catch:{ all -> 0x193a }
            r0 = 4096(0x1000, float:5.74E-42)
            r7 = r7 & r0
            if (r7 != r0) goto L_0x1491
            boolean r0 = r4 instanceof com.whatsapp.jid.GroupJid     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x14c1
            goto L_0x147a
        L_0x144d:
            X.1iF r0 = r4.A02     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x1453
            X.1iF r0 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x1453:
            boolean r0 = A0H(r0)     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x143f
            X.2eu r5 = r8.A0c     // Catch:{ all -> 0x193a }
            if (r5 != 0) goto L_0x145f
            X.2eu r5 = X.C53052eu.A05     // Catch:{ all -> 0x193a }
        L_0x145f:
            X.1iF r4 = r5.A02     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x1465
            X.1iF r4 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x1465:
            X.1rv r0 = new X.1rv     // Catch:{ all -> 0x193a }
            r29 = r0
            r30 = r5
            r31 = r4
            r32 = r1
            r33 = r2
            r29.<init>(r30, r31, r32, r33)     // Catch:{ all -> 0x193a }
            boolean r2 = r1.A02     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x17bb
            goto L_0x17b8
        L_0x147a:
            if (r73 == 0) goto L_0x14c1
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4     // Catch:{ all -> 0x193a }
            r0 = r22
            int r4 = r0.A02(r4)     // Catch:{ all -> 0x193a }
            r0 = 3
            if (r4 != r0) goto L_0x14c1
            r4 = 2035(0x7f3, float:2.852E-42)
            r0 = r61
            boolean r0 = r0.A0E(r11, r4)     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x14c1
        L_0x1491:
            int r7 = r8.A01     // Catch:{ all -> 0x193a }
            r4 = 64
            r0 = r7 & 64
            if (r0 != r4) goto L_0x14fa
            boolean r0 = X.C34311k3.A01(r61)     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x14eb
            X.2uC r4 = r8.A0Y     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x14a5
            X.2uC r4 = X.AnonymousClass2uC.A06     // Catch:{ all -> 0x193a }
        L_0x14a5:
            X.1s2 r0 = new X.1s2     // Catch:{ all -> 0x193a }
            r9 = r0
            r10 = r61
            r11 = r4
            r12 = r1
            r13 = r2
            r15 = r5
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x193a }
            X.21R r2 = r8.A0m     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x14b7
            X.21R r2 = X.AnonymousClass21R.A05     // Catch:{ all -> 0x193a }
        L_0x14b7:
            X.1Ww r2 = r2.A02     // Catch:{ all -> 0x193a }
            byte[] r2 = r2.A04()     // Catch:{ all -> 0x193a }
            r0.A1F = r2     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x14c1:
            X.2tn r7 = r8.A0D     // Catch:{ all -> 0x193a }
            if (r7 != 0) goto L_0x14c7
            X.2tn r7 = X.C58622tn.A04     // Catch:{ all -> 0x193a }
        L_0x14c7:
            int r12 = r7.A00     // Catch:{ all -> 0x193a }
            r4 = 2
            r0 = r12 & 2
            if (r0 != r4) goto L_0x1491
            r4 = 4
            r0 = r12 & 4
            if (r0 != r4) goto L_0x1491
            X.1iF r0 = r7.A03     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x14d9
            X.1iF r0 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x14d9:
            boolean r0 = A0H(r0)     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x1491
            X.2tn r8 = r8.A0D     // Catch:{ all -> 0x193a }
            if (r8 != 0) goto L_0x14e5
            X.2tn r8 = X.C58622tn.A04     // Catch:{ all -> 0x193a }
        L_0x14e5:
            boolean r7 = r1.A02     // Catch:{ all -> 0x193a }
            if (r7 != 0) goto L_0x165c
            goto L_0x1659
        L_0x14eb:
            byte[] r6 = r25.A02()     // Catch:{ all -> 0x193a }
            r7 = 2
            X.1rQ r0 = new X.1rQ     // Catch:{ all -> 0x193a }
            r4 = r0
            r5 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x14fa:
            r4 = 32768(0x8000, float:4.5918E-41)
            r0 = r7 & r4
            if (r0 != r4) goto L_0x1538
            boolean r0 = X.C34311k3.A00(r61)     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x1529
            X.2uC r4 = r8.A0X     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x150d
            X.2uC r4 = X.AnonymousClass2uC.A06     // Catch:{ all -> 0x193a }
        L_0x150d:
            X.1s2 r0 = new X.1s2     // Catch:{ all -> 0x193a }
            r9 = r0
            r10 = r61
            r11 = r4
            r12 = r1
            r13 = r2
            r15 = r5
            r9.<init>(r10, r11, r12, r13, r15)     // Catch:{ all -> 0x193a }
            X.21R r2 = r8.A0m     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x151f
            X.21R r2 = X.AnonymousClass21R.A05     // Catch:{ all -> 0x193a }
        L_0x151f:
            X.1Ww r2 = r2.A02     // Catch:{ all -> 0x193a }
            byte[] r2 = r2.A04()     // Catch:{ all -> 0x193a }
            r0.A1F = r2     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x1529:
            byte[] r6 = r25.A02()     // Catch:{ all -> 0x193a }
            r7 = 2
            X.1rQ r0 = new X.1rQ     // Catch:{ all -> 0x193a }
            r4 = r0
            r5 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8)     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x1538:
            r0 = 128(0x80, float:1.794E-43)
            r7 = r7 & r0
            if (r7 != r0) goto L_0x15b2
            X.2ex r5 = r8.A0Z     // Catch:{ all -> 0x193a }
            if (r5 != 0) goto L_0x1543
            X.2ex r5 = X.C53082ex.A05     // Catch:{ all -> 0x193a }
        L_0x1543:
            int r0 = r5.A00     // Catch:{ all -> 0x193a }
            r7 = 2
            r0 = r0 & 2
            if (r0 != r7) goto L_0x15b2
            X.2tX r0 = r5.A02     // Catch:{ all -> 0x193a }
            r4 = r0
            if (r0 != 0) goto L_0x1551
            X.2tX r0 = X.C58462tX.A03     // Catch:{ all -> 0x193a }
        L_0x1551:
            int r0 = r0.A00     // Catch:{ all -> 0x193a }
            r0 = r0 & 2
            if (r0 != r7) goto L_0x15b2
            if (r4 != 0) goto L_0x155b
            X.2tX r4 = X.C58462tX.A03     // Catch:{ all -> 0x193a }
        L_0x155b:
            int r0 = r4.A00     // Catch:{ all -> 0x193a }
            r0 = r0 & 1
            if (r0 != r13) goto L_0x15b2
            X.1iF r0 = r5.A04     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x1567
            X.1iF r0 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x1567:
            boolean r0 = A0H(r0)     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x15b2
            boolean r0 = X.C34311k3.A01(r61)     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x158f
            r4 = 1541(0x605, float:2.16E-42)
            r0 = r61
            boolean r0 = r0.A0E(r11, r4)     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x158f
            byte[] r6 = r25.A02()     // Catch:{ all -> 0x193a }
            X.1rQ r0 = new X.1rQ     // Catch:{ all -> 0x193a }
            r4 = r0
            r5 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8)     // Catch:{ all -> 0x193a }
            r2 = 67
            r0.A00 = r2     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x158f:
            X.2ex r4 = r8.A0Z     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x1595
            X.2ex r4 = X.C53082ex.A05     // Catch:{ all -> 0x193a }
        L_0x1595:
            X.1s3 r0 = new X.1s3     // Catch:{ all -> 0x193a }
            r0.<init>(r4, r1, r2)     // Catch:{ all -> 0x193a }
            boolean r2 = r1.A02     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x15a1
            if (r79 == 0) goto L_0x15a1
            goto L_0x15a2
        L_0x15a1:
            r9 = r10
        L_0x15a2:
            X.1iF r3 = r4.A04     // Catch:{ all -> 0x193a }
            if (r3 != 0) goto L_0x15a8
            X.1iF r3 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x15a8:
            r2 = r64
            X.23X r2 = X.AnonymousClass23Y.A00(r2, r9, r3, r1)     // Catch:{ all -> 0x193a }
            r0.A02 = r2     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x15b2:
            int r4 = r8.A01     // Catch:{ all -> 0x193a }
            r0 = 256(0x100, float:3.59E-43)
            r4 = r4 & r0
            if (r4 != r0) goto L_0x15db
            X.2Q2 r5 = r8.A0Q     // Catch:{ all -> 0x193a }
            if (r5 != 0) goto L_0x15bf
            X.2Q2 r5 = X.AnonymousClass2Q2.A04     // Catch:{ all -> 0x193a }
        L_0x15bf:
            if (r95 == 0) goto L_0x15eb
            int r0 = r5.A00     // Catch:{ all -> 0x193a }
            r4 = 2
            r0 = r0 & 2
            if (r0 != r4) goto L_0x15eb
            int r0 = r5.A01     // Catch:{ all -> 0x193a }
            X.42y r4 = X.C802042y.A00(r0)     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x15d2
            X.42y r4 = X.C802042y.A03     // Catch:{ all -> 0x193a }
        L_0x15d2:
            X.42y r0 = X.C802042y.A01     // Catch:{ all -> 0x193a }
            if (r4 != r0) goto L_0x15eb
            java.lang.String r0 = "MessageUtils/hasValidKeepInChatMessage edit version and keeptype as kept are both set"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x193a }
        L_0x15db:
            r4 = 0
            int r7 = r8.A01     // Catch:{ all -> 0x193a }
            r5 = 1024(0x400, float:1.435E-42)
            r0 = r7 & r5
            if (r0 != r5) goto L_0x160d
            X.1s6 r0 = new X.1s6     // Catch:{ all -> 0x193a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x193a }
            goto L_0x17cb
        L_0x15eb:
            X.1iF r0 = r5.A03     // Catch:{ all -> 0x193a }
            if (r0 != 0) goto L_0x15f1
            X.1iF r0 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x15f1:
            boolean r0 = A0H(r0)     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x15db
            boolean r0 = X.C34321k4.A04(r61)     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x1643
            X.2Q2 r4 = r8.A0Q     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x1603
            X.2Q2 r4 = X.AnonymousClass2Q2.A04     // Catch:{ all -> 0x193a }
        L_0x1603:
            X.1s4 r0 = new X.1s4     // Catch:{ all -> 0x193a }
            r0.<init>(r4, r1, r2)     // Catch:{ all -> 0x193a }
            boolean r2 = r1.A02     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x1632
            goto L_0x162f
        L_0x160d:
            r0 = 8192(0x2000, float:1.14794E-41)
            r7 = r7 & r0
            if (r7 != r0) goto L_0x1625
            byte[] r7 = r25.A02()     // Catch:{ all -> 0x193a }
            r8 = 2
            X.1rQ r0 = new X.1rQ     // Catch:{ all -> 0x193a }
            r5 = r0
            r6 = r1
            r9 = r2
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x193a }
            r2 = 74
            r0.A00 = r2     // Catch:{ all -> 0x193a }
            goto L_0x17cb
        L_0x1625:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x193a }
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x162f:
            if (r79 == 0) goto L_0x1632
            goto L_0x1633
        L_0x1632:
            r9 = r10
        L_0x1633:
            X.1iF r3 = r4.A03     // Catch:{ all -> 0x193a }
            if (r3 != 0) goto L_0x1639
            X.1iF r3 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x1639:
            r2 = r64
            X.23X r2 = X.AnonymousClass23Y.A00(r2, r9, r3, r1)     // Catch:{ all -> 0x193a }
            r0.A02 = r2     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x1643:
            byte[] r9 = r25.A02()     // Catch:{ all -> 0x193a }
            r10 = 2
            X.1rQ r0 = new X.1rQ     // Catch:{ all -> 0x193a }
            r7 = r0
            r8 = r1
            r11 = r2
            r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x193a }
            r2 = 68
            r0.A00 = r2     // Catch:{ all -> 0x193a }
            r4 = 0
            r0.A01 = r6     // Catch:{ all -> 0x193a }
            goto L_0x17cb
        L_0x1659:
            r5 = r9
            if (r79 != 0) goto L_0x165d
        L_0x165c:
            r5 = r10
        L_0x165d:
            X.1iF r4 = r8.A03     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x1663
            X.1iF r4 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x1663:
            r0 = r64
            X.23X r11 = X.AnonymousClass23Y.A00(r0, r5, r4, r1)     // Catch:{ all -> 0x193a }
            com.whatsapp.jid.UserJid r9 = com.whatsapp.jid.UserJid.of(r9)     // Catch:{ all -> 0x193a }
            if (r7 == 0) goto L_0x167b
            X.1ZX r9 = r64.A04()     // Catch:{ all -> 0x193a }
        L_0x1673:
            r4 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x193a }
            if (r74 == 0) goto L_0x1786
            goto L_0x1686
        L_0x167b:
            boolean r0 = X.C16030sJ.A0M(r9)     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x1684
            X.1ZX r9 = (X.AnonymousClass1ZX) r9     // Catch:{ all -> 0x193a }
            goto L_0x1673
        L_0x1684:
            r9 = r10
            goto L_0x1673
        L_0x1686:
            if (r75 == 0) goto L_0x1786
            if (r88 == 0) goto L_0x1786
            X.1Vw r5 = r11.A01     // Catch:{ all -> 0x193a }
            r0 = r19
            X.0th r0 = r0.A0K     // Catch:{ all -> 0x193a }
            X.0tZ r5 = r0.A03(r5)     // Catch:{ all -> 0x193a }
            if (r5 == 0) goto L_0x177b
            X.1Vw r0 = r5.A11     // Catch:{ all -> 0x193a }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x193a }
            boolean r0 = r0.A02     // Catch:{ all -> 0x193a }
            if (r0 == 0) goto L_0x16a7
            r64.A0B()     // Catch:{ all -> 0x193a }
            r0 = r64
            X.1ZT r0 = r0.A05     // Catch:{ all -> 0x193a }
            goto L_0x16ad
        L_0x16a7:
            X.0rv r0 = r5.A0B()     // Catch:{ all -> 0x193a }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x193a }
        L_0x16ad:
            if (r0 == 0) goto L_0x1755
            if (r9 == 0) goto L_0x1755
            long r4 = r5.A13     // Catch:{ all -> 0x193a }
            r12 = r21
            byte[] r49 = r12.A01(r4)     // Catch:{ all -> 0x193a }
            X.1Ww r4 = r8.A01     // Catch:{ all -> 0x193a }
            byte[] r46 = r4.A04()     // Catch:{ all -> 0x193a }
            X.1Ww r4 = r8.A02     // Catch:{ all -> 0x193a }
            byte[] r47 = r4.A04()     // Catch:{ all -> 0x193a }
            X.1iF r4 = r8.A03     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x16cb
            X.1iF r4 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x16cb:
            java.lang.String r5 = r4.A01     // Catch:{ all -> 0x193a }
            java.lang.String r4 = "MessageAddOnEncReactionUtils/"
            if (r5 == 0) goto L_0x1717
            if (r49 == 0) goto L_0x1717
            java.lang.String r45 = "Enc Reaction"
            r41 = r0
            r42 = r9
            r43 = r44
            r44 = r5
            r48 = r10
            byte[] r5 = X.C441723b.A01(r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ all -> 0x193a }
            if (r5 != 0) goto L_0x16ec
            java.lang.String r0 = "decryptEncReactionMessage: unable to decrypt payload"
            java.lang.String r0 = X.C18450wi.A06(r4, r0)     // Catch:{ all -> 0x193a }
            goto L_0x174b
        L_0x16ec:
            X.2eu r0 = X.C53052eu.A05     // Catch:{ 1bD -> 0x1710 }
            X.1Wm r5 = X.C28541Wm.A0E(r0, r5)     // Catch:{ 1bD -> 0x1710 }
            X.2eu r5 = (X.C53052eu) r5     // Catch:{ 1bD -> 0x1710 }
            X.C18450wi.A0B(r5)     // Catch:{ 1bD -> 0x1710 }
            X.1iF r4 = r8.A03     // Catch:{ all -> 0x193a }
            if (r4 != 0) goto L_0x16fd
            X.1iF r4 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x16fd:
            X.1rv r0 = new X.1rv     // Catch:{ all -> 0x193a }
            r29 = r0
            r30 = r5
            r31 = r4
            r32 = r1
            r33 = r2
            r29.<init>(r30, r31, r32, r33)     // Catch:{ all -> 0x193a }
            r0.A02 = r11     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x1710:
            java.lang.String r0 = "decryptEncReactionMessage: failed to parse payload into protobuf"
            java.lang.String r0 = X.C18450wi.A06(r4, r0)     // Catch:{ all -> 0x193a }
            goto L_0x174b
        L_0x1717:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r2.<init>()     // Catch:{ all -> 0x193a }
            r2.append(r4)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = "decryptEncReactionMessage: one of the params is null, encIv is null = "
            r2.append(r0)     // Catch:{ all -> 0x193a }
            r1 = 1
            r2.append(r6)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = " encPayload is null = "
            r2.append(r0)     // Catch:{ all -> 0x193a }
            r2.append(r6)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = " targetMessageId is null = "
            r2.append(r0)     // Catch:{ all -> 0x193a }
            r0 = 0
            if (r5 != 0) goto L_0x1739
            r0 = 1
        L_0x1739:
            r2.append(r0)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = " messageSecret is null = "
            r2.append(r0)     // Catch:{ all -> 0x193a }
            if (r49 == 0) goto L_0x1744
            r1 = 0
        L_0x1744:
            r2.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x193a }
        L_0x174b:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x193a }
            X.23S r1 = new X.23S     // Catch:{ all -> 0x193a }
            r1.<init>(r7)     // Catch:{ all -> 0x193a }
            goto L_0x186e
        L_0x1755:
            java.lang.String r1 = "MessageUtils/decryptReactionMessage: one of the params is null, targetSenderUserJid is null = "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r2.<init>(r1)     // Catch:{ all -> 0x193a }
            r1 = 0
            if (r0 != 0) goto L_0x1760
            r1 = 1
        L_0x1760:
            r2.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = ", senderLid is null = "
            r2.append(r0)     // Catch:{ all -> 0x193a }
            if (r9 == 0) goto L_0x176b
            r4 = 0
        L_0x176b:
            r2.append(r4)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x193a }
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r7)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x177b:
            java.lang.String r0 = "MessageUtils/decryptReactionMessage: targetMessage is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x193a }
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r7)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x1786:
            java.lang.String r0 = "MessageUtils/decryptReactionMessage: one of the params is null, coreMessageStore is null = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r1.<init>(r0)     // Catch:{ all -> 0x193a }
            r0 = 0
            if (r74 != 0) goto L_0x1791
            r0 = 1
        L_0x1791:
            r1.append(r0)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = ", messageSecretStore is null = "
            r1.append(r0)     // Catch:{ all -> 0x193a }
            r0 = 0
            if (r75 != 0) goto L_0x179d
            r0 = 1
        L_0x179d:
            r1.append(r0)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = ", jniBridge is null = "
            r1.append(r0)     // Catch:{ all -> 0x193a }
            if (r88 == 0) goto L_0x17a8
            r4 = 0
        L_0x17a8:
            r1.append(r4)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x193a }
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r7)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x17b8:
            if (r79 == 0) goto L_0x17bb
            goto L_0x17bc
        L_0x17bb:
            r9 = r10
        L_0x17bc:
            X.1iF r3 = r5.A02     // Catch:{ all -> 0x193a }
            if (r3 != 0) goto L_0x17c2
            X.1iF r3 = X.C33231iF.A05     // Catch:{ all -> 0x193a }
        L_0x17c2:
            r2 = r64
            X.23X r2 = X.AnonymousClass23Y.A00(r2, r9, r3, r1)     // Catch:{ all -> 0x193a }
            r0.A02 = r2     // Catch:{ all -> 0x193a }
        L_0x17ca:
            r4 = 0
        L_0x17cb:
            if (r95 == 0) goto L_0x1802
            r3 = 1
            r2 = r17
            if (r2 == r3) goto L_0x1802
            boolean r2 = r0 instanceof X.C38831rU     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x1802
            boolean r2 = r0 instanceof X.C39101rv     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x1802
            boolean r2 = r0 instanceof X.C39191s4     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x1802
            java.lang.String r2 = "MessageUtils/buildFMessage unexpected editedVersion"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r1.<init>()     // Catch:{ all -> 0x193a }
            java.lang.String r0 = "edit="
            r1.append(r0)     // Catch:{ all -> 0x193a }
            r0 = r17
            r1.append(r0)     // Catch:{ all -> 0x193a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x193a }
            r0 = r65
            r0.AcB(r2, r1, r4)     // Catch:{ all -> 0x193a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x193a }
            X.23S r1 = new X.23S     // Catch:{ all -> 0x193a }
            r1.<init>(r0)     // Catch:{ all -> 0x193a }
            goto L_0x186e
        L_0x1802:
            java.lang.String r3 = "reaction"
            r2 = r58
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x18b0
            if (r0 == 0) goto L_0x18b0
            boolean r2 = r0 instanceof X.C39101rv     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x18b0
            java.lang.String r3 = "MessageUtils/buildFMessage message type does not correspond an encoded message "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r2.<init>()     // Catch:{ all -> 0x193a }
            java.lang.String r1 = "type="
            r2.append(r1)     // Catch:{ all -> 0x193a }
            r1 = r58
            r2.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r1 = " media_wa_type="
            r2.append(r1)     // Catch:{ all -> 0x193a }
            byte r0 = r0.A10     // Catch:{ all -> 0x193a }
            r2.append(r0)     // Catch:{ all -> 0x193a }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x193a }
            r0 = r65
            r0.AcB(r3, r1, r4)     // Catch:{ all -> 0x193a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x193a }
            X.23S r1 = new X.23S     // Catch:{ all -> 0x193a }
            r1.<init>(r0)     // Catch:{ all -> 0x193a }
            goto L_0x186e
        L_0x1841:
            java.lang.String r3 = r4.A0C     // Catch:{ all -> 0x193a }
            r2 = 1
            java.lang.String r2 = X.AnonymousClass1QS.A07(r3, r2)     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x186f
            java.lang.String r0 = "FMessageAudio/unrecognized audio mime type; mimeType="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r2.<init>(r0)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r4.A0C     // Catch:{ all -> 0x193a }
            r2.append(r0)     // Catch:{ all -> 0x193a }
            r2.append(r5)     // Catch:{ all -> 0x193a }
            r2.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x193a }
            r0 = 17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x193a }
            X.23S r1 = new X.23S     // Catch:{ all -> 0x193a }
            r1.<init>(r0)     // Catch:{ all -> 0x193a }
        L_0x186e:
            throw r1     // Catch:{ all -> 0x193a }
        L_0x186f:
            java.lang.String r2 = r4.A0C     // Catch:{ all -> 0x193a }
            r0.A06 = r2     // Catch:{ all -> 0x193a }
            if (r7 == 0) goto L_0x187c
            int r2 = r4.A01     // Catch:{ all -> 0x193a }
            r3 = 1
            r2 = r2 & 1
            if (r2 != r3) goto L_0x1883
        L_0x187c:
            java.lang.String r2 = r4.A0D     // Catch:{ all -> 0x193a }
            r0.A17(r2)     // Catch:{ all -> 0x193a }
            if (r7 == 0) goto L_0x18ab
        L_0x1883:
            int r3 = r4.A01     // Catch:{ all -> 0x193a }
            r2 = 256(0x100, float:3.59E-43)
            r3 = r3 & r2
            if (r3 == r2) goto L_0x18ab
            java.lang.String r2 = "FMessageAudio/message without direct path received; message.key="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r3.<init>(r2)     // Catch:{ all -> 0x193a }
            r3.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r2 = "; message.senderJid="
            r3.append(r2)     // Catch:{ all -> 0x193a }
            X.0rv r2 = r0.A0M     // Catch:{ all -> 0x193a }
            r3.append(r2)     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x193a }
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x193a }
        L_0x18a5:
            int r2 = r4.A02     // Catch:{ all -> 0x193a }
            r0.A00 = r2     // Catch:{ all -> 0x193a }
            goto L_0x17ca
        L_0x18ab:
            java.lang.String r2 = r4.A0B     // Catch:{ all -> 0x193a }
            r8.A0G = r2     // Catch:{ all -> 0x193a }
            goto L_0x18a5
        L_0x18b0:
            java.lang.String r3 = "poll"
            r2 = r58
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x18d8
            java.lang.String r3 = "vote"
            r2 = r57
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x18d8
            if (r0 == 0) goto L_0x18d8
            boolean r2 = r0 instanceof X.C39181s3     // Catch:{ all -> 0x193a }
            if (r2 != 0) goto L_0x18d8
            boolean r2 = r0 instanceof X.C38791rQ     // Catch:{ all -> 0x193a }
            if (r2 == 0) goto L_0x190c
            r2 = r0
            X.1rQ r2 = (X.C38791rQ) r2     // Catch:{ all -> 0x193a }
            int r3 = r2.A00     // Catch:{ all -> 0x193a }
            r2 = 67
            if (r3 != r2) goto L_0x190c
        L_0x18d8:
            r29 = r83
            r17 = r65
            r18 = r64
            r19 = r23
            r20 = r24
            r21 = r63
            r22 = r26
            r23 = r27
            r24 = r28
            r25 = r62
            r26 = r61
            r27 = r37
            r28 = r60
            r30 = r0
            r31 = r1
            r32 = r59
            r33 = r54
            A0A(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x193a }
            X.C38621r6.A0L(r0)     // Catch:{ all -> 0x193a }
            if (r16 == 0) goto L_0x190b
            r1 = r60
            X.0sq r2 = r1.A02
            r1 = r16
            r2.Ac3(r1)
        L_0x190b:
            return r0
        L_0x190c:
            java.lang.String r1 = "type="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x193a }
            r2.<init>(r1)     // Catch:{ all -> 0x193a }
            r1 = r58
            r2.append(r1)     // Catch:{ all -> 0x193a }
            java.lang.String r1 = " media_wa_type="
            r2.append(r1)     // Catch:{ all -> 0x193a }
            byte r0 = r0.A10     // Catch:{ all -> 0x193a }
            r2.append(r0)     // Catch:{ all -> 0x193a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x193a }
            java.lang.String r1 = "MessageUtils/buildFMessage message type does not correspond an encoded message "
            r0 = r65
            r0.AcB(r1, r2, r4)     // Catch:{ all -> 0x193a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x193a }
            java.lang.String r1 = "poll_update_message_stanza_invalid"
            X.23S r0 = new X.23S     // Catch:{ all -> 0x193a }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x193a }
            throw r0     // Catch:{ all -> 0x193a }
        L_0x193a:
            r2 = move-exception
            if (r16 == 0) goto L_0x1946
            r0 = r60
            X.0sq r1 = r0.A02
            r0 = r16
            r1.Ac3(r0)
        L_0x1946:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41061vA.A04(X.0so, X.0sK, X.0uc, X.0sG, X.0wH, X.0tz, X.013, X.1GG, X.0rt, X.0t6, X.17o, X.173, X.1Vt, X.0pd, X.0rv, X.17f, X.0wS, X.1GF, X.21S, X.1iD, X.1Vw, X.17g, X.1TS, com.whatsapp.wamsys.JniBridge, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, long, boolean, boolean, boolean):X.0tZ");
    }

    public static C16740tZ A05(C16300so r36, C16040sK r37, C17150uc r38, C16000sG r39, C18180wH r40, C16980tz r41, AnonymousClass013 r42, AnonymousClass1GG r43, AnonymousClass173 r44, C14710pd r45, C15830rv r46, C18290wS r47, AnonymousClass1GF r48, AnonymousClass21S r49, C33211iD r50, C28381Vw r51, C222617g r52, long j2, boolean z2, boolean z3, boolean z4) {
        return A04(r36, r37, r38, r39, r40, r41, r42, r43, (C15810rt) null, (C16460t6) null, (C223417o) null, r44, (AnonymousClass1Vt) null, r45, r46, (C222517f) null, r47, r48, r49, r50, r51, r52, (AnonymousClass1TS) null, (JniBridge) null, (Long) null, (String) null, (String) null, (String) null, (String) null, 0, 0, j2, z2, z3, z4);
    }

    public static C16740tZ A06(C16460t6 r1, C222517f r2, C33211iD r3, C28381Vw r4, C16830ti r5, long j2) {
        C16880tn AAt;
        C15830rv r0 = r4.A00;
        AnonymousClass00B.A06(r0);
        C16840tj A00 = C62013Bh.A00(r1, r0, r2, r3, r5);
        if (A00 == null) {
            String A01 = AnonymousClass3BX.A01(r3);
            if (A01 != null) {
                ArrayList arrayList = new ArrayList();
                C30581cc r02 = new C30581cc(r4, j2);
                r02.A0k(A01);
                r02.A0u(arrayList);
                return r02;
            }
            throw new AnonymousClass23S(0);
        }
        C16880tn r12 = r5.A00;
        if (!(r12 == null || (AAt = A00.AAt()) == null)) {
            r12.A01 = AAt.A01;
        }
        return r5;
    }

    public static C16740tZ A07(C14710pd r5, C33211iD r6, C33211iD r7, C28381Vw r8, long j2, boolean z2) {
        boolean z3 = false;
        if ((r7.A00 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
            z3 = true;
        }
        C28381Vw r2 = r8;
        long j3 = j2;
        if (z3) {
            C16620tM r1 = C16620tM.A02;
            if (r5.A0E(r1, 812) || r5.A0E(r1, 811)) {
                C37521pI r12 = r7.A0i;
                if (r12 == null) {
                    r12 = C37521pI.A0I;
                }
                return new C38641rB(r12, r2, j3, z2);
            }
        }
        if ((r7.A00 & 32) == 32) {
            C53012ep r13 = r7.A0E;
            if (r13 == null) {
                r13 = C53012ep.A0P;
            }
            C30581cc r0 = new C30581cc(r8, j2);
            r0.A15(r13);
            return r0;
        }
        return new C38791rQ(r2, r6.A02(), 2, j2);
    }

    public static String A08(AnonymousClass013 r10, C38811rS r11) {
        int i2;
        long j2;
        Object[] objArr;
        AnonymousClass25N A00;
        List A12 = r11.A12();
        int size = A12.size() - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= A12.size() || i3 >= 100) {
                int size2 = A12.size();
                i2 = R.plurals.plurals00d8;
                j2 = (long) size2;
                objArr = new Object[]{Integer.valueOf(size2)};
            } else {
                String str = (String) A12.get(i3);
                if (str != null && (A00 = C39701sv.A00(str)) != null) {
                    C39701sv r4 = new C39701sv();
                    Iterator it = A00.A02.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            continue;
                            break;
                        }
                        C87294We r5 = (C87294We) it.next();
                        String str2 = r5.A01;
                        if (!TextUtils.isEmpty(r5.A02)) {
                            if (str2.equals("N")) {
                                C39701sv.A01(r5.A03, r4.A08);
                            }
                            AnonymousClass4SC r1 = r4.A08;
                            if (!TextUtils.isEmpty(r1.A02)) {
                                String str3 = r1.A02;
                                if (str3 != null) {
                                    i2 = R.plurals.plurals0029;
                                    j2 = (long) size;
                                    objArr = new Object[]{str3, Integer.valueOf(size)};
                                    break;
                                }
                            }
                        }
                    }
                }
                i3++;
            }
        }
        return r10.A0J(objArr, i2, j2);
    }

    public static List A09(C33211iD r9) {
        ArrayList arrayList = new ArrayList();
        int A0J = C41071vB.A0J(r9);
        for (int i2 = 0; i2 < A0J; i2++) {
            arrayList.add(0);
        }
        int i3 = r9.A00;
        if ((i3 & 8) == 8) {
            arrayList.add(1);
        }
        if ((i3 & 1) == 1) {
            arrayList.add(2);
        }
        if ((i3 & 4) == 4) {
            arrayList.add(3);
        }
        if ((i3 & 16) == 16) {
            arrayList.add(4);
        }
        if ((r9.A00 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            arrayList.add(5);
        }
        if ((r9.A00 & 32) == 32) {
            arrayList.add(6);
        }
        if (r9.A0c()) {
            arrayList.add(7);
        }
        int i4 = r9.A00;
        if ((i4 & 128) == 128) {
            arrayList.add(8);
        }
        if ((i4 & 256) == 256) {
            arrayList.add(9);
        }
        if ((i4 & 1024) == 1024) {
            arrayList.add(10);
        }
        boolean z2 = false;
        if ((i4 & 2048) == 2048) {
            z2 = true;
        }
        if (z2) {
            arrayList.add(11);
        }
        if ((i4 & 4096) == 4096) {
            arrayList.add(12);
        }
        if (r9.A0e()) {
            arrayList.add(13);
        }
        int i5 = r9.A00;
        if ((i5 & 32768) == 32768) {
            arrayList.add(14);
        }
        if ((i5 & 131072) == 131072) {
            arrayList.add(15);
        }
        if ((r9.A00 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
            arrayList.add(16);
        }
        int i6 = r9.A00;
        if ((i6 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            arrayList.add(17);
        }
        if ((i6 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            arrayList.add(18);
        }
        if ((i6 & 16777216) == 16777216) {
            arrayList.add(19);
        }
        if ((r9.A00 & 134217728) == 134217728) {
            arrayList.add(20);
        }
        int i7 = r9.A00;
        if ((i7 & 536870912) == 536870912) {
            arrayList.add(21);
        }
        if ((i7 & 4194304) == 4194304) {
            arrayList.add(22);
        }
        if (r9.A0f()) {
            arrayList.add(23);
        }
        int i8 = r9.A00;
        if ((i8 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
            arrayList.add(24);
        }
        boolean z3 = false;
        if ((i8 & 268435456) == 268435456) {
            z3 = true;
        }
        if (z3) {
            arrayList.add(25);
        }
        if ((i8 & 1073741824) == 1073741824) {
            arrayList.add(26);
        }
        if (r9.A0d()) {
            arrayList.add(27);
        }
        int i9 = r9.A01;
        if ((i9 & 1) == 1) {
            arrayList.add(29);
        }
        if ((i9 & 2) == 2) {
            arrayList.add(30);
        }
        if ((i9 & 4) == 4) {
            arrayList.add(31);
        }
        if (A0G(r9)) {
            arrayList.add(32);
        }
        if ((r9.A01 & 8) == 8) {
            arrayList.add(33);
        }
        int i10 = r9.A01;
        if ((i10 & 32) == 32) {
            arrayList.add(34);
        }
        if ((i10 & 64) == 64 || (i10 & 32768) == 32768) {
            arrayList.add(35);
        }
        if ((r9.A01 & 128) == 128) {
            C53082ex r0 = r9.A0Z;
            if (r0 == null) {
                r0 = C53082ex.A05;
            }
            if ((r0.A00 & 2) == 2) {
                arrayList.add(36);
            }
        }
        if ((r9.A01 & 256) == 256) {
            arrayList.add(37);
        }
        int i11 = r9.A01;
        if ((i11 & 512) == 512) {
            arrayList.add(7);
        }
        if ((i11 & 8192) == 8192) {
            arrayList.add(11);
        }
        if ((i11 & 2048) == 2048) {
            arrayList.add(25);
        }
        if ((i11 & 1024) == 1024) {
            arrayList.add(38);
        }
        if ((i11 & 16384) == 16384) {
            arrayList.add(25);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b4, code lost:
        if (r2.A0C == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c2, code lost:
        if (r2.A0D == false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00cf, code lost:
        if (r2.A0B == false) goto L_0x00d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.C16300so r30, X.C16040sK r31, X.C17150uc r32, X.C16000sG r33, X.C18180wH r34, X.C16980tz r35, X.AnonymousClass013 r36, X.AnonymousClass1GG r37, X.AnonymousClass173 r38, X.C14710pd r39, X.C18290wS r40, X.AnonymousClass1GF r41, X.AnonymousClass21S r42, X.C16740tZ r43, X.C28381Vw r44, X.C222617g r45, boolean r46) {
        /*
            r0 = r43
            if (r43 == 0) goto L_0x01f1
            r7 = r42
            if (r42 == 0) goto L_0x01f1
            int r2 = r7.A00
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 & r1
            if (r2 != r1) goto L_0x0018
            boolean r1 = r7.A0Q
            if (r1 == 0) goto L_0x0018
            r1 = 262144(0x40000, float:3.67342E-40)
            r0.A0S(r1)
        L_0x0018:
            int r4 = r7.A00
            r2 = 256(0x100, float:3.59E-43)
            r1 = r4 & r2
            if (r1 != r2) goto L_0x0038
            boolean r1 = r7.A0P
            if (r1 == 0) goto L_0x0038
            r3 = 1
            r0.A0S(r3)
            int r4 = r7.A00
            r2 = 128(0x80, float:1.794E-43)
            r1 = r4 & r2
            if (r1 != r2) goto L_0x0036
            int r1 = r7.A04
            int r3 = java.lang.Math.max(r3, r1)
        L_0x0036:
            r0.A05 = r3
        L_0x0038:
            r1 = 2048(0x800, float:2.87E-42)
            r4 = r4 & r1
            if (r4 != r1) goto L_0x0075
            int r1 = r7.A03
            r0.A0T(r1)
            int r2 = r7.A00
            r1 = 4096(0x1000, float:5.74E-42)
            r2 = r2 & r1
            if (r2 != r1) goto L_0x005f
            r1 = r44
            X.0rv r1 = r1.A00
            boolean r1 = X.C16030sJ.A0O(r1)
            if (r1 == 0) goto L_0x005f
            long r3 = r7.A06
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r0.A0i(r1)
        L_0x005f:
            X.1cH r1 = r7.A0D
            if (r1 != 0) goto L_0x0065
            X.1cH r1 = X.C30391cH.A02
        L_0x0065:
            int r2 = r1.A01
            if (r2 == 0) goto L_0x0159
            r1 = 1
            if (r2 == r1) goto L_0x0155
            r1 = 2
            if (r2 != r1) goto L_0x0159
            X.1cJ r1 = X.C30411cJ.A03
        L_0x0071:
            int r1 = r1.value
            r0.A00 = r1
        L_0x0075:
            int r2 = r7.A00
            r1 = 16384(0x4000, float:2.2959E-41)
            r2 = r2 & r1
            if (r2 != r1) goto L_0x00eb
            X.21X r2 = r7.A0C
            if (r2 != 0) goto L_0x0082
            X.21X r2 = X.AnonymousClass21X.A0E
        L_0x0082:
            java.lang.String r12 = r2.A0A
            java.lang.String r9 = r2.A03
            int r3 = r2.A01
            if (r3 == 0) goto L_0x0151
            r1 = 1
            if (r3 == r1) goto L_0x014d
            r1 = 2
            if (r3 != r1) goto L_0x0151
            X.21Y r3 = X.AnonymousClass21Y.A03
        L_0x0092:
            X.21Y r1 = X.AnonymousClass21Y.A01
            if (r3 != r1) goto L_0x0143
            r21 = 1
        L_0x0098:
            java.lang.String r8 = r2.A09
            java.lang.String r6 = r2.A05
            X.1Ww r1 = r2.A02
            byte[] r19 = r1.A04()
            java.lang.String r5 = r2.A07
            java.lang.String r4 = r2.A06
            java.lang.String r3 = r2.A08
            int r10 = r2.A00
            r11 = 1024(0x400, float:1.435E-42)
            r1 = r10 & r11
            if (r1 != r11) goto L_0x00b6
            boolean r1 = r2.A0C
            r22 = 1
            if (r1 != 0) goto L_0x00b8
        L_0x00b6:
            r22 = 0
        L_0x00b8:
            r11 = 2048(0x800, float:2.87E-42)
            r1 = r10 & r11
            if (r1 != r11) goto L_0x00c4
            boolean r1 = r2.A0D
            r23 = 1
            if (r1 != 0) goto L_0x00c6
        L_0x00c4:
            r23 = 0
        L_0x00c6:
            r1 = 512(0x200, float:7.175E-43)
            r10 = r10 & r1
            if (r10 != r1) goto L_0x00d1
            boolean r1 = r2.A0B
            r24 = 1
            if (r1 != 0) goto L_0x00d3
        L_0x00d1:
            r24 = 0
        L_0x00d3:
            java.lang.String r2 = r2.A04
            r20 = 0
            X.1uH r1 = new X.1uH
            r10 = r1
            r11 = r12
            r12 = r9
            r13 = r8
            r14 = r6
            r15 = r5
            r16 = r4
            r17 = r3
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0.A0c(r1)
        L_0x00eb:
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            X.1XE r1 = r7.A09
            java.util.List r1 = X.C16030sJ.A08(r2, r1)
            r0.A0u(r1)
            if (r46 == 0) goto L_0x01f1
            java.lang.String r1 = r7.A0M
            com.whatsapp.jid.GroupJid r6 = com.whatsapp.jid.GroupJid.getNullable(r1)
            int r3 = r7.A00
            r2 = 4
            r1 = r3 & 4
            r4 = r39
            if (r1 != r2) goto L_0x01d0
            r2 = 2
            r1 = r3 & 2
            if (r1 != r2) goto L_0x0134
            java.lang.String r1 = r7.A0L
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            if (r1 != 0) goto L_0x012f
            r5 = 0
        L_0x0115:
            int r1 = r7.A00
            r2 = 8
            r1 = r1 & 8
            if (r1 != r2) goto L_0x012a
            java.lang.String r1 = r7.A0M
            X.0rv r8 = X.C15830rv.A02(r1)
        L_0x0123:
            r9 = r31
            boolean r3 = r9.A0I(r5)
            goto L_0x015d
        L_0x012a:
            X.1Vw r1 = r0.A11
            X.0rv r8 = r1.A00
            goto L_0x0123
        L_0x012f:
            com.whatsapp.jid.UserJid r5 = r1.getUserJid()
            goto L_0x0115
        L_0x0134:
            X.0rv r1 = r0.A0B()
            if (r1 != 0) goto L_0x013e
            X.1Vw r1 = r0.A11
            X.0rv r1 = r1.A00
        L_0x013e:
            com.whatsapp.jid.UserJid r5 = com.whatsapp.jid.UserJid.of(r1)
            goto L_0x0115
        L_0x0143:
            X.21Y r1 = X.AnonymousClass21Y.A03
            r21 = 0
            if (r3 != r1) goto L_0x0098
            r21 = 2
            goto L_0x0098
        L_0x014d:
            X.21Y r3 = X.AnonymousClass21Y.A01
            goto L_0x0092
        L_0x0151:
            X.21Y r3 = X.AnonymousClass21Y.A02
            goto L_0x0092
        L_0x0155:
            X.1cJ r1 = X.C30411cJ.A02
            goto L_0x0071
        L_0x0159:
            X.1cJ r1 = X.C30411cJ.A01
            goto L_0x0071
        L_0x015d:
            X.1iD r6 = r7.A0E     // Catch:{ 1W4 | 23S -> 0x01e6 }
            if (r6 != 0) goto L_0x0163
            X.1iD r6 = X.C33211iD.A0o     // Catch:{ 1W4 | 23S -> 0x01e6 }
        L_0x0163:
            java.lang.String r1 = r7.A0N     // Catch:{ 1W4 | 23S -> 0x01e6 }
            X.1Vw r2 = new X.1Vw     // Catch:{ 1W4 | 23S -> 0x01e6 }
            r2.<init>(r8, r1, r3)     // Catch:{ 1W4 | 23S -> 0x01e6 }
            r12 = r34
            boolean r1 = A0E(r12, r4, r6)     // Catch:{ 1W4 | 23S -> 0x01e6 }
            if (r1 != 0) goto L_0x01c4
            X.21S r21 = A01(r4, r6)     // Catch:{ 1W4 | 23S -> 0x01e6 }
            r25 = 0
            r27 = 0
            r28 = 1
            r29 = 1
            r20 = r41
            r19 = r40
            r24 = r45
            r10 = r32
            r8 = r30
            r11 = r33
            r13 = r35
            r14 = r36
            r15 = r37
            r16 = r38
            r22 = r6
            r23 = r2
            r18 = r5
            r17 = r4
            X.0tZ r2 = A05(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29)     // Catch:{ 1W4 | 23S -> 0x01e6 }
            if (r3 != 0) goto L_0x01ae
            if (r5 == 0) goto L_0x01a3
            goto L_0x01ab
        L_0x01a3:
            java.lang.String r1 = "null jid not from me"
            X.1W4 r0 = new X.1W4     // Catch:{ 1W4 | 23S -> 0x01e6 }
            r0.<init>((java.lang.String) r1)     // Catch:{ 1W4 | 23S -> 0x01e6 }
            throw r0     // Catch:{ 1W4 | 23S -> 0x01e6 }
        L_0x01ab:
            r2.A0b(r5)     // Catch:{ 1W4 | 23S -> 0x01e6 }
        L_0x01ae:
            byte r1 = r2.A10     // Catch:{ 1W4 | 23S -> 0x01e6 }
            if (r1 != 0) goto L_0x01bc
            java.lang.String r1 = r2.A0I()     // Catch:{ 1W4 | 23S -> 0x01e6 }
            if (r1 != 0) goto L_0x01bc
            java.lang.String r1 = r2.A0n     // Catch:{ 1W4 | 23S -> 0x01e6 }
            if (r1 == 0) goto L_0x01ec
        L_0x01bc:
            r1 = 2
            r2.A0X(r1)     // Catch:{ 1W4 | 23S -> 0x01e6 }
            r0.A0e(r2)     // Catch:{ 1W4 | 23S -> 0x01e6 }
            goto L_0x01ec
        L_0x01c4:
            r0 = 18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ 1W4 | 23S -> 0x01e6 }
            X.23S r0 = new X.23S     // Catch:{ 1W4 | 23S -> 0x01e6 }
            r0.<init>(r1)     // Catch:{ 1W4 | 23S -> 0x01e6 }
            throw r0     // Catch:{ 1W4 | 23S -> 0x01e6 }
        L_0x01d0:
            r2 = 8
            r1 = r3 & 8
            if (r1 != r2) goto L_0x01ec
            if (r6 == 0) goto L_0x01ec
            r2 = 0
            java.lang.String r5 = r7.A0J
            java.lang.String r1 = r7.A0K
            X.1rC r1 = X.C222617g.A00(r6, r5, r1, r2)
            r0.A0e(r1)
            goto L_0x01ec
        L_0x01e6:
            r1 = move-exception
            java.lang.String r0 = "MessageUtils/buildContextInfo/error quoted message was malformed, exception="
            com.whatsapp.util.Log.w(r0, r1)
        L_0x01ec:
            r0 = 508(0x1fc, float:7.12E-43)
            r4.A0C(r0)
        L_0x01f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41061vA.A0A(X.0so, X.0sK, X.0uc, X.0sG, X.0wH, X.0tz, X.013, X.1GG, X.173, X.0pd, X.0wS, X.1GF, X.21S, X.0tZ, X.1Vw, X.17g, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        if (r0 != 0) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(X.AnonymousClass27R r14, X.C33221iE r15) {
        /*
            if (r14 == 0) goto L_0x00db
            X.1Wm r0 = r15.A00
            X.1iD r0 = (X.C33211iD) r0
            X.21R r0 = r0.A0m
            if (r0 != 0) goto L_0x000c
            X.21R r0 = X.AnonymousClass21R.A05
        L_0x000c:
            X.1Wr r3 = r0.A0U()
            X.1Wm r0 = r3.A00
            X.21R r0 = (X.AnonymousClass21R) r0
            X.2uK r0 = r0.A04
            if (r0 != 0) goto L_0x001a
            X.2uK r0 = X.C58892uK.A09
        L_0x001a:
            X.1Wr r7 = r0.A0U()
            X.1Ww r11 = r14.A03
            if (r11 == 0) goto L_0x0031
            r7.A03()
            X.1Wm r1 = r7.A00
            X.2uK r1 = (X.C58892uK) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            r1.A06 = r11
        L_0x0031:
            X.1Ww r10 = r14.A02
            if (r10 == 0) goto L_0x0044
            r7.A03()
            X.1Wm r1 = r7.A00
            X.2uK r1 = (X.C58892uK) r1
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
            r1.A05 = r10
        L_0x0044:
            long r4 = r14.A01
            r12 = 0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x005b
            r7.A03()
            X.1Wm r1 = r7.A00
            X.2uK r1 = (X.C58892uK) r1
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            r1.A04 = r4
        L_0x005b:
            long r1 = r14.A00
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0070
            r7.A03()
            X.1Wm r6 = r7.A00
            X.2uK r6 = (X.C58892uK) r6
            int r0 = r6.A00
            r0 = r0 | 8
            r6.A00 = r0
            r6.A03 = r1
        L_0x0070:
            java.util.Set r9 = r14.A04
            if (r9 == 0) goto L_0x008d
            r7.A03()
            X.1Wm r8 = r7.A00
            X.2uK r8 = (X.C58892uK) r8
            X.27P r6 = r8.A07
            r0 = r6
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x008a
            X.27P r6 = X.C28541Wm.A0F(r6)
            r8.A07 = r6
        L_0x008a:
            X.C28591Ws.A01(r9, r6)
        L_0x008d:
            if (r11 != 0) goto L_0x009a
            if (r10 != 0) goto L_0x009a
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x009a
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x009b
        L_0x009a:
            r1 = 1
        L_0x009b:
            java.lang.String r0 = "Invalid adv device metadata"
            X.AnonymousClass00B.A0D(r0, r1)
            r3.A03()
            X.1Wm r1 = r3.A00
            X.21R r1 = (X.AnonymousClass21R) r1
            X.1Wm r0 = r7.A02()
            X.2uK r0 = (X.C58892uK) r0
            r1.A04 = r0
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            r3.A03()
            X.1Wm r2 = r3.A00
            X.21R r2 = (X.AnonymousClass21R) r2
            r1 = 2
            int r0 = r2.A00
            r0 = r0 | 2
            r2.A00 = r0
            r2.A01 = r1
            r15.A03()
            X.1Wm r2 = r15.A00
            X.1iD r2 = (X.C33211iD) r2
            X.1Wm r0 = r3.A02()
            X.21R r0 = (X.AnonymousClass21R) r0
            r2.A0m = r0
            int r1 = r2.A00
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 | r0
            r2.A00 = r1
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41061vA.A0B(X.27R, X.1iE):void");
    }

    public static void A0C(C455029b r2, String str) {
        if ((r2.A00 & 1) != 1 || TextUtils.isEmpty(r2.A09)) {
            StringBuilder sb = new StringBuilder("MessageUtil/validateHSM/error missing namespace for hsm, message.key=");
            sb.append(str);
            Log.w(sb.toString());
            throw new AnonymousClass23S(20);
        } else if ((r2.A00 & 2) != 2 || TextUtils.isEmpty(r2.A06)) {
            StringBuilder sb2 = new StringBuilder("MessageUtil/validateHSM/error missing element for hsm, message.key");
            sb2.append(str);
            Log.w(sb2.toString());
            throw new AnonymousClass23S(21);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        if ((r5 & 16384) == 16384) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0D(X.C16300so r7, X.C14710pd r8, X.C33211iD r9, java.util.List r10) {
        /*
            X.1iD r4 = A02(r8, r9)
            r6 = 0
            r3 = 1
            if (r4 == 0) goto L_0x0099
            boolean r2 = r9.A0d()
            if (r2 != 0) goto L_0x005b
            int r1 = r4.A00
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x005b
        L_0x0015:
            java.lang.String r0 = "outer.hasEphemeralMessage="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            r5.append(r2)
            java.lang.String r0 = ", inner.hasViewOnceMessage="
            r5.append(r0)
            int r2 = r4.A00
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r0
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = 0
            if (r2 != r1) goto L_0x002f
            r0 = 1
        L_0x002f:
            r5.append(r0)
            java.lang.String r0 = ", inner.hasEphemeralMessage="
            r5.append(r0)
            boolean r0 = r4.A0d()
            r5.append(r0)
            java.lang.String r0 = ", inner.hasDocumentWithCaptionMessage="
            r5.append(r0)
            int r2 = r4.A01
            r0 = 512(0x200, float:7.175E-43)
            r2 = r2 & r0
            r1 = 512(0x200, float:7.175E-43)
            r0 = 0
            if (r2 != r1) goto L_0x004e
            r0 = 1
        L_0x004e:
            r5.append(r0)
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = "isValidMessage/futureproof/type"
        L_0x0057:
            r7.AcB(r0, r1, r3)
            return r6
        L_0x005b:
            int r1 = r4.A01
            r0 = 512(0x200, float:7.175E-43)
            r1 = r1 & r0
            if (r1 == r0) goto L_0x0015
            boolean r0 = r4.A0d()
            if (r0 != 0) goto L_0x0015
            int r5 = r4.A00
            r1 = 2
            r0 = r5 & 2
            r4 = 1
            if (r0 == r1) goto L_0x0077
            r4 = 0
            r1 = 16384(0x4000, float:2.2959E-41)
            r0 = r5 & r1
            if (r0 != r1) goto L_0x0099
        L_0x0077:
            java.lang.String r0 = "hasSenderKeyDistributionMessage="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r4)
            java.lang.String r0 = ", hasFastRatchetKeySenderKeyDistributionMessage="
            r2.append(r0)
            r0 = 16384(0x4000, float:2.2959E-41)
            r5 = r5 & r0
            r1 = 16384(0x4000, float:2.2959E-41)
            r0 = 0
            if (r5 != r1) goto L_0x008f
            r0 = 1
        L_0x008f:
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "isValidMessage/futureproof/key"
            goto L_0x0057
        L_0x0099:
            int r0 = r10.size()
            if (r0 == r3) goto L_0x00a8
            if (r0 != 0) goto L_0x00aa
            int r0 = r9.A00
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x00aa
        L_0x00a8:
            r6 = 1
            return r6
        L_0x00aa:
            java.lang.String r1 = "MessageTypes="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "isValidMessage/numtype"
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41061vA.A0D(X.0so, X.0pd, X.1iD, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01bd, code lost:
        if ((r0.A00 & 2) == 2) goto L_0x01bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0E(X.C18180wH r4, X.C14710pd r5, X.C33211iD r6) {
        /*
            int r3 = X.C41071vB.A0J(r6)
            r2 = 1
            if (r3 <= 0) goto L_0x0019
            java.lang.String r1 = "MessageUtil/isUnknown/unknown tags="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
        L_0x0015:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0018:
            return r2
        L_0x0019:
            boolean r0 = r6.A0d()
            if (r0 == 0) goto L_0x0035
            X.2en r0 = r6.A0H
            r1 = r0
            if (r0 != 0) goto L_0x0026
            X.2en r0 = X.C52992en.A02
        L_0x0026:
            X.1iD r0 = r0.A01
            if (r0 != 0) goto L_0x002c
            X.1iD r0 = X.C33211iD.A0o
        L_0x002c:
            boolean r0 = r0.A0d()
            if (r0 == 0) goto L_0x021c
            java.lang.String r0 = "MessageUtil/isUnknown/recursiveEphemeralMessage"
            goto L_0x0015
        L_0x0035:
            int r0 = r6.A01
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x004a
            r1 = 854(0x356, float:1.197E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "MessageUtil/isUnknown/interactive message"
            goto L_0x0015
        L_0x004a:
            int r1 = r6.A00
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x006c
            X.2ua r0 = r6.A0R
            if (r0 != 0) goto L_0x0057
            X.2ua r0 = X.C59042ua.A09
        L_0x0057:
            X.42U r1 = r0.A0c()
            X.42U r0 = X.AnonymousClass42U.A01
            if (r1 != r0) goto L_0x006c
            r1 = 385(0x181, float:5.4E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "MessageUtil/isUnknown/listMessage product list"
            goto L_0x0015
        L_0x006c:
            int r0 = r6.A01
            r0 = r0 & 1
            if (r0 != r2) goto L_0x00c4
            X.2uG r3 = r6.A03
            if (r3 != 0) goto L_0x0078
            X.2uG r3 = X.C58852uG.A08
        L_0x0078:
            java.lang.String r0 = "review_and_pay"
            boolean r0 = A0F(r3, r0)
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = "review_order"
            boolean r0 = A0F(r3, r0)
            if (r0 == 0) goto L_0x0098
        L_0x008a:
            r1 = 833(0x341, float:1.167E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = "MessageUtil/isUnknown/JioRechargeNativeFlowMessage"
            goto L_0x0015
        L_0x0098:
            java.lang.String r0 = "payment_method"
            boolean r0 = A0F(r3, r0)
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "payment_status"
            boolean r0 = A0F(r3, r0)
            if (r0 == 0) goto L_0x00b6
        L_0x00a8:
            r1 = 1595(0x63b, float:2.235E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "MessageUtil/isUnknown/NonNativePaymentMethodOrderUpdateFlowMessage or MessageUtil/isUnknown/NonNativePaymentStatusOrderUpdateFlowMessage"
            goto L_0x0015
        L_0x00b6:
            r1 = 362(0x16a, float:5.07E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 == 0) goto L_0x00c4
            java.lang.String r0 = "MessageUtil/isUnknown/buttonsMessage"
            goto L_0x0015
        L_0x00c4:
            X.1Qr r3 = A00(r4, r6)
            if (r3 == 0) goto L_0x00d4
            boolean r0 = r3.A03(r5, r6)
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = "MessageUtil/isUnknown/nativeFlowNoviHubMessage"
            goto L_0x0015
        L_0x00d4:
            int r0 = r6.A01
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto L_0x00e9
            r1 = 544(0x220, float:7.62E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 != 0) goto L_0x00e9
            java.lang.String r0 = "MessageUtil/isUnknown/paymentInviteMessage"
            goto L_0x0015
        L_0x00e9:
            int r0 = r6.A01
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x010a
            X.220 r0 = r6.A0O
            if (r0 != 0) goto L_0x00f7
            X.220 r0 = X.AnonymousClass220.A07
        L_0x00f7:
            int r1 = r0.A01
            r0 = 4
            if (r1 != r0) goto L_0x010a
            r1 = 832(0x340, float:1.166E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 == 0) goto L_0x010a
            java.lang.String r0 = "MessageUtil/isUnknown/shopsStorefrontMessage"
            goto L_0x0015
        L_0x010a:
            int r0 = r6.A01
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x012b
            X.220 r0 = r6.A0O
            if (r0 != 0) goto L_0x0118
            X.220 r0 = X.AnonymousClass220.A07
        L_0x0118:
            int r1 = r0.A01
            r0 = 6
            if (r1 != r0) goto L_0x012b
            r1 = 1133(0x46d, float:1.588E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 == 0) goto L_0x012b
            java.lang.String r0 = "MessageUtil/isUnknown/nativeFlowMessage"
            goto L_0x0015
        L_0x012b:
            int r0 = r6.A01
            r1 = 32
            r0 = r0 & 32
            if (r0 != r1) goto L_0x0158
            r0 = 1435(0x59b, float:2.011E-42)
            X.0tM r4 = X.C16620tM.A02
            boolean r0 = r5.A0E(r4, r0)
            if (r0 == 0) goto L_0x0141
            java.lang.String r0 = "MessageUtil/isUnknown/interactiveResponseMessage"
            goto L_0x0015
        L_0x0141:
            X.2u4 r0 = r6.A0P
            if (r0 != 0) goto L_0x0147
            X.2u4 r0 = X.C58762u4.A05
        L_0x0147:
            int r1 = r0.A01
            r0 = 2
            if (r1 != r0) goto L_0x0158
            r0 = 1436(0x59c, float:2.012E-42)
            boolean r0 = r5.A0E(r4, r0)
            if (r0 == 0) goto L_0x0158
            java.lang.String r0 = "MessageUtil/isUnknown/interactiveResponseMessage/NativeFlowResponse"
            goto L_0x0015
        L_0x0158:
            int r0 = r6.A01
            r4 = 64
            r1 = r0 & 64
            r0 = 0
            if (r1 != r4) goto L_0x0162
            r0 = 1
        L_0x0162:
            java.lang.String r4 = "MessageUtil/isUnknown/pollCreationMessage"
            if (r0 == 0) goto L_0x0170
            boolean r0 = X.C34311k3.A01(r5)
            if (r0 != 0) goto L_0x0170
        L_0x016c:
            com.whatsapp.util.Log.e((java.lang.String) r4)
            return r2
        L_0x0170:
            int r1 = r6.A01
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x017f
            boolean r0 = X.C34311k3.A00(r5)
            if (r0 != 0) goto L_0x017f
            goto L_0x016c
        L_0x017f:
            int r1 = r6.A01
            r0 = 128(0x80, float:1.794E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x01bf
            X.2ex r0 = r6.A0Z
            if (r0 != 0) goto L_0x018c
            X.2ex r0 = X.C53082ex.A05
        L_0x018c:
            int r0 = X.C41071vB.A0J(r0)
            if (r0 > 0) goto L_0x0018
            X.2ex r0 = r6.A0Z
            if (r0 != 0) goto L_0x0198
            X.2ex r0 = X.C53082ex.A05
        L_0x0198:
            int r0 = r0.A00
            r4 = 2
            r0 = r0 & 2
            if (r0 != r4) goto L_0x01b3
            boolean r0 = X.C34311k3.A01(r5)
            if (r0 != 0) goto L_0x01b3
            r1 = 1541(0x605, float:2.16E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 != 0) goto L_0x01b3
            java.lang.String r0 = "MessageUtil/isUnknown/pollVoteMessage"
            goto L_0x0015
        L_0x01b3:
            X.2ex r0 = r6.A0Z
            if (r0 != 0) goto L_0x01b9
            X.2ex r0 = X.C53082ex.A05
        L_0x01b9:
            int r0 = r0.A00
            r0 = r0 & 2
            if (r0 != r4) goto L_0x0018
        L_0x01bf:
            int r4 = r6.A01
            r1 = 256(0x100, float:3.59E-43)
            r0 = r4 & r1
            if (r0 != r1) goto L_0x01ce
            boolean r0 = X.C34321k4.A04(r5)
            r0 = r0 ^ 1
            return r0
        L_0x01ce:
            r0 = 2048(0x800, float:2.87E-42)
            r4 = r4 & r0
            if (r4 != r0) goto L_0x01de
            r1 = 1710(0x6ae, float:2.396E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 != 0) goto L_0x01de
            return r2
        L_0x01de:
            int r1 = r6.A01
            r0 = 16384(0x4000, float:2.2959E-41)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x01f0
            r1 = 2802(0xaf2, float:3.926E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 != 0) goto L_0x01f0
            return r2
        L_0x01f0:
            int r1 = r6.A01
            r0 = 8192(0x2000, float:1.14794E-41)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0202
            r1 = 2189(0x88d, float:3.067E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 != 0) goto L_0x0202
            return r2
        L_0x0202:
            boolean r0 = r6.A0f()
            if (r0 == 0) goto L_0x022b
            if (r3 == 0) goto L_0x022b
            boolean r0 = r3 instanceof X.AnonymousClass1R9
            if (r0 == 0) goto L_0x022b
            r1 = 2885(0xb45, float:4.043E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 == 0) goto L_0x022b
            java.lang.String r0 = "MessageUtil/isUnknown/templateNativeFlowMessage"
            goto L_0x0015
        L_0x021c:
            if (r1 != 0) goto L_0x0220
            X.2en r1 = X.C52992en.A02
        L_0x0220:
            X.1iD r0 = r1.A01
            if (r0 != 0) goto L_0x0226
            X.1iD r0 = X.C33211iD.A0o
        L_0x0226:
            boolean r0 = A0E(r4, r5, r0)
            return r0
        L_0x022b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41061vA.A0E(X.0wH, X.0pd, X.1iD):boolean");
    }

    public static boolean A0F(C58852uG r3, String str) {
        if (r3.A03.size() != 1) {
            return false;
        }
        r3.A03.get(0);
        C58382tP r0 = ((AnonymousClass2u3) r3.A03.get(0)).A03;
        if (r0 == null) {
            r0 = C58382tP.A03;
        }
        if (!str.equals(r0.A01)) {
            return false;
        }
        C58382tP r02 = ((AnonymousClass2u3) r3.A03.get(0)).A03;
        if (r02 == null) {
            r02 = C58382tP.A03;
        }
        return !TextUtils.isEmpty(r02.A02);
    }

    public static boolean A0G(C33211iD r2) {
        int i2 = r2.A01;
        return (i2 & 16) == 16 || (i2 & 4096) == 4096;
    }

    public static boolean A0H(C33231iF r2) {
        return (r2.A00 & 4) == 4 && !TextUtils.isEmpty(r2.A01) && (r2.A00 & 1) == 1 && !TextUtils.isEmpty(r2.A03) && C15830rv.A02(r2.A03) != null;
    }

    public static boolean A0I(C16740tZ r2) {
        byte b2 = r2.A10;
        return b2 == 11 || b2 == 31;
    }
}
