package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape0S0201000_I0;
import com.facebook.redex.RunnableRunnableShape0S0301000_I0;
import com.facebook.redex.RunnableRunnableShape0S0410000_I0;
import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.facebook.redex.RunnableRunnableShape6S0200000_I0_4;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0t6  reason: invalid class name and case insensitive filesystem */
public class C16460t6 {
    public AnonymousClass1HK A00;
    public final AnonymousClass12E A01;
    public final C16300so A02;
    public final C16180sb A03;
    public final C14870pt A04;
    public final C16040sK A05;
    public final C18020w1 A06;
    public final AnonymousClass01Z A07;
    public final C19000xb A08;
    public final AnonymousClass17D A09;
    public final C16000sG A0A;
    public final C17030uP A0B;
    public final AnonymousClass17Z A0C;
    public final C222417e A0D;
    public final AnonymousClass01V A0E;
    public final C16440t3 A0F;
    public final C15860rz A0G;
    public final AnonymousClass126 A0H;
    public final AnonymousClass177 A0I;
    public final AnonymousClass181 A0J;
    public final C16820th A0K;
    public final C223917t A0L;
    public final AnonymousClass10R A0M;
    public final C16920ts A0N;
    public final C15810rt A0O;
    public final C218015m A0P;
    public final C221716x A0Q;
    public final AnonymousClass11A A0R;
    public final C18560wt A0S;
    public final C17620vN A0T;
    public final C221616w A0U;
    public final AnonymousClass182 A0V;
    public final AnonymousClass189 A0W;
    public final AnonymousClass188 A0X;
    public final AnonymousClass183 A0Y;
    public final AnonymousClass151 A0Z;
    public final AnonymousClass17F A0a;
    public final C223317n A0b;
    public final AnonymousClass185 A0c;
    public final C16070sO A0d;
    public final AnonymousClass17E A0e;
    public final C17610vM A0f;
    public final C216314v A0g;
    public final AnonymousClass17N A0h;
    public final C224317x A0i;
    public final AnonymousClass17G A0j;
    public final AnonymousClass17I A0k;
    public final C224217w A0l;
    public final C39521sc A0m;
    public final AnonymousClass17H A0n;
    public final AnonymousClass17K A0o;
    public final C221816y A0p;
    public final C17400v1 A0q;
    public final C19150xq A0r;
    public final C223417o A0s;
    public final AnonymousClass0y0 A0t;
    public final C19650ym A0u;
    public final C16900tq A0v;
    public final C223517p A0w;
    public final AnonymousClass18B A0x;
    public final C17630vO A0y;
    public final C223117l A0z;
    public final AnonymousClass187 A10;
    public final AnonymousClass172 A11;
    public final C222817i A12;
    public final AnonymousClass186 A13;
    public final C224017u A14;
    public final AnonymousClass11I A15;
    public final C223617q A16;
    public final AnonymousClass16V A17;
    public final C224117v A18;
    public final C17290uq A19;
    public final C224417y A1A;
    public final AnonymousClass171 A1B;
    public final AnonymousClass17J A1C;
    public final AnonymousClass15B A1D;
    public final C222117b A1E;
    public final AnonymousClass10G A1F;
    public final AnonymousClass17C A1G;
    public final C221416u A1H;
    public final AnonymousClass184 A1I;
    public final AnonymousClass11G A1J;
    public final C223717r A1K;
    public final C224517z A1L;
    public final C222917j A1M;
    public final C18860xN A1N;
    public final C223217m A1O;
    public final AnonymousClass180 A1P;
    public final AnonymousClass15H A1Q;
    public final C223817s A1R;
    public final AnonymousClass160 A1S;
    public final C18600wx A1T;
    public final C14710pd A1U;
    public final C16490t9 A1V;
    public final C222717h A1W;
    public final AnonymousClass16S A1X;
    public final AnonymousClass17L A1Y;
    public final C19790z0 A1Z;
    public final C222517f A1a;
    public final C207811o A1b;
    public final AnonymousClass17X A1c;
    public final AnonymousClass107 A1d;
    public final AnonymousClass15Y A1e;
    public final C18290wS A1f;
    public final C222617g A1g;
    public final AnonymousClass122 A1h;
    public final AnonymousClass18A A1i;
    public final C216014s A1j;
    public final C223017k A1k;
    public final C16320sq A1l;
    public final C220916p A1m;
    public final AnonymousClass01D A1n;
    public final Map A1o;

    public C16460t6(AnonymousClass12E r4, C16300so r5, C16180sb r6, C14870pt r7, C16040sK r8, C18020w1 r9, AnonymousClass01Z r10, C19000xb r11, AnonymousClass17D r12, C16000sG r13, C17030uP r14, AnonymousClass17Z r15, C222417e r16, AnonymousClass01V r17, C16440t3 r18, C15860rz r19, AnonymousClass126 r20, AnonymousClass177 r21, AnonymousClass181 r22, C16820th r23, C223917t r24, AnonymousClass10R r25, C16920ts r26, C15810rt r27, C218015m r28, C221716x r29, AnonymousClass11A r30, C18560wt r31, C17620vN r32, C221616w r33, AnonymousClass182 r34, AnonymousClass189 r35, AnonymousClass188 r36, AnonymousClass183 r37, AnonymousClass151 r38, AnonymousClass17F r39, C223317n r40, AnonymousClass185 r41, C16070sO r42, AnonymousClass17E r43, C17610vM r44, C216314v r45, AnonymousClass17N r46, C224317x r47, AnonymousClass17G r48, AnonymousClass17I r49, C224217w r50, AnonymousClass17H r51, AnonymousClass17K r52, C221816y r53, C17400v1 r54, C19150xq r55, C223417o r56, AnonymousClass0y0 r57, C19650ym r58, C16900tq r59, C223517p r60, AnonymousClass18B r61, C17630vO r62, C223117l r63, AnonymousClass187 r64, AnonymousClass172 r65, C222817i r66, AnonymousClass186 r67, C224017u r68, AnonymousClass11I r69, C223617q r70, AnonymousClass16V r71, C224117v r72, C17290uq r73, C224417y r74, AnonymousClass171 r75, AnonymousClass17J r76, AnonymousClass15B r77, C222117b r78, AnonymousClass10G r79, AnonymousClass17C r80, C221416u r81, AnonymousClass184 r82, AnonymousClass11G r83, C223717r r84, C224517z r85, C222917j r86, C18860xN r87, C223217m r88, AnonymousClass180 r89, AnonymousClass15H r90, C223817s r91, AnonymousClass160 r92, C18600wx r93, C14710pd r94, C16490t9 r95, C222717h r96, AnonymousClass16S r97, AnonymousClass17L r98, C19790z0 r99, C222517f r100, C207811o r101, AnonymousClass17X r102, AnonymousClass107 r103, AnonymousClass15Y r104, C18290wS r105, C222617g r106, AnonymousClass122 r107, AnonymousClass18A r108, C216014s r109, C223017k r110, C16320sq r111, C220916p r112, AnonymousClass01D r113) {
        this.A0F = r18;
        this.A1U = r94;
        this.A04 = r7;
        this.A0g = r45;
        this.A0N = r26;
        this.A02 = r5;
        this.A05 = r8;
        this.A1E = r78;
        this.A1l = r111;
        this.A0O = r27;
        this.A03 = r6;
        this.A19 = r73;
        this.A1V = r95;
        this.A1D = r77;
        this.A0D = r16;
        this.A1j = r109;
        this.A1J = r83;
        this.A0C = r15;
        this.A1S = r92;
        this.A1a = r100;
        this.A08 = r11;
        this.A0A = r13;
        this.A0S = r31;
        this.A0e = r43;
        this.A06 = r9;
        this.A1c = r102;
        this.A0E = r17;
        this.A1g = r106;
        AnonymousClass17F r1 = r39;
        this.A0a = r1;
        this.A1f = r105;
        this.A0M = r25;
        this.A1W = r96;
        this.A0h = r46;
        this.A0j = r48;
        this.A0r = r55;
        this.A12 = r66;
        this.A1Z = r99;
        this.A1M = r86;
        this.A1k = r110;
        this.A1X = r97;
        this.A0z = r63;
        this.A15 = r69;
        this.A1G = r80;
        this.A1O = r88;
        this.A0H = r20;
        this.A0K = r23;
        this.A0P = r28;
        this.A0b = r40;
        this.A0s = r56;
        this.A0t = r57;
        this.A0w = r60;
        this.A16 = r70;
        this.A1Y = r98;
        this.A1K = r84;
        this.A1R = r91;
        this.A0L = r24;
        this.A0T = r32;
        this.A0U = r33;
        this.A1b = r101;
        AnonymousClass17H r2 = r51;
        this.A0n = r2;
        this.A0o = r52;
        this.A14 = r68;
        this.A18 = r72;
        this.A1C = r76;
        this.A1F = r79;
        this.A0G = r19;
        this.A0l = r50;
        this.A09 = r12;
        this.A0v = r59;
        this.A0y = r62;
        this.A0B = r14;
        this.A0Z = r38;
        this.A0i = r47;
        this.A0q = r54;
        this.A17 = r71;
        this.A1A = r74;
        this.A1h = r107;
        this.A1L = r85;
        this.A1P = r89;
        this.A0I = r21;
        this.A0J = r22;
        this.A0R = r30;
        this.A0V = r34;
        this.A0Y = r37;
        this.A0k = r49;
        this.A1e = r104;
        this.A11 = r65;
        this.A1B = r75;
        this.A1N = r87;
        this.A1I = r82;
        this.A1Q = r90;
        this.A0f = r44;
        this.A0c = r41;
        this.A0d = r42;
        this.A13 = r67;
        this.A10 = r64;
        this.A0X = r36;
        this.A0p = r53;
        this.A0Q = r29;
        this.A07 = r10;
        this.A0W = r35;
        this.A0u = r58;
        this.A1H = r81;
        this.A1n = r113;
        this.A1i = r108;
        this.A1d = r103;
        this.A1T = r93;
        this.A01 = r4;
        this.A0x = r61;
        this.A1m = r112;
        this.A0m = r2.A01;
        this.A1o = r2.A02;
        r1.A0L(new C42831yk());
    }

    public static C16740tZ A00(C16460t6 r0, C28381Vw r1) {
        return r0.A0K.A03(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00cf, code lost:
        if ((!r0) == false) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(X.C16040sK r8, X.C222417e r9, X.C15860rz r10, X.C15840rx r11, X.C16740tZ r12) {
        /*
            r7 = 0
            if (r11 == 0) goto L_0x0044
            boolean r0 = r11.A0e
            if (r0 == 0) goto L_0x0044
            boolean r0 = X.C38621r6.A0d(r12)
            if (r0 != 0) goto L_0x0044
            boolean r0 = r12 instanceof X.C39391sP
            if (r0 != 0) goto L_0x0044
            byte r1 = r12.A10
            r0 = 8
            if (r1 == r0) goto L_0x0044
            boolean r0 = X.C38621r6.A0f(r12)
            if (r0 != 0) goto L_0x0044
            boolean r0 = X.C38621r6.A0k(r12)
            if (r0 != 0) goto L_0x0044
            boolean r0 = X.C38621r6.A0h(r12)
            if (r0 != 0) goto L_0x0044
            boolean r0 = X.C38621r6.A0i(r12)
            if (r0 != 0) goto L_0x0044
            X.1Vw r0 = r12.A11
            boolean r2 = r0.A02
            if (r2 == 0) goto L_0x0054
            boolean r3 = X.C38621r6.A0p(r12)
            if (r3 == 0) goto L_0x0045
            r0 = r12
            X.1WU r0 = (X.AnonymousClass1WU) r0
            int r1 = r0.A00
            r0 = 21
            if (r1 != r0) goto L_0x0045
        L_0x0044:
            return r7
        L_0x0045:
            if (r3 == 0) goto L_0x0054
            r0 = r12
            X.1WU r0 = (X.AnonymousClass1WU) r0
            int r1 = r0.A00
            r0 = 27
            if (r1 == r0) goto L_0x0044
            r0 = 6
            if (r1 != r0) goto L_0x0054
            return r7
        L_0x0054:
            boolean r0 = X.C38621r6.A0q(r12)
            if (r0 != 0) goto L_0x0044
            boolean r0 = X.C38621r6.A0e(r12)
            if (r0 != 0) goto L_0x0044
            if (r2 == 0) goto L_0x0092
            boolean r3 = X.C38621r6.A0p(r12)
            if (r3 == 0) goto L_0x0076
            r0 = r12
            X.1WU r0 = (X.AnonymousClass1WU) r0
            int r1 = r0.A00
            r0 = 29
            if (r1 == r0) goto L_0x0044
            r0 = 30
            if (r1 != r0) goto L_0x0076
            return r7
        L_0x0076:
            if (r3 == 0) goto L_0x0092
            r0 = r12
            X.1WU r0 = (X.AnonymousClass1WU) r0
            int r1 = r0.A00
            r0 = 31
            if (r1 == r0) goto L_0x0044
            r0 = 32
            if (r1 == r0) goto L_0x0044
            r0 = 53
            if (r1 == r0) goto L_0x0044
            r0 = 54
            if (r1 == r0) goto L_0x0044
            r0 = 56
            if (r1 != r0) goto L_0x0092
            return r7
        L_0x0092:
            boolean r0 = X.C38621r6.A0j(r12)
            if (r0 != 0) goto L_0x0044
            boolean r0 = r12 instanceof X.AnonymousClass1WU
            if (r0 == 0) goto L_0x00d1
            r0 = r12
            X.1WU r0 = (X.AnonymousClass1WU) r0
            int r1 = r0.A00
            long r3 = (long) r1
            r5 = 62
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0044
            r5 = 63
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0044
            boolean r0 = X.C38621r6.A0O(r1)
            if (r0 != 0) goto L_0x00e3
            r0 = 13
            if (r1 == r0) goto L_0x00e3
            r0 = 14
            if (r1 == r0) goto L_0x00e3
            r0 = 4
            if (r1 == r0) goto L_0x00c5
            r0 = 7
            if (r1 == r0) goto L_0x00c5
            r0 = 5
            if (r1 != r0) goto L_0x00d1
        L_0x00c5:
            X.0rv r0 = r12.A0B()
            boolean r0 = r8.A0I(r0)
        L_0x00cd:
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0044
        L_0x00d1:
            if (r2 == 0) goto L_0x0100
            boolean r3 = X.C38621r6.A0p(r12)
            if (r3 == 0) goto L_0x00f5
            r0 = r12
            X.1WU r0 = (X.AnonymousClass1WU) r0
            int r1 = r0.A00
            r0 = 73
            if (r1 != r0) goto L_0x00f5
            return r7
        L_0x00e3:
            r0 = r12
            X.1sE r0 = (X.C39291sE) r0
            java.util.List r1 = r0.A01
            r8.A0B()
            X.1ZT r0 = r8.A05
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r1.contains(r0)
            goto L_0x00cd
        L_0x00f5:
            if (r3 == 0) goto L_0x0100
            X.1WU r12 = (X.AnonymousClass1WU) r12
            int r1 = r12.A00
            r0 = 74
            if (r1 != r0) goto L_0x0100
            return r7
        L_0x0100:
            X.0rz r0 = r9.A03
            boolean r0 = r0.A1b()
            if (r0 != 0) goto L_0x011a
            if (r2 != 0) goto L_0x0120
            X.0sK r0 = r9.A00
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0120
            java.lang.String r0 = "archiveutil/enableArchiveV2IfNeededForMessage/Enabling archive2.0"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.A02()
        L_0x011a:
            boolean r0 = r10.A1c()
            if (r0 == 0) goto L_0x0044
        L_0x0120:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A01(X.0sK, X.17e, X.0rz, X.0rx, X.0tZ):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r0.longValue() > r8.A0I) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(X.C17030uP r5, X.C15810rt r6, X.C18600wx r7, X.C16740tZ r8) {
        /*
            X.1Vw r1 = r8.A11
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x001f
            X.0rv r0 = r1.A00
            boolean r0 = X.C16030sJ.A0O(r0)
            if (r0 == 0) goto L_0x001f
            java.lang.Long r0 = r8.A0Y
            if (r0 == 0) goto L_0x001f
            X.AnonymousClass00B.A06(r0)
            long r3 = r0.longValue()
            long r1 = r8.A0I
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0026
        L_0x001f:
            boolean r1 = A03(r5, r6, r7, r8)
            r0 = 0
            if (r1 == 0) goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A02(X.0uP, X.0rt, X.0wx, X.0tZ):boolean");
    }

    public static boolean A03(C17030uP r2, C15810rt r3, C18600wx r4, C16740tZ r5) {
        C28381Vw r0 = r5.A11;
        C15830rv r1 = r0.A00;
        return !r0.A02 && C16030sJ.A0O(r1) && !r2.A02((UserJid) r1) && !(r5 instanceof C38971ri) && !(r5 instanceof C39231s8) && r3.A06(r1) == null && r5.A04 == 0 && r4.A05.A00().getInt("disappearing_mode_duration_int", 0) != 0;
    }

    public static boolean A04(C15810rt r4, C16740tZ r5) {
        if (r5 instanceof C40281tr) {
            return false;
        }
        C28381Vw r1 = r5.A11;
        if (!r1.A02) {
            return false;
        }
        C15830rv r2 = r1.A00;
        if (!C16030sJ.A0O(r2) || r5.A0Y == null) {
            return false;
        }
        int i2 = r5.A00;
        return (i2 == 2 || i2 == 1) && r4.A06(r2) == null;
    }

    public static boolean A05(C15810rt r3, C16740tZ r4) {
        C28381Vw r1 = r4.A11;
        if (r1.A02 || (r4 instanceof C38971ri) || (r4 instanceof C39231s8)) {
            return false;
        }
        C15830rv r12 = r1.A00;
        if (!C16030sJ.A0O(r12) || r3.A06(r12) != null || r4.A04 <= 0) {
            return false;
        }
        int i2 = r4.A00;
        return i2 == 1 || i2 == 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v2, types: [int] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(java.io.File r7) {
        /*
            java.io.File[] r6 = r7.listFiles()
            r5 = 0
            if (r6 == 0) goto L_0x0030
            int r4 = r6.length
            r3 = 0
        L_0x0009:
            if (r5 >= r4) goto L_0x002f
            r2 = r6[r5]
            java.lang.String r1 = r2.getName()
            java.lang.String r0 = ".nomedia"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001d
            r3 = 1
        L_0x001a:
            int r5 = r5 + 1
            goto L_0x0009
        L_0x001d:
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L_0x0028
            boolean r3 = A06(r2)
            goto L_0x001a
        L_0x0028:
            r2.getPath()
            X.AnonymousClass1XI.A0N(r2)
            goto L_0x001a
        L_0x002f:
            r5 = r3
        L_0x0030:
            r7.getPath()
            if (r5 != 0) goto L_0x0038
            X.AnonymousClass1XI.A0N(r7)
        L_0x0038:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A06(java.io.File):boolean");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00b3 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x00b3=Splitter:B:38:0x00b3, B:30:0x00a6=Splitter:B:30:0x00a6, B:11:0x004b=Splitter:B:11:0x004b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A07(X.C16740tZ r17) {
        /*
            r16 = this;
            r0 = r16
            X.171 r6 = r0.A1B
            r5 = r17
            long r8 = r5.A13
            r7 = 0
            r2 = 0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b9
            X.11I r1 = r6.A01
            java.lang.String r0 = "send_count_ready"
            long r3 = r1.A01(r0, r2)
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0056
            X.AnonymousClass171.A00(r5)
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            long r0 = r5.A13
            java.lang.String r0 = java.lang.Long.toString(r0)
            r2[r7] = r0
            X.0tq r0 = r6.A00
            X.0tf r3 = r0.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = "SELECT send_count FROM message_send_count WHERE message_row_id = ?"
            android.database.Cursor r1 = r1.A08(r0, r2)     // Catch:{ all -> 0x00b4 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "send_count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004f }
            int r7 = r1.getInt(r0)     // Catch:{ all -> 0x004f }
        L_0x004b:
            r1.close()     // Catch:{ all -> 0x00b4 }
            goto L_0x00a9
        L_0x004f:
            r0 = move-exception
            if (r1 == 0) goto L_0x00b3
            r1.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x00b3
        L_0x0056:
            X.1Vw r5 = r5.A11
            java.lang.String r4 = "send_count"
            X.0rv r0 = r5.A00
            X.AnonymousClass00B.A06(r0)
            java.lang.String r2 = r0.getRawString()
            X.0tq r0 = r6.A00
            X.0tf r3 = r0.get()
            X.0tg r8 = r3.A02     // Catch:{ all -> 0x00b4 }
            java.lang.String r9 = "messages"
            r1 = 1
            java.lang.String[] r10 = new java.lang.String[r1]     // Catch:{ all -> 0x00b4 }
            r10[r7] = r4     // Catch:{ all -> 0x00b4 }
            java.lang.String r11 = "key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ all -> 0x00b4 }
            r12[r7] = r2     // Catch:{ all -> 0x00b4 }
            boolean r0 = r5.A02     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = "1"
        L_0x0080:
            r12[r1] = r0     // Catch:{ all -> 0x00b4 }
            r1 = 2
            java.lang.String r0 = r5.A01     // Catch:{ all -> 0x00b4 }
            r12[r1] = r0     // Catch:{ all -> 0x00b4 }
            r13 = 0
            r15 = r13
            r14 = r13
            android.database.Cursor r2 = r8.A09(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00b4 }
            goto L_0x0092
        L_0x008f:
            java.lang.String r0 = "0"
            goto L_0x0080
        L_0x0092:
            int r1 = r2.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00ad }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x00a6
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x00a6
            int r7 = r2.getInt(r1)     // Catch:{ all -> 0x00ad }
        L_0x00a6:
            r2.close()     // Catch:{ all -> 0x00b4 }
        L_0x00a9:
            r3.close()
            return r7
        L_0x00ad:
            r0 = move-exception
            if (r2 == 0) goto L_0x00b3
            r2.close()     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            throw r0
        L_0x00b9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A07(X.0tZ):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0059 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0059=Splitter:B:16:0x0059, B:8:0x004c=Splitter:B:8:0x004c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A08(X.C15830rv r5, long r6) {
        /*
            r4 = this;
            r0 = 5
            java.lang.String[] r2 = new java.lang.String[r0]
            X.0ts r0 = r4.A0N
            long r0 = r0.A02(r5)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r0 = 1
            r2[r0] = r1
            r0 = 2
            r2[r0] = r1
            r0 = 3
            r2[r0] = r1
            X.0t3 r0 = r4.A0F
            long r0 = r0.A00()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 4
            r2[r0] = r1
            X.0tq r0 = r4.A0v
            X.0tf r3 = r0.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x005a }
            java.lang.String r0 = " SELECT sort_id FROM available_message_view WHERE chat_row_id = ?  AND  (  ( from_me = 1 AND (  CASE  WHEN status = 0 THEN 0  WHEN receipt_server_timestamp > 0  THEN receipt_server_timestamp <= ?  WHEN receipt_device_timestamp > 0  THEN receipt_device_timestamp <= ?  WHEN timestamp > 0  THEN timestamp <= ?  ELSE 0  END  ) ) OR  ( timestamp <= ?  AND from_me = 0 )  )  AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC  LIMIT 1"
            android.database.Cursor r2 = r1.A08(r0, r2)     // Catch:{ all -> 0x005a }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0053 }
            if (r0 != 0) goto L_0x0041
            r0 = -1
            goto L_0x004c
        L_0x0041:
            java.lang.String r0 = "sort_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0053 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0053 }
        L_0x004c:
            r2.close()     // Catch:{ all -> 0x005a }
            r3.close()
            return r0
        L_0x0053:
            r0 = move-exception
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ all -> 0x0059 }
        L_0x0059:
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x005e }
        L_0x005e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A08(X.0rv, long):long");
    }

    public Cursor A09(long j2, long j3, long j4) {
        String[] strArr = {String.valueOf(j2), String.valueOf(j3), String.valueOf(j4), String.valueOf(5000)};
        C16800tf A012 = this.A0v.get();
        try {
            Cursor A082 = A012.A02.A08(AnonymousClass1WW.A0J, strArr);
            A012.close();
            return A082;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public Cursor A0A(C15830rv r5, long j2, long j3, long j4) {
        String[] strArr = {String.valueOf(this.A0N.A02(r5)), String.valueOf(j2), String.valueOf(j3), String.valueOf(j4), String.valueOf(this.A0F.A00())};
        C16800tf A012 = this.A0v.get();
        try {
            Cursor A082 = A012.A02.A08("   SELECT _id, sort_id, key_id, from_me, timestamp, receipt_server_timestamp, starred, media_size, status FROM available_message_view WHERE chat_row_id = ? AND sort_id > ? AND sort_id <= ? AND timestamp <= ?  AND message_type = 7 AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC ", strArr);
            A012.close();
            return A082;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (X.C16030sJ.A0L(r7) != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        if (r3.A00.A0G() != false) goto L_0x0040;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0135 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x013a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C34651kc A0B(X.C15830rv r26, int r27, long r28, long r30) {
        /*
            r25 = this;
            r4 = r28
            r6 = r25
            X.0uq r3 = r6.A19
            X.0rt r0 = r3.A03
            r7 = r26
            X.0rx r0 = r0.A06(r7)
            r17 = 1
            r19 = r27
            r22 = r30
            if (r0 != 0) goto L_0x0025
            r4 = 1
        L_0x0018:
            r24 = 1
            r18 = r7
            r20 = r4
            r17 = r6
            X.1kc r0 = r17.A0C(r18, r19, r20, r22, r24)
            return r0
        L_0x0025:
            long r15 = android.os.SystemClock.uptimeMillis()
            X.0pd r2 = r3.A08
            r1 = 1303(0x517, float:1.826E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r14 = 0
            r13 = 1
            if (r0 != 0) goto L_0x0040
            X.0sK r0 = r3.A00
            boolean r0 = r0.A0G()
            r12 = 0
            if (r0 == 0) goto L_0x0041
        L_0x0040:
            r12 = 1
        L_0x0041:
            boolean r0 = X.C16030sJ.A0G(r7)
            if (r0 != 0) goto L_0x004e
            boolean r0 = X.C16030sJ.A0L(r7)
            r2 = 1
            if (r0 == 0) goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            java.lang.String r1 = "msgstore/startref "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            X.1Zf r9 = new X.1Zf
            r9.<init>((java.lang.String) r0)
            java.lang.String r0 = "   SELECT _id FROM available_message_view WHERE chat_row_id = ?"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            X.C224417y.A02(r8, r2)
            java.lang.String r0 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r8.append(r0)
            java.lang.String r2 = " "
            int r0 = (r28 > r17 ? 1 : (r28 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0081
            if (r12 == 0) goto L_0x00d3
            r8.append(r2)
            java.lang.String r0 = " AND sort_id < ?"
        L_0x007e:
            r8.append(r0)
        L_0x0081:
            java.lang.String r1 = " LIMIT ?"
            if (r12 == 0) goto L_0x00cd
            r8.append(r2)
            java.lang.String r0 = " ORDER BY sort_id DESC"
        L_0x008a:
            r8.append(r0)
            r8.append(r1)
            java.lang.String r10 = r8.toString()
            int r1 = (r28 > r17 ? 1 : (r28 == r17 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x009a
            r0 = 1
        L_0x009a:
            r11 = 2
            r8 = 3
            if (r0 == 0) goto L_0x00d9
            r0 = 4
            java.lang.String[] r2 = new java.lang.String[r0]
            X.0ts r0 = r3.A02
            long r0 = r0.A02(r7)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r14] = r0
            java.lang.String r0 = java.lang.String.valueOf(r22)
            r2[r13] = r0
            if (r12 == 0) goto L_0x00c8
            X.15B r0 = r3.A07
            long r0 = r0.A03(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x00bf:
            r2[r11] = r0
            java.lang.String r0 = java.lang.String.valueOf(r19)
            r2[r8] = r0
            goto L_0x00f3
        L_0x00c8:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            goto L_0x00bf
        L_0x00cd:
            r8.append(r2)
            java.lang.String r0 = " ORDER BY _id DESC"
            goto L_0x008a
        L_0x00d3:
            r8.append(r2)
            java.lang.String r0 = " AND _id < ? "
            goto L_0x007e
        L_0x00d9:
            java.lang.String[] r2 = new java.lang.String[r8]
            X.0ts r0 = r3.A02
            long r0 = r0.A02(r7)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r14] = r0
            java.lang.String r0 = java.lang.String.valueOf(r22)
            r2[r13] = r0
            java.lang.String r0 = java.lang.String.valueOf(r19)
            r2[r11] = r0
        L_0x00f3:
            X.0tq r0 = r3.A06     // Catch:{ SQLiteDatabaseCorruptException -> 0x013b }
            X.0tf r8 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x013b }
            X.0tg r0 = r8.A02     // Catch:{ all -> 0x0136 }
            android.database.Cursor r2 = r0.A08(r10, r2)     // Catch:{ all -> 0x0136 }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x0113
            java.lang.String r0 = "_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x012f }
            long r4 = r2.getLong(r0)     // Catch:{ all -> 0x012f }
        L_0x010f:
            r9.A01()     // Catch:{ all -> 0x012f }
            goto L_0x0128
        L_0x0113:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x012f }
            r1.<init>()     // Catch:{ all -> 0x012f }
            java.lang.String r0 = "msgstore/startref can't get value for "
            r1.append(r0)     // Catch:{ all -> 0x012f }
            r1.append(r7)     // Catch:{ all -> 0x012f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x012f }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x012f }
            goto L_0x010f
        L_0x0128:
            r2.close()     // Catch:{ all -> 0x0136 }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x013b }
            goto L_0x0144
        L_0x012f:
            r0 = move-exception
            if (r2 == 0) goto L_0x0135
            r2.close()     // Catch:{ all -> 0x0135 }
        L_0x0135:
            throw r0     // Catch:{ all -> 0x0136 }
        L_0x0136:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x013a }
        L_0x013a:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x013b }
        L_0x013b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r3.A05
            r0.A02()
        L_0x0144:
            X.0vN r3 = r3.A04
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r15
            java.lang.String r0 = "RowIdStore/getStartRef"
            r3.A00(r0, r1)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0B(X.0rv, int, long, long):X.1kc");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (X.C16030sJ.A0L(r8) != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r4.A05.A0G() != false) goto L_0x002f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x017a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C34651kc A0C(X.C15830rv r19, int r20, long r21, long r23, boolean r25) {
        /*
            r18 = this;
            r0 = r21
            long r14 = android.os.SystemClock.uptimeMillis()
            r8 = r19
            boolean r2 = X.C16030sJ.A0G(r8)
            r13 = 1
            r12 = 0
            if (r2 != 0) goto L_0x0017
            boolean r2 = X.C16030sJ.A0L(r8)
            r10 = 1
            if (r2 == 0) goto L_0x0018
        L_0x0017:
            r10 = 0
        L_0x0018:
            r4 = r18
            X.0pd r5 = r4.A1U
            r3 = 1303(0x517, float:1.826E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r5.A0E(r2, r3)
            if (r2 != 0) goto L_0x002f
            X.0sK r2 = r4.A05
            boolean r2 = r2.A0G()
            r11 = 0
            if (r2 == 0) goto L_0x0030
        L_0x002f:
            r11 = 1
        L_0x0030:
            r6 = 0
            r9 = 2
            r5 = 3
            int r2 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x00cd
            r6 = 1
            int r2 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x00cd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = X.AnonymousClass1WW.A0H
            r3.append(r2)
            X.C224417y.A02(r3, r10)
            java.lang.String r2 = " "
            r3.append(r2)
            java.lang.String r2 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r3.append(r2)
            if (r11 == 0) goto L_0x00b0
            java.lang.String r2 = " AND sort_id >= ?"
            r3.append(r2)
            if (r25 == 0) goto L_0x00ad
            java.lang.String r2 = " ORDER BY sort_id DESC"
        L_0x0060:
            r3.append(r2)
            java.lang.String r7 = r3.toString()
            java.lang.String r3 = "msgstore/messages "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            X.1Zf r6 = new X.1Zf
            r6.<init>((java.lang.String) r2)
            if (r11 == 0) goto L_0x00aa
            X.15B r2 = r4.A1D
            long r16 = r2.A03(r0)
        L_0x0082:
            java.lang.String[] r5 = new java.lang.String[r5]
            X.0ts r2 = r4.A0N
            long r2 = r2.A02(r8)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5[r12] = r2
            java.lang.String r2 = java.lang.String.valueOf(r23)
            r5[r13] = r2
            if (r11 == 0) goto L_0x00a5
            java.lang.String r2 = java.lang.String.valueOf(r16)
        L_0x009c:
            r5[r9] = r2
            X.0tq r2 = r4.A0v
            X.0tf r3 = r2.get()
            goto L_0x00bd
        L_0x00a5:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            goto L_0x009c
        L_0x00aa:
            r16 = r0
            goto L_0x0082
        L_0x00ad:
            java.lang.String r2 = " ORDER BY sort_id ASC"
            goto L_0x0060
        L_0x00b0:
            java.lang.String r2 = " AND _id >= ? "
            r3.append(r2)
            if (r25 == 0) goto L_0x00ba
            java.lang.String r2 = " ORDER BY _id DESC"
            goto L_0x0060
        L_0x00ba:
            java.lang.String r2 = " ORDER BY _id ASC"
            goto L_0x0060
        L_0x00bd:
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x00c8 }
            android.database.Cursor r13 = r2.A08(r7, r5)     // Catch:{ all -> 0x00c8 }
            r3.close()
            goto L_0x0160
        L_0x00c8:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            throw r0
        L_0x00cd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = X.AnonymousClass1WW.A0H
            r3.append(r2)
            X.C224417y.A02(r3, r10)
            java.lang.String r2 = " "
            r3.append(r2)
            java.lang.String r2 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r3.append(r2)
            if (r11 == 0) goto L_0x0127
            if (r25 == 0) goto L_0x0124
            java.lang.String r2 = " ORDER BY sort_id DESC"
        L_0x00ea:
            r3.append(r2)
            java.lang.String r2 = " LIMIT ?"
            r3.append(r2)
            java.lang.String r7 = r3.toString()
            java.lang.String r3 = "msgstore/messages/indexed "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            X.1Zf r6 = new X.1Zf
            r6.<init>((java.lang.String) r2)
            java.lang.String[] r5 = new java.lang.String[r5]
            X.0ts r2 = r4.A0N
            long r2 = r2.A02(r8)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5[r12] = r2
            java.lang.String r2 = java.lang.String.valueOf(r23)
            r5[r13] = r2
            java.lang.String r2 = java.lang.String.valueOf(r20)
            r5[r9] = r2
            goto L_0x012f
        L_0x0124:
            java.lang.String r2 = " ORDER BY sort_id ASC"
            goto L_0x00ea
        L_0x0127:
            if (r25 == 0) goto L_0x012c
            java.lang.String r2 = " ORDER BY _id DESC"
            goto L_0x00ea
        L_0x012c:
            java.lang.String r2 = " ORDER BY _id ASC"
            goto L_0x00ea
        L_0x012f:
            X.0tq r2 = r4.A0v     // Catch:{ all -> 0x017b }
            X.0tf r3 = r2.get()     // Catch:{ all -> 0x017b }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0176 }
            android.database.Cursor r13 = r2.A08(r7, r5)     // Catch:{ all -> 0x0176 }
            boolean r2 = r13.moveToLast()     // Catch:{ all -> 0x0176 }
            if (r2 == 0) goto L_0x015a
            java.lang.String r0 = "_id"
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0176 }
            long r0 = r13.getLong(r0)     // Catch:{ all -> 0x0176 }
            java.lang.String r2 = "sort_id"
            int r2 = r13.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0176 }
            long r16 = r13.getLong(r2)     // Catch:{ all -> 0x0176 }
        L_0x0156:
            r13.moveToFirst()     // Catch:{ all -> 0x0176 }
            goto L_0x015d
        L_0x015a:
            r16 = -9223372036854775808
            goto L_0x0156
        L_0x015d:
            r3.close()     // Catch:{ all -> 0x017b }
        L_0x0160:
            r6.A01()
            X.0vN r5 = r4.A0T
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r14
            java.lang.String r2 = "CoreMessageStore/getMessagesForJid"
            r5.A00(r2, r3)
            X.1kc r12 = new X.1kc
            r14 = r0
            r12.<init>(r13, r14, r16)
            return r12
        L_0x0176:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x017a }
        L_0x017a:
            throw r0     // Catch:{ all -> 0x017b }
        L_0x017b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0C(X.0rv, int, long, long, boolean):X.1kc");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0290, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0291, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0294, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0295, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0298, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0299, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x029c, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x029d, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (r5 < r0.A0F.A00()) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0495, code lost:
        if (r11.A06(r4) == null) goto L_0x0497;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04ba, code lost:
        if (r4 == 14) goto L_0x04bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0582, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0584, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0585, code lost:
        r26 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0587, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0589, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x058b, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x058d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x058e, code lost:
        r26 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0590, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0593, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0595, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0596, code lost:
        r26 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0598, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x059b, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x059c, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x059f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x05a0, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:?, code lost:
        com.whatsapp.util.Log.e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x05a4, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x05a5, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x05a6, code lost:
        r4 = true;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0600, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0601, code lost:
        r4 = true;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0604, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0605, code lost:
        r26 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0607, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:?, code lost:
        com.whatsapp.util.Log.w("msgstore/addmsg/will retry ", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:?, code lost:
        r20.close();
        android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0617, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("msgstore/end transaction ");
        r1.append(r7);
        com.whatsapp.util.Log.e(r1.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0640, code lost:
        r5 = r0.A0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0646, code lost:
        if (r5.A0P() != false) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0648, code lost:
        r6 = r0.A15;
        r6.A04("fts_ready", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:?, code lost:
        r7 = A0D(r3, 0);
        r5.A0K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0657, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r1);
        r0.A0u.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r2);
        r0.A0t.A00(r4 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x066a, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x066b, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x066c, code lost:
        r4 = true;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x068f, code lost:
        r3.A0F = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x06e7, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x06e8, code lost:
        r4 = true;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f1, code lost:
        if ((r1.A0I + (((long) r0) * 1000)) >= r6) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0741, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x07ca, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:?, code lost:
        r20.close();
        android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x07d2, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("msgstore/end transaction ");
        r1.append(r7);
        com.whatsapp.util.Log.e(r1.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x07fd, code lost:
        r5 = r0.A0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0803, code lost:
        if (r5.A0P() != false) goto L_0x0805;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0805, code lost:
        r6 = r0.A15;
        r6.A04("fts_ready", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:?, code lost:
        r7 = A0D(r3, 0);
        r5.A0K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0818, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r1);
        r0.A0u.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0189, code lost:
        if (r16 != false) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ec, code lost:
        if (r1 != false) goto L_0x01af;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x02c9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x02ce */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02dd A[Catch:{ all -> 0x02ce, IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02fa A[Catch:{ all -> 0x02ce, IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x030f A[Catch:{ all -> 0x02ce, IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0328 A[Catch:{ all -> 0x02ce, IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x059b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:103:0x01ff] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x059f A[ExcHandler: Error | RuntimeException (r1v82 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:103:0x01ff] */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x060a  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0662 A[SYNTHETIC, Splitter:B:359:0x0662] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x068f A[Catch:{ IOException -> 0x0595, SQLiteConstraintException -> 0x058d, SQLiteDiskIOException -> 0x0604, SQLiteDatabaseCorruptException -> 0x0584, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b, all -> 0x07ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x0769  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:154:0x02ce=Splitter:B:154:0x02ce, B:248:0x04de=Splitter:B:248:0x04de} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:222:0x0499=Splitter:B:222:0x0499, B:154:0x02ce=Splitter:B:154:0x02ce, B:248:0x04de=Splitter:B:248:0x04de} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:311:0x05a8=Splitter:B:311:0x05a8, B:389:0x06ea=Splitter:B:389:0x06ea, B:364:0x066e=Splitter:B:364:0x066e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C42871yo A0D(X.C16740tZ r47, int r48) {
        /*
            r46 = this;
            java.lang.String r19 = "SQL logic error or missing database"
            java.lang.String r15 = "msgstore/end transaction "
            java.lang.String r21 = " "
            java.lang.String r14 = "fts_ready"
            r3 = r47
            X.1Vw r10 = r3.A11
            X.0rv r4 = r10.A00
            boolean r16 = X.C16030sJ.A0Q(r4)
            r0 = r46
            if (r16 == 0) goto L_0x00b6
            X.11G r1 = r0.A1J
            boolean r2 = r1.A0I(r3)
            java.lang.String r1 = " timestamp:"
            if (r2 == 0) goto L_0x003c
            java.lang.String r0 = "msgstore/statusexpired/"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r4.append(r10)
            r4.append(r1)
            long r0 = r3.A0I
            r4.append(r0)
        L_0x0032:
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0039:
            X.1yo r7 = X.C42871yo.A05
            return r7
        L_0x003c:
            boolean r2 = r10.A02
            if (r2 != 0) goto L_0x00b6
            X.0rv r5 = r3.A0B()
            boolean r2 = X.C16030sJ.A0P(r5)
            if (r2 != 0) goto L_0x00b6
            X.0sG r7 = r0.A0A
            X.0sH r8 = r7.A08(r5)
            if (r8 == 0) goto L_0x0063
            X.1ko r2 = r8.A0D
            long r5 = r8.A09
            if (r2 != 0) goto L_0x0099
            X.0t3 r0 = r0.A0F
            long r11 = r0.A00()
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            r2 = 1
            if (r0 >= 0) goto L_0x0064
        L_0x0063:
            r2 = 0
        L_0x0064:
            java.lang.String r0 = "msgstore/status-from-unknown/ id:"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            java.lang.String r0 = r10.A01
            r4.append(r0)
            java.lang.String r0 = " from:"
            r4.append(r0)
            X.0rv r0 = r3.A0B()
            r4.append(r0)
            r4.append(r1)
            long r0 = r3.A0I
            r4.append(r0)
            java.lang.String r0 = " cached:"
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " contact-is-null:"
            r4.append(r0)
            r0 = 0
            if (r8 != 0) goto L_0x0095
            r0 = 1
        L_0x0095:
            r4.append(r0)
            goto L_0x0032
        L_0x0099:
            long r1 = r3.A0I
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            long r1 = r1 + r11
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x00b6
            X.0t3 r1 = r0.A0F
            long r1 = r1.A00()
            r5 = 604800000(0x240c8400, double:2.988109026E-315)
            long r1 = r1 + r5
            r8.A09 = r1
            java.util.List r1 = java.util.Collections.singletonList(r8)
            r7.A0W(r1)
        L_0x00b6:
            boolean r9 = r10.A02
            if (r9 == 0) goto L_0x00c8
            X.0so r5 = r0.A02
            X.0rt r2 = r0.A0O
            X.0sO r1 = r0.A0d
            boolean r1 = X.C38621r6.A0P(r5, r2, r1, r3)
            if (r1 != 0) goto L_0x00c8
            goto L_0x0039
        L_0x00c8:
            int r2 = r3.A04
            r1 = 0
            if (r2 <= 0) goto L_0x00ce
            r1 = 1
        L_0x00ce:
            r26 = 0
            r42 = 0
            if (r1 == 0) goto L_0x0114
            X.0th r1 = r0.A0K
            X.0tZ r1 = r1.A03(r10)
            if (r1 == 0) goto L_0x00fd
            r11 = 1
            X.0t3 r0 = r0.A0F
            long r6 = r0.A00()
            int r0 = r3.A04
            if (r0 <= 0) goto L_0x00f3
            long r4 = r1.A0I
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            long r4 = r4 + r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r12 = 1
            if (r0 < 0) goto L_0x00f4
        L_0x00f3:
            r12 = 0
        L_0x00f4:
            r8 = 0
            r9 = 0
            r10 = 0
            X.1yo r7 = new X.1yo
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        L_0x00fd:
            X.0t3 r1 = r0.A0F
            long r1 = r1.A00()
            boolean r1 = X.C38621r6.A0v(r3, r1)
            if (r1 == 0) goto L_0x0114
            r12 = 1
            X.1yo r7 = new X.1yo
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        L_0x0114:
            if (r9 != 0) goto L_0x013d
            X.0tZ r1 = r3.A0D()
            if (r1 == 0) goto L_0x013d
            X.1Vw r2 = r1.A11
            X.0th r1 = r0.A0K
            X.0tZ r5 = r1.A03(r2)
            if (r5 == 0) goto L_0x013d
            boolean r1 = X.C38621r6.A0o(r5)
            if (r1 != 0) goto L_0x013d
            byte r2 = r5.A10
            r1 = 12
            if (r2 == r1) goto L_0x013d
            boolean r1 = X.C41061vA.A0I(r3)
            if (r1 != 0) goto L_0x013d
            X.17g r1 = r0.A1g
            r1.A05(r3, r5)
        L_0x013d:
            X.0tZ r1 = r3.A0D()
            if (r1 == 0) goto L_0x0151
            X.0wS r1 = r0.A1f
            r1.A06()
            X.16r r2 = r1.A08
            X.0tZ r1 = r3.A0D()
            r2.A0f(r1)
        L_0x0151:
            X.0tZ r2 = r3.A0D()
            boolean r1 = r2 instanceof X.C38641rB
            if (r1 == 0) goto L_0x017e
            r1 = r2
            X.0tY r1 = (X.C16730tY) r1
            X.0ta r1 = r1.A02
            if (r1 == 0) goto L_0x017e
            java.io.File r1 = r1.A0F
            if (r1 != 0) goto L_0x017e
            X.1Vw r2 = r2.A11
            X.0th r1 = r0.A0K
            X.0tZ r2 = r1.A03(r2)
            boolean r1 = r2 instanceof X.C38641rB
            if (r1 == 0) goto L_0x01ef
            X.0tY r2 = (X.C16730tY) r2
            X.0ta r2 = r2.A02
            if (r2 == 0) goto L_0x017e
            X.0tZ r1 = r3.A0D()
            X.0tY r1 = (X.C16730tY) r1
            r1.A02 = r2
        L_0x017e:
            boolean r6 = X.C16030sJ.A0L(r4)
            boolean r13 = X.C16030sJ.A0G(r4)
            if (r13 == 0) goto L_0x018b
            r1 = 1
            if (r16 == 0) goto L_0x018c
        L_0x018b:
            r1 = 0
        L_0x018c:
            if (r6 == 0) goto L_0x01ec
            boolean r1 = r3 instanceof X.AnonymousClass1WU
            if (r1 != 0) goto L_0x01af
            X.0rv r1 = r3.A0B()
            if (r1 != 0) goto L_0x01af
            if (r9 != 0) goto L_0x01af
            java.lang.String r1 = "msgstore/addmsg/error/group/remote_resource is null! "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = X.C38621r6.A0J(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x01af:
            X.0sO r1 = r0.A0d
            r2 = r4
            X.0sN r2 = (X.C16060sN) r2
            X.0us r1 = r1.A07
            X.1cE r5 = r1.A04(r2)
            X.16S r1 = r0.A1X
            X.0rz r1 = r1.A01
            boolean r1 = r1.A1d()
            if (r1 != 0) goto L_0x01ca
            java.lang.String r1 = r5.A0A()
            r3.A0m = r1
        L_0x01ca:
            if (r9 == 0) goto L_0x01d0
            boolean r1 = r3.A1D
            if (r1 != 0) goto L_0x01dc
        L_0x01d0:
            java.util.Map r1 = r5.A04
            int r2 = r1.size()
            if (r6 == 0) goto L_0x01e5
            r1 = 1
        L_0x01d9:
            int r2 = r2 - r1
            r3.A0A = r2
        L_0x01dc:
            X.0tq r1 = r0.A0v
            r45 = r1
            X.0tf r18 = r45.A02()
            goto L_0x01f5
        L_0x01e5:
            X.0sK r1 = r0.A05
            boolean r1 = r5.A0M(r1)
            goto L_0x01d9
        L_0x01ec:
            if (r1 == 0) goto L_0x01dc
            goto L_0x01af
        L_0x01ef:
            java.lang.String r1 = "msgstore/addmsg/background/error fetching quoted sticker message"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x017e
        L_0x01f5:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0826 }
            X.1cj r20 = r18.A00()     // Catch:{ all -> 0x0826 }
            r7 = r48
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x06e7, SQLiteConstraintException -> 0x066b, SQLiteDiskIOException -> 0x0600, SQLiteDatabaseCorruptException -> 0x05a5, Error | RuntimeException -> 0x059f, all -> 0x059b }
            long r1 = r1 - r5
            r11 = 60000(0xea60, double:2.9644E-319)
            int r5 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x0222
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x06e7, SQLiteConstraintException -> 0x066b, SQLiteDiskIOException -> 0x0600, SQLiteDatabaseCorruptException -> 0x05a5, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r8.<init>()     // Catch:{ IOException -> 0x06e7, SQLiteConstraintException -> 0x066b, SQLiteDiskIOException -> 0x0600, SQLiteDatabaseCorruptException -> 0x05a5, Error | RuntimeException -> 0x059f, all -> 0x059b }
            java.lang.String r5 = "msgstore/addmsg/background/transaction-delayed "
            r8.append(r5)     // Catch:{ IOException -> 0x06e7, SQLiteConstraintException -> 0x066b, SQLiteDiskIOException -> 0x0600, SQLiteDatabaseCorruptException -> 0x05a5, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r5
            r8.append(r1)     // Catch:{ IOException -> 0x06e7, SQLiteConstraintException -> 0x066b, SQLiteDiskIOException -> 0x0600, SQLiteDatabaseCorruptException -> 0x05a5, Error | RuntimeException -> 0x059f, all -> 0x059b }
            java.lang.String r1 = r8.toString()     // Catch:{ IOException -> 0x06e7, SQLiteConstraintException -> 0x066b, SQLiteDiskIOException -> 0x0600, SQLiteDatabaseCorruptException -> 0x05a5, Error | RuntimeException -> 0x059f, all -> 0x059b }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ IOException -> 0x06e7, SQLiteConstraintException -> 0x066b, SQLiteDiskIOException -> 0x0600, SQLiteDatabaseCorruptException -> 0x05a5, Error | RuntimeException -> 0x059f, all -> 0x059b }
        L_0x0222:
            if (r13 == 0) goto L_0x02a0
            if (r9 == 0) goto L_0x02a0
            int r2 = r3.A0C     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            if (r2 == 0) goto L_0x022d
            r1 = 2
            if (r2 != r1) goto L_0x02a0
        L_0x022d:
            r1 = 1
            r3.A0t = r1     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            if (r16 != 0) goto L_0x02a0
            java.util.List r12 = r3.A0Q()     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r5.<init>()     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            X.AnonymousClass00B.A06(r12)     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            java.util.Iterator r11 = r12.iterator()     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
        L_0x0242:
            boolean r1 = r11.hasNext()     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            if (r1 == 0) goto L_0x0273
            java.lang.Object r6 = r11.next()     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            X.181 r8 = r0.A0J     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            long r1 = r3.A0I     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r27 = r8
            r28 = r6
            r29 = r3
            r30 = r5
            r31 = r1
            X.0tZ r2 = r27.A00(r28, r29, r30, r31)     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            X.10R r1 = r0.A0M     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            boolean r1 = r1.A02(r6)     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r0.A0v(r2)     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r0.A0V(r6, r2, r1)     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r0.A0X(r2)     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r0.A0Y(r2)     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            goto L_0x0242
        L_0x0273:
            int r2 = r12.size()     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            int r1 = r5.size()     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            if (r2 != r1) goto L_0x0284
            r3.A0s = r5     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
        L_0x027f:
            int r6 = r12.size()     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            goto L_0x02d2
        L_0x0284:
            int r1 = r5.size()     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            if (r1 == 0) goto L_0x027f
            java.lang.String r1 = "msgstore/validateBroadcastParticipantSizes failed"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IOException -> 0x029c, SQLiteConstraintException -> 0x0298, SQLiteDiskIOException -> 0x0294, SQLiteDatabaseCorruptException -> 0x0290, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            goto L_0x027f
        L_0x0290:
            r1 = move-exception
            r6 = 0
            goto L_0x0587
        L_0x0294:
            r2 = move-exception
            r6 = 0
            goto L_0x0607
        L_0x0298:
            r2 = move-exception
            r6 = 0
            goto L_0x0590
        L_0x029c:
            r1 = move-exception
            r6 = 0
            goto L_0x0598
        L_0x02a0:
            r6 = 0
            if (r16 == 0) goto L_0x02d2
            if (r9 == 0) goto L_0x02d2
            X.0pd r5 = r0.A1U     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            X.0tM r2 = X.C16620tM.A01     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r1 = 815(0x32f, float:1.142E-42)
            boolean r8 = r5.A0E(r2, r1)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            X.16u r1 = r0.A1H     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            X.0tq r2 = r1.A07     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            X.0tf r5 = r2.A02()     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            X.1cj r2 = r5.A00()     // Catch:{ all -> 0x02ca }
            r1.A00(r3, r8)     // Catch:{ all -> 0x02c5 }
            r2.A00()     // Catch:{ all -> 0x02c5 }
            r2.close()     // Catch:{ all -> 0x02ca }
            goto L_0x02cf
        L_0x02c5:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x02c9 }
        L_0x02c9:
            throw r1     // Catch:{ all -> 0x02ca }
        L_0x02ca:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x02ce }
        L_0x02ce:
            throw r1     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
        L_0x02cf:
            r5.close()     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
        L_0x02d2:
            r0.A0X(r3)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            long r1 = r3.A13     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r28 = -1
            int r5 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r5 == 0) goto L_0x030f
            X.16y r1 = r0.A0p     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            java.util.Set r2 = r1.A03(r3)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            if (r2 == 0) goto L_0x02f0
            boolean r1 = r2.isEmpty()     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            if (r1 != 0) goto L_0x02f0
            X.16V r1 = r0.A17     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r1.A02(r3, r2)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
        L_0x02f0:
            long r1 = r3.A13     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            int r5 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r5 != 0) goto L_0x0328
            boolean r1 = r3 instanceof X.C39131ry     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            if (r1 != 0) goto L_0x0328
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r2.<init>()     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            java.lang.String r1 = "msgstore/addmsg failed to insert: "
            r2.append(r1)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r2.append(r10)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            goto L_0x0324
        L_0x030f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r2.<init>()     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            java.lang.String r1 = "msgstore/addmsg cannot add blank receipts for: "
            r2.append(r1)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r2.append(r10)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            goto L_0x02f0
        L_0x0324:
            r40 = 0
            goto L_0x050e
        L_0x0328:
            if (r16 == 0) goto L_0x047a
            boolean r1 = X.C41061vA.A0I(r3)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            if (r1 != 0) goto L_0x04de
            X.11G r11 = r0.A1J     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            java.lang.Object r1 = r11.A06     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r17 = r1
            monitor-enter(r17)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r11.A0B()     // Catch:{ all -> 0x0477 }
            boolean r40 = r11.A0H()     // Catch:{ all -> 0x0477 }
            if (r9 == 0) goto L_0x034b
            X.1dI r2 = r11.A05()     // Catch:{ all -> 0x0477 }
        L_0x0344:
            r1 = 4
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x0477 }
            r8.<init>(r1)     // Catch:{ all -> 0x0477 }
            goto L_0x0359
        L_0x034b:
            X.0rv r1 = r3.A0B()     // Catch:{ all -> 0x0477 }
            X.AnonymousClass00B.A06(r1)     // Catch:{ all -> 0x0477 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0477 }
            X.1dI r2 = r11.A06(r1)     // Catch:{ all -> 0x0477 }
            goto L_0x0344
        L_0x0359:
            if (r2 != 0) goto L_0x040e
            if (r9 == 0) goto L_0x035e
            goto L_0x03ca
        L_0x035e:
            X.0pd r1 = r11.A05     // Catch:{ all -> 0x0477 }
            r24 = r1
            X.0t3 r1 = r11.A00     // Catch:{ all -> 0x0477 }
            r16 = r1
            X.0rv r1 = r3.A0B()     // Catch:{ all -> 0x0477 }
            com.whatsapp.jid.UserJid r25 = com.whatsapp.jid.UserJid.of(r1)     // Catch:{ all -> 0x0477 }
            X.AnonymousClass00B.A06(r25)     // Catch:{ all -> 0x0477 }
            long r1 = r3.A14     // Catch:{ all -> 0x0477 }
            r30 = r1
            long r12 = r3.A14     // Catch:{ all -> 0x0477 }
            r1 = 1
            long r12 = r12 - r1
            long r4 = r3.A14     // Catch:{ all -> 0x0477 }
            long r4 = r4 - r1
            long r1 = r3.A14     // Catch:{ all -> 0x0477 }
            r36 = r1
            long r1 = r3.A14     // Catch:{ all -> 0x0477 }
            r38 = r1
            long r1 = r3.A0I     // Catch:{ all -> 0x0477 }
            r43 = r1
            X.1dI r1 = new X.1dI     // Catch:{ all -> 0x0477 }
            r27 = 0
            r22 = r1
            r23 = r16
            r28 = r30
            r30 = r12
            r32 = r4
            r34 = r36
            r36 = r38
            r38 = r43
            r22.<init>(r23, r24, r25, r26, r27, r28, r30, r32, r34, r36, r38)     // Catch:{ all -> 0x0477 }
            r1.A08 = r3     // Catch:{ all -> 0x0477 }
            int r2 = r1.A00     // Catch:{ all -> 0x0477 }
            int r2 = r2 + 1
            r1.A00 = r2     // Catch:{ all -> 0x0477 }
            r5 = 2039(0x7f7, float:2.857E-42)
            X.0tM r4 = X.C16620tM.A02     // Catch:{ all -> 0x0477 }
            r2 = r24
            boolean r2 = r2.A0E(r4, r5)     // Catch:{ all -> 0x0477 }
            if (r2 != 0) goto L_0x03be
            X.0tZ r2 = r1.A08     // Catch:{ all -> 0x0477 }
            X.1Vw r2 = r2.A11     // Catch:{ all -> 0x0477 }
            boolean r2 = r2.A02     // Catch:{ all -> 0x0477 }
            if (r2 == 0) goto L_0x03be
            r2 = 0
            goto L_0x03c2
        L_0x03be:
            int r2 = r1.A01     // Catch:{ all -> 0x0477 }
            int r2 = r2 + 1
        L_0x03c2:
            r1.A01 = r2     // Catch:{ all -> 0x0477 }
            X.0tZ r2 = r1.A08     // Catch:{ all -> 0x0477 }
            X.C30991dI.A00(r2)     // Catch:{ all -> 0x0477 }
            goto L_0x03ea
        L_0x03ca:
            X.0pd r4 = r11.A05     // Catch:{ all -> 0x0477 }
            X.0t3 r2 = r11.A00     // Catch:{ all -> 0x0477 }
            X.1jg r25 = X.C34091jg.A00     // Catch:{ all -> 0x0477 }
            r38 = 0
            X.1dI r1 = new X.1dI     // Catch:{ all -> 0x0477 }
            r27 = 0
            r30 = -1
            r32 = -1
            r34 = -1
            r36 = -1
            r22 = r1
            r23 = r2
            r24 = r4
            r22.<init>(r23, r24, r25, r26, r27, r28, r30, r32, r34, r36, r38)     // Catch:{ all -> 0x0477 }
            r1.A06(r3)     // Catch:{ all -> 0x0477 }
        L_0x03ea:
            java.lang.String r2 = "last_read_message_table_id"
            long r4 = r3.A14     // Catch:{ all -> 0x0477 }
            r12 = 1
            long r4 = r4 - r12
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0477 }
            r8.put(r2, r4)     // Catch:{ all -> 0x0477 }
            java.lang.String r2 = "last_read_receipt_sent_message_table_id"
            long r4 = r3.A14     // Catch:{ all -> 0x0477 }
            long r4 = r4 - r12
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0477 }
            r8.put(r2, r4)     // Catch:{ all -> 0x0477 }
            java.util.concurrent.ConcurrentHashMap r4 = r11.A08     // Catch:{ all -> 0x0477 }
            com.whatsapp.jid.UserJid r2 = r1.A0B     // Catch:{ all -> 0x0477 }
            r4.put(r2, r1)     // Catch:{ all -> 0x0477 }
            r16 = 1
            goto L_0x0414
        L_0x040e:
            X.1dI r1 = r2.A06(r3)     // Catch:{ all -> 0x0477 }
            r16 = 0
        L_0x0414:
            java.lang.String r2 = "message_table_id"
            long r4 = r3.A14     // Catch:{ all -> 0x0477 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0477 }
            r8.put(r2, r4)     // Catch:{ all -> 0x0477 }
            java.lang.String r4 = "timestamp"
            long r12 = r1.A04()     // Catch:{ all -> 0x0477 }
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0477 }
            r8.put(r4, r2)     // Catch:{ all -> 0x0477 }
            java.lang.String r4 = "unseen_count"
            int r2 = r1.A02()     // Catch:{ all -> 0x0477 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0477 }
            r8.put(r4, r2)     // Catch:{ all -> 0x0477 }
            java.lang.String r4 = "total_count"
            int r2 = r1.A01()     // Catch:{ all -> 0x0477 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0477 }
            r8.put(r4, r2)     // Catch:{ all -> 0x0477 }
            java.lang.String r2 = "first_unread_message_table_id"
            monitor-enter(r1)     // Catch:{ all -> 0x0477 }
            long r4 = r1.A03     // Catch:{ all -> 0x0474 }
            monitor-exit(r1)     // Catch:{ all -> 0x0477 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0477 }
            r8.put(r2, r4)     // Catch:{ all -> 0x0477 }
            java.lang.String r2 = "autodownload_limit_message_table_id"
            monitor-enter(r1)     // Catch:{ all -> 0x0477 }
            long r4 = r1.A02     // Catch:{ all -> 0x0474 }
            monitor-exit(r1)     // Catch:{ all -> 0x0477 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0477 }
            r8.put(r2, r4)     // Catch:{ all -> 0x0477 }
            com.whatsapp.jid.UserJid r1 = r1.A0B     // Catch:{ all -> 0x0477 }
            r41 = 1
            r36 = r11
            r37 = r8
            r38 = r1
            r39 = r3
            r36.A0C(r37, r38, r39, r40, r41)     // Catch:{ all -> 0x0477 }
            monitor-exit(r17)     // Catch:{ all -> 0x0477 }
            goto L_0x04dc
        L_0x0474:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0477 }
            throw r2     // Catch:{ all -> 0x0477 }
        L_0x0477:
            r1 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0477 }
            throw r1     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
        L_0x047a:
            X.0rt r11 = r0.A0O     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            X.0rx r8 = r11.A06(r4)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            X.0sK r5 = r0.A05     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            X.17e r2 = r0.A0D     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            X.0rz r1 = r0.A0G     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            boolean r42 = A01(r5, r2, r1, r8, r3)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r0.A0Y(r3)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            if (r8 != 0) goto L_0x0497
            X.0rx r1 = r11.A06(r4)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r16 = 1
            if (r1 != 0) goto L_0x0499
        L_0x0497:
            r16 = 0
        L_0x0499:
            boolean r1 = r3 instanceof X.AnonymousClass1WU     // Catch:{ IOException -> 0x057c, SQLiteConstraintException -> 0x0576, SQLiteDiskIOException -> 0x0570, SQLiteDatabaseCorruptException -> 0x056b, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            if (r1 == 0) goto L_0x04dc
            if (r9 == 0) goto L_0x04dc
            boolean r1 = r4 instanceof X.C16060sN     // Catch:{ IOException -> 0x0595, SQLiteConstraintException -> 0x058d, SQLiteDiskIOException -> 0x0604, SQLiteDatabaseCorruptException -> 0x0584, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            if (r1 == 0) goto L_0x04dc
            r5 = r3
            X.1WU r5 = (X.AnonymousClass1WU) r5     // Catch:{ IOException -> 0x0595, SQLiteConstraintException -> 0x058d, SQLiteDiskIOException -> 0x0604, SQLiteDatabaseCorruptException -> 0x0584, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            X.0sO r1 = r0.A0d     // Catch:{ IOException -> 0x0595, SQLiteConstraintException -> 0x058d, SQLiteDiskIOException -> 0x0604, SQLiteDatabaseCorruptException -> 0x0584, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r1.A08(r5)     // Catch:{ IOException -> 0x0595, SQLiteConstraintException -> 0x058d, SQLiteDiskIOException -> 0x0604, SQLiteDatabaseCorruptException -> 0x0584, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            int r4 = r5.A00     // Catch:{ IOException -> 0x0595, SQLiteConstraintException -> 0x058d, SQLiteDiskIOException -> 0x0604, SQLiteDatabaseCorruptException -> 0x0584, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r1 = 5
            if (r4 == r1) goto L_0x04bc
            r1 = 7
            if (r4 == r1) goto L_0x04bc
            r1 = 13
            if (r4 == r1) goto L_0x04bc
            r1 = 14
            r2 = 0
            if (r4 != r1) goto L_0x04bd
        L_0x04bc:
            r2 = 1
        L_0x04bd:
            X.1Vw r1 = r5.A11     // Catch:{ IOException -> 0x0595, SQLiteConstraintException -> 0x058d, SQLiteDiskIOException -> 0x0604, SQLiteDatabaseCorruptException -> 0x0584, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            X.0rv r4 = r1.A00     // Catch:{ IOException -> 0x0595, SQLiteConstraintException -> 0x058d, SQLiteDiskIOException -> 0x0604, SQLiteDatabaseCorruptException -> 0x0584, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            boolean r1 = r4 instanceof X.C16060sN     // Catch:{ IOException -> 0x0595, SQLiteConstraintException -> 0x058d, SQLiteDiskIOException -> 0x0604, SQLiteDatabaseCorruptException -> 0x0584, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            if (r1 == 0) goto L_0x04cb
            X.0sN r4 = (X.C16060sN) r4     // Catch:{ IOException -> 0x0595, SQLiteConstraintException -> 0x058d, SQLiteDiskIOException -> 0x0604, SQLiteDatabaseCorruptException -> 0x0584, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
        L_0x04c7:
            X.AnonymousClass00B.A06(r4)     // Catch:{ IOException -> 0x0595, SQLiteConstraintException -> 0x058d, SQLiteDiskIOException -> 0x0604, SQLiteDatabaseCorruptException -> 0x0584, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            goto L_0x04cd
        L_0x04cb:
            r4 = 0
            goto L_0x04c7
        L_0x04cd:
            if (r2 == 0) goto L_0x04dc
            boolean r1 = r4 instanceof com.whatsapp.jid.GroupJid     // Catch:{ IOException -> 0x0595, SQLiteConstraintException -> 0x058d, SQLiteDiskIOException -> 0x0604, SQLiteDatabaseCorruptException -> 0x0584, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            if (r1 == 0) goto L_0x04dc
            X.17i r2 = r0.A12     // Catch:{ IOException -> 0x0595, SQLiteConstraintException -> 0x058d, SQLiteDiskIOException -> 0x0604, SQLiteDatabaseCorruptException -> 0x0584, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4     // Catch:{ IOException -> 0x0595, SQLiteConstraintException -> 0x058d, SQLiteDiskIOException -> 0x0604, SQLiteDatabaseCorruptException -> 0x0584, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r1 = r18
            r2.A00(r1, r4)     // Catch:{ IOException -> 0x0595, SQLiteConstraintException -> 0x058d, SQLiteDiskIOException -> 0x0604, SQLiteDatabaseCorruptException -> 0x0584, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
        L_0x04dc:
            r26 = r16
        L_0x04de:
            r20.A00()     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            X.1sc r1 = r0.A0m     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r1.A00(r3, r10)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            boolean r1 = r3 instanceof X.AnonymousClass1WU     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            if (r1 != 0) goto L_0x050c
            long r1 = r3.A0G     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r11 = 0
            int r4 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x050c
            X.1HK r1 = r0.A00     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            if (r1 == 0) goto L_0x050c
            X.126 r5 = r0.A0H     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r2 = 24
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r1 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r1.<init>(r0, r2, r3)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r4 = 25
            android.os.Handler r2 = r5.A01     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            android.os.Message r1 = android.os.Message.obtain(r2, r1)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r1.arg1 = r4     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
            r2.sendMessage(r1)     // Catch:{ IOException -> 0x0593, SQLiteConstraintException -> 0x058b, SQLiteDiskIOException -> 0x0589, SQLiteDatabaseCorruptException -> 0x0582, Error | RuntimeException -> 0x059f, Error | RuntimeException -> 0x059f, all -> 0x059b }
        L_0x050c:
            r40 = 1
        L_0x050e:
            r20.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x055f, SQLiteException -> 0x0516 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x055f, SQLiteException -> 0x0516 }
            goto L_0x0745
        L_0x0516:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0826 }
            r1.<init>()     // Catch:{ all -> 0x0826 }
            r1.append(r15)     // Catch:{ all -> 0x0826 }
            r1.append(r7)     // Catch:{ all -> 0x0826 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0826 }
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0826 }
            boolean r1 = r2 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0826 }
            if (r1 != 0) goto L_0x053f
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0825
            java.lang.String r4 = r2.getMessage()     // Catch:{ all -> 0x0826 }
            r1 = r19
            boolean r1 = r4.contains(r1)     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0825
        L_0x053f:
            if (r48 == 0) goto L_0x0825
            X.17F r5 = r0.A0a     // Catch:{ all -> 0x0826 }
            boolean r1 = r5.A0P()     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0825
            X.11I r4 = r0.A15     // Catch:{ all -> 0x0826 }
            r1 = 0
            r4.A04(r14, r1)     // Catch:{ all -> 0x0826 }
            X.1yo r7 = r0.A0D(r3, r1)     // Catch:{ Exception -> 0x0558 }
            r5.A0K()     // Catch:{ Exception -> 0x0558 }
            goto L_0x0812
        L_0x0558:
            r2 = move-exception
            r0 = 1
            r4.A04(r14, r0)     // Catch:{ all -> 0x0826 }
            goto L_0x0825
        L_0x055f:
            r1 = move-exception
            r4 = 1
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x0826 }
            X.0ym r1 = r0.A0u     // Catch:{ all -> 0x0826 }
            r1.A02()     // Catch:{ all -> 0x0826 }
            goto L_0x0746
        L_0x056b:
            r1 = move-exception
            r4 = 1
            r26 = r16
            goto L_0x05a8
        L_0x0570:
            r2 = move-exception
            r4 = 1
            r26 = r16
            goto L_0x0608
        L_0x0576:
            r2 = move-exception
            r4 = 1
            r26 = r16
            goto L_0x066e
        L_0x057c:
            r1 = move-exception
            r4 = 1
            r26 = r16
            goto L_0x06ea
        L_0x0582:
            r1 = move-exception
            goto L_0x0587
        L_0x0584:
            r1 = move-exception
            r26 = r16
        L_0x0587:
            r4 = 1
            goto L_0x05a8
        L_0x0589:
            r2 = move-exception
            goto L_0x0607
        L_0x058b:
            r2 = move-exception
            goto L_0x0590
        L_0x058d:
            r2 = move-exception
            r26 = r16
        L_0x0590:
            r4 = 1
            goto L_0x066e
        L_0x0593:
            r1 = move-exception
            goto L_0x0598
        L_0x0595:
            r1 = move-exception
            r26 = r16
        L_0x0598:
            r4 = 1
            goto L_0x06ea
        L_0x059b:
            r2 = move-exception
            r4 = 1
            goto L_0x07cb
        L_0x059f:
            r1 = move-exception
            r4 = 1
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x07ca }
            throw r1     // Catch:{ all -> 0x07ca }
        L_0x05a5:
            r1 = move-exception
            r4 = 1
            r6 = 0
        L_0x05a8:
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x07ca }
            X.0ym r2 = r0.A0u     // Catch:{ all -> 0x07ca }
            r2.A02()     // Catch:{ all -> 0x07ca }
            r20.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x05fa, SQLiteException -> 0x05b8 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x05fa, SQLiteException -> 0x05b8 }
            goto L_0x073f
        L_0x05b8:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0826 }
            r1.<init>()     // Catch:{ all -> 0x0826 }
            r1.append(r15)     // Catch:{ all -> 0x0826 }
            r1.append(r7)     // Catch:{ all -> 0x0826 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0826 }
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0826 }
            boolean r1 = r2 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0826 }
            if (r1 != 0) goto L_0x05e1
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0825
            java.lang.String r5 = r2.getMessage()     // Catch:{ all -> 0x0826 }
            r1 = r19
            boolean r1 = r5.contains(r1)     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0825
        L_0x05e1:
            if (r48 == 0) goto L_0x0825
            X.17F r5 = r0.A0a     // Catch:{ all -> 0x0826 }
            boolean r1 = r5.A0P()     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0825
            X.11I r6 = r0.A15     // Catch:{ all -> 0x0826 }
            r1 = 0
            r6.A04(r14, r1)     // Catch:{ all -> 0x0826 }
            X.1yo r7 = r0.A0D(r3, r1)     // Catch:{ Exception -> 0x0816 }
            r5.A0K()     // Catch:{ Exception -> 0x0816 }
            goto L_0x0812
        L_0x05fa:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x0826 }
            goto L_0x073c
        L_0x0600:
            r2 = move-exception
            r4 = 1
            r6 = 0
            goto L_0x0608
        L_0x0604:
            r2 = move-exception
            r26 = r16
        L_0x0607:
            r4 = 1
        L_0x0608:
            if (r48 == 0) goto L_0x0662
            java.lang.String r1 = "msgstore/addmsg/will retry "
            com.whatsapp.util.Log.w(r1, r2)     // Catch:{ all -> 0x07ca }
            r20.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0657, SQLiteException -> 0x0617 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0657, SQLiteException -> 0x0617 }
            goto L_0x0741
        L_0x0617:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0826 }
            r1.<init>()     // Catch:{ all -> 0x0826 }
            r1.append(r15)     // Catch:{ all -> 0x0826 }
            r1.append(r7)     // Catch:{ all -> 0x0826 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0826 }
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0826 }
            boolean r1 = r2 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0826 }
            if (r1 != 0) goto L_0x0640
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0741
            java.lang.String r5 = r2.getMessage()     // Catch:{ all -> 0x0826 }
            r1 = r19
            boolean r1 = r5.contains(r1)     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0741
        L_0x0640:
            X.17F r5 = r0.A0a     // Catch:{ all -> 0x0826 }
            boolean r1 = r5.A0P()     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0825
            X.11I r6 = r0.A15     // Catch:{ all -> 0x0826 }
            r1 = 0
            r6.A04(r14, r1)     // Catch:{ all -> 0x0826 }
            X.1yo r7 = r0.A0D(r3, r1)     // Catch:{ Exception -> 0x0816 }
            r5.A0K()     // Catch:{ Exception -> 0x0816 }
            goto L_0x0812
        L_0x0657:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x0826 }
            X.0ym r1 = r0.A0u     // Catch:{ all -> 0x0826 }
            r1.A02()     // Catch:{ all -> 0x0826 }
            goto L_0x0741
        L_0x0662:
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)     // Catch:{ all -> 0x07ca }
            X.0y0 r1 = r0.A0t     // Catch:{ all -> 0x07ca }
            r1.A00(r4)     // Catch:{ all -> 0x07ca }
            throw r2     // Catch:{ all -> 0x07ca }
        L_0x066b:
            r2 = move-exception
            r4 = 1
            r6 = 0
        L_0x066e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ca }
            r5.<init>()     // Catch:{ all -> 0x07ca }
            java.lang.String r1 = "msgstore/addmsg duplicate "
            r5.append(r1)     // Catch:{ all -> 0x07ca }
            java.lang.String r1 = r10.A01     // Catch:{ all -> 0x07ca }
            r5.append(r1)     // Catch:{ all -> 0x07ca }
            r1 = r21
            r5.append(r1)     // Catch:{ all -> 0x07ca }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x07ca }
            com.whatsapp.util.Log.i(r1, r2)     // Catch:{ all -> 0x07ca }
            X.0tZ r1 = r3.A0D()     // Catch:{ all -> 0x07ca }
            if (r1 == 0) goto L_0x0693
            r1 = 0
            r3.A0F = r1     // Catch:{ all -> 0x07ca }
        L_0x0693:
            r20.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x06dd, SQLiteException -> 0x069b }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x06dd, SQLiteException -> 0x069b }
            goto L_0x0761
        L_0x069b:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0826 }
            r1.<init>()     // Catch:{ all -> 0x0826 }
            r1.append(r15)     // Catch:{ all -> 0x0826 }
            r1.append(r7)     // Catch:{ all -> 0x0826 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0826 }
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0826 }
            boolean r1 = r2 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0826 }
            if (r1 != 0) goto L_0x06c4
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0825
            java.lang.String r5 = r2.getMessage()     // Catch:{ all -> 0x0826 }
            r1 = r19
            boolean r1 = r5.contains(r1)     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0825
        L_0x06c4:
            if (r48 == 0) goto L_0x0825
            X.17F r5 = r0.A0a     // Catch:{ all -> 0x0826 }
            boolean r1 = r5.A0P()     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0825
            X.11I r6 = r0.A15     // Catch:{ all -> 0x0826 }
            r1 = 0
            r6.A04(r14, r1)     // Catch:{ all -> 0x0826 }
            X.1yo r7 = r0.A0D(r3, r1)     // Catch:{ Exception -> 0x0816 }
            r5.A0K()     // Catch:{ Exception -> 0x0816 }
            goto L_0x0812
        L_0x06dd:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x0826 }
            X.0ym r1 = r0.A0u     // Catch:{ all -> 0x0826 }
            r1.A02()     // Catch:{ all -> 0x0826 }
            goto L_0x0761
        L_0x06e7:
            r1 = move-exception
            r4 = 1
            r6 = 0
        L_0x06ea:
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x07ca }
            r20.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0736, SQLiteException -> 0x06f4 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0736, SQLiteException -> 0x06f4 }
            goto L_0x073f
        L_0x06f4:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0826 }
            r1.<init>()     // Catch:{ all -> 0x0826 }
            r1.append(r15)     // Catch:{ all -> 0x0826 }
            r1.append(r7)     // Catch:{ all -> 0x0826 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0826 }
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0826 }
            boolean r1 = r2 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0826 }
            if (r1 != 0) goto L_0x071d
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0825
            java.lang.String r5 = r2.getMessage()     // Catch:{ all -> 0x0826 }
            r1 = r19
            boolean r1 = r5.contains(r1)     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0825
        L_0x071d:
            if (r48 == 0) goto L_0x0825
            X.17F r5 = r0.A0a     // Catch:{ all -> 0x0826 }
            boolean r1 = r5.A0P()     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0825
            X.11I r6 = r0.A15     // Catch:{ all -> 0x0826 }
            r1 = 0
            r6.A04(r14, r1)     // Catch:{ all -> 0x0826 }
            X.1yo r7 = r0.A0D(r3, r1)     // Catch:{ Exception -> 0x0816 }
            r5.A0K()     // Catch:{ Exception -> 0x0816 }
            goto L_0x0812
        L_0x0736:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x0826 }
            X.0ym r2 = r0.A0u     // Catch:{ all -> 0x0826 }
        L_0x073c:
            r2.A02()     // Catch:{ all -> 0x0826 }
        L_0x073f:
            r1 = 0
            goto L_0x0742
        L_0x0741:
            r1 = 1
        L_0x0742:
            r40 = 0
            goto L_0x0747
        L_0x0745:
            r4 = 1
        L_0x0746:
            r1 = 0
        L_0x0747:
            r2 = 0
            if (r1 == 0) goto L_0x0764
            if (r48 <= 0) goto L_0x0764
            r45.A04()     // Catch:{ all -> 0x0826 }
            r1 = r45
            X.1jC r1 = r1.A04     // Catch:{ all -> 0x0826 }
            r1.close()     // Catch:{ all -> 0x0826 }
            X.17C r1 = r0.A1G     // Catch:{ all -> 0x0826 }
            r1.A01()     // Catch:{ all -> 0x0826 }
            X.1yo r7 = r0.A0D(r3, r2)     // Catch:{ all -> 0x0826 }
            goto L_0x0812
        L_0x0761:
            r40 = 0
            r2 = 1
        L_0x0764:
            r18.close()
            if (r40 == 0) goto L_0x07bc
            boolean r1 = r3 instanceof X.C16730tY
            if (r1 == 0) goto L_0x078b
            r1 = r3
            X.0tY r1 = (X.C16730tY) r1
            X.0ta r8 = r1.A02
            X.AnonymousClass00B.A06(r8)
            if (r9 == 0) goto L_0x078b
            java.io.File r7 = r8.A0F
            if (r7 == 0) goto L_0x078b
            X.01Z r5 = r0.A07
            boolean r1 = X.C42941yx.A01(r3)
            r5.A05(r7, r4, r1)
            if (r6 <= 0) goto L_0x078b
            java.io.File r1 = r8.A0F
            r5.A05(r1, r6, r4)
        L_0x078b:
            X.0tZ r5 = r3.A0D()
            boolean r1 = r5 instanceof X.C38641rB
            if (r1 == 0) goto L_0x07ab
            X.0tY r5 = (X.C16730tY) r5
            X.0ta r7 = r5.A02
            if (r7 == 0) goto L_0x07ab
            java.io.File r1 = r7.A0F
            if (r1 == 0) goto L_0x07ab
            X.01Z r5 = r0.A07
            r5.A05(r1, r4, r4)
            if (r9 == 0) goto L_0x07ab
            if (r6 <= 0) goto L_0x07ab
            java.io.File r1 = r7.A0F
            r5.A05(r1, r6, r4)
        L_0x07ab:
            java.lang.Integer r1 = r3.A0X
            if (r1 == 0) goto L_0x07bc
            X.17L r1 = r0.A1Y
            monitor-enter(r1)
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x07b9 }
            r0.add(r3)     // Catch:{ all -> 0x07b9 }
            monitor-exit(r1)     // Catch:{ all -> 0x07b9 }
            goto L_0x07bc
        L_0x07b9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x07b9 }
            throw r0
        L_0x07bc:
            r44 = 0
            X.1yo r7 = new X.1yo
            r39 = r7
            r41 = r26
            r43 = r2
            r39.<init>(r40, r41, r42, r43, r44)
            return r7
        L_0x07ca:
            r2 = move-exception
        L_0x07cb:
            r20.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0818, SQLiteException -> 0x07d2 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0818, SQLiteException -> 0x07d2 }
            goto L_0x0825
        L_0x07d2:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0826 }
            r1.<init>()     // Catch:{ all -> 0x0826 }
            r1.append(r15)     // Catch:{ all -> 0x0826 }
            r1.append(r7)     // Catch:{ all -> 0x0826 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0826 }
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0826 }
            boolean r1 = r2 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0826 }
            if (r1 != 0) goto L_0x07fb
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0825
            java.lang.String r5 = r2.getMessage()     // Catch:{ all -> 0x0826 }
            r1 = r19
            boolean r1 = r5.contains(r1)     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0825
        L_0x07fb:
            if (r48 == 0) goto L_0x0825
            X.17F r5 = r0.A0a     // Catch:{ all -> 0x0826 }
            boolean r1 = r5.A0P()     // Catch:{ all -> 0x0826 }
            if (r1 == 0) goto L_0x0825
            X.11I r6 = r0.A15     // Catch:{ all -> 0x0826 }
            r1 = 0
            r6.A04(r14, r1)     // Catch:{ all -> 0x0826 }
            X.1yo r7 = r0.A0D(r3, r1)     // Catch:{ Exception -> 0x0816 }
            r5.A0K()     // Catch:{ Exception -> 0x0816 }
        L_0x0812:
            r18.close()
            return r7
        L_0x0816:
            r2 = move-exception
            goto L_0x0822
        L_0x0818:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x0826 }
            X.0ym r0 = r0.A0u     // Catch:{ all -> 0x0826 }
            r0.A02()     // Catch:{ all -> 0x0826 }
            goto L_0x0825
        L_0x0822:
            r6.A04(r14, r4)     // Catch:{ all -> 0x0826 }
        L_0x0825:
            throw r2     // Catch:{ all -> 0x0826 }
        L_0x0826:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x082a }
        L_0x082a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0D(X.0tZ, int):X.1yo");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x010d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C30991dI A0E(X.C30991dI r13) {
        /*
            r12 = this;
            X.AnonymousClass00B.A00()
            X.0pd r1 = r12.A1U
            X.0t3 r0 = r12.A0F
            X.1dI r5 = new X.1dI
            r5.<init>(r0, r13, r1)
            r0 = -9223372036854775808
            monitor-enter(r5)
            r5.A03 = r0     // Catch:{ all -> 0x0113 }
            monitor-exit(r5)
            r5.A09(r0)
            r2 = 0
            r5.A08(r2)
            monitor-enter(r5)
            r5.A01 = r2     // Catch:{ all -> 0x0113 }
            monitor-exit(r5)
            X.0tq r0 = r12.A0v
            X.0tf r10 = r0.get()
            boolean r0 = r13.A0B()     // Catch:{ all -> 0x010e }
            r9 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0044
            X.0tg r7 = r10.A02     // Catch:{ all -> 0x010e }
            java.lang.String r4 = X.C42931yw.A04     // Catch:{ all -> 0x010e }
            java.lang.String[] r3 = new java.lang.String[r8]     // Catch:{ all -> 0x010e }
            X.0ts r0 = r12.A0N     // Catch:{ all -> 0x010e }
            X.1kq r6 = X.C34771kq.A00     // Catch:{ all -> 0x010e }
            long r0 = r0.A02(r6)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x010e }
            r3[r2] = r0     // Catch:{ all -> 0x010e }
            android.database.Cursor r7 = r7.A08(r4, r3)     // Catch:{ all -> 0x010e }
            goto L_0x0071
        L_0x0044:
            X.0tg r7 = r10.A02     // Catch:{ all -> 0x010e }
            java.lang.String r4 = X.C42931yw.A03     // Catch:{ all -> 0x010e }
            r0 = 3
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x010e }
            X.0ts r0 = r12.A0N     // Catch:{ all -> 0x010e }
            X.1kq r6 = X.C34771kq.A00     // Catch:{ all -> 0x010e }
            long r0 = r0.A02(r6)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x010e }
            r3[r2] = r0     // Catch:{ all -> 0x010e }
            X.14v r0 = r12.A0g     // Catch:{ all -> 0x010e }
            com.whatsapp.jid.UserJid r2 = r13.A0B     // Catch:{ all -> 0x010e }
            long r0 = r0.A01(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x010e }
            r3[r8] = r0     // Catch:{ all -> 0x010e }
            java.lang.String r0 = r2.getRawString()     // Catch:{ all -> 0x010e }
            r3[r9] = r0     // Catch:{ all -> 0x010e }
            android.database.Cursor r7 = r7.A08(r4, r3)     // Catch:{ all -> 0x010e }
        L_0x0071:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x00f8
            X.0tZ r4 = r12.A0G(r7, r6)     // Catch:{ all -> 0x0107 }
            if (r4 == 0) goto L_0x0071
            boolean r0 = X.C41061vA.A0I(r4)     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x0071
            boolean r0 = X.C38621r6.A0o(r4)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0093
            r1 = 4
            int r0 = r4.A0C     // Catch:{ all -> 0x0107 }
            boolean r0 = X.C42881yp.A02(r0, r1)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0093
            goto L_0x0071
        L_0x0093:
            long r0 = r4.A14     // Catch:{ all -> 0x0107 }
            monitor-enter(r5)     // Catch:{ all -> 0x0107 }
            r5.A04 = r0     // Catch:{ all -> 0x00f2 }
            monitor-exit(r5)     // Catch:{ all -> 0x0107 }
            monitor-enter(r5)     // Catch:{ all -> 0x0107 }
            r5.A08 = r4     // Catch:{ all -> 0x00f2 }
            monitor-exit(r5)     // Catch:{ all -> 0x0107 }
            long r0 = r4.A0I     // Catch:{ all -> 0x0107 }
            r5.A0A(r0)     // Catch:{ all -> 0x0107 }
            monitor-enter(r5)     // Catch:{ all -> 0x0107 }
            int r0 = r5.A00     // Catch:{ all -> 0x00f2 }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x00f2 }
            monitor-exit(r5)     // Catch:{ all -> 0x0107 }
            boolean r0 = r5.A0B()     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x0071
            long r2 = r4.A14     // Catch:{ all -> 0x0107 }
            monitor-enter(r13)     // Catch:{ all -> 0x0107 }
            long r0 = r13.A06     // Catch:{ all -> 0x00f5 }
            monitor-exit(r13)     // Catch:{ all -> 0x0107 }
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x00c0
            long r0 = r4.A14     // Catch:{ all -> 0x0107 }
            monitor-enter(r5)     // Catch:{ all -> 0x0107 }
            r5.A06 = r0     // Catch:{ all -> 0x00f2 }
            goto L_0x00e0
        L_0x00c0:
            monitor-enter(r5)     // Catch:{ all -> 0x0107 }
            int r0 = r5.A01     // Catch:{ all -> 0x00f2 }
            int r0 = r0 + 1
            r5.A01 = r0     // Catch:{ all -> 0x00f2 }
            monitor-exit(r5)     // Catch:{ all -> 0x0107 }
            int r0 = r5.A02()     // Catch:{ all -> 0x0107 }
            if (r0 != r8) goto L_0x00d4
            long r0 = r4.A14     // Catch:{ all -> 0x0107 }
            monitor-enter(r5)     // Catch:{ all -> 0x0107 }
            r5.A03 = r0     // Catch:{ all -> 0x00f2 }
            monitor-exit(r5)     // Catch:{ all -> 0x0107 }
        L_0x00d4:
            int r0 = r5.A02()     // Catch:{ all -> 0x0107 }
            if (r0 > r9) goto L_0x00e1
            long r0 = r4.A14     // Catch:{ all -> 0x0107 }
            r5.A09(r0)     // Catch:{ all -> 0x0107 }
            goto L_0x00e1
        L_0x00e0:
            monitor-exit(r5)     // Catch:{ all -> 0x0107 }
        L_0x00e1:
            long r2 = r4.A14     // Catch:{ all -> 0x0107 }
            monitor-enter(r13)     // Catch:{ all -> 0x0107 }
            long r0 = r13.A07     // Catch:{ all -> 0x00f5 }
            monitor-exit(r13)     // Catch:{ all -> 0x0107 }
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x0071
            long r0 = r4.A14     // Catch:{ all -> 0x0107 }
            monitor-enter(r5)     // Catch:{ all -> 0x0107 }
            r5.A07 = r0     // Catch:{ all -> 0x00f2 }
            monitor-exit(r5)     // Catch:{ all -> 0x0107 }
            goto L_0x0071
        L_0x00f2:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0107 }
            goto L_0x00f7
        L_0x00f5:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0107 }
        L_0x00f7:
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x00f8:
            r7.close()     // Catch:{ all -> 0x010e }
            r10.close()
            int r0 = r5.A01()
            if (r0 != 0) goto L_0x0106
            r0 = 0
            return r0
        L_0x0106:
            return r5
        L_0x0107:
            r0 = move-exception
            if (r7 == 0) goto L_0x010d
            r7.close()     // Catch:{ all -> 0x010d }
        L_0x010d:
            throw r0     // Catch:{ all -> 0x010e }
        L_0x010e:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0112 }
        L_0x0112:
            throw r0
        L_0x0113:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0E(X.1dI):X.1dI");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        r0 = r6.A05.A05(r3.getLong(r3.getColumnIndexOrThrow("chat_row_id")));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0055 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0055=Splitter:B:18:0x0055, B:10:0x003c=Splitter:B:10:0x003c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16740tZ A0F(long r10) {
        /*
            r9 = this;
            X.0th r6 = r9.A0K
            long r7 = android.os.SystemClock.uptimeMillis()
            X.0tq r0 = r6.A0M
            X.0tf r5 = r0.get()
            X.0tg r3 = r5.A02     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = X.AnonymousClass1WW.A0B     // Catch:{ all -> 0x0056 }
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0056 }
            r4 = 0
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0056 }
            r1[r4] = r0     // Catch:{ all -> 0x0056 }
            android.database.Cursor r3 = r3.A08(r2, r1)     // Catch:{ all -> 0x0056 }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "chat_row_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004f }
            long r1 = r3.getLong(r0)     // Catch:{ all -> 0x004f }
            X.0ts r0 = r6.A05     // Catch:{ all -> 0x004f }
            X.0rv r0 = r0.A05(r1)     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x003b
            X.0tZ r4 = r6.A02(r3, r0, r4)     // Catch:{ all -> 0x004f }
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            r3.close()     // Catch:{ all -> 0x0056 }
            r5.close()
            X.0vN r3 = r6.A07
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r7
            java.lang.String r0 = "CachedMessageStore/getMessageBySortId/sortId"
            r3.A00(r0, r1)
            return r4
        L_0x004f:
            r0 = move-exception
            if (r3 == 0) goto L_0x0055
            r3.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x005a }
        L_0x005a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0F(long):X.0tZ");
    }

    public C16740tZ A0G(Cursor cursor, C15830rv r4) {
        return this.A0K.A02(cursor, r4, false);
    }

    public C16740tZ A0H(AnonymousClass1Vt r5) {
        if (r5 == null || r5.A0C == null || TextUtils.isEmpty(r5.A0L)) {
            return null;
        }
        return this.A0K.A03(new C28381Vw(r5.A0C, r5.A0L, r5.A0Q));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x007b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0I(X.C15830rv r14) {
        /*
            r13 = this;
            X.0vO r6 = r13.A0y
            X.AnonymousClass00B.A00()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.0tq r0 = r6.A05
            X.0tf r4 = r0.get()
            long r11 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x007c }
            X.0tg r10 = r4.A02     // Catch:{ all -> 0x007c }
            java.lang.String r9 = X.C42571y2.A00     // Catch:{ all -> 0x007c }
            r0 = 3
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x007c }
            r1 = 0
            r0 = 4
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x007c }
            r8[r1] = r0     // Catch:{ all -> 0x007c }
            r2 = 1
            X.0ts r0 = r6.A02     // Catch:{ all -> 0x007c }
            long r0 = r0.A02(r14)     // Catch:{ all -> 0x007c }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x007c }
            r8[r2] = r0     // Catch:{ all -> 0x007c }
            r7 = 2
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007c }
            r0 = 2419200000(0x90321000, double:1.1952436104E-314)
            long r2 = r2 - r0
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x007c }
            r8[r7] = r0     // Catch:{ all -> 0x007c }
            android.database.Cursor r2 = r10.A08(r9, r8)     // Catch:{ all -> 0x007c }
            if (r2 != 0) goto L_0x004d
            java.lang.String r0 = "OrderMessageManager/getCheckoutMessages no cursor!"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0075 }
            goto L_0x0060
        L_0x004d:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0060
            X.0th r1 = r6.A01     // Catch:{ all -> 0x0075 }
            r0 = 0
            X.0tZ r0 = r1.A02(r2, r14, r0)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004d
            r5.add(r0)     // Catch:{ all -> 0x0075 }
            goto L_0x004d
        L_0x0060:
            if (r2 == 0) goto L_0x0065
            r2.close()     // Catch:{ all -> 0x007c }
        L_0x0065:
            X.0vN r3 = r6.A03     // Catch:{ all -> 0x007c }
            java.lang.String r2 = "OrderMessageManager/getCheckoutMessages"
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x007c }
            long r0 = r0 - r11
            r3.A00(r2, r0)     // Catch:{ all -> 0x007c }
            r4.close()
            return r5
        L_0x0075:
            r0 = move-exception
            if (r2 == 0) goto L_0x007b
            r2.close()     // Catch:{ all -> 0x007b }
        L_0x007b:
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0080 }
        L_0x0080:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0I(X.0rv):java.util.List");
    }

    public final void A0J() {
        File file = this.A03.A05().A0A;
        C16180sb.A04(file, false);
        A06(file);
        Uri contentUri = MediaStore.Files.getContentUri("external");
        ContentResolver A0C2 = this.A0E.A0C();
        if (A0C2 == null) {
            Log.w("msgstore/delete-all-media cr=null");
            return;
        }
        try {
            A0C2.delete(contentUri, "_data LIKE ?||'%'", new String[]{file.getAbsolutePath()});
        } catch (IllegalArgumentException | SecurityException | UnsupportedOperationException e2) {
            Log.e("msgstore/delete-all-media", e2);
        }
    }

    public synchronized void A0K() {
        List A0b2;
        C18290wS r0 = this.A1f;
        r0.A06();
        C221116r r3 = r0.A08;
        synchronized (r3) {
            r3.A09.A06("failReceiverPendingTransactions/failPendingTransactions");
            A0b2 = r3.A0b(false);
        }
        A0p(A0b2);
    }

    public synchronized void A0L() {
        List A0b2;
        C18290wS r0 = this.A1f;
        r0.A06();
        C221116r r3 = r0.A08;
        synchronized (r3) {
            r3.A09.A06("PaymentTransactionStore/failReceiverPendingTransactions");
            A0b2 = r3.A0b(true);
        }
        A0p(A0b2);
    }

    public final void A0M(long j2) {
        int i2;
        C207811o r3 = this.A1b;
        if (r3.A00(0, j2) != null) {
            i2 = 5;
        } else {
            i2 = -1;
            if (r3.A00(2, j2) != null) {
                i2 = 4;
            }
        }
        C30831d2 A012 = r3.A01(j2);
        if (i2 != -1 && A012 != null) {
            A012.A00(i2);
        }
    }

    public final void A0N(C42561y1 r6) {
        List<Number> list = r6.A09;
        if (list != null) {
            for (Number longValue : list) {
                C16740tZ A002 = this.A0K.A00(longValue.longValue());
                if (A002 != null) {
                    this.A0n.A03(A002.A11);
                }
            }
        }
        if (r6.A04 != Long.MIN_VALUE) {
            this.A0n.A01(r6.A07);
        }
    }

    public void A0O(AnonymousClass1Vt r4, C28381Vw r5) {
        StringBuilder sb = new StringBuilder("msgstore/updateMessagePaymentTransaction/PAY transactionStatus:");
        sb.append(r4.A02);
        sb.append(" for key:");
        sb.append(r5);
        Log.i(sb.toString());
        this.A0H.A01(new RunnableRunnableShape1S0300000_I0_1(this, r5, r4, 4), 28);
    }

    public void A0P(C15830rv r12) {
        C15810rt r1 = this.A0O;
        C15840rx A062 = r1.A06(r12);
        if (A062 != null) {
            long A022 = this.A19.A02(r12);
            long A052 = this.A1D.A05(r12);
            C15840rx A063 = r1.A06(r12);
            AnonymousClass00B.A06(A063);
            synchronized (A063) {
                A062.A08();
                if (A022 != 1) {
                    C16740tZ A002 = this.A0K.A00(A022);
                    A062.A0Z = A002;
                    if (A002 != null) {
                        if (!C38621r6.A0f(A002)) {
                            A062.A0S = A022;
                            A062.A0T = A052;
                            A062.A0V = A002.A0I;
                        } else {
                            A062.A0Z = null;
                        }
                        A062.A0N = A022;
                        A062.A0O = A052;
                        A062.A0P = A022;
                        A062.A0Q = A052;
                        A062.A0L = A022;
                        A062.A0M = A052;
                        A062.A0Y = null;
                    }
                }
            }
            int A003 = this.A0N.A00(A062.A04((Long) null), A062.A0i);
            StringBuilder sb = new StringBuilder("msgstore/updateChatListTable/updated:");
            sb.append(A003);
            Log.i(sb.toString());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:46|47|48|49|50) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00eb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0Q(X.C15830rv r17, com.whatsapp.jid.UserJid r18) {
        /*
            r16 = this;
            r5 = r16
            monitor-enter(r5)
            X.0wS r0 = r5.A1f     // Catch:{ all -> 0x012e }
            r0.A06()     // Catch:{ all -> 0x012e }
            X.16r r6 = r0.A08     // Catch:{ all -> 0x012e }
            boolean r0 = X.C16030sJ.A0L(r17)     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x0016
            com.whatsapp.jid.GroupJid r9 = com.whatsapp.jid.GroupJid.of(r17)     // Catch:{ all -> 0x012e }
        L_0x0014:
            monitor-enter(r6)     // Catch:{ all -> 0x012e }
            goto L_0x0018
        L_0x0016:
            r9 = 0
            goto L_0x0014
        L_0x0018:
            java.util.List r0 = r6.A0R()     // Catch:{ all -> 0x012b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x012b }
            r4.<init>()     // Catch:{ all -> 0x012b }
            X.0tq r8 = r6.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f1 }
            X.0tf r7 = r8.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f1 }
            X.1cj r15 = r7.A00()     // Catch:{ all -> 0x00ec }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x00e7 }
        L_0x002f:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r10 = r14.next()     // Catch:{ all -> 0x00e7 }
            X.1Vt r10 = (X.AnonymousClass1Vt) r10     // Catch:{ all -> 0x00e7 }
            if (r9 == 0) goto L_0x0059
            X.0rv r0 = r10.A0C     // Catch:{ all -> 0x00e7 }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x002f
            r1 = r18
            if (r18 == 0) goto L_0x002f
            com.whatsapp.jid.UserJid r0 = r10.A0E     // Catch:{ all -> 0x00e7 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00e7 }
            if (r0 != 0) goto L_0x0059
            com.whatsapp.jid.UserJid r0 = r10.A0D     // Catch:{ all -> 0x00e7 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x002f
        L_0x0059:
            X.1Vo r2 = r6.A09     // Catch:{ all -> 0x00e7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e7 }
            r1.<init>()     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "mark pending request as failed: "
            r1.append(r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = r10.A0L     // Catch:{ all -> 0x00e7 }
            r1.append(r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e7 }
            r2.A06(r0)     // Catch:{ all -> 0x00e7 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x00e7 }
            r11.<init>()     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = r10.A0L     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = r10.A0K     // Catch:{ all -> 0x00e7 }
            android.util.Pair r12 = X.C221116r.A06(r1, r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = "status"
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00e7 }
            r11.put(r1, r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r13 = "timestamp"
            X.0t3 r0 = r6.A02     // Catch:{ all -> 0x00e7 }
            long r0 = r0.A00()     // Catch:{ all -> 0x00e7 }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            int r2 = (int) r0     // Catch:{ all -> 0x00e7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00e7 }
            r11.put(r13, r0)     // Catch:{ all -> 0x00e7 }
            boolean r0 = r6.A0i()     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00b3
            X.0tg r3 = r7.A02     // Catch:{ all -> 0x00e7 }
            java.lang.Object r2 = r12.first     // Catch:{ all -> 0x00e7 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00e7 }
            java.lang.Object r1 = r12.second     // Catch:{ all -> 0x00e7 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "pay_transaction"
            r3.A00(r0, r11, r2, r1)     // Catch:{ all -> 0x00e7 }
        L_0x00b3:
            r8.A04()     // Catch:{ all -> 0x00e7 }
            X.1jC r0 = r8.A04     // Catch:{ all -> 0x00e7 }
            boolean r0 = r0.A0D(r7)     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00cd
            X.0tg r3 = r7.A02     // Catch:{ all -> 0x00e7 }
            java.lang.String r2 = "pay_transactions"
            java.lang.Object r1 = r12.first     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00e7 }
            java.lang.Object r0 = r12.second     // Catch:{ all -> 0x00e7 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x00e7 }
            r3.A00(r2, r11, r1, r0)     // Catch:{ all -> 0x00e7 }
        L_0x00cd:
            X.0rv r3 = r10.A0C     // Catch:{ all -> 0x00e7 }
            boolean r2 = r10.A0Q     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = r10.A0L     // Catch:{ all -> 0x00e7 }
            X.1Vw r0 = new X.1Vw     // Catch:{ all -> 0x00e7 }
            r0.<init>(r3, r1, r2)     // Catch:{ all -> 0x00e7 }
            r4.add(r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x002f
        L_0x00dd:
            r15.A00()     // Catch:{ all -> 0x00e7 }
            r15.close()     // Catch:{ all -> 0x00ec }
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f1 }
            goto L_0x00f8
        L_0x00e7:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            throw r0     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f1 }
        L_0x00f1:
            X.1Vo r1 = r6.A09     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "failPendingRequests failed."
            r1.A05(r0)     // Catch:{ all -> 0x012b }
        L_0x00f8:
            monitor-exit(r6)     // Catch:{ all -> 0x012e }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x012e }
        L_0x00fd:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x0129
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x012e }
            X.1Vw r1 = (X.C28381Vw) r1     // Catch:{ all -> 0x012e }
            X.0th r0 = r5.A0K     // Catch:{ all -> 0x012e }
            X.0tZ r3 = r0.A03(r1)     // Catch:{ all -> 0x012e }
            if (r3 == 0) goto L_0x00fd
            X.1Vt r2 = r3.A0L     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00fd
            r0 = 13
            r2.A02 = r0     // Catch:{ all -> 0x012e }
            X.0t3 r0 = r5.A0F     // Catch:{ all -> 0x012e }
            long r0 = r0.A00()     // Catch:{ all -> 0x012e }
            r2.A06 = r0     // Catch:{ all -> 0x012e }
            X.17E r1 = r5.A0e     // Catch:{ all -> 0x012e }
            r0 = 16
            r1.A00(r3, r0)     // Catch:{ all -> 0x012e }
            goto L_0x00fd
        L_0x0129:
            monitor-exit(r5)
            return
        L_0x012b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x012e }
            throw r0     // Catch:{ all -> 0x012e }
        L_0x012e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0Q(X.0rv, com.whatsapp.jid.UserJid):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0R(X.C15830rv r18, X.C28351Vs r19) {
        /*
            r17 = this;
            r2 = r17
            X.16p r9 = r2.A1m
            r7 = r19
            int r6 = r7.A03
            int r4 = r7.A01
            java.lang.String r3 = r7.A07
            java.lang.String r1 = r7.A06
            r5 = r18
            boolean r0 = X.C16030sJ.A0O(r5)
            r13 = 0
            if (r0 == 0) goto L_0x00fc
            X.0pd r12 = r9.A01
            boolean r0 = X.C40571uL.A00(r12, r5)
            if (r0 != 0) goto L_0x00fc
            X.1ta r8 = r7.A05
            int r0 = r7.A02
            X.1gM r11 = new X.1gM
            r11.<init>(r8, r0, r6)
            X.1ta r10 = r7.A04
            int r0 = r7.A00
            X.1gM r8 = new X.1gM
            r8.<init>(r10, r0, r4)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.util.Arrays.toString(r0)
            int r10 = r11.A01()
            int r8 = r8.A01()
            r11 = 2320(0x910, float:3.251E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r12.A0E(r0, r11)
            if (r0 == 0) goto L_0x00e7
            int r10 = X.C42841yl.A00(r10)
            int r8 = X.C42841yl.A00(r8)
            int[][] r0 = X.C42841yl.A00
        L_0x0058:
            r0 = r0[r10]
            r8 = r0[r8]
            if (r8 <= 0) goto L_0x00fc
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0068
            java.lang.String r1 = X.C24561Gk.A04(r5)
        L_0x0068:
            X.122 r10 = r9.A02
            X.0t3 r0 = r9.A00
            long r15 = r0.A00()
            X.18b r9 = r10.A03
            r0 = 1
            X.1Vw r12 = r9.A02(r5, r0)
            X.0so r11 = r10.A00
            r14 = 69
            X.1WU r0 = X.AnonymousClass122.A00(r11, r12, r13, r14, r15)
            X.1sR r0 = (X.C39411sR) r0
            r0.A00 = r8
            r0.A01 = r1
        L_0x0085:
            X.1ta r9 = r7.A05
            if (r9 != 0) goto L_0x00e1
            if (r6 != 0) goto L_0x00e1
            if (r3 != 0) goto L_0x00e1
            X.10R r1 = r2.A0M
            boolean r1 = r1.A02(r5)
            if (r1 != 0) goto L_0x00e1
            r2.A0s(r5, r13)
        L_0x0098:
            int r0 = r7.A02
            X.1gM r8 = new X.1gM
            r8.<init>(r9, r0, r6)
            X.1ta r1 = r7.A04
            int r0 = r7.A00
            X.1gM r3 = new X.1gM
            r3.<init>(r1, r0, r4)
            X.1ta r1 = r8.A01
            int r0 = r1.actualActors
            if (r0 == 0) goto L_0x00e0
            int r0 = r1.hostStorage
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r8.A03()
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r3.A03()
            if (r0 != 0) goto L_0x00e0
            X.0rz r0 = r2.A0G
            boolean r0 = r0.A1Y()
            if (r0 == 0) goto L_0x00e0
            X.122 r3 = r2.A1h
            X.0t3 r0 = r2.A0F
            long r15 = r0.A00()
            X.18b r1 = r3.A03
            r0 = 1
            X.1Vw r12 = r1.A02(r5, r0)
            X.0so r11 = r3.A00
            r14 = 63
            X.1WU r0 = X.AnonymousClass122.A00(r11, r12, r13, r14, r15)
            r2.A0u(r0)
        L_0x00e0:
            return
        L_0x00e1:
            if (r0 == 0) goto L_0x0098
            r2.A0u(r0)
            goto L_0x0098
        L_0x00e7:
            r0 = 10
            if (r10 <= r0) goto L_0x00fe
            java.lang.String r0 = "Unexpected old business state "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r10)
        L_0x00f5:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00fc:
            r0 = r13
            goto L_0x0085
        L_0x00fe:
            if (r8 <= r0) goto L_0x010b
            java.lang.String r0 = "Unexpected new business state "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r8)
            goto L_0x00f5
        L_0x010b:
            int[][] r0 = X.C42851ym.A00
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0R(X.0rv, X.1Vs):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c4, code lost:
        if (r9 != false) goto L_0x00c6;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00bb */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:36:0x00bb=Splitter:B:36:0x00bb, B:29:0x00ad=Splitter:B:29:0x00ad} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S(X.C15830rv r20, java.lang.Long r21, boolean r22, boolean r23) {
        /*
            r19 = this;
            java.lang.String r0 = "msgstore/clearmsgs/service/jid "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r13 = r20
            r1.append(r13)
            java.lang.String r0 = " excludeStarred:"
            r1.append(r0)
            r7 = r22
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = r19
            X.17E r0 = r3.A0e
            android.os.Handler r4 = r0.A01
            java.lang.String r0 = r13.getRawString()
            r6 = 1
            android.os.Message r0 = android.os.Message.obtain(r4, r6, r0)
            r0.sendToTarget()
            X.16w r12 = r3.A0U
            X.0ts r0 = r12.A00
            long r0 = r0.A02(r13)
            X.1y1 r0 = r12.A01(r0)
            r11 = 0
            if (r0 == 0) goto L_0x0076
            java.util.List r15 = r0.A09
            boolean r0 = r0.A0B
        L_0x0042:
            r16 = r22 ^ 1
            r5 = 0
            r14 = r21
            r17 = r23
            r18 = r0
            X.1y1 r2 = r12.A03(r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x00e6
            X.0rt r0 = r3.A0O
            X.0rx r0 = r0.A06(r13)
            if (r0 == 0) goto L_0x005e
            int r0 = r0.A00
            if (r0 != r6) goto L_0x005e
            r11 = 1
        L_0x005e:
            if (r22 == 0) goto L_0x00c6
            boolean r0 = X.C16030sJ.A0L(r13)
            if (r0 != 0) goto L_0x00ea
            boolean r0 = X.C16030sJ.A0G(r13)
            if (r0 != 0) goto L_0x00ea
            X.17r r10 = r3.A1K
            X.0tq r0 = r10.A03
            X.0tf r7 = r0.get()
            r9 = 1
            goto L_0x0079
        L_0x0076:
            r15 = 0
            r0 = 0
            goto L_0x0042
        L_0x0079:
            java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ all -> 0x00bc }
            X.0ts r0 = r10.A01     // Catch:{ all -> 0x00bc }
            long r0 = r0.A02(r13)     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00bc }
            r0 = 0
            r8[r0] = r1     // Catch:{ all -> 0x00bc }
            boolean r0 = r10.A02()     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0097
            java.lang.String r1 = "SELECT EXISTS( SELECT * FROM message_system JOIN message_view ON message_view._id = message_system.message_row_id  WHERE chat_row_id = ?  AND  (action_type = 61 OR action_type = 69 )) as has_biz_state_change"
        L_0x0090:
            X.0tg r0 = r7.A02     // Catch:{ all -> 0x00bc }
            android.database.Cursor r1 = r0.A08(r1, r8)     // Catch:{ all -> 0x00bc }
            goto L_0x009a
        L_0x0097:
            java.lang.String r1 = "SELECT EXISTS( SELECT * FROM message_view WHERE chat_row_id = ? AND message_type = 7 AND (media_size = 61 OR media_size = 69 )) as has_biz_state_change"
            goto L_0x0090
        L_0x009a:
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = "has_biz_state_change"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b5 }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x00b5 }
            if (r0 == r6) goto L_0x00ad
            r9 = 0
        L_0x00ad:
            r1.close()     // Catch:{ all -> 0x00bc }
            goto L_0x00c1
        L_0x00b1:
            r1.close()     // Catch:{ all -> 0x00bc }
            goto L_0x00e7
        L_0x00b5:
            r0 = move-exception
            if (r1 == 0) goto L_0x00bb
            r1.close()     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            throw r0     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            throw r0
        L_0x00c1:
            r7.close()
            if (r9 == 0) goto L_0x00ea
        L_0x00c6:
            r3.A0P(r13)
            if (r11 == 0) goto L_0x00d3
            java.lang.String r0 = "msgstore/clearmsgs/service/ adding plaintext disabled message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.A0s(r13, r5)
        L_0x00d3:
            r1 = 2
            java.lang.String r0 = r13.getRawString()
            android.os.Message r0 = android.os.Message.obtain(r4, r1, r0)
            r0.sendToTarget()
            X.16x r1 = r3.A0Q
            java.lang.String r0 = "action_clear"
            r1.A00(r2, r0)
        L_0x00e6:
            return
        L_0x00e7:
            r7.close()
        L_0x00ea:
            boolean r0 = r3.A0t(r13, r6)
            r0 = r0 ^ 1
            r11 = r11 & r0
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0S(X.0rv, java.lang.Long, boolean, boolean):void");
    }

    public void A0T(C15830rv r12, boolean z2) {
        StringBuilder sb = new StringBuilder("msgstore/deletemsgs/service/jid ");
        sb.append(r12);
        Log.i(sb.toString());
        Handler handler = this.A0e.A01;
        Message.obtain(handler, 1, r12.getRawString()).sendToTarget();
        C42561y1 A032 = this.A0U.A03(r12, (Long) null, (List) null, true, z2, false);
        if (A032 != null) {
            Message.obtain(handler, 2, r12.getRawString()).sendToTarget();
            this.A0Q.A00(A032, "action_delete");
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x009d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(X.C15830rv r9, boolean r10) {
        /*
            r8 = this;
            X.0t3 r0 = r8.A0F
            long r2 = r0.A00()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.HOURS
            r0 = 24
            long r0 = r4.toMillis(r0)
            long r2 = r2 - r0
            long r6 = r8.A08(r9, r2)
            X.17r r2 = r8.A1K
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            X.0tq r0 = r2.A03
            X.0tf r4 = r0.get()
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x009e }
            r3.<init>()     // Catch:{ all -> 0x009e }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x009e }
            r3.add(r0)     // Catch:{ all -> 0x009e }
            X.0ts r0 = r2.A01     // Catch:{ all -> 0x009e }
            long r0 = r0.A02(r9)     // Catch:{ all -> 0x009e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x009e }
            r3.add(r0)     // Catch:{ all -> 0x009e }
            X.01D r0 = X.C40171tg.A00     // Catch:{ all -> 0x009e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x009e }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x009e }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x009e }
        L_0x0045:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x009e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x009e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x009e }
            r3.add(r0)     // Catch:{ all -> 0x009e }
            goto L_0x0045
        L_0x0059:
            boolean r0 = r2.A02()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0070
            java.lang.String r2 = X.C39511sb.A08     // Catch:{ all -> 0x009e }
        L_0x0061:
            X.0tg r1 = r4.A02     // Catch:{ all -> 0x009e }
            java.lang.String[] r0 = X.AnonymousClass01S.A0H     // Catch:{ all -> 0x009e }
            java.lang.Object[] r0 = r3.toArray(r0)     // Catch:{ all -> 0x009e }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x009e }
            android.database.Cursor r3 = r1.A08(r2, r0)     // Catch:{ all -> 0x009e }
            goto L_0x0073
        L_0x0070:
            java.lang.String r2 = X.C39511sb.A07     // Catch:{ all -> 0x009e }
            goto L_0x0061
        L_0x0073:
            java.lang.String r0 = "_id"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0097 }
        L_0x0079:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x008b
            long r0 = r3.getLong(r2)     // Catch:{ all -> 0x0097 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0097 }
            r5.add(r0)     // Catch:{ all -> 0x0097 }
            goto L_0x0079
        L_0x008b:
            r3.close()     // Catch:{ all -> 0x009e }
            r4.close()
            X.17G r0 = r8.A0j
            r0.A0A(r5, r10)
            return
        L_0x0097:
            r0 = move-exception
            if (r3 == 0) goto L_0x009d
            r3.close()     // Catch:{ all -> 0x009d }
        L_0x009d:
            throw r0     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0U(X.0rv, boolean):void");
    }

    public final void A0V(UserJid userJid, C16740tZ r7, boolean z2) {
        if (!z2) {
            C40281tr A032 = this.A1T.A03(userJid);
            C15810rt r3 = this.A0O;
            C17030uP r2 = this.A0B;
            if (!(r7 instanceof C40281tr)) {
                C28381Vw r1 = r7.A11;
                if (r1.A02) {
                    C15830rv r12 = r1.A00;
                    if (C16030sJ.A0O(r12) && !r2.A02((UserJid) r12) && r7.A0Y != null && r3.A06(r12) == null && A032 != null) {
                        A0X(A032);
                        A0Y(A032);
                    }
                }
            }
        }
    }

    public void A0W(C16740tZ r3) {
        int i2 = -1;
        if (r3.A1D) {
            i2 = 22;
        }
        A0d(r3, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        if (r0 == null) goto L_0x007c;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x01ca */
    /* JADX WARNING: Missing exception handler attribute for start block: B:106:0x01cf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:439:0x08c5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:444:0x08ca */
    /* JADX WARNING: Missing exception handler attribute for start block: B:453:0x08e1 */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x047a A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x049c A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x04c5 A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0526 A[SYNTHETIC, Splitter:B:260:0x0526] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x059e A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x05b4 A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x05c4 A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x05d7 A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0609 A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x06be A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x06ce A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x06e0 A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x06ec A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x06fc A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x070c A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x071c A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x072c A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x073e A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x074e A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x075c A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x0768 A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0774 A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x078a A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x07a6 A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x07b5 A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x07bf A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x07e2 A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x07ea A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x07ee A[Catch:{ all -> 0x0493, all -> 0x08dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0896 A[Catch:{ all -> 0x0493, all -> 0x08dd }, LOOP:0: B:428:0x0890->B:430:0x0896, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0X(X.C16740tZ r29) {
        /*
            r28 = this;
            r6 = r29
            X.1Vw r13 = r6.A11
            boolean r0 = r6 instanceof X.C39131ry
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = "msgstore/skip storing transient message: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x001a:
            long r16 = android.os.SystemClock.uptimeMillis()
            r5 = r28
            X.0tq r0 = r5.A0v
            r26 = r0
            X.0tf r19 = r26.A02()
            X.1cj r18 = r19.A00()     // Catch:{ all -> 0x08e2 }
            r26.A04()     // Catch:{ all -> 0x08dd }
            X.1jC r14 = r0.A04     // Catch:{ all -> 0x08dd }
            r0 = r19
            boolean r0 = r14.A0D(r0)     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0042
            r0 = 0
            r6.A0F = r0     // Catch:{ all -> 0x08dd }
            X.17q r0 = r5.A16     // Catch:{ all -> 0x08dd }
            r0.A02(r6)     // Catch:{ all -> 0x08dd }
        L_0x0042:
            X.1Vt r3 = r6.A0L     // Catch:{ all -> 0x08dd }
            if (r3 == 0) goto L_0x007c
            monitor-enter(r3)     // Catch:{ all -> 0x08dd }
            boolean r0 = r3.A0O     // Catch:{ all -> 0x08da }
            monitor-exit(r3)     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x007c
            X.0wS r0 = r5.A1f     // Catch:{ all -> 0x08dd }
            r0.A06()     // Catch:{ all -> 0x08dd }
            X.16r r2 = r0.A08     // Catch:{ all -> 0x08dd }
            X.1Vt r0 = r6.A0L     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x08cb
            java.lang.String r1 = r13.A01     // Catch:{ all -> 0x08dd }
            r0 = 0
            X.1Vt r1 = r2.A0M(r1, r0)     // Catch:{ all -> 0x08dd }
            if (r1 == 0) goto L_0x009a
            X.1Vt r0 = r6.A0L     // Catch:{ all -> 0x08dd }
            boolean r0 = r1.A0J(r0)     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = r1.A0L     // Catch:{ all -> 0x08dd }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x08dd }
            if (r0 != 0) goto L_0x009a
            java.lang.String r0 = r1.A0K     // Catch:{ all -> 0x08dd }
            if (r0 != 0) goto L_0x007a
            X.1Vt r0 = r6.A0L     // Catch:{ all -> 0x08dd }
            java.lang.String r0 = r0.A0K     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x007c
        L_0x007a:
            r6.A0n = r0     // Catch:{ all -> 0x08dd }
        L_0x007c:
            X.0rt r1 = r5.A0O     // Catch:{ all -> 0x08dd }
            X.0sG r0 = r5.A0A     // Catch:{ all -> 0x08dd }
            r25 = r0
            boolean r0 = X.C40491uD.A07(r0, r1, r6)     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x008d
            r0 = 512(0x200, float:7.175E-43)
            r6.A0S(r0)     // Catch:{ all -> 0x08dd }
        L_0x008d:
            X.17G r2 = r5.A0j     // Catch:{ all -> 0x08dd }
            r4 = 1
            r6.A0X(r4)     // Catch:{ all -> 0x08dd }
            X.0tq r3 = r2.A05     // Catch:{ all -> 0x08dd }
            X.0tf r9 = r3.A02()     // Catch:{ all -> 0x08dd }
            goto L_0x00a3
        L_0x009a:
            X.1Vt r0 = r6.A0L     // Catch:{ all -> 0x08dd }
            java.lang.String r0 = r0.A0K     // Catch:{ all -> 0x08dd }
            if (r0 != 0) goto L_0x007a
            java.lang.String r0 = "UNSET"
            goto L_0x007a
        L_0x00a3:
            X.1cj r24 = r9.A00()     // Catch:{ all -> 0x08c6 }
            X.14v r1 = r2.A04     // Catch:{ all -> 0x08c1 }
            X.0rv r0 = r13.A00     // Catch:{ all -> 0x08c1 }
            r27 = r0
            X.AnonymousClass00B.A06(r27)     // Catch:{ all -> 0x08c1 }
            r1.A01(r0)     // Catch:{ all -> 0x08c1 }
            X.0ts r1 = r2.A03     // Catch:{ all -> 0x08c1 }
            long r0 = r1.A02(r0)     // Catch:{ all -> 0x08c1 }
            r11 = 0
            int r7 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            r10 = 0
            if (r7 <= 0) goto L_0x00c1
            r10 = 1
        L_0x00c1:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x08c1 }
            r8.<init>()     // Catch:{ all -> 0x08c1 }
            java.lang.String r7 = "MainMessageStore/insertMainMessage/Chat row not inserted; chatRowId="
            r8.append(r7)     // Catch:{ all -> 0x08c1 }
            r8.append(r0)     // Catch:{ all -> 0x08c1 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x08c1 }
            X.AnonymousClass00B.A0B(r0, r10)     // Catch:{ all -> 0x08c1 }
            r3.A04()     // Catch:{ all -> 0x08c1 }
            X.1jC r0 = r3.A04     // Catch:{ all -> 0x08c1 }
            boolean r0 = r0.A0D(r9)     // Catch:{ all -> 0x08c1 }
            if (r0 == 0) goto L_0x0121
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ SQLException -> 0x0108 }
            r7.<init>()     // Catch:{ SQLException -> 0x0108 }
            X.0sc r8 = r2.A01     // Catch:{ SQLException -> 0x0108 }
            X.AnonymousClass00B.A06(r27)     // Catch:{ SQLException -> 0x0108 }
            java.lang.String r1 = r27.getRawString()     // Catch:{ SQLException -> 0x0108 }
            java.lang.String r0 = "key_remote_jid"
            r7.put(r0, r1)     // Catch:{ SQLException -> 0x0108 }
            X.C38611r4.A01(r7, r8, r6)     // Catch:{ SQLException -> 0x0108 }
            X.0tg r1 = r9.A02     // Catch:{ SQLException -> 0x0108 }
            java.lang.String r0 = "messages"
            long r0 = r1.A03(r7, r0)     // Catch:{ SQLException -> 0x0108 }
            r6.A13 = r0     // Catch:{ SQLException -> 0x0108 }
            long r0 = r6.A13     // Catch:{ all -> 0x08c1 }
            int r7 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x0110
            r4 = 0
            goto L_0x0110
        L_0x0108:
            r1 = move-exception
            java.lang.String r0 = "MainMessageStore/insertMainMessage failed to insert message to V1 table."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x08c1 }
            goto L_0x01d6
        L_0x0110:
            java.lang.String r0 = "MainMessageStore/insertMainMessage, insert message to V1 table, no row_id assigned."
            X.AnonymousClass00B.A0B(r0, r4)     // Catch:{ all -> 0x08c1 }
            long r0 = r6.A14     // Catch:{ all -> 0x08c1 }
            r7 = -1
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0121
            long r0 = r6.A13     // Catch:{ all -> 0x08c1 }
            r6.A14 = r0     // Catch:{ all -> 0x08c1 }
        L_0x0121:
            boolean r0 = r2.A09()     // Catch:{ all -> 0x08c1 }
            if (r0 == 0) goto L_0x01d7
            X.0tf r15 = r3.A02()     // Catch:{ SQLException -> 0x01d0 }
            X.1cj r23 = r15.A00()     // Catch:{ all -> 0x01cb }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x01c6 }
            r11.<init>()     // Catch:{ all -> 0x01c6 }
            r2.A03(r11, r6)     // Catch:{ all -> 0x01c6 }
            long r0 = r6.A13     // Catch:{ all -> 0x01c6 }
            java.lang.String r12 = "sort_id"
            r21 = 0
            int r2 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r2 <= 0) goto L_0x0162
            java.lang.String r2 = "_id"
            long r0 = r6.A13     // Catch:{ all -> 0x01c6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01c6 }
            r11.put(r2, r0)     // Catch:{ all -> 0x01c6 }
            long r0 = r6.A14     // Catch:{ all -> 0x01c6 }
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0159
            long r0 = r6.A13     // Catch:{ all -> 0x01c6 }
            r6.A14 = r0     // Catch:{ all -> 0x01c6 }
        L_0x0159:
            long r0 = r6.A14     // Catch:{ all -> 0x01c6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01c6 }
            r11.put(r12, r0)     // Catch:{ all -> 0x01c6 }
        L_0x0162:
            X.0tg r10 = r15.A02     // Catch:{ all -> 0x01c6 }
            java.lang.String r8 = "message"
            long r3 = r10.A03(r11, r8)     // Catch:{ all -> 0x01c6 }
            long r0 = r6.A13     // Catch:{ all -> 0x01c6 }
            r7 = 0
            r2 = 1
            int r20 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r20 <= 0) goto L_0x017a
            long r0 = r6.A13     // Catch:{ all -> 0x01c6 }
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x01b4
            r7 = 1
            goto L_0x01b4
        L_0x017a:
            int r0 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L_0x0180
            r1 = 1
        L_0x0180:
            java.lang.String r0 = "MainMessageStore/insertMainMessageV2, row_id for inserted message not set."
            X.AnonymousClass00B.A0B(r0, r1)     // Catch:{ all -> 0x01c6 }
            r6.A13 = r3     // Catch:{ all -> 0x01c6 }
            long r0 = r6.A14     // Catch:{ all -> 0x01c6 }
            r21 = -1
            int r20 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r20 < 0) goto L_0x01b9
            r6.A14 = r3     // Catch:{ all -> 0x01c6 }
            r11.clear()     // Catch:{ SQLException -> 0x01ad }
            long r0 = r6.A14     // Catch:{ SQLException -> 0x01ad }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLException -> 0x01ad }
            r11.put(r12, r0)     // Catch:{ SQLException -> 0x01ad }
            java.lang.String r4 = "_id = ?"
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ SQLException -> 0x01ad }
            long r0 = r6.A13     // Catch:{ SQLException -> 0x01ad }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ SQLException -> 0x01ad }
            r3[r7] = r0     // Catch:{ SQLException -> 0x01ad }
            r10.A00(r8, r11, r4, r3)     // Catch:{ SQLException -> 0x01ad }
            goto L_0x01b9
        L_0x01ad:
            r1 = move-exception
            java.lang.String r0 = "MainMessageStore/insertMainMessageV2, failed to update sortId"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01c6 }
            throw r1     // Catch:{ all -> 0x01c6 }
        L_0x01b4:
            java.lang.String r0 = "MainMessageStore/insertMainMessageV2/RowId for inserted message doesn't match."
            X.AnonymousClass00B.A0B(r0, r7)     // Catch:{ all -> 0x01c6 }
        L_0x01b9:
            r6.A0X(r2)     // Catch:{ all -> 0x01c6 }
            r23.A00()     // Catch:{ all -> 0x01c6 }
            r23.close()     // Catch:{ all -> 0x01cb }
            r15.close()     // Catch:{ SQLException -> 0x01d0 }
            goto L_0x01d7
        L_0x01c6:
            r0 = move-exception
            r23.close()     // Catch:{ all -> 0x01ca }
        L_0x01ca:
            throw r0     // Catch:{ all -> 0x01cb }
        L_0x01cb:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x01cf }
        L_0x01cf:
            throw r0     // Catch:{ SQLException -> 0x01d0 }
        L_0x01d0:
            r1 = move-exception
            java.lang.String r0 = "MainMessageStore/insertMainMessageV2, unknown error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x08c1 }
        L_0x01d6:
            throw r1     // Catch:{ all -> 0x08c1 }
        L_0x01d7:
            r24.A00()     // Catch:{ all -> 0x08c1 }
            r24.close()     // Catch:{ all -> 0x08c6 }
            r9.close()     // Catch:{ all -> 0x08dd }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x08dd }
            r2.<init>()     // Catch:{ all -> 0x08dd }
            java.lang.String r0 = "msgstore/insertMessage/row_id "
            r2.append(r0)     // Catch:{ all -> 0x08dd }
            long r0 = r6.A13     // Catch:{ all -> 0x08dd }
            r2.append(r0)     // Catch:{ all -> 0x08dd }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x08dd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x08dd }
            java.lang.String r15 = "msgstore/insertExtraTablesMessage"
            com.whatsapp.util.Log.i((java.lang.String) r15)     // Catch:{ all -> 0x08dd }
            long r11 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x08dd }
            X.1Vt r3 = r6.A0L     // Catch:{ all -> 0x08dd }
            r4 = 1
            r2 = 0
            if (r3 == 0) goto L_0x027d
            monitor-enter(r3)     // Catch:{ all -> 0x08dd }
            boolean r0 = r3.A0O     // Catch:{ all -> 0x08da }
            monitor-exit(r3)     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x027d
            X.0wS r0 = r5.A1f     // Catch:{ all -> 0x08dd }
            r0.A06()     // Catch:{ all -> 0x08dd }
            X.16r r0 = r0.A08     // Catch:{ all -> 0x08dd }
            java.lang.String r3 = r0.A0Q(r6, r4)     // Catch:{ all -> 0x08dd }
            X.0tf r1 = r26.get()     // Catch:{ all -> 0x08dd }
            r26.A04()     // Catch:{ all -> 0x0227 }
            boolean r0 = r14.A0D(r1)     // Catch:{ all -> 0x0227 }
            if (r0 == 0) goto L_0x022d
            r5.A0h(r6, r3, r2)     // Catch:{ all -> 0x0227 }
            goto L_0x022d
        L_0x0227:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x08ca }
            goto L_0x08ca
        L_0x022d:
            r1.close()     // Catch:{ all -> 0x08dd }
            X.1Vt r0 = r6.A0L     // Catch:{ all -> 0x08dd }
            r0.A09(r2)     // Catch:{ all -> 0x08dd }
            r5.A0c(r6)     // Catch:{ all -> 0x08dd }
            X.1Vt r8 = r6.A0L     // Catch:{ all -> 0x08dd }
            X.1W2 r0 = r8.A0A     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x027d
            X.1lu r0 = r0.A02     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x027d
            r1 = 200(0xc8, float:2.8E-43)
            int r0 = r8.A03     // Catch:{ all -> 0x08dd }
            if (r1 != r0) goto L_0x027d
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x08dd }
            X.1W2 r0 = r8.A0A     // Catch:{ all -> 0x08dd }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x08dd }
            X.0vO r1 = r5.A0y     // Catch:{ all -> 0x08dd }
            X.1lu r0 = r0.A02     // Catch:{ all -> 0x08dd }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x08dd }
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x08dd }
            X.0ti r7 = r1.A00(r0)     // Catch:{ all -> 0x08dd }
            if (r7 == 0) goto L_0x027d
            X.0tn r0 = r7.A00     // Catch:{ all -> 0x08dd }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x08dd }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x08dd }
            X.1lc r3 = r0.A01     // Catch:{ all -> 0x08dd }
            if (r3 == 0) goto L_0x029c
            java.lang.String r0 = r3.A03     // Catch:{ all -> 0x08dd }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x08dd }
            if (r0 != 0) goto L_0x0290
            java.lang.String r1 = r3.A03     // Catch:{ all -> 0x08dd }
            java.lang.String r0 = r8.A0K     // Catch:{ all -> 0x08dd }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0290
        L_0x027d:
            boolean r0 = r6.A10(r4)     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x02c4
            X.183 r3 = r5.A0Y     // Catch:{ all -> 0x08dd }
            long r0 = r6.A13     // Catch:{ all -> 0x08dd }
            int r8 = r6.A05     // Catch:{ all -> 0x08dd }
            X.0tq r3 = r3.A00     // Catch:{ all -> 0x08dd }
            X.0tf r9 = r3.A02()     // Catch:{ all -> 0x08dd }
            goto L_0x02a2
        L_0x0290:
            java.lang.String r0 = r8.A0K     // Catch:{ all -> 0x08dd }
            r3.A03 = r0     // Catch:{ all -> 0x08dd }
            X.0vM r3 = r5.A0f     // Catch:{ all -> 0x08dd }
            long r0 = r7.A13     // Catch:{ all -> 0x08dd }
            r3.A0G(r7, r0)     // Catch:{ all -> 0x08dd }
            goto L_0x027d
        L_0x029c:
            java.lang.String r0 = "PAY: CoreMessageStore/updateCheckoutMessageWithTransactionInfo -> checkoutInfoContent is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08dd }
            goto L_0x027d
        L_0x02a2:
            r3 = 2
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x08c6 }
            r7.<init>(r3)     // Catch:{ all -> 0x08c6 }
            java.lang.String r3 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x08c6 }
            r7.put(r3, r0)     // Catch:{ all -> 0x08c6 }
            java.lang.String r0 = "forward_score"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x08c6 }
            r7.put(r0, r1)     // Catch:{ all -> 0x08c6 }
            X.0tg r1 = r9.A02     // Catch:{ all -> 0x08c6 }
            java.lang.String r0 = "message_forwarded"
            r1.A02(r7, r0)     // Catch:{ all -> 0x08c6 }
            r9.close()     // Catch:{ all -> 0x08dd }
        L_0x02c4:
            r0 = 1024(0x400, float:1.435E-42)
            boolean r0 = r6.A10(r0)     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0361
            X.188 r0 = r5.A0X     // Catch:{ all -> 0x08dd }
            X.1uH r10 = r6.A0N     // Catch:{ all -> 0x08dd }
            X.0tq r0 = r0.A00     // Catch:{ all -> 0x08dd }
            X.0tf r9 = r0.A02()     // Catch:{ all -> 0x08dd }
            X.0tg r8 = r9.A02     // Catch:{ all -> 0x08c6 }
            java.lang.String r7 = "message_external_ad_content"
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x08c6 }
            r3.<init>()     // Catch:{ all -> 0x08c6 }
            long r0 = r6.A13     // Catch:{ all -> 0x08c6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x08c6 }
            java.lang.String r0 = "message_row_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x08c6 }
            java.lang.String r1 = r10.A09     // Catch:{ all -> 0x08c6 }
            java.lang.String r0 = "title"
            r3.put(r0, r1)     // Catch:{ all -> 0x08c6 }
            java.lang.String r1 = r10.A02     // Catch:{ all -> 0x08c6 }
            java.lang.String r0 = "body"
            r3.put(r0, r1)     // Catch:{ all -> 0x08c6 }
            int r0 = r10.A01     // Catch:{ all -> 0x08c6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x08c6 }
            java.lang.String r0 = "media_type"
            r3.put(r0, r1)     // Catch:{ all -> 0x08c6 }
            java.lang.String r1 = r10.A08     // Catch:{ all -> 0x08c6 }
            java.lang.String r0 = "thumbnail_url"
            r3.put(r0, r1)     // Catch:{ all -> 0x08c6 }
            byte[] r1 = r10.A0D     // Catch:{ all -> 0x08c6 }
            java.lang.String r0 = "micro_thumbnail"
            r3.put(r0, r1)     // Catch:{ all -> 0x08c6 }
            byte[] r1 = r10.A00     // Catch:{ all -> 0x08c6 }
            java.lang.String r0 = "full_thumbnail"
            r3.put(r0, r1)     // Catch:{ all -> 0x08c6 }
            java.lang.String r1 = r10.A04     // Catch:{ all -> 0x08c6 }
            java.lang.String r0 = "media_url"
            r3.put(r0, r1)     // Catch:{ all -> 0x08c6 }
            java.lang.String r1 = r10.A06     // Catch:{ all -> 0x08c6 }
            java.lang.String r0 = "source_type"
            r3.put(r0, r1)     // Catch:{ all -> 0x08c6 }
            java.lang.String r1 = r10.A05     // Catch:{ all -> 0x08c6 }
            java.lang.String r0 = "source_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x08c6 }
            java.lang.String r1 = r10.A07     // Catch:{ all -> 0x08c6 }
            java.lang.String r0 = "source_url"
            r3.put(r0, r1)     // Catch:{ all -> 0x08c6 }
            boolean r0 = r10.A0B     // Catch:{ all -> 0x08c6 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x08c6 }
            java.lang.String r0 = "render_larger_thumbnail"
            r3.put(r0, r1)     // Catch:{ all -> 0x08c6 }
            boolean r0 = r10.A0C     // Catch:{ all -> 0x08c6 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x08c6 }
            java.lang.String r0 = "show_ad_attribution"
            r3.put(r0, r1)     // Catch:{ all -> 0x08c6 }
            boolean r0 = r10.A0A     // Catch:{ all -> 0x08c6 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x08c6 }
            java.lang.String r0 = "has_icebreaker_auto_response"
            r3.put(r0, r1)     // Catch:{ all -> 0x08c6 }
            r8.A02(r3, r7)     // Catch:{ all -> 0x08c6 }
            r9.close()     // Catch:{ all -> 0x08dd }
        L_0x0361:
            r0 = 2048(0x800, float:2.87E-42)
            boolean r0 = r6.A10(r0)     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0378
            X.1cv r7 = r6.A0U     // Catch:{ all -> 0x08dd }
            if (r7 == 0) goto L_0x0378
            java.lang.String r0 = r7.A06     // Catch:{ all -> 0x08dd }
            if (r0 != 0) goto L_0x0378
            X.18B r3 = r5.A0x     // Catch:{ all -> 0x08dd }
            long r0 = r6.A13     // Catch:{ all -> 0x08dd }
            r3.A00(r7, r0)     // Catch:{ all -> 0x08dd }
        L_0x0378:
            int r0 = r6.A04     // Catch:{ all -> 0x08dd }
            if (r0 <= 0) goto L_0x0381
            X.182 r0 = r5.A0V     // Catch:{ all -> 0x08dd }
            r0.A04(r6)     // Catch:{ all -> 0x08dd }
        L_0x0381:
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r0 = r6.A10(r0)     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x03f3
            X.186 r0 = r5.A13     // Catch:{ all -> 0x08dd }
            X.1ta r9 = r6.A0V     // Catch:{ all -> 0x08dd }
            if (r9 != 0) goto L_0x0394
            X.1ta r9 = new X.1ta     // Catch:{ all -> 0x08dd }
            r9.<init>()     // Catch:{ all -> 0x08dd }
        L_0x0394:
            X.0tq r0 = r0.A02     // Catch:{ all -> 0x08dd }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x08dd }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0824 }
            r7.<init>()     // Catch:{ all -> 0x0824 }
            java.lang.String r8 = "message_row_id"
            long r0 = r6.A13     // Catch:{ all -> 0x0824 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0824 }
            r7.put(r8, r0)     // Catch:{ all -> 0x0824 }
            java.lang.String r1 = "host_storage"
            int r0 = r9.hostStorage     // Catch:{ all -> 0x0824 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0824 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0824 }
            java.lang.String r1 = "actual_actors"
            int r0 = r9.actualActors     // Catch:{ all -> 0x0824 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0824 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0824 }
            java.lang.String r8 = "privacy_mode_ts"
            long r0 = r9.privacyModeTs     // Catch:{ all -> 0x0824 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0824 }
            r7.put(r8, r0)     // Catch:{ all -> 0x0824 }
            int r1 = r6.A0E     // Catch:{ all -> 0x0824 }
            r0 = 3
            if (r1 != r0) goto L_0x03ed
            boolean r0 = r6.A0y     // Catch:{ all -> 0x0824 }
            if (r0 == 0) goto L_0x03ed
            com.whatsapp.jid.UserJid r1 = r6.A0C()     // Catch:{ all -> 0x0824 }
            r0 = r25
            X.0sH r0 = r0.A08(r1)     // Catch:{ all -> 0x0824 }
            if (r0 == 0) goto L_0x03ed
            java.lang.String r1 = r0.A0B()     // Catch:{ all -> 0x0824 }
            if (r1 == 0) goto L_0x03ed
            java.lang.String r0 = "business_name"
            r7.put(r0, r1)     // Catch:{ all -> 0x0824 }
            r6.A0i = r1     // Catch:{ all -> 0x0824 }
        L_0x03ed:
            X.0tg r8 = r3.A02     // Catch:{ all -> 0x0824 }
            java.lang.String r1 = "message_privacy_state"
            r0 = 5
            goto L_0x045b
        L_0x03f3:
            r0 = r27
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0461
            boolean r0 = r13.A02     // Catch:{ all -> 0x08dd }
            if (r0 != 0) goto L_0x0401
            boolean r0 = r6.A1D     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0461
        L_0x0401:
            byte r1 = r6.A10     // Catch:{ all -> 0x08dd }
            r0 = 7
            if (r1 == r0) goto L_0x0461
            int r1 = r6.A0C     // Catch:{ all -> 0x08dd }
            r0 = 6
            if (r1 == r0) goto L_0x0461
            X.186 r1 = r5.A13     // Catch:{ all -> 0x08dd }
            X.0uP r3 = r1.A00     // Catch:{ all -> 0x08dd }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r27)     // Catch:{ all -> 0x08dd }
            X.1Vq r9 = r3.A00(r0)     // Catch:{ all -> 0x08dd }
            if (r9 == 0) goto L_0x0461
            boolean r0 = r9.A01()     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0461
            X.0tq r0 = r1.A02     // Catch:{ all -> 0x08dd }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x08dd }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0824 }
            r7.<init>()     // Catch:{ all -> 0x0824 }
            java.lang.String r8 = "message_row_id"
            long r0 = r6.A13     // Catch:{ all -> 0x0824 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0824 }
            r7.put(r8, r0)     // Catch:{ all -> 0x0824 }
            java.lang.String r1 = "host_storage"
            int r0 = r9.A01     // Catch:{ all -> 0x0824 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0824 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0824 }
            java.lang.String r1 = "actual_actors"
            int r0 = r9.A00     // Catch:{ all -> 0x0824 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0824 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0824 }
            java.lang.String r8 = "privacy_mode_ts"
            long r0 = r9.A04     // Catch:{ all -> 0x0824 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0824 }
            r7.put(r8, r0)     // Catch:{ all -> 0x0824 }
            X.0tg r8 = r3.A02     // Catch:{ all -> 0x0824 }
            java.lang.String r1 = "message_privacy_state"
            r0 = 5
        L_0x045b:
            r8.A06(r7, r1, r0)     // Catch:{ all -> 0x0824 }
            r3.close()     // Catch:{ all -> 0x08dd }
        L_0x0461:
            r0 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = r6.A10(r0)     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0474
            X.1sC r0 = r6.A0G()     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0474
            X.0v1 r0 = r5.A0q     // Catch:{ all -> 0x08dd }
            r0.A01(r6)     // Catch:{ all -> 0x08dd }
        L_0x0474:
            X.0tm r3 = r6.A0F()     // Catch:{ all -> 0x08dd }
            if (r3 == 0) goto L_0x0498
            monitor-enter(r3)     // Catch:{ all -> 0x08dd }
            boolean r0 = r3.A02     // Catch:{ all -> 0x0493 }
            monitor-exit(r3)     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0498
            byte[] r0 = r3.A07()     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0498
            X.0xN r1 = r5.A1N     // Catch:{ all -> 0x08dd }
            byte[] r0 = r3.A07()     // Catch:{ all -> 0x08dd }
            r1.A02(r6, r0)     // Catch:{ all -> 0x08dd }
            monitor-enter(r3)     // Catch:{ all -> 0x08dd }
            r3.A02 = r2     // Catch:{ all -> 0x0493 }
            goto L_0x0497
        L_0x0493:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x08dd }
            goto L_0x08dc
        L_0x0497:
            monitor-exit(r3)     // Catch:{ all -> 0x08dd }
        L_0x0498:
            boolean r0 = r6 instanceof X.C16730tY     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x04af
            X.17I r0 = r5.A0k     // Catch:{ all -> 0x08dd }
            r0.A07(r6)     // Catch:{ all -> 0x08dd }
            X.17J r7 = r5.A1C     // Catch:{ all -> 0x08dd }
            r0 = r6
            X.0tY r0 = (X.C16730tY) r0     // Catch:{ all -> 0x08dd }
            X.1y4 r3 = r0.A12()     // Catch:{ all -> 0x08dd }
            long r0 = r6.A13     // Catch:{ all -> 0x08dd }
            r7.A01(r3, r0)     // Catch:{ all -> 0x08dd }
        L_0x04af:
            boolean r0 = r6 instanceof X.C38701rH     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x04c1
            r0 = r6
            X.1rH r0 = (X.C38701rH) r0     // Catch:{ all -> 0x08dd }
            X.1yC r7 = r0.A00     // Catch:{ all -> 0x08dd }
            if (r7 == 0) goto L_0x04c1
            X.177 r3 = r5.A0I     // Catch:{ all -> 0x08dd }
            long r0 = r6.A13     // Catch:{ all -> 0x08dd }
            r3.A00(r7, r0)     // Catch:{ all -> 0x08dd }
        L_0x04c1:
            boolean r0 = r6 instanceof X.C38891ra     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0526
            X.17u r8 = r5.A14     // Catch:{ all -> 0x08dd }
            r7 = r6
            X.1ra r7 = (X.C38891ra) r7     // Catch:{ all -> 0x08dd }
            long r0 = r7.A13     // Catch:{ all -> 0x08dd }
            r4 = 0
            r3 = 1
            r20 = 0
            int r9 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            r1 = 0
            if (r9 <= 0) goto L_0x04d6
            r1 = 1
        L_0x04d6:
            java.lang.String r9 = "ProductMessageStore/insertProductMessage/message must have row_id set; key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x08dd }
            r0.<init>(r9)     // Catch:{ all -> 0x08dd }
            X.1Vw r9 = r7.A11     // Catch:{ all -> 0x08dd }
            r0.append(r9)     // Catch:{ all -> 0x08dd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x08dd }
            X.AnonymousClass00B.A0C(r0, r1)     // Catch:{ all -> 0x08dd }
            int r0 = r7.A08()     // Catch:{ all -> 0x08dd }
            if (r0 == r3) goto L_0x04f0
            r3 = 0
        L_0x04f0:
            java.lang.String r1 = "ProductMessageStore/insertProductMessage/message in main storage; key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x08dd }
            r0.<init>(r1)     // Catch:{ all -> 0x08dd }
            r0.append(r9)     // Catch:{ all -> 0x08dd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x08dd }
            X.AnonymousClass00B.A0C(r0, r3)     // Catch:{ all -> 0x08dd }
            X.0tq r0 = r8.A02     // Catch:{ all -> 0x08dd }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x08dd }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0824 }
            r9.<init>()     // Catch:{ all -> 0x0824 }
            long r0 = r7.A13     // Catch:{ all -> 0x0824 }
            r8.A00(r9, r7, r0)     // Catch:{ all -> 0x0824 }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0824 }
            java.lang.String r0 = "message_product"
            long r8 = r1.A03(r9, r0)     // Catch:{ all -> 0x0824 }
            long r0 = r7.A13     // Catch:{ all -> 0x0824 }
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x0520
            r4 = 1
        L_0x0520:
            java.lang.String r0 = "ProductMessageStore/insertProductMessage/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r0, r4)     // Catch:{ all -> 0x0824 }
            goto L_0x058a
        L_0x0526:
            boolean r0 = r6 instanceof X.C38981rj     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x058e
            X.17t r8 = r5.A0L     // Catch:{ all -> 0x08dd }
            r7 = r6
            X.1rj r7 = (X.C38981rj) r7     // Catch:{ all -> 0x08dd }
            long r0 = r7.A13     // Catch:{ all -> 0x08dd }
            r4 = 0
            r3 = 1
            r20 = 0
            int r9 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            r1 = 0
            if (r9 <= 0) goto L_0x053b
            r1 = 1
        L_0x053b:
            java.lang.String r9 = "CatalogMessageStore/insertCatalogMessage/message must have row_id set; key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x08dd }
            r0.<init>(r9)     // Catch:{ all -> 0x08dd }
            X.1Vw r9 = r7.A11     // Catch:{ all -> 0x08dd }
            r0.append(r9)     // Catch:{ all -> 0x08dd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x08dd }
            X.AnonymousClass00B.A0C(r0, r1)     // Catch:{ all -> 0x08dd }
            int r0 = r7.A08()     // Catch:{ all -> 0x08dd }
            if (r0 == r3) goto L_0x0555
            r3 = 0
        L_0x0555:
            java.lang.String r1 = "CatalogMessageStore/insertCatalogMessage/message in main storage; key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x08dd }
            r0.<init>(r1)     // Catch:{ all -> 0x08dd }
            r0.append(r9)     // Catch:{ all -> 0x08dd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x08dd }
            X.AnonymousClass00B.A0C(r0, r3)     // Catch:{ all -> 0x08dd }
            X.0tq r0 = r8.A01     // Catch:{ all -> 0x08dd }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x08dd }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0824 }
            r9.<init>()     // Catch:{ all -> 0x0824 }
            long r0 = r7.A13     // Catch:{ all -> 0x0824 }
            r8.A00(r9, r7, r0)     // Catch:{ all -> 0x0824 }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0824 }
            java.lang.String r0 = "message_product"
            long r8 = r1.A03(r9, r0)     // Catch:{ all -> 0x0824 }
            long r0 = r7.A13     // Catch:{ all -> 0x0824 }
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x0585
            r4 = 1
        L_0x0585:
            java.lang.String r0 = "CatalogMessageStore/insertCatalogMessage/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r0, r4)     // Catch:{ all -> 0x0824 }
        L_0x058a:
            r3.close()     // Catch:{ all -> 0x08dd }
            goto L_0x059a
        L_0x058e:
            boolean r0 = r6 instanceof X.C30901d9     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0623
            X.17x r1 = r5.A0i     // Catch:{ all -> 0x08dd }
            r0 = r6
            X.1d9 r0 = (X.C30901d9) r0     // Catch:{ all -> 0x08dd }
            r1.A00(r0)     // Catch:{ all -> 0x08dd }
        L_0x059a:
            boolean r0 = r6 instanceof X.C38741rL     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0609
            X.17m r1 = r5.A1O     // Catch:{ all -> 0x08dd }
            r0 = r6
            X.1rL r0 = (X.C38741rL) r0     // Catch:{ all -> 0x08dd }
            r1.A02(r0)     // Catch:{ all -> 0x08dd }
        L_0x05a6:
            X.0xb r1 = r5.A08     // Catch:{ all -> 0x08dd }
            com.obwhatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob r0 = new com.obwhatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob     // Catch:{ all -> 0x08dd }
            r0.<init>(r6)     // Catch:{ all -> 0x08dd }
            r1.A00(r0)     // Catch:{ all -> 0x08dd }
        L_0x05b0:
            boolean r0 = r6 instanceof X.C30591cd     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x05be
            X.17X r0 = r5.A1c     // Catch:{ all -> 0x08dd }
            r0.A00(r6)     // Catch:{ all -> 0x08dd }
            X.17z r0 = r5.A1L     // Catch:{ all -> 0x08dd }
            r0.A02(r6)     // Catch:{ all -> 0x08dd }
        L_0x05be:
            boolean r0 = r6.A0x()     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x05d3
            X.0vM r7 = r5.A0f     // Catch:{ all -> 0x08dd }
            X.1sA r0 = r6.A0E()     // Catch:{ all -> 0x08dd }
            X.1sB r4 = r0.A00     // Catch:{ all -> 0x08dd }
            long r0 = r6.A13     // Catch:{ all -> 0x08dd }
            java.lang.String r3 = "message_ui_elements"
            r7.A09(r4, r3, r0)     // Catch:{ all -> 0x08dd }
        L_0x05d3:
            boolean r0 = r6 instanceof X.C38961rh     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x06ba
            X.17z r8 = r5.A1L     // Catch:{ all -> 0x08dd }
            r0 = r6
            X.1rh r0 = (X.C38961rh) r0     // Catch:{ all -> 0x08dd }
            java.lang.String r7 = r0.A01     // Catch:{ all -> 0x08dd }
            int r3 = r0.A00     // Catch:{ all -> 0x08dd }
            long r0 = r6.A13     // Catch:{ all -> 0x08dd }
            r9 = -1
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x06ae
            byte r1 = r6.A10     // Catch:{ all -> 0x08dd }
            r0 = 32
            if (r1 != r0) goto L_0x06a5
            java.lang.String r21 = ""
            r23 = 1
            X.1sy r4 = new X.1sy     // Catch:{ all -> 0x08dd }
            r25 = 0
            r26 = 0
            r20 = r4
            r22 = r7
            r24 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x08dd }
            X.0tq r0 = r8.A01     // Catch:{ all -> 0x08dd }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x08dd }
            goto L_0x0697
        L_0x0609:
            boolean r0 = r6 instanceof X.C38811rS     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0616
            X.17m r1 = r5.A1O     // Catch:{ all -> 0x08dd }
            r0 = r6
            X.1rS r0 = (X.C38811rS) r0     // Catch:{ all -> 0x08dd }
            r1.A03(r0)     // Catch:{ all -> 0x08dd }
            goto L_0x05a6
        L_0x0616:
            boolean r0 = r6 instanceof X.C38631rA     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x05b0
            X.17m r1 = r5.A1O     // Catch:{ all -> 0x08dd }
            r0 = r6
            X.1rA r0 = (X.C38631rA) r0     // Catch:{ all -> 0x08dd }
            r1.A05(r0)     // Catch:{ all -> 0x08dd }
            goto L_0x05b0
        L_0x0623:
            boolean r0 = r6 instanceof X.C30071bh     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0667
            r3 = r6
            X.1bh r3 = (X.C30071bh) r3     // Catch:{ all -> 0x08dd }
            boolean r0 = r3.A07     // Catch:{ all -> 0x08dd }
            if (r0 != 0) goto L_0x0660
            boolean r0 = r13.A02     // Catch:{ all -> 0x08dd }
            X.185 r7 = r5.A0c     // Catch:{ all -> 0x08dd }
            X.0sL r1 = r3.A02     // Catch:{ all -> 0x08dd }
            if (r0 != 0) goto L_0x063d
            com.whatsapp.jid.UserJid r0 = r3.A03     // Catch:{ all -> 0x08dd }
            long r0 = r7.A00(r1, r0)     // Catch:{ all -> 0x08dd }
            goto L_0x0649
        L_0x063d:
            X.1Vw r0 = r3.A11     // Catch:{ all -> 0x08dd }
            X.0rv r0 = r0.A00     // Catch:{ all -> 0x08dd }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ all -> 0x08dd }
            long r0 = r7.A01(r1, r0)     // Catch:{ all -> 0x08dd }
        L_0x0649:
            r8 = -1
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x0660
            X.0th r7 = r5.A0K     // Catch:{ all -> 0x08dd }
            X.0tZ r1 = r7.A00(r0)     // Catch:{ all -> 0x08dd }
            X.1bh r1 = (X.C30071bh) r1     // Catch:{ all -> 0x08dd }
            if (r1 == 0) goto L_0x0660
            r1.A07 = r4     // Catch:{ all -> 0x08dd }
            r0 = 21
            r5.A0e(r1, r0)     // Catch:{ all -> 0x08dd }
        L_0x0660:
            X.185 r0 = r5.A0c     // Catch:{ all -> 0x08dd }
            r0.A03(r3)     // Catch:{ all -> 0x08dd }
            goto L_0x059a
        L_0x0667:
            boolean r0 = r6 instanceof X.C30581cc     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x067b
            X.17j r3 = r5.A1M     // Catch:{ all -> 0x08dd }
            r1 = r6
            X.1cc r1 = (X.C30581cc) r1     // Catch:{ all -> 0x08dd }
            boolean r0 = r3.A04(r1)     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x059a
            r3.A02(r1, r2)     // Catch:{ all -> 0x08dd }
            goto L_0x059a
        L_0x067b:
            boolean r0 = r6 instanceof X.C39021rn     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0689
            X.17l r1 = r5.A0z     // Catch:{ all -> 0x08dd }
            r0 = r6
            X.1rn r0 = (X.C39021rn) r0     // Catch:{ all -> 0x08dd }
            r1.A01(r0)     // Catch:{ all -> 0x08dd }
            goto L_0x059a
        L_0x0689:
            boolean r0 = r6 instanceof X.C38791rQ     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x059a
            X.17n r1 = r5.A0b     // Catch:{ all -> 0x08dd }
            r0 = r6
            X.1rQ r0 = (X.C38791rQ) r0     // Catch:{ all -> 0x08dd }
            r1.A01(r0)     // Catch:{ all -> 0x08dd }
            goto L_0x059a
        L_0x0697:
            long r0 = r6.A13     // Catch:{ all -> 0x0824 }
            android.content.ContentValues r4 = X.C224517z.A00(r4, r0)     // Catch:{ all -> 0x0824 }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0824 }
            java.lang.String r0 = "message_template_button"
            r1.A02(r4, r0)     // Catch:{ all -> 0x0824 }
            goto L_0x06b7
        L_0x06a5:
            java.lang.String r0 = "only for template button reply message"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x08dd }
            r1.<init>(r0)     // Catch:{ all -> 0x08dd }
            goto L_0x08dc
        L_0x06ae:
            java.lang.String r0 = "main message part must be inserted before"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x08dd }
            r1.<init>(r0)     // Catch:{ all -> 0x08dd }
            goto L_0x08dc
        L_0x06b7:
            r3.close()     // Catch:{ all -> 0x08dd }
        L_0x06ba:
            boolean r0 = r6 instanceof X.C38771rO     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x06ca
            X.17p r3 = r5.A0w     // Catch:{ all -> 0x08dd }
            r1 = r6
            X.1rO r1 = (X.C38771rO) r1     // Catch:{ all -> 0x08dd }
            boolean r0 = r1.A00     // Catch:{ all -> 0x08dd }
            if (r0 != 0) goto L_0x06ca
            r3.A00(r1)     // Catch:{ all -> 0x08dd }
        L_0x06ca:
            boolean r4 = r6 instanceof X.AnonymousClass1WU     // Catch:{ all -> 0x08dd }
            if (r4 == 0) goto L_0x06dc
            X.17r r3 = r5.A1K     // Catch:{ all -> 0x08dd }
            r1 = r6
            X.1WU r1 = (X.AnonymousClass1WU) r1     // Catch:{ all -> 0x08dd }
            boolean r0 = r3.A02()     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x06dc
            r3.A01(r1)     // Catch:{ all -> 0x08dd }
        L_0x06dc:
            boolean r0 = r6 instanceof X.C38831rU     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x06e8
            X.17v r1 = r5.A18     // Catch:{ all -> 0x08dd }
            r0 = r6
            X.1rU r0 = (X.C38831rU) r0     // Catch:{ all -> 0x08dd }
            r1.A00(r0)     // Catch:{ all -> 0x08dd }
        L_0x06e8:
            boolean r0 = r6 instanceof X.C38971ri     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x06f8
            r3 = r6
            X.1ri r3 = (X.C38971ri) r3     // Catch:{ all -> 0x08dd }
            X.189 r7 = r5.A0W     // Catch:{ all -> 0x08dd }
            long r0 = r3.A13     // Catch:{ all -> 0x08dd }
            int r3 = r3.A00     // Catch:{ all -> 0x08dd }
            r7.A03(r3, r0, r2)     // Catch:{ all -> 0x08dd }
        L_0x06f8:
            boolean r0 = r6 instanceof X.C39231s8     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0708
            r3 = r6
            X.1s8 r3 = (X.C39231s8) r3     // Catch:{ all -> 0x08dd }
            X.189 r7 = r5.A0W     // Catch:{ all -> 0x08dd }
            long r0 = r3.A13     // Catch:{ all -> 0x08dd }
            int r3 = r3.A00     // Catch:{ all -> 0x08dd }
            r7.A03(r3, r0, r2)     // Catch:{ all -> 0x08dd }
        L_0x0708:
            boolean r0 = r6 instanceof X.C40191ti     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0718
            r3 = r6
            X.1ti r3 = (X.C40191ti) r3     // Catch:{ all -> 0x08dd }
            X.189 r7 = r5.A0W     // Catch:{ all -> 0x08dd }
            long r0 = r3.A13     // Catch:{ all -> 0x08dd }
            int r3 = r3.A00     // Catch:{ all -> 0x08dd }
            r7.A03(r3, r0, r2)     // Catch:{ all -> 0x08dd }
        L_0x0718:
            boolean r0 = r6 instanceof X.C40261tp     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0728
            r3 = r6
            X.1tp r3 = (X.C40261tp) r3     // Catch:{ all -> 0x08dd }
            X.189 r7 = r5.A0W     // Catch:{ all -> 0x08dd }
            long r0 = r6.A13     // Catch:{ all -> 0x08dd }
            int r3 = r3.A00     // Catch:{ all -> 0x08dd }
            r7.A03(r3, r0, r2)     // Catch:{ all -> 0x08dd }
        L_0x0728:
            boolean r0 = r6 instanceof X.C40281tr     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x073a
            r3 = r6
            X.1tr r3 = (X.C40281tr) r3     // Catch:{ all -> 0x08dd }
            X.189 r8 = r5.A0W     // Catch:{ all -> 0x08dd }
            long r0 = r6.A13     // Catch:{ all -> 0x08dd }
            int r7 = r3.A00     // Catch:{ all -> 0x08dd }
            int r3 = r6.A00     // Catch:{ all -> 0x08dd }
            r8.A03(r7, r0, r3)     // Catch:{ all -> 0x08dd }
        L_0x073a:
            boolean r0 = r6 instanceof X.C40201tj     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x074a
            r3 = r6
            X.1tj r3 = (X.C40201tj) r3     // Catch:{ all -> 0x08dd }
            X.189 r7 = r5.A0W     // Catch:{ all -> 0x08dd }
            long r0 = r6.A13     // Catch:{ all -> 0x08dd }
            int r3 = r3.A00     // Catch:{ all -> 0x08dd }
            r7.A03(r3, r0, r2)     // Catch:{ all -> 0x08dd }
        L_0x074a:
            boolean r0 = r6 instanceof X.C16840tj     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0758
            X.0vM r3 = r5.A0f     // Catch:{ all -> 0x08dd }
            r2 = r6
            X.0tj r2 = (X.C16840tj) r2     // Catch:{ all -> 0x08dd }
            long r0 = r6.A13     // Catch:{ all -> 0x08dd }
            r3.A0G(r2, r0)     // Catch:{ all -> 0x08dd }
        L_0x0758:
            boolean r0 = r6 instanceof X.C39041rp     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0764
            X.0vM r1 = r5.A0f     // Catch:{ all -> 0x08dd }
            r0 = r6
            X.1rp r0 = (X.C39041rp) r0     // Catch:{ all -> 0x08dd }
            r1.A0D(r0)     // Catch:{ all -> 0x08dd }
        L_0x0764:
            boolean r0 = r6 instanceof X.C39051rq     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0770
            X.0vM r1 = r5.A0f     // Catch:{ all -> 0x08dd }
            r0 = r6
            X.1rq r0 = (X.C39051rq) r0     // Catch:{ all -> 0x08dd }
            r1.A0A(r0)     // Catch:{ all -> 0x08dd }
        L_0x0770:
            boolean r0 = r6 instanceof X.C39001rl     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0786
            X.180 r3 = r5.A1P     // Catch:{ all -> 0x08dd }
            r2 = r6
            X.1rl r2 = (X.C39001rl) r2     // Catch:{ all -> 0x08dd }
            X.0tZ r2 = (X.C16740tZ) r2     // Catch:{ all -> 0x08dd }
            long r0 = r2.A13     // Catch:{ all -> 0x08dd }
            X.1rl r2 = (X.C39001rl) r2     // Catch:{ all -> 0x08dd }
            int r2 = r2.AGz()     // Catch:{ all -> 0x08dd }
            r3.A00(r0, r2)     // Catch:{ all -> 0x08dd }
        L_0x0786:
            boolean r0 = r6 instanceof X.C39061rr     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x07a2
            X.187 r8 = r5.A10     // Catch:{ all -> 0x08dd }
            r0 = r6
            X.1rr r0 = (X.C39061rr) r0     // Catch:{ all -> 0x08dd }
            long r2 = r0.A13     // Catch:{ all -> 0x08dd }
            int r7 = r0.A00     // Catch:{ all -> 0x08dd }
            long r0 = r0.A01     // Catch:{ all -> 0x08dd }
            java.lang.String r21 = "message_payment_invite"
            r20 = r8
            r22 = r7
            r23 = r2
            r25 = r0
            r20.A01(r21, r22, r23, r25)     // Catch:{ all -> 0x08dd }
        L_0x07a2:
            boolean r0 = r6 instanceof X.C39171s2     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x07b1
            X.17i r1 = r5.A12     // Catch:{ all -> 0x08dd }
            r0 = r6
            X.1s2 r0 = (X.C39171s2) r0     // Catch:{ all -> 0x08dd }
            r1.A01(r0)     // Catch:{ all -> 0x08dd }
            r1.A02(r0)     // Catch:{ all -> 0x08dd }
        L_0x07b1:
            byte[] r0 = r6.A1F     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x07bf
            X.17o r3 = r5.A0s     // Catch:{ all -> 0x08dd }
            long r0 = r6.A13     // Catch:{ all -> 0x08dd }
            byte[] r2 = r6.A1F     // Catch:{ all -> 0x08dd }
            r3.A00(r2, r0)     // Catch:{ all -> 0x08dd }
            goto L_0x07d2
        L_0x07bf:
            boolean r0 = X.AnonymousClass1H2.A01(r6)     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x07d2
            X.0t9 r1 = r5.A1V     // Catch:{ all -> 0x08dd }
            X.0w1 r0 = r5.A06     // Catch:{ all -> 0x08dd }
            X.0w2 r0 = r0.A09     // Catch:{ all -> 0x08dd }
            int r0 = X.C18020w1.A02(r0, r6)     // Catch:{ all -> 0x08dd }
            X.AnonymousClass1H2.A00(r1, r15, r0)     // Catch:{ all -> 0x08dd }
        L_0x07d2:
            if (r4 != 0) goto L_0x082d
            byte r1 = r6.A10     // Catch:{ all -> 0x08dd }
            r0 = 10
            if (r1 == r0) goto L_0x082d
            boolean r0 = r13.A02     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x07ea
            com.whatsapp.jid.DeviceJid r0 = r6.A19     // Catch:{ all -> 0x08dd }
            if (r0 != 0) goto L_0x07ea
            X.0sK r0 = r5.A05     // Catch:{ all -> 0x08dd }
            r0.A0B()     // Catch:{ all -> 0x08dd }
            X.1Za r1 = r0.A04     // Catch:{ all -> 0x08dd }
            goto L_0x07ec
        L_0x07ea:
            com.whatsapp.jid.DeviceJid r1 = r6.A19     // Catch:{ all -> 0x08dd }
        L_0x07ec:
            if (r1 == 0) goto L_0x082d
            X.14v r0 = r5.A0g     // Catch:{ all -> 0x08dd }
            long r7 = r0.A01(r1)     // Catch:{ all -> 0x08dd }
            r1 = -1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x082d
            X.17K r2 = r5.A0o     // Catch:{ all -> 0x08dd }
            long r0 = r6.A13     // Catch:{ all -> 0x08dd }
            X.0tq r2 = r2.A01     // Catch:{ all -> 0x08dd }
            X.0tf r3 = r2.A02()     // Catch:{ all -> 0x08dd }
            r4 = 2
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0824 }
            r2.<init>(r4)     // Catch:{ all -> 0x0824 }
            java.lang.String r4 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0824 }
            r2.put(r4, r0)     // Catch:{ all -> 0x0824 }
            java.lang.String r1 = "author_device_jid"
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0824 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0824 }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0824 }
            java.lang.String r0 = "message_details"
            r1.A02(r2, r0)     // Catch:{ all -> 0x0824 }
            goto L_0x082a
        L_0x0824:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x08ca }
            goto L_0x08ca
        L_0x082a:
            r3.close()     // Catch:{ all -> 0x08dd }
        L_0x082d:
            X.0vN r3 = r5.A0T     // Catch:{ all -> 0x08dd }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x08dd }
            long r0 = r0 - r11
            java.lang.String r2 = "CoreMessageStore/insertExtraTablesMessage"
            r3.A00(r2, r0)     // Catch:{ all -> 0x08dd }
            X.17q r0 = r5.A16     // Catch:{ all -> 0x08dd }
            r0.A01(r6)     // Catch:{ all -> 0x08dd }
            X.17N r8 = r5.A0h     // Catch:{ all -> 0x08dd }
            X.11I r4 = r8.A04     // Catch:{ all -> 0x08dd }
            java.lang.String r2 = "links_ready"
            r0 = 0
            long r9 = r4.A01(r2, r0)     // Catch:{ all -> 0x08dd }
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x086d
            boolean r0 = X.C16030sJ.A0Q(r27)     // Catch:{ all -> 0x08dd }
            if (r0 != 0) goto L_0x086d
            java.lang.String r7 = X.AnonymousClass17N.A00(r6)     // Catch:{ all -> 0x08dd }
            if (r7 == 0) goto L_0x086d
            X.17M r0 = r8.A05     // Catch:{ all -> 0x08dd }
            X.1yv r4 = new X.1yv     // Catch:{ all -> 0x08dd }
            r4.<init>(r8, r6)     // Catch:{ all -> 0x08dd }
            X.1WA r2 = r0.A00     // Catch:{ all -> 0x08dd }
            r1 = 43
            com.facebook.redex.RunnableRunnableShape0S1100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1100000_I0     // Catch:{ all -> 0x08dd }
            r0.<init>(r1, r7, r4)     // Catch:{ all -> 0x08dd }
            r2.execute(r0)     // Catch:{ all -> 0x08dd }
        L_0x086d:
            r0 = 16384(0x4000, float:2.2959E-41)
            boolean r0 = r6.A10(r0)     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0882
            boolean r0 = r6.A0x     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x0882
            X.10G r1 = r5.A1F     // Catch:{ all -> 0x08dd }
            java.util.Set r0 = java.util.Collections.singleton(r6)     // Catch:{ all -> 0x08dd }
            r1.A01(r0)     // Catch:{ all -> 0x08dd }
        L_0x0882:
            java.util.List r1 = r6.A0q     // Catch:{ all -> 0x08dd }
            if (r1 == 0) goto L_0x08a2
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x08dd }
            if (r0 != 0) goto L_0x08a2
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x08dd }
        L_0x0890:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x08dd }
            if (r0 == 0) goto L_0x08a2
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x08dd }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x08dd }
            X.14v r0 = r5.A0g     // Catch:{ all -> 0x08dd }
            r0.A01(r1)     // Catch:{ all -> 0x08dd }
            goto L_0x0890
        L_0x08a2:
            X.17w r0 = r5.A0l     // Catch:{ all -> 0x08dd }
            r0.A00(r6)     // Catch:{ all -> 0x08dd }
            X.17F r0 = r5.A0a     // Catch:{ all -> 0x08dd }
            r0.A0O(r6)     // Catch:{ all -> 0x08dd }
            r18.A00()     // Catch:{ all -> 0x08dd }
            r18.close()     // Catch:{ all -> 0x08e2 }
            r19.close()
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r16
            java.lang.String r0 = "CoreMessageStore/insertMessage"
            r3.A00(r0, r1)
            return
        L_0x08c1:
            r0 = move-exception
            r24.close()     // Catch:{ all -> 0x08c5 }
        L_0x08c5:
            throw r0     // Catch:{ all -> 0x08c6 }
        L_0x08c6:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x08ca }
        L_0x08ca:
            throw r0     // Catch:{ all -> 0x08dd }
        L_0x08cb:
            java.lang.String r1 = "PaymentTransactionStore"
            java.lang.String r0 = "updateMessageTransactionId transaction info is null"
            java.lang.String r0 = X.AnonymousClass1Vo.A01(r1, r0)     // Catch:{ all -> 0x08dd }
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x08dd }
            r1.<init>(r0)     // Catch:{ all -> 0x08dd }
            goto L_0x08dc
        L_0x08da:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x08dd }
        L_0x08dc:
            throw r1     // Catch:{ all -> 0x08dd }
        L_0x08dd:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x08e1 }
        L_0x08e1:
            throw r0     // Catch:{ all -> 0x08e2 }
        L_0x08e2:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x08e6 }
        L_0x08e6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0X(X.0tZ):void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:313:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013a  */
    public void A0Y(X.C16740tZ r24) {
        /*
            r23 = this;
            r6 = r24
            X.1Vw r10 = r6.A11
            X.0rv r5 = r10.A00
            if (r5 == 0) goto L_0x0018
            r4 = r23
            X.0rt r11 = r4.A0O
            X.0rx r3 = r11.A06(r5)
            if (r3 != 0) goto L_0x0019
            boolean r0 = X.C38621r6.A0k(r6)
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            byte r9 = r6.A10
            r0 = 8
            if (r9 == r0) goto L_0x0018
            boolean r0 = r6 instanceof X.C39131ry
            if (r0 != 0) goto L_0x0018
            r8 = 0
            r1 = 1
            r0 = 0
            if (r3 == 0) goto L_0x0029
            r0 = 1
        L_0x0029:
            boolean r21 = X.C38621r6.A0w(r6, r0)
            r0 = 10
            if (r9 != r0) goto L_0x020c
            r7 = 0
            r20 = 1
        L_0x0034:
            r18 = 0
            r17 = 0
        L_0x0038:
            boolean r13 = r6 instanceof X.AnonymousClass1WU
            r12 = 11
            if (r13 == 0) goto L_0x0206
            r0 = r6
            X.1WU r0 = (X.AnonymousClass1WU) r0
            int r2 = r0.A00
            r0 = 9
            if (r2 == r0) goto L_0x01fa
            if (r2 == r12) goto L_0x01fa
            if (r2 != r1) goto L_0x01f1
            java.lang.String r1 = r6.A0I()
        L_0x004f:
            r12 = 0
        L_0x0050:
            r16 = 0
        L_0x0052:
            X.0sK r0 = r4.A05
            boolean r0 = X.C38621r6.A0U(r0, r6)
            r19 = 1
            if (r0 != 0) goto L_0x005e
        L_0x005c:
            r19 = 0
        L_0x005e:
            X.0sK r2 = r4.A05
            X.17e r14 = r4.A0D
            X.0rz r0 = r4.A0G
            r22 = r0
            boolean r0 = A01(r2, r14, r0, r3, r6)
            if (r0 == 0) goto L_0x01ed
            r3.A0e = r8
        L_0x006e:
            boolean r0 = X.C38621r6.A0R(r2, r6)
            if (r0 == 0) goto L_0x0077
            r0 = 1
            r3.A0h = r0
        L_0x0077:
            r8 = 1
        L_0x0078:
            X.0pd r14 = r4.A1U
            boolean r0 = X.C38621r6.A0d(r6)
            if (r0 != 0) goto L_0x01ea
            boolean r0 = r6 instanceof X.C38971ri
            if (r0 != 0) goto L_0x01ea
            boolean r0 = r6 instanceof X.C39231s8
            if (r0 != 0) goto L_0x01ea
            boolean r0 = r6 instanceof X.C30071bh
            if (r0 == 0) goto L_0x0090
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x01ea
        L_0x0090:
            boolean r0 = X.C38621r6.A0w(r6, r8)
            if (r0 == 0) goto L_0x01ea
            if (r13 == 0) goto L_0x00d8
            r0 = r6
            X.1WU r0 = (X.AnonymousClass1WU) r0
            int r8 = r0.A00
            r0 = 4
            if (r8 == r0) goto L_0x01cb
            r0 = 5
            if (r8 == r0) goto L_0x01ea
            r0 = 6
            if (r8 == r0) goto L_0x01ea
            r0 = 7
            if (r8 == r0) goto L_0x01cb
            r0 = 20
            if (r8 == r0) goto L_0x01b9
            r0 = 21
            if (r8 == r0) goto L_0x01ea
            r0 = 79
            if (r8 == r0) goto L_0x01b9
            r0 = 80
            if (r8 == r0) goto L_0x01ea
            r0 = 86
            if (r8 == r0) goto L_0x01ea
            r0 = 87
            if (r8 == r0) goto L_0x01ea
            r0 = 93
            if (r8 == r0) goto L_0x01ea
            r0 = 94
            if (r8 == r0) goto L_0x01ea
            switch(r8) {
                case 10: goto L_0x01ea;
                case 37: goto L_0x01ea;
                case 39: goto L_0x01ea;
                case 44: goto L_0x01ea;
                case 56: goto L_0x01ea;
                case 59: goto L_0x01ea;
                case 68: goto L_0x01ea;
                case 90: goto L_0x01b9;
                case 97: goto L_0x01a2;
                case 106: goto L_0x01b9;
                case 116: goto L_0x01ea;
                default: goto L_0x00cc;
            }
        L_0x00cc:
            switch(r8) {
                case 12: goto L_0x01b9;
                case 13: goto L_0x01b9;
                case 14: goto L_0x01b9;
                case 15: goto L_0x01ea;
                case 16: goto L_0x01ea;
                default: goto L_0x00cf;
            }
        L_0x00cf:
            switch(r8) {
                case 27: goto L_0x01ea;
                case 28: goto L_0x01ea;
                case 29: goto L_0x01ea;
                case 30: goto L_0x01ea;
                case 31: goto L_0x01ea;
                case 32: goto L_0x01ea;
                default: goto L_0x00d2;
            }
        L_0x00d2:
            switch(r8) {
                case 51: goto L_0x01ea;
                case 52: goto L_0x01b9;
                case 53: goto L_0x01ea;
                case 54: goto L_0x01ea;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            switch(r8) {
                case 73: goto L_0x01ea;
                case 74: goto L_0x01ea;
                case 75: goto L_0x01d4;
                case 76: goto L_0x01ea;
                default: goto L_0x00d8;
            }
        L_0x00d8:
            r15 = 1
        L_0x00d9:
            boolean r14 = X.C38621r6.A0S(r2, r6)
            r8 = -1
            if (r14 == 0) goto L_0x00e1
            r8 = 1
        L_0x00e1:
            if (r3 != 0) goto L_0x0183
            X.14s r14 = r4.A1j
            java.util.List r0 = r14.A01()
            if (r0 == 0) goto L_0x0125
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0125
            java.util.List r8 = r14.A01()
            if (r8 == 0) goto L_0x0177
            boolean r0 = r8.contains(r5)
            if (r0 == 0) goto L_0x0177
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r8)
            r3.remove(r5)
            java.lang.String r0 = ","
            java.lang.String r8 = android.text.TextUtils.join(r0, r3)
            X.11I r3 = r14.A05
            java.lang.String r0 = "call_not_spam_jids"
            r3.A06(r0, r8)
            java.lang.String r0 = "spamManager/removeCallNotSpamProp/true: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r3.append(r8)
        L_0x011d:
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8 = 1
        L_0x0125:
            r0 = 1
            if (r21 == 0) goto L_0x04a9
            X.0rx r3 = new X.0rx
            r3.<init>(r5)
            r11.A0D(r3, r5)
            r3.A03 = r8
            r3.A00 = r0
        L_0x0134:
            if (r1 == 0) goto L_0x0138
            r3.A0d = r1
        L_0x0138:
            if (r15 == 0) goto L_0x013e
            long r0 = r6.A0I
            r3.A0V = r0
        L_0x013e:
            if (r21 == 0) goto L_0x014a
            r3.A0Z = r6
            long r0 = r6.A13
            r3.A0S = r0
            long r0 = r6.A14
            r3.A0T = r0
        L_0x014a:
            if (r7 == 0) goto L_0x0154
            long r0 = r6.A13
            r3.A0N = r0
            long r0 = r6.A14
            r3.A0O = r0
        L_0x0154:
            long r0 = r3.A0P
            r7 = 0
            int r11 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0168
            long r0 = r6.A13
            r14 = 1
            long r0 = r0 - r14
            r3.A0P = r0
            long r0 = r6.A14
            long r0 = r0 - r14
            r3.A0Q = r0
        L_0x0168:
            X.0t3 r0 = r4.A0F
            r21 = r0
            long r0 = r21.A00()
            r11 = 0
            monitor-enter(r3)
            r14 = 1
            if (r17 == 0) goto L_0x0279
            goto L_0x026c
        L_0x0177:
            java.lang.String r0 = "spamManager/removeCallNotSpamProp/false/not spam jids: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r3.append(r8)
            goto L_0x011d
        L_0x0183:
            int r8 = r3.A03
            r0 = -1
            if (r8 == r0) goto L_0x018d
            r0 = -2
            if (r8 == r0) goto L_0x018d
            if (r8 != 0) goto L_0x0134
        L_0x018d:
            if (r14 == 0) goto L_0x0134
            if (r16 != 0) goto L_0x0134
            r0 = 1
            r3.A03 = r0
            X.17E r0 = r4.A0e
            android.os.Handler r8 = r0.A02
            r0 = 12
            android.os.Message r0 = android.os.Message.obtain(r8, r0, r6)
            r0.sendToTarget()
            goto L_0x0134
        L_0x01a2:
            boolean r0 = r6 instanceof X.C39491sZ
            if (r0 == 0) goto L_0x00d8
            r0 = r6
            X.1sZ r0 = (X.C39491sZ) r0
            boolean r0 = r0.A01
            r8 = 2787(0xae3, float:3.905E-42)
            if (r0 == 0) goto L_0x01b1
            r8 = 2788(0xae4, float:3.907E-42)
        L_0x01b1:
            X.0tM r0 = X.C16620tM.A02
            boolean r15 = r14.A0E(r0, r8)
            goto L_0x00d9
        L_0x01b9:
            r0 = r6
            X.1sE r0 = (X.C39291sE) r0
            java.util.List r8 = r0.A01
            r2.A0B()
            X.1ZT r0 = r2.A05
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r8.contains(r0)
            goto L_0x01e8
        L_0x01cb:
            X.0rv r0 = r6.A0B()
            boolean r0 = r2.A0I(r0)
            goto L_0x01e8
        L_0x01d4:
            boolean r0 = r6 instanceof X.C39431sT
            if (r0 == 0) goto L_0x00d8
            r14 = r6
            X.1sT r14 = (X.C39431sT) r14
            java.lang.Integer r0 = r14.A02
            if (r0 == 0) goto L_0x00d8
            int r8 = r0.intValue()
            r0 = 2
            if (r8 != r0) goto L_0x00d8
            int r0 = r14.A00
        L_0x01e8:
            if (r0 != 0) goto L_0x00d8
        L_0x01ea:
            r15 = 0
            goto L_0x00d9
        L_0x01ed:
            if (r3 == 0) goto L_0x0078
            goto L_0x006e
        L_0x01f1:
            r0 = 5
            r1 = 0
            if (r2 != r0) goto L_0x004f
            r12 = 0
            r16 = 1
            goto L_0x0052
        L_0x01fa:
            long r0 = r6.A0I
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r6.A0I()
            goto L_0x0050
        L_0x0206:
            r1 = 0
            r12 = 0
            r16 = 0
            goto L_0x005c
        L_0x020c:
            int r0 = r11.A00(r5)
            if (r0 > 0) goto L_0x022b
            X.12E r0 = r4.A01
            X.1yO r0 = r0.A00()
            boolean r0 = r0.A01(r5)
            if (r0 == 0) goto L_0x022b
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x0229
            r0 = 13
            r6.A0W(r0)
            r6.A1E = r1
        L_0x0229:
            r6.A0u = r1
        L_0x022b:
            boolean r7 = r6.A0u
            if (r7 != 0) goto L_0x0268
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0250
            X.17k r0 = r4.A1k
            boolean r0 = r0.A00(r6)
            if (r0 != 0) goto L_0x0250
            boolean r0 = r6 instanceof X.AnonymousClass1WU
            if (r0 == 0) goto L_0x0268
            r0 = r6
            X.1WU r0 = (X.AnonymousClass1WU) r0
            int r0 = r0.A00
            java.util.Set r2 = X.C40171tg.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0268
        L_0x0250:
            boolean r0 = X.C38621r6.A0j(r6)
            if (r0 != 0) goto L_0x0268
            X.0sK r0 = r4.A05
            boolean r0 = X.C38621r6.A0Q(r0, r6)
            r18 = 0
            if (r0 == 0) goto L_0x0262
            r18 = 1
        L_0x0262:
            r20 = 0
            r17 = 1
            goto L_0x0038
        L_0x0268:
            r20 = 0
            goto L_0x0034
        L_0x026c:
            int r15 = r3.A06     // Catch:{ all -> 0x04dc }
            if (r15 > 0) goto L_0x0275
            r3.A06 = r14     // Catch:{ all -> 0x04dc }
            r3.A0W = r0     // Catch:{ all -> 0x04dc }
            goto L_0x0279
        L_0x0275:
            int r0 = r15 + 1
            r3.A06 = r0     // Catch:{ all -> 0x04dc }
        L_0x0279:
            if (r18 == 0) goto L_0x0286
            int r0 = r3.A04     // Catch:{ all -> 0x04dc }
            if (r0 > 0) goto L_0x0282
            r3.A04 = r14     // Catch:{ all -> 0x04dc }
            goto L_0x0286
        L_0x0282:
            int r0 = r0 + 1
            r3.A04 = r0     // Catch:{ all -> 0x04dc }
        L_0x0286:
            if (r20 == 0) goto L_0x028e
            int r0 = r3.A07     // Catch:{ all -> 0x04dc }
            int r0 = r0 + 1
            r3.A07 = r0     // Catch:{ all -> 0x04dc }
        L_0x028e:
            int r0 = r3.A06     // Catch:{ all -> 0x04dc }
            if (r0 > 0) goto L_0x0296
            int r0 = r3.A07     // Catch:{ all -> 0x04dc }
            if (r0 <= 0) goto L_0x029c
        L_0x0296:
            int r0 = r3.A08     // Catch:{ all -> 0x04dc }
            int r0 = r0 + 1
            r3.A08 = r0     // Catch:{ all -> 0x04dc }
        L_0x029c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04dc }
            r1.<init>()     // Catch:{ all -> 0x04dc }
            java.lang.String r0 = "chatInfo/addUnseen/"
            r1.append(r0)     // Catch:{ all -> 0x04dc }
            java.lang.String r0 = r3.A07()     // Catch:{ all -> 0x04dc }
            r1.append(r0)     // Catch:{ all -> 0x04dc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04dc }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04dc }
            monitor-exit(r3)
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x02c8
            boolean r0 = r6.A1D
            if (r0 == 0) goto L_0x02c8
            int r0 = r3.A06
            if (r0 >= 0) goto L_0x02c8
            monitor-enter(r3)
            r0 = 0
            r3.A06 = r0     // Catch:{ all -> 0x04dc }
            r3.A0W = r7     // Catch:{ all -> 0x04dc }
            monitor-exit(r3)
        L_0x02c8:
            long r0 = r6.A13
            r3.A0L = r0
            long r0 = r6.A14
            r3.A0M = r0
            r3.A0Y = r11
            if (r17 == 0) goto L_0x02de
            boolean r0 = X.C38621r6.A0Q(r2, r6)
            if (r0 == 0) goto L_0x02de
            long r0 = r6.A13
            r3.A0J = r0
        L_0x02de:
            r0 = 36
            r17 = 1000(0x3e8, double:4.94E-321)
            if (r9 != r0) goto L_0x0474
            r1 = r6
            X.1ri r1 = (X.C38971ri) r1
            int r11 = r1.A00
            X.1Vw r0 = r1.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x046f
            X.1WV r0 = r3.A0X
            long r0 = r0.ephemeralSettingTimestamp
            long r0 = r0 + r17
            r2 = 0
        L_0x02f6:
            r3.A0A(r11, r0, r2)
        L_0x02f9:
            boolean r0 = r6 instanceof X.C40261tp
            if (r0 == 0) goto L_0x030e
            r0 = r6
            X.1tp r0 = (X.C40261tp) r0
            int r11 = r0.A00
            java.lang.Long r0 = r6.A0Y
            X.AnonymousClass00B.A06(r0)
            long r0 = r0.longValue()
            r3.A0A(r11, r0, r2)
        L_0x030e:
            boolean r0 = r6 instanceof X.C40281tr
            if (r0 == 0) goto L_0x0325
            r0 = r6
            X.1tr r0 = (X.C40281tr) r0
            int r14 = r0.A00
            java.lang.Long r0 = r6.A0Y
            X.AnonymousClass00B.A06(r0)
            long r0 = r0.longValue()
            int r11 = r6.A00
            r3.A0A(r14, r0, r11)
        L_0x0325:
            int r11 = r6.A04
            if (r11 <= 0) goto L_0x035c
            X.1WV r1 = r3.A0X
            int r0 = r1.expiration
            if (r11 != r0) goto L_0x035c
            java.lang.Long r14 = r6.A0Y
            if (r14 == 0) goto L_0x035c
            X.AnonymousClass00B.A06(r14)
            long r15 = r14.longValue()
            long r0 = r1.ephemeralSettingTimestamp
            int r11 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x035c
            long r14 = r14.longValue()
            long r0 = r6.A0I
            int r11 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x035c
            X.1WV r0 = r3.A0X
            int r14 = r0.expiration
            java.lang.Long r0 = r6.A0Y
            X.AnonymousClass00B.A06(r0)
            long r0 = r0.longValue()
            int r11 = r6.A00
            r3.A0A(r14, r0, r11)
        L_0x035c:
            boolean r0 = r6 instanceof X.C40191ti
            if (r0 == 0) goto L_0x046c
            r0 = r6
            X.1ti r0 = (X.C40191ti) r0
            int r0 = r0.A00
            r11 = 0
            r3.A0A(r0, r7, r2)
        L_0x0369:
            boolean r0 = r6 instanceof X.C39431sT
            if (r0 == 0) goto L_0x038d
            java.lang.String r0 = "msgstore/set group type"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r6
            X.1sT r0 = (X.C39431sT) r0
            int r7 = r0.A00
            int r1 = r0.A00
            r0 = 1
            if (r1 == r0) goto L_0x037d
            r11 = 1
        L_0x037d:
            r3.A01 = r7
            if (r7 != r0) goto L_0x038d
            if (r11 == 0) goto L_0x038d
            long r0 = r21.A00()
            long r0 = r0 / r17
            r3.A0G = r0
            r19 = 1
        L_0x038d:
            boolean r0 = r6 instanceof X.C40421u5
            if (r0 == 0) goto L_0x039b
            r1 = r6
            X.1u5 r1 = (X.C40421u5) r1
            boolean r0 = r1 instanceof X.C40451u9
            if (r0 == 0) goto L_0x0457
            r0 = 0
        L_0x0399:
            r3.A01 = r0
        L_0x039b:
            if (r13 == 0) goto L_0x0448
            r0 = r6
            X.1WU r0 = (X.AnonymousClass1WU) r0
            int r1 = r0.A00
            r0 = 11
            if (r1 != r0) goto L_0x0448
            boolean r0 = r5 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0448
            r8 = r5
            com.whatsapp.jid.GroupJid r8 = (com.whatsapp.jid.GroupJid) r8
            X.17D r11 = r4.A09
            android.content.SharedPreferences r7 = r11.A00()
            java.lang.String r0 = "create_"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r8.getRawString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            int r13 = r7.getInt(r0, r2)
            java.lang.String r1 = "CommunitySharedPrefs/getTempGroupType()/groupType = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.SharedPreferences r14 = r11.A00()
            java.lang.String r7 = "closed_"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            java.lang.String r0 = r8.getRawString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            boolean r2 = r14.getBoolean(r0, r2)
            java.lang.String r1 = "CommunitySharedPrefs/getTempGroupType()/isClosed = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "msgstore/updateChatsListForNewMessage/set group type = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.A01 = r13
            if (r2 == 0) goto L_0x0421
            r3.A0g = r2
            X.15m r0 = r4.A0P
            r0.A00(r3)
        L_0x0421:
            r11.A01(r8)
            java.lang.String r0 = "CommunitySharedPrefs/clearTempIsClosed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.SharedPreferences r0 = r11.A00()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            java.lang.String r0 = r8.getRawString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.content.SharedPreferences$Editor r0 = r2.remove(r0)
            r0.apply()
        L_0x0448:
            if (r19 == 0) goto L_0x048c
            java.lang.String r0 = "msgstore/community activity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = r21.A00()
            long r0 = r0 / r17
            monitor-enter(r3)
            goto L_0x0477
        L_0x0457:
            boolean r0 = r1 instanceof X.C40441u8
            if (r0 == 0) goto L_0x045e
            r0 = 1
            goto L_0x0399
        L_0x045e:
            boolean r0 = r1 instanceof X.AnonymousClass1u6
            if (r0 != 0) goto L_0x0469
            boolean r0 = r1 instanceof X.C40431u7
            if (r0 == 0) goto L_0x0469
            r0 = 3
            goto L_0x0399
        L_0x0469:
            r0 = 2
            goto L_0x0399
        L_0x046c:
            r11 = 0
            goto L_0x0369
        L_0x046f:
            r2 = 0
            long r0 = r1.A0I
            goto L_0x02f6
        L_0x0474:
            r2 = 0
            goto L_0x02f9
        L_0x0477:
            r3.A0I = r0     // Catch:{ all -> 0x04dc }
            monitor-exit(r3)
            android.content.SharedPreferences$Editor r7 = r22.A0K()
            java.lang.String r2 = "last_community_activity"
            android.content.SharedPreferences$Editor r0 = r7.putLong(r2, r0)
            r0.apply()
            X.15m r0 = r4.A0P
            r0.A00(r3)
        L_0x048c:
            X.0ts r1 = r4.A0N
            android.content.ContentValues r0 = r3.A04(r12)
            boolean r0 = r1.A0I(r0, r3)
            if (r0 != 0) goto L_0x04a9
            java.lang.String r1 = "msgstore/addmsg/chatlist/insert/failed gid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x04a9:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0018
            int r1 = r6.A0C
            r0 = 6
            if (r1 == r0) goto L_0x0018
            X.151 r8 = r4.A0Z
            java.util.Map r2 = r8.A02()
            X.1y8 r1 = new X.1y8
            r1.<init>(r5, r9)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            r12 = 1
            if (r0 != 0) goto L_0x04d5
            r0 = 1
        L_0x04c7:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r2.put(r1, r10)
            X.0tq r0 = r8.A05
            X.0tf r7 = r0.A02()
            goto L_0x04df
        L_0x04d5:
            int r0 = r0.intValue()
            int r0 = r0 + 1
            goto L_0x04c7
        L_0x04dc:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x04df:
            X.1cj r13 = r7.A00()     // Catch:{ all -> 0x0526 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0521 }
            r11.<init>(r12)     // Catch:{ all -> 0x0521 }
            java.lang.String r0 = "message_count"
            r11.put(r0, r10)     // Catch:{ all -> 0x0521 }
            X.0tg r6 = r7.A02     // Catch:{ all -> 0x0521 }
            java.lang.String r4 = "frequents"
            java.lang.String r3 = "jid = ? AND type = ?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0521 }
            java.lang.String r0 = r5.getRawString()     // Catch:{ all -> 0x0521 }
            r1 = 0
            r2[r1] = r0     // Catch:{ all -> 0x0521 }
            java.lang.String r0 = java.lang.Byte.toString(r9)     // Catch:{ all -> 0x0521 }
            r2[r12] = r0     // Catch:{ all -> 0x0521 }
            int r0 = r6.A00(r4, r11, r3, r2)     // Catch:{ all -> 0x0521 }
            if (r0 != 0) goto L_0x0510
            int r0 = r10.intValue()     // Catch:{ all -> 0x0521 }
            X.AnonymousClass151.A00(r7, r5, r9, r0)     // Catch:{ all -> 0x0521 }
        L_0x0510:
            int r0 = r10.intValue()     // Catch:{ all -> 0x0521 }
            r8.A05(r5, r9, r0, r1)     // Catch:{ all -> 0x0521 }
            r13.A00()     // Catch:{ all -> 0x0521 }
            r13.close()     // Catch:{ all -> 0x0526 }
            r7.close()
            return
        L_0x0521:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x0525 }
        L_0x0525:
            throw r0     // Catch:{ all -> 0x0526 }
        L_0x0526:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x052a }
        L_0x052a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0Y(X.0tZ):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00e4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00ee */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Z(X.C16740tZ r20) {
        /*
            r19 = this;
            long r17 = android.os.SystemClock.uptimeMillis()
            r0 = 1
            r9 = r20
            r9.A0X(r0)
            r8 = r19
            X.0tq r0 = r8.A0v
            X.0tf r16 = r0.A02()
            X.1cj r15 = r16.A00()     // Catch:{ all -> 0x00ef }
            X.17G r10 = r8.A0j     // Catch:{ all -> 0x00ea }
            long r2 = r9.A13     // Catch:{ all -> 0x00ea }
            int r4 = r9.A07     // Catch:{ all -> 0x00ea }
            X.0tq r5 = r10.A05     // Catch:{ all -> 0x00ea }
            X.0tf r7 = r5.A02()     // Catch:{ all -> 0x00ea }
            X.1cj r14 = r7.A00()     // Catch:{ all -> 0x00e5 }
            r5.A04()     // Catch:{ all -> 0x00e0 }
            X.1jC r0 = r5.A04     // Catch:{ all -> 0x00e0 }
            boolean r0 = r0.A0D(r7)     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x0070
            X.0tf r6 = r5.A02()     // Catch:{ all -> 0x00e0 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x00b3 }
            r13.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "message_add_on_flags"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00b3 }
            r13.put(r1, r0)     // Catch:{ all -> 0x00b3 }
            java.lang.String r12 = "_id = ?"
            r0 = 1
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x00b3 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00b3 }
            r11[r1] = r0     // Catch:{ all -> 0x00b3 }
            X.0tg r1 = r6.A02     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "messages"
            int r0 = r1.A00(r0, r13, r12, r11)     // Catch:{ all -> 0x00b3 }
            if (r0 != 0) goto L_0x006d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r1.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "MainMessageStore/updateMessageAddOnFlagsByRowIdV1/did not update; message.rowId="
            r1.append(r0)     // Catch:{ all -> 0x00b3 }
            r1.append(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00b3 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00b3 }
        L_0x006d:
            r6.close()     // Catch:{ all -> 0x00e0 }
        L_0x0070:
            boolean r0 = r10.A08()     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x00bb
            X.0tf r6 = r5.A02()     // Catch:{ all -> 0x00e0 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x00b3 }
            r12.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "message_add_on_flags"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00b3 }
            r12.put(r1, r0)     // Catch:{ all -> 0x00b3 }
            X.0tg r11 = r6.A02     // Catch:{ all -> 0x00b3 }
            java.lang.String r10 = "message"
            java.lang.String r5 = "_id = ?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x00b3 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00b3 }
            r4[r1] = r0     // Catch:{ all -> 0x00b3 }
            int r0 = r11.A00(r10, r12, r5, r4)     // Catch:{ all -> 0x00b3 }
            if (r0 != 0) goto L_0x00b8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r1.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "MainMessageStore/updateMessageAddOnFlagsByRowIdV2/update failed; message.rowId="
            r1.append(r0)     // Catch:{ all -> 0x00b3 }
            r1.append(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00b3 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x00b8
        L_0x00b3:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            throw r0     // Catch:{ all -> 0x00e0 }
        L_0x00b8:
            r6.close()     // Catch:{ all -> 0x00e0 }
        L_0x00bb:
            r14.A00()     // Catch:{ all -> 0x00e0 }
            r14.close()     // Catch:{ all -> 0x00e5 }
            r7.close()     // Catch:{ all -> 0x00ea }
            r15.A00()     // Catch:{ all -> 0x00ea }
            X.17H r0 = r8.A0n     // Catch:{ all -> 0x00ea }
            r0.A02(r9)     // Catch:{ all -> 0x00ea }
            r15.close()     // Catch:{ all -> 0x00ef }
            r16.close()
            X.0vN r3 = r8.A0T
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r17
            java.lang.String r0 = "CoreMessageStore/updateMessageForMessageAddOnOnCurrentThread"
            r3.A00(r0, r1)
            return
        L_0x00e0:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            throw r0     // Catch:{ all -> 0x00e5 }
        L_0x00e5:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            throw r0     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x00ee }
        L_0x00ee:
            throw r0     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r0 = move-exception
            r16.close()     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0Z(X.0tZ):void");
    }

    public void A0a(C16740tZ r6) {
        if (r6.A13 < 0) {
            StringBuilder sb = new StringBuilder("CoreMessageStore/updateMessageAsync/message must have row_id set; key=");
            sb.append(r6.A11);
            AnonymousClass00B.A08(sb.toString());
        }
        A0e(r6, -1);
    }

    public void A0b(C16740tZ r5) {
        C16740tZ A0D2 = r5.A0D();
        boolean z2 = true;
        boolean z3 = false;
        if (A0D2 != null) {
            z3 = true;
        }
        AnonymousClass00B.A0G(z3);
        int A082 = A0D2.A08();
        if (A082 != 2) {
            z2 = false;
        }
        StringBuilder sb = new StringBuilder("coremessagestore/updatemessagequote/quoted message type: ");
        sb.append(A082);
        AnonymousClass00B.A0D(sb.toString(), z2);
        this.A0H.A01(new RunnableRunnableShape6S0200000_I0_4(this, 23, r5), 21);
    }

    public synchronized void A0c(C16740tZ r14) {
        C28401Vy r0;
        AnonymousClass1Vt r02 = r14.A0L;
        if (r02 != null && !TextUtils.isEmpty(r02.A0M)) {
            C18290wS r03 = this.A1f;
            r03.A06();
            C221116r r6 = r03.A08;
            AnonymousClass1Vt A0M2 = r6.A0M(r14.A0L.A0M, (String) null);
            if (A0M2 != null) {
                C16740tZ A0H2 = A0H(A0M2);
                if (r14.A0L.A0A()) {
                    int i2 = A0M2.A02;
                    C28401Vy r3 = r14.A0L.A08;
                    if (!(i2 == 18 || (r0 = A0M2.A08) == null || !r0.equals(r3))) {
                        if (A0H2 != null) {
                            if (r14.A0L.A0F()) {
                                A0M2.A02 = 17;
                                A0M2.A06 = this.A0F.A00();
                                A0H2.A0L = A0M2;
                            }
                            C28381Vw r8 = A0H2.A11;
                            AnonymousClass1Vt r7 = A0H2.A0L;
                            AnonymousClass00B.A06(r7);
                            if (r6.A0m(r7, r8, i2, 0, 0)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("msgStore/markPaymentRequestMessageFulfilled request message id: ");
                                sb.append(A0M2.A0L);
                                Log.i(AnonymousClass1Vo.A01("CoreMessageStore", sb.toString()));
                                this.A0e.A00(A0H2, 16);
                            }
                        } else {
                            if (r14.A0L.A0F()) {
                                A0M2.A02 = 17;
                                A0M2.A06 = this.A0F.A00();
                            }
                            if (r6.A0j(A0M2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("msgStore/markPaymentRequestMessageFulfilled/ request message id: ");
                                sb2.append(A0M2.A0L);
                                Log.i(AnonymousClass1Vo.A01("CoreMessageStore", sb2.toString()));
                                AnonymousClass107 r32 = this.A1d;
                                r32.A0B.Acl(new RunnableRunnableShape9S0200000_I0_7(r32, 13, A0M2));
                            }
                        }
                    }
                } else if (A0H2 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("msgStore/markPaymentRequestMessageFulfilled/ request message id: ");
                    sb3.append(A0M2.A0L);
                    sb3.append(" status: ");
                    sb3.append(r14.A0L.A02);
                    Log.i(AnonymousClass1Vo.A01("CoreMessageStore", sb3.toString()));
                    this.A0e.A00(A0H2, 16);
                }
                this.A0a.A0O(A0H2);
            }
        }
    }

    public void A0d(C16740tZ r6, int i2) {
        C18020w1 r1 = this.A06;
        if (r1.A0M) {
            r1.A0E.A05(r6.A11.A01.hashCode(), 4, -1, r6.A10);
        }
        this.A0H.A01(new RunnableRunnableShape0S0201000_I0((Object) this, i2, (Object) r6, 18), 26);
    }

    public void A0e(C16740tZ r4, int i2) {
        this.A0H.A01(new RunnableRunnableShape0S0201000_I0((Object) this, i2, (Object) r4, 19), 22);
    }

    public final void A0f(C16740tZ r8, int i2) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.A04.A0K(new RunnableRunnableShape0S0301000_I0(this, r8, countDownLatch, i2, 6));
        try {
            countDownLatch.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Log.e((Throwable) e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01de, code lost:
        if (r7.A14 > r4.A02) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01ee, code lost:
        if (r7.A14 != r4.A04) goto L_0x01f7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:176:0x0267 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:181:0x026c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:262:0x03ae */
    /* JADX WARNING: Missing exception handler attribute for start block: B:267:0x03b3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0g(X.C16740tZ r19, int r20, boolean r21) {
        /*
            r18 = this;
            r7 = r19
            int r3 = r7.A08()
            r8 = 0
            r6 = 1
            r2 = 0
            if (r3 != r6) goto L_0x000c
            r2 = 1
        L_0x000c:
            java.lang.String r1 = "Should only delete message marked as MAIN; storageType="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A0B(r0, r2)
            r0 = r20 & 1
            r9 = 0
            if (r0 != r6) goto L_0x0023
            r9 = 1
        L_0x0023:
            r1 = r20 & 4
            r0 = 4
            r17 = 0
            if (r1 != r0) goto L_0x002c
            r17 = 1
        L_0x002c:
            r5 = r18
            X.0tq r10 = r5.A0v     // Catch:{ SQLiteDoneException -> 0x03c3, SQLiteDatabaseCorruptException -> 0x03b9, Error | RuntimeException -> 0x03b4 }
            X.0tf r14 = r10.A02()     // Catch:{ SQLiteDoneException -> 0x03c3, SQLiteDatabaseCorruptException -> 0x03b9, Error | RuntimeException -> 0x03b4 }
            X.1cj r16 = r14.A00()     // Catch:{ all -> 0x03af }
            X.17H r0 = r5.A0n     // Catch:{ all -> 0x03aa }
            X.1Vw r2 = r7.A11     // Catch:{ all -> 0x03aa }
            r0.A03(r2)     // Catch:{ all -> 0x03aa }
            r7.A15 = r6     // Catch:{ all -> 0x03aa }
            byte r1 = r7.A10     // Catch:{ all -> 0x03aa }
            boolean r0 = X.C38621r6.A0N(r1)     // Catch:{ all -> 0x03aa }
            if (r0 != 0) goto L_0x004f
            boolean r0 = X.C30921dB.A00(r1)     // Catch:{ all -> 0x03aa }
            if (r0 == 0) goto L_0x005f
        L_0x004f:
            r4 = r7
            X.0tY r4 = (X.C16730tY) r4     // Catch:{ all -> 0x03aa }
            X.0pd r3 = r5.A1U     // Catch:{ all -> 0x03aa }
            r1 = 2364(0x93c, float:3.313E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x03aa }
            boolean r0 = r3.A0E(r0, r1)     // Catch:{ all -> 0x03aa }
            r5.A0j(r4, r9, r0)     // Catch:{ all -> 0x03aa }
        L_0x005f:
            X.0tZ r4 = r7.A0D()     // Catch:{ all -> 0x03aa }
            if (r4 == 0) goto L_0x007a
            byte r1 = r4.A10     // Catch:{ all -> 0x03aa }
            r0 = 20
            if (r1 != r0) goto L_0x007a
            X.0tY r4 = (X.C16730tY) r4     // Catch:{ all -> 0x03aa }
            X.0pd r3 = r5.A1U     // Catch:{ all -> 0x03aa }
            r1 = 2364(0x93c, float:3.313E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x03aa }
            boolean r0 = r3.A0E(r0, r1)     // Catch:{ all -> 0x03aa }
            r5.A0j(r4, r9, r0)     // Catch:{ all -> 0x03aa }
        L_0x007a:
            X.0tg r9 = r14.A02     // Catch:{ all -> 0x03aa }
            java.lang.String r11 = "message"
            java.lang.String r4 = "_id=?"
            java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ all -> 0x03aa }
            long r0 = r7.A13     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x03aa }
            r3[r8] = r0     // Catch:{ all -> 0x03aa }
            int r11 = r9.A01(r11, r4, r3)     // Catch:{ all -> 0x03aa }
            r10.A04()     // Catch:{ all -> 0x03aa }
            X.1jC r0 = r10.A04     // Catch:{ all -> 0x03aa }
            boolean r0 = r0.A0D(r14)     // Catch:{ all -> 0x03aa }
            if (r0 == 0) goto L_0x00aa
            java.lang.String r10 = "messages"
            java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ all -> 0x03aa }
            long r0 = r7.A13     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x03aa }
            r3[r8] = r0     // Catch:{ all -> 0x03aa }
            int r0 = r9.A01(r10, r4, r3)     // Catch:{ all -> 0x03aa }
            int r11 = r11 + r0
        L_0x00aa:
            if (r11 <= 0) goto L_0x0380
            X.1Vt r0 = r7.A0L     // Catch:{ all -> 0x03aa }
            if (r0 == 0) goto L_0x0111
            X.0wS r0 = r5.A1f     // Catch:{ all -> 0x03aa }
            r0.A06()     // Catch:{ all -> 0x03aa }
            X.16r r9 = r0.A08     // Catch:{ all -> 0x03aa }
            X.1Vt r4 = r7.A0L     // Catch:{ all -> 0x03aa }
            java.lang.String r1 = r4.A0L     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x03aa }
            X.1Vt r3 = r9.A0M(r1, r0)     // Catch:{ all -> 0x03aa }
            if (r3 == 0) goto L_0x00e8
            X.1W2 r1 = r3.A0A     // Catch:{ all -> 0x03aa }
            if (r1 != 0) goto L_0x00d9
            X.1GR r4 = r9.A00     // Catch:{ all -> 0x03aa }
            java.lang.String r1 = r3.A0G     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = r3.A0I     // Catch:{ all -> 0x03aa }
            X.19r r0 = r4.AEq(r1, r0)     // Catch:{ all -> 0x03aa }
            if (r0 == 0) goto L_0x0111
            X.1W2 r1 = r0.AI7()     // Catch:{ all -> 0x03aa }
            if (r1 == 0) goto L_0x0111
        L_0x00d9:
            monitor-enter(r3)     // Catch:{ all -> 0x03aa }
            X.1W2 r0 = r3.A0A     // Catch:{ all -> 0x037d }
            if (r0 != 0) goto L_0x00e1
            r3.A0A = r1     // Catch:{ all -> 0x037d }
            r0 = r1
        L_0x00e1:
            r0.A04 = r6     // Catch:{ all -> 0x037d }
            monitor-exit(r3)     // Catch:{ all -> 0x03aa }
            r9.A0j(r3)     // Catch:{ all -> 0x03aa }
            goto L_0x0111
        L_0x00e8:
            X.1W2 r1 = r4.A0A     // Catch:{ all -> 0x03aa }
            if (r1 != 0) goto L_0x00fe
            X.1GR r3 = r9.A00     // Catch:{ all -> 0x03aa }
            java.lang.String r1 = r4.A0G     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = r4.A0I     // Catch:{ all -> 0x03aa }
            X.19r r0 = r3.AEq(r1, r0)     // Catch:{ all -> 0x03aa }
            if (r0 == 0) goto L_0x0111
            X.1W2 r1 = r0.AI7()     // Catch:{ all -> 0x03aa }
            if (r1 == 0) goto L_0x0111
        L_0x00fe:
            monitor-enter(r4)     // Catch:{ all -> 0x03aa }
            X.1W2 r0 = r4.A0A     // Catch:{ all -> 0x0109 }
            if (r0 != 0) goto L_0x0106
            r4.A0A = r1     // Catch:{ all -> 0x0109 }
            r0 = r1
        L_0x0106:
            r0.A04 = r6     // Catch:{ all -> 0x0109 }
            goto L_0x010d
        L_0x0109:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x03aa }
            goto L_0x037f
        L_0x010d:
            monitor-exit(r4)     // Catch:{ all -> 0x03aa }
            r9.A0j(r4)     // Catch:{ all -> 0x03aa }
        L_0x0111:
            X.0xN r0 = r5.A1N     // Catch:{ all -> 0x03aa }
            r0.A01(r7)     // Catch:{ all -> 0x03aa }
            X.0rv r13 = r2.A00     // Catch:{ all -> 0x03aa }
            boolean r0 = X.C16030sJ.A0Q(r13)     // Catch:{ all -> 0x03aa }
            if (r0 == 0) goto L_0x029a
            boolean r0 = X.C38621r6.A0o(r7)     // Catch:{ all -> 0x03aa }
            if (r0 != 0) goto L_0x03a0
            boolean r0 = X.C41061vA.A0I(r7)     // Catch:{ all -> 0x03aa }
            if (r0 != 0) goto L_0x03a0
            X.0rv r0 = r7.A0B()     // Catch:{ all -> 0x03aa }
            com.whatsapp.jid.UserJid r9 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ all -> 0x03aa }
            if (r9 != 0) goto L_0x0148
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03aa }
            r1.<init>()     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = "msgstore/deletemsg/ remote resource is null or not a UserJid"
            r1.append(r0)     // Catch:{ all -> 0x03aa }
            r1.append(r2)     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03aa }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03aa }
        L_0x0148:
            X.11G r10 = r5.A1J     // Catch:{ all -> 0x03aa }
            X.1dI r4 = r10.A06(r9)     // Catch:{ all -> 0x03aa }
            if (r4 == 0) goto L_0x0284
            if (r21 != 0) goto L_0x01a9
            X.1jg r0 = X.C34091jg.A00     // Catch:{ all -> 0x03aa }
            if (r9 == r0) goto L_0x0180
            X.0sG r3 = r5.A0A     // Catch:{ all -> 0x03aa }
            X.0sH r2 = r3.A0A(r9)     // Catch:{ all -> 0x03aa }
            monitor-enter(r4)     // Catch:{ all -> 0x03aa }
            int r0 = r4.A00     // Catch:{ all -> 0x0173 }
            r1 = 1
            if (r0 != r6) goto L_0x0167
            int r0 = r4.A01     // Catch:{ all -> 0x0173 }
            if (r0 != r6) goto L_0x0167
            goto L_0x0168
        L_0x0167:
            r1 = 0
        L_0x0168:
            monitor-exit(r4)     // Catch:{ all -> 0x03aa }
            if (r1 == 0) goto L_0x016c
            goto L_0x0177
        L_0x016c:
            boolean r0 = r2.A0m     // Catch:{ all -> 0x03aa }
            if (r0 == 0) goto L_0x0180
            r2.A0m = r8     // Catch:{ all -> 0x03aa }
            goto L_0x017d
        L_0x0173:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x03aa }
            goto L_0x037f
        L_0x0177:
            boolean r0 = r2.A0m     // Catch:{ all -> 0x03aa }
            if (r0 != 0) goto L_0x0180
            r2.A0m = r6     // Catch:{ all -> 0x03aa }
        L_0x017d:
            r3.A0K(r2)     // Catch:{ all -> 0x03aa }
        L_0x0180:
            monitor-enter(r4)     // Catch:{ all -> 0x03aa }
            int r0 = r4.A00     // Catch:{ all -> 0x01a5 }
            int r0 = r0 + -1
            r4.A00 = r0     // Catch:{ all -> 0x01a5 }
            long r2 = r7.A14     // Catch:{ all -> 0x01a5 }
            long r0 = r4.A06     // Catch:{ all -> 0x01a5 }
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0195
            int r0 = r4.A01     // Catch:{ all -> 0x01a5 }
            int r0 = r0 + -1
            r4.A01 = r0     // Catch:{ all -> 0x01a5 }
        L_0x0195:
            X.C30991dI.A00(r7)     // Catch:{ all -> 0x01a5 }
            int r0 = r4.A00     // Catch:{ all -> 0x01a5 }
            if (r0 > 0) goto L_0x019e
            r3 = 0
            goto L_0x01a2
        L_0x019e:
            X.1dI r3 = r4.A05()     // Catch:{ all -> 0x01a5 }
        L_0x01a2:
            monitor-exit(r4)     // Catch:{ all -> 0x03aa }
            goto L_0x0229
        L_0x01a5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x03aa }
            goto L_0x037f
        L_0x01a9:
            monitor-enter(r4)     // Catch:{ all -> 0x03aa }
            int r0 = r4.A00     // Catch:{ all -> 0x027e }
            if (r0 > r6) goto L_0x01b3
            X.C30991dI.A00(r7)     // Catch:{ all -> 0x027e }
            r3 = 0
            goto L_0x0228
        L_0x01b3:
            com.whatsapp.jid.UserJid r2 = r4.A0B     // Catch:{ all -> 0x027e }
            X.1jg r1 = X.C34091jg.A00     // Catch:{ all -> 0x027e }
            r0 = 0
            if (r2 != r1) goto L_0x01bb
            r0 = 1
        L_0x01bb:
            r11 = -1
            if (r0 == 0) goto L_0x01c8
            long r2 = r7.A14     // Catch:{ all -> 0x027e }
            long r0 = r4.A04     // Catch:{ all -> 0x027e }
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x01f7
            goto L_0x01f0
        L_0x01c8:
            long r2 = r7.A14     // Catch:{ all -> 0x027e }
            long r0 = r4.A06     // Catch:{ all -> 0x027e }
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x01f0
            long r2 = r7.A14     // Catch:{ all -> 0x027e }
            long r0 = r4.A03     // Catch:{ all -> 0x027e }
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 < 0) goto L_0x01e0
            long r2 = r7.A14     // Catch:{ all -> 0x027e }
            long r0 = r4.A02     // Catch:{ all -> 0x027e }
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x01f0
        L_0x01e0:
            long r2 = r7.A14     // Catch:{ all -> 0x027e }
            long r0 = r4.A07     // Catch:{ all -> 0x027e }
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x01f0
            long r2 = r7.A14     // Catch:{ all -> 0x027e }
            long r0 = r4.A04     // Catch:{ all -> 0x027e }
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x01f7
        L_0x01f0:
            r4.A04 = r11     // Catch:{ all -> 0x027e }
            X.C30991dI.A00(r7)     // Catch:{ all -> 0x027e }
            r3 = r4
            goto L_0x0212
        L_0x01f7:
            int r0 = r4.A00     // Catch:{ all -> 0x027e }
            int r0 = r0 - r6
            r4.A00 = r0     // Catch:{ all -> 0x027e }
            long r2 = r7.A14     // Catch:{ all -> 0x027e }
            long r0 = r4.A06     // Catch:{ all -> 0x027e }
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x020b
            int r0 = r4.A01     // Catch:{ all -> 0x027e }
            if (r0 <= 0) goto L_0x020b
            int r0 = r0 - r6
            r4.A01 = r0     // Catch:{ all -> 0x027e }
        L_0x020b:
            X.C30991dI.A00(r7)     // Catch:{ all -> 0x027e }
            X.1dI r3 = r4.A05()     // Catch:{ all -> 0x027e }
        L_0x0212:
            long r11 = r3.A03()     // Catch:{ all -> 0x0280 }
            r1 = -1
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0222
            X.1dI r3 = r5.A0E(r3)     // Catch:{ all -> 0x0280 }
            if (r3 == 0) goto L_0x0228
        L_0x0222:
            X.AnonymousClass00B.A06(r9)     // Catch:{ all -> 0x0280 }
            r10.A0D(r3, r9)     // Catch:{ all -> 0x0280 }
        L_0x0228:
            monitor-exit(r4)     // Catch:{ all -> 0x0280 }
        L_0x0229:
            if (r3 != 0) goto L_0x027a
            r10.A03(r9)     // Catch:{ all -> 0x03aa }
            boolean r0 = X.C16030sJ.A0P(r13)     // Catch:{ all -> 0x03aa }
            if (r0 == 0) goto L_0x03a0
            X.184 r9 = r5.A1I     // Catch:{ all -> 0x03aa }
            long r2 = r7.A13     // Catch:{ all -> 0x03aa }
            monitor-enter(r9)     // Catch:{ all -> 0x03aa }
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x0276 }
            r12 = 0
            X.0tq r0 = r9.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x026d }
            X.0tf r11 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x026d }
            X.1cj r10 = r11.A00()     // Catch:{ all -> 0x0268 }
            X.0tg r8 = r11.A02     // Catch:{ all -> 0x0263 }
            java.lang.String r6 = "message_status_psa_campaign"
            java.lang.String r4 = "message_row_id = ? "
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0263 }
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x0263 }
            r1[r12] = r0     // Catch:{ all -> 0x0263 }
            r8.A01(r6, r4, r1)     // Catch:{ all -> 0x0263 }
            r10.A00()     // Catch:{ all -> 0x0263 }
            r10.close()     // Catch:{ all -> 0x0268 }
            r11.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x026d }
            goto L_0x0273
        L_0x0263:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0267 }
        L_0x0267:
            throw r0     // Catch:{ all -> 0x0268 }
        L_0x0268:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x026c }
        L_0x026c:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x026d }
        L_0x026d:
            r1 = move-exception
            java.lang.String r0 = "messagestatuspsacampaign/delete"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0276 }
        L_0x0273:
            monitor-exit(r9)     // Catch:{ all -> 0x03aa }
            goto L_0x03a0
        L_0x0276:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x03aa }
            goto L_0x037f
        L_0x027a:
            if (r21 != 0) goto L_0x03a0
            goto L_0x0395
        L_0x027e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0280 }
        L_0x0280:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0280 }
            goto L_0x037f
        L_0x0284:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03aa }
            r1.<init>()     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = "msgstore/deletemsg/statuslist/no status for "
            r1.append(r0)     // Catch:{ all -> 0x03aa }
            r1.append(r9)     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03aa }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03aa }
            goto L_0x03a0
        L_0x029a:
            X.0rt r6 = r5.A0O     // Catch:{ all -> 0x03aa }
            X.0rx r4 = r6.A06(r13)     // Catch:{ all -> 0x03aa }
            if (r4 == 0) goto L_0x03a0
            long r2 = r4.A0S     // Catch:{ all -> 0x03aa }
            long r0 = r7.A13     // Catch:{ all -> 0x03aa }
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r15 = 0
            if (r9 != 0) goto L_0x02ac
            r15 = 1
        L_0x02ac:
            long r2 = r4.A0L     // Catch:{ all -> 0x03aa }
            long r0 = r7.A13     // Catch:{ all -> 0x03aa }
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r12 = 0
            if (r9 != 0) goto L_0x02b6
            r12 = 1
        L_0x02b6:
            long r2 = r7.A14     // Catch:{ all -> 0x03aa }
            long r0 = r4.A0O     // Catch:{ all -> 0x03aa }
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x02db
            X.0pd r2 = r5.A1U     // Catch:{ all -> 0x03aa }
            r1 = 1335(0x537, float:1.871E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x03aa }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ all -> 0x03aa }
            if (r0 == 0) goto L_0x02d1
            r1 = 16
            r0 = r20 & 16
            if (r0 != r1) goto L_0x02d1
            r8 = 1
        L_0x02d1:
            X.10R r0 = r5.A0M     // Catch:{ all -> 0x03aa }
            r0.A00(r4, r8)     // Catch:{ all -> 0x03aa }
            X.0sK r0 = r5.A05     // Catch:{ all -> 0x03aa }
            X.C38621r6.A0K(r0, r6, r7)     // Catch:{ all -> 0x03aa }
        L_0x02db:
            if (r15 != 0) goto L_0x02df
            if (r12 == 0) goto L_0x036d
        L_0x02df:
            X.0uq r0 = r5.A19     // Catch:{ all -> 0x03aa }
            long r2 = r0.A02(r13)     // Catch:{ all -> 0x03aa }
            X.15B r0 = r5.A1D     // Catch:{ all -> 0x03aa }
            long r8 = r0.A05(r13)     // Catch:{ all -> 0x03aa }
            r10 = 1
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0300
            X.0th r0 = r5.A0K     // Catch:{ all -> 0x03aa }
            X.0tZ r6 = r0.A00(r2)     // Catch:{ all -> 0x03aa }
            if (r17 != 0) goto L_0x0301
            if (r6 == 0) goto L_0x0301
            long r0 = r6.A0I     // Catch:{ all -> 0x03aa }
            r4.A0V = r0     // Catch:{ all -> 0x03aa }
            goto L_0x0301
        L_0x0300:
            r6 = 0
        L_0x0301:
            if (r15 == 0) goto L_0x0309
            r4.A0S = r2     // Catch:{ all -> 0x03aa }
            r4.A0T = r8     // Catch:{ all -> 0x03aa }
            r4.A0Z = r6     // Catch:{ all -> 0x03aa }
        L_0x0309:
            if (r12 == 0) goto L_0x0311
            r4.A0L = r2     // Catch:{ all -> 0x03aa }
            r4.A0M = r8     // Catch:{ all -> 0x03aa }
            r4.A0Y = r6     // Catch:{ all -> 0x03aa }
        L_0x0311:
            X.0ts r3 = r5.A0N     // Catch:{ all -> 0x03aa }
            monitor-enter(r4)     // Catch:{ all -> 0x03aa }
            r0 = 5
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x037a }
            r2.<init>(r0)     // Catch:{ all -> 0x037a }
            java.lang.String r6 = "display_message_row_id"
            long r0 = r4.A0S     // Catch:{ all -> 0x037a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x037a }
            r2.put(r6, r0)     // Catch:{ all -> 0x037a }
            java.lang.String r6 = "display_message_sort_id"
            long r0 = r4.A0T     // Catch:{ all -> 0x037a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x037a }
            r2.put(r6, r0)     // Catch:{ all -> 0x037a }
            java.lang.String r6 = "last_message_row_id"
            long r0 = r4.A0L     // Catch:{ all -> 0x037a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x037a }
            r2.put(r6, r0)     // Catch:{ all -> 0x037a }
            java.lang.String r6 = "last_message_sort_id"
            long r0 = r4.A0M     // Catch:{ all -> 0x037a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x037a }
            r2.put(r6, r0)     // Catch:{ all -> 0x037a }
            java.lang.String r6 = "sort_timestamp"
            long r0 = r4.A0V     // Catch:{ all -> 0x037a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x037a }
            r2.put(r6, r0)     // Catch:{ all -> 0x037a }
            monitor-exit(r4)     // Catch:{ all -> 0x03aa }
            boolean r0 = r3.A0I(r2, r4)     // Catch:{ all -> 0x03aa }
            if (r0 != 0) goto L_0x036d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03aa }
            r1.<init>()     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = "msgstore/deletemsg/chatlist/insert/failed gid="
            r1.append(r0)     // Catch:{ all -> 0x03aa }
            r1.append(r13)     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03aa }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03aa }
        L_0x036d:
            long r2 = r4.A0F     // Catch:{ all -> 0x03aa }
            long r0 = r7.A14     // Catch:{ all -> 0x03aa }
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x03a0
            r0 = -9223372036854775808
            r4.A0F = r0     // Catch:{ all -> 0x03aa }
            goto L_0x03a0
        L_0x037a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x03aa }
            goto L_0x037f
        L_0x037d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03aa }
        L_0x037f:
            throw r0     // Catch:{ all -> 0x03aa }
        L_0x0380:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03aa }
            r1.<init>()     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = "msgstore/deletemsg/nothing-deleted "
            r1.append(r0)     // Catch:{ all -> 0x03aa }
            r1.append(r2)     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03aa }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x03aa }
            goto L_0x03a0
        L_0x0395:
            int r1 = r3.A02()     // Catch:{ all -> 0x03aa }
            int r0 = r3.A01()     // Catch:{ all -> 0x03aa }
            r10.A0E(r9, r1, r0)     // Catch:{ all -> 0x03aa }
        L_0x03a0:
            r16.A00()     // Catch:{ all -> 0x03aa }
            r16.close()     // Catch:{ all -> 0x03af }
            r14.close()     // Catch:{ SQLiteDoneException -> 0x03c3, SQLiteDatabaseCorruptException -> 0x03b9, Error | RuntimeException -> 0x03b4 }
            goto L_0x03c7
        L_0x03aa:
            r0 = move-exception
            r16.close()     // Catch:{ all -> 0x03ae }
        L_0x03ae:
            throw r0     // Catch:{ all -> 0x03af }
        L_0x03af:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x03b3 }
        L_0x03b3:
            throw r0     // Catch:{ SQLiteDoneException -> 0x03c3, SQLiteDatabaseCorruptException -> 0x03b9, Error | RuntimeException -> 0x03b4 }
        L_0x03b4:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x03b9:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r5.A0u
            r0.A02()
            goto L_0x03c7
        L_0x03c3:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x03c7:
            X.0sq r2 = r5.A1l
            r1 = 26
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r0.<init>(r5, r1, r7)
            r2.Acl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0g(X.0tZ, int, boolean):void");
    }

    public final void A0h(C16740tZ r10, String str, boolean z2) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = r10.A0n;
            if (str.equals(str2)) {
                return;
            }
            if (TextUtils.isEmpty(str2) || r10.A0n.equals("UNSET")) {
                r10.A0n = str;
                if (z2) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("payment_transaction_id", str);
                    C28381Vw r6 = r10.A11;
                    C15830rv r0 = r6.A00;
                    AnonymousClass00B.A06(r0);
                    String rawString = r0.getRawString();
                    C16800tf A022 = this.A0v.A02();
                    try {
                        C16810tg r8 = A022.A02;
                        String[] strArr = new String[3];
                        strArr[0] = rawString;
                        strArr[1] = r6.A02 ? "1" : "0";
                        strArr[2] = r6.A01;
                        int A002 = r8.A00("messages", contentValues, "key_remote_jid = ? AND key_from_me = ? AND key_id = ?", strArr);
                        if (A002 > 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("msgStore/updateMessagePaymentTransactionId/PAY updating trans id into fmsg: ");
                            sb.append(str);
                            sb.append(" for message: ");
                            sb.append(r6);
                            sb.append(" ");
                            sb.append(A002);
                            Log.i(sb.toString());
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("msgStore/updateMessagePaymentTransactionId/PAY could not write trans id into fmsg: ");
                            sb2.append(str);
                            sb2.append(" for message: ");
                            sb2.append(r6);
                            sb2.append(" ");
                            sb2.append(A002);
                            Log.w(sb2.toString());
                        }
                        A022.close();
                        return;
                    } catch (Throwable unused) {
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0161 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0166 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x0161=Splitter:B:43:0x0161, B:14:0x007b=Splitter:B:14:0x007b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0i(X.C28381Vw r18, int r19, long r20) {
        /*
            r17 = this;
            long r15 = android.os.SystemClock.uptimeMillis()
            r5 = r17
            X.17G r10 = r5.A0j
            X.0tq r11 = r10.A05
            X.0tf r3 = r11.A02()
            X.1cj r14 = r3.A00()     // Catch:{ all -> 0x0167 }
            X.0tf r2 = r11.A02()     // Catch:{ all -> 0x0162 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x015d }
            r13.<init>()     // Catch:{ all -> 0x015d }
            java.lang.String r9 = "status"
            r8 = r19
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x015d }
            r13.put(r9, r4)     // Catch:{ all -> 0x015d }
            X.0tg r12 = r2.A02     // Catch:{ all -> 0x015d }
            java.lang.String r6 = "message"
            java.lang.String r1 = "chat_row_id = ? AND from_me = ? AND key_id = ?"
            r7 = r18
            java.lang.String[] r0 = r10.A0B(r7)     // Catch:{ all -> 0x015d }
            int r1 = r12.A00(r6, r13, r1, r0)     // Catch:{ all -> 0x015d }
            r0 = 1
            java.lang.String r6 = " "
            if (r1 == r0) goto L_0x0061
            boolean r0 = r10.A09()     // Catch:{ all -> 0x015d }
            if (r0 == 0) goto L_0x007b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x015d }
            r1.<init>()     // Catch:{ all -> 0x015d }
            java.lang.String r0 = "MainMessageStore/updateMessageStatusV2/update/failed "
            r1.append(r0)     // Catch:{ all -> 0x015d }
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x015d }
            r1.append(r0)     // Catch:{ all -> 0x015d }
            r1.append(r6)     // Catch:{ all -> 0x015d }
            X.0rv r0 = r7.A00     // Catch:{ all -> 0x015d }
            r1.append(r0)     // Catch:{ all -> 0x015d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x015d }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x015d }
            goto L_0x007b
        L_0x0061:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x015d }
            r1.<init>()     // Catch:{ all -> 0x015d }
            java.lang.String r0 = "MainMessageStore/updateMessageStatusV2/update/success "
            r1.append(r0)     // Catch:{ all -> 0x015d }
            r1.append(r7)     // Catch:{ all -> 0x015d }
            r1.append(r6)     // Catch:{ all -> 0x015d }
            r1.append(r8)     // Catch:{ all -> 0x015d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x015d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015d }
        L_0x007b:
            r2.close()     // Catch:{ all -> 0x0162 }
            r11.A04()     // Catch:{ all -> 0x0162 }
            X.1jC r0 = r11.A04     // Catch:{ all -> 0x0162 }
            boolean r0 = r0.A0D(r3)     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x0147
            r2 = 2
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0162 }
            r11.<init>(r2)     // Catch:{ all -> 0x0162 }
            r0 = 4
            if (r8 == r0) goto L_0x00e3
            r0 = 5
            if (r8 == r0) goto L_0x00d0
            r0 = 8
            if (r8 == r0) goto L_0x00da
            r0 = 13
            if (r8 != r0) goto L_0x00a7
            java.lang.String r1 = "read_device_timestamp"
            java.lang.Long r0 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0162 }
            r11.put(r1, r0)     // Catch:{ all -> 0x0162 }
            goto L_0x00e3
        L_0x00a7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
            r1.<init>()     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "Unexpected status "
            r1.append(r0)     // Catch:{ all -> 0x0162 }
            r1.append(r8)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = " for message "
            r1.append(r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x0162 }
            r1.append(r0)     // Catch:{ all -> 0x0162 }
            r1.append(r6)     // Catch:{ all -> 0x0162 }
            X.0rv r0 = r7.A00     // Catch:{ all -> 0x0162 }
            r1.append(r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0162 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0162 }
            r0.<init>(r1)     // Catch:{ all -> 0x0162 }
            throw r0     // Catch:{ all -> 0x0162 }
        L_0x00d0:
            java.lang.String r1 = "receipt_device_timestamp"
            java.lang.Long r0 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0162 }
            r11.put(r1, r0)     // Catch:{ all -> 0x0162 }
            goto L_0x00e3
        L_0x00da:
            java.lang.String r1 = "played_device_timestamp"
            java.lang.Long r0 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0162 }
            r11.put(r1, r0)     // Catch:{ all -> 0x0162 }
        L_0x00e3:
            r11.put(r9, r4)     // Catch:{ all -> 0x0162 }
            r0 = 3
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0162 }
            r1 = 0
            X.0rv r0 = r7.A00     // Catch:{ all -> 0x0162 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x0162 }
            r9[r1] = r0     // Catch:{ all -> 0x0162 }
            r4 = 1
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0162 }
            r9[r4] = r0     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x0162 }
            r9[r2] = r0     // Catch:{ all -> 0x0162 }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "messages"
            java.lang.String r0 = "key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
            int r2 = r2.A00(r1, r11, r0, r9)     // Catch:{ all -> 0x0162 }
            boolean r0 = r10.A09()     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x012d
            if (r2 == r4) goto L_0x012d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
            r1.<init>()     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "MainMessageStore/updateMessageStatusTimestamp/update/failed "
            r1.append(r0)     // Catch:{ all -> 0x0162 }
            r1.append(r7)     // Catch:{ all -> 0x0162 }
            r1.append(r6)     // Catch:{ all -> 0x0162 }
            r1.append(r2)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0162 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0162 }
            goto L_0x0147
        L_0x012d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
            r1.<init>()     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "MainMessageStore/updateMessageStatusTimestamp/update/success "
            r1.append(r0)     // Catch:{ all -> 0x0162 }
            r1.append(r7)     // Catch:{ all -> 0x0162 }
            r1.append(r6)     // Catch:{ all -> 0x0162 }
            r1.append(r8)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0162 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0162 }
        L_0x0147:
            r14.A00()     // Catch:{ all -> 0x0162 }
            r14.close()     // Catch:{ all -> 0x0167 }
            r3.close()
            X.0vN r3 = r5.A0T
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r15
            java.lang.String r0 = "CoreMessageStore/updateMessageStatusTimestamp"
            r3.A00(r0, r1)
            return
        L_0x015d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0161 }
        L_0x0161:
            throw r0     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x0166 }
        L_0x0166:
            throw r0     // Catch:{ all -> 0x0167 }
        L_0x0167:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x016b }
        L_0x016b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0i(X.1Vw, int, long):void");
    }

    public void A0j(C16730tY r7, boolean z2, boolean z3) {
        File file;
        C16750ta r0 = r7.A02;
        if (r0 != null && (file = r0.A0F) != null) {
            this.A07.A00(file, r7.A10, 1, z2 | C38621r6.A0y(r7), z3);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0131 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0136 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0k(X.C28921Zf r11) {
        /*
            r10 = this;
            java.lang.String r3 = "message table"
            X.0tq r5 = r10.A0v
            X.0tf r1 = r5.A02()
            X.1cj r9 = r1.A00()     // Catch:{ all -> 0x0137 }
            X.0tg r2 = r1.A02     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "receipts"
            r4 = 0
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "receipt_device"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "receipt_user"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "receipt_orphaned"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "receipts tables"
            r11.A02(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "UPDATE chat SET display_message_row_id=1, unseen_message_count = 0, unseen_missed_calls_count = 0, unseen_row_count = 0, unseen_earliest_message_received_time = 0"
            r2.A0B(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "media_refs"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message_streaming_sidecar"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message_thumbnail"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message_media"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "media tables"
            r11.A02(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "mms_thumbnail_metadata"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "mms thumbnail metadata tables"
            r11.A02(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "audio_data"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "audio data tables"
            r11.A02(r0)     // Catch:{ all -> 0x0132 }
            X.151 r8 = r10.A0Z     // Catch:{ all -> 0x0132 }
            X.0tq r0 = r8.A05     // Catch:{ all -> 0x0132 }
            X.0tf r7 = r0.A02()     // Catch:{ all -> 0x0132 }
            X.0tg r6 = r7.A02     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "frequent"
            r6.A01(r0, r4, r4)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "frequents"
            r6.A01(r0, r4, r4)     // Catch:{ all -> 0x012d }
            r7.close()     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "status"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0132 }
            r0.<init>()     // Catch:{ all -> 0x0132 }
            r8.A00 = r0     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "frequent tables"
            r11.A02(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message_ftsv2"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "fts tables"
            r11.A02(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message_send_count"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message_location"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message_template"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message_template_button"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message_quoted"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message_mentions"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message_product"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message_link"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message_future"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message_system"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message_text"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "extra data tables"
            r11.A02(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "DELETE FROM message WHERE _id!=1"
            r2.A0B(r0)     // Catch:{ all -> 0x0132 }
            r11.A02(r3)     // Catch:{ all -> 0x0132 }
            r5.A04()     // Catch:{ all -> 0x0132 }
            X.1jC r0 = r5.A04     // Catch:{ all -> 0x0132 }
            boolean r0 = r0.A0D(r1)     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x011d
            java.lang.String r0 = "messages_vcards"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "messages_vcards_jids"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "vcard deprecated table"
            r11.A02(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message_thumbnails"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "media deprecated tables"
            r11.A02(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "messages_fts"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "fts deprecated tables"
            r11.A02(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "messages_links"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "status_list"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "messages_quotes"
            r2.A01(r0, r4, r4)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "message quotes table"
            r11.A02(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "DELETE FROM messages WHERE _id!=1 AND media_wa_type != 8"
            r2.A0B(r0)     // Catch:{ all -> 0x0132 }
            r11.A02(r3)     // Catch:{ all -> 0x0132 }
        L_0x011d:
            r9.A00()     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "set transaction"
            r11.A02(r0)     // Catch:{ all -> 0x0132 }
            r9.close()     // Catch:{ all -> 0x0137 }
            r1.close()
            return
        L_0x012d:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0131 }
        L_0x0131:
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0136 }
        L_0x0136:
            throw r0     // Catch:{ all -> 0x0137 }
        L_0x0137:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x013b }
        L_0x013b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0k(X.1Zf):void");
    }

    public void A0l(Collection collection) {
        AnonymousClass11G r2 = this.A1J;
        C30991dI A052 = r2.A05();
        if (A052 != null) {
            C30991dI A0E2 = A0E(A052);
            C34091jg r0 = C34091jg.A00;
            if (A0E2 != null) {
                r2.A0D(A0E2, r0);
            } else {
                r2.A03(r0);
            }
        }
        this.A0e.A01.post(new RunnableRunnableShape6S0200000_I0_4(this, 21, collection));
    }

    public void A0m(Collection collection, int i2) {
        StringBuilder sb = new StringBuilder("msgstore/deletemessages ");
        sb.append(collection.size());
        Log.i(sb.toString());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.A0n.A03(((C16740tZ) it.next()).A11);
        }
        this.A0H.A01(new RunnableRunnableShape0S0201000_I0((Object) this, i2, (Object) collection, 17), 20);
    }

    public void A0n(Collection collection, int i2) {
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        boolean z2 = false;
        if ((i2 & 8) == 8) {
            z2 = true;
        }
        Collection collection2 = collection;
        Iterator it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                C16740tZ r1 = (C16740tZ) it.next();
                A0g(r1, i2, false);
                C15830rv r4 = r1.A11.A00;
                hashSet.add(r4);
                if (z2) {
                    Long l2 = r1.A0Z;
                    AnonymousClass00B.A06(l2);
                    long longValue = l2.longValue();
                    Number number = (Number) hashMap.get(r4);
                    if (number != null) {
                        longValue = Math.max(number.longValue(), longValue);
                    }
                    hashMap.put(r4, Long.valueOf(longValue));
                }
            } else {
                this.A0e.A01.post(new RunnableRunnableShape0S0410000_I0(this, collection2, hashMap, hashSet, 0, z2));
                return;
            }
        }
    }

    public void A0o(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16740tZ r4 = (C16740tZ) it.next();
            if (r4 instanceof C16730tY) {
                C16730tY r42 = (C16730tY) r4;
                AnonymousClass00B.A00();
                if (r42.A02 != null) {
                    A0j(r42, true, false);
                    AnonymousClass17I r3 = this.A0k;
                    C16750ta r2 = r42.A02;
                    if (!(r2 == null || r2.A0F == null)) {
                        r2.A0A = 0;
                        r2.A0F = null;
                        r2.A0G = null;
                        r2.A0U = null;
                        r3.A07(r42);
                    }
                }
            } else if (r4 instanceof C30581cc) {
                r4.A0k("");
            }
        }
    }

    public final void A0p(List list) {
        AnonymousClass1Vt r2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16740tZ A032 = this.A0K.A03((C28381Vw) it.next());
            if (!(A032 == null || (r2 = A032.A0L) == null)) {
                r2.A02 = 0;
                r2.A06 = this.A0F.A00();
                this.A0e.A00(A032, 16);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03e6, code lost:
        r30.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02ba, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("msgstore/deletemsgs/batches stopped at ref:");
        r5.append(r19);
        com.whatsapp.util.Log.w(r5.toString());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x0380 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:134:0x03b4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x03c0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x03da */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03cd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0140 A[Catch:{ SQLiteDiskIOException -> 0x03c6, all -> 0x03db }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0q(X.C42561y1 r37, X.AnonymousClass1yq r38, boolean r39) {
        /*
            r36 = this;
            r4 = r37
            r1 = 1
            if (r39 == 0) goto L_0x000a
            java.util.List r0 = r4.A09
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            int r2 = r4.A00
            if (r2 >= r1) goto L_0x005e
            java.lang.String r0 = "msgstore/deletemsgs/batches block size is not positive:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " for jid:"
            r1.append(r0)
            X.0rv r13 = r4.A07
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            long r11 = r4.A06
            long r9 = r4.A01
            long r7 = r4.A04
            long r5 = r4.A05
            boolean r0 = r4.A0C
            r33 = r0
            boolean r0 = r4.A0B
            r34 = r0
            long r2 = r4.A02
            long r0 = r4.A03
            java.lang.String r15 = r4.A08
            java.util.List r14 = r4.A09
            r20 = 100
            X.1y1 r4 = new X.1y1
            r16 = r4
            r17 = r13
            r18 = r15
            r19 = r14
            r21 = r11
            r23 = r9
            r25 = r7
            r27 = r5
            r29 = r2
            r31 = r0
            r35 = r33
            r16.<init>(r17, r18, r19, r20, r21, r23, r25, r27, r29, r31, r33, r34, r35)
        L_0x005e:
            X.AnonymousClass00B.A00()
            java.lang.String r1 = "msgstore/deletemsgs/batches"
            X.1Zf r23 = new X.1Zf
            r0 = r23
            r0.<init>((java.lang.String) r1)
            r32 = r38
            r32.AXP()
            r3 = r36
            if (r39 == 0) goto L_0x03a6
            java.util.List r0 = r4.A09
            int r22 = r0.size()
        L_0x0079:
            X.17r r1 = r3.A1K
            X.0rv r0 = r4.A07
            r31 = r0
            long r1 = r1.A00(r0)
            X.15B r0 = r3.A1D
            r0.A03(r1)
            r3.A0N(r4)
            r2 = 0
            r15 = 0
        L_0x008d:
            boolean r0 = r32.AfQ()
            if (r0 != 0) goto L_0x03e9
            X.16w r5 = r3.A0U     // Catch:{ all -> 0x03db }
            X.0tq r7 = r5.A02     // Catch:{ all -> 0x03db }
            X.0tf r1 = r7.get()     // Catch:{ all -> 0x03db }
            if (r39 == 0) goto L_0x00e7
            java.util.List r6 = r4.A09     // Catch:{ all -> 0x03d6 }
            if (r6 == 0) goto L_0x00e7
            int r5 = r6.size()     // Catch:{ all -> 0x03d6 }
            r0 = 999(0x3e7, float:1.4E-42)
            if (r5 <= r0) goto L_0x00af
            java.lang.String r0 = "msgstore/deletemsgs/getSingularDeletedChats too many messages to delete"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03d6 }
            goto L_0x0128
        L_0x00af:
            int r9 = r6.size()     // Catch:{ all -> 0x03d6 }
            java.lang.String[] r8 = new java.lang.String[r9]     // Catch:{ all -> 0x03d6 }
            r5 = 0
        L_0x00b6:
            if (r5 >= r9) goto L_0x00c7
            java.lang.Object r0 = r6.get(r5)     // Catch:{ all -> 0x03d6 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x03d6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x03d6 }
            r8[r5] = r0     // Catch:{ all -> 0x03d6 }
            int r5 = r5 + 1
            goto L_0x00b6
        L_0x00c7:
            X.0tf r7 = r7.get()     // Catch:{ all -> 0x03d6 }
            X.0tg r6 = r7.A02     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = "SELECT * FROM deleted_messages_view WHERE _id IN "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x03b0 }
            r5.<init>(r0)     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = X.C34111ji.A00(r9)     // Catch:{ all -> 0x03b0 }
            r5.append(r0)     // Catch:{ all -> 0x03b0 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x03b0 }
            android.database.Cursor r6 = r6.A08(r0, r8)     // Catch:{ all -> 0x03b0 }
            r7.close()     // Catch:{ all -> 0x03d6 }
            goto L_0x010a
        L_0x00e7:
            X.0tg r9 = r1.A02     // Catch:{ all -> 0x03d6 }
            java.lang.String r8 = X.C42911yt.A00     // Catch:{ all -> 0x03d6 }
            r0 = 2
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x03d6 }
            r10 = 0
            X.0ts r5 = r5.A00     // Catch:{ all -> 0x03d6 }
            r0 = r31
            long r5 = r5.A02(r0)     // Catch:{ all -> 0x03d6 }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x03d6 }
            r7[r10] = r0     // Catch:{ all -> 0x03d6 }
            r5 = 1
            int r0 = r4.A00     // Catch:{ all -> 0x03d6 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03d6 }
            r7[r5] = r0     // Catch:{ all -> 0x03d6 }
            android.database.Cursor r6 = r9.A08(r8, r7)     // Catch:{ all -> 0x03d6 }
        L_0x010a:
            if (r6 == 0) goto L_0x0129
            boolean r0 = r6.moveToFirst()     // Catch:{ all -> 0x03d6 }
            if (r0 == 0) goto L_0x0129
            java.lang.String r0 = "_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d6 }
            long r7 = r6.getLong(r0)     // Catch:{ all -> 0x03d6 }
            java.lang.String r0 = "sort_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03d6 }
            long r9 = r6.getLong(r0)     // Catch:{ all -> 0x03d6 }
            goto L_0x012d
        L_0x0128:
            r6 = 0
        L_0x0129:
            r7 = 1
            r9 = -9223372036854775808
        L_0x012d:
            r1.close()     // Catch:{ all -> 0x03db }
            X.1kc r5 = new X.1kc     // Catch:{ all -> 0x03db }
            r5.<init>(r6, r7, r9)     // Catch:{ all -> 0x03db }
            r2 = r5
            long r0 = r5.A01     // Catch:{ all -> 0x03db }
            r19 = r0
            r5 = 1
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x03cd
            android.database.Cursor r0 = r2.A00     // Catch:{ all -> 0x03db }
            r30 = r0
            r30.getCount()     // Catch:{ all -> 0x03db }
            java.lang.String r14 = "msgstore/deleteMediaMessageFilesBatch: "
            java.lang.String r0 = "msgstore/deletemedia/batch/files"
            X.1Zf r11 = new X.1Zf     // Catch:{ all -> 0x03db }
            r11.<init>((java.lang.String) r0)     // Catch:{ all -> 0x03db }
            java.util.HashSet r21 = new java.util.HashSet     // Catch:{ all -> 0x03db }
            r21.<init>()     // Catch:{ all -> 0x03db }
            r5 = 1
            boolean r0 = r30.moveToFirst()     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            if (r0 == 0) goto L_0x0226
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            r10.<init>()     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            java.lang.String r1 = "remove_files"
            r0 = r30
            int r9 = r0.getColumnIndexOrThrow(r1)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            java.lang.String r1 = "message_type"
            int r8 = r0.getColumnIndex(r1)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
        L_0x016f:
            r0 = r30
            int r0 = r0.getInt(r8)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            byte r1 = (byte) r0     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            boolean r0 = X.C38621r6.A0N(r1)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            if (r0 != 0) goto L_0x0182
            boolean r0 = X.C30921dB.A00(r1)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            if (r0 == 0) goto L_0x01f1
        L_0x0182:
            X.0th r6 = r3.A0K     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            r1 = r30
            r0 = r31
            X.0tZ r7 = r6.A02(r1, r0, r5)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            X.AnonymousClass00B.A06(r7)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            boolean r0 = r7 instanceof X.C16730tY     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            if (r0 == 0) goto L_0x01f1
            X.0tY r7 = (X.C16730tY) r7     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            java.lang.String r1 = r7.A05     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            if (r1 == 0) goto L_0x019e
            r0 = r21
            r0.add(r1)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
        L_0x019e:
            r0 = r30
            int r0 = r0.getInt(r9)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            r13 = 0
            r6 = 0
            if (r0 != r5) goto L_0x01a9
            r6 = 1
        L_0x01a9:
            X.0pd r12 = r3.A1U     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            r1 = 421(0x1a5, float:5.9E-43)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            boolean r0 = r12.A0E(r0, r1)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            if (r0 == 0) goto L_0x01db
            X.0ta r1 = r7.A02     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            if (r1 == 0) goto L_0x01f1
            java.io.File r0 = r1.A0F     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            if (r0 == 0) goto L_0x01f1
            X.01Z r13 = r3.A07     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            byte r12 = r7.A10     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            r28 = 0
            r27 = 1
            r29 = 0
            r24 = r13
            r25 = r0
            r26 = r12
            int r12 = r24.A00(r25, r26, r27, r28, r29)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            boolean r0 = X.C38621r6.A0y(r7)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            r6 = r6 | r0
            if (r6 == 0) goto L_0x01f1
            if (r12 >= 0) goto L_0x01f1
            goto L_0x01df
        L_0x01db:
            r3.A0j(r7, r6, r13)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            goto L_0x01f1
        L_0x01df:
            X.1ys r0 = new X.1ys     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            r0.<init>(r1, r3, r7)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            r1.<init>(r0)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            X.0sq r0 = r3.A1l     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            r0.Acl(r1)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            r10.add(r1)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
        L_0x01f1:
            boolean r0 = r30.moveToNext()     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            if (r0 != 0) goto L_0x016f
            java.util.Iterator r7 = r10.iterator()     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
        L_0x01fb:
            boolean r0 = r7.hasNext()     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            if (r0 == 0) goto L_0x0226
            java.lang.Object r0 = r7.next()     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            java.util.concurrent.FutureTask r0 = (java.util.concurrent.FutureTask) r0     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x020b }
            goto L_0x01fb
        L_0x020b:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            r1.<init>()     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            r1.append(r14)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            r0 = r31
            r1.append(r0)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            java.lang.String r0 = " failed to delete a media file"
            r1.append(r0)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ SQLiteDiskIOException -> 0x03c6 }
            goto L_0x01fb
        L_0x0226:
            java.lang.String r0 = "msgstore/deletemedia/batch/files "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x03db }
            r6.<init>(r0)     // Catch:{ all -> 0x03db }
            r0 = r31
            r6.append(r0)     // Catch:{ all -> 0x03db }
            java.lang.String r0 = " timeSpent:"
            r6.append(r0)     // Catch:{ all -> 0x03db }
            long r0 = r11.A01()     // Catch:{ all -> 0x03db }
            r6.append(r0)     // Catch:{ all -> 0x03db }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x03db }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03db }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x03db }
            r10.<init>()     // Catch:{ all -> 0x03db }
            r30.moveToFirst()     // Catch:{ all -> 0x03db }
        L_0x024d:
            java.lang.String r9 = "key_id"
            r0 = r30
            int r1 = r0.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x03db }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x03db }
            r10.add(r0)     // Catch:{ all -> 0x03db }
            boolean r0 = r30.moveToNext()     // Catch:{ all -> 0x03db }
            if (r0 != 0) goto L_0x024d
            X.0tq r7 = r3.A0v     // Catch:{ all -> 0x03db }
            X.0tf r18 = r7.A02()     // Catch:{ all -> 0x03db }
            X.1cj r17 = r18.A00()     // Catch:{ all -> 0x03c1 }
            r0 = 3
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x03bc }
            long r0 = r4.A01     // Catch:{ all -> 0x03bc }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03bc }
            r0 = 0
            r6[r0] = r1     // Catch:{ all -> 0x03bc }
            long r0 = r2.A02     // Catch:{ all -> 0x03bc }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03bc }
            r6[r5] = r0     // Catch:{ all -> 0x03bc }
            r1 = 2
            int r0 = r4.A00     // Catch:{ all -> 0x03bc }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x03bc }
            r6[r1] = r0     // Catch:{ all -> 0x03bc }
            r7.A04()     // Catch:{ all -> 0x03bc }
            X.1jC r1 = r7.A04     // Catch:{ all -> 0x03bc }
            r0 = r18
            X.0tg r8 = r0.A02     // Catch:{ all -> 0x03bc }
            boolean r7 = r1.A0E(r8)     // Catch:{ all -> 0x03bc }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x03bc }
            r5.<init>()     // Catch:{ all -> 0x03bc }
            java.lang.String r1 = " AND "
            if (r7 != 0) goto L_0x02a7
            java.lang.String r0 = "media_wa_type != 8"
            r5.append(r0)     // Catch:{ all -> 0x03bc }
            r5.append(r1)     // Catch:{ all -> 0x03bc }
        L_0x02a7:
            java.lang.String r0 = "_id IN (   SELECT _id   FROM deleted_messages_ids_view   WHERE chat_row_id = ?    AND sort_id>=?    ORDER BY sort_id ASC   LIMIT ?)"
            r5.append(r0)     // Catch:{ all -> 0x03bc }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x03bc }
            if (r7 == 0) goto L_0x02d2
            java.lang.String r0 = "message"
        L_0x02b4:
            int r16 = r8.A01(r0, r1, r6)     // Catch:{ all -> 0x03bc }
            if (r16 != 0) goto L_0x02d5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x03bc }
            r5.<init>()     // Catch:{ all -> 0x03bc }
            java.lang.String r0 = "msgstore/deletemsgs/batches stopped at ref:"
            r5.append(r0)     // Catch:{ all -> 0x03bc }
            r0 = r19
            r5.append(r0)     // Catch:{ all -> 0x03bc }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x03bc }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x03bc }
            goto L_0x03b5
        L_0x02d2:
            java.lang.String r0 = "messages"
            goto L_0x02b4
        L_0x02d5:
            X.0xN r14 = r3.A1N     // Catch:{ all -> 0x03bc }
            r13 = 0
            X.0tq r0 = r14.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x0381 }
            X.0tf r12 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0381 }
            X.11I r1 = r14.A03     // Catch:{ all -> 0x037c }
            java.lang.String r0 = "thumbnail_ready"
            r5 = 0
            int r1 = r1.A00(r0, r13)     // Catch:{ all -> 0x037c }
            r0 = 2
            if (r1 != r0) goto L_0x02ec
            r5 = 1
        L_0x02ec:
            java.lang.String r11 = "\")"
            java.lang.String r8 = "\",\""
            r7 = 1
            if (r5 == 0) goto L_0x02f4
            goto L_0x0322
        L_0x02f4:
            X.0tg r6 = r12.A02     // Catch:{ all -> 0x037c }
            java.lang.String r5 = "message_thumbnails"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x037c }
            r1.<init>()     // Catch:{ all -> 0x037c }
            java.lang.String r0 = "key_remote_jid = ? AND "
            r1.append(r0)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = "key_id IN (\""
            r1.append(r0)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = android.text.TextUtils.join(r8, r10)     // Catch:{ all -> 0x037c }
            r1.append(r0)     // Catch:{ all -> 0x037c }
            r1.append(r11)     // Catch:{ all -> 0x037c }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x037c }
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ all -> 0x037c }
            java.lang.String r0 = r31.getRawString()     // Catch:{ all -> 0x037c }
            r1[r13] = r0     // Catch:{ all -> 0x037c }
            int r5 = r6.A01(r5, r8, r1)     // Catch:{ all -> 0x037c }
            goto L_0x0364
        L_0x0322:
            X.0tg r6 = r12.A02     // Catch:{ all -> 0x037c }
            java.lang.String r5 = "message_thumbnail"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x037c }
            r1.<init>()     // Catch:{ all -> 0x037c }
            java.lang.String r0 = "message_row_id IN "
            r1.append(r0)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = "(SELECT _id FROM message WHERE chat_row_id = ? AND "
            r1.append(r0)     // Catch:{ all -> 0x037c }
            r1.append(r9)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = " IN (\""
            r1.append(r0)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = android.text.TextUtils.join(r8, r10)     // Catch:{ all -> 0x037c }
            r1.append(r0)     // Catch:{ all -> 0x037c }
            r1.append(r11)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ all -> 0x037c }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x037c }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ all -> 0x037c }
            X.0ts r1 = r14.A00     // Catch:{ all -> 0x037c }
            r0 = r31
            long r0 = r1.A02(r0)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x037c }
            r7[r13] = r0     // Catch:{ all -> 0x037c }
            int r5 = r6.A01(r5, r8, r7)     // Catch:{ all -> 0x037c }
        L_0x0364:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x037c }
            r1.<init>()     // Catch:{ all -> 0x037c }
            java.lang.String r0 = "msgstore/deleteMessageThumbnailsFor-jid/"
            r1.append(r0)     // Catch:{ all -> 0x037c }
            r1.append(r5)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x037c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x037c }
            r12.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0381 }
            goto L_0x0387
        L_0x037c:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0380 }
        L_0x0380:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0381 }
        L_0x0381:
            r1 = move-exception
            java.lang.String r0 = "msgstore/deleteMessageThumbnailsFor-jid"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x03bc }
        L_0x0387:
            r0 = r21
            r14.A06(r0)     // Catch:{ all -> 0x03bc }
            r17.A00()     // Catch:{ all -> 0x03bc }
            int r15 = r15 + r16
            r23.A00()     // Catch:{ all -> 0x03bc }
            r17.close()     // Catch:{ all -> 0x03c1 }
            r18.close()     // Catch:{ all -> 0x03db }
            r30.close()
            r1 = r22
            r0 = r32
            r0.AVM(r15, r1)
            goto L_0x008d
        L_0x03a6:
            X.16w r1 = r3.A0U
            X.0rv r0 = r4.A07
            int r22 = r1.A00(r0)
            goto L_0x0079
        L_0x03b0:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x03b4 }
        L_0x03b4:
            throw r0     // Catch:{ all -> 0x03d6 }
        L_0x03b5:
            r17.close()     // Catch:{ all -> 0x03c1 }
            r18.close()     // Catch:{ all -> 0x03db }
            goto L_0x03e6
        L_0x03bc:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x03c0 }
        L_0x03c0:
            throw r0     // Catch:{ all -> 0x03c1 }
        L_0x03c1:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x03da }
            goto L_0x03da
        L_0x03c6:
            r1 = move-exception
            X.0y0 r0 = r3.A0t     // Catch:{ all -> 0x03db }
            r0.A00(r5)     // Catch:{ all -> 0x03db }
            throw r1     // Catch:{ all -> 0x03db }
        L_0x03cd:
            android.database.Cursor r0 = r2.A00
            if (r0 == 0) goto L_0x03d4
            r0.close()
        L_0x03d4:
            r2 = 0
            goto L_0x03ea
        L_0x03d6:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x03da }
        L_0x03da:
            throw r0     // Catch:{ all -> 0x03db }
        L_0x03db:
            r1 = move-exception
            if (r2 == 0) goto L_0x03e5
            android.database.Cursor r0 = r2.A00
            if (r0 == 0) goto L_0x03e5
            r0.close()
        L_0x03e5:
            throw r1
        L_0x03e6:
            r30.close()
        L_0x03e9:
            r2 = 1
        L_0x03ea:
            boolean r0 = r32.AfQ()
            if (r0 != 0) goto L_0x03f9
            if (r39 != 0) goto L_0x03f9
            X.151 r1 = r3.A0Z
            r0 = r31
            r1.A04(r0)
        L_0x03f9:
            r3.A0N(r4)
            X.0wt r0 = r3.A0S
            r0.A00()
            r32.ARM()
            java.lang.String r0 = "msgstore/deletemsgs/batches "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r0 = r31
            r3.append(r0)
            java.lang.String r0 = " haveMessagesToDelete:"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = " timeSpent:"
            r3.append(r0)
            long r0 = r23.A01()
            r3.append(r0)
            java.lang.String r0 = " currentMessages:"
            r3.append(r0)
            r3.append(r15)
            java.lang.String r0 = " totalMessages:"
            r3.append(r0)
            r0 = r22
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            r0 = r0 ^ r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0q(X.1y1, X.1yq, boolean):boolean");
    }

    public final boolean A0r(AnonymousClass1Vt r4, C16740tZ r5) {
        int i2;
        C16040sK r0 = this.A05;
        r0.A0B();
        AnonymousClass1ZT r2 = r0.A05;
        if (r2 == null || (C16030sJ.A0L(r5.A11.A00) && !r2.equals(r4.A0E) && !r2.equals(r4.A0D))) {
            return false;
        }
        if (r5 instanceof C38861rX) {
            i2 = 15;
        } else if (r5 instanceof C38881rZ) {
            i2 = 18;
        } else {
            throw new IllegalStateException(AnonymousClass1Vo.A01("CoreMessageStore", "Handled message is not FMessagePaymentRequestDeclined or FMessagePaymentRequestCancelled"));
        }
        r4.A02 = i2;
        return true;
    }

    public boolean A0s(C15830rv r12, Long l2) {
        AnonymousClass172 r0 = this.A11;
        AnonymousClass122 r3 = r0.A05;
        long A002 = r0.A00.A00();
        C17030uP r02 = r3.A02;
        UserJid of = UserJid.of(r12);
        C32441gM r2 = new C32441gM(r02, of);
        C39341sK r32 = (C39341sK) AnonymousClass122.A00(r3.A00, r3.A03.A02(r12, true), (C30641ci) null, 67, A002);
        if (of != null) {
            r32.A00 = r2.A01();
        }
        r32.A0d = l2;
        A0f(r32, -1);
        StringBuilder sb = new StringBuilder("added plaintext disabled message; jid=");
        sb.append(r12);
        Log.i(sb.toString());
        return A0x(r32, -1);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0t(X.C15830rv r8, boolean r9) {
        /*
            r7 = this;
            X.0tq r0 = r7.A0v
            X.0tf r6 = r0.A02()
            X.1cj r5 = r6.A00()     // Catch:{ all -> 0x0036 }
            X.17r r0 = r7.A1K     // Catch:{ all -> 0x0031 }
            long r3 = r0.A00(r8)     // Catch:{ all -> 0x0031 }
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            X.17G r1 = r7.A0j     // Catch:{ all -> 0x0031 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0031 }
            java.util.Set r0 = java.util.Collections.singleton(r0)     // Catch:{ all -> 0x0031 }
            boolean r0 = r1.A0A(r0, r9)     // Catch:{ all -> 0x0031 }
        L_0x0024:
            r5.A00()     // Catch:{ all -> 0x0031 }
            goto L_0x002a
        L_0x0028:
            r0 = 0
            goto L_0x0024
        L_0x002a:
            r5.close()     // Catch:{ all -> 0x0036 }
            r6.close()
            return r0
        L_0x0031:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0035 }
        L_0x0035:
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x003a }
        L_0x003a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0t(X.0rv, boolean):boolean");
    }

    public boolean A0u(C16740tZ r3) {
        int i2 = -1;
        if (r3.A1D) {
            i2 = 22;
        }
        return A0w(r3, i2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00f2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0v(X.C16740tZ r11) {
        /*
            r10 = this;
            X.1Vw r0 = r11.A11
            X.0rv r3 = r0.A00
            X.AnonymousClass00B.A06(r3)
            boolean r0 = X.C38621r6.A0f(r11)
            r9 = 0
            if (r0 != 0) goto L_0x0109
            X.10R r0 = r10.A0M
            boolean r0 = r0.A02(r3)
            if (r0 != 0) goto L_0x0109
            X.0rt r1 = r10.A0O
            boolean r0 = r1.A0I(r3)
            if (r0 != 0) goto L_0x0081
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0C()
            java.lang.Object r0 = r0.get(r3)
            X.0rx r0 = (X.C15840rx) r0
            if (r0 == 0) goto L_0x0081
            long r4 = r0.A0L
            r1 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0081
        L_0x0032:
            X.0uq r0 = r10.A19
            long r4 = r0.A02(r3)
            r1 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0109
            boolean r0 = X.C16030sJ.A0P(r3)
            if (r0 != 0) goto L_0x0109
            X.AnonymousClass00B.A06(r3)
            X.172 r2 = r10.A11
            r0 = 25
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r5 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r5.<init>(r10, r0, r11)
            X.0rt r0 = r2.A03
            X.0rx r8 = r0.A06(r3)
            if (r8 == 0) goto L_0x00f8
            java.lang.String r0 = "disabling plaintext chat; jid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = "; current="
            r1.append(r0)
            int r0 = r8.A00
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = r8.A00
            r0 = 1
            if (r1 == r0) goto L_0x0109
            r8.A00 = r0
            X.0tq r0 = r2.A04
            X.0tf r7 = r0.A02()
            goto L_0x00a1
        L_0x0081:
            long r4 = r11.A14
            r1 = -1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0032
            boolean r0 = X.C16030sJ.A0L(r3)
            if (r0 == 0) goto L_0x009a
            X.0sO r1 = r10.A0d
            r0 = r3
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0109
        L_0x009a:
            java.lang.Long r0 = r11.A0d
            boolean r9 = r10.A0s(r3, r0)
            return r9
        L_0x00a1:
            X.1cj r6 = r7.A00()     // Catch:{ all -> 0x00f3 }
            X.0ts r4 = r2.A02     // Catch:{ all -> 0x00ee }
            monitor-enter(r8)     // Catch:{ all -> 0x00ee }
            r0 = 2
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x00eb }
            r2.<init>(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = "plaintext_disabled"
            int r0 = r8.A00     // Catch:{ all -> 0x00eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00eb }
            r2.put(r1, r0)     // Catch:{ all -> 0x00eb }
            monitor-exit(r8)     // Catch:{ all -> 0x00ee }
            X.0rv r0 = r8.A0i     // Catch:{ all -> 0x00ee }
            int r2 = r4.A00(r2, r0)     // Catch:{ all -> 0x00ee }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r1.<init>()     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "disabled plaintext chat; jid="
            r1.append(r0)     // Catch:{ all -> 0x00ee }
            r1.append(r3)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "; numRows="
            r1.append(r0)     // Catch:{ all -> 0x00ee }
            r1.append(r2)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ee }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ee }
            if (r2 <= 0) goto L_0x00e1
            r5.run()     // Catch:{ all -> 0x00ee }
        L_0x00e1:
            r6.A00()     // Catch:{ all -> 0x00ee }
            r6.close()     // Catch:{ all -> 0x00f3 }
            r7.close()
            return r9
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00ee }
            throw r0     // Catch:{ all -> 0x00ee }
        L_0x00ee:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            throw r0     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            throw r0
        L_0x00f8:
            java.lang.String r1 = "missing chat info; jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0109:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0v(X.0tZ):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0286, code lost:
        if (r2 != false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0324, code lost:
        if (java.lang.System.currentTimeMillis() > (r15 + r3[r6])) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03b2, code lost:
        if ((!r10) != false) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0095, code lost:
        if (r17 != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ce, code lost:
        if (r2 != false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011e, code lost:
        if (r2 != false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01fd, code lost:
        if (r16 != false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0213, code lost:
        if (r2 != false) goto L_0x0215;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x0310 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:211:0x0464 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:211:0x0464=Splitter:B:211:0x0464, B:200:0x0447=Splitter:B:200:0x0447} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0w(X.C16740tZ r28, int r29) {
        /*
            r27 = this;
            boolean r0 = X.C41971wz.A05()
            r4 = r28
            if (r0 == 0) goto L_0x0048
            boolean r0 = r4 instanceof X.C38841rV
            java.lang.String r5 = ""
            java.lang.String r3 = "­"
            if (r0 == 0) goto L_0x02ad
            r2 = r4
            X.1rV r2 = (X.C38841rV) r2
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x0024
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r1.replace(r3, r5)
            r2.A03 = r0
        L_0x0024:
            boolean r0 = r4.A0w()
            if (r0 == 0) goto L_0x0048
            int r0 = r4.A03()
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = r4.A0I()
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = r4.A0I()
            java.lang.String r0 = r0.replace(r3, r5)
            r4.A0k(r0)
        L_0x0048:
            X.1Vw r9 = r4.A11
            X.0rv r1 = r9.A00
            boolean r2 = X.C16030sJ.A0Q(r1)
            r19 = 0
            r0 = r27
            r5 = r29
            if (r2 != 0) goto L_0x02a6
            X.AnonymousClass00B.A06(r1)
            boolean r17 = r0.A0v(r4)
            X.182 r6 = r0.A0V
            long r2 = r4.A0I
            r6.A02(r4, r2)
            X.10R r11 = r0.A0M
            X.0rt r8 = r0.A0O
            X.0uP r6 = r11.A02
            X.0wx r3 = r11.A06
            boolean r2 = A02(r6, r8, r3, r4)
            if (r2 != 0) goto L_0x017f
            boolean r2 = A04(r8, r4)
            if (r2 != 0) goto L_0x017f
            r16 = 0
        L_0x007c:
            r15 = 0
        L_0x007d:
            X.0sK r2 = r0.A05
            boolean r2 = X.C30921dB.A01(r2, r4)
            if (r2 == 0) goto L_0x008a
            r2 = 13
            r4.A0W(r2)
        L_0x008a:
            r0.A0f(r4, r5)
        L_0x008d:
            boolean r2 = r0.A0x(r4, r5)
            if (r2 != 0) goto L_0x0097
            r18 = 0
            if (r17 == 0) goto L_0x0099
        L_0x0097:
            r18 = 1
        L_0x0099:
            if (r15 == 0) goto L_0x00d2
            X.17g r5 = r0.A1g
            X.0wx r2 = r0.A1T
            java.lang.Integer r2 = r2.A04()
            int r7 = r2.intValue()
            X.0t3 r2 = r0.A0F
            long r2 = r2.A00()
            X.18b r6 = r5.A05
            r5 = 1
            X.1Vw r6 = r6.A02(r1, r5)
            X.1ri r5 = new X.1ri
            r5.<init>(r6, r2)
            r5.A00 = r7
            r5.A0b(r1)
            java.lang.String r2 = "msgstore/addOrUpdateMessage/added backwards compat dmm ephemeral setting message"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r2 = -1
            boolean r2 = r0.A0x(r5, r2)
            if (r2 != 0) goto L_0x00d0
            r2 = r18
            r18 = 0
            if (r2 == 0) goto L_0x00d2
        L_0x00d0:
            r18 = 1
        L_0x00d2:
            X.0pd r8 = r0.A1U
            r10 = 2714(0xa9a, float:3.803E-42)
            X.0tM r7 = X.C16620tM.A02
            boolean r2 = r8.A0E(r7, r10)
            if (r2 == 0) goto L_0x0122
            boolean r2 = r9.A02
            if (r2 != 0) goto L_0x0122
            boolean r2 = r4 instanceof X.C39231s8
            if (r2 == 0) goto L_0x0122
            r12 = r4
            X.1s8 r12 = (X.C39231s8) r12
            X.0rt r3 = r0.A0O
            r2 = r1
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.1WV r13 = r3.A08(r2)
            if (r13 == 0) goto L_0x0122
            long r5 = r13.ephemeralSettingTimestamp
            long r2 = r12.A01
            int r11 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r11 >= 0) goto L_0x0122
            X.189 r3 = r0.A0W
            r2 = 0
            r3.A05(r2, r12)
            int r6 = r13.expiration
            long r2 = r12.A01
            int r5 = (int) r2
            if (r5 == r6) goto L_0x0122
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            X.AnonymousClass00B.A06(r2)
            long r2 = r2.longValue()
            boolean r2 = r0.A0z(r4, r2)
            if (r2 != 0) goto L_0x0120
            r2 = r18
            r18 = 0
            if (r2 == 0) goto L_0x0122
        L_0x0120:
            r18 = 1
        L_0x0122:
            boolean r2 = r8.A0E(r7, r10)
            if (r2 == 0) goto L_0x0381
            if (r16 != 0) goto L_0x0381
            X.10R r2 = r0.A0M
            X.0rt r5 = r0.A0O
            X.0sG r3 = r0.A0A
            X.0uP r6 = r2.A02
            X.0wx r2 = r2.A06
            boolean r2 = A02(r6, r5, r2, r4)
            if (r2 == 0) goto L_0x0381
            boolean r2 = r9.A02
            if (r2 != 0) goto L_0x0381
            boolean r2 = X.C16030sJ.A0O(r1)
            if (r2 == 0) goto L_0x0381
            r12 = r1
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            boolean r2 = r6.A02(r12)
            if (r2 != 0) goto L_0x0381
            boolean r2 = r4 instanceof X.C38971ri
            if (r2 != 0) goto L_0x0381
            boolean r2 = r4 instanceof X.C39231s8
            if (r2 != 0) goto L_0x0381
            X.0rx r2 = r5.A06(r1)
            if (r2 == 0) goto L_0x0381
            boolean r2 = X.C40491uD.A07(r3, r5, r4)
            if (r2 == 0) goto L_0x0381
            X.182 r10 = r0.A0V
            X.0t3 r2 = r0.A0F
            r20 = r2
            r11 = 1
            if (r1 == 0) goto L_0x0326
            java.lang.String r14 = r1.getRawString()
            int r6 = r10.A01(r14)
            long[] r3 = X.C40491uD.A00
            int r2 = r3.length
            if (r6 >= r2) goto L_0x0381
            X.0tq r2 = r10.A05
            X.0tf r17 = r2.get()
            goto L_0x02e1
        L_0x017f:
            X.AnonymousClass00B.A06(r1)
            r10 = r1
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            boolean r2 = A03(r6, r8, r3, r4)
            if (r2 == 0) goto L_0x01e5
            r16 = 1
        L_0x018d:
            X.0uP r6 = r0.A0B
            X.0wx r3 = r0.A1T
            boolean r2 = A03(r6, r8, r3, r4)
            if (r2 != 0) goto L_0x0219
            boolean r2 = A04(r8, r4)
            if (r2 != 0) goto L_0x0219
            boolean r2 = A05(r8, r4)
            if (r2 != 0) goto L_0x0219
            boolean r2 = r4 instanceof X.C40401u3
            if (r2 == 0) goto L_0x0200
            X.189 r2 = r0.A0W
            X.122 r6 = r2.A06
            X.AnonymousClass00B.A06(r1)
            X.AnonymousClass00B.A06(r1)
            long r14 = r4.A0I
            X.18b r3 = r6.A03
            r2 = 1
            X.1Vw r11 = r3.A02(r1, r2)
            X.0so r10 = r6.A00
            r13 = 80
            r12 = 0
            X.1WU r7 = X.AnonymousClass122.A00(r10, r11, r12, r13, r14)
            r7.A0b(r1)
            r6 = -1
            r0.A0f(r7, r6)
            java.lang.String r2 = "added ephemeral keep in chat system message; jid="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            X.1Vw r2 = r7.A11
            X.0rv r2 = r2.A00
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            boolean r17 = r0.A0x(r7, r6)
            goto L_0x007c
        L_0x01e5:
            long r2 = r4.A0I
            int r7 = r4.A04
            java.lang.Long r6 = r4.A0Y
            X.1WV r22 = r8.A08(r10)
            r20 = r11
            r21 = r10
            r23 = r6
            r24 = r7
            r25 = r2
            boolean r16 = r20.A03(r21, r22, r23, r24, r25)
            if (r16 == 0) goto L_0x007c
            goto L_0x018d
        L_0x0200:
            java.lang.Long r2 = r4.A0Y
            X.AnonymousClass00B.A06(r2)
            long r2 = r2.longValue()
            boolean r2 = r0.A0z(r4, r2)
            if (r2 != 0) goto L_0x0215
            r2 = r17
            r17 = 0
            if (r2 == 0) goto L_0x007c
        L_0x0215:
            r17 = 1
            goto L_0x007c
        L_0x0219:
            boolean r15 = A03(r6, r8, r3, r4)
            X.189 r11 = r0.A0W
            X.0rt r3 = r11.A03
            boolean r2 = A04(r3, r4)
            if (r2 != 0) goto L_0x028c
            boolean r2 = A05(r3, r4)
            if (r2 != 0) goto L_0x028c
            long r2 = r4.A0I
            r8 = 1
            X.0wx r7 = r11.A05
            java.lang.Integer r6 = r7.A04()
            int r10 = r6.intValue()
            X.0sK r6 = r11.A00
            r6.A0B()
            X.1ZT r6 = r6.A05
            X.AnonymousClass00B.A06(r6)
            long r13 = r7.A01(r6)
        L_0x0248:
            X.122 r12 = r11.A06
            com.whatsapp.jid.UserJid r11 = com.whatsapp.jid.UserJid.of(r1)
            X.AnonymousClass00B.A06(r11)
            X.18b r7 = r12.A03
            r6 = 1
            X.1Vw r21 = r7.A02(r11, r6)
            X.0so r6 = r12.A00
            r23 = 68
            r22 = 0
            r20 = r6
            r24 = r2
            X.1WU r6 = X.AnonymousClass122.A00(r20, r21, r22, r23, r24)
            X.1tr r6 = (X.C40281tr) r6
            r6.A00 = r10
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            r6.A0i(r2)
            r6.A00 = r8
            r3 = -1
            r0.A0f(r6, r3)
            java.lang.String r2 = "added Disappearing Mode System Message"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            boolean r2 = r0.A0x(r6, r3)
            if (r2 != 0) goto L_0x0288
            r2 = r17
            r17 = 0
            if (r2 == 0) goto L_0x007d
        L_0x0288:
            r17 = 1
            goto L_0x007d
        L_0x028c:
            long r2 = r4.A0I
            int r10 = r4.A04
            int r7 = r4.A00
            java.lang.Long r6 = r4.A0Y
            X.AnonymousClass00B.A06(r6)
            long r13 = r6.longValue()
            boolean r6 = r9.A02
            r8 = 1
            if (r6 != 0) goto L_0x02a4
            if (r7 != r8) goto L_0x0248
            r8 = 2
            goto L_0x0248
        L_0x02a4:
            r8 = r7
            goto L_0x0248
        L_0x02a6:
            r17 = 0
            r16 = 0
            r15 = 0
            goto L_0x008d
        L_0x02ad:
            boolean r0 = r4 instanceof X.C16730tY
            if (r0 == 0) goto L_0x02c8
            r2 = r4
            X.0tY r2 = (X.C16730tY) r2
            java.lang.String r1 = r2.A13()
            if (r1 == 0) goto L_0x0024
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r1.replace(r3, r5)
            r2.A03 = r0
            goto L_0x0024
        L_0x02c8:
            boolean r0 = r4 instanceof X.C30581cc
            if (r0 == 0) goto L_0x0024
            r2 = r4
            X.1cc r2 = (X.C30581cc) r2
            java.lang.String r1 = r2.A06
            if (r1 == 0) goto L_0x0024
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r1.replace(r3, r5)
            r2.A06 = r0
            goto L_0x0024
        L_0x02e1:
            r2 = r17
            X.0tg r15 = r2.A02     // Catch:{ all -> 0x0311 }
            java.lang.String r13 = "SELECT last_sync_response_sent_timestamp FROM message_ephemeral_sync_response WHERE chat_jid = ?"
            java.lang.String[] r2 = new java.lang.String[r11]     // Catch:{ all -> 0x0311 }
            r2[r19] = r14     // Catch:{ all -> 0x0311 }
            android.database.Cursor r2 = r15.A08(r13, r2)     // Catch:{ all -> 0x0311 }
            boolean r13 = r2.moveToNext()     // Catch:{ all -> 0x030a }
            if (r13 == 0) goto L_0x0306
            java.lang.String r13 = "last_sync_response_sent_timestamp"
            int r13 = r2.getColumnIndexOrThrow(r13)     // Catch:{ all -> 0x030a }
            long r15 = r2.getLong(r13)     // Catch:{ all -> 0x030a }
            r2.close()     // Catch:{ all -> 0x0311 }
            r17.close()
            goto L_0x031b
        L_0x0306:
            r2.close()     // Catch:{ all -> 0x0311 }
            goto L_0x0316
        L_0x030a:
            r0 = move-exception
            if (r2 == 0) goto L_0x0310
            r2.close()     // Catch:{ all -> 0x0310 }
        L_0x0310:
            throw r0     // Catch:{ all -> 0x0311 }
        L_0x0311:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x0469 }
            throw r0
        L_0x0316:
            r17.close()
            r15 = 0
        L_0x031b:
            long r13 = java.lang.System.currentTimeMillis()
            r2 = r3[r6]
            long r15 = r15 + r2
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x0381
        L_0x0326:
            X.1WV r3 = r5.A08(r12)
            if (r3 == 0) goto L_0x0381
            java.lang.Long r2 = r4.A0Y
            if (r2 == 0) goto L_0x0381
            long r13 = r2.longValue()
            long r5 = r3.ephemeralSettingTimestamp
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0381
            X.17g r15 = r0.A1g
            com.whatsapp.jid.DeviceJid r14 = r4.A19
            int r13 = r3.expiration
            long r2 = r20.A00()
            X.18b r15 = r15.A05
            X.1Vw r15 = r15.A02(r12, r11)
            X.1s8 r11 = new X.1s8
            r11.<init>(r15, r2)
            r11.A00 = r13
            r11.A01 = r5
            r11.A0b(r12)
            r11.A02 = r14
            java.lang.String r2 = "msgstore/addOrUpdateMessage/added ephemeral sync response message"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r2 = -1
            boolean r2 = r0.A0x(r11, r2)
            if (r2 != 0) goto L_0x0366
            if (r18 == 0) goto L_0x0368
        L_0x0366:
            r19 = 1
        L_0x0368:
            if (r1 == 0) goto L_0x037f
            java.lang.String r2 = r1.getRawString()
            int r5 = r10.A01(r2)
            java.lang.String r6 = r1.getRawString()
            long r2 = java.lang.System.currentTimeMillis()
            int r5 = r5 + 1
            r10.A03(r5, r6, r2)
        L_0x037f:
            r18 = r19
        L_0x0381:
            r2 = 1302(0x516, float:1.824E-42)
            boolean r2 = r8.A0E(r7, r2)
            if (r2 == 0) goto L_0x03f0
            java.lang.String r3 = r4.A0k
            java.lang.String r2 = "directory"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x03f0
            if (r1 == 0) goto L_0x03f0
            X.10R r2 = r0.A0M
            boolean r3 = r2.A02(r1)
            r2 = 1
            if (r3 == 0) goto L_0x03b4
            java.util.Map r6 = X.C42861yn.A00
            java.lang.Object r3 = r6.get(r1)
            if (r3 == 0) goto L_0x040a
            java.lang.Object r3 = r6.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r10 = r3.booleanValue()
        L_0x03b0:
            r3 = r10 ^ 1
            if (r3 == 0) goto L_0x03f0
        L_0x03b4:
            X.0sK r5 = r0.A05
            r5.A0B()
            X.1ZT r3 = r5.A05
            if (r3 == 0) goto L_0x03f0
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.of(r1)
            boolean r3 = r9.A02
            X.122 r6 = r0.A1h
            if (r3 == 0) goto L_0x03f1
            r5.A0B()
            X.1ZT r5 = r5.A05
            X.0t3 r3 = r0.A0F
            long r10 = r3.A00()
            X.18b r3 = r6.A03
            X.1Vw r7 = r3.A02(r4, r2)
            X.0so r6 = r6.A00
            r9 = 76
            r8 = 0
            X.1WU r3 = X.AnonymousClass122.A00(r6, r7, r8, r9, r10)
            r3.A0b(r5)
        L_0x03e4:
            r0.A0u(r3)
            java.util.Map r3 = X.C42861yn.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.put(r1, r0)
        L_0x03f0:
            return r18
        L_0x03f1:
            X.0t3 r3 = r0.A0F
            long r10 = r3.A00()
            X.18b r3 = r6.A03
            X.1Vw r7 = r3.A02(r4, r2)
            X.0so r6 = r6.A00
            r9 = 76
            r8 = 0
            X.1WU r3 = X.AnonymousClass122.A00(r6, r7, r8, r9, r10)
            r3.A0b(r4)
            goto L_0x03e4
        L_0x040a:
            X.17r r8 = r0.A1K
            X.0tq r3 = r8.A03
            X.0tf r5 = r3.get()
            r10 = 1
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch:{ all -> 0x0465 }
            X.0ts r3 = r8.A01     // Catch:{ all -> 0x0465 }
            long r3 = r3.A02(r1)     // Catch:{ all -> 0x0465 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0465 }
            r3 = 0
            r7[r3] = r4     // Catch:{ all -> 0x0465 }
            boolean r3 = r8.A02()     // Catch:{ all -> 0x0465 }
            if (r3 == 0) goto L_0x0431
            java.lang.String r4 = "SELECT EXISTS( SELECT * FROM message_system JOIN message_view ON message_view._id = message_system.message_row_id  WHERE chat_row_id = ?  AND  action_type = 76) as chat_exists"
        L_0x042a:
            X.0tg r3 = r5.A02     // Catch:{ all -> 0x0465 }
            android.database.Cursor r4 = r3.A08(r4, r7)     // Catch:{ all -> 0x0465 }
            goto L_0x0434
        L_0x0431:
            java.lang.String r4 = "SELECT EXISTS( SELECT * FROM message_view WHERE chat_row_id = ? AND message_type = 7 AND (media_size = 76 )) as chat_exists"
            goto L_0x042a
        L_0x0434:
            boolean r3 = r4.moveToFirst()     // Catch:{ all -> 0x045e }
            if (r3 == 0) goto L_0x044e
            java.lang.String r3 = "chat_exists"
            int r3 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x045e }
            int r3 = r4.getInt(r3)     // Catch:{ all -> 0x045e }
            if (r3 == r2) goto L_0x0447
            r10 = 0
        L_0x0447:
            r4.close()     // Catch:{ all -> 0x0465 }
            r5.close()
            goto L_0x0455
        L_0x044e:
            r4.close()     // Catch:{ all -> 0x0465 }
            r5.close()
            r10 = 0
        L_0x0455:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)
            r6.put(r1, r3)
            goto L_0x03b0
        L_0x045e:
            r0 = move-exception
            if (r4 == 0) goto L_0x0464
            r4.close()     // Catch:{ all -> 0x0464 }
        L_0x0464:
            throw r0     // Catch:{ all -> 0x0465 }
        L_0x0465:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0469 }
        L_0x0469:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0w(X.0tZ, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00af, code lost:
        if (r3 >= 0) goto L_0x00b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0x(X.C16740tZ r35, int r36) {
        /*
            r34 = this;
            r1 = r34
            X.0t3 r3 = r1.A0F
            long r8 = android.os.SystemClock.uptimeMillis()
            r5 = 1
            r0 = r35
            X.1yo r4 = r1.A0D(r0, r5)
            boolean r2 = r4.A04
            r10 = r36
            if (r2 == 0) goto L_0x0085
            X.0vN r7 = r1.A0T
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r8
            java.lang.String r6 = "CoreMessageStore/writeMessageToDatabase"
            r7.A00(r6, r2)
            X.1Vw r9 = r0.A11
            boolean r8 = r9.A02
            if (r8 == 0) goto L_0x005f
            boolean r2 = r0.A1D
            if (r2 != 0) goto L_0x005f
            long r27 = android.os.SystemClock.uptimeMillis()
            long r2 = r0.A1G
            long r27 = r27 - r2
            long r25 = android.os.SystemClock.uptimeMillis()
            X.0w1 r12 = r1.A06
            r16 = 0
            int r11 = r0.A0A
            r14 = 0
            long r6 = r0.A18
            long r23 = r25 - r6
            long r25 = r25 - r2
            r15 = 2
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r13 = r0
            r22 = r11
            r12.A0J(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r29, r30, r31, r32, r33)
        L_0x005f:
            r6 = 4
            if (r8 == 0) goto L_0x006f
            int r2 = r0.A0C
            int r2 = X.C42881yp.A00(r2, r6)
            if (r2 >= 0) goto L_0x006f
            java.util.Map r2 = r1.A1o
            r2.put(r9, r0)
        L_0x006f:
            long r2 = r0.A16
            r1.A0M(r2)
            boolean r2 = r4.A00
            if (r2 == 0) goto L_0x0195
            X.17E r1 = r1.A0e
            android.os.Handler r2 = r1.A00
            r1 = 0
            android.os.Message r0 = android.os.Message.obtain(r2, r6, r10, r1, r0)
            r0.sendToTarget()
            return r5
        L_0x0085:
            r8 = 0
            boolean r2 = r4.A02
            if (r2 == 0) goto L_0x0187
            X.1Vw r11 = r0.A11
            boolean r2 = r11.A02
            if (r2 == 0) goto L_0x0094
            boolean r2 = r0.A1D
            if (r2 == 0) goto L_0x0178
        L_0x0094:
            X.0th r2 = r1.A0K
            X.0tZ r4 = r2.A03(r11)
            if (r4 == 0) goto L_0x0178
            r9 = r0
            long r14 = r3.A00()
            int r2 = r0.A04
            if (r2 <= 0) goto L_0x00b1
            long r6 = r4.A0I
            long r2 = (long) r2
            r12 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r12
            long r6 = r6 + r2
            int r3 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            r2 = 1
            if (r3 < 0) goto L_0x00b2
        L_0x00b1:
            r2 = 0
        L_0x00b2:
            r6 = 11
            r12 = 0
            r7 = 0
            if (r2 == 0) goto L_0x00ce
            boolean r7 = r1.A10(r0, r4)
        L_0x00bc:
            r9 = r12
        L_0x00bd:
            if (r7 == 0) goto L_0x0178
            X.17E r0 = r1.A0e
            android.os.Handler r1 = r0.A02
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r9, r4)
            android.os.Message r0 = android.os.Message.obtain(r1, r6, r0)
            goto L_0x01ab
        L_0x00ce:
            byte r3 = r4.A10
            r2 = 31
            if (r3 != r2) goto L_0x00d9
            boolean r7 = r1.A11(r0, r4)
            goto L_0x00bd
        L_0x00d9:
            if (r3 != r6) goto L_0x0178
            X.1Vw r2 = r4.A11
            X.0rv r2 = r2.A00
            boolean r2 = X.C16030sJ.A0Q(r2)
            if (r2 == 0) goto L_0x0118
            long r2 = r4.A0I
            r0.A0I = r2
            r1.A0g(r4, r5, r8)
            long r11 = android.os.SystemClock.uptimeMillis()
            X.1yo r2 = r1.A0D(r0, r5)
            boolean r2 = r2.A04
            if (r2 == 0) goto L_0x0113
            X.0vN r7 = r1.A0T
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r11
            java.lang.String r5 = "CoreMessageStore/writeMessageToDatabase"
            r7.A00(r5, r2)
            X.17E r2 = r1.A0e
            android.os.Handler r5 = r2.A00
            r3 = 20
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0
            r2.<init>((java.lang.Object) r1, (int) r10, (java.lang.Object) r0, (int) r3)
            r5.post(r2)
            r7 = 1
        L_0x0113:
            r12 = r0
        L_0x0114:
            X.C38621r6.A0L(r0)
            goto L_0x00bc
        L_0x0118:
            r2 = 32
            boolean r2 = r4.A10(r2)
            if (r2 == 0) goto L_0x0144
            r2 = 8
            boolean r2 = r0.A10(r2)
            if (r2 != 0) goto L_0x016e
            boolean r2 = r0 instanceof X.C30591cd
            if (r2 != 0) goto L_0x016e
            java.lang.String r2 = "msgstore/addmessage/crypto-retry-reject/mismatch declared hsm"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.17g r9 = r1.A1g
            long r2 = r0.A0I
            r7 = 19
            X.0tZ r2 = r9.A01(r11, r7, r2)
            r2.A0X(r5)
            boolean r7 = r1.A11(r2, r4)
        L_0x0142:
            r12 = r0
            goto L_0x0114
        L_0x0144:
            r3 = 36
            byte r2 = r0.A10
            if (r3 != r2) goto L_0x016e
            X.0rv r2 = r11.A00
            boolean r2 = r2 instanceof com.whatsapp.jid.UserJid
            if (r2 == 0) goto L_0x0173
            X.1ri r9 = (X.C38971ri) r9
            X.189 r2 = r1.A0W
            X.122 r7 = r2.A06
            X.1Vw r11 = r9.A11
            long r2 = r9.A0I
            int r5 = r9.A00
            X.0so r10 = r7.A00
            r13 = 60
            r14 = r2
            X.1WU r12 = X.AnonymousClass122.A00(r10, r11, r12, r13, r14)
            X.1sQ r12 = (X.C39401sQ) r12
            r12.A00 = r5
            boolean r7 = r1.A11(r12, r4)
            goto L_0x0114
        L_0x016e:
            boolean r7 = r1.A11(r0, r4)
            goto L_0x0142
        L_0x0173:
            boolean r7 = r1.A10(r0, r4)
            goto L_0x0114
        L_0x0178:
            long r2 = r0.A16
            r1.A0M(r2)
            X.17E r1 = r1.A0e
            android.os.Handler r2 = r1.A00
            r1 = 3
            android.os.Message r0 = android.os.Message.obtain(r2, r1, r0)
            goto L_0x01ab
        L_0x0187:
            boolean r2 = r4.A03
            if (r2 != 0) goto L_0x018f
            X.1yo r2 = X.C42871yo.A05
            if (r4 != r2) goto L_0x01ae
        L_0x018f:
            X.17f r1 = r1.A1a
            r1.A03(r0)
            return r8
        L_0x0195:
            r8 = 0
            X.17E r1 = r1.A0e
            android.os.Handler r2 = r1.A00
            r1 = 5
            android.os.Message r1 = android.os.Message.obtain(r2, r1, r10, r8, r0)
            r1.sendToTarget()
            boolean r1 = r4.A01
            if (r1 == 0) goto L_0x01ae
            r1 = 6
            android.os.Message r0 = android.os.Message.obtain(r2, r1, r10, r8, r0)
        L_0x01ab:
            r0.sendToTarget()
        L_0x01ae:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0x(X.0tZ, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (X.C16030sJ.A0Q(r2) != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r4 == 1) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x017a, code lost:
        if (r17 != false) goto L_0x017c;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:230:0x0392 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:237:0x039a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:245:0x03a4 */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x03df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0y(X.C16740tZ r27, int r28) {
        /*
            r26 = this;
            r3 = r26
            X.0t3 r1 = r3.A0F
            long r13 = android.os.SystemClock.uptimeMillis()
            r10 = 1
            r5 = r27
            r5.A0X(r10)
            X.1Vw r9 = r5.A11
            X.0tq r7 = r3.A0v     // Catch:{ IOException -> 0x03a7 }
            X.0tf r8 = r7.A02()     // Catch:{ IOException -> 0x03a7 }
            X.1cj r19 = r8.A00()     // Catch:{ all -> 0x039e }
            boolean r0 = r9.A02     // Catch:{ all -> 0x0395 }
            if (r0 == 0) goto L_0x0032
            boolean r0 = r5.A0t     // Catch:{ all -> 0x0395 }
            if (r0 == 0) goto L_0x0032
            X.0rv r2 = r9.A00     // Catch:{ all -> 0x0395 }
            boolean r0 = X.C16030sJ.A0G(r2)     // Catch:{ all -> 0x0395 }
            if (r0 == 0) goto L_0x0032
            boolean r0 = X.C16030sJ.A0Q(r2)     // Catch:{ all -> 0x0395 }
            r18 = 1
            if (r0 == 0) goto L_0x0034
        L_0x0032:
            r18 = 0
        L_0x0034:
            r0 = 4
            r4 = r28
            if (r4 == r0) goto L_0x003d
            r17 = 0
            if (r4 != r10) goto L_0x003f
        L_0x003d:
            r17 = 1
        L_0x003f:
            if (r18 == 0) goto L_0x008e
            if (r17 == 0) goto L_0x008e
            java.util.List r15 = r5.A0Q()     // Catch:{ all -> 0x0395 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0395 }
            r6.<init>()     // Catch:{ all -> 0x0395 }
            long r24 = r1.A00()     // Catch:{ all -> 0x0395 }
            X.AnonymousClass00B.A06(r15)     // Catch:{ all -> 0x0395 }
            java.util.Iterator r12 = r15.iterator()     // Catch:{ all -> 0x0395 }
            r2 = 0
        L_0x0058:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x0090
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x0393 }
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11     // Catch:{ all -> 0x0393 }
            X.181 r0 = r3.A0J     // Catch:{ SQLiteConstraintException -> 0x0087 }
            r20 = r0
            r21 = r11
            r22 = r5
            r23 = r6
            X.0tZ r1 = r20.A00(r21, r22, r23, r24)     // Catch:{ SQLiteConstraintException -> 0x0087 }
            X.10R r0 = r3.A0M     // Catch:{ SQLiteConstraintException -> 0x0087 }
            boolean r0 = r0.A02(r11)     // Catch:{ SQLiteConstraintException -> 0x0087 }
            r3.A0v(r1)     // Catch:{ SQLiteConstraintException -> 0x0087 }
            r3.A0V(r11, r1, r0)     // Catch:{ SQLiteConstraintException -> 0x0087 }
            r3.A0X(r1)     // Catch:{ SQLiteConstraintException -> 0x0087 }
            r3.A0Y(r1)     // Catch:{ SQLiteConstraintException -> 0x0087 }
            int r2 = r2 + 1
            goto L_0x0058
        L_0x0087:
            r1 = move-exception
            java.lang.String r0 = "msgstore/updatemessageinbackground duplicate"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x0393 }
            goto L_0x0058
        L_0x008e:
            r2 = 0
            goto L_0x009c
        L_0x0090:
            int r1 = r15.size()     // Catch:{ all -> 0x0393 }
            int r0 = r6.size()     // Catch:{ all -> 0x0393 }
            if (r1 != r0) goto L_0x00a2
            r5.A0s = r6     // Catch:{ all -> 0x0393 }
        L_0x009c:
            X.1Vt r1 = r5.A0L     // Catch:{ all -> 0x0393 }
            if (r1 == 0) goto L_0x00d5
            monitor-enter(r1)     // Catch:{ all -> 0x0393 }
            goto L_0x00ae
        L_0x00a2:
            int r0 = r6.size()     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = "msgstore/validateBroadcastParticipantSizes failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0393 }
            goto L_0x009c
        L_0x00ae:
            boolean r0 = r1.A0O     // Catch:{ all -> 0x01aa }
            monitor-exit(r1)     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x00d5
            X.0wS r0 = r3.A1f     // Catch:{ all -> 0x0393 }
            r0.A06()     // Catch:{ all -> 0x0393 }
            X.16r r0 = r0.A08     // Catch:{ all -> 0x0393 }
            java.lang.String r6 = r0.A0Q(r5, r10)     // Catch:{ all -> 0x0393 }
            r7.A04()     // Catch:{ all -> 0x0393 }
            X.1jC r0 = r7.A04     // Catch:{ all -> 0x0393 }
            boolean r0 = r0.A0D(r8)     // Catch:{ all -> 0x0393 }
            r1 = 0
            if (r0 == 0) goto L_0x00cd
            r3.A0h(r5, r6, r1)     // Catch:{ all -> 0x0393 }
        L_0x00cd:
            X.1Vt r0 = r5.A0L     // Catch:{ all -> 0x0393 }
            r0.A09(r1)     // Catch:{ all -> 0x0393 }
            r3.A0c(r5)     // Catch:{ all -> 0x0393 }
        L_0x00d5:
            r11 = 5
            if (r4 != r11) goto L_0x00f5
            long r0 = r5.A0F     // Catch:{ all -> 0x0393 }
            r15 = 0
            int r6 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r6 != 0) goto L_0x00f5
            r7.A04()     // Catch:{ all -> 0x0393 }
            X.1jC r0 = r7.A04     // Catch:{ all -> 0x0393 }
            boolean r0 = r0.A0D(r8)     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x00f0
            X.17q r0 = r3.A16     // Catch:{ all -> 0x0393 }
            r0.A02(r5)     // Catch:{ all -> 0x0393 }
        L_0x00f0:
            X.17q r0 = r3.A16     // Catch:{ all -> 0x0393 }
            r0.A01(r5)     // Catch:{ all -> 0x0393 }
        L_0x00f5:
            r7 = 0
            r6 = 6
            if (r4 == r6) goto L_0x00ff
            r0 = 11
            if (r4 == r0) goto L_0x00ff
            if (r4 != r11) goto L_0x0104
        L_0x00ff:
            X.17F r0 = r3.A0a     // Catch:{ all -> 0x0393 }
            r0.A0O(r5)     // Catch:{ all -> 0x0393 }
        L_0x0104:
            if (r4 == r11) goto L_0x0108
            if (r4 != r6) goto L_0x013e
        L_0x0108:
            X.182 r11 = r3.A0V     // Catch:{ all -> 0x0393 }
            long r0 = r5.A0I     // Catch:{ all -> 0x0393 }
            r11.A02(r5, r0)     // Catch:{ all -> 0x0393 }
            X.0rv r1 = r9.A00     // Catch:{ all -> 0x0393 }
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x0143
            int r0 = r5.A04     // Catch:{ all -> 0x0393 }
            if (r0 <= 0) goto L_0x011c
            r11.A04(r5)     // Catch:{ all -> 0x0393 }
        L_0x011c:
            X.189 r0 = r3.A0W     // Catch:{ all -> 0x0393 }
            java.lang.Integer r0 = r0.A02(r5)     // Catch:{ all -> 0x0393 }
            if (r0 != 0) goto L_0x0129
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0393 }
        L_0x0129:
            int r1 = r0.intValue()     // Catch:{ all -> 0x0393 }
            int r0 = r5.A04     // Catch:{ all -> 0x0393 }
            if (r1 == r0) goto L_0x013e
            r0 = 16384(0x4000, float:2.2959E-41)
            boolean r0 = r5.A10(r0)     // Catch:{ all -> 0x0393 }
            if (r0 != 0) goto L_0x013e
            r0 = 512(0x200, float:7.175E-43)
            r5.A0S(r0)     // Catch:{ all -> 0x0393 }
        L_0x013e:
            X.17G r1 = r3.A0j     // Catch:{ all -> 0x0393 }
            if (r18 == 0) goto L_0x017c
            goto L_0x0179
        L_0x0143:
            boolean r0 = X.C16030sJ.A0L(r1)     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x011c
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x0393 }
            X.0tq r0 = r11.A05     // Catch:{ all -> 0x0393 }
            X.0tf r12 = r0.A02()     // Catch:{ all -> 0x0393 }
            int r0 = r5.A04     // Catch:{ all -> 0x038e }
            if (r0 <= 0) goto L_0x0160
            int r0 = X.AnonymousClass182.A00(r12, r5)     // Catch:{ all -> 0x038e }
            if (r0 != 0) goto L_0x0175
            r11.A04(r5)     // Catch:{ all -> 0x038e }
            goto L_0x0175
        L_0x0160:
            X.0tg r15 = r12.A02     // Catch:{ all -> 0x038e }
            java.lang.String r11 = "message_ephemeral"
            java.lang.String r9 = "message_row_id = ?"
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x038e }
            r16 = 0
            long r0 = r5.A13     // Catch:{ all -> 0x038e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x038e }
            r10[r16] = r0     // Catch:{ all -> 0x038e }
            r15.A01(r11, r9, r10)     // Catch:{ all -> 0x038e }
        L_0x0175:
            r12.close()     // Catch:{ all -> 0x0393 }
            goto L_0x011c
        L_0x0179:
            r0 = 1
            if (r17 == 0) goto L_0x017d
        L_0x017c:
            r0 = 0
        L_0x017d:
            r1.A07(r5, r0)     // Catch:{ all -> 0x0393 }
            X.0tm r9 = r5.A0F()     // Catch:{ all -> 0x0393 }
            if (r9 == 0) goto L_0x01ae
            monitor-enter(r9)     // Catch:{ all -> 0x0393 }
            boolean r0 = r9.A02     // Catch:{ all -> 0x01a7 }
            monitor-exit(r9)     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x01ae
            byte[] r0 = r9.A07()     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x019d
            X.0xN r1 = r3.A1N     // Catch:{ all -> 0x0393 }
            byte[] r0 = r9.A07()     // Catch:{ all -> 0x0393 }
            r1.A02(r5, r0)     // Catch:{ all -> 0x0393 }
        L_0x019b:
            monitor-enter(r9)     // Catch:{ all -> 0x0393 }
            goto L_0x01a3
        L_0x019d:
            X.0xN r0 = r3.A1N     // Catch:{ all -> 0x0393 }
            r0.A01(r5)     // Catch:{ all -> 0x0393 }
            goto L_0x019b
        L_0x01a3:
            r0 = 0
            r9.A02 = r0     // Catch:{ all -> 0x01a7 }
            goto L_0x01ad
        L_0x01a7:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0393 }
            goto L_0x01ac
        L_0x01aa:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0393 }
        L_0x01ac:
            throw r0     // Catch:{ all -> 0x0393 }
        L_0x01ad:
            monitor-exit(r9)     // Catch:{ all -> 0x0393 }
        L_0x01ae:
            X.1cv r10 = r5.A0U     // Catch:{ all -> 0x0393 }
            if (r10 == 0) goto L_0x01bd
            java.lang.String r0 = r10.A06     // Catch:{ all -> 0x0393 }
            if (r0 != 0) goto L_0x01bd
            X.18B r9 = r3.A0x     // Catch:{ all -> 0x0393 }
            long r0 = r5.A13     // Catch:{ all -> 0x0393 }
            r9.A00(r10, r0)     // Catch:{ all -> 0x0393 }
        L_0x01bd:
            boolean r9 = r5 instanceof X.C16730tY     // Catch:{ all -> 0x0393 }
            if (r9 == 0) goto L_0x01c6
            X.17I r0 = r3.A0k     // Catch:{ all -> 0x0393 }
            r0.A07(r5)     // Catch:{ all -> 0x0393 }
        L_0x01c6:
            boolean r0 = r5 instanceof X.C38771rO     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x01f6
            X.17p r7 = r3.A0w     // Catch:{ all -> 0x0393 }
            r1 = r5
            X.1rO r1 = (X.C38771rO) r1     // Catch:{ all -> 0x0393 }
            boolean r0 = r1.A00     // Catch:{ all -> 0x0393 }
            if (r0 != 0) goto L_0x01d6
            r7.A00(r1)     // Catch:{ all -> 0x0393 }
        L_0x01d6:
            boolean r0 = r5 instanceof X.C30591cd     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x01df
            X.17z r0 = r3.A1L     // Catch:{ all -> 0x0393 }
            r0.A02(r5)     // Catch:{ all -> 0x0393 }
        L_0x01df:
            boolean r0 = r5.A0x()     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x02d6
            X.0vM r11 = r3.A0f     // Catch:{ all -> 0x0393 }
            X.1sA r0 = r5.A0E()     // Catch:{ all -> 0x0393 }
            X.1sB r10 = r0.A00     // Catch:{ all -> 0x0393 }
            long r0 = r5.A13     // Catch:{ all -> 0x0393 }
            java.lang.String r7 = "message_ui_elements"
            r11.A09(r10, r7, r0)     // Catch:{ all -> 0x0393 }
            goto L_0x02d6
        L_0x01f6:
            boolean r0 = r5 instanceof X.C30071bh     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x0203
            X.185 r1 = r3.A0c     // Catch:{ all -> 0x0393 }
            r0 = r5
            X.1bh r0 = (X.C30071bh) r0     // Catch:{ all -> 0x0393 }
            r1.A03(r0)     // Catch:{ all -> 0x0393 }
            goto L_0x01d6
        L_0x0203:
            boolean r0 = r5 instanceof X.C30901d9     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x0210
            X.17x r1 = r3.A0i     // Catch:{ all -> 0x0393 }
            r0 = r5
            X.1d9 r0 = (X.C30901d9) r0     // Catch:{ all -> 0x0393 }
            r1.A00(r0)     // Catch:{ all -> 0x0393 }
            goto L_0x01d6
        L_0x0210:
            boolean r0 = r5 instanceof X.C39021rn     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x021d
            X.17l r1 = r3.A0z     // Catch:{ all -> 0x0393 }
            r0 = r5
            X.1rn r0 = (X.C39021rn) r0     // Catch:{ all -> 0x0393 }
            r1.A01(r0)     // Catch:{ all -> 0x0393 }
            goto L_0x01d6
        L_0x021d:
            boolean r0 = r5 instanceof X.C39041rp     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x022a
            X.0vM r1 = r3.A0f     // Catch:{ all -> 0x0393 }
            r0 = r5
            X.1rp r0 = (X.C39041rp) r0     // Catch:{ all -> 0x0393 }
            r1.A0D(r0)     // Catch:{ all -> 0x0393 }
            goto L_0x01d6
        L_0x022a:
            boolean r0 = r5 instanceof X.C39051rq     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x0237
            X.0vM r1 = r3.A0f     // Catch:{ all -> 0x0393 }
            r0 = r5
            X.1rq r0 = (X.C39051rq) r0     // Catch:{ all -> 0x0393 }
            r1.A0A(r0)     // Catch:{ all -> 0x0393 }
            goto L_0x01d6
        L_0x0237:
            boolean r0 = r5 instanceof X.C16830ti     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x0246
            X.0vM r10 = r3.A0f     // Catch:{ all -> 0x0393 }
            r7 = r5
            X.0tj r7 = (X.C16840tj) r7     // Catch:{ all -> 0x0393 }
            long r0 = r5.A13     // Catch:{ all -> 0x0393 }
            r10.A0G(r7, r0)     // Catch:{ all -> 0x0393 }
            goto L_0x01d6
        L_0x0246:
            boolean r0 = r5 instanceof X.C38741rL     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x0253
            X.17m r1 = r3.A1O     // Catch:{ all -> 0x0393 }
            r0 = r5
            X.1rL r0 = (X.C38741rL) r0     // Catch:{ all -> 0x0393 }
            r1.A02(r0)     // Catch:{ all -> 0x0393 }
            goto L_0x01d6
        L_0x0253:
            boolean r0 = r5 instanceof X.C38811rS     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x0261
            X.17m r1 = r3.A1O     // Catch:{ all -> 0x0393 }
            r0 = r5
            X.1rS r0 = (X.C38811rS) r0     // Catch:{ all -> 0x0393 }
            r1.A03(r0)     // Catch:{ all -> 0x0393 }
            goto L_0x01d6
        L_0x0261:
            boolean r0 = r5 instanceof X.C38631rA     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x026f
            X.17m r1 = r3.A1O     // Catch:{ all -> 0x0393 }
            r0 = r5
            X.1rA r0 = (X.C38631rA) r0     // Catch:{ all -> 0x0393 }
            r1.A05(r0)     // Catch:{ all -> 0x0393 }
            goto L_0x01d6
        L_0x026f:
            boolean r0 = r5 instanceof X.C30581cc     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x027d
            X.17j r1 = r3.A1M     // Catch:{ all -> 0x0393 }
            r0 = r5
            X.1cc r0 = (X.C30581cc) r0     // Catch:{ all -> 0x0393 }
            r1.A01(r0)     // Catch:{ all -> 0x0393 }
            goto L_0x01d6
        L_0x027d:
            boolean r0 = r5 instanceof X.C38791rQ     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x028b
            X.17n r1 = r3.A0b     // Catch:{ all -> 0x0393 }
            r0 = r5
            X.1rQ r0 = (X.C38791rQ) r0     // Catch:{ all -> 0x0393 }
            r1.A01(r0)     // Catch:{ all -> 0x0393 }
            goto L_0x01d6
        L_0x028b:
            boolean r0 = r5 instanceof X.C38831rU     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x0299
            X.17v r1 = r3.A18     // Catch:{ all -> 0x0393 }
            r0 = r5
            X.1rU r0 = (X.C38831rU) r0     // Catch:{ all -> 0x0393 }
            r1.A00(r0)     // Catch:{ all -> 0x0393 }
            goto L_0x01d6
        L_0x0299:
            boolean r0 = r5 instanceof X.C38971ri     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x02af
            r15 = r5
            X.1ri r15 = (X.C38971ri) r15     // Catch:{ all -> 0x0393 }
            X.189 r12 = r3.A0W     // Catch:{ all -> 0x0393 }
            long r0 = r5.A13     // Catch:{ all -> 0x0393 }
            int r11 = r15.A00     // Catch:{ all -> 0x0393 }
            r10 = 0
            r12.A03(r11, r0, r10)     // Catch:{ all -> 0x0393 }
            r12.A04(r7, r15)     // Catch:{ all -> 0x0393 }
            goto L_0x01d6
        L_0x02af:
            boolean r0 = r5 instanceof X.C39231s8     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x02c5
            r15 = r5
            X.1s8 r15 = (X.C39231s8) r15     // Catch:{ all -> 0x0393 }
            X.189 r12 = r3.A0W     // Catch:{ all -> 0x0393 }
            long r0 = r5.A13     // Catch:{ all -> 0x0393 }
            int r11 = r15.A00     // Catch:{ all -> 0x0393 }
            r10 = 0
            r12.A03(r11, r0, r10)     // Catch:{ all -> 0x0393 }
            r12.A05(r7, r15)     // Catch:{ all -> 0x0393 }
            goto L_0x01d6
        L_0x02c5:
            boolean r0 = r5 instanceof X.C39171s2     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x01d6
            X.17i r1 = r3.A12     // Catch:{ all -> 0x0393 }
            r0 = r5
            X.1s2 r0 = (X.C39171s2) r0     // Catch:{ all -> 0x0393 }
            r1.A01(r0)     // Catch:{ all -> 0x0393 }
            r1.A02(r0)     // Catch:{ all -> 0x0393 }
            goto L_0x01d6
        L_0x02d6:
            if (r9 == 0) goto L_0x02e6
            X.17J r9 = r3.A1C     // Catch:{ all -> 0x0393 }
            r0 = r5
            X.0tY r0 = (X.C16730tY) r0     // Catch:{ all -> 0x0393 }
            X.1y4 r7 = r0.A12()     // Catch:{ all -> 0x0393 }
            long r0 = r5.A13     // Catch:{ all -> 0x0393 }
            r9.A01(r7, r0)     // Catch:{ all -> 0x0393 }
        L_0x02e6:
            boolean r0 = r5 instanceof X.C38701rH     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x02f8
            r0 = r5
            X.1rH r0 = (X.C38701rH) r0     // Catch:{ all -> 0x0393 }
            X.1yC r9 = r0.A00     // Catch:{ all -> 0x0393 }
            if (r9 == 0) goto L_0x02f8
            X.177 r7 = r3.A0I     // Catch:{ all -> 0x0393 }
            long r0 = r5.A13     // Catch:{ all -> 0x0393 }
            r7.A00(r9, r0)     // Catch:{ all -> 0x0393 }
        L_0x02f8:
            if (r4 != r6) goto L_0x031a
            X.17n r12 = r3.A0b     // Catch:{ all -> 0x0393 }
            X.11I r11 = r12.A01     // Catch:{ all -> 0x0393 }
            java.lang.String r4 = "future_ready"
            r0 = 0
            long r9 = r11.A01(r4, r0)     // Catch:{ all -> 0x0393 }
            r6 = 1
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x035d
            r0 = 0
            java.lang.String r4 = "migration_message_future_index"
            long r6 = r11.A01(r4, r0)     // Catch:{ all -> 0x0393 }
            long r0 = r5.A13     // Catch:{ all -> 0x0393 }
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x035d
        L_0x031a:
            boolean r0 = r5 instanceof X.AnonymousClass1WU     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x032c
            X.17r r4 = r3.A1K     // Catch:{ all -> 0x0393 }
            r1 = r5
            X.1WU r1 = (X.AnonymousClass1WU) r1     // Catch:{ all -> 0x0393 }
            boolean r0 = r4.A02()     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x032c
            r4.A01(r1)     // Catch:{ all -> 0x0393 }
        L_0x032c:
            X.17w r0 = r3.A0l     // Catch:{ all -> 0x0393 }
            r0.A00(r5)     // Catch:{ all -> 0x0393 }
            byte[] r0 = r5.A1F     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x0347
            X.17o r6 = r3.A0s     // Catch:{ all -> 0x0393 }
            long r0 = r5.A13     // Catch:{ all -> 0x0393 }
            byte[] r4 = r5.A1F     // Catch:{ all -> 0x0393 }
            r6.A00(r4, r0)     // Catch:{ all -> 0x0393 }
        L_0x033e:
            r19.A00()     // Catch:{ all -> 0x0393 }
            X.17H r0 = r3.A0n     // Catch:{ all -> 0x0393 }
            r0.A02(r5)     // Catch:{ all -> 0x0393 }
            goto L_0x037f
        L_0x0347:
            boolean r0 = X.AnonymousClass1H2.A01(r5)     // Catch:{ all -> 0x0393 }
            if (r0 == 0) goto L_0x033e
            X.0t9 r4 = r3.A1V     // Catch:{ all -> 0x0393 }
            java.lang.String r1 = "msgstore/updateMessageOnCurrentThread"
            X.0w1 r0 = r3.A06     // Catch:{ all -> 0x0393 }
            X.0w2 r0 = r0.A09     // Catch:{ all -> 0x0393 }
            int r0 = X.C18020w1.A02(r0, r5)     // Catch:{ all -> 0x0393 }
            X.AnonymousClass1H2.A00(r4, r1, r0)     // Catch:{ all -> 0x0393 }
            goto L_0x033e
        L_0x035d:
            X.C223317n.A00(r5)     // Catch:{ all -> 0x0393 }
            X.0tq r0 = r12.A00     // Catch:{ all -> 0x0393 }
            X.0tf r11 = r0.A02()     // Catch:{ all -> 0x0393 }
            X.0tg r10 = r11.A02     // Catch:{ all -> 0x0389 }
            java.lang.String r9 = "message_future"
            java.lang.String r7 = "message_row_id = ?"
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x0389 }
            r4 = 0
            long r0 = r5.A13     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0389 }
            r6[r4] = r0     // Catch:{ all -> 0x0389 }
            r10.A01(r9, r7, r6)     // Catch:{ all -> 0x0389 }
            r11.close()     // Catch:{ all -> 0x0393 }
            goto L_0x031a
        L_0x037f:
            r19.close()     // Catch:{ all -> 0x0386 }
            r8.close()     // Catch:{ IOException -> 0x03ab }
            goto L_0x03b1
        L_0x0386:
            r0 = move-exception
            r6 = 1
            goto L_0x03a1
        L_0x0389:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0392 }
            goto L_0x0392
        L_0x038e:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0392 }
        L_0x0392:
            throw r0     // Catch:{ all -> 0x0393 }
        L_0x0393:
            r0 = move-exception
            goto L_0x0397
        L_0x0395:
            r0 = move-exception
            r2 = 0
        L_0x0397:
            r19.close()     // Catch:{ all -> 0x039a }
        L_0x039a:
            throw r0     // Catch:{ all -> 0x039b }
        L_0x039b:
            r0 = move-exception
            r6 = 0
            goto L_0x03a1
        L_0x039e:
            r0 = move-exception
            r6 = 0
            r2 = 0
        L_0x03a1:
            r8.close()     // Catch:{ all -> 0x03a4 }
        L_0x03a4:
            throw r0     // Catch:{ IOException -> 0x03a5 }
        L_0x03a5:
            r0 = move-exception
            goto L_0x03ad
        L_0x03a7:
            r0 = move-exception
            r6 = 0
            r2 = 0
            goto L_0x03ad
        L_0x03ab:
            r0 = move-exception
            r6 = 1
        L_0x03ad:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x03b2
        L_0x03b1:
            r6 = 1
        L_0x03b2:
            boolean r0 = r5 instanceof X.C16730tY
            if (r0 == 0) goto L_0x03ca
            if (r2 <= 0) goto L_0x03ca
            r0 = r5
            X.0tY r0 = (X.C16730tY) r0
            X.0ta r0 = r0.A02
            X.AnonymousClass00B.A06(r0)
            java.io.File r4 = r0.A0F
            if (r4 == 0) goto L_0x03ca
            X.01Z r1 = r3.A07
            r0 = 1
            r1.A05(r4, r2, r0)
        L_0x03ca:
            X.0tZ r1 = r5.A0D()
            boolean r0 = r1 instanceof X.C38641rB
            if (r0 == 0) goto L_0x03e5
            if (r2 <= 0) goto L_0x03e5
            X.0tY r1 = (X.C16730tY) r1
            X.0ta r0 = r1.A02
            X.AnonymousClass00B.A06(r0)
            java.io.File r4 = r0.A0F
            if (r4 == 0) goto L_0x03e5
            X.01Z r1 = r3.A07
            r0 = 1
            r1.A05(r4, r2, r0)
        L_0x03e5:
            X.0vN r3 = r3.A0T
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r13
            java.lang.String r0 = "CoreMessageStore/updateMessageOnCurrentThread"
            r3.A00(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16460t6.A0y(X.0tZ, int):boolean");
    }

    public final boolean A0z(C16740tZ r13, long j2) {
        long j3;
        int i2;
        AnonymousClass189 r3 = this.A0W;
        C28381Vw r2 = r13.A11;
        C34091jg r4 = r2.A02 ? C34091jg.A00 : null;
        byte b2 = r13.A10;
        if (b2 == 36) {
            j3 = r13.A0H;
            i2 = ((C38971ri) r13).A00;
        } else {
            j3 = r13.A0I;
            i2 = b2 == 77 ? ((C39231s8) r13).A00 : r13.A04;
        }
        AnonymousClass122 r32 = r3.A06;
        UserJid of = UserJid.of(r2.A00);
        AnonymousClass00B.A06(of);
        C40261tp r33 = (C40261tp) AnonymousClass122.A00(r32.A00, r32.A03.A02(of, true), (C30641ci) null, 59, j3);
        r33.A00 = i2;
        r33.A0b(r4);
        r33.A0i(Long.valueOf(j2));
        A0f(r33, -1);
        StringBuilder sb = new StringBuilder("added ephemeral setting message; jid=");
        sb.append(r33.A11.A00);
        Log.i(sb.toString());
        return A0x(r33, -1);
    }

    public final boolean A10(C16740tZ r7, C16740tZ r8) {
        this.A0n.A03(r8.A11);
        A0n(Collections.singleton(r8), 0);
        C28381Vw r5 = r7.A0R;
        if (r5 != null) {
            C222517f r4 = this.A1a;
            C222617g r3 = this.A1g;
            AnonymousClass00B.A06(r5);
            r4.A03(r3.A01(r5, r7.A10, r7.A0I));
        }
        this.A1a.A03(r7);
        return true;
    }

    public final boolean A11(C16740tZ r9, C16740tZ r10) {
        C15840rx A062;
        C15840rx A063;
        r9.A0d(r10);
        AnonymousClass1Vt r0 = r9.A0L;
        if (r0 != null && r0.A0E()) {
            r9.A0L.A09(true);
        }
        if (!A0y(r9, 5)) {
            return false;
        }
        AnonymousClass17E r02 = this.A0e;
        r02.A00(r9, 5);
        C28381Vw r3 = r9.A11;
        C15830rv r7 = r3.A00;
        r02.A02.post(new RunnableRunnableShape6S0200000_I0_4(this, 22, r7));
        if (r3.A02 || ((((A063 = this.A0O.A06(r7)) == null || A063.A0O < r9.A14) && r9.A0C != 13) || !this.A1Z.A00(r7))) {
            C28381Vw r6 = r9.A0R;
            if (r6 != null) {
                C222517f r4 = this.A1a;
                C222617g r32 = this.A1g;
                AnonymousClass00B.A06(r6);
                r4.A03(r32.A01(r6, r9.A10, r9.A0I));
            }
            this.A1a.A03(r9);
        } else {
            C28381Vw r62 = r9.A0R;
            if (r62 != null) {
                C222517f r42 = this.A1a;
                C222617g r33 = this.A1g;
                AnonymousClass00B.A06(r62);
                r42.A04(r33.A01(r62, r9.A10, r9.A0I));
            }
            this.A1a.A04(r9);
        }
        C16040sK r03 = this.A05;
        C15810rt r1 = this.A0O;
        if (C38621r6.A0Q(r03, r9) && (A062 = r1.A06(r7)) != null) {
            synchronized (A062) {
                A062.A04++;
                StringBuilder sb = new StringBuilder();
                sb.append("chatInfo/incrementUnseenImportantMessageCount/");
                sb.append(A062.A07());
                Log.i(sb.toString());
            }
        }
        return true;
    }
}
