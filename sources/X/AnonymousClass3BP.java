package X;

import android.content.Context;
import android.content.res.Resources;
import com.obwhatsapp.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3BP  reason: invalid class name */
public class AnonymousClass3BP {
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ce, code lost:
        if (r12.A09(r0) != false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0118, code lost:
        if (r0.longValue() < r11) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01de, code lost:
        if (r11.isChecked() == false) goto L_0x01e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0218  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Dialog A00(android.content.Context r41, X.AnonymousClass5RM r42, X.AnonymousClass29B r43, X.C14870pt r44, X.C16760tb r45, X.C16000sG r46, X.C16080sP r47, X.AnonymousClass4E3 r48, X.C16440t3 r49, X.C15860rz r50, X.AnonymousClass013 r51, X.C16070sO r52, X.C18030w2 r53, X.C17250um r54, X.C14710pd r55, X.C16490t9 r56, X.C18040w3 r57, X.C17240ul r58, X.AnonymousClass15W r59, X.AnonymousClass1L9 r60, X.C16320sq r61, java.lang.String r62, java.util.Set r63, boolean r64) {
        /*
            r31 = r63
            boolean r0 = r31.isEmpty()
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "dialog/delete no messages"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x000f:
            r6 = 1
            if (r64 == 0) goto L_0x0026
            java.util.Iterator r1 = r31.iterator()
        L_0x0016:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0129
            X.0tZ r0 = X.C13680ns.A0V(r1)
            if (r0 == 0) goto L_0x0016
            X.1Vt r0 = r0.A0L
            if (r0 == 0) goto L_0x0016
        L_0x0026:
            r21 = 0
        L_0x0028:
            long r19 = r49.A00()
            java.util.HashSet r7 = X.C13680ns.A0o()
            java.util.Iterator r18 = r31.iterator()
            r3 = r19
            r17 = 0
            r16 = 0
            r10 = 0
            r5 = 0
            r2 = 0
            r30 = 0
        L_0x003f:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x012d
            X.0tZ r8 = X.C13680ns.A0V(r18)
            X.1Vw r1 = r8.A11
            X.0rv r9 = r1.A00
            r7.add(r9)
            if (r17 != 0) goto L_0x0073
            byte r11 = r8.A10
            boolean r0 = X.C30921dB.A00(r11)
            if (r0 != 0) goto L_0x0060
            boolean r0 = X.C38621r6.A0N(r11)
            if (r0 == 0) goto L_0x0073
        L_0x0060:
            r0 = r8
            X.0tY r0 = (X.C16730tY) r0
            X.0ta r0 = X.C16730tY.A00(r0)
            java.io.File r0 = r0.A0F
            if (r0 == 0) goto L_0x0073
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0073
            r17 = 1
        L_0x0073:
            if (r16 != 0) goto L_0x0084
            boolean r0 = r8 instanceof X.C16730tY
            if (r0 == 0) goto L_0x0084
            r0 = r8
            X.0tY r0 = (X.C16730tY) r0
            boolean r0 = X.C38621r6.A0y(r0)
            if (r0 != 0) goto L_0x0084
            r16 = 1
        L_0x0084:
            if (r9 == 0) goto L_0x0126
            r0 = r46
            X.0sH r11 = r0.A0A(r9)
        L_0x008c:
            boolean r13 = r1.A02
            if (r13 != 0) goto L_0x0092
            int r10 = r10 + 1
        L_0x0092:
            boolean r15 = X.C16030sJ.A0L(r9)
            r12 = r52
            if (r15 == 0) goto L_0x0124
            X.0sL r0 = X.C16050sL.A03(r9)
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r12.A0A(r0)
            if (r0 == 0) goto L_0x0124
            if (r10 != r6) goto L_0x0124
            r14 = 1
            com.whatsapp.jid.UserJid[] r5 = new com.whatsapp.jid.UserJid[r6]
            com.whatsapp.jid.UserJid r1 = r8.A0C()
            r0 = 0
            r5[r0] = r1
            java.util.ArrayList r1 = X.AnonymousClass3Bv.newArrayList((java.lang.Object[]) r5)
            r0 = -1
            r5 = r47
            java.lang.String r30 = r5.A0L(r1, r0)
            r5 = 1
        L_0x00bf:
            if (r13 == 0) goto L_0x0122
            if (r15 == 0) goto L_0x00d0
            X.0sL r0 = X.C16050sL.A03(r9)
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r12.A09(r0)
            if (r0 == 0) goto L_0x0122
        L_0x00d0:
            r12 = 1
            int r2 = r2 + 1
        L_0x00d3:
            long r0 = r8.A0I
            long r3 = java.lang.Math.min(r0, r3)
            if (r21 == 0) goto L_0x011a
            if (r12 != 0) goto L_0x00df
            if (r14 == 0) goto L_0x011a
        L_0x00df:
            boolean r12 = X.C38621r6.A0o(r8)
            if (r12 != 0) goto L_0x011a
            r12 = 216000000(0xcdfe600, double:1.067181795E-315)
            long r0 = r0 + r12
            X.0rv r0 = r8.A0B()
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 != 0) goto L_0x011a
            if (r11 == 0) goto L_0x00fd
            r0 = r58
            boolean r0 = r0.A0e(r11)
            if (r0 != 0) goto L_0x011a
        L_0x00fd:
            r0 = r59
            boolean r0 = r0.A01(r9)
            if (r0 != 0) goto L_0x011a
            long r11 = r49.A00()
            int r0 = r8.A04
            if (r0 <= 0) goto L_0x011e
            java.lang.Long r0 = r8.A0Z
            X.AnonymousClass00B.A06(r0)
            long r8 = r0.longValue()
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x011e
        L_0x011a:
            r21 = 0
            goto L_0x003f
        L_0x011e:
            r21 = 1
            goto L_0x003f
        L_0x0122:
            r12 = 0
            goto L_0x00d3
        L_0x0124:
            r14 = 0
            goto L_0x00bf
        L_0x0126:
            r11 = 0
            goto L_0x008c
        L_0x0129:
            r21 = 1
            goto L_0x0028
        L_0x012d:
            r29 = 0
            r24 = r50
            if (r21 == 0) goto L_0x0149
            if (r5 < r6) goto L_0x022f
            android.content.SharedPreferences r1 = X.C13680ns.A0B(r24)
            java.lang.String r0 = "pref_revoke_admin_nux"
            boolean r0 = r1.getBoolean(r0, r6)
            if (r2 < r6) goto L_0x0229
            if (r0 == 0) goto L_0x0149
            r0 = 24
        L_0x0145:
            java.lang.Integer r29 = java.lang.Integer.valueOf(r0)
        L_0x0149:
            r9 = r41
            X.1fu r3 = X.C32241fu.A00(r9)
            if (r17 == 0) goto L_0x0225
            if (r16 == 0) goto L_0x0225
            android.content.SharedPreferences r1 = X.C13680ns.A0B(r24)
            java.lang.String r0 = "pref_delete_media"
            boolean r10 = r1.getBoolean(r0, r6)
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r9)
            r1 = 2131558931(0x7f0d0213, float:1.8743192E38)
            r0 = 0
            android.view.View r6 = X.C13680ns.A0H(r4, r0, r1)
            r0 = 2131363130(0x7f0a053a, float:1.834606E38)
            android.view.View r11 = r6.findViewById(r0)
            android.widget.CheckBox r11 = (android.widget.CheckBox) r11
            android.content.res.Resources r4 = r9.getResources()
            r1 = 2131755059(0x7f100033, float:1.9140987E38)
            int r0 = r7.size()
            java.lang.String r0 = r4.getQuantityString(r1, r0)
            r11.setText(r0)
            r11.setChecked(r10)
            r3.setView(r6)
        L_0x018a:
            r0 = r62
            r1 = r54
            java.lang.CharSequence r0 = X.AnonymousClass2Sy.A05(r9, r1, r0)
            r3.A06(r0)
            r1 = 1703(0x6a7, float:2.386E-42)
            X.0tM r0 = X.C16620tM.A02
            r4 = r55
            boolean r47 = r4.A0E(r0, r1)
            X.4fx r8 = new X.4fx
            r25 = r53
            r40 = r51
            r38 = r48
            r23 = r45
            r36 = r44
            r44 = r61
            r27 = r57
            r26 = r56
            r22 = r43
            r4 = r42
            r32 = r8
            r33 = r11
            r34 = r4
            r35 = r22
            r37 = r23
            r39 = r24
            r41 = r25
            r42 = r26
            r43 = r27
            r45 = r31
            r46 = r10
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r7 = 1
            com.facebook.redex.IDxCListenerShape128S0100000_2_I1 r6 = new com.facebook.redex.IDxCListenerShape128S0100000_2_I1
            r6.<init>(r4, r7)
            if (r21 == 0) goto L_0x0218
            if (r11 == 0) goto L_0x01e0
            boolean r0 = r11.isChecked()
            r34 = 1
            if (r0 != 0) goto L_0x01e2
        L_0x01e0:
            r34 = 0
        L_0x01e2:
            X.3CB r1 = new X.3CB
            r28 = r60
            r19 = r1
            r20 = r9
            r21 = r4
            r32 = r5
            r33 = r2
            r35 = r10
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r0 = 2131891310(0x7f12146e, float:1.9417336E38)
            r3.setPositiveButton(r0, r1)
            r0 = 2131891311(0x7f12146f, float:1.9417338E38)
            r3.setNegativeButton(r0, r8)
            r0 = 2131886996(0x7f120394, float:1.9408587E38)
            r3.A0B(r6, r0)
        L_0x0207:
            r3.A07(r7)
            r1 = 0
            com.facebook.redex.IDxCListenerShape162S0100000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape162S0100000_2_I1
            r0.<init>(r4, r1)
            r3.A03(r0)
            X.02l r0 = r3.create()
            return r0
        L_0x0218:
            r0 = 2131891311(0x7f12146f, float:1.9417338E38)
            r3.setPositiveButton(r0, r8)
            r0 = 2131886996(0x7f120394, float:1.9408587E38)
            r3.setNegativeButton(r0, r6)
            goto L_0x0207
        L_0x0225:
            r10 = 0
            r11 = 0
            goto L_0x018a
        L_0x0229:
            if (r0 == 0) goto L_0x0149
            r0 = 23
            goto L_0x0145
        L_0x022f:
            long r8 = r49.A00()
            long r8 = r8 - r3
            r3 = 43080000(0x2915940, double:2.1284348E-316)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0249
            android.content.SharedPreferences r1 = X.C13680ns.A0B(r24)
            java.lang.String r0 = "pref_revoke_sender_nux"
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 != 0) goto L_0x0249
            goto L_0x0149
        L_0x0249:
            android.content.SharedPreferences r1 = X.C13680ns.A0B(r24)
            java.lang.String r0 = "pref_revoke_sender_nux_v2"
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 == 0) goto L_0x0149
            r0 = 19
            if (r2 != r6) goto L_0x0145
            r0 = 25
            goto L_0x0145
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BP.A00(android.content.Context, X.5RM, X.29B, X.0pt, X.0tb, X.0sG, X.0sP, X.4E3, X.0t3, X.0rz, X.013, X.0sO, X.0w2, X.0um, X.0pd, X.0t9, X.0w3, X.0ul, X.15W, X.1L9, X.0sq, java.lang.String, java.util.Set, boolean):android.app.Dialog");
    }

    public static String A01(Context context, C16000sG r8, C16080sP r9, C15830rv r10, Collection collection) {
        String str;
        if (!collection.isEmpty()) {
            C16010sH A0A = r10 != null ? r8.A0A(r10) : null;
            if (collection.size() == 1) {
                C16740tZ A0V = C13680ns.A0V(collection.iterator());
                if (A0V != null) {
                    if (A0V.A11.A02 || A0A == null) {
                        return context.getString(R.string.str069a);
                    }
                    if (A0A.A0J()) {
                        C15830rv A0B = A0V.A0B();
                        if (A0B != null) {
                            str = r9.A08(r8.A0A(A0B));
                        }
                        str = "";
                    } else {
                        if (r9.A08(A0A) != null) {
                            str = r9.A08(A0A);
                        }
                        str = "";
                    }
                    return C13680ns.A0d(context, str, new Object[1], 0, R.string.str0699);
                }
            } else {
                Resources resources = context.getResources();
                int size = collection.size();
                Object[] objArr = new Object[1];
                AnonymousClass000.A1M(objArr, collection.size(), 0);
                return resources.getQuantityString(R.plurals.plurals0030, size, objArr);
            }
        }
        return null;
    }

    public static void A02(C18030w2 r6, C16490t9 r7, C18040w3 r8, Set set, int i2) {
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            C16740tZ r2 = null;
            C16740tZ r5 = null;
            byte b2 = -1;
            while (true) {
                if (!it.hasNext()) {
                    r2 = r5;
                    break;
                }
                C16740tZ A0V = C13680ns.A0V(it);
                if (b2 == -1) {
                    b2 = A0V.A10;
                    r5 = A0V;
                }
                if (b2 != A0V.A10) {
                    break;
                }
            }
            Iterator it2 = set.iterator();
            C15830rv r3 = null;
            while (it2.hasNext()) {
                C28381Vw r0 = C13680ns.A0V(it2).A11;
                if (r3 == null) {
                    r3 = r0.A00;
                } else if (!r3.equals(r0.A00)) {
                    return;
                }
            }
            if (r3 != null) {
                C75283ru r1 = new C75283ru();
                r1.A01 = Integer.valueOf(i2);
                r1.A00 = Boolean.valueOf(C16030sJ.A0L(r3));
                r1.A03 = C13690nt.A0W(set.size());
                r1.A04 = r8.A03(r3.getRawString());
                if (r2 != null) {
                    r1.A02 = Integer.valueOf(C18020w1.A02(r6, r2));
                }
                r7.A06(r1);
            }
        }
    }
}
