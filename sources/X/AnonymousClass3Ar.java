package X;

import android.content.Context;
import com.obwhatsapp.R;
import java.io.File;

/* renamed from: X.3Ar  reason: invalid class name */
public class AnonymousClass3Ar {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3 == r2) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable A00(android.content.Context r4, X.C38701rH r5) {
        /*
            X.1Vw r0 = r5.A11
            boolean r0 = r0.A02
            int r3 = r5.A0C
            if (r0 == 0) goto L_0x001d
            r2 = 8
            r1 = 2131232184(0x7f0805b8, float:1.808047E38)
            r0 = 2131101018(0x7f06055a, float:1.7814434E38)
        L_0x0010:
            if (r3 != r2) goto L_0x0018
        L_0x0012:
            r1 = 2131232184(0x7f0805b8, float:1.808047E38)
            r0 = 2131101017(0x7f060559, float:1.7814432E38)
        L_0x0018:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A02(r4, r1, r0)
            return r0
        L_0x001d:
            r0 = 9
            if (r3 == r0) goto L_0x0012
            r2 = 10
            r1 = 2131232184(0x7f0805b8, float:1.808047E38)
            r0 = 2131101019(0x7f06055b, float:1.7814436E38)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Ar.A00(android.content.Context, X.1rH):android.graphics.drawable.Drawable");
    }

    public static String A01(Context context, C16000sG r11, C16080sP r12, C16440t3 r13, AnonymousClass013 r14, C38701rH r15) {
        int i2;
        Object[] objArr;
        int i3;
        int i4;
        String A06 = C28961Zl.A06(r14, (long) Math.max(0, r15.A00 * 1000));
        String A00 = C47672Jx.A00(r14, r13.A02(r15.A0I));
        boolean A1R = AnonymousClass000.A1R(r15.A08, 1);
        if (r15.A11.A02) {
            int i5 = r15.A0C;
            if (i5 == 1) {
                i2 = R.string.str0126;
                if (A1R) {
                    i2 = R.string.str1a4a;
                }
            } else if (i5 == 5) {
                i2 = R.string.str0125;
                if (A1R) {
                    i2 = R.string.str1a49;
                }
            } else if (i5 == 13) {
                i2 = R.string.str0127;
                if (A1R) {
                    i2 = R.string.str1a4c;
                }
            } else if (i5 == 8) {
                i2 = R.string.str1a4b;
            } else {
                i2 = R.string.str0124;
                if (A1R) {
                    i2 = R.string.str1a48;
                }
            }
            objArr = new Object[]{A06, A00};
        } else {
            String A0E = r12.A0E(C16000sG.A00(r11, r15.A0C()));
            int i6 = r15.A0C;
            if (i6 == 9 || i6 == 10) {
                int i7 = R.string.str0123;
                if (A1R) {
                    i7 = R.string.str1a47;
                }
                objArr = new Object[3];
            } else {
                File file = r15.A02.A0F;
                if (A1R) {
                    if (file == null) {
                        i4 = R.string.str1a4d;
                    } else {
                        i3 = R.string.str1a46;
                        objArr = new Object[3];
                    }
                } else if (file == null) {
                    i4 = R.string.str0128;
                } else {
                    i3 = R.string.str0122;
                    objArr = new Object[3];
                }
                Object[] objArr2 = new Object[4];
                objArr2[0] = A0E;
                objArr2[1] = A06;
                objArr2[2] = A00;
                return C13680ns.A0d(context, C38621r6.A0I(r14, r15.A01), objArr2, 3, i4);
            }
            objArr[0] = A0E;
            objArr[1] = A06;
            objArr[2] = A00;
        }
        return context.getString(i2, objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r2 == 10) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C38701rH r6, com.obwhatsapp.search.views.itemviews.AudioPlayerView r7, com.obwhatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r8) {
        /*
            android.content.Context r5 = r8.getContext()
            X.1Vw r4 = r6.A11
            boolean r3 = r4.A02
            int r2 = r6.A0C
            if (r3 == 0) goto L_0x003f
            r0 = 8
            if (r2 == r0) goto L_0x004a
            r1 = 2131101658(0x7f0607da, float:1.7815732E38)
            r0 = 2131099740(0x7f06005c, float:1.7811842E38)
        L_0x0016:
            r8.setMicColorTint(r1)
            int r0 = X.AnonymousClass00T.A00(r5, r0)
            r7.setSeekbarColor(r0)
            X.0ta r1 = X.C16730tY.A00(r6)
            boolean r0 = r1.A0Z
            if (r0 != 0) goto L_0x003e
            boolean r0 = r1.A0P
            if (r0 != 0) goto L_0x003e
            boolean r0 = r6.A0t
            if (r0 == 0) goto L_0x003a
            if (r3 == 0) goto L_0x003a
            X.0rv r0 = r4.A00
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 == 0) goto L_0x003e
        L_0x003a:
            r0 = 0
            r7.setSeekbarColor(r0)
        L_0x003e:
            return
        L_0x003f:
            r0 = 9
            if (r2 == r0) goto L_0x004a
            r0 = 10
            r1 = 2131101656(0x7f0607d8, float:1.7815728E38)
            if (r2 != r0) goto L_0x004d
        L_0x004a:
            r1 = 2131101657(0x7f0607d9, float:1.781573E38)
        L_0x004d:
            r0 = r1
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Ar.A02(X.1rH, com.obwhatsapp.search.views.itemviews.AudioPlayerView, com.obwhatsapp.search.views.itemviews.VoiceNoteProfileAvatarView):void");
    }
}
