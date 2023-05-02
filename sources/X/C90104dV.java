package X;

import java.util.HashMap;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

/* renamed from: X.4dV  reason: invalid class name and case insensitive filesystem */
public class C90104dV {
    public static String A07 = C90574eO.class.getName().replace(FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final HashMap A04 = AnonymousClass000.A0x();
    public final C795340f A05;
    public final C88314aI[] A06;

    public C90104dV(Class cls, C795340f r6, C88314aI[] r7) {
        String concat;
        this.A06 = r7;
        this.A05 = r6;
        String name = cls.getName();
        this.A02 = name;
        if (name.startsWith("java.")) {
            StringBuilder A0r = AnonymousClass000.A0r("net.minidev.asm.");
            A0r.append(name);
            concat = AnonymousClass000.A0h("AccAccess", A0r);
        } else {
            concat = name.concat("AccAccess");
        }
        this.A00 = concat;
        this.A01 = concat.replace(FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX);
        this.A03 = name.replace(FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX);
    }

    public static final void A00(C89384c4 r5, AnonymousClass4XT r6, int i2) {
        r6.A06(21, 2);
        if (i2 == 0) {
            r6.A0C(r5, 154);
            return;
        }
        if (i2 == 1) {
            r6.A03(4);
        } else if (i2 == 2) {
            r6.A03(5);
        } else {
            int i3 = 6;
            if (i2 != 3) {
                if (i2 == 4) {
                    i3 = 7;
                } else if (i2 == 5) {
                    i3 = 8;
                } else if (i2 >= 6) {
                    r6.A04(16, i2);
                } else {
                    throw AnonymousClass000.A0a("non supported negative values");
                }
            }
            r6.A03(i3);
        }
        r6.A0C(r5, 160);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00fa, code lost:
        if (r7 < 0) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C88314aI r21, X.AnonymousClass4XT r22) {
        /*
            r20 = this;
            r4 = 25
            r3 = 1
            r14 = r22
            r14.A06(r4, r3)
            r7 = r20
            java.lang.String r5 = r7.A03
            r9 = 192(0xc0, float:2.69E-43)
            r14.A07(r9, r5)
            r2 = 3
            r14.A06(r4, r2)
            r6 = r21
            java.lang.Class r10 = r6.A00
            X.4ew r13 = X.C90854ew.A02(r10)
            java.lang.String r0 = r10.getName()
            r11 = 46
            r8 = 47
            java.lang.String r1 = r0.replace(r11, r8)
            java.util.HashMap r0 = r7.A04
            java.lang.Object r7 = r0.get(r10)
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            if (r7 == 0) goto L_0x0073
            java.lang.Class r0 = r7.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r15 = r0.replace(r11, r8)
            java.lang.String r16 = r7.getName()
            java.lang.String r17 = X.C90854ew.A01(r7)
            r18 = 184(0xb8, float:2.58E-43)
            r19 = 0
            r14.A0A(r15, r16, r17, r18, r19)
        L_0x004e:
            java.lang.reflect.Method r0 = r6.A04
            if (r0 != 0) goto L_0x0063
            r2 = 181(0xb5, float:2.54E-43)
            java.lang.String r1 = r6.A01
            java.lang.String r0 = r13.A06()
            r14.A09(r5, r1, r0, r2)
        L_0x005d:
            r0 = 177(0xb1, float:2.48E-43)
            r14.A03(r0)
            return
        L_0x0063:
            java.lang.String r7 = X.C90854ew.A01(r0)
            r8 = 182(0xb6, float:2.55E-43)
            java.lang.String r6 = r0.getName()
            r9 = 0
            r4 = r14
            r4.A0A(r5, r6, r7, r8, r9)
            goto L_0x005d
        L_0x0073:
            boolean r0 = r10.isEnum()
            r7 = 58
            r8 = 198(0xc6, float:2.77E-43)
            if (r0 == 0) goto L_0x00fd
            X.4c4 r0 = new X.4c4
            r0.<init>()
            r14.A0C(r0, r8)
            r14.A06(r4, r2)
            r18 = 182(0xb6, float:2.55E-43)
            java.lang.String r15 = "java/lang/Object"
            java.lang.String r16 = "toString"
            java.lang.String r17 = "()Ljava/lang/String;"
            r19 = 0
            r14.A0A(r15, r16, r17, r18, r19)
            r18 = 184(0xb8, float:2.58E-43)
            java.lang.String r8 = "(Ljava/lang/String;)L"
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0r(r8)
            r9.append(r1)
            java.lang.String r8 = ";"
            java.lang.String r17 = X.AnonymousClass000.A0h(r8, r9)
            java.lang.String r16 = "valueOf"
            r15 = r1
        L_0x00a9:
            r19 = 0
            r14.A0A(r15, r16, r17, r18, r19)
            r14.A06(r7, r2)
            r14.A0B(r0)
            r12 = 0
            r11 = r14
            X.5HU r11 = (X.AnonymousClass5HU) r11
            int r10 = r11.A0d
            if (r10 != r2) goto L_0x00d5
            X.AnonymousClass4XT.A01(r11)
            X.AnonymousClass4XT.A02(r11)
        L_0x00c2:
            X.AnonymousClass5HU.A03(r11, r12)
        L_0x00c5:
            r14.A06(r4, r3)
            r0 = 192(0xc0, float:2.69E-43)
            r14.A07(r0, r5)
            r14.A06(r4, r2)
            r14.A07(r0, r1)
            goto L_0x004e
        L_0x00d5:
            X.4XW r0 = r11.A0l
            int r7 = r0.A03
            r0 = 50
            if (r7 < r0) goto L_0x011e
            X.4cD r9 = r11.A0Q
            if (r9 != 0) goto L_0x00f2
            X.4cD r9 = X.C89454cD.A00()
            r11.A0Q = r9
            X.4cD r8 = r11.A0k
            int r7 = r8.A00
        L_0x00eb:
            X.C89454cD.A01(r9, r7)
            X.AnonymousClass4XT.A00(r8, r11, r10)
            goto L_0x00c2
        L_0x00f2:
            X.4cD r8 = r11.A0k
            int r7 = r8.A00
            int r0 = r11.A0A
            int r7 = r7 - r0
            int r7 = r7 - r3
            if (r7 >= 0) goto L_0x00eb
            goto L_0x00c5
        L_0x00fd:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0119
            X.4c4 r0 = new X.4c4
            r0.<init>()
            r14.A0C(r0, r8)
            r14.A06(r4, r2)
            r18 = 182(0xb6, float:2.55E-43)
            java.lang.String r15 = "java/lang/Object"
            java.lang.String r16 = "toString"
            java.lang.String r17 = "()Ljava/lang/String;"
            goto L_0x00a9
        L_0x0119:
            r14.A07(r9, r1)
            goto L_0x004e
        L_0x011e:
            java.lang.String r0 = "Class versions V1_5 or less must use F_NEW frames."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90104dV.A01(X.4aI, X.4XT):void");
    }

    public final void A02(AnonymousClass4XT r14) {
        String replace = NoSuchFieldException.class.getName().replace(FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX);
        AnonymousClass4XT r2 = r14;
        r14.A07(187, replace);
        r14.A03(89);
        StringBuilder A0r = AnonymousClass000.A0r("mapping ");
        A0r.append(this.A02);
        r14.A08(AnonymousClass000.A0h(" failed to map field:", A0r));
        r14.A06(21, 2);
        r2.A0A("java/lang/Integer", "toString", "(I)Ljava/lang/String;", 184, false);
        r2.A0A("java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", 182, false);
        r14.A0A(replace, "<init>", "(Ljava/lang/String;)V", 183, false);
        r14.A03(191);
    }

    public final void A03(AnonymousClass4XT r14) {
        String replace = NoSuchFieldException.class.getName().replace(FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX);
        r14.A07(187, replace);
        r14.A03(89);
        StringBuilder A0r = AnonymousClass000.A0r("mapping ");
        A0r.append(this.A02);
        r14.A08(AnonymousClass000.A0h(" failed to map field:", A0r));
        r14.A06(25, 2);
        r14.A0A("java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", 182, false);
        r14.A0A(replace, "<init>", "(Ljava/lang/String;)V", 183, false);
        r14.A03(191);
    }
}
