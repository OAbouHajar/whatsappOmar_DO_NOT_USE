package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.1ux  reason: invalid class name and case insensitive filesystem */
public class C40951ux {
    public static C40971uz A00(C16040sK r3, AnonymousClass2G2 r4, C40961uy r5, C16200sd r6, AnonymousClass12W r7, C18790xG r8, AnonymousClass12X r9, C16990u0 r10, C16960tx r11, AnonymousClass12V r12, Boolean bool) {
        C16960tx r2 = r11;
        int i2 = r11.version;
        AnonymousClass12V r112 = r12;
        if (i2 == C16960tx.A08.version) {
            return new C59352x7(r4, r7, r9, r12);
        }
        if (i2 == C16960tx.A04.version) {
            return new C59392xB(r3, r4, r5, r6, r7, r8, r9, r10, r112);
        }
        if (i2 == C16960tx.A05.version) {
            return new C70843hp(r3, r4, r5, r6, r7, r8, r9, r10, r112);
        }
        Boolean bool2 = bool;
        if (i2 == C16960tx.A06.version) {
            return new C59402xC(r3, r4, r5, r6, r7, r8, r9, r10, r112, bool2, (Long) null);
        }
        if (i2 == C16960tx.A07.version) {
            return new C59362x8(r3, r4, r5, r6, r7, r8, r9, r10, r112, bool2);
        }
        StringBuilder sb = new StringBuilder("BackupFile/verify-integrity/unknown-version: ");
        sb.append(r2);
        sb.append(" ");
        sb.append(r4);
        r10.A00(sb.toString(), 4);
        throw new IOException("BackupFile/verify-integrity/unknown-version");
    }

    public static C40971uz A01(C16040sK r11, C40961uy r12, C16200sd r13, AnonymousClass12W r14, C18790xG r15, AnonymousClass12X r16, C16990u0 r17, C16960tx r18, AnonymousClass12V r19, File file) {
        return A00(r11, new AnonymousClass2G1(file), r12, r13, r14, r15, r16, r17, r18, r19, (Boolean) null);
    }
}
