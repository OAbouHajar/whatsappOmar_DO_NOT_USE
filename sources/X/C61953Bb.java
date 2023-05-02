package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3Bb  reason: invalid class name and case insensitive filesystem */
public class C61953Bb {
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (X.C62153Bw.A00(r3) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(int[] r4) {
        /*
            boolean r1 = X.C62153Bw.A03(r4)
            java.lang.String r0 = "must be skin tone"
            X.AnonymousClass00B.A0B(r0, r1)
            int[] r3 = X.C37941pz.A03(r4)
            int r2 = r3.length
            r0 = 3
            if (r2 == r0) goto L_0x0014
            r0 = 4
            if (r2 != r0) goto L_0x004c
        L_0x0014:
            int r0 = r2 + -2
            r1 = r3[r0]
            r0 = 8205(0x200d, float:1.1498E-41)
            if (r1 != r0) goto L_0x004c
            int r0 = r2 + -1
            r3 = r3[r0]
            boolean r0 = X.C62153Bw.A00(r3)
            if (r0 == 0) goto L_0x004c
        L_0x0026:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            r0 = 0
            r0 = r4[r0]
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r2.append(r0)
            if (r3 != 0) goto L_0x003d
            java.lang.String r0 = ""
        L_0x0038:
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)
            return r0
        L_0x003d:
            java.lang.String r0 = "_"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = java.lang.Integer.toString(r3)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            goto L_0x0038
        L_0x004c:
            r3 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61953Bb.A00(int[]):java.lang.String");
    }

    public static void A01(C17020u3 r3, int[] iArr) {
        int[] A06 = C62153Bw.A06(iArr);
        if (!C62153Bw.A02(A06)) {
            Log.e("EmojiSkinTonePreferenceManager/savePreferredMultiSkinTone/emoji is not a multi skin tone emoji");
            return;
        }
        String A0h = AnonymousClass000.A0h(C37781pj.A00(C62153Bw.A07(A06)), AnonymousClass000.A0r("multi_skin_"));
        List A01 = new C61733Ac(iArr).A01();
        C13680ns.A0y(r3.A00("emoji_modifiers").edit(), A0h, A01.size() == 0 ? "" : TextUtils.join("_", A01));
    }

    public static void A02(C17020u3 r3, int[] iArr) {
        C13680ns.A0w(r3.A00("emoji_modifiers").edit(), A00(iArr), C62153Bw.A01(iArr) ? iArr[1] : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r4 = android.text.TextUtils.split(r1, "_");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A03(X.C17020u3 r4, int[] r5) {
        /*
            int[] r2 = X.C62153Bw.A07(r5)
            java.lang.String r0 = "multi_skin_"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.C37781pj.A00(r2)
            java.lang.String r2 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r4.A00(r0)     // Catch:{ ClassCastException -> 0x0052 }
            java.lang.String r0 = ""
            java.lang.String r1 = r1.getString(r2, r0)     // Catch:{ ClassCastException -> 0x0052 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = "_"
            java.lang.String[] r4 = android.text.TextUtils.split(r1, r0)
            int r3 = r4.length
            r0 = 2
            if (r3 < r0) goto L_0x0051
            int[] r0 = X.C62153Bw.A06(r5)
            int[] r0 = X.C62153Bw.A05(r0)
            X.3Ac r2 = new X.3Ac
            r2.<init>(r0)
            r1 = 1
        L_0x003c:
            if (r1 > r3) goto L_0x004d
            int r0 = r1 + -1
            r0 = r4[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            X.3Ac r2 = r2.A00(r1, r0)
            int r1 = r1 + 1
            goto L_0x003c
        L_0x004d:
            int[] r5 = r2.A02()
        L_0x0051:
            return r5
        L_0x0052:
            r1 = move-exception
            java.lang.String r0 = "EmojiSkinTonePreferenceManager/getPreferredMultiSkinTone"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61953Bb.A03(X.0u3, int[]):int[]");
    }

    public static int[] A04(C17020u3 r1, int[] iArr) {
        return C62153Bw.A08(iArr, C13690nt.A01(r1.A00("emoji_modifiers"), A00(iArr)));
    }
}
