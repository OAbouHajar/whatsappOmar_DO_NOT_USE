package X;

import android.database.Cursor;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0ur  reason: invalid class name and case insensitive filesystem */
public class C17300ur {
    public final C16000sG A00;
    public final AnonymousClass12G A01;
    public final C16820th A02;
    public final C15810rt A03;
    public final C16460t6 A04;
    public final C16070sO A05;
    public final AnonymousClass1HF A06;
    public final C14710pd A07;
    public final AnonymousClass1RV A08;
    public final AnonymousClass1CF A09;

    public C17300ur(C16000sG r1, AnonymousClass12G r2, C16820th r3, C15810rt r4, C16460t6 r5, C16070sO r6, AnonymousClass1HF r7, C14710pd r8, AnonymousClass1RV r9, AnonymousClass1CF r10) {
        this.A07 = r8;
        this.A03 = r4;
        this.A00 = r1;
        this.A06 = r7;
        this.A09 = r10;
        this.A04 = r5;
        this.A08 = r9;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
    }

    public static final C33241iG A00(C38541qx r3) {
        C33241iG r2 = (C33241iG) C33231iF.A05.A0U();
        C28381Vw r1 = r3.A11;
        r2.A07(C16030sJ.A03(r1.A00));
        r2.A08(r1.A02);
        r2.A05(r1.A01);
        C15830rv A0B = r3.A0B();
        if (A0B != null) {
            r2.A06(A0B.getRawString());
        }
        return r2;
    }

    public static C28381Vw A01(C33231iF r4) {
        return new C28381Vw(C15830rv.A02(r4.A03), r4.A01, r4.A04);
    }

    /* JADX WARNING: type inference failed for: r0v97, types: [X.1WR] */
    /* JADX WARNING: type inference failed for: r0v140 */
    /* JADX WARNING: type inference failed for: r0v141 */
    /* JADX WARNING: type inference failed for: r0v142 */
    /* JADX WARNING: type inference failed for: r0v143 */
    /* JADX WARNING: type inference failed for: r0v144 */
    /* JADX WARNING: type inference failed for: r0v145 */
    /* JADX WARNING: type inference failed for: r9v8, types: [X.24f] */
    /* JADX WARNING: type inference failed for: r9v9, types: [X.24Y] */
    /* JADX WARNING: type inference failed for: r0v146 */
    /* JADX WARNING: type inference failed for: r0v147 */
    /* JADX WARNING: type inference failed for: r0v148 */
    /* JADX WARNING: type inference failed for: r0v149 */
    /* JADX WARNING: type inference failed for: r0v150 */
    /* JADX WARNING: type inference failed for: r0v151 */
    /* JADX WARNING: type inference failed for: r0v152 */
    /* JADX WARNING: type inference failed for: r0v153 */
    /* JADX WARNING: type inference failed for: r0v154 */
    /* JADX WARNING: type inference failed for: r0v155 */
    /* JADX WARNING: type inference failed for: r0v156 */
    /* JADX WARNING: type inference failed for: r0v157 */
    /* JADX WARNING: type inference failed for: r9v10, types: [X.24Q] */
    /* JADX WARNING: type inference failed for: r0v158 */
    /* JADX WARNING: type inference failed for: r0v159 */
    /* JADX WARNING: type inference failed for: r0v160 */
    /* JADX WARNING: type inference failed for: r0v161 */
    /* JADX WARNING: type inference failed for: r0v162 */
    /* JADX WARNING: type inference failed for: r0v163 */
    /* JADX WARNING: type inference failed for: r0v164 */
    /* JADX WARNING: type inference failed for: r9v11, types: [X.23m] */
    /* JADX WARNING: type inference failed for: r9v12, types: [X.23m] */
    /* JADX WARNING: type inference failed for: r0v165 */
    /* JADX WARNING: type inference failed for: r0v166 */
    /* JADX WARNING: type inference failed for: r0v167 */
    /* JADX WARNING: type inference failed for: r0v168 */
    /* JADX WARNING: type inference failed for: r0v169 */
    /* JADX WARNING: type inference failed for: r0v170 */
    /* JADX WARNING: type inference failed for: r0v171 */
    /* JADX WARNING: type inference failed for: r0v172 */
    /* JADX WARNING: type inference failed for: r0v173 */
    /* JADX WARNING: type inference failed for: r0v174 */
    /* JADX WARNING: type inference failed for: r0v175 */
    /* JADX WARNING: type inference failed for: r0v176 */
    /* JADX WARNING: type inference failed for: r9v13, types: [X.24Z] */
    /* JADX WARNING: type inference failed for: r0v177 */
    /* JADX WARNING: type inference failed for: r0v178 */
    /* JADX WARNING: type inference failed for: r0v179 */
    /* JADX WARNING: type inference failed for: r0v180 */
    /* JADX WARNING: type inference failed for: r0v181 */
    /* JADX WARNING: type inference failed for: r0v182 */
    /* JADX WARNING: type inference failed for: r0v183 */
    /* JADX WARNING: type inference failed for: r0v184 */
    /* JADX WARNING: type inference failed for: r0v185 */
    /* JADX WARNING: type inference failed for: r0v186 */
    /* JADX WARNING: type inference failed for: r0v187 */
    /* JADX WARNING: type inference failed for: r0v188 */
    /* JADX WARNING: type inference failed for: r0v189 */
    /* JADX WARNING: type inference failed for: r0v190 */
    /* JADX WARNING: type inference failed for: r0v191 */
    /* JADX WARNING: type inference failed for: r0v192 */
    /* JADX WARNING: type inference failed for: r0v193 */
    /* JADX WARNING: type inference failed for: r0v194 */
    /* JADX WARNING: type inference failed for: r0v195 */
    /* JADX WARNING: type inference failed for: r0v196 */
    /* JADX WARNING: type inference failed for: r0v197 */
    /* JADX WARNING: type inference failed for: r0v198 */
    /* JADX WARNING: type inference failed for: r0v199 */
    /* JADX WARNING: type inference failed for: r0v200 */
    /* JADX WARNING: type inference failed for: r13v8, types: [X.23q] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C445124j A02(X.C30441cM r38) {
        /*
            r37 = this;
            r7 = 0
            r8 = r38
            if (r38 != 0) goto L_0x000b
            java.lang.String r0 = "invalid data in web message node: WMI is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r7
        L_0x000b:
            r0 = r37
            X.1CF r1 = r0.A09
            X.23l r0 = r8.A0c()
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x023e;
                case 2: goto L_0x001a;
                case 3: goto L_0x0256;
                case 4: goto L_0x01f7;
                case 5: goto L_0x01f7;
                case 6: goto L_0x01f7;
                case 7: goto L_0x01f7;
                case 8: goto L_0x01f7;
                case 9: goto L_0x001a;
                case 10: goto L_0x001a;
                case 11: goto L_0x001a;
                case 12: goto L_0x001a;
                case 13: goto L_0x001a;
                case 14: goto L_0x001a;
                case 15: goto L_0x001a;
                case 16: goto L_0x01f7;
                case 17: goto L_0x01f7;
                case 18: goto L_0x01f7;
                case 19: goto L_0x001a;
                case 20: goto L_0x00b9;
                case 21: goto L_0x011e;
                case 22: goto L_0x015f;
                case 23: goto L_0x0105;
                case 24: goto L_0x0168;
                case 25: goto L_0x0171;
                case 26: goto L_0x017a;
                case 27: goto L_0x0127;
                case 28: goto L_0x00c1;
                case 29: goto L_0x00e3;
                case 30: goto L_0x00eb;
                case 31: goto L_0x00d1;
                case 32: goto L_0x00db;
                case 33: goto L_0x014d;
                case 34: goto L_0x010e;
                case 35: goto L_0x0127;
                case 36: goto L_0x00c1;
                case 37: goto L_0x001a;
                case 38: goto L_0x0132;
                case 39: goto L_0x01da;
                case 40: goto L_0x0261;
                case 41: goto L_0x0261;
                case 42: goto L_0x0156;
                case 43: goto L_0x00c9;
                case 44: goto L_0x0183;
                case 45: goto L_0x0261;
                case 46: goto L_0x0261;
                case 47: goto L_0x001a;
                case 48: goto L_0x001a;
                case 49: goto L_0x001a;
                case 50: goto L_0x001a;
                case 51: goto L_0x001a;
                case 52: goto L_0x001a;
                case 53: goto L_0x001a;
                case 54: goto L_0x026c;
                case 55: goto L_0x026c;
                case 56: goto L_0x026c;
                case 57: goto L_0x001a;
                case 58: goto L_0x001a;
                case 59: goto L_0x001a;
                case 60: goto L_0x01f7;
                case 61: goto L_0x01f7;
                case 62: goto L_0x001a;
                case 63: goto L_0x001a;
                case 64: goto L_0x01f7;
                case 65: goto L_0x01f7;
                case 66: goto L_0x001a;
                case 67: goto L_0x001a;
                case 68: goto L_0x001a;
                case 69: goto L_0x01d1;
                case 70: goto L_0x01e5;
                case 71: goto L_0x01ee;
                case 72: goto L_0x0212;
                case 73: goto L_0x013b;
                case 74: goto L_0x001a;
                case 75: goto L_0x0209;
                case 76: goto L_0x0200;
                case 77: goto L_0x0200;
                case 78: goto L_0x0200;
                case 79: goto L_0x01da;
                case 80: goto L_0x0200;
                case 81: goto L_0x01da;
                case 82: goto L_0x0200;
                case 83: goto L_0x0200;
                case 84: goto L_0x01da;
                case 85: goto L_0x0200;
                case 86: goto L_0x01da;
                case 87: goto L_0x0200;
                case 88: goto L_0x0200;
                case 89: goto L_0x0200;
                case 90: goto L_0x0200;
                case 91: goto L_0x0200;
                case 92: goto L_0x0200;
                case 93: goto L_0x0200;
                case 94: goto L_0x01da;
                case 95: goto L_0x0200;
                case 96: goto L_0x01da;
                case 97: goto L_0x0200;
                case 98: goto L_0x0200;
                case 99: goto L_0x01f7;
                case 100: goto L_0x01f7;
                case 101: goto L_0x0200;
                case 102: goto L_0x0200;
                case 103: goto L_0x0200;
                case 104: goto L_0x0200;
                case 105: goto L_0x0200;
                case 106: goto L_0x0200;
                case 107: goto L_0x0200;
                case 108: goto L_0x0200;
                case 109: goto L_0x0200;
                case 110: goto L_0x0200;
                case 111: goto L_0x0200;
                case 112: goto L_0x0200;
                case 113: goto L_0x0200;
                case 114: goto L_0x0200;
                case 115: goto L_0x0200;
                case 116: goto L_0x0200;
                case 117: goto L_0x0200;
                case 118: goto L_0x001a;
                case 119: goto L_0x001a;
                case 120: goto L_0x001a;
                case 121: goto L_0x001a;
                case 122: goto L_0x01c8;
                case 123: goto L_0x001a;
                case 124: goto L_0x001a;
                case 125: goto L_0x001a;
                case 126: goto L_0x01da;
                case 127: goto L_0x01da;
                case 128: goto L_0x0209;
                case 129: goto L_0x0209;
                case 130: goto L_0x021b;
                case 131: goto L_0x0144;
                case 132: goto L_0x0226;
                case 133: goto L_0x0277;
                case 134: goto L_0x028b;
                case 135: goto L_0x02d3;
                case 136: goto L_0x030b;
                case 137: goto L_0x029f;
                case 138: goto L_0x02ef;
                case 139: goto L_0x0327;
                case 140: goto L_0x001a;
                case 141: goto L_0x0280;
                case 142: goto L_0x02c8;
                case 143: goto L_0x03a4;
                case 144: goto L_0x01bf;
                case 145: goto L_0x01b6;
                case 146: goto L_0x03bf;
                case 147: goto L_0x00f3;
                case 148: goto L_0x00fc;
                case 149: goto L_0x0361;
                case 150: goto L_0x018c;
                case 151: goto L_0x036c;
                case 152: goto L_0x03ad;
                case 153: goto L_0x001a;
                case 154: goto L_0x03b6;
                case 155: goto L_0x001a;
                case 156: goto L_0x001a;
                case 157: goto L_0x03cc;
                case 158: goto L_0x0343;
                case 159: goto L_0x0384;
                case 160: goto L_0x001a;
                case 161: goto L_0x0399;
                default: goto L_0x001a;
            }
        L_0x001a:
            X.0t3 r0 = r1.A0H
            r19 = r0
            X.0pd r0 = r1.A0Q
            r16 = r0
            X.0so r0 = r1.A00
            r36 = r0
            X.0sK r0 = r1.A0B
            r35 = r0
            X.0tz r0 = r1.A0I
            r20 = r0
            X.0sG r0 = r1.A0D
            r17 = r0
            X.013 r15 = r1.A0J
            X.17g r14 = r1.A0X
            X.0wS r13 = r1.A0U
            X.1GD r12 = r1.A0V
            X.1GE r11 = r1.A0S
            X.1GF r10 = r1.A0W
            X.17K r9 = r1.A0M
            X.0wH r6 = r1.A0F
            X.15Y r5 = r1.A0T
            X.0uc r4 = r1.A0C
            X.173 r3 = r1.A0P
            X.1GG r2 = r1.A0K
            X.1GC r1 = r1.A0Z
            r34 = 0
            X.23q r0 = new X.23q
            r22 = r2
            r23 = r9
            r24 = r3
            r25 = r16
            r26 = r11
            r27 = r5
            r28 = r13
            r29 = r12
            r30 = r10
            r31 = r7
            r32 = r14
            r33 = r1
            r16 = r4
            r18 = r6
            r21 = r15
            r13 = r0
            r14 = r36
            r15 = r35
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x0076:
            X.1iF r4 = r8.A0M
            if (r4 != 0) goto L_0x007c
            X.1iF r4 = X.C33231iF.A05
        L_0x007c:
            int r1 = r4.A00
            r3 = 1
            r1 = r1 & 1
            if (r1 == r3) goto L_0x0084
            r3 = 0
        L_0x0084:
            java.lang.String r2 = "invalid data in web message node: key is malformed"
            if (r3 == 0) goto L_0x00b3
            X.1Vw r5 = A01(r4)
            X.0rv r1 = r5.A00
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = r5.A01
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00b3
            int r1 = r8.A01
            r2 = 4
            r1 = r1 & 4
            if (r1 != r2) goto L_0x00b0
            long r1 = r8.A0A
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
        L_0x00a4:
            X.0tZ r3 = r0.A02(r8, r5, r1)
            if (r3 != 0) goto L_0x03d5
            java.lang.String r0 = "Unable to read FMessage from WMI."
        L_0x00ac:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r7
        L_0x00b0:
            r1 = 0
            goto L_0x00a4
        L_0x00b3:
            com.whatsapp.util.Log.w((java.lang.String) r2)
            java.lang.String r0 = "WebMessageInfo key is malformed."
            goto L_0x00ac
        L_0x00b9:
            X.0so r1 = r1.A00
            X.23y r0 = new X.23y
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x00c1:
            X.0so r1 = r1.A00
            X.23r r0 = new X.23r
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x00c9:
            X.0so r1 = r1.A00
            X.241 r0 = new X.241
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x00d1:
            X.0so r2 = r1.A00
            X.0sK r1 = r1.A0B
            X.243 r0 = new X.243
            r0.<init>(r2, r1, r7)
            goto L_0x0076
        L_0x00db:
            X.0so r1 = r1.A00
            X.23n r0 = new X.23n
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x00e3:
            X.0so r1 = r1.A00
            X.23z r0 = new X.23z
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x00eb:
            X.0so r1 = r1.A00
            X.240 r0 = new X.240
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x00f3:
            X.0so r1 = r1.A00
            X.24T r0 = new X.24T
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x00fc:
            X.0so r1 = r1.A00
            X.24U r0 = new X.24U
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x0105:
            X.0so r1 = r1.A00
            X.245 r0 = new X.245
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x010e:
            X.0so r2 = r1.A00
            X.0sK r0 = r1.A0B
            r0.A0B()
            X.1ZT r1 = r0.A05
            X.23s r0 = new X.23s
            r0.<init>(r2, r1, r7)
            goto L_0x0076
        L_0x011e:
            X.0so r1 = r1.A00
            X.23j r0 = new X.23j
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x0127:
            X.0so r2 = r1.A00
            X.0sK r1 = r1.A0B
            X.23k r0 = new X.23k
            r0.<init>(r2, r1, r7)
            goto L_0x0076
        L_0x0132:
            X.0so r1 = r1.A00
            X.242 r0 = new X.242
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x013b:
            X.0so r1 = r1.A00
            X.24H r0 = new X.24H
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x0144:
            X.0so r1 = r1.A00
            X.24O r0 = new X.24O
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x014d:
            X.0so r1 = r1.A00
            X.23w r0 = new X.23w
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x0156:
            X.0so r1 = r1.A00
            X.248 r0 = new X.248
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x015f:
            X.0so r1 = r1.A00
            X.23p r0 = new X.23p
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x0168:
            X.0so r1 = r1.A00
            X.247 r0 = new X.247
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x0171:
            X.0so r1 = r1.A00
            X.249 r0 = new X.249
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x017a:
            X.0so r1 = r1.A00
            X.24A r0 = new X.24A
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x0183:
            X.0so r1 = r1.A00
            X.24B r0 = new X.24B
            r0.<init>(r1)
            goto L_0x0076
        L_0x018c:
            X.0pd r3 = r1.A0Q
            r2 = 2857(0xb29, float:4.004E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r2)
            if (r0 == 0) goto L_0x01a1
            X.0so r1 = r1.A00
            X.24h r0 = new X.24h
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x01a1:
            X.0so r4 = r1.A00
            X.0sG r3 = r1.A0D
            X.0sP r2 = r1.A0E
            X.122 r1 = r1.A0Y
            X.24Z r0 = new X.24Z
            r9 = r0
            r10 = r4
            r11 = r3
            r12 = r2
            r13 = r7
            r14 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0076
        L_0x01b6:
            X.0so r1 = r1.A00
            X.24W r0 = new X.24W
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x01bf:
            X.0so r1 = r1.A00
            X.24V r0 = new X.24V
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x01c8:
            X.0so r1 = r1.A00
            X.24I r0 = new X.24I
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x01d1:
            X.0so r1 = r1.A00
            X.24F r0 = new X.24F
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x01da:
            X.0so r2 = r1.A00
            X.0zl r1 = r1.A0R
            X.24L r0 = new X.24L
            r0.<init>(r2, r1, r7)
            goto L_0x0076
        L_0x01e5:
            X.0so r1 = r1.A00
            X.24D r0 = new X.24D
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x01ee:
            X.0so r1 = r1.A00
            X.24E r0 = new X.24E
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x01f7:
            X.0so r1 = r1.A00
            X.246 r0 = new X.246
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x0200:
            X.0so r1 = r1.A00
            X.24J r0 = new X.24J
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x0209:
            X.0so r1 = r1.A00
            X.24N r0 = new X.24N
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x0212:
            X.0so r1 = r1.A00
            X.24G r0 = new X.24G
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x021b:
            X.0so r2 = r1.A00
            X.0sK r1 = r1.A0B
            X.24M r0 = new X.24M
            r0.<init>(r2, r1, r7)
            goto L_0x0076
        L_0x0226:
            X.0pd r3 = r1.A0Q
            X.0so r2 = r1.A00
            X.17g r1 = r1.A0X
            X.23l r12 = X.C442723l.A01
            java.lang.String r15 = "ADMIN_REVOKED_WEB_QUERY"
            r16 = 64
            X.23m r0 = new X.23m
            r9 = r0
            r10 = r2
            r11 = r3
            r13 = r1
            r14 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0076
        L_0x023e:
            X.0pd r3 = r1.A0Q
            X.0so r2 = r1.A00
            X.17g r1 = r1.A0X
            X.23l r12 = X.C442723l.A2J
            java.lang.String r15 = "REVOKED_WEB_QUERY"
            r16 = 15
            X.23m r0 = new X.23m
            r9 = r0
            r10 = r2
            r11 = r3
            r13 = r1
            r14 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0076
        L_0x0256:
            X.0so r2 = r1.A00
            X.17g r1 = r1.A0X
            X.23o r0 = new X.23o
            r0.<init>(r2, r1, r7)
            goto L_0x0076
        L_0x0261:
            X.0so r2 = r1.A00
            X.17g r1 = r1.A0X
            X.23h r0 = new X.23h
            r0.<init>(r2, r1, r7)
            goto L_0x0076
        L_0x026c:
            X.0so r2 = r1.A00
            X.15Y r1 = r1.A0T
            X.24C r0 = new X.24C
            r0.<init>(r2, r1, r7)
            goto L_0x0076
        L_0x0277:
            X.0so r1 = r1.A00
            X.24P r0 = new X.24P
            r0.<init>(r1, r7, r7)
            goto L_0x0076
        L_0x0280:
            X.0so r2 = r1.A00
            X.0sK r1 = r1.A0B
            X.24R r0 = new X.24R
            r0.<init>(r2, r1, r7)
            goto L_0x0076
        L_0x028b:
            X.0pd r3 = r1.A0Q
            r2 = 2857(0xb29, float:4.004E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r2)
            if (r0 == 0) goto L_0x029f
            X.1GA r0 = r1.A02
            X.23F r0 = r0.A00(r7)
            goto L_0x0076
        L_0x029f:
            X.0pd r3 = r1.A0Q
            r2 = 2857(0xb29, float:4.004E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r2)
            if (r0 == 0) goto L_0x02b3
            X.1G8 r0 = r1.A04
            X.23I r0 = r0.A00(r7)
            goto L_0x0076
        L_0x02b3:
            X.0so r4 = r1.A00
            X.0sG r3 = r1.A0D
            X.0sP r2 = r1.A0E
            X.122 r1 = r1.A0Y
            X.24Q r0 = new X.24Q
            r9 = r0
            r10 = r4
            r11 = r3
            r12 = r2
            r13 = r7
            r14 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0076
        L_0x02c8:
            X.0so r2 = r1.A00
            X.15k r1 = r1.A0N
            X.23x r0 = new X.23x
            r0.<init>(r2, r1, r7)
            goto L_0x0076
        L_0x02d3:
            X.0pd r3 = r1.A0Q
            r2 = 2857(0xb29, float:4.004E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r2)
            if (r0 == 0) goto L_0x02e7
            X.1GB r0 = r1.A01
            X.23D r0 = r0.A00(r7)
            goto L_0x0076
        L_0x02e7:
            X.1G9 r0 = r1.A03
            X.23H r0 = r0.A00(r7)
            goto L_0x0076
        L_0x02ef:
            X.0pd r3 = r1.A0Q
            r2 = 2857(0xb29, float:4.004E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r2)
            if (r0 == 0) goto L_0x0303
            X.1G6 r0 = r1.A06
            X.23K r0 = r0.A00(r7)
            goto L_0x0076
        L_0x0303:
            X.1G3 r0 = r1.A09
            X.23O r0 = r0.A00(r7)
            goto L_0x0076
        L_0x030b:
            X.0pd r3 = r1.A0Q
            r2 = 2857(0xb29, float:4.004E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r2)
            if (r0 == 0) goto L_0x031f
            X.1G5 r0 = r1.A07
            X.23L r0 = r0.A00(r7)
            goto L_0x0076
        L_0x031f:
            X.1G7 r0 = r1.A05
            X.23J r0 = r0.A00(r7)
            goto L_0x0076
        L_0x0327:
            X.0pd r3 = r1.A0Q
            r2 = 2857(0xb29, float:4.004E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r2)
            if (r0 == 0) goto L_0x033b
            X.1G4 r0 = r1.A08
            X.23N r0 = r0.A00(r7)
            goto L_0x0076
        L_0x033b:
            X.1G2 r0 = r1.A0A
            X.23P r0 = r0.A00(r7)
            goto L_0x0076
        L_0x0343:
            X.0pd r3 = r1.A0Q
            r2 = 2857(0xb29, float:4.004E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r2)
            X.0so r2 = r1.A00
            if (r0 == 0) goto L_0x0358
            X.24i r0 = new X.24i
            r0.<init>(r2, r7)
            goto L_0x0076
        L_0x0358:
            X.122 r1 = r1.A0Y
            X.24e r0 = new X.24e
            r0.<init>(r2, r7, r1)
            goto L_0x0076
        L_0x0361:
            X.0so r2 = r1.A00
            X.122 r1 = r1.A0Y
            X.24X r0 = new X.24X
            r0.<init>(r2, r7, r1)
            goto L_0x0076
        L_0x036c:
            X.0pd r5 = r1.A0Q
            X.0so r4 = r1.A00
            X.0sK r3 = r1.A0B
            X.0rt r2 = r1.A0L
            X.15k r1 = r1.A0N
            X.24Y r0 = new X.24Y
            r9 = r0
            r10 = r4
            r11 = r3
            r12 = r2
            r13 = r1
            r14 = r5
            r15 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L_0x0076
        L_0x0384:
            X.0so r4 = r1.A00
            X.0sK r3 = r1.A0B
            X.0rt r2 = r1.A0L
            X.15k r1 = r1.A0N
            X.24f r0 = new X.24f
            r9 = r0
            r10 = r4
            r11 = r3
            r12 = r2
            r13 = r1
            r14 = r7
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0076
        L_0x0399:
            X.0so r2 = r1.A00
            X.0sK r1 = r1.A0B
            X.24g r0 = new X.24g
            r0.<init>(r2, r1, r7)
            goto L_0x0076
        L_0x03a4:
            X.0so r1 = r1.A00
            X.24S r0 = new X.24S
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x03ad:
            X.0so r1 = r1.A00
            X.24a r0 = new X.24a
            r0.<init>(r1)
            goto L_0x0076
        L_0x03b6:
            X.0so r1 = r1.A00
            X.24b r0 = new X.24b
            r0.<init>(r1, r7)
            goto L_0x0076
        L_0x03bf:
            X.0pd r3 = r1.A0Q
            X.0so r2 = r1.A00
            X.0rt r1 = r1.A0L
            X.24c r0 = new X.24c
            r0.<init>(r2, r1, r3, r7)
            goto L_0x0076
        L_0x03cc:
            X.0so r1 = r1.A00
            X.24d r0 = new X.24d
            r0.<init>(r1)
            goto L_0x0076
        L_0x03d5:
            boolean r4 = r8.A0b
            r3.A0t = r4
            boolean r4 = X.C38621r6.A0p(r3)
            if (r4 == 0) goto L_0x03fc
            X.1Vw r9 = r3.A11
            boolean r4 = r9.A02
            if (r4 != 0) goto L_0x03fc
            r4 = r3
            X.1WU r4 = (X.AnonymousClass1WU) r4
            int r5 = r4.A00
            r4 = 64
            if (r5 == r4) goto L_0x03fc
            X.0rv r6 = r9.A00
            r5 = 1
            java.lang.String r4 = r9.A01
            X.1Vw r3 = new X.1Vw
            r3.<init>(r6, r4, r5)
            X.0tZ r3 = r0.A02(r8, r3, r1)
        L_0x03fc:
            int r0 = r8.A01
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x0428
            X.1iD r5 = r8.A0L
            if (r5 != 0) goto L_0x0409
            X.1iD r5 = X.C33211iD.A0o
        L_0x0409:
            int r4 = r5.A00
            r1 = 4
            r0 = r4 & 4
            if (r0 != r1) goto L_0x042e
            X.24k r0 = r5.A0N
            r2 = r0
            if (r0 != 0) goto L_0x0417
            X.24k r0 = X.C445224k.A0R
        L_0x0417:
            int r1 = r0.A00
            r0 = 128(0x80, float:1.794E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x042e
            if (r2 != 0) goto L_0x0422
            X.24k r2 = X.C445224k.A0R
        L_0x0422:
            X.1Ww r0 = r2.A0B
        L_0x0424:
            byte[] r7 = r0.A04()
        L_0x0428:
            X.24j r0 = new X.24j
            r0.<init>(r3, r7)
            return r0
        L_0x042e:
            boolean r0 = r5.A0c()
            if (r0 == 0) goto L_0x044a
            X.24l r0 = r5.A0C
            r2 = r0
            if (r0 != 0) goto L_0x043b
            X.24l r0 = X.C445324l.A0L
        L_0x043b:
            int r0 = r0.A00
            r1 = 64
            r0 = r0 & 64
            if (r0 != r1) goto L_0x044a
            if (r2 != 0) goto L_0x0447
            X.24l r2 = X.C445324l.A0L
        L_0x0447:
            X.1Ww r0 = r2.A09
            goto L_0x0424
        L_0x044a:
            r1 = 128(0x80, float:1.794E-43)
            r0 = r4 & r1
            if (r0 != r1) goto L_0x0466
            X.24m r0 = r5.A02
            r2 = r0
            if (r0 != 0) goto L_0x0457
            X.24m r0 = X.C445424m.A0F
        L_0x0457:
            int r0 = r0.A01
            r1 = 64
            r0 = r0 & 64
            if (r0 != r1) goto L_0x0466
            if (r2 != 0) goto L_0x0463
            X.24m r2 = X.C445424m.A0F
        L_0x0463:
            X.1Ww r0 = r2.A07
            goto L_0x0424
        L_0x0466:
            r0 = 256(0x100, float:3.59E-43)
            r4 = r4 & r0
            if (r4 != r0) goto L_0x0428
            X.24n r0 = r5.A0l
            r2 = r0
            if (r0 != 0) goto L_0x0472
            X.24n r0 = X.C445524n.A0O
        L_0x0472:
            int r0 = r0.A00
            r1 = 32
            r0 = r0 & 32
            if (r0 != r1) goto L_0x0428
            if (r2 != 0) goto L_0x047e
            X.24n r2 = X.C445524n.A0O
        L_0x047e:
            X.1Ww r0 = r2.A0A
            goto L_0x0424
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17300ur.A02(X.1cM):X.24j");
    }

    /* JADX WARNING: type inference failed for: r15v1, types: [X.23q] */
    /* JADX WARNING: type inference failed for: r9v3, types: [X.1WR] */
    /* JADX WARNING: type inference failed for: r9v68, types: [X.1WR] */
    /* JADX WARNING: type inference failed for: r9v71 */
    /* JADX WARNING: type inference failed for: r1v117, types: [X.23m] */
    /* JADX WARNING: type inference failed for: r9v72 */
    /* JADX WARNING: type inference failed for: r9v73 */
    /* JADX WARNING: type inference failed for: r9v74 */
    /* JADX WARNING: type inference failed for: r9v75 */
    /* JADX WARNING: type inference failed for: r9v76 */
    /* JADX WARNING: type inference failed for: r9v77 */
    /* JADX WARNING: type inference failed for: r9v78 */
    /* JADX WARNING: type inference failed for: r9v79 */
    /* JADX WARNING: type inference failed for: r9v80 */
    /* JADX WARNING: type inference failed for: r12v7, types: [X.24f] */
    /* JADX WARNING: type inference failed for: r9v81 */
    /* JADX WARNING: type inference failed for: r9v82 */
    /* JADX WARNING: type inference failed for: r9v83 */
    /* JADX WARNING: type inference failed for: r9v84 */
    /* JADX WARNING: type inference failed for: r9v85 */
    /* JADX WARNING: type inference failed for: r12v8, types: [X.24Z] */
    /* JADX WARNING: type inference failed for: r12v9, types: [X.24Y] */
    /* JADX WARNING: type inference failed for: r9v86 */
    /* JADX WARNING: type inference failed for: r9v87 */
    /* JADX WARNING: type inference failed for: r9v88 */
    /* JADX WARNING: type inference failed for: r9v89 */
    /* JADX WARNING: type inference failed for: r9v90 */
    /* JADX WARNING: type inference failed for: r9v91 */
    /* JADX WARNING: type inference failed for: r9v92 */
    /* JADX WARNING: type inference failed for: r9v93 */
    /* JADX WARNING: type inference failed for: r9v94 */
    /* JADX WARNING: type inference failed for: r9v95 */
    /* JADX WARNING: type inference failed for: r9v96 */
    /* JADX WARNING: type inference failed for: r12v10, types: [X.24Q] */
    /* JADX WARNING: type inference failed for: r9v97 */
    /* JADX WARNING: type inference failed for: r9v98 */
    /* JADX WARNING: type inference failed for: r9v99 */
    /* JADX WARNING: type inference failed for: r9v100 */
    /* JADX WARNING: type inference failed for: r9v101 */
    /* JADX WARNING: type inference failed for: r9v102 */
    /* JADX WARNING: type inference failed for: r9v103 */
    /* JADX WARNING: type inference failed for: r9v104 */
    /* JADX WARNING: type inference failed for: r9v105 */
    /* JADX WARNING: type inference failed for: r9v106 */
    /* JADX WARNING: type inference failed for: r9v107 */
    /* JADX WARNING: type inference failed for: r9v108 */
    /* JADX WARNING: type inference failed for: r9v109 */
    /* JADX WARNING: type inference failed for: r9v110 */
    /* JADX WARNING: type inference failed for: r9v111 */
    /* JADX WARNING: type inference failed for: r9v112 */
    /* JADX WARNING: type inference failed for: r9v113 */
    /* JADX WARNING: type inference failed for: r9v114 */
    /* JADX WARNING: type inference failed for: r9v115 */
    /* JADX WARNING: type inference failed for: r9v116 */
    /* JADX WARNING: type inference failed for: r9v117 */
    /* JADX WARNING: type inference failed for: r9v118 */
    /* JADX WARNING: type inference failed for: r9v119 */
    /* JADX WARNING: type inference failed for: r9v120 */
    /* JADX WARNING: type inference failed for: r9v121 */
    /* JADX WARNING: type inference failed for: r9v122 */
    /* JADX WARNING: type inference failed for: r9v123 */
    /* JADX WARNING: type inference failed for: r9v124 */
    /* JADX WARNING: type inference failed for: r9v125 */
    /* JADX WARNING: type inference failed for: r9v126 */
    /* JADX WARNING: type inference failed for: r9v127 */
    /* JADX WARNING: type inference failed for: r9v128 */
    /* JADX WARNING: type inference failed for: r9v129 */
    /* JADX WARNING: type inference failed for: r9v130 */
    /* JADX WARNING: type inference failed for: r9v131 */
    /* JADX WARNING: type inference failed for: r9v132 */
    /* JADX WARNING: type inference failed for: r9v133 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x05ab  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x05b1  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x05bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C30431cL A03(X.C16740tZ r40) {
        /*
            r39 = this;
            r11 = r40
            r4 = 0
            if (r40 == 0) goto L_0x000e
            boolean r0 = r11 instanceof X.C38541qx
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "FMessageAddOn should be passed as part of the parent message and not stand alone"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x000e:
            return r4
        L_0x000f:
            r10 = r39
            X.1RV r0 = r10.A08
            r0.A00(r11)
            X.1CF r14 = r10.A09
            r2 = 1
            boolean r0 = r11 instanceof X.C38771rO
            if (r0 == 0) goto L_0x0160
            X.0so r2 = r14.A00
            r1 = r11
            X.1rO r1 = (X.C38771rO) r1
            X.17g r0 = r14.A0X
            X.23h r9 = new X.23h
            r9.<init>(r2, r0, r1)
            X.1Vw r2 = r11.A11
            java.lang.String r0 = r2.A01
            r9.A09 = r0
            long r0 = r11.A0I
            r9.A04 = r0
            X.0rv r1 = r2.A00
            r9.A05 = r1
            boolean r0 = r2.A02
            r9.A0E = r0
            r9.A06 = r1
        L_0x003d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.A0D = r0
            X.1cL r4 = r9.A01()
            X.1HF r5 = r10.A06
            X.21M r0 = r5.A00(r11)
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r14 = r0.iterator()
        L_0x0058:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x05cf
            java.lang.Object r0 = r14.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            java.lang.Object r6 = r0.getValue()
            X.21N r6 = (X.AnonymousClass21N) r6
            X.23i r0 = X.C442423i.A08
            X.1Wr r7 = r0.A0U()
            java.lang.String r2 = r1.getRawString()
            r7.A03()
            X.1Wm r1 = r7.A00
            X.23i r1 = (X.C442423i) r1
            int r0 = r1.A01
            r0 = r0 | 1
            r1.A01 = r0
            r1.A07 = r2
            long r0 = r6.A00
            r8 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r8
            r7.A03()
            X.1Wm r3 = r7.A00
            X.23i r3 = (X.C442423i) r3
            int r2 = r3.A01
            r2 = r2 | 2
            r3.A01 = r2
            r3.A04 = r0
            long r0 = r6.A02
            long r0 = r0 / r8
            r7.A03()
            X.1Wm r3 = r7.A00
            X.23i r3 = (X.C442423i) r3
            int r2 = r3.A01
            r2 = r2 | 4
            r3.A01 = r2
            r3.A03 = r0
            long r0 = r6.A01
            long r0 = r0 / r8
            r7.A03()
            X.1Wm r3 = r7.A00
            X.23i r3 = (X.C442423i) r3
            int r2 = r3.A01
            r2 = r2 | 8
            r3.A01 = r2
            r3.A02 = r0
            r4.A03()
            X.1Wm r2 = r4.A00
            X.1cM r2 = (X.C30441cM) r2
            X.1XE r1 = r2.A0J
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00d7
            X.1XE r1 = X.C28541Wm.A0G(r1)
            r2.A0J = r1
        L_0x00d7:
            X.1Wm r0 = r7.A02()
            r1.add(r0)
            X.16V r0 = r5.A05
            X.17B r0 = r0.A02
            X.1yA r0 = r0.A00(r11)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L_0x00fa:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x012c
            java.lang.Object r0 = r13.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r12 = r0.getKey()
            com.whatsapp.jid.Jid r12 = (com.whatsapp.jid.Jid) r12
            java.lang.Object r0 = r0.getValue()
            X.1yB r0 = (X.C42651yB) r0
            if (r0 == 0) goto L_0x00fa
            long r0 = r0.A00
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r1 = 0
            if (r2 <= 0) goto L_0x011e
            r1 = 1
        L_0x011e:
            java.lang.String r0 = r12.getRawString()
            if (r1 == 0) goto L_0x0128
            r3.add(r0)
            goto L_0x00fa
        L_0x0128:
            r6.add(r0)
            goto L_0x00fa
        L_0x012c:
            r7.A03()
            X.1Wm r2 = r7.A00
            X.23i r2 = (X.C442423i) r2
            X.1XE r1 = r2.A06
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0142
            X.1XE r1 = X.C28541Wm.A0G(r1)
            r2.A06 = r1
        L_0x0142:
            X.C28591Ws.A01(r6, r1)
            r7.A03()
            X.1Wm r2 = r7.A00
            X.23i r2 = (X.C442423i) r2
            X.1XE r1 = r2.A05
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x015b
            X.1XE r1 = X.C28541Wm.A0G(r1)
            r2.A05 = r1
        L_0x015b:
            X.C28591Ws.A01(r3, r1)
            goto L_0x0058
        L_0x0160:
            boolean r0 = r11 instanceof X.AnonymousClass1WU
            r1 = 0
            if (r0 == 0) goto L_0x04ba
            r3 = r11
            X.1WU r3 = (X.AnonymousClass1WU) r3
            int r0 = r3.A00
            switch(r0) {
                case 1: goto L_0x0179;
                case 2: goto L_0x016d;
                case 3: goto L_0x016d;
                case 4: goto L_0x0185;
                case 5: goto L_0x0190;
                case 6: goto L_0x0199;
                case 7: goto L_0x01a5;
                case 8: goto L_0x016d;
                case 9: goto L_0x01ae;
                case 10: goto L_0x01ba;
                case 11: goto L_0x01c6;
                case 12: goto L_0x0185;
                case 13: goto L_0x0190;
                case 14: goto L_0x01a5;
                case 15: goto L_0x01ec;
                case 16: goto L_0x01f8;
                case 17: goto L_0x0204;
                case 18: goto L_0x020d;
                case 19: goto L_0x016d;
                case 20: goto L_0x0216;
                case 21: goto L_0x0224;
                case 22: goto L_0x022d;
                case 23: goto L_0x022d;
                case 24: goto L_0x022d;
                case 25: goto L_0x022d;
                case 26: goto L_0x022d;
                case 27: goto L_0x0239;
                case 28: goto L_0x0245;
                case 29: goto L_0x0251;
                case 30: goto L_0x0251;
                case 31: goto L_0x025a;
                case 32: goto L_0x025a;
                case 33: goto L_0x0263;
                case 34: goto L_0x022d;
                case 35: goto L_0x022d;
                case 36: goto L_0x022d;
                case 37: goto L_0x026c;
                case 38: goto L_0x016d;
                case 39: goto L_0x026c;
                case 40: goto L_0x026c;
                case 41: goto L_0x026c;
                case 42: goto L_0x026c;
                case 43: goto L_0x016d;
                case 44: goto L_0x026c;
                case 45: goto L_0x016d;
                case 46: goto L_0x022d;
                case 47: goto L_0x022d;
                case 48: goto L_0x022d;
                case 49: goto L_0x022d;
                case 50: goto L_0x022d;
                case 51: goto L_0x0277;
                case 52: goto L_0x0283;
                case 53: goto L_0x028f;
                case 54: goto L_0x028f;
                case 55: goto L_0x022d;
                case 56: goto L_0x0298;
                case 57: goto L_0x02a1;
                case 58: goto L_0x02ad;
                case 59: goto L_0x0298;
                case 60: goto L_0x016d;
                case 61: goto L_0x02b9;
                case 62: goto L_0x02c5;
                case 63: goto L_0x02c5;
                case 64: goto L_0x016d;
                case 65: goto L_0x016d;
                case 66: goto L_0x016d;
                case 67: goto L_0x02ce;
                case 68: goto L_0x02dc;
                case 69: goto L_0x02e7;
                case 70: goto L_0x016d;
                case 71: goto L_0x02f3;
                case 72: goto L_0x016d;
                case 73: goto L_0x02ff;
                case 74: goto L_0x02ff;
                case 75: goto L_0x0310;
                case 76: goto L_0x016d;
                case 77: goto L_0x032a;
                case 78: goto L_0x0335;
                case 79: goto L_0x0340;
                case 80: goto L_0x034e;
                case 81: goto L_0x0357;
                case 82: goto L_0x0363;
                case 83: goto L_0x036f;
                case 84: goto L_0x0378;
                case 85: goto L_0x0378;
                case 86: goto L_0x016d;
                case 87: goto L_0x0381;
                case 88: goto L_0x038f;
                case 89: goto L_0x039a;
                case 90: goto L_0x03a5;
                case 91: goto L_0x016d;
                case 92: goto L_0x016d;
                case 93: goto L_0x016d;
                case 94: goto L_0x016d;
                case 95: goto L_0x03c3;
                case 96: goto L_0x03dd;
                case 97: goto L_0x03e6;
                case 98: goto L_0x03f2;
                case 99: goto L_0x0402;
                case 100: goto L_0x040b;
                case 101: goto L_0x0419;
                case 102: goto L_0x045f;
                case 103: goto L_0x045f;
                case 104: goto L_0x045f;
                case 105: goto L_0x03f2;
                case 106: goto L_0x03a5;
                case 107: goto L_0x046a;
                case 108: goto L_0x0475;
                case 109: goto L_0x047f;
                case 110: goto L_0x0489;
                case 111: goto L_0x0493;
                case 112: goto L_0x049d;
                case 113: goto L_0x049d;
                case 114: goto L_0x049d;
                case 115: goto L_0x016d;
                case 116: goto L_0x016e;
                default: goto L_0x016d;
            }
        L_0x016d:
            return r4
        L_0x016e:
            X.1G8 r1 = r14.A04
            r0 = r11
            X.1u9 r0 = (X.C40451u9) r0
            X.23I r9 = r1.A00(r0)
            goto L_0x04a6
        L_0x0179:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sD r0 = (X.C39281sD) r0
            X.23j r9 = new X.23j
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x0185:
            X.0so r1 = r14.A00
            X.0sK r0 = r14.A0B
            X.23k r9 = new X.23k
            r9.<init>(r1, r0, r3)
            goto L_0x04a6
        L_0x0190:
            X.0so r0 = r14.A00
            X.23n r9 = new X.23n
            r9.<init>(r0, r3)
            goto L_0x04a6
        L_0x0199:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sH r0 = (X.C39321sH) r0
            X.23p r9 = new X.23p
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x01a5:
            X.0so r0 = r14.A00
            X.23r r9 = new X.23r
            r9.<init>(r0, r3)
            goto L_0x04a6
        L_0x01ae:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sE r0 = (X.C39291sE) r0
            X.23s r9 = new X.23s
            r9.<init>(r1, r4, r0)
            goto L_0x04a6
        L_0x01ba:
            X.0so r1 = r14.A00
            r0 = r3
            X.1WT r0 = (X.AnonymousClass1WT) r0
            X.23w r9 = new X.23w
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x01c6:
            X.0rt r1 = r14.A0L
            X.1Vw r0 = r3.A11
            X.0rv r0 = r0.A00
            X.0sL r0 = X.C16050sL.A03(r0)
            int r1 = r1.A02(r0)
            r0 = 3
            X.0so r2 = r14.A00
            if (r1 != r0) goto L_0x01e5
            r1 = r3
            X.1sE r1 = (X.C39291sE) r1
            X.15k r0 = r14.A0N
            X.23x r9 = new X.23x
            r9.<init>(r2, r0, r1)
            goto L_0x04a6
        L_0x01e5:
            X.23y r9 = new X.23y
            r9.<init>(r2, r3)
            goto L_0x04a6
        L_0x01ec:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sE r0 = (X.C39291sE) r0
            X.23z r9 = new X.23z
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x01f8:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sE r0 = (X.C39291sE) r0
            X.240 r9 = new X.240
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x0204:
            X.0so r0 = r14.A00
            X.241 r9 = new X.241
            r9.<init>(r0, r3)
            goto L_0x04a6
        L_0x020d:
            X.0so r0 = r14.A00
            X.242 r9 = new X.242
            r9.<init>(r0, r3)
            goto L_0x04a6
        L_0x0216:
            X.0so r2 = r14.A00
            X.0sK r1 = r14.A0B
            r0 = r3
            X.1sE r0 = (X.C39291sE) r0
            X.243 r9 = new X.243
            r9.<init>(r2, r1, r0)
            goto L_0x04a6
        L_0x0224:
            X.0so r0 = r14.A00
            X.245 r9 = new X.245
            r9.<init>(r0, r3)
            goto L_0x04a6
        L_0x022d:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sG r0 = (X.C39311sG) r0
            X.246 r9 = new X.246
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x0239:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sE r0 = (X.C39291sE) r0
            X.247 r9 = new X.247
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x0245:
            X.0so r1 = r14.A00
            r0 = r3
            X.1WT r0 = (X.AnonymousClass1WT) r0
            X.248 r9 = new X.248
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x0251:
            X.0so r0 = r14.A00
            X.249 r9 = new X.249
            r9.<init>(r0, r3)
            goto L_0x04a6
        L_0x025a:
            X.0so r0 = r14.A00
            X.24A r9 = new X.24A
            r9.<init>(r0, r3)
            goto L_0x04a6
        L_0x0263:
            X.0so r0 = r14.A00
            X.24B r9 = new X.24B
            r9.<init>(r0)
            goto L_0x04a6
        L_0x026c:
            X.0so r1 = r14.A00
            X.15Y r0 = r14.A0T
            X.24C r9 = new X.24C
            r9.<init>(r1, r0, r3)
            goto L_0x04a6
        L_0x0277:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sE r0 = (X.C39291sE) r0
            X.24D r9 = new X.24D
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x0283:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sE r0 = (X.C39291sE) r0
            X.24E r9 = new X.24E
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x028f:
            X.0so r0 = r14.A00
            X.24F r9 = new X.24F
            r9.<init>(r0, r3)
            goto L_0x04a6
        L_0x0298:
            X.0so r0 = r14.A00
            X.24G r9 = new X.24G
            r9.<init>(r0, r3)
            goto L_0x04a6
        L_0x02a1:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sJ r0 = (X.C39331sJ) r0
            X.24H r9 = new X.24H
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x02ad:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sP r0 = (X.C39391sP) r0
            X.24I r9 = new X.24I
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x02b9:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sR r0 = (X.C39411sR) r0
            X.24J r9 = new X.24J
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x02c5:
            X.0so r0 = r14.A00
            X.24K r9 = new X.24K
            r9.<init>(r0, r3)
            goto L_0x04a6
        L_0x02ce:
            X.0so r2 = r14.A00
            X.0zl r1 = r14.A0R
            r0 = r3
            X.1sK r0 = (X.C39341sK) r0
            X.24L r9 = new X.24L
            r9.<init>(r2, r1, r0)
            goto L_0x04a6
        L_0x02dc:
            X.0so r1 = r14.A00
            X.0sK r0 = r14.A0B
            X.24M r9 = new X.24M
            r9.<init>(r1, r0, r3)
            goto L_0x04a6
        L_0x02e7:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sR r0 = (X.C39411sR) r0
            X.24N r9 = new X.24N
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x02f3:
            X.0so r1 = r14.A00
            r0 = r3
            X.1to r0 = (X.C40251to) r0
            X.24O r9 = new X.24O
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x02ff:
            X.0so r1 = r14.A00
            X.1Vw r0 = r3.A11
            X.0rv r0 = r0.A00
            com.whatsapp.jid.GroupJid r0 = com.whatsapp.jid.GroupJid.of(r0)
            X.24P r9 = new X.24P
            r9.<init>(r1, r0, r3)
            goto L_0x04a6
        L_0x0310:
            X.0so r5 = r14.A00
            r4 = r3
            X.1sE r4 = (X.C39291sE) r4
            X.0sG r2 = r14.A0D
            X.0sP r1 = r14.A0E
            X.122 r0 = r14.A0Y
            X.24Q r9 = new X.24Q
            r15 = r1
            r16 = r4
            r17 = r0
            r12 = r9
            r13 = r5
            r14 = r2
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x04a6
        L_0x032a:
            X.1G9 r1 = r14.A03
            r0 = r3
            X.1sV r0 = (X.C39451sV) r0
            X.23H r9 = r1.A00(r0)
            goto L_0x04a6
        L_0x0335:
            X.1G3 r1 = r14.A09
            r0 = r3
            X.1sV r0 = (X.C39451sV) r0
            X.23O r9 = r1.A00(r0)
            goto L_0x04a6
        L_0x0340:
            X.0so r2 = r14.A00
            X.0sK r1 = r14.A0B
            r0 = r3
            X.1sE r0 = (X.C39291sE) r0
            X.24R r9 = new X.24R
            r9.<init>(r2, r1, r0)
            goto L_0x04a6
        L_0x034e:
            X.0so r0 = r14.A00
            X.24S r9 = new X.24S
            r9.<init>(r0, r3)
            goto L_0x04a6
        L_0x0357:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sE r0 = (X.C39291sE) r0
            X.24T r9 = new X.24T
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x0363:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sE r0 = (X.C39291sE) r0
            X.24U r9 = new X.24U
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x036f:
            X.0so r0 = r14.A00
            X.24V r9 = new X.24V
            r9.<init>(r0, r3)
            goto L_0x04a6
        L_0x0378:
            X.0so r0 = r14.A00
            X.24W r9 = new X.24W
            r9.<init>(r0, r3)
            goto L_0x04a6
        L_0x0381:
            X.0so r2 = r14.A00
            r1 = r3
            X.1sE r1 = (X.C39291sE) r1
            X.122 r0 = r14.A0Y
            X.24X r9 = new X.24X
            r9.<init>(r2, r1, r0)
            goto L_0x04a6
        L_0x038f:
            X.1G7 r1 = r14.A05
            r0 = r3
            X.1sV r0 = (X.C39451sV) r0
            X.23J r9 = r1.A00(r0)
            goto L_0x04a6
        L_0x039a:
            X.1G2 r1 = r14.A0A
            r0 = r3
            X.1sV r0 = (X.C39451sV) r0
            X.23P r9 = r1.A00(r0)
            goto L_0x04a6
        L_0x03a5:
            X.0pd r6 = r14.A0Q
            X.0so r5 = r14.A00
            X.0sK r4 = r14.A0B
            X.0rt r2 = r14.A0L
            X.15k r1 = r14.A0N
            r0 = r3
            X.1sE r0 = (X.C39291sE) r0
            X.24Y r9 = new X.24Y
            r15 = r2
            r16 = r1
            r17 = r6
            r18 = r0
            r12 = r9
            r13 = r5
            r14 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            goto L_0x04a6
        L_0x03c3:
            X.0so r5 = r14.A00
            r4 = r3
            X.1sT r4 = (X.C39431sT) r4
            X.0sG r2 = r14.A0D
            X.0sP r1 = r14.A0E
            X.122 r0 = r14.A0Y
            X.24Z r9 = new X.24Z
            r15 = r1
            r16 = r4
            r17 = r0
            r12 = r9
            r13 = r5
            r14 = r2
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x04a6
        L_0x03dd:
            X.0so r0 = r14.A00
            X.24a r9 = new X.24a
            r9.<init>(r0)
            goto L_0x04a6
        L_0x03e6:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sZ r0 = (X.C39491sZ) r0
            X.24b r9 = new X.24b
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x03f2:
            X.0pd r4 = r14.A0Q
            X.0so r2 = r14.A00
            X.0rt r1 = r14.A0L
            r0 = r3
            X.1sE r0 = (X.C39291sE) r0
            X.24c r9 = new X.24c
            r9.<init>(r2, r1, r4, r0)
            goto L_0x04a6
        L_0x0402:
            X.0so r0 = r14.A00
            X.24d r9 = new X.24d
            r9.<init>(r0)
            goto L_0x04a6
        L_0x040b:
            X.0so r2 = r14.A00
            r1 = r3
            X.1sE r1 = (X.C39291sE) r1
            X.122 r0 = r14.A0Y
            X.24e r9 = new X.24e
            r9.<init>(r2, r1, r0)
            goto L_0x04a6
        L_0x0419:
            java.util.List r0 = r3.A0Q()
            if (r0 == 0) goto L_0x0452
            java.util.List r0 = r3.A0Q()
            int r0 = r0.size()
            if (r0 != r2) goto L_0x0452
            X.0sK r5 = r14.A0B
            java.util.List r0 = r3.A0Q()
            java.lang.Object r0 = r0.get(r1)
            X.0rv r0 = (X.C15830rv) r0
            boolean r0 = r5.A0I(r0)
            if (r0 == 0) goto L_0x0452
            X.0so r4 = r14.A00
            X.0rt r2 = r14.A0L
            X.15k r1 = r14.A0N
            r0 = r3
            X.1sE r0 = (X.C39291sE) r0
            X.24f r9 = new X.24f
            r15 = r2
            r16 = r1
            r17 = r0
            r12 = r9
            r13 = r4
            r14 = r5
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x04a6
        L_0x0452:
            X.0so r2 = r14.A00
            X.0sK r1 = r14.A0B
            r0 = r3
            X.1sE r0 = (X.C39291sE) r0
            X.24g r9 = new X.24g
            r9.<init>(r2, r1, r0)
            goto L_0x04a6
        L_0x045f:
            X.0so r1 = r14.A00
            r0 = r3
            X.1tu r0 = (X.C40311tu) r0
            X.24h r9 = new X.24h
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x046a:
            X.0so r1 = r14.A00
            r0 = r3
            X.1sE r0 = (X.C39291sE) r0
            X.24i r9 = new X.24i
            r9.<init>(r1, r0)
            goto L_0x04a6
        L_0x0475:
            X.1GB r1 = r14.A01
            r0 = r11
            X.1ty r0 = (X.C40351ty) r0
            X.23D r9 = r1.A00(r0)
            goto L_0x04a6
        L_0x047f:
            X.1G6 r1 = r14.A06
            r0 = r11
            X.1tz r0 = (X.C40361tz) r0
            X.23K r9 = r1.A00(r0)
            goto L_0x04a6
        L_0x0489:
            X.1G5 r1 = r14.A07
            r0 = r3
            X.1u0 r0 = (X.C40371u0) r0
            X.23L r9 = r1.A00(r0)
            goto L_0x04a6
        L_0x0493:
            X.1G4 r1 = r14.A08
            r0 = r3
            X.1u2 r0 = (X.C40391u2) r0
            X.23N r9 = r1.A00(r0)
            goto L_0x04a6
        L_0x049d:
            X.1GA r1 = r14.A02
            r0 = r11
            X.1u5 r0 = (X.C40421u5) r0
            X.23F r9 = r1.A00(r0)
        L_0x04a6:
            X.1Vw r2 = r3.A11
            java.lang.String r0 = r2.A01
            r9.A09 = r0
            long r0 = r3.A0I
            r9.A04 = r0
            X.0rv r0 = r2.A00
            r9.A05 = r0
            boolean r0 = r2.A02
            r9.A0E = r0
            goto L_0x003d
        L_0x04ba:
            boolean r0 = r11 instanceof X.C38831rU
            if (r0 == 0) goto L_0x04fa
            boolean r4 = r11 instanceof X.C39161s1
            X.0pd r3 = r14.A0Q
            X.0so r2 = r14.A00
            r1 = r11
            X.1rU r1 = (X.C38831rU) r1
            X.17g r0 = r14.A0X
            if (r4 == 0) goto L_0x04f3
            X.23l r4 = X.C442723l.A01
            java.lang.String r7 = "ADMIN_REVOKED_WEB_QUERY"
            r8 = 64
        L_0x04d1:
            X.23m r9 = new X.23m
            r5 = r0
            r6 = r1
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.1Vw r2 = r11.A11
            java.lang.String r0 = r2.A01
            r9.A09 = r0
            long r0 = r11.A0I
            r9.A04 = r0
            X.0rv r0 = r2.A00
            r9.A05 = r0
            boolean r0 = r2.A02
            r9.A0E = r0
            X.0rv r0 = r11.A0B()
            r9.A06 = r0
            goto L_0x003d
        L_0x04f3:
            X.23l r4 = X.C442723l.A2J
            java.lang.String r7 = "REVOKED_WEB_QUERY"
            r8 = 15
            goto L_0x04d1
        L_0x04fa:
            boolean r0 = r11 instanceof X.C38791rQ
            if (r0 == 0) goto L_0x0524
            X.0so r2 = r14.A00
            r1 = r11
            X.1rQ r1 = (X.C38791rQ) r1
            X.17g r0 = r14.A0X
            X.23o r9 = new X.23o
            r9.<init>(r2, r0, r1)
            X.1Vw r2 = r11.A11
            java.lang.String r0 = r2.A01
            r9.A09 = r0
            long r0 = r11.A0I
            r9.A04 = r0
            X.0rv r0 = r2.A00
            r9.A05 = r0
            boolean r0 = r2.A02
            r9.A0E = r0
            X.0rv r0 = r11.A0B()
            r9.A06 = r0
            goto L_0x003d
        L_0x0524:
            X.0t3 r0 = r14.A0H
            r21 = r0
            X.0pd r0 = r14.A0Q
            r18 = r0
            X.0so r0 = r14.A00
            r38 = r0
            X.0sK r0 = r14.A0B
            r37 = r0
            X.0tz r0 = r14.A0I
            r22 = r0
            X.0sG r0 = r14.A0D
            r17 = r0
            X.013 r0 = r14.A0J
            r16 = r0
            X.17g r15 = r14.A0X
            X.0wS r13 = r14.A0U
            X.1GD r12 = r14.A0V
            X.1GE r8 = r14.A0S
            X.1GF r7 = r14.A0W
            X.17K r6 = r14.A0M
            X.0wH r5 = r14.A0F
            X.15Y r4 = r14.A0T
            X.0uc r3 = r14.A0C
            X.173 r2 = r14.A0P
            X.1GG r1 = r14.A0K
            X.1GC r0 = r14.A0Z
            X.23q r9 = new X.23q
            r36 = 1
            r25 = r6
            r26 = r2
            r27 = r18
            r28 = r8
            r29 = r4
            r30 = r13
            r31 = r12
            r32 = r7
            r33 = r11
            r34 = r15
            r35 = r0
            r18 = r3
            r19 = r17
            r20 = r5
            r23 = r16
            r24 = r1
            r15 = r9
            r16 = r38
            r17 = r37
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            boolean r0 = r11 instanceof X.C30581cc
            if (r0 == 0) goto L_0x05cd
            r1 = r11
            X.1cc r1 = (X.C30581cc) r1
            java.lang.String r0 = r1.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x059b
            java.lang.String r0 = r1.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x05cd
        L_0x059b:
            r2 = 1
        L_0x059c:
            boolean r0 = r11 instanceof X.C16730tY
            if (r0 == 0) goto L_0x05b9
            r0 = r11
            X.0tY r0 = (X.C16730tY) r0
            X.0ta r1 = r0.A02
            if (r1 == 0) goto L_0x05b9
            byte[] r0 = r1.A0U
            if (r0 == 0) goto L_0x05ad
            r9.A0H = r0
        L_0x05ad:
            java.io.File r1 = r1.A0F
            if (r1 == 0) goto L_0x05b9
            X.0sc r0 = r14.A0G
            java.lang.String r0 = r0.A08(r1)
            r9.A0A = r0
        L_0x05b9:
            if (r2 == 0) goto L_0x003d
            java.lang.String r0 = r11.A0I()
            java.lang.String r1 = X.C30931dC.A02(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x003d
            r9.A0B = r1
            goto L_0x003d
        L_0x05cd:
            r2 = 0
            goto L_0x059c
        L_0x05cf:
            int r0 = r11.A07
            if (r0 == 0) goto L_0x075a
            r3 = 1
            r0 = r0 & 1
            if (r0 != r3) goto L_0x05fa
            X.1Vw r0 = r11.A11
            X.0rv r0 = r0.A00
            com.whatsapp.jid.GroupJid r1 = com.whatsapp.jid.GroupJid.of(r0)
            if (r1 == 0) goto L_0x06c2
            X.0sG r0 = r10.A00
            X.0sH r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x06c2
            boolean r0 = r0.A0b
            if (r0 == 0) goto L_0x06c2
            X.0pd r2 = r10.A07
            r1 = 2296(0x8f8, float:3.217E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 != 0) goto L_0x06c2
        L_0x05fa:
            r1 = 2
            int r0 = r11.A07
            r0 = r0 & 2
            if (r0 != r1) goto L_0x075a
            boolean r0 = r11 instanceof X.C39171s2
            if (r0 == 0) goto L_0x075a
            r0 = r11
            X.1s2 r0 = (X.C39171s2) r0
            java.util.List r0 = r0.A04
            if (r0 == 0) goto L_0x075a
            java.util.Iterator r10 = r0.iterator()
        L_0x0610:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x075a
            java.lang.Object r7 = r10.next()
            X.1qx r7 = (X.C38541qx) r7
            r2 = r7
            X.1s3 r2 = (X.C39181s3) r2
            X.23t r0 = X.C443523t.A04
            X.1Wr r5 = r0.A0U()
            X.23c r0 = X.C441823c.A01
            X.1Wr r8 = r0.A0U()
            java.util.List r0 = r2.A01
            if (r0 == 0) goto L_0x075a
            java.util.Iterator r9 = r0.iterator()
        L_0x0633:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0664
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            r0 = 2
            byte[] r3 = android.util.Base64.decode(r1, r0)
            int r1 = r3.length
            r0 = 0
            X.1Ww r6 = X.C28631Ww.A01(r3, r0, r1)
            r8.A03()
            X.1Wm r3 = r8.A00
            X.23c r3 = (X.C441823c) r3
            X.1XE r1 = r3.A00
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0660
            X.1XE r1 = X.C28541Wm.A0G(r1)
            r3.A00 = r1
        L_0x0660:
            r1.add(r6)
            goto L_0x0633
        L_0x0664:
            r5.A03()
            X.1Wm r1 = r5.A00
            X.23t r1 = (X.C443523t) r1
            X.1Wm r0 = r8.A02()
            X.23c r0 = (X.C441823c) r0
            r1.A02 = r0
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            X.1iG r0 = A00(r7)
            r5.A03()
            X.1Wm r1 = r5.A00
            X.23t r1 = (X.C443523t) r1
            X.1Wm r0 = r0.A02()
            X.1iF r0 = (X.C33231iF) r0
            r1.A03 = r0
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            long r2 = r2.A00
            r5.A03()
            X.1Wm r1 = r5.A00
            X.23t r1 = (X.C443523t) r1
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
            r1.A01 = r2
            r4.A03()
            X.1Wm r2 = r4.A00
            X.1cM r2 = (X.C30441cM) r2
            X.1XE r1 = r2.A0H
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x06b9
            X.1XE r1 = X.C28541Wm.A0G(r1)
            r2.A0H = r1
        L_0x06b9:
            X.1Wm r0 = r5.A02()
            r1.add(r0)
            goto L_0x0610
        L_0x06c2:
            X.23T r0 = r11.A0W
            if (r0 == 0) goto L_0x05fa
            java.util.Collection r0 = r0.A02()
            java.util.Iterator r7 = r0.iterator()
        L_0x06ce:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x05fa
            java.lang.Object r1 = r7.next()
            X.1qx r1 = (X.C38541qx) r1
            r5 = r1
            X.1rv r5 = (X.C39101rv) r5
            X.23v r0 = X.C443723v.A06
            X.1Wr r6 = r0.A0U()
            X.1iG r0 = A00(r1)
            r6.A03()
            X.1Wm r1 = r6.A00
            X.23v r1 = (X.C443723v) r1
            X.1Wm r0 = r0.A02()
            X.1iF r0 = (X.C33231iF) r0
            r1.A02 = r0
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            java.lang.String r0 = r5.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0715
            java.lang.String r2 = r5.A01
            r6.A03()
            X.1Wm r1 = r6.A00
            X.23v r1 = (X.C443723v) r1
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            r1.A04 = r2
        L_0x0715:
            int r1 = r5.A0C
            r0 = 17
            if (r1 == r0) goto L_0x072a
            r6.A03()
            X.1Wm r1 = r6.A00
            X.23v r1 = (X.C443723v) r1
            int r0 = r1.A00
            r0 = r0 | 16
            r1.A00 = r0
            r1.A05 = r3
        L_0x072a:
            long r1 = r5.A00
            r6.A03()
            X.1Wm r5 = r6.A00
            X.23v r5 = (X.C443723v) r5
            int r0 = r5.A00
            r0 = r0 | 8
            r5.A00 = r0
            r5.A01 = r1
            r4.A03()
            X.1Wm r2 = r4.A00
            X.1cM r2 = (X.C30441cM) r2
            X.1XE r1 = r2.A0I
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0751
            X.1XE r1 = X.C28541Wm.A0G(r1)
            r2.A0I = r1
        L_0x0751:
            X.1Wm r0 = r6.A02()
            r1.add(r0)
            goto L_0x06ce
        L_0x075a:
            boolean r0 = r11 instanceof X.C39171s2
            if (r0 == 0) goto L_0x000e
            X.1s2 r11 = (X.C39171s2) r11
            int r0 = r11.A00
            if (r0 == 0) goto L_0x000e
            X.23u r0 = X.C443623u.A02
            X.1Wr r3 = r0.A0U()
            r3.A03()
            X.1Wm r2 = r3.A00
            X.23u r2 = (X.C443623u) r2
            r1 = 1
            int r0 = r2.A00
            r0 = r0 | 1
            r2.A00 = r0
            r2.A01 = r1
            r4.A03()
            X.1Wm r2 = r4.A00
            X.1cM r2 = (X.C30441cM) r2
            X.1Wm r0 = r3.A02()
            X.23u r0 = (X.C443623u) r0
            r2.A0U = r0
            int r1 = r2.A01
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r2.A01 = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17300ur.A03(X.0tZ):X.1cL");
    }

    public Map A04(Cursor cursor, C29891bO r16) {
        int i2;
        int i3;
        AnonymousClass12G r0 = this.A01;
        Map A052 = r0.A05();
        Map A042 = r0.A04();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            C16740tZ A012 = this.A04.A0K.A01(cursor);
            if (A012 != null) {
                C16820th r02 = this.A02;
                C28381Vw r1 = A012.A11;
                r02.A05(r1);
                C29891bO r03 = r16;
                if (r16 != null) {
                    r03.A00.A0K(A012);
                }
                C15830rv r5 = r1.A00;
                C29931bS r4 = (C29931bS) linkedHashMap.get(r5);
                if (r4 == null) {
                    r4 = (C29931bS) C29941bT.A0j.A0U();
                    AnonymousClass00B.A06(r5);
                    String rawString = r5.getRawString();
                    r4.A03();
                    C29941bT r12 = (C29941bT) r4.A00;
                    r12.A01 |= 1;
                    r12.A0P = rawString;
                    C15810rt r9 = this.A03;
                    C15840rx A062 = r9.A06(r5);
                    if (A062 != null) {
                        if (A062.A06() != null) {
                            String A063 = A062.A06();
                            r4.A03();
                            C29941bT r13 = (C29941bT) r4.A00;
                            r13.A01 |= 2048;
                            r13.A0R = A063;
                        }
                        synchronized (A062) {
                            i2 = A062.A03;
                        }
                        boolean z2 = false;
                        if (i2 == 1) {
                            z2 = true;
                        }
                        r4.A03();
                        C29941bT r14 = (C29941bT) r4.A00;
                        r14.A01 |= 8192;
                        r14.A0c = z2;
                        boolean z3 = A062.A0e;
                        r4.A03();
                        C29941bT r15 = (C29941bT) r4.A00;
                        r15.A01 |= 16384;
                        r15.A0X = z3;
                        long max = Math.max(A062.A02() / 1000, 0);
                        r4.A03();
                        C29941bT r132 = (C29941bT) r4.A00;
                        r132.A01 |= 1024;
                        r132.A09 = max;
                        int max2 = Math.max(A062.A0X.expiration, 0);
                        r4.A03();
                        C29941bT r17 = (C29941bT) r4.A00;
                        r17.A01 |= 128;
                        r17.A04 = max2;
                        long max3 = Math.max(A062.A0X.ephemeralSettingTimestamp, 0);
                        r4.A03();
                        C29941bT r3 = (C29941bT) r4.A00;
                        r3.A01 |= 256;
                        r3.A0B = max3;
                        synchronized (A062) {
                            i3 = A062.A08;
                        }
                        int max4 = Math.max(i3, 0);
                        r4.A03();
                        C29941bT r18 = (C29941bT) r4.A00;
                        r18.A01 |= 16;
                        r18.A07 = max4;
                        int i4 = (((long) A062.A06) > -1 ? 1 : (((long) A062.A06) == -1 ? 0 : -1));
                        boolean z4 = false;
                        if (i4 == 0) {
                            z4 = true;
                        }
                        r4.A03();
                        C29941bT r32 = (C29941bT) r4.A00;
                        r32.A01 |= 131072;
                        r32.A0b = z4;
                        boolean A0G = r9.A0G(r5);
                        r4.A03();
                        C29941bT r19 = (C29941bT) r4.A00;
                        r19.A01 |= 32;
                        r19.A0e = A0G;
                        C15840rx r04 = (C15840rx) r9.A0C().get(r5);
                        int i5 = r04 == null ? 0 : r04.A04;
                        r4.A03();
                        C29941bT r33 = (C29941bT) r4.A00;
                        r33.A01 |= AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
                        r33.A08 = i5;
                        if (r5 instanceof GroupJid) {
                            String A0B = this.A05.A07.A04((C16060sN) r5).A0B();
                            r4.A03();
                            C29941bT r110 = (C29941bT) r4.A00;
                            r110.A01 |= 4096;
                            r110.A0U = A0B;
                            boolean z5 = this.A00.A0A(r5).A0c;
                            r4.A03();
                            C29941bT r2 = (C29941bT) r4.A00;
                            r2.A01 |= 67108864;
                            r2.A0h = z5;
                        } else {
                            C30381cG r7 = (C30381cG) A052.get(r5);
                            if (r7 != null) {
                                byte[] bArr = r7.A01;
                                C28631Ww A013 = C28631Ww.A01(bArr, 0, bArr.length);
                                r4.A03();
                                C29941bT r22 = (C29941bT) r4.A00;
                                r22.A01 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START;
                                r22.A0H = A013;
                                long longValue = r7.A00.longValue();
                                r4.A03();
                                C29941bT r72 = (C29941bT) r4.A00;
                                r72.A01 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END;
                                r72.A0F = longValue;
                            }
                            Number number = (Number) A042.get(r5);
                            if (number != null) {
                                long longValue2 = number.longValue();
                                r4.A03();
                                C29941bT r73 = (C29941bT) r4.A00;
                                r73.A01 |= 33554432;
                                r73.A0E = longValue2;
                            }
                        }
                    }
                    linkedHashMap.put(r5, r4);
                }
                A06(r4, A012);
            }
        }
        return linkedHashMap;
    }

    public void A05(C16060sN r8, C29931bS r9) {
        GroupJid of;
        C30661ck A052;
        C16010sH A082;
        C30361cE A042 = this.A05.A07.A04(r8);
        C28031Ub it = C17380uz.copyOf((Collection) A042.A04.keySet()).iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            if (userJid != null && (((of = GroupJid.of(r8)) == null || (A082 = this.A00.A08(of)) == null || !A082.A0b || !C16030sJ.A0M(userJid) || this.A07.A0E(C16620tM.A02, 2296)) && (A052 = A042.A05(userJid)) != null)) {
                C28581Wr A0U = C445624o.A04.A0U();
                String rawString = A052.A03.getRawString();
                A0U.A03();
                C445624o r1 = (C445624o) A0U.A00;
                r1.A01 |= 1;
                r1.A03 = rawString;
                int i2 = A052.A01;
                if (i2 != 0) {
                    C445724p r2 = i2 != 1 ? i2 != 2 ? null : C445724p.A03 : C445724p.A01;
                    A0U.A03();
                    C445624o r12 = (C445624o) A0U.A00;
                    r12.A01 |= 2;
                    r12.A02 = r2.value;
                }
                r9.A03();
                C29941bT r22 = (C29941bT) r9.A00;
                AnonymousClass1XE r13 = r22.A0J;
                if (!((AnonymousClass1XF) r13).A00) {
                    r13 = C28541Wm.A0G(r13);
                    r22.A0J = r13;
                }
                r13.add(A0U.A02());
            }
        }
    }

    public void A06(C29931bS r6, C16740tZ r7) {
        C30431cL A032 = A03(r7);
        if (A032 != null) {
            C28581Wr A0U = C442223g.A04.A0U();
            A0U.A03();
            C442223g r1 = (C442223g) A0U.A00;
            r1.A03 = (C30441cM) A032.A02();
            r1.A01 |= 1;
            long j2 = r7.A13;
            A0U.A03();
            C442223g r12 = (C442223g) A0U.A00;
            r12.A01 |= 2;
            r12.A02 = j2;
            C28541Wm A022 = A0U.A02();
            r6.A03();
            C29941bT r2 = (C29941bT) r6.A00;
            AnonymousClass1XE r13 = r2.A0I;
            if (!((AnonymousClass1XF) r13).A00) {
                r13 = C28541Wm.A0G(r13);
                r2.A0I = r13;
            }
            r13.add(A022);
        }
    }
}
