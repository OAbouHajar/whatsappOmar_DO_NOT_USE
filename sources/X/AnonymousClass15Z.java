package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import com.obwhatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.15Z  reason: invalid class name */
public class AnonymousClass15Z {
    public static final int[] A0I = {R.plurals.plurals0018, R.string.str04d9, R.string.str04da, R.plurals.plurals0017, R.plurals.plurals0017};
    public static final int[][] A0J = {new int[]{R.string.str1739, R.string.str173a}, new int[]{R.string.str1735, R.string.str1736}, new int[]{R.string.str1737, R.string.str1738}};
    public static final int[][] A0K = {new int[]{R.string.str087e, R.string.str087b, R.string.str087c}, new int[]{R.string.str087f, R.string.str0880, R.string.str087d}};
    public static final int[][] A0L = {new int[]{R.string.str173c, R.string.str173d}, new int[]{R.string.str173b, R.string.str1740}, new int[]{R.string.str173e, R.string.str173f}};
    public static final int[][] A0M = {new int[]{R.string.str0aac, R.string.str0aaf}, new int[]{R.string.str0aad, R.string.str0aae}};
    public static final int[][] A0N = {new int[]{R.string.str0f0a, R.string.str0f04, R.string.str0f05}, new int[]{R.string.str0a6f, R.string.str0a69, R.string.str0a6a}};
    public static final int[][] A0O = {new int[]{R.string.str0f0c, R.string.str0f08, R.string.str0f09}, new int[]{R.string.str0a71, R.string.str0a6d, R.string.str0a6e}};
    public static final int[][] A0P = {new int[]{R.plurals.plurals015d, R.plurals.plurals015b, R.plurals.plurals015c}, new int[]{R.string.str174e, R.string.str174c, R.string.str174d}, new int[]{R.string.str1754, R.string.str1752, R.string.str1753}, new int[]{R.string.str1751, R.string.str174f, R.string.str1750}, new int[]{R.plurals.plurals015a, R.plurals.plurals0158, R.plurals.plurals0159}};
    public static final int[][] A0Q = {new int[]{R.plurals.plurals0163, R.plurals.plurals0161, R.plurals.plurals0162}, new int[]{R.string.str1757, R.string.str1755, R.string.str1756}, new int[]{R.plurals.plurals0160, R.plurals.plurals015e, R.plurals.plurals015f}};
    public static final int[][] A0R = {new int[]{R.string.str0f0b, R.string.str0f06, R.string.str0f07}, new int[]{R.string.str0a70, R.string.str0a6b, R.string.str0a6c}};
    public final C16300so A00;
    public final C16040sK A01;
    public final AnonymousClass15U A02;
    public final C16000sG A03;
    public final C16080sP A04;
    public final AnonymousClass11R A05;
    public final C16980tz A06;
    public final AnonymousClass013 A07;
    public final C15810rt A08;
    public final C16070sO A09;
    public final AnonymousClass15X A0A;
    public final C14710pd A0B;
    public final C20260zl A0C;
    public final C17240ul A0D;
    public final AnonymousClass15W A0E;
    public final AnonymousClass15Y A0F;
    public final AnonymousClass15V A0G;
    public final AnonymousClass15T A0H;

    public AnonymousClass15Z(C16300so r2, C16040sK r3, AnonymousClass15U r4, C16000sG r5, C16080sP r6, AnonymousClass11R r7, C16980tz r8, AnonymousClass013 r9, C15810rt r10, C16070sO r11, AnonymousClass15X r12, C14710pd r13, C20260zl r14, C17240ul r15, AnonymousClass15W r16, AnonymousClass15Y r17, AnonymousClass15V r18, AnonymousClass15T r19) {
        this.A0B = r13;
        this.A00 = r2;
        this.A01 = r3;
        this.A06 = r8;
        this.A08 = r10;
        this.A0G = r18;
        this.A0C = r14;
        this.A03 = r5;
        this.A04 = r6;
        this.A07 = r9;
        this.A0D = r15;
        this.A0E = r16;
        this.A0A = r12;
        this.A0F = r17;
        this.A09 = r11;
        this.A02 = r4;
        this.A05 = r7;
        this.A0H = r19;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r3 != 1) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A00(java.util.List r4, int r5) {
        /*
            int r3 = r4.size()
        L_0x0004:
            int r0 = r4.size()
            r2 = 3
            if (r0 >= r2) goto L_0x0010
            r0 = 0
            r4.add(r0)
            goto L_0x0004
        L_0x0010:
            r1 = 1
            r0 = 0
            if (r5 < r1) goto L_0x0046
            if (r3 >= r2) goto L_0x001a
            if (r3 != r5) goto L_0x0046
            if (r3 == r1) goto L_0x002d
        L_0x001a:
            r1 = 2
            if (r3 == r1) goto L_0x002d
            if (r5 != r2) goto L_0x0036
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r1, r0)
            return r2
        L_0x002d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L_0x0040
        L_0x0036:
            r0 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r5 = r5 - r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
        L_0x0040:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            return r0
        L_0x0046:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r0, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15Z.A00(java.util.List, int):android.util.Pair");
    }

    public static final String A01(Context context, String str, boolean z2) {
        if (str == null) {
            int i2 = R.string.str0a26;
            if (z2) {
                i2 = R.string.str0a25;
            }
            return context.getString(i2);
        }
        int i3 = R.string.str0a24;
        if (z2) {
            i3 = R.string.str0a23;
        }
        return context.getString(i3, new Object[]{str});
    }

    public static List A02(Set set, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext() && arrayList.size() < i2) {
            String str = ((C39461sW) it.next()).A03;
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public String A03(Context context, GroupJid groupJid, String str, boolean z2, boolean z3) {
        int i2;
        Object[] objArr;
        String A092 = this.A08.A09(groupJid);
        char A0E2 = AnonymousClass1ZW.A0E(A092);
        if (z3) {
            if (A0E2 != 0) {
                return context.getString(R.string.str0ddb);
            }
            i2 = R.string.str0dda;
        } else if (z2) {
            i2 = A0K[A0E2][0];
        } else {
            int[] iArr = A0K[A0E2];
            if (str != null) {
                i2 = iArr[1];
                objArr = new Object[]{str, A092};
                return context.getString(i2, objArr);
            }
            i2 = iArr[2];
        }
        objArr = new Object[]{A092};
        return context.getString(i2, objArr);
    }

    public final String A04(C16010sH r4, int i2) {
        String A0G2 = this.A04.A0G(r4, i2, false);
        if (A0G2 == null) {
            return null;
        }
        return this.A07.A0G(A0G2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r9 == X.C34091jg.A00) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A05(X.C15830rv r9, int r10, boolean r11) {
        /*
            r8 = this;
            X.0sK r0 = r8.A01
            boolean r0 = r0.A0I(r9)
            if (r0 != 0) goto L_0x000d
            X.1jg r0 = X.C34091jg.A00
            r3 = 0
            if (r9 != r0) goto L_0x000e
        L_0x000d:
            r3 = 1
        L_0x000e:
            X.0pd r2 = r8.A0B
            r1 = 2005(0x7d5, float:2.81E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0077
            if (r3 == 0) goto L_0x001d
            r9 = 0
        L_0x001d:
            r0 = 86400(0x15180, float:1.21072E-40)
            if (r10 > r0) goto L_0x0072
            int r10 = r10 / 3600
            r3 = 2131755089(0x7f100051, float:1.9141047E38)
        L_0x0027:
            X.0tz r0 = r8.A06
            android.content.Context r7 = r0.A00
            android.content.res.Resources r2 = r7.getResources()
            r6 = 1
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r5 = 0
            r1[r5] = r0
            java.lang.String r4 = r2.getQuantityString(r3, r10, r1)
            if (r9 != 0) goto L_0x0050
            r2 = 2131889139(0x7f120bf3, float:1.9412933E38)
            if (r11 == 0) goto L_0x0047
            r2 = 2131889138(0x7f120bf2, float:1.9412931E38)
        L_0x0047:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r4
        L_0x004b:
            java.lang.String r0 = r7.getString(r2, r1)
            return r0
        L_0x0050:
            X.0sG r0 = r8.A03
            X.0sH r3 = r0.A0A(r9)
            boolean r2 = X.C16030sJ.A0L(r9)
            r1 = 2
            r0 = 2
            if (r2 == 0) goto L_0x005f
            r0 = 1
        L_0x005f:
            java.lang.String r0 = r8.A04(r3, r0)
            r2 = 2131889137(0x7f120bf1, float:1.941293E38)
            if (r11 == 0) goto L_0x006b
            r2 = 2131889136(0x7f120bf0, float:1.9412927E38)
        L_0x006b:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r5] = r0
            r1[r6] = r4
            goto L_0x004b
        L_0x0072:
            int r10 = r10 / r0
            r3 = 2131755088(0x7f100050, float:1.9141045E38)
            goto L_0x0027
        L_0x0077:
            r0 = 86400(0x15180, float:1.21072E-40)
            if (r3 == 0) goto L_0x00a9
            if (r10 > r0) goto L_0x009f
            int r10 = r10 / 3600
            r4 = 2131755072(0x7f100040, float:1.9141013E38)
            if (r11 == 0) goto L_0x0088
            r4 = 2131755071(0x7f10003f, float:1.914101E38)
        L_0x0088:
            X.0tz r0 = r8.A06
            android.content.Context r0 = r0.A00
            android.content.res.Resources r3 = r0.getResources()
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r2[r1] = r0
            java.lang.String r0 = r3.getQuantityString(r4, r10, r2)
            return r0
        L_0x009f:
            int r10 = r10 / r0
            r4 = 2131755068(0x7f10003c, float:1.9141005E38)
            if (r11 == 0) goto L_0x0088
            r4 = 2131755067(0x7f10003b, float:1.9141003E38)
            goto L_0x0088
        L_0x00a9:
            if (r10 > r0) goto L_0x00e1
            int r10 = r10 / 3600
            r5 = 2131755070(0x7f10003e, float:1.9141009E38)
            if (r11 == 0) goto L_0x00b5
            r5 = 2131755069(0x7f10003d, float:1.9141007E38)
        L_0x00b5:
            X.0sG r0 = r8.A03
            X.0sH r3 = r0.A0A(r9)
            boolean r2 = X.C16030sJ.A0L(r9)
            r4 = 1
            r1 = 2
            r0 = 2
            if (r2 == 0) goto L_0x00c5
            r0 = 1
        L_0x00c5:
            java.lang.String r3 = r8.A04(r3, r0)
            X.0tz r0 = r8.A06
            android.content.Context r0 = r0.A00
            android.content.res.Resources r2 = r0.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0 = 0
            r1[r0] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1[r4] = r0
            java.lang.String r0 = r2.getQuantityString(r5, r10, r1)
            return r0
        L_0x00e1:
            int r10 = r10 / r0
            r5 = 2131755066(0x7f10003a, float:1.9141E38)
            if (r11 == 0) goto L_0x00b5
            r5 = 2131755065(0x7f100039, float:1.9140999E38)
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15Z.A05(X.0rv, int, boolean):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A06(X.C15830rv r11, int r12, boolean r13) {
        /*
            r10 = this;
            X.0pd r2 = r10.A0B
            r1 = 2005(0x7d5, float:2.81E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x00eb
            if (r11 == 0) goto L_0x0093
            X.0sK r0 = r10.A01
            boolean r0 = r0.A0I(r11)
            if (r0 != 0) goto L_0x009e
            X.1jg r0 = X.C34091jg.A00
            if (r11 == r0) goto L_0x009e
            X.0sG r0 = r10.A03
            X.0sH r2 = r0.A0A(r11)
            boolean r1 = X.C16030sJ.A0L(r11)
            r6 = 2
            r5 = 1
            r0 = 2
            if (r1 == 0) goto L_0x002a
            r0 = 1
        L_0x002a:
            java.lang.String r9 = r10.A04(r2, r0)
            if (r9 == 0) goto L_0x0093
            r8 = 0
            if (r12 > 0) goto L_0x0048
            X.0tz r0 = r10.A06
            android.content.Context r2 = r0.A00
            r1 = 2131888157(0x7f12081d, float:1.9410941E38)
            if (r13 == 0) goto L_0x003f
            r1 = 2131888158(0x7f12081e, float:1.9410943E38)
        L_0x003f:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r8] = r9
            java.lang.String r0 = r2.getString(r1, r0)
            return r0
        L_0x0048:
            r4 = 2131888123(0x7f1207fb, float:1.9410872E38)
            if (r13 == 0) goto L_0x0050
            r4 = 2131888125(0x7f1207fd, float:1.9410876E38)
        L_0x0050:
            r7 = 2131755091(0x7f100053, float:1.9141051E38)
            r0 = 86400(0x15180, float:1.21072E-40)
            if (r12 <= r0) goto L_0x007f
            int r12 = r12 / r0
            r7 = 2131755088(0x7f100050, float:1.9141045E38)
        L_0x005c:
            X.0tz r0 = r10.A06
            android.content.Context r3 = r0.A00
            android.content.res.Resources r2 = r3.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r1[r8] = r0
            java.lang.String r2 = r2.getQuantityString(r7, r12, r1)
            android.content.res.Resources r1 = r3.getResources()
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r8] = r9
            r0[r5] = r2
            java.lang.String r0 = r1.getString(r4, r0)
            return r0
        L_0x007f:
            r0 = 3600(0xe10, float:5.045E-42)
            if (r12 < r0) goto L_0x0089
            int r12 = r12 / 3600
            r7 = 2131755089(0x7f100051, float:1.9141047E38)
            goto L_0x005c
        L_0x0089:
            r0 = 60
            if (r12 < r0) goto L_0x005c
            int r12 = r12 / 60
            r7 = 2131755090(0x7f100052, float:1.914105E38)
            goto L_0x005c
        L_0x0093:
            if (r12 <= 0) goto L_0x01e2
            r6 = 2131888130(0x7f120802, float:1.9410887E38)
            if (r13 == 0) goto L_0x00a8
            r6 = 2131888132(0x7f120804, float:1.941089E38)
            goto L_0x00a8
        L_0x009e:
            if (r12 <= 0) goto L_0x0252
            r6 = 2131888127(0x7f1207ff, float:1.941088E38)
            if (r13 == 0) goto L_0x00a8
            r6 = 2131888129(0x7f120801, float:1.9410885E38)
        L_0x00a8:
            r7 = 2131755091(0x7f100053, float:1.9141051E38)
            r0 = 86400(0x15180, float:1.21072E-40)
            if (r12 <= r0) goto L_0x00d7
            int r12 = r12 / r0
            r7 = 2131755088(0x7f100050, float:1.9141045E38)
        L_0x00b4:
            X.0tz r0 = r10.A06
            android.content.Context r5 = r0.A00
            android.content.res.Resources r2 = r5.getResources()
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r3 = 0
            r1[r3] = r0
            java.lang.String r2 = r2.getQuantityString(r7, r12, r1)
            android.content.res.Resources r1 = r5.getResources()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r2
            java.lang.String r0 = r1.getString(r6, r0)
            return r0
        L_0x00d7:
            r0 = 3600(0xe10, float:5.045E-42)
            if (r12 < r0) goto L_0x00e1
            int r12 = r12 / 3600
            r7 = 2131755089(0x7f100051, float:1.9141047E38)
            goto L_0x00b4
        L_0x00e1:
            r0 = 60
            if (r12 < r0) goto L_0x00b4
            int r12 = r12 / 60
            r7 = 2131755090(0x7f100052, float:1.914105E38)
            goto L_0x00b4
        L_0x00eb:
            if (r11 != 0) goto L_0x013a
            if (r12 <= 0) goto L_0x01e2
            r4 = 2131755141(0x7f100085, float:1.9141153E38)
            if (r13 == 0) goto L_0x00f7
            r4 = 2131755143(0x7f100087, float:1.9141157E38)
        L_0x00f7:
            r0 = 86400(0x15180, float:1.21072E-40)
            if (r12 <= r0) goto L_0x011c
            int r12 = r12 / r0
            r4 = 2131755129(0x7f100079, float:1.9141129E38)
            if (r13 == 0) goto L_0x0105
            r4 = 2131755131(0x7f10007b, float:1.9141133E38)
        L_0x0105:
            X.0tz r0 = r10.A06
            android.content.Context r0 = r0.A00
            android.content.res.Resources r3 = r0.getResources()
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r2[r1] = r0
            java.lang.String r0 = r3.getQuantityString(r4, r12, r2)
            return r0
        L_0x011c:
            r0 = 3600(0xe10, float:5.045E-42)
            if (r12 < r0) goto L_0x012b
            int r12 = r12 / 3600
            r4 = 2131755133(0x7f10007d, float:1.9141137E38)
            if (r13 == 0) goto L_0x0105
            r4 = 2131755135(0x7f10007f, float:1.914114E38)
            goto L_0x0105
        L_0x012b:
            r0 = 60
            if (r12 < r0) goto L_0x0105
            int r12 = r12 / 60
            r4 = 2131755137(0x7f100081, float:1.9141145E38)
            if (r13 == 0) goto L_0x0105
            r4 = 2131755139(0x7f100083, float:1.9141149E38)
            goto L_0x0105
        L_0x013a:
            X.0sK r0 = r10.A01
            boolean r0 = r0.A0I(r11)
            if (r0 != 0) goto L_0x01a8
            X.1jg r0 = X.C34091jg.A00
            if (r11 == r0) goto L_0x01a8
            X.0sG r0 = r10.A03
            X.0sH r3 = r0.A0A(r11)
            boolean r2 = X.C16030sJ.A0L(r11)
            r1 = 2
            r4 = 1
            r0 = 2
            if (r2 == 0) goto L_0x0156
            r0 = 1
        L_0x0156:
            java.lang.String r6 = r10.A04(r3, r0)
            if (r6 != 0) goto L_0x01ef
            if (r12 <= 0) goto L_0x01e2
            r5 = 2131755140(0x7f100084, float:1.914115E38)
            if (r13 == 0) goto L_0x0166
            r5 = 2131755142(0x7f100086, float:1.9141155E38)
        L_0x0166:
            r0 = 86400(0x15180, float:1.21072E-40)
            if (r12 <= r0) goto L_0x018a
            int r12 = r12 / r0
            r5 = 2131755128(0x7f100078, float:1.9141127E38)
            if (r13 == 0) goto L_0x0174
            r5 = 2131755130(0x7f10007a, float:1.914113E38)
        L_0x0174:
            X.0tz r0 = r10.A06
            android.content.Context r0 = r0.A00
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r2[r1] = r0
            java.lang.String r0 = r3.getQuantityString(r5, r12, r2)
            return r0
        L_0x018a:
            r0 = 3600(0xe10, float:5.045E-42)
            if (r12 < r0) goto L_0x0199
            int r12 = r12 / 3600
            r5 = 2131755132(0x7f10007c, float:1.9141135E38)
            if (r13 == 0) goto L_0x0174
            r5 = 2131755134(0x7f10007e, float:1.9141139E38)
            goto L_0x0174
        L_0x0199:
            r0 = 60
            if (r12 < r0) goto L_0x0174
            int r12 = r12 / 60
            r5 = 2131755136(0x7f100080, float:1.9141143E38)
            if (r13 == 0) goto L_0x0174
            r5 = 2131755138(0x7f100082, float:1.9141147E38)
            goto L_0x0174
        L_0x01a8:
            if (r12 <= 0) goto L_0x0252
            r4 = 2131755125(0x7f100075, float:1.914112E38)
            if (r13 == 0) goto L_0x01b2
            r4 = 2131755127(0x7f100077, float:1.9141124E38)
        L_0x01b2:
            r0 = 86400(0x15180, float:1.21072E-40)
            if (r12 <= r0) goto L_0x01c2
            int r12 = r12 / r0
            r4 = 2131755113(0x7f100069, float:1.9141096E38)
            if (r13 == 0) goto L_0x0105
            r4 = 2131755115(0x7f10006b, float:1.91411E38)
            goto L_0x0105
        L_0x01c2:
            r0 = 3600(0xe10, float:5.045E-42)
            if (r12 < r0) goto L_0x01d2
            int r12 = r12 / 3600
            r4 = 2131755117(0x7f10006d, float:1.9141104E38)
            if (r13 == 0) goto L_0x0105
            r4 = 2131755119(0x7f10006f, float:1.9141108E38)
            goto L_0x0105
        L_0x01d2:
            r0 = 60
            if (r12 < r0) goto L_0x0105
            int r12 = r12 / 60
            r4 = 2131755121(0x7f100071, float:1.9141112E38)
            if (r13 == 0) goto L_0x0105
            r4 = 2131755123(0x7f100073, float:1.9141116E38)
            goto L_0x0105
        L_0x01e2:
            X.0tz r0 = r10.A06
            android.content.Context r1 = r0.A00
            r0 = 2131888156(0x7f12081c, float:1.941094E38)
            if (r13 == 0) goto L_0x025e
            r0 = 2131888161(0x7f120821, float:1.941095E38)
            goto L_0x025e
        L_0x01ef:
            r5 = 0
            if (r12 > 0) goto L_0x0207
            X.0tz r0 = r10.A06
            android.content.Context r2 = r0.A00
            r1 = 2131888157(0x7f12081d, float:1.9410941E38)
            if (r13 == 0) goto L_0x01fe
            r1 = 2131888158(0x7f12081e, float:1.9410943E38)
        L_0x01fe:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r6
            java.lang.String r0 = r2.getString(r1, r0)
            return r0
        L_0x0207:
            r3 = 2131755109(0x7f100065, float:1.9141088E38)
            if (r13 == 0) goto L_0x020f
            r3 = 2131755111(0x7f100067, float:1.9141092E38)
        L_0x020f:
            r0 = 86400(0x15180, float:1.21072E-40)
            if (r12 <= r0) goto L_0x0234
            int r12 = r12 / r0
            r3 = 2131755097(0x7f100059, float:1.9141064E38)
            if (r13 == 0) goto L_0x021d
            r3 = 2131755099(0x7f10005b, float:1.9141068E38)
        L_0x021d:
            X.0tz r0 = r10.A06
            android.content.Context r0 = r0.A00
            android.content.res.Resources r2 = r0.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r5] = r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r1[r4] = r0
            java.lang.String r0 = r2.getQuantityString(r3, r12, r1)
            return r0
        L_0x0234:
            r0 = 3600(0xe10, float:5.045E-42)
            if (r12 < r0) goto L_0x0243
            int r12 = r12 / 3600
            r3 = 2131755101(0x7f10005d, float:1.9141072E38)
            if (r13 == 0) goto L_0x021d
            r3 = 2131755103(0x7f10005f, float:1.9141076E38)
            goto L_0x021d
        L_0x0243:
            r0 = 60
            if (r12 < r0) goto L_0x021d
            int r12 = r12 / 60
            r3 = 2131755105(0x7f100061, float:1.914108E38)
            if (r13 == 0) goto L_0x021d
            r3 = 2131755107(0x7f100063, float:1.9141084E38)
            goto L_0x021d
        L_0x0252:
            X.0tz r0 = r10.A06
            android.content.Context r1 = r0.A00
            r0 = 2131888159(0x7f12081f, float:1.9410945E38)
            if (r13 == 0) goto L_0x025e
            r0 = 2131888160(0x7f120820, float:1.9410947E38)
        L_0x025e:
            java.lang.String r0 = r1.getString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15Z.A06(X.0rv, int, boolean):java.lang.String");
    }

    public final String A07(AnonymousClass1WU r10, int i2, int i3, int i4) {
        List<C15830rv> list = ((C39291sE) r10).A01;
        if (list.size() == 1 && this.A01.A0I((C15830rv) list.get(0))) {
            return this.A06.A00.getString(i2);
        }
        C16040sK r4 = this.A01;
        r4.A0B();
        if (list.contains(r4.A05) || list.contains(r4.A03())) {
            ArrayList arrayList = new ArrayList();
            for (C15830rv r1 : list) {
                if (!r4.A0I(r1)) {
                    arrayList.add(r1);
                }
            }
            return this.A06.A00.getResources().getQuantityString(i3, arrayList.size(), new Object[]{this.A07.A0G(this.A04.A0L(arrayList, -1))});
        }
        return this.A06.A00.getResources().getQuantityString(i4, list.size(), new Object[]{this.A07.A0G(this.A04.A0L(list, -1))});
    }

    public final String A08(AnonymousClass1WU r6, int i2, int i3, int i4, int i5) {
        Context context;
        UserJid of = UserJid.of(r6.A0B());
        C16050sL A032 = C16050sL.A03(r6.A11.A00);
        if (of == null) {
            C16070sO r0 = this.A09;
            AnonymousClass00B.A06(A032);
            boolean A0A2 = r0.A0A(A032);
            context = this.A06.A00;
            i2 = R.string.str0ab6;
            if (A0A2) {
                i2 = R.string.str0ab5;
            }
        } else if (this.A01.A0I(of)) {
            context = this.A06.A00;
        } else {
            String A082 = this.A04.A08(this.A03.A0A(of));
            boolean A0A3 = this.A09.A0A(A032);
            boolean A0E2 = this.A0B.A0E(C16620tM.A02, 1863);
            if (!A0A3) {
                i3 = i4;
            }
            if (A0E2) {
                i3 = i5;
            }
            return this.A06.A00.getString(i3, new Object[]{A082});
        }
        return context.getString(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r6.A0D.A0j(r1) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A09(X.AnonymousClass1WU r7, int r8, int r9, int r10, int r11, int r12) {
        /*
            r6 = this;
            X.0rv r0 = r7.A0B()
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.of(r0)
            X.0sK r0 = r6.A01
            boolean r0 = r0.A0I(r2)
            if (r0 == 0) goto L_0x0019
            X.0tz r0 = r6.A06
            android.content.Context r0 = r0.A00
            java.lang.String r0 = r0.getString(r8)
            return r0
        L_0x0019:
            X.1Vw r0 = r7.A11
            X.0rv r0 = r0.A00
            X.0sL r1 = X.C16050sL.A03(r0)
            r5 = 1
            r4 = 0
            if (r1 == 0) goto L_0x002e
            X.0ul r0 = r6.A0D
            boolean r0 = r0.A0j(r1)
            r3 = 1
            if (r0 != 0) goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            if (r2 == 0) goto L_0x004d
            X.0sG r0 = r6.A03
            X.0sH r1 = r0.A0A(r2)
            X.0sP r0 = r6.A04
            java.lang.String r2 = r0.A08(r1)
            if (r3 != 0) goto L_0x0040
            r9 = r10
        L_0x0040:
            X.0tz r0 = r6.A06
            android.content.Context r1 = r0.A00
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r2
            java.lang.String r0 = r1.getString(r9, r0)
            return r0
        L_0x004d:
            if (r3 != 0) goto L_0x0050
            r11 = r12
        L_0x0050:
            X.0tz r0 = r6.A06
            android.content.Context r0 = r0.A00
            java.lang.String r0 = r0.getString(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15Z.A09(X.1WU, int, int, int, int, int):java.lang.String");
    }

    public final String A0A(AnonymousClass1WU r5, String str, int i2, int i3, int i4) {
        if (C16030sJ.A0G(r5.A11.A00)) {
            return this.A06.A00.getString(i2, new Object[]{str});
        }
        boolean A0I2 = this.A01.A0I(r5.A0B());
        Context context = this.A06.A00;
        if (A0I2) {
            return context.getString(i3);
        }
        return context.getResources().getQuantityString(i4, 1, new Object[]{str});
    }

    public final String A0B(AnonymousClass1WU r10, String str, int i2, int i3, int i4, int i5, int i6, int i7) {
        List list = ((C39291sE) r10).A01;
        C15830rv r2 = r10.A11.A00;
        if (C16030sJ.A0G(r2)) {
            return this.A06.A00.getResources().getQuantityString(i7, list.size(), new Object[]{this.A07.A0G(this.A04.A0L(list, -1))});
        }
        C16040sK r1 = this.A01;
        if (r1.A0I(r10.A0B())) {
            return this.A06.A00.getString(i2, new Object[]{this.A07.A0G(this.A04.A0L(list, -1))});
        }
        int size = list.size();
        if (str == null) {
            if (size == 1 && r1.A0I((C15830rv) list.get(0))) {
                return this.A06.A00.getString(i3);
            }
            return this.A06.A00.getResources().getQuantityString(i4, list.size(), new Object[]{this.A07.A0G(this.A04.A0L(list, -1))});
        } else if (size != 1 || !r1.A0I((C15830rv) list.get(0))) {
            int i8 = 2;
            if (C16030sJ.A0L(r2)) {
                i8 = 1;
            }
            return this.A06.A00.getString(i6, new Object[]{str, this.A07.A0G(this.A04.A0L(list, i8))});
        } else {
            return this.A06.A00.getString(i5, new Object[]{str});
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v198, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v199, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v260, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v264, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v205, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v207, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v2, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r11v6, types: [X.0rv] */
    /* JADX WARNING: type inference failed for: r11v24 */
    /* JADX WARNING: type inference failed for: r11v25 */
    /* JADX WARNING: type inference failed for: r11v26 */
    /* JADX WARNING: type inference failed for: r11v27 */
    /* JADX WARNING: type inference failed for: r11v28 */
    /* JADX WARNING: type inference failed for: r11v29 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        return r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02ba, code lost:
        if (r5.lastIndexOf("\"") > r5.indexOf("\"")) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0aca, code lost:
        return r5.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0adb, code lost:
        return r5.getString(r1, new java.lang.Object[]{r3});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0ed7, code lost:
        if (r0.A01.A0I(r5) == false) goto L_0x0ed9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x1087, code lost:
        if (r0.A01.A0I((X.C15830rv) r8.get(0)) == false) goto L_0x1089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x119f, code lost:
        return r8.getString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:706:0x11aa, code lost:
        if (r5 != null) goto L_0x11b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:708:0x11b3, code lost:
        return r8.getString(com.obwhatsapp.R.string.str0a22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x11bf, code lost:
        return r8.getString(com.obwhatsapp.R.string.str0a21, new java.lang.Object[]{r5});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:741:0x1253, code lost:
        return r0.A06.A00.getString(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:751:0x12b4, code lost:
        return r2.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:755:0x12cb, code lost:
        if (r3 != null) goto L_0x12d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:757:0x12d4, code lost:
        return r5.getString(com.obwhatsapp.R.string.str1742);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:759:0x12e0, code lost:
        return r5.getString(com.obwhatsapp.R.string.str1741, new java.lang.Object[]{r3});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0205, code lost:
        return r3.getString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x021f, code lost:
        if (r9 != 0) goto L_0x0221;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0569  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0583  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x059f  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x05c8  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x05f8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0674  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0680  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0694  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x06bc  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x06c8  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0717  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0795  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x07b9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x07dd  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0801  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0825  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0833  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x083f  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0853  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0867  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x08f2  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0914  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0936  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0959  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x09bd  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x09c9  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x09dd  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x09f1  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0a05  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0a11  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0a8c  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0aae  */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0adc  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0af0  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0b06  */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0b68  */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x0bba  */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x0bd9  */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x0be9  */
    /* JADX WARNING: Removed duplicated region for block: B:488:0x0bf9  */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0c29  */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x0c35  */
    /* JADX WARNING: Removed duplicated region for block: B:498:0x0c41  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:525:0x0cc7  */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x0ce9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:587:0x0ea4  */
    /* JADX WARNING: Removed duplicated region for block: B:593:0x0ec4  */
    /* JADX WARNING: Removed duplicated region for block: B:610:0x0f14  */
    /* JADX WARNING: Removed duplicated region for block: B:612:0x0f29  */
    /* JADX WARNING: Removed duplicated region for block: B:614:0x0f3e  */
    /* JADX WARNING: Removed duplicated region for block: B:616:0x0f4c  */
    /* JADX WARNING: Removed duplicated region for block: B:618:0x0f5a  */
    /* JADX WARNING: Removed duplicated region for block: B:620:0x0f68  */
    /* JADX WARNING: Removed duplicated region for block: B:625:0x0fa9  */
    /* JADX WARNING: Removed duplicated region for block: B:627:0x0fbd  */
    /* JADX WARNING: Removed duplicated region for block: B:629:0x0fd1  */
    /* JADX WARNING: Removed duplicated region for block: B:631:0x0fe1  */
    /* JADX WARNING: Removed duplicated region for block: B:637:0x1005  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:642:0x1017  */
    /* JADX WARNING: Removed duplicated region for block: B:649:0x102d  */
    /* JADX WARNING: Removed duplicated region for block: B:688:0x1139  */
    /* JADX WARNING: Removed duplicated region for block: B:690:0x114a  */
    /* JADX WARNING: Removed duplicated region for block: B:692:0x115b  */
    /* JADX WARNING: Removed duplicated region for block: B:694:0x1165  */
    /* JADX WARNING: Removed duplicated region for block: B:705:0x11a0  */
    /* JADX WARNING: Removed duplicated region for block: B:711:0x11c0  */
    /* JADX WARNING: Removed duplicated region for block: B:713:0x11cc  */
    /* JADX WARNING: Removed duplicated region for block: B:714:0x11dc  */
    /* JADX WARNING: Removed duplicated region for block: B:716:0x11e8  */
    /* JADX WARNING: Removed duplicated region for block: B:731:0x121c  */
    /* JADX WARNING: Removed duplicated region for block: B:745:0x127f  */
    /* JADX WARNING: Removed duplicated region for block: B:747:0x129d  */
    /* JADX WARNING: Removed duplicated region for block: B:752:0x12b5  */
    /* JADX WARNING: Removed duplicated region for block: B:760:0x12e1  */
    /* JADX WARNING: Removed duplicated region for block: B:762:0x12fb  */
    /* JADX WARNING: Removed duplicated region for block: B:764:0x1318  */
    /* JADX WARNING: Removed duplicated region for block: B:766:0x1335  */
    /* JADX WARNING: Removed duplicated region for block: B:768:0x1352  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:770:0x136f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0206  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0C(X.AnonymousClass1WU r25, boolean r26) {
        /*
            r24 = this;
            r1 = r25
            X.1Vw r14 = r1.A11
            X.0rv r13 = r14.A00
            boolean r18 = X.C16030sJ.A0L(r13)
            r7 = 2
            r2 = 1
            r12 = 2
            if (r18 == 0) goto L_0x0010
            r12 = 1
        L_0x0010:
            boolean r3 = X.C38621r6.A0g(r1)
            r11 = 0
            r0 = r24
            if (r3 == 0) goto L_0x0270
            r3 = r1
            X.1WT r3 = (X.AnonymousClass1WT) r3
            com.whatsapp.jid.UserJid r10 = r3.A01
        L_0x001e:
            if (r10 == 0) goto L_0x027d
            X.0sG r3 = r0.A03
            X.0sH r9 = r3.A0A(r10)
            java.lang.String r3 = r0.A04(r9, r12)
        L_0x002a:
            X.0ul r6 = r0.A0D
            X.0sL r5 = X.C16050sL.A03(r13)
            boolean r17 = r6.A0l(r5)
            int r15 = r1.A00
            r8 = 3
            java.lang.String r16 = ""
            r4 = 0
            switch(r15) {
                case 1: goto L_0x0281;
                case 2: goto L_0x003d;
                case 3: goto L_0x003d;
                case 4: goto L_0x03cc;
                case 5: goto L_0x03dd;
                case 6: goto L_0x0083;
                case 7: goto L_0x0401;
                case 8: goto L_0x0412;
                case 9: goto L_0x0431;
                case 10: goto L_0x0482;
                case 11: goto L_0x04d3;
                case 12: goto L_0x052e;
                case 13: goto L_0x0548;
                case 14: goto L_0x0569;
                case 15: goto L_0x0583;
                case 16: goto L_0x0591;
                case 17: goto L_0x059f;
                case 18: goto L_0x05c8;
                case 19: goto L_0x003d;
                case 20: goto L_0x05f8;
                case 21: goto L_0x0640;
                case 22: goto L_0x0674;
                case 23: goto L_0x0680;
                case 24: goto L_0x0694;
                case 25: goto L_0x06a8;
                case 26: goto L_0x06bc;
                case 27: goto L_0x06c8;
                case 28: goto L_0x0717;
                case 29: goto L_0x0795;
                case 30: goto L_0x07b9;
                case 31: goto L_0x07dd;
                case 32: goto L_0x0801;
                case 33: goto L_0x0825;
                case 34: goto L_0x0833;
                case 35: goto L_0x083f;
                case 36: goto L_0x0853;
                case 37: goto L_0x00aa;
                case 38: goto L_0x003d;
                case 39: goto L_0x0867;
                case 40: goto L_0x08f2;
                case 41: goto L_0x0914;
                case 42: goto L_0x0936;
                case 43: goto L_0x003d;
                case 44: goto L_0x0959;
                case 45: goto L_0x003d;
                case 46: goto L_0x09bd;
                case 47: goto L_0x09c9;
                case 48: goto L_0x09dd;
                case 49: goto L_0x09f1;
                case 50: goto L_0x0a05;
                case 51: goto L_0x013b;
                case 52: goto L_0x0a11;
                case 53: goto L_0x0a8c;
                case 54: goto L_0x0aae;
                case 55: goto L_0x0adc;
                case 56: goto L_0x0af0;
                case 57: goto L_0x0b68;
                case 58: goto L_0x0171;
                case 59: goto L_0x0bba;
                case 60: goto L_0x019c;
                case 61: goto L_0x0ce9;
                case 62: goto L_0x0bd9;
                case 63: goto L_0x0be9;
                case 64: goto L_0x0bf9;
                case 65: goto L_0x0c29;
                case 66: goto L_0x0c35;
                case 67: goto L_0x0c41;
                case 68: goto L_0x0cc7;
                case 69: goto L_0x003e;
                case 70: goto L_0x01da;
                case 71: goto L_0x0ea4;
                case 72: goto L_0x003d;
                case 73: goto L_0x005f;
                case 74: goto L_0x0071;
                case 75: goto L_0x0206;
                case 76: goto L_0x0ec4;
                case 77: goto L_0x0f14;
                case 78: goto L_0x0f29;
                case 79: goto L_0x0b06;
                case 80: goto L_0x0f3e;
                case 81: goto L_0x0f4c;
                case 82: goto L_0x0f5a;
                case 83: goto L_0x0f68;
                case 84: goto L_0x0fa9;
                case 85: goto L_0x0fbd;
                case 86: goto L_0x0fd1;
                case 87: goto L_0x0fe1;
                case 88: goto L_0x003d;
                case 89: goto L_0x003d;
                case 90: goto L_0x102d;
                case 91: goto L_0x1139;
                case 92: goto L_0x114a;
                case 93: goto L_0x115b;
                case 94: goto L_0x115b;
                case 95: goto L_0x1165;
                case 96: goto L_0x11c0;
                case 97: goto L_0x003d;
                case 98: goto L_0x11cc;
                case 99: goto L_0x11dc;
                case 100: goto L_0x11e8;
                case 101: goto L_0x121c;
                case 102: goto L_0x127f;
                case 103: goto L_0x11a0;
                case 104: goto L_0x129d;
                case 105: goto L_0x12b5;
                case 106: goto L_0x102d;
                case 107: goto L_0x12e1;
                case 108: goto L_0x12fb;
                case 109: goto L_0x1318;
                case 110: goto L_0x003d;
                case 111: goto L_0x003d;
                case 112: goto L_0x1335;
                case 113: goto L_0x1352;
                case 114: goto L_0x1352;
                case 115: goto L_0x003d;
                case 116: goto L_0x136f;
                default: goto L_0x003d;
            }
        L_0x003d:
            return r16
        L_0x003e:
            X.1sR r1 = (X.C39411sR) r1
            X.0tz r0 = r0.A06
            android.content.Context r0 = r0.A00
            android.content.res.Resources r3 = r0.getResources()
            int r0 = r1.A00
            if (r0 == r2) goto L_0x005a
            if (r0 == r7) goto L_0x0055
            if (r0 != r8) goto L_0x0d0b
            r1 = 2131886614(0x7f120216, float:1.9407812E38)
            goto L_0x0201
        L_0x0055:
            r1 = 2131886615(0x7f120217, float:1.9407814E38)
            goto L_0x0201
        L_0x005a:
            r1 = 2131888589(0x7f1209cd, float:1.9411818E38)
            goto L_0x0201
        L_0x005f:
            X.0tz r0 = r0.A06
            android.content.Context r0 = r0.A00
            android.content.res.Resources r3 = r0.getResources()
            r1 = 2131889099(0x7f120bcb, float:1.9412852E38)
            if (r26 == 0) goto L_0x0201
            r1 = 2131889098(0x7f120bca, float:1.941285E38)
            goto L_0x0201
        L_0x0071:
            X.0tz r0 = r0.A06
            android.content.Context r0 = r0.A00
            android.content.res.Resources r3 = r0.getResources()
            r1 = 2131889097(0x7f120bc9, float:1.9412848E38)
            if (r26 == 0) goto L_0x0201
            r1 = 2131889096(0x7f120bc8, float:1.9412846E38)
            goto L_0x0201
        L_0x0083:
            r6 = r1
            X.1sH r6 = (X.C39321sH) r6
            X.0rv r5 = r1.A0B()
            if (r5 == 0) goto L_0x003d
            X.0sK r1 = r0.A01
            boolean r5 = r1.A0I(r5)
            java.lang.String r1 = r6.A13()
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            X.0tz r0 = r0.A06
            if (r5 == 0) goto L_0x13b5
            android.content.Context r1 = r0.A00
            if (r6 == 0) goto L_0x13ad
            r0 = 2131890847(0x7f12129f, float:1.9416397E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x00aa:
            X.15Y r0 = r0.A0F
            X.1sN r1 = (X.C39371sN) r1
            X.1Vw r11 = r1.A02
            X.AnonymousClass00B.A06(r11)
            java.lang.String r3 = r1.A02
            java.lang.String r9 = r1.A04
            r5 = 0
            long r21 = X.C29501aj.A01(r9, r5)
            java.lang.String r9 = r1.A01
            X.AnonymousClass00B.A06(r9)
            java.lang.String r12 = ";"
            java.lang.String[] r9 = r9.split(r12)
            int r13 = r9.length
            r10 = 5
            if (r13 < r10) goto L_0x0138
            java.lang.String r1 = r1.A00
            if (r1 == 0) goto L_0x0138
            java.lang.String[] r10 = r1.split(r12)
            X.15p r12 = r0.A0B
            boolean r1 = r11.A02
            r13 = r9[r8]
            r8 = 4
            r14 = r9[r8]
            r7 = r9[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r16 = r7.intValue()
            r7 = r9[r4]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r17 = r7.intValue()
            long r19 = X.C29501aj.A01(r3, r5)
            r3 = r10[r4]
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0135
            X.0tz r2 = r0.A04
            android.content.Context r3 = r2.A00
            r2 = 2131892363(0x7f12188b, float:1.9419472E38)
            java.lang.String r15 = r3.getString(r2)
        L_0x0108:
            r2 = r10[r4]
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x012a
            r18 = 1
        L_0x0112:
            r23 = r1
            java.lang.String r16 = r12.A0Y(r13, r14, r15, r16, r17, r18, r19, r21, r23)
        L_0x0118:
            boolean r1 = android.text.TextUtils.isEmpty(r16)
            if (r1 == 0) goto L_0x003d
            X.0tz r0 = r0.A04
            android.content.Context r1 = r0.A00
            r0 = 2131890503(0x7f121147, float:1.94157E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x012a:
            r2 = r10[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r18 = r2.intValue()
            goto L_0x0112
        L_0x0135:
            r15 = r10[r2]
            goto L_0x0108
        L_0x0138:
            r16 = 0
            goto L_0x0118
        L_0x013b:
            r7 = 2131755189(0x7f1000b5, float:1.914125E38)
            r3 = r1
            X.1sE r3 = (X.C39291sE) r3
            java.util.List r8 = r3.A01
            X.0sK r3 = r0.A01
            X.0rv r1 = r1.A0B()
            boolean r1 = r3.A0I(r1)
            if (r1 == 0) goto L_0x003d
            X.0tz r1 = r0.A06
            android.content.Context r1 = r1.A00
            android.content.res.Resources r6 = r1.getResources()
            int r5 = r8.size()
            java.lang.Object[] r3 = new java.lang.Object[r2]
            X.013 r2 = r0.A07
            X.0sP r1 = r0.A04
            r0 = -1
            java.lang.String r0 = r1.A0L(r8, r0)
            java.lang.String r0 = r2.A0G(r0)
            r3[r4] = r0
            java.lang.String r16 = r6.getQuantityString(r7, r5, r3)
            return r16
        L_0x0171:
            boolean r2 = r1 instanceof X.C39391sP
            if (r2 == 0) goto L_0x003d
            X.1sP r1 = (X.C39391sP) r1
            boolean r4 = r1.A00
            X.0sG r1 = r0.A03
            X.AnonymousClass00B.A06(r13)
            X.0sH r3 = r1.A08(r13)
            if (r3 == 0) goto L_0x003d
            X.0zl r2 = r0.A0C
            X.0rv r1 = r3.A0E
            boolean r1 = X.C40561uK.A01(r2, r1)
            if (r4 == 0) goto L_0x13eb
            if (r1 == 0) goto L_0x13d1
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            r0 = 2131893036(0x7f121b2c, float:1.9420837E38)
            java.lang.String r16 = X.C34811ku.A05(r1, r0)
            return r16
        L_0x019c:
            X.1sQ r1 = (X.C39401sQ) r1
            int r1 = r1.A00
            r2 = 2131888164(0x7f120824, float:1.9410956E38)
            r5 = 2131888165(0x7f120825, float:1.9410958E38)
            if (r1 <= 0) goto L_0x01ae
            r2 = 2131888166(0x7f120826, float:1.941096E38)
            r5 = 2131888167(0x7f120827, float:1.9410962E38)
        L_0x01ae:
            boolean r1 = r14.A02
            if (r1 == 0) goto L_0x01bb
            X.0tz r0 = r0.A06
            android.content.Context r0 = r0.A00
            java.lang.String r16 = r0.getString(r2)
            return r16
        L_0x01bb:
            r4 = 1
            r2 = 2
            if (r18 == 0) goto L_0x01c0
            r2 = 1
        L_0x01c0:
            if (r13 == 0) goto L_0x003d
            X.0sG r1 = r0.A03
            X.0sH r1 = r1.A0A(r13)
            java.lang.String r3 = r0.A04(r1, r2)
            X.0tz r0 = r0.A06
            android.content.Context r2 = r0.A00
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 0
            r1[r0] = r3
            java.lang.String r16 = r2.getString(r5, r1)
            return r16
        L_0x01da:
            boolean r3 = r1 instanceof X.C39421sS
            if (r3 == 0) goto L_0x003d
            X.0rv r6 = r1.A0B()
            if (r6 == 0) goto L_0x003d
            r5 = r1
            X.1sS r5 = (X.C39421sS) r5
            X.0sK r3 = r0.A01
            boolean r3 = r3.A0I(r6)
            if (r3 == 0) goto L_0x1413
            X.0tz r0 = r0.A06
            android.content.Context r0 = r0.A00
            android.content.res.Resources r3 = r0.getResources()
            boolean r0 = r5.A01
            r1 = 2131889240(0x7f120c58, float:1.9413138E38)
            if (r0 == 0) goto L_0x0201
            r1 = 2131889238(0x7f120c56, float:1.9413134E38)
        L_0x0201:
            java.lang.String r16 = r3.getString(r1)
            return r16
        L_0x0206:
            X.1sT r1 = (X.C39431sT) r1
            X.0tz r4 = r0.A06
            android.content.Context r4 = r4.A00
            java.lang.Integer r10 = r1.A02
            int r9 = r1.A00
            r11 = 1
            if (r9 == r7) goto L_0x0216
            if (r9 == r8) goto L_0x0216
            r2 = 0
        L_0x0216:
            if (r10 == 0) goto L_0x0221
            int r5 = r10.intValue()
            if (r5 != r7) goto L_0x0221
            r6 = 1
            if (r9 == 0) goto L_0x0222
        L_0x0221:
            r6 = 0
        L_0x0222:
            com.whatsapp.jid.GroupJid r5 = r1.A01
            if (r2 == 0) goto L_0x023c
            if (r10 == 0) goto L_0x0229
            r11 = 0
        L_0x0229:
            X.0sK r2 = r0.A01
            X.0rv r1 = r1.A0B()
            boolean r10 = r2.A0I(r1)
            r6 = r0
            r7 = r4
            r8 = r5
            r9 = r3
            java.lang.String r16 = r6.A03(r7, r8, r9, r10, r11)
            return r16
        L_0x023c:
            if (r6 == 0) goto L_0x003d
            X.0sK r2 = r0.A01
            X.0rv r1 = r1.A0B()
            boolean r1 = r2.A0I(r1)
            X.0rt r0 = r0.A08
            java.lang.String r6 = r0.A09(r5)
            r5 = 0
            if (r1 == 0) goto L_0x0267
            r2 = 0
        L_0x0252:
            boolean r1 = X.AnonymousClass1ZW.A0E(r6)
            int[][] r0 = A0L
            r0 = r0[r2]
            r1 = r0[r1]
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r5] = r3
            r0[r11] = r6
            java.lang.String r16 = r4.getString(r1, r0)
            return r16
        L_0x0267:
            boolean r0 = X.AnonymousClass1ZW.A0E(r3)
            r2 = 1
            if (r0 == 0) goto L_0x0252
            r2 = 2
            goto L_0x0252
        L_0x0270:
            boolean r3 = r1.A12()
            if (r3 == 0) goto L_0x027c
            X.0rv r10 = r1.A0B()
            goto L_0x001e
        L_0x027c:
            r10 = r11
        L_0x027d:
            r9 = r11
            r3 = r11
            goto L_0x002a
        L_0x0281:
            java.lang.String r5 = r1.A0I()
            r9 = 0
            if (r5 == 0) goto L_0x0292
            java.lang.String r6 = r1.A0I()
            java.lang.String r5 = "\n"
            java.lang.String[] r11 = r6.split(r5)
        L_0x0292:
            boolean r5 = r1 instanceof X.C39281sD
            if (r5 == 0) goto L_0x029b
            r5 = r1
            X.1sD r5 = (X.C39281sD) r5
            java.lang.String r9 = r5.A01
        L_0x029b:
            java.lang.String r10 = "\""
            if (r11 == 0) goto L_0x0325
            int r5 = r11.length
            if (r5 != r7) goto L_0x0325
            X.0rv r5 = r1.A0B()
            if (r5 == 0) goto L_0x02bc
            r5 = r11[r4]
            X.0rv r5 = X.C15830rv.A02(r5)
            if (r5 == 0) goto L_0x0325
            r5 = r11[r2]
            int r6 = r5.lastIndexOf(r10)
            int r5 = r5.indexOf(r10)
            if (r6 <= r5) goto L_0x0325
        L_0x02bc:
            r5 = r11[r4]
            X.0rv r12 = X.C15830rv.A02(r5)
            if (r12 == 0) goto L_0x02d2
            r5 = 2
            if (r18 == 0) goto L_0x02c8
            r5 = 1
        L_0x02c8:
            X.0sG r3 = r0.A03
            X.0sH r3 = r3.A0A(r12)
            java.lang.String r3 = r0.A04(r3, r5)
        L_0x02d2:
            r5 = r11[r2]
            int r9 = r5.indexOf(r10)
            int r8 = r5.lastIndexOf(r10)
            if (r8 > r9) goto L_0x0305
            java.lang.String r6 = "divider_row/rr="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            X.0rv r1 = r1.A0B()
            r5.append(r1)
            java.lang.String r1 = " jid="
            r5.append(r1)
            r5.append(r12)
            java.lang.String r1 = " s="
            r5.append(r1)
            r1 = r11[r2]
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0305:
            X.0tz r1 = r0.A06
            android.content.Context r6 = r1.A00
            r5 = 2131888911(0x7f120b0f, float:1.941247E38)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r4] = r3
            X.013 r3 = r0.A07
            r1 = r11[r2]
            int r0 = r9 + 1
            java.lang.String r0 = r1.substring(r0, r8)
        L_0x031a:
            java.lang.String r0 = r3.A0G(r0)
            r7[r2] = r0
            java.lang.String r16 = r6.getString(r5, r7)
            return r16
        L_0x0325:
            X.0sK r6 = r0.A01
            X.0rv r5 = r1.A0B()
            boolean r5 = r6.A0I(r5)
            if (r5 != 0) goto L_0x0359
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            X.0tz r5 = r0.A06
            android.content.Context r6 = r5.A00
            if (r10 != 0) goto L_0x03bd
            r10 = 2131888912(0x7f120b10, float:1.9412473E38)
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r5[r4] = r3
            X.013 r3 = r0.A07
            java.lang.String r0 = r3.A0G(r9)
            r5[r2] = r0
            java.lang.String r0 = r1.A0I()
            java.lang.String r0 = r3.A0G(r0)
            r5[r7] = r0
            java.lang.String r16 = r6.getString(r10, r5)
            return r16
        L_0x0359:
            java.lang.String r3 = r1.A0I()
            X.AnonymousClass00B.A06(r3)
            int r6 = r3.indexOf(r10)
            java.lang.String r3 = r1.A0I()
            int r5 = r3.lastIndexOf(r10)
            if (r6 != 0) goto L_0x0399
            java.lang.String r3 = r1.A0I()
            int r3 = r3.length()
            int r3 = r3 - r2
            if (r5 != r3) goto L_0x0399
            if (r6 == r5) goto L_0x0399
            java.lang.String r1 = r1.A0I()
            java.lang.String r5 = r1.substring(r2, r5)
            X.0tz r1 = r0.A06
            android.content.Context r6 = r1.A00
            r3 = 2131888913(0x7f120b11, float:1.9412475E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.013 r0 = r0.A07
        L_0x038e:
            java.lang.String r0 = r0.A0G(r5)
            r2[r4] = r0
            java.lang.String r16 = r6.getString(r3, r2)
            return r16
        L_0x0399:
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            X.0tz r3 = r0.A06
            android.content.Context r6 = r3.A00
            if (r5 != 0) goto L_0x03b1
            r5 = 2131888914(0x7f120b12, float:1.9412477E38)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            X.013 r3 = r0.A07
            java.lang.String r0 = r3.A0G(r9)
            r7[r4] = r0
            goto L_0x03c6
        L_0x03b1:
            r3 = 2131888913(0x7f120b11, float:1.9412475E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.013 r0 = r0.A07
            java.lang.String r5 = r1.A0I()
            goto L_0x038e
        L_0x03bd:
            r5 = 2131888911(0x7f120b0f, float:1.941247E38)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r4] = r3
            X.013 r3 = r0.A07
        L_0x03c6:
            java.lang.String r0 = r1.A0I()
            goto L_0x031a
        L_0x03cc:
            r7 = 2131889249(0x7f120c61, float:1.9413156E38)
            r8 = 2131888861(0x7f120add, float:1.941237E38)
            r9 = 2131755183(0x7f1000af, float:1.9141238E38)
            r4 = r0
            r5 = r1
            r6 = r3
            java.lang.String r16 = r4.A0A(r5, r6, r7, r8, r9)
            return r16
        L_0x03dd:
            X.0sK r5 = r0.A01
            X.0rv r1 = r1.A0B()
            boolean r1 = r5.A0I(r1)
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            if (r1 == 0) goto L_0x03f5
            r0 = 2131888868(0x7f120ae4, float:1.9412383E38)
            java.lang.String r16 = r5.getString(r0)
            return r16
        L_0x03f5:
            r1 = 2131888867(0x7f120ae3, float:1.9412381E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r3
            java.lang.String r16 = r5.getString(r1, r0)
            return r16
        L_0x0401:
            r7 = 2131889250(0x7f120c62, float:1.9413158E38)
            r8 = 2131888870(0x7f120ae6, float:1.9412388E38)
            r9 = 2131755188(0x7f1000b4, float:1.9141248E38)
            r4 = r0
            r5 = r1
            r6 = r3
            java.lang.String r16 = r4.A0A(r5, r6, r7, r8, r9)
            return r16
        L_0x0412:
            if (r13 == 0) goto L_0x041c
            X.0sG r1 = r0.A03
            X.0sH r1 = r1.A0A(r13)
            boolean r4 = r1.A0a
        L_0x041c:
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            if (r4 == 0) goto L_0x0427
            r0 = 2131887014(0x7f1203a6, float:1.9408623E38)
            goto L_0x0ac6
        L_0x0427:
            r0 = 2131887015(0x7f1203a7, float:1.9408625E38)
            if (r17 == 0) goto L_0x0ac6
            r0 = 2131887016(0x7f1203a8, float:1.9408627E38)
            goto L_0x0ac6
        L_0x0431:
            r3 = r1
            X.1sE r3 = (X.C39291sE) r3
            java.util.List r9 = r3.A01
            java.lang.String r3 = r1.A0I()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            X.0tz r0 = r0.A06
            android.content.Context r0 = r0.A00
            if (r3 == 0) goto L_0x0460
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131755413(0x7f100195, float:1.9141705E38)
            int r3 = r9.size()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            int r0 = r9.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r4] = r0
            java.lang.String r16 = r6.getQuantityString(r5, r3, r1)
            return r16
        L_0x0460:
            android.content.res.Resources r8 = r0.getResources()
            r6 = 2131755412(0x7f100194, float:1.9141703E38)
            int r5 = r9.size()
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r0 = r1.A0I()
            r3[r4] = r0
            int r0 = r9.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r2] = r0
            java.lang.String r16 = r8.getQuantityString(r6, r5, r3)
            return r16
        L_0x0482:
            X.1WT r1 = (X.AnonymousClass1WT) r1
            com.whatsapp.jid.UserJid r5 = r1.A00
            com.whatsapp.jid.UserJid r1 = r1.A01
            if (r1 == 0) goto L_0x048d
            r1.getRawString()
        L_0x048d:
            r11 = 160(0xa0, float:2.24E-43)
            r10 = 32
            X.0sP r1 = r0.A04
            boolean r1 = r1.A0S(r9, r2)
            if (r1 == 0) goto L_0x04c3
            X.AnonymousClass00B.A06(r5)
            java.lang.String r9 = X.C24561Gk.A04(r5)
            X.0tz r1 = r0.A06
            android.content.Context r8 = r1.A00
            r6 = 2131888863(0x7f120adf, float:1.9412373E38)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.String r1 = r3.replace(r10, r11)
            r5[r4] = r1
            X.AnonymousClass00B.A06(r9)
            X.013 r1 = r0.A07
            java.lang.String r0 = r9.replace(r10, r11)
            java.lang.String r0 = r1.A0H(r0)
            r5[r2] = r0
            java.lang.String r16 = r8.getString(r6, r5)
            return r16
        L_0x04c3:
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            r1 = 2131888862(0x7f120ade, float:1.9412371E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r3
            java.lang.String r16 = r5.getString(r1, r0)
            return r16
        L_0x04d3:
            X.0sK r6 = r0.A01
            X.0rv r5 = r1.A0B()
            boolean r5 = r6.A0I(r5)
            if (r5 != 0) goto L_0x0506
            X.0rv r8 = r1.A0B()
            X.0tz r5 = r0.A06
            android.content.Context r6 = r5.A00
            if (r8 == 0) goto L_0x0513
            r8 = 2131888725(0x7f120a55, float:1.9412093E38)
            if (r17 == 0) goto L_0x04f1
            r8 = 2131889920(0x7f120f00, float:1.9414517E38)
        L_0x04f1:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r5[r4] = r3
            X.013 r3 = r0.A07
            java.lang.String r0 = r1.A0I()
            java.lang.String r0 = r3.A0G(r0)
            r5[r2] = r0
            java.lang.String r16 = r6.getString(r8, r5)
            return r16
        L_0x0506:
            X.0tz r3 = r0.A06
            android.content.Context r6 = r3.A00
            r5 = 2131888726(0x7f120a56, float:1.9412095E38)
            if (r17 == 0) goto L_0x051b
            r5 = 2131889921(0x7f120f01, float:1.941452E38)
            goto L_0x051b
        L_0x0513:
            r5 = 2131888724(0x7f120a54, float:1.9412091E38)
            if (r17 == 0) goto L_0x051b
            r5 = 2131889919(0x7f120eff, float:1.9414515E38)
        L_0x051b:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            X.013 r2 = r0.A07
            java.lang.String r0 = r1.A0I()
            java.lang.String r0 = r2.A0G(r0)
            r3[r4] = r0
            java.lang.String r16 = r6.getString(r5, r3)
            return r16
        L_0x052e:
            r7 = 2131888876(0x7f120aec, float:1.94124E38)
            r8 = 2131888861(0x7f120add, float:1.941237E38)
            r9 = 2131755183(0x7f1000af, float:1.9141238E38)
            r10 = 2131888873(0x7f120ae9, float:1.9412394E38)
            r11 = 2131888872(0x7f120ae8, float:1.9412392E38)
            r12 = 2131755207(0x7f1000c7, float:1.9141287E38)
            r4 = r0
            r5 = r1
            r6 = r3
            java.lang.String r16 = r4.A0B(r5, r6, r7, r8, r9, r10, r11, r12)
            return r16
        L_0x0548:
            X.1sE r1 = (X.C39291sE) r1
            java.util.List r7 = r1.A01
            X.0tz r1 = r0.A06
            android.content.Context r6 = r1.A00
            r5 = 2131888867(0x7f120ae3, float:1.9412381E38)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            X.013 r2 = r0.A07
            X.0sP r1 = r0.A04
            r0 = -1
            java.lang.String r0 = r1.A0L(r7, r0)
            java.lang.String r0 = r2.A0G(r0)
            r3[r4] = r0
            java.lang.String r16 = r6.getString(r5, r3)
            return r16
        L_0x0569:
            r7 = 2131888877(0x7f120aed, float:1.9412402E38)
            r8 = 2131888870(0x7f120ae6, float:1.9412388E38)
            r9 = 2131755188(0x7f1000b4, float:1.9141248E38)
            r10 = 2131888875(0x7f120aeb, float:1.9412398E38)
            r11 = 2131888874(0x7f120aea, float:1.9412396E38)
            r12 = 2131755208(0x7f1000c8, float:1.9141289E38)
            r4 = r0
            r5 = r1
            r6 = r3
            java.lang.String r16 = r4.A0B(r5, r6, r7, r8, r9, r10, r11, r12)
            return r16
        L_0x0583:
            r4 = 2131888869(0x7f120ae5, float:1.9412386E38)
            r3 = 2131755187(0x7f1000b3, float:1.9141246E38)
            r2 = 2131755186(0x7f1000b2, float:1.9141244E38)
            java.lang.String r16 = r0.A07(r1, r4, r3, r2)
            return r16
        L_0x0591:
            r4 = 2131888864(0x7f120ae0, float:1.9412375E38)
            r3 = 2131755185(0x7f1000b1, float:1.9141242E38)
            r2 = 2131755184(0x7f1000b0, float:1.914124E38)
            java.lang.String r16 = r0.A07(r1, r4, r3, r2)
            return r16
        L_0x059f:
            X.0sG r1 = r0.A03
            X.AnonymousClass00B.A06(r13)
            X.0sH r1 = r1.A08(r13)
            if (r1 == 0) goto L_0x05ba
            boolean r1 = r1.A0a
            if (r1 == 0) goto L_0x05ba
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            r0 = 2131887010(0x7f1203a2, float:1.9408615E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x05ba:
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            r0 = 2131888755(0x7f120a73, float:1.9412154E38)
            if (r17 == 0) goto L_0x0ac6
            r0 = 2131889933(0x7f120f0d, float:1.9414544E38)
            goto L_0x0ac6
        L_0x05c8:
            r5 = 2131888943(0x7f120b2f, float:1.9412536E38)
            X.0rv r1 = r1.A0B()
            if (r1 != 0) goto L_0x05eb
            X.0tz r1 = r0.A06
            android.content.Context r3 = r1.A00
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.0sG r1 = r0.A03
            X.AnonymousClass00B.A06(r13)
            X.0sH r1 = r1.A0A(r13)
            java.lang.String r0 = r0.A04(r1, r12)
            r2[r4] = r0
            java.lang.String r16 = r3.getString(r5, r2)
            return r16
        L_0x05eb:
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r3
            java.lang.String r16 = r1.getString(r5, r0)
            return r16
        L_0x05f8:
            X.1sE r1 = (X.C39291sE) r1
            java.util.List r7 = r1.A01
            int r1 = r7.size()
            if (r1 != r2) goto L_0x061e
            X.0sK r3 = r0.A01
            java.lang.Object r1 = r7.get(r4)
            X.0rv r1 = (X.C15830rv) r1
            boolean r1 = r3.A0I(r1)
            if (r1 == 0) goto L_0x061e
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            r0 = 2131888866(0x7f120ae2, float:1.941238E38)
            if (r17 == 0) goto L_0x0ac6
            r0 = 2131889945(0x7f120f19, float:1.9414568E38)
            goto L_0x0ac6
        L_0x061e:
            X.0tz r1 = r0.A06
            android.content.Context r6 = r1.A00
            r5 = 2131888865(0x7f120ae1, float:1.9412377E38)
            if (r17 == 0) goto L_0x062a
            r5 = 2131889944(0x7f120f18, float:1.9414566E38)
        L_0x062a:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            X.013 r2 = r0.A07
            X.0sP r1 = r0.A04
            r0 = -1
            java.lang.String r0 = r1.A0L(r7, r0)
            java.lang.String r0 = r2.A0G(r0)
            r3[r4] = r0
            java.lang.String r16 = r6.getString(r5, r3)
            return r16
        L_0x0640:
            X.0rv r5 = r1.A0B()
            if (r5 != 0) goto L_0x0654
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            r0 = 2131889081(0x7f120bb9, float:1.9412815E38)
            if (r26 == 0) goto L_0x0ac6
            r0 = 2131889080(0x7f120bb8, float:1.9412813E38)
            goto L_0x0ac6
        L_0x0654:
            X.0sK r1 = r0.A01
            boolean r1 = r1.A0I(r5)
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            if (r1 == 0) goto L_0x066a
            r0 = 2131889085(0x7f120bbd, float:1.9412824E38)
            if (r26 == 0) goto L_0x0ac6
            r0 = 2131889084(0x7f120bbc, float:1.9412822E38)
            goto L_0x0ac6
        L_0x066a:
            r1 = 2131889083(0x7f120bbb, float:1.941282E38)
            if (r26 == 0) goto L_0x0ad3
            r1 = 2131889082(0x7f120bba, float:1.9412818E38)
            goto L_0x0ad3
        L_0x0674:
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            r0 = 2131892799(0x7f121a3f, float:1.9420356E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x0680:
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            r3 = 2131892794(0x7f121a3a, float:1.9420346E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.1sG r1 = (X.C39311sG) r1
            java.lang.String r0 = r1.A00
            r2[r4] = r0
            java.lang.String r16 = r5.getString(r3, r2)
            return r16
        L_0x0694:
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            r3 = 2131892788(0x7f121a34, float:1.9420334E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.1sG r1 = (X.C39311sG) r1
            java.lang.String r0 = r1.A00
            r2[r4] = r0
            java.lang.String r16 = r5.getString(r3, r2)
            return r16
        L_0x06a8:
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            r3 = 2131892784(0x7f121a30, float:1.9420326E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.1sG r1 = (X.C39311sG) r1
            java.lang.String r0 = r1.A00
            r2[r4] = r0
            java.lang.String r16 = r5.getString(r3, r2)
            return r16
        L_0x06bc:
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            r0 = 2131892778(0x7f121a2a, float:1.9420314E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x06c8:
            java.lang.String r5 = r1.A0I()
            r7 = 0
            if (r5 != 0) goto L_0x06d0
            r7 = 1
        L_0x06d0:
            X.0sK r6 = r0.A01
            X.0rv r5 = r1.A0B()
            boolean r5 = r6.A0I(r5)
            if (r5 != 0) goto L_0x06f9
            X.0rv r1 = r1.A0B()
            if (r1 != 0) goto L_0x06fc
            int[][] r1 = A0R
        L_0x06e4:
            r3 = 1
            r1 = r1[r2]
            if (r7 == 0) goto L_0x06f5
            r3 = 0
        L_0x06ea:
            r1 = r1[r3]
            X.0tz r0 = r0.A06
            android.content.Context r0 = r0.A00
            java.lang.String r16 = r0.getString(r1)
            return r16
        L_0x06f5:
            if (r26 != 0) goto L_0x06ea
            r3 = 2
            goto L_0x06ea
        L_0x06f9:
            int[][] r1 = A0O
            goto L_0x06e4
        L_0x06fc:
            int[][] r1 = A0N
            r5 = 1
            r1 = r1[r2]
            if (r7 == 0) goto L_0x0713
            r5 = 0
        L_0x0704:
            r5 = r1[r5]
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r3
            java.lang.String r16 = r1.getString(r5, r0)
            return r16
        L_0x0713:
            if (r26 != 0) goto L_0x0704
            r5 = 2
            goto L_0x0704
        L_0x0717:
            X.1WT r1 = (X.AnonymousClass1WT) r1
            com.whatsapp.jid.UserJid r6 = r1.A00
            com.whatsapp.jid.UserJid r5 = r1.A01
            if (r5 == 0) goto L_0x0764
            r5.getRawString()
            r8 = 160(0xa0, float:2.24E-43)
            r7 = 32
            X.AnonymousClass00B.A06(r5)
            X.1Vw r1 = r1.A11
            X.0rv r1 = r1.A00
            boolean r5 = r5.equals(r1)
            X.0sK r1 = r0.A01
            boolean r1 = r1.A0G()
            if (r1 != 0) goto L_0x075b
            r6 = 2131887160(0x7f120438, float:1.940892E38)
            if (r5 == 0) goto L_0x0741
            r6 = 2131887162(0x7f12043a, float:1.9408923E38)
        L_0x0741:
            X.0sP r5 = r0.A04
            r1 = -1
            boolean r5 = r5.A0S(r9, r1)
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            java.lang.Object[] r0 = new java.lang.Object[r2]
            if (r5 == 0) goto L_0x0754
            java.lang.String r3 = r3.replace(r7, r8)
        L_0x0754:
            r0[r4] = r3
            java.lang.String r16 = r1.getString(r6, r0)
            return r16
        L_0x075b:
            r6 = 2131887161(0x7f120439, float:1.9408921E38)
            if (r5 == 0) goto L_0x0741
            r6 = 2131887163(0x7f12043b, float:1.9408925E38)
            goto L_0x0741
        L_0x0764:
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r3 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat
            r8.<init>(r3, r9)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            if (r6 != 0) goto L_0x0792
            java.lang.String r3 = "null"
        L_0x0774:
            r7[r4] = r3
            long r5 = r1.A0I
            java.util.Date r1 = new java.util.Date
            r1.<init>(r5)
            java.lang.String r1 = r8.format(r1)
            r7[r2] = r1
            java.lang.String r1 = "oldJid=nul, newJid=%s, date=%s"
            java.lang.String r2 = java.lang.String.format(r9, r1, r7)
            X.0so r1 = r0.A00
            java.lang.String r0 = "sys-msg/number-change/render-issue"
            r1.AcB(r0, r2, r4)
            return r16
        L_0x0792:
            java.lang.String r3 = "not-null"
            goto L_0x0774
        L_0x0795:
            X.0sK r5 = r0.A01
            X.0rv r1 = r1.A0B()
            boolean r1 = r5.A0I(r1)
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            if (r1 == 0) goto L_0x07af
            r0 = 2131888890(0x7f120afa, float:1.9412428E38)
            if (r17 == 0) goto L_0x0ac6
            r0 = 2131889951(0x7f120f1f, float:1.941458E38)
            goto L_0x0ac6
        L_0x07af:
            r1 = 2131888889(0x7f120af9, float:1.9412426E38)
            if (r17 == 0) goto L_0x0ad3
            r1 = 2131889950(0x7f120f1e, float:1.9414578E38)
            goto L_0x0ad3
        L_0x07b9:
            X.0sK r5 = r0.A01
            X.0rv r1 = r1.A0B()
            boolean r1 = r5.A0I(r1)
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            if (r1 == 0) goto L_0x07d3
            r0 = 2131888888(0x7f120af8, float:1.9412424E38)
            if (r17 == 0) goto L_0x0ac6
            r0 = 2131889949(0x7f120f1d, float:1.9414576E38)
            goto L_0x0ac6
        L_0x07d3:
            r1 = 2131888887(0x7f120af7, float:1.9412422E38)
            if (r17 == 0) goto L_0x0ad3
            r1 = 2131889948(0x7f120f1c, float:1.9414574E38)
            goto L_0x0ad3
        L_0x07dd:
            X.0sK r5 = r0.A01
            X.0rv r1 = r1.A0B()
            boolean r1 = r5.A0I(r1)
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            if (r1 == 0) goto L_0x07f5
            r0 = 2131888691(0x7f120a33, float:1.9412024E38)
            java.lang.String r16 = r5.getString(r0)
            return r16
        L_0x07f5:
            r1 = 2131888690(0x7f120a32, float:1.9412022E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r3
            java.lang.String r16 = r5.getString(r1, r0)
            return r16
        L_0x0801:
            X.0sK r5 = r0.A01
            X.0rv r1 = r1.A0B()
            boolean r1 = r5.A0I(r1)
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            if (r1 == 0) goto L_0x0819
            r0 = 2131888689(0x7f120a31, float:1.941202E38)
            java.lang.String r16 = r5.getString(r0)
            return r16
        L_0x0819:
            r1 = 2131888688(0x7f120a30, float:1.9412018E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r3
            java.lang.String r16 = r5.getString(r1, r0)
            return r16
        L_0x0825:
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            r0 = 2131888321(0x7f1208c1, float:1.9411274E38)
            if (r17 == 0) goto L_0x0ac6
            r0 = 2131888322(0x7f1208c2, float:1.9411276E38)
            goto L_0x0ac6
        L_0x0833:
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            r0 = 2131892796(0x7f121a3c, float:1.942035E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x083f:
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            r3 = 2131892801(0x7f121a41, float:1.942036E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.1sG r1 = (X.C39311sG) r1
            java.lang.String r0 = r1.A00
            r2[r4] = r0
            java.lang.String r16 = r5.getString(r3, r2)
            return r16
        L_0x0853:
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            r3 = 2131892792(0x7f121a38, float:1.9420342E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.1sG r1 = (X.C39311sG) r1
            java.lang.String r0 = r1.A00
            r2[r4] = r0
            java.lang.String r16 = r5.getString(r3, r2)
            return r16
        L_0x0867:
            X.15Y r10 = r0.A0F
            X.1sM r1 = (X.C39361sM) r1
            java.lang.String r0 = r1.A01
            if (r0 != 0) goto L_0x08bb
            r5 = 1
        L_0x0870:
            java.lang.String r0 = r1.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x08b2
            X.0tz r0 = r10.A04
            android.content.Context r3 = r0.A00
            r0 = 2131892363(0x7f12188b, float:1.9419472E38)
            java.lang.String r11 = r3.getString(r0)
        L_0x0883:
            java.lang.String r6 = r1.A03
            X.15p r3 = r10.A0B
            int r0 = r1.A00
            long r0 = (long) r0
            java.lang.String r9 = r3.A0G(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x08ce
            X.0tz r0 = r10.A04
            android.content.Context r0 = r0.A00
            android.content.res.Resources r3 = r0.getResources()
            if (r1 != 0) goto L_0x08c0
            r1 = 2131890448(0x7f121110, float:1.9415588E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r4] = r6
            r0[r2] = r11
            r0[r7] = r9
            java.lang.String r16 = r3.getString(r1, r0)
            return r16
        L_0x08b2:
            X.15p r3 = r10.A0B
            java.lang.String r0 = r1.A03
            java.lang.String r11 = r3.A0W(r0)
            goto L_0x0883
        L_0x08bb:
            int r5 = X.C29501aj.A00(r0, r2)
            goto L_0x0870
        L_0x08c0:
            r1 = 2131755286(0x7f100116, float:1.9141447E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r4] = r6
            r0[r2] = r11
            java.lang.String r16 = r3.getQuantityString(r1, r5, r0)
            return r16
        L_0x08ce:
            X.0tz r0 = r10.A04
            android.content.Context r0 = r0.A00
            android.content.res.Resources r3 = r0.getResources()
            if (r1 != 0) goto L_0x08e6
            r1 = 2131890447(0x7f12110f, float:1.9415586E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r4] = r11
            r0[r2] = r9
            java.lang.String r16 = r3.getString(r1, r0)
            return r16
        L_0x08e6:
            r1 = 2131755283(0x7f100113, float:1.914144E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r11
            java.lang.String r16 = r3.getQuantityString(r1, r5, r0)
            return r16
        L_0x08f2:
            X.0tz r1 = r0.A06
            android.content.Context r6 = r1.A00
            r5 = 2131890415(0x7f1210ef, float:1.9415521E38)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            X.013 r2 = r0.A07
            X.0sP r1 = r0.A04
            X.0sG r0 = r0.A03
            X.0sH r0 = r0.A08(r10)
            java.lang.String r0 = r1.A0E(r0)
            java.lang.String r0 = r2.A0G(r0)
            r3[r4] = r0
            java.lang.String r16 = r6.getString(r5, r3)
            return r16
        L_0x0914:
            X.0tz r1 = r0.A06
            android.content.Context r6 = r1.A00
            r5 = 2131890385(0x7f1210d1, float:1.941546E38)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            X.013 r2 = r0.A07
            X.0sP r1 = r0.A04
            X.0sG r0 = r0.A03
            X.0sH r0 = r0.A08(r10)
            java.lang.String r0 = r1.A0E(r0)
            java.lang.String r0 = r2.A0G(r0)
            r3[r4] = r0
            java.lang.String r16 = r6.getString(r5, r3)
            return r16
        L_0x0936:
            X.0tz r3 = r0.A06
            android.content.Context r7 = r3.A00
            r6 = 2131890270(0x7f12105e, float:1.9415227E38)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            X.0sP r3 = r0.A04
            X.0sG r2 = r0.A03
            X.0rv r0 = r1.A0B()
            X.AnonymousClass00B.A06(r0)
            X.0sH r0 = r2.A0A(r0)
            java.lang.String r0 = r3.A08(r0)
            r5[r4] = r0
            java.lang.String r16 = r7.getString(r6, r5)
            return r16
        L_0x0959:
            X.15Y r10 = r0.A0F
            X.1sL r1 = (X.C39351sL) r1
            com.whatsapp.jid.UserJid r9 = r1.A01
            com.whatsapp.jid.UserJid r8 = r1.A00
            if (r9 == 0) goto L_0x09b5
            if (r8 == 0) goto L_0x09b5
            java.lang.String r0 = r1.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x09ac
            X.0tz r0 = r10.A04
            android.content.Context r1 = r0.A00
            r0 = 2131892363(0x7f12188b, float:1.9419472E38)
            java.lang.String r11 = r1.getString(r0)
        L_0x0978:
            X.0sK r0 = r10.A00
            boolean r1 = r0.A0I(r9)
            X.0tz r0 = r10.A04
            android.content.Context r6 = r0.A00
            if (r1 == 0) goto L_0x099e
            r5 = 2131890362(0x7f1210ba, float:1.9415414E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.0sP r1 = r10.A02
            X.0sG r0 = r10.A01
            X.0sH r0 = r0.A0A(r8)
        L_0x0991:
            java.lang.String r0 = r1.A08(r0)
            r3[r4] = r0
            r3[r2] = r11
            java.lang.String r16 = r6.getString(r5, r3)
            return r16
        L_0x099e:
            r5 = 2131890363(0x7f1210bb, float:1.9415416E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.0sP r1 = r10.A02
            X.0sG r0 = r10.A01
            X.0sH r0 = r0.A0A(r9)
            goto L_0x0991
        L_0x09ac:
            X.15p r3 = r10.A0B
            java.lang.String r0 = r1.A03
            java.lang.String r11 = r3.A0W(r0)
            goto L_0x0978
        L_0x09b5:
            X.1Vo r1 = r10.A0A
            java.lang.String r0 = "failed to retrieve request sender jid or receiver jid"
            r1.A05(r0)
            return r16
        L_0x09bd:
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            r0 = 2131886705(0x7f120271, float:1.9407996E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x09c9:
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            r3 = 2131886706(0x7f120272, float:1.9407998E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.1sG r1 = (X.C39311sG) r1
            java.lang.String r0 = r1.A00
            r2[r4] = r0
            java.lang.String r16 = r5.getString(r3, r2)
            return r16
        L_0x09dd:
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            r3 = 2131892791(0x7f121a37, float:1.942034E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.1sG r1 = (X.C39311sG) r1
            java.lang.String r0 = r1.A00
            r2[r4] = r0
            java.lang.String r16 = r5.getString(r3, r2)
            return r16
        L_0x09f1:
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            r3 = 2131892787(0x7f121a33, float:1.9420332E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.1sG r1 = (X.C39311sG) r1
            java.lang.String r0 = r1.A00
            r2[r4] = r0
            java.lang.String r16 = r5.getString(r3, r2)
            return r16
        L_0x0a05:
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            r0 = 2131892781(0x7f121a2d, float:1.942032E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x0a11:
            r5 = r1
            X.1sE r5 = (X.C39291sE) r5
            java.util.List r11 = r5.A01
            int r10 = r11.size()
            X.0rv r1 = r1.A0B()
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r1)
            X.0sK r5 = r0.A01
            boolean r1 = r5.A0I(r1)
            if (r1 == 0) goto L_0x0a4b
            X.0tz r1 = r0.A06
            android.content.Context r1 = r1.A00
            android.content.res.Resources r6 = r1.getResources()
            r5 = 2131755414(0x7f100196, float:1.9141707E38)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            X.013 r2 = r0.A07
            X.0sP r1 = r0.A04
            r0 = -1
            java.lang.String r0 = r1.A0L(r11, r0)
            java.lang.String r0 = r2.A0G(r0)
            r3[r4] = r0
            java.lang.String r16 = r6.getQuantityString(r5, r10, r3)
            return r16
        L_0x0a4b:
            if (r10 != r2) goto L_0x0a69
            java.lang.Object r1 = r11.get(r4)
            X.0rv r1 = (X.C15830rv) r1
            boolean r1 = r5.A0I(r1)
            if (r1 == 0) goto L_0x0a69
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            r1 = 2131889093(0x7f120bc5, float:1.941284E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r3
            java.lang.String r16 = r5.getString(r1, r0)
            return r16
        L_0x0a69:
            X.0tz r1 = r0.A06
            android.content.Context r1 = r1.A00
            android.content.res.Resources r9 = r1.getResources()
            r8 = 2131755201(0x7f1000c1, float:1.9141275E38)
            java.lang.Object[] r6 = new java.lang.Object[r7]
            X.013 r5 = r0.A07
            X.0sP r1 = r0.A04
            r0 = -1
            java.lang.String r0 = r1.A0L(r11, r0)
            java.lang.String r0 = r5.A0G(r0)
            r6[r4] = r0
            r6[r2] = r3
            java.lang.String r16 = r9.getQuantityString(r8, r10, r6)
            return r16
        L_0x0a8c:
            X.0sK r5 = r0.A01
            X.0rv r1 = r1.A0B()
            boolean r1 = r5.A0I(r1)
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            if (r1 == 0) goto L_0x0aa5
            r0 = 2131888859(0x7f120adb, float:1.9412365E38)
            if (r17 == 0) goto L_0x0ac6
            r0 = 2131889943(0x7f120f17, float:1.9414564E38)
            goto L_0x0ac6
        L_0x0aa5:
            r1 = 2131888858(0x7f120ada, float:1.9412363E38)
            if (r17 == 0) goto L_0x0ad3
            r1 = 2131889942(0x7f120f16, float:1.9414562E38)
            goto L_0x0ad3
        L_0x0aae:
            X.0sK r5 = r0.A01
            X.0rv r1 = r1.A0B()
            boolean r1 = r5.A0I(r1)
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            if (r1 == 0) goto L_0x0acb
            r0 = 2131888857(0x7f120ad9, float:1.9412361E38)
            if (r17 == 0) goto L_0x0ac6
            r0 = 2131889941(0x7f120f15, float:1.941456E38)
        L_0x0ac6:
            java.lang.String r16 = r5.getString(r0)
            return r16
        L_0x0acb:
            r1 = 2131888856(0x7f120ad8, float:1.941236E38)
            if (r17 == 0) goto L_0x0ad3
            r1 = 2131889940(0x7f120f14, float:1.9414558E38)
        L_0x0ad3:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r3
            java.lang.String r16 = r5.getString(r1, r0)
            return r16
        L_0x0adc:
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            r3 = 2131892783(0x7f121a2f, float:1.9420324E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.1sG r1 = (X.C39311sG) r1
            java.lang.String r0 = r1.A00
            r2[r4] = r0
            java.lang.String r16 = r5.getString(r3, r2)
            return r16
        L_0x0af0:
            X.1ti r1 = (X.C40191ti) r1
            int r3 = r1.A00
            X.0rv r2 = r1.A0B()
            X.0sO r1 = r0.A09
            X.AnonymousClass00B.A06(r5)
            boolean r1 = r1.A0A(r5)
            java.lang.String r16 = r0.A06(r2, r3, r1)
            return r16
        L_0x0b06:
            boolean r6 = r6.A0c()
            X.1sE r1 = (X.C39291sE) r1
            java.util.List r5 = r1.A01
            int r3 = r5.size()
            r1 = 0
            if (r3 != r2) goto L_0x0b16
            r1 = 1
        L_0x0b16:
            X.AnonymousClass00B.A0G(r1)
            java.lang.Object r3 = r5.get(r4)
            X.0rv r3 = (X.C15830rv) r3
            X.0sK r1 = r0.A01
            boolean r1 = r1.A0I(r3)
            if (r1 == 0) goto L_0x0b35
            X.0tz r0 = r0.A06
            android.content.Context r2 = r0.A00
            r0 = 2131888861(0x7f120add, float:1.941237E38)
            if (r6 == 0) goto L_0x12b0
            r0 = 2131888926(0x7f120b1e, float:1.9412501E38)
            goto L_0x12b0
        L_0x0b35:
            X.0sG r1 = r0.A03
            X.0sH r3 = r1.A0A(r3)
            X.0sP r1 = r0.A04
            java.lang.String r5 = r1.A08(r3)
            boolean r1 = X.AnonymousClass1ZW.A0E(r5)
            X.0tz r0 = r0.A06
            if (r1 == 0) goto L_0x0b55
            android.content.Context r2 = r0.A00
            r0 = 2131888698(0x7f120a3a, float:1.9412039E38)
            if (r6 == 0) goto L_0x12b0
            r0 = 2131888697(0x7f120a39, float:1.9412037E38)
            goto L_0x12b0
        L_0x0b55:
            android.content.Context r3 = r0.A00
            r1 = 2131888696(0x7f120a38, float:1.9412035E38)
            if (r6 == 0) goto L_0x0b5f
            r1 = 2131888695(0x7f120a37, float:1.9412033E38)
        L_0x0b5f:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r5
            java.lang.String r16 = r3.getString(r1, r0)
            return r16
        L_0x0b68:
            X.15T r6 = r0.A0H
            X.0sK r5 = r6.A00
            X.0rv r0 = r1.A0B()
            boolean r0 = r5.A0I(r0)
            if (r0 == 0) goto L_0x0b9c
            X.0sG r0 = r6.A01
            X.0sH r1 = r0.A0A(r13)
            boolean r0 = r1.A0J()
            if (r0 == 0) goto L_0x0b8b
            X.0tz r0 = r6.A03
            android.content.Context r2 = r0.A00
            r0 = 2131891417(0x7f1214d9, float:1.9417553E38)
            goto L_0x12b0
        L_0x0b8b:
            X.0rv r0 = r1.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 == 0) goto L_0x0bb2
            X.0tz r0 = r6.A03
            android.content.Context r2 = r0.A00
            r0 = 2131891418(0x7f1214da, float:1.9417555E38)
            goto L_0x12b0
        L_0x0b9c:
            X.0rv r0 = r1.A0B()
            if (r0 == 0) goto L_0x0bb2
            X.0tz r0 = r6.A03
            android.content.Context r5 = r0.A00
            r1 = 2131888943(0x7f120b2f, float:1.9412536E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r3
            java.lang.String r16 = r5.getString(r1, r0)
            return r16
        L_0x0bb2:
            r0 = 2131888943(0x7f120b2f, float:1.9412536E38)
            java.lang.String r16 = r6.A00(r13, r0)
            return r16
        L_0x0bba:
            X.1tp r1 = (X.C40261tp) r1
            X.1Vw r4 = r1.A11
            boolean r3 = r4.A02
            if (r3 == 0) goto L_0x0bd6
            X.0rv r3 = r1.A0B()
            if (r3 == 0) goto L_0x0bcf
            X.0sK r3 = r0.A01
            r3.A0B()
            X.1ZT r11 = r3.A05
        L_0x0bcf:
            int r1 = r1.A00
            java.lang.String r16 = r0.A06(r11, r1, r2)
            return r16
        L_0x0bd6:
            X.0rv r11 = r4.A00
            goto L_0x0bcf
        L_0x0bd9:
            X.0tz r0 = r0.A06
            android.content.Context r0 = r0.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131888589(0x7f1209cd, float:1.9411818E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x0be9:
            X.0tz r0 = r0.A06
            android.content.Context r0 = r0.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131892043(0x7f12174b, float:1.9418823E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x0bf9:
            X.0tz r1 = r0.A06
            android.content.Context r1 = r1.A00
            android.content.res.Resources r6 = r1.getResources()
            if (r26 == 0) goto L_0x0c21
            r5 = 2131890385(0x7f1210d1, float:1.941546E38)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            X.013 r2 = r0.A07
            X.0sP r1 = r0.A04
            X.0sG r0 = r0.A03
            X.0sH r0 = r0.A08(r10)
            java.lang.String r0 = r1.A0E(r0)
            java.lang.String r0 = r2.A0G(r0)
            r3[r4] = r0
            java.lang.String r16 = r6.getString(r5, r3)
            return r16
        L_0x0c21:
            r0 = 2131890381(0x7f1210cd, float:1.9415452E38)
            java.lang.String r16 = r6.getString(r0)
            return r16
        L_0x0c29:
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            r0 = 2131890273(0x7f121061, float:1.9415233E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x0c35:
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            r0 = 2131890272(0x7f121060, float:1.9415231E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x0c41:
            X.15W r3 = r0.A0E
            boolean r3 = r3.A01(r13)
            if (r3 == 0) goto L_0x0c55
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            r0 = 2131887165(0x7f12043d, float:1.940893E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x0c55:
            X.0pd r5 = r0.A0B
            boolean r3 = X.C40571uL.A00(r5, r13)
            if (r3 == 0) goto L_0x0c73
            X.0tz r0 = r0.A06
            android.content.Context r5 = r0.A00
            r3 = 2131889021(0x7f120b7d, float:1.9412694E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "OBWhatsApp Surveys"
            r1[r4] = r0
            java.lang.String r0 = "Meta"
            r1[r2] = r0
            java.lang.String r16 = r5.getString(r3, r1)
            return r16
        L_0x0c73:
            X.0zl r3 = r0.A0C
            boolean r3 = X.C40561uK.A01(r3, r13)
            if (r3 == 0) goto L_0x0c87
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            r0 = 2131893047(0x7f121b37, float:1.942086E38)
            java.lang.String r16 = X.C34811ku.A05(r1, r0)
            return r16
        L_0x0c87:
            r3 = r1
            X.1sK r3 = (X.C39341sK) r3
            int r4 = r3.A00
            X.0tz r3 = r0.A06
            android.content.Context r8 = r3.A00
            X.0sK r0 = r0.A01
            boolean r0 = r0.A0I(r13)
            if (r0 == 0) goto L_0x0caa
            r3 = 1967(0x7af, float:2.756E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r3)
            if (r0 == 0) goto L_0x0caa
        L_0x0ca2:
            boolean r0 = X.C40571uL.A01(r5, r1)
            switch(r4) {
                case 0: goto L_0x0cac;
                case 1: goto L_0x0cac;
                case 2: goto L_0x0cb3;
                case 3: goto L_0x0cb3;
                case 4: goto L_0x0cb3;
                case 5: goto L_0x0cbd;
                case 6: goto L_0x0cbd;
                case 7: goto L_0x0cc2;
                case 8: goto L_0x0cc2;
                case 9: goto L_0x0cbd;
                case 10: goto L_0x0cbd;
                case 11: goto L_0x0cbd;
                case 12: goto L_0x0cbd;
                case 13: goto L_0x0cbd;
                case 14: goto L_0x0cbd;
                default: goto L_0x0ca9;
            }
        L_0x0ca9:
            return r16
        L_0x0caa:
            r2 = 0
            goto L_0x0ca2
        L_0x0cac:
            if (r2 == 0) goto L_0x0cb3
            r1 = 2131889501(0x7f120d5d, float:1.9413667E38)
            goto L_0x119b
        L_0x0cb3:
            r1 = 2131887164(0x7f12043c, float:1.9408927E38)
            if (r0 == 0) goto L_0x119b
            r1 = 2131887166(0x7f12043e, float:1.9408931E38)
            goto L_0x119b
        L_0x0cbd:
            r1 = 2131889020(0x7f120b7c, float:1.9412692E38)
            goto L_0x119b
        L_0x0cc2:
            r1 = 2131889019(0x7f120b7b, float:1.941269E38)
            goto L_0x119b
        L_0x0cc7:
            X.1tr r1 = (X.C40281tr) r1
            X.0sK r4 = r0.A01
            int r2 = r1.A00
            if (r2 != r7) goto L_0x0ce3
            X.1Vw r2 = r1.A11
            X.0rv r3 = r2.A00
        L_0x0cd3:
            X.AnonymousClass00B.A06(r3)
            X.11R r2 = r0.A05
            boolean r2 = X.AnonymousClass2BX.A01(r4, r2)
            int r1 = r1.A00
            java.lang.String r16 = r0.A05(r3, r1, r2)
            return r16
        L_0x0ce3:
            r4.A0B()
            X.1ZT r3 = r4.A05
            goto L_0x0cd3
        L_0x0ce9:
            X.1sR r1 = (X.C39411sR) r1
            X.0sG r6 = r0.A03
            X.0sH r3 = r6.A08(r13)
            X.1ko r3 = r3.A0D
            if (r3 == 0) goto L_0x0d0e
            X.0sP r5 = r0.A04
            X.0sH r3 = r6.A08(r13)
            boolean r3 = r5.A0R(r3)
            if (r3 != 0) goto L_0x0d0e
        L_0x0d01:
            X.0tz r5 = r0.A06
            int r0 = r1.A00
            java.lang.String r3 = r1.A01
            r1 = 1
            switch(r0) {
                case 1: goto L_0x0d10;
                case 2: goto L_0x0d1b;
                case 3: goto L_0x0d26;
                case 4: goto L_0x0d31;
                case 5: goto L_0x0d3c;
                case 6: goto L_0x0d47;
                case 7: goto L_0x0d52;
                case 8: goto L_0x0d5d;
                case 9: goto L_0x0d68;
                case 10: goto L_0x0d73;
                case 11: goto L_0x0d7e;
                case 12: goto L_0x0d89;
                case 13: goto L_0x0d94;
                case 14: goto L_0x0d9f;
                case 15: goto L_0x0daf;
                case 16: goto L_0x0dba;
                case 17: goto L_0x0dca;
                case 18: goto L_0x0dda;
                case 19: goto L_0x0dea;
                case 20: goto L_0x0dfa;
                case 21: goto L_0x0e0a;
                case 22: goto L_0x0e14;
                case 23: goto L_0x0e1e;
                case 24: goto L_0x0e28;
                case 25: goto L_0x0e32;
                case 26: goto L_0x0e3c;
                case 27: goto L_0x0e46;
                case 28: goto L_0x0e50;
                case 29: goto L_0x0e5a;
                case 30: goto L_0x0e64;
                case 31: goto L_0x0e6e;
                case 32: goto L_0x0e78;
                case 33: goto L_0x0e82;
                case 34: goto L_0x0e8e;
                default: goto L_0x0d0b;
            }
        L_0x0d0b:
            r16 = 0
            return r16
        L_0x0d0e:
            r2 = 0
            goto L_0x0d01
        L_0x0d10:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886676(0x7f120254, float:1.9407938E38)
            goto L_0x0e8b
        L_0x0d1b:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886681(0x7f120259, float:1.9407948E38)
            goto L_0x0e8b
        L_0x0d26:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886684(0x7f12025c, float:1.9407954E38)
            goto L_0x0e8b
        L_0x0d31:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886687(0x7f12025f, float:1.940796E38)
            goto L_0x0e8b
        L_0x0d3c:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886697(0x7f120269, float:1.940798E38)
            goto L_0x0e8b
        L_0x0d47:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886703(0x7f12026f, float:1.9407992E38)
            goto L_0x0e8b
        L_0x0d52:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886720(0x7f120280, float:1.9408027E38)
            goto L_0x0e8b
        L_0x0d5d:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886719(0x7f12027f, float:1.9408025E38)
            goto L_0x0e8b
        L_0x0d68:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886680(0x7f120258, float:1.9407946E38)
            goto L_0x0e8b
        L_0x0d73:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886718(0x7f12027e, float:1.9408023E38)
            goto L_0x0e8b
        L_0x0d7e:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886702(0x7f12026e, float:1.940799E38)
            goto L_0x0e8b
        L_0x0d89:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886679(0x7f120257, float:1.9407944E38)
            goto L_0x0e8b
        L_0x0d94:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886717(0x7f12027d, float:1.940802E38)
            goto L_0x0e8b
        L_0x0d9f:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886710(0x7f120276, float:1.9408007E38)
            if (r2 == 0) goto L_0x0e8b
            r5 = 2131886711(0x7f120277, float:1.9408009E38)
            goto L_0x0e8b
        L_0x0daf:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886716(0x7f12027c, float:1.9408019E38)
            goto L_0x0e8b
        L_0x0dba:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886714(0x7f12027a, float:1.9408015E38)
            if (r2 == 0) goto L_0x0e8b
            r5 = 2131886715(0x7f12027b, float:1.9408017E38)
            goto L_0x0e8b
        L_0x0dca:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886674(0x7f120252, float:1.9407934E38)
            if (r2 == 0) goto L_0x0e8b
            r5 = 2131886675(0x7f120253, float:1.9407936E38)
            goto L_0x0e8b
        L_0x0dda:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886712(0x7f120278, float:1.940801E38)
            if (r2 == 0) goto L_0x0e8b
            r5 = 2131886713(0x7f120279, float:1.9408013E38)
            goto L_0x0e8b
        L_0x0dea:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886695(0x7f120267, float:1.9407976E38)
            if (r2 == 0) goto L_0x0e8b
            r5 = 2131886696(0x7f120268, float:1.9407978E38)
            goto L_0x0e8b
        L_0x0dfa:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886672(0x7f120250, float:1.940793E38)
            if (r2 == 0) goto L_0x0e8b
            r5 = 2131886673(0x7f120251, float:1.9407931E38)
            goto L_0x0e8b
        L_0x0e0a:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886670(0x7f12024e, float:1.9407925E38)
            goto L_0x0e8b
        L_0x0e14:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886668(0x7f12024c, float:1.9407921E38)
            goto L_0x0e8b
        L_0x0e1e:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886669(0x7f12024d, float:1.9407923E38)
            goto L_0x0e8b
        L_0x0e28:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886693(0x7f120265, float:1.9407972E38)
            goto L_0x0e8b
        L_0x0e32:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886692(0x7f120264, float:1.940797E38)
            goto L_0x0e8b
        L_0x0e3c:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886704(0x7f120270, float:1.9407994E38)
            goto L_0x0e8b
        L_0x0e46:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886682(0x7f12025a, float:1.940795E38)
            goto L_0x0e8b
        L_0x0e50:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886707(0x7f120273, float:1.9408E38)
            goto L_0x0e8b
        L_0x0e5a:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886709(0x7f120275, float:1.9408005E38)
            goto L_0x0e8b
        L_0x0e64:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886691(0x7f120263, float:1.9407968E38)
            goto L_0x0e8b
        L_0x0e6e:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886690(0x7f120262, float:1.9407966E38)
            goto L_0x0e8b
        L_0x0e78:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886689(0x7f120261, float:1.9407964E38)
            goto L_0x0e8b
        L_0x0e82:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886688(0x7f120260, float:1.9407962E38)
        L_0x0e8b:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            goto L_0x0e9d
        L_0x0e8e:
            android.content.Context r0 = r5.A00
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131886708(0x7f120274, float:1.9408002E38)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = X.C45902Bo.A02(r3)
        L_0x0e9d:
            r0[r4] = r3
            java.lang.String r16 = r6.getString(r5, r0)
            return r16
        L_0x0ea4:
            X.15T r5 = r0.A0H
            X.0rv r0 = r1.A0B()
            if (r0 != 0) goto L_0x0eb4
            r0 = 2131892393(0x7f1218a9, float:1.9419533E38)
            java.lang.String r16 = r5.A00(r13, r0)
            return r16
        L_0x0eb4:
            X.0tz r0 = r5.A03
            android.content.Context r5 = r0.A00
            r1 = 2131892393(0x7f1218a9, float:1.9419533E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r3
            java.lang.String r16 = r5.getString(r1, r0)
            return r16
        L_0x0ec4:
            boolean r3 = r1.A12()
            if (r3 == 0) goto L_0x0ed9
            X.0rv r5 = r1.A0B()
            if (r5 == 0) goto L_0x0ed9
            X.0sK r3 = r0.A01
            boolean r5 = r3.A0I(r5)
            r3 = 1
            if (r5 != 0) goto L_0x0eda
        L_0x0ed9:
            r3 = 0
        L_0x0eda:
            r5 = 5
            if (r3 == 0) goto L_0x0ef2
            if (r13 == 0) goto L_0x0ef2
            X.0sG r1 = r0.A03
            X.0sH r1 = r1.A0A(r13)
            java.lang.String r1 = r0.A04(r1, r5)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r1
            r1 = 2131887421(0x7f12053d, float:1.9409449E38)
            goto L_0x124b
        L_0x0ef2:
            X.0rv r3 = r1.A0B()
            if (r3 == 0) goto L_0x0f0d
            X.0sG r1 = r0.A03
            X.0sH r1 = r1.A0A(r3)
            java.lang.String r1 = r0.A04(r1, r5)
            if (r1 == 0) goto L_0x0f0d
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r1
            r1 = 2131886487(0x7f120197, float:1.9407554E38)
            goto L_0x124b
        L_0x0f0d:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r1 = 2131886486(0x7f120196, float:1.9407552E38)
            goto L_0x124b
        L_0x0f14:
            X.1sV r1 = (X.C39451sV) r1
            int r5 = r1.A00
            X.0sK r4 = r0.A01
            X.0rv r2 = r1.A0B()
            boolean r2 = r4.A0I(r2)
            java.util.Set r1 = r1.A03
            java.lang.String r16 = r0.A0E(r3, r1, r5, r2)
            return r16
        L_0x0f29:
            X.1sV r1 = (X.C39451sV) r1
            int r5 = r1.A00
            java.util.Set r4 = r1.A03
            X.0sK r2 = r0.A01
            X.0rv r1 = r1.A0B()
            boolean r1 = r2.A0I(r1)
            java.lang.String r16 = r0.A0F(r3, r4, r5, r1)
            return r16
        L_0x0f3e:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r1 = 2131889160(0x7f120c08, float:1.9412976E38)
            X.0tz r0 = r0.A06
            android.content.Context r0 = r0.A00
            java.lang.String r16 = r0.getString(r1, r2)
            return r16
        L_0x0f4c:
            r4 = 2131887362(0x7f120502, float:1.9409329E38)
            r3 = 2131755037(0x7f10001d, float:1.9140942E38)
            r2 = 2131755036(0x7f10001c, float:1.914094E38)
            java.lang.String r16 = r0.A07(r1, r4, r3, r2)
            return r16
        L_0x0f5a:
            r4 = 2131887361(0x7f120501, float:1.9409327E38)
            r3 = 2131755035(0x7f10001b, float:1.9140938E38)
            r2 = 2131755034(0x7f10001a, float:1.9140936E38)
            java.lang.String r16 = r0.A07(r1, r4, r3, r2)
            return r16
        L_0x0f68:
            X.0rv r1 = r1.A0B()
            com.whatsapp.jid.UserJid r3 = com.whatsapp.jid.UserJid.of(r1)
            X.AnonymousClass00B.A06(r3)
            X.0sK r1 = r0.A01
            boolean r1 = r1.A0I(r3)
            r1 = r1 ^ 1
            X.AnonymousClass00B.A0G(r1)
            X.0sG r1 = r0.A03
            X.0sH r3 = r1.A0A(r3)
            X.0sP r1 = r0.A04
            java.lang.String r6 = r1.A08(r3)
            X.0pd r5 = r0.A0B
            r3 = 2449(0x991, float:3.432E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r1 = r5.A0E(r1, r3)
            r3 = 2131888680(0x7f120a28, float:1.9412002E38)
            if (r1 == 0) goto L_0x0f9c
            r3 = 2131888679(0x7f120a27, float:1.9412E38)
        L_0x0f9c:
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r6
            java.lang.String r16 = r1.getString(r3, r0)
            return r16
        L_0x0fa9:
            r2 = 2131888850(0x7f120ad2, float:1.9412347E38)
            r3 = 2131888848(0x7f120ad0, float:1.9412343E38)
            r4 = 2131888849(0x7f120ad1, float:1.9412345E38)
            r5 = 2131888671(0x7f120a1f, float:1.9411984E38)
            r6 = 2131888672(0x7f120a20, float:1.9411986E38)
            java.lang.String r16 = r0.A09(r1, r2, r3, r4, r5, r6)
            return r16
        L_0x0fbd:
            r2 = 2131888847(0x7f120acf, float:1.941234E38)
            r3 = 2131888844(0x7f120acc, float:1.9412335E38)
            r4 = 2131888846(0x7f120ace, float:1.9412339E38)
            r5 = 2131888843(0x7f120acb, float:1.9412333E38)
            r6 = 2131888845(0x7f120acd, float:1.9412337E38)
            java.lang.String r16 = r0.A09(r1, r2, r3, r4, r5, r6)
            return r16
        L_0x0fd1:
            X.0tz r0 = r0.A06
            android.content.Context r0 = r0.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131888871(0x7f120ae7, float:1.941239E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x0fe1:
            X.0tz r5 = r0.A06
            android.content.Context r9 = r5.A00
            X.1sU r1 = (X.C39441sU) r1
            java.lang.String r8 = r1.A00
            X.0sK r5 = r0.A01
            X.0rv r0 = r1.A0B()
            boolean r0 = r5.A0I(r0)
            if (r0 == 0) goto L_0x101e
            r10 = 0
        L_0x0ff6:
            r6 = 0
        L_0x0ff7:
            boolean r1 = X.AnonymousClass1ZW.A0E(r8)
            r5 = r1 ^ 1
            int[][] r0 = A0J
            r0 = r0[r10]
            r1 = r0[r1]
            if (r5 == 0) goto L_0x1017
            if (r6 == 0) goto L_0x1012
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r4] = r3
            r0[r2] = r8
        L_0x100d:
            java.lang.String r16 = r9.getString(r1, r0)
            return r16
        L_0x1012:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r8
            goto L_0x100d
        L_0x1017:
            if (r6 == 0) goto L_0x1028
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r3
            goto L_0x100d
        L_0x101e:
            boolean r0 = X.AnonymousClass1ZW.A0E(r3)
            r10 = 2
            if (r0 != 0) goto L_0x0ff6
            r10 = 1
            r6 = 1
            goto L_0x0ff7
        L_0x1028:
            java.lang.String r16 = r9.getString(r1)
            return r16
        L_0x102d:
            X.1sE r1 = (X.C39291sE) r1
            boolean r3 = r1 instanceof X.C40221tl
            r12 = 0
            if (r3 == 0) goto L_0x10a9
            X.0rt r8 = r0.A08
            r5 = r1
            X.1sX r5 = (X.C39471sX) r5
            com.whatsapp.jid.GroupJid r3 = r5.A14(r2)
            java.lang.String r11 = r8.A09(r3)
            if (r11 != 0) goto L_0x1047
            java.lang.String r11 = r5.A15(r2)
        L_0x1047:
            X.0rv r3 = r1.A0B()
            com.whatsapp.jid.UserJid r5 = com.whatsapp.jid.UserJid.of(r3)
            java.util.List r8 = r1.A01
            r10 = 0
            if (r5 == 0) goto L_0x1066
            X.0sG r1 = r0.A03
            X.0sH r3 = r1.A0A(r5)
            X.0sP r1 = r0.A04
            java.lang.String r12 = r1.A08(r3)
            X.0sK r1 = r0.A01
            boolean r10 = r1.A0I(r5)
        L_0x1066:
            boolean r9 = r6.A0c()
            boolean r6 = android.text.TextUtils.isEmpty(r11)
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            r5 = r1 ^ 1
            int r1 = r8.size()
            if (r1 != r2) goto L_0x1089
            X.0sK r3 = r0.A01
            java.lang.Object r1 = r8.get(r4)
            X.0rv r1 = (X.C15830rv) r1
            boolean r1 = r3.A0I(r1)
            r3 = 1
            if (r1 != 0) goto L_0x108a
        L_0x1089:
            r3 = 0
        L_0x108a:
            if (r10 == 0) goto L_0x10b3
            X.0tz r1 = r0.A06
            android.content.Context r6 = r1.A00
            r5 = 2131888811(0x7f120aab, float:1.9412268E38)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            X.013 r2 = r0.A07
            X.0sP r1 = r0.A04
            r0 = -1
            java.lang.String r0 = r1.A0L(r8, r0)
            java.lang.String r0 = r2.A0G(r0)
            r3[r4] = r0
            java.lang.String r16 = r6.getString(r5, r3)
            return r16
        L_0x10a9:
            boolean r3 = r1 instanceof X.C39441sU
            if (r3 == 0) goto L_0x1047
            r3 = r1
            X.1sU r3 = (X.C39441sU) r3
            java.lang.String r11 = r3.A00
            goto L_0x1047
        L_0x10b3:
            if (r5 == 0) goto L_0x10f8
            if (r3 == 0) goto L_0x10da
            X.0tz r0 = r0.A06
            android.content.Context r3 = r0.A00
            if (r9 != 0) goto L_0x10c9
            r1 = 2131888873(0x7f120ae9, float:1.9412394E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r12
            java.lang.String r16 = r3.getString(r1, r0)
            return r16
        L_0x10c9:
            int[][] r0 = A0M
            r0 = r0[r2]
            r1 = r0[r6]
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r4] = r12
            r0[r2] = r11
            java.lang.String r16 = r3.getString(r1, r0)
            return r16
        L_0x10da:
            X.0tz r1 = r0.A06
            android.content.Context r6 = r1.A00
            r5 = 2131888810(0x7f120aaa, float:1.9412266E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r4] = r12
            X.013 r1 = r0.A07
            X.0sP r0 = r0.A04
            java.lang.String r0 = r0.A0L(r8, r2)
            java.lang.String r0 = r1.A0G(r0)
            r3[r2] = r0
            java.lang.String r16 = r6.getString(r5, r3)
            return r16
        L_0x10f8:
            X.0tz r1 = r0.A06
            if (r3 == 0) goto L_0x1117
            android.content.Context r3 = r1.A00
            if (r9 != 0) goto L_0x1108
            r0 = 2131888861(0x7f120add, float:1.941237E38)
            java.lang.String r16 = r3.getString(r0)
            return r16
        L_0x1108:
            int[][] r0 = A0M
            r0 = r0[r4]
            r1 = r0[r6]
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r11
            java.lang.String r16 = r3.getString(r1, r0)
            return r16
        L_0x1117:
            android.content.Context r1 = r1.A00
            android.content.res.Resources r7 = r1.getResources()
            r6 = 2131755180(0x7f1000ac, float:1.9141232E38)
            int r5 = r8.size()
            java.lang.Object[] r3 = new java.lang.Object[r2]
            X.013 r1 = r0.A07
            X.0sP r0 = r0.A04
            java.lang.String r0 = r0.A0L(r8, r2)
            java.lang.String r0 = r1.A0G(r0)
            r3[r4] = r0
            java.lang.String r16 = r7.getQuantityString(r6, r5, r3)
            return r16
        L_0x1139:
            r2 = 2131888819(0x7f120ab3, float:1.9412284E38)
            r3 = 2131888824(0x7f120ab8, float:1.9412294E38)
            r4 = 2131888825(0x7f120ab9, float:1.9412296E38)
            r5 = 2131888826(0x7f120aba, float:1.9412298E38)
            java.lang.String r16 = r0.A08(r1, r2, r3, r4, r5)
            return r16
        L_0x114a:
            r2 = 2131888818(0x7f120ab2, float:1.9412282E38)
            r3 = 2131888820(0x7f120ab4, float:1.9412286E38)
            r4 = 2131888823(0x7f120ab7, float:1.9412292E38)
            r5 = 2131888823(0x7f120ab7, float:1.9412292E38)
            java.lang.String r16 = r0.A08(r1, r2, r3, r4, r5)
            return r16
        L_0x115b:
            X.0tz r1 = r0.A06
            r0 = 2131888871(0x7f120ae7, float:1.941239E38)
            java.lang.String r16 = r1.A02(r0)
            return r16
        L_0x1165:
            X.1sT r1 = (X.C39431sT) r1
            com.whatsapp.jid.GroupJid r9 = r1.A01
            X.0rt r3 = r0.A08
            java.lang.String r5 = r3.A09(r9)
            X.0tz r0 = r0.A06
            android.content.Context r8 = r0.A00
            X.1Vw r0 = r1.A11
            X.0rv r0 = r0.A00
            X.0sL r0 = X.C16050sL.A03(r0)
            X.AnonymousClass00B.A06(r0)
            int r3 = r6.A04(r0, r9)
            if (r3 == r7) goto L_0x11aa
            r1 = 4
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r6.A0j(r0)
            if (r3 == r1) goto L_0x1193
            java.lang.String r16 = A01(r8, r5, r0)
            return r16
        L_0x1193:
            r1 = 2131888672(0x7f120a20, float:1.9411986E38)
            if (r0 == 0) goto L_0x119b
            r1 = 2131888671(0x7f120a1f, float:1.9411984E38)
        L_0x119b:
            java.lang.String r16 = r8.getString(r1)
            return r16
        L_0x11a0:
            X.1sX r1 = (X.C39471sX) r1
            java.lang.String r5 = r1.A15(r2)
            X.0tz r0 = r0.A06
            android.content.Context r8 = r0.A00
        L_0x11aa:
            if (r5 != 0) goto L_0x11b4
            r0 = 2131888674(0x7f120a22, float:1.941199E38)
            java.lang.String r16 = r8.getString(r0)
            return r16
        L_0x11b4:
            r1 = 2131888673(0x7f120a21, float:1.9411988E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r5
            java.lang.String r16 = r8.getString(r1, r0)
            return r16
        L_0x11c0:
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            r0 = 2131890884(0x7f1212c4, float:1.9416472E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x11cc:
            X.1sT r1 = (X.C39431sT) r1
            X.0tz r3 = r0.A06
            android.content.Context r5 = r3.A00
            X.0rt r3 = r0.A08
            com.whatsapp.jid.GroupJid r0 = r1.A01
            java.lang.String r3 = r3.A09(r0)
            goto L_0x12cb
        L_0x11dc:
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            r0 = 2131890868(0x7f1212b4, float:1.941644E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x11e8:
            X.1sV r1 = (X.C39451sV) r1
            java.lang.Object r5 = r1.A12
            monitor-enter(r5)
            java.lang.String r7 = r1.A02     // Catch:{ all -> 0x1219 }
            monitor-exit(r5)     // Catch:{ all -> 0x1219 }
            X.AnonymousClass00B.A06(r7)
            java.util.Set r5 = r1.A03
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
            int r5 = r6.size()
            if (r5 == r2) goto L_0x1210
            r4 = 0
        L_0x1201:
            X.0sK r2 = r0.A01
            X.0rv r1 = r1.A0B()
            boolean r1 = r2.A0I(r1)
            java.lang.String r16 = r0.A0D(r3, r4, r7, r1)
            return r16
        L_0x1210:
            java.lang.Object r2 = r6.get(r4)
            X.1sW r2 = (X.C39461sW) r2
            java.lang.String r4 = r2.A03
            goto L_0x1201
        L_0x1219:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x1219 }
            throw r0
        L_0x121c:
            X.1sX r1 = (X.C39471sX) r1
            X.0sP r8 = r0.A04
            com.whatsapp.jid.GroupJid r3 = r1.A14(r7)
            java.lang.String r5 = r8.A0J(r3)
            if (r5 != 0) goto L_0x122e
            java.lang.String r5 = r1.A15(r7)
        L_0x122e:
            java.util.List r7 = r1.A01
            int r1 = r7.size()
            if (r1 != r2) goto L_0x125c
            X.0sK r3 = r0.A01
            java.lang.Object r1 = r7.get(r4)
            X.0rv r1 = (X.C15830rv) r1
            boolean r1 = r3.A0I(r1)
            if (r1 == 0) goto L_0x125c
            if (r5 != 0) goto L_0x1254
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r1 = 2131886386(0x7f120132, float:1.940735E38)
        L_0x124b:
            X.0tz r0 = r0.A06
            android.content.Context r0 = r0.A00
            java.lang.String r16 = r0.getString(r1, r2)
            return r16
        L_0x1254:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r5
            r1 = 2131886387(0x7f120133, float:1.9407351E38)
            goto L_0x124b
        L_0x125c:
            X.0tz r1 = r0.A06
            android.content.Context r1 = r1.A00
            android.content.res.Resources r6 = r1.getResources()
            r5 = 2131755013(0x7f100005, float:1.9140893E38)
            int r3 = r7.size()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.013 r1 = r0.A07
            r0 = -1
            java.lang.String r0 = r8.A0L(r7, r0)
            java.lang.String r0 = r1.A0G(r0)
            r2[r4] = r0
            java.lang.String r16 = r6.getQuantityString(r5, r3, r2)
            return r16
        L_0x127f:
            X.1sX r1 = (X.C39471sX) r1
            java.lang.String r2 = r1.A15(r2)
            X.1Vw r1 = r1.A11
            X.0rv r1 = r1.A00
            X.0sL r1 = X.C16050sL.A03(r1)
            X.AnonymousClass00B.A06(r1)
            boolean r1 = r6.A0j(r1)
            X.0tz r0 = r0.A06
            android.content.Context r0 = r0.A00
            java.lang.String r16 = A01(r0, r2, r1)
            return r16
        L_0x129d:
            X.0tz r0 = r0.A06
            android.content.Context r2 = r0.A00
            X.AnonymousClass00B.A06(r5)
            boolean r1 = r6.A0j(r5)
            r0 = 2131888672(0x7f120a20, float:1.9411986E38)
            if (r1 == 0) goto L_0x12b0
            r0 = 2131888671(0x7f120a1f, float:1.9411984E38)
        L_0x12b0:
            java.lang.String r16 = r2.getString(r0)
            return r16
        L_0x12b5:
            X.1sX r1 = (X.C39471sX) r1
            X.0tz r3 = r0.A06
            android.content.Context r5 = r3.A00
            X.0rt r3 = r0.A08
            com.whatsapp.jid.GroupJid r0 = r1.A14(r2)
            java.lang.String r3 = r3.A09(r0)
            if (r3 != 0) goto L_0x12d5
            java.lang.String r3 = r1.A15(r2)
        L_0x12cb:
            if (r3 != 0) goto L_0x12d5
            r0 = 2131892034(0x7f121742, float:1.9418805E38)
            java.lang.String r16 = r5.getString(r0)
            return r16
        L_0x12d5:
            r1 = 2131892033(0x7f121741, float:1.9418803E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r3
            java.lang.String r16 = r5.getString(r1, r0)
            return r16
        L_0x12e1:
            X.1sX r1 = (X.C39471sX) r1
            java.lang.String r5 = r1.A15(r2)
            r2 = 4
            java.lang.String r4 = r1.A15(r2)
            X.0sK r2 = r0.A01
            X.0rv r1 = r1.A0B()
            boolean r1 = r2.A0I(r1)
            java.lang.String r16 = r0.A0D(r3, r4, r5, r1)
            return r16
        L_0x12fb:
            X.1ty r1 = (X.C40351ty) r1
            java.util.List r2 = r1.A16(r7)
            int r5 = r2.size()
            X.0sK r4 = r0.A01
            X.0rv r2 = r1.A0B()
            boolean r2 = r4.A0I(r2)
            java.util.HashSet r1 = r1.A18(r8)
            java.lang.String r16 = r0.A0E(r3, r1, r5, r2)
            return r16
        L_0x1318:
            X.1ty r1 = (X.C40351ty) r1
            java.util.List r4 = r1.A16(r7)
            int r6 = r4.size()
            X.0sK r5 = r0.A01
            X.0rv r4 = r1.A0B()
            boolean r4 = r5.A0I(r4)
            java.util.HashSet r1 = r1.A18(r2)
            java.lang.String r16 = r0.A0F(r3, r1, r6, r4)
            return r16
        L_0x1335:
            X.1sX r1 = (X.C39471sX) r1
            X.0sK r5 = r0.A01
            X.0rv r4 = r1.A0B()
            boolean r9 = r5.A0I(r4)
            X.0tz r4 = r0.A06
            android.content.Context r4 = r4.A00
            com.whatsapp.jid.GroupJid r7 = r1.A14(r2)
            r10 = 0
            r5 = r0
            r6 = r4
            r8 = r3
            java.lang.String r16 = r5.A03(r6, r7, r8, r9, r10)
            return r16
        L_0x1352:
            X.1sX r1 = (X.C39471sX) r1
            X.0sK r5 = r0.A01
            X.0rv r4 = r1.A0B()
            boolean r9 = r5.A0I(r4)
            X.0tz r4 = r0.A06
            android.content.Context r4 = r4.A00
            com.whatsapp.jid.GroupJid r7 = r1.A14(r2)
            r10 = 1
            r5 = r0
            r6 = r4
            r8 = r3
            java.lang.String r16 = r5.A03(r6, r7, r8, r9, r10)
            return r16
        L_0x136f:
            r5 = r1
            X.1sX r5 = (X.C39471sX) r5
            X.0tz r4 = r0.A06
            android.content.Context r8 = r4.A00
            X.0sK r4 = r0.A01
            X.0rv r1 = r1.A0B()
            boolean r9 = r4.A0I(r1)
            com.whatsapp.jid.GroupJid r1 = r5.A14(r2)
            X.0rt r0 = r0.A08
            java.lang.String r7 = r0.A09(r1)
            r6 = 2
            r5 = 1
            r4 = 0
            if (r9 == 0) goto L_0x13a5
            r2 = 0
        L_0x1390:
            boolean r1 = X.AnonymousClass1ZW.A0E(r7)
            int[][] r0 = A0L
            r0 = r0[r2]
            r1 = r0[r1]
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r4] = r3
            r0[r5] = r7
            java.lang.String r16 = r8.getString(r1, r0)
            return r16
        L_0x13a5:
            boolean r0 = X.AnonymousClass1ZW.A0E(r3)
            if (r0 == 0) goto L_0x1390
            r2 = 2
            goto L_0x1390
        L_0x13ad:
            r0 = 2131890841(0x7f121299, float:1.9416385E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x13b5:
            android.content.Context r5 = r0.A00
            if (r6 == 0) goto L_0x13c5
            r1 = 2131890846(0x7f12129e, float:1.9416395E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r3
            java.lang.String r16 = r5.getString(r1, r0)
            return r16
        L_0x13c5:
            r1 = 2131890840(0x7f121298, float:1.9416383E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r3
            java.lang.String r16 = r5.getString(r1, r0)
            return r16
        L_0x13d1:
            boolean r2 = r3.A0H()
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            if (r2 == 0) goto L_0x13e3
            r0 = 2131886653(0x7f12023d, float:1.940789E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x13e3:
            r0 = 2131886656(0x7f120240, float:1.9407897E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x13eb:
            if (r1 == 0) goto L_0x13f9
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            r0 = 2131893050(0x7f121b3a, float:1.9420866E38)
            java.lang.String r16 = X.C34811ku.A05(r1, r0)
            return r16
        L_0x13f9:
            boolean r2 = r3.A0H()
            X.0tz r0 = r0.A06
            android.content.Context r1 = r0.A00
            if (r2 == 0) goto L_0x140b
            r0 = 2131892354(0x7f121882, float:1.9419454E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x140b:
            r0 = 2131892355(0x7f121883, float:1.9419456E38)
            java.lang.String r16 = r1.getString(r0)
            return r16
        L_0x1413:
            X.0tz r3 = r0.A06
            android.content.Context r3 = r3.A00
            android.content.res.Resources r7 = r3.getResources()
            boolean r3 = r5.A01
            r6 = 2131889239(0x7f120c57, float:1.9413136E38)
            if (r3 == 0) goto L_0x1425
            r6 = 2131889237(0x7f120c55, float:1.9413132E38)
        L_0x1425:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            X.0sP r3 = r0.A04
            X.0sG r2 = r0.A03
            X.0rv r0 = r1.A0B()
            X.0sH r0 = r2.A0A(r0)
            java.lang.String r0 = r3.A08(r0)
            r5[r4] = r0
            java.lang.String r16 = r7.getString(r6, r5)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15Z.A0C(X.1WU, boolean):java.lang.String");
    }

    public String A0D(String str, String str2, String str3, boolean z2) {
        int i2;
        Object[] objArr;
        int i3;
        if (str3 == null) {
            return this.A06.A00.getString(R.string.str1743);
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        Context context = this.A06.A00;
        if (isEmpty) {
            if (z2) {
                i2 = R.string.str1746;
            } else if (str == null) {
                i2 = R.string.str1745;
            } else {
                i3 = R.string.str1744;
                objArr = new Object[2];
                objArr[0] = str;
                objArr[1] = str3;
            }
            objArr = new Object[]{str3};
        } else {
            if (z2) {
                i3 = R.string.str1749;
            } else if (str == null) {
                i3 = R.string.str1748;
            } else {
                i2 = R.string.str1747;
                objArr = new Object[]{str, str2, str3};
            }
            objArr = new Object[2];
            objArr[0] = str2;
            objArr[1] = str3;
        }
        return context.getString(i2, objArr);
    }

    public final String A0E(String str, Set set, int i2, boolean z2) {
        char c2;
        List A022 = A02(set, 3);
        if (z2) {
            c2 = 0;
        } else {
            c2 = 1;
            if (str == null) {
                c2 = 2;
            }
        }
        Pair A002 = A00(A022, i2);
        int intValue = ((Number) A002.first).intValue();
        if (intValue == 1) {
            return this.A06.A00.getResources().getString(A0P[1][c2], new Object[]{A022.get(0), str});
        } else if (intValue != 2) {
            Context context = this.A06.A00;
            if (intValue == 3) {
                return context.getResources().getString(A0P[3][c2], new Object[]{A022.get(0), A022.get(1), A022.get(2), str});
            } else if (intValue != 4) {
                return context.getResources().getQuantityString(A0P[0][c2], i2, new Object[]{Integer.valueOf(i2), str});
            } else {
                return context.getResources().getQuantityString(A0P[4][c2], ((Number) A002.second).intValue(), new Object[]{A022.get(0), A022.get(1), str, A002.second});
            }
        } else {
            return this.A06.A00.getResources().getString(A0P[2][c2], new Object[]{A022.get(0), A022.get(1), str});
        }
    }

    public final String A0F(String str, Set set, int i2, boolean z2) {
        char c2;
        Resources resources;
        int i3;
        Object[] objArr;
        if (z2) {
            c2 = 0;
        } else {
            c2 = 1;
            if (str == null) {
                c2 = 2;
            }
        }
        List A022 = A02(set, 1);
        int size = A022.size();
        C16980tz r0 = this.A06;
        if (size < 1) {
            resources = r0.A00.getResources();
            i3 = A0Q[0][c2];
            objArr = new Object[]{Integer.valueOf(i2), str};
        } else if (i2 == 1) {
            return r0.A00.getString(A0Q[1][c2], new Object[]{A022.get(0), str});
        } else {
            resources = r0.A00.getResources();
            i3 = A0Q[2][c2];
            i2--;
            objArr = new Object[]{A022.get(0), Integer.valueOf(i2), str};
        }
        return resources.getQuantityString(i3, i2, objArr);
    }
}
