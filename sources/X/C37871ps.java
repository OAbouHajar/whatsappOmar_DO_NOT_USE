package X;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.Conversation;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1ps  reason: invalid class name and case insensitive filesystem */
public class C37871ps {
    public C16740tZ A00;
    public final C16300so A01;
    public final C16040sK A02;
    public final C15900s5 A03;
    public final C16000sG A04;
    public final C16080sP A05;
    public final AnonymousClass01V A06;
    public final AnonymousClass013 A07;
    public final C16500tA A08;
    public final C218415q A09;

    public C37871ps(C16300so r1, C16040sK r2, C15900s5 r3, C16000sG r4, C16080sP r5, AnonymousClass01V r6, AnonymousClass013 r7, C16500tA r8, C218415q r9, C16740tZ r10) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = r6;
        this.A05 = r5;
        this.A07 = r7;
        this.A09 = r9;
        this.A08 = r8;
        this.A00 = r10;
    }

    public long A00() {
        return (this instanceof C45982Bw ? ((C45982Bw) this).A00.A01 : this instanceof C45962Bu ? ((C45962Bu) this).A00.A00 : this.A00).A13;
    }

    public C16010sH A01() {
        C16740tZ r0 = this.A00;
        C15830rv A0B = r0.A0B();
        C15830rv r1 = r0.A11.A00;
        if (C16030sJ.A0L(r1) && A0B != null) {
            return this.A04.A0A(A0B);
        }
        C16000sG r02 = this.A04;
        AnonymousClass00B.A06(r1);
        return r02.A0A(r1);
    }

    public C42721yK A02(C16010sH r12) {
        String A0G;
        C15830rv A0B;
        if (this instanceof C45982Bw) {
            C45982Bw r7 = (C45982Bw) this;
            C38541qx r1 = r7.A00.A02;
            int i2 = 2;
            if (C16030sJ.A0L(r1.A11.A00)) {
                i2 = 1;
            }
            C15830rv A0B2 = r1.A0B();
            C16080sP r13 = r7.A05;
            String A0G2 = r13.A0G(r12, i2, false);
            if (r12.A0J() && A0B2 != null) {
                String A0G3 = r13.A0G(r7.A04.A0A(A0B2), i2, false);
                int i3 = r7.A00.A00 - 1;
                if (i3 != 0) {
                    A0G2 = r7.A01.A00.getResources().getQuantityString(R.plurals.plurals0123, i3, new Object[]{A0G3, Integer.valueOf(i3), A0G2});
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(A0G3);
                    sb.append(" @ ");
                    sb.append(A0G2);
                    A0G2 = sb.toString();
                }
            }
            AnonymousClass00B.A06(A0G2);
            return new C42721yK(A0G2, Conversation.pNotifi(r12, (CharSequence) r7.A09()));
        } else if (this instanceof C45962Bu) {
            C45962Bu r72 = (C45962Bu) this;
            AnonymousClass23Z r6 = r72.A00;
            C39191s4 r14 = r6.A01;
            int i4 = 2;
            if (C16030sJ.A0L(r14.A11.A00)) {
                i4 = 1;
            }
            C15830rv A0B3 = r14.A0B();
            C16080sP r2 = r72.A05;
            String A0G4 = r2.A0G(r12, i4, false);
            if (r12.A0J() && A0B3 != null) {
                String A0G5 = r2.A0G(r72.A04.A0A(A0B3), i4, false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(A0G5);
                sb2.append(" @ ");
                sb2.append(A0G4);
                A0G4 = sb2.toString();
            }
            AnonymousClass00B.A06(A0G4);
            C218415q r15 = r72.A09;
            return new C42721yK(A0G4, Conversation.pNotifi(r12, (CharSequence) r72.A01.A00.getString(R.string.str0c00, new Object[]{r15.A0G(r6.A00)})));
        } else {
            C218415q r5 = this.A09;
            C16740tZ r4 = this.A00;
            if (r4 == null) {
                return new C42721yK("", "");
            }
            int i5 = 2;
            if (C16030sJ.A0L(r4.A11.A00)) {
                i5 = 1;
            }
            if (!r12.A0J() || (r4 instanceof AnonymousClass1WU) || (A0B = r4.A0B()) == null) {
                A0G = r5.A06.A0G(r12, i5, false);
            } else {
                C16080sP r22 = r5.A06;
                String A0G6 = r22.A0G(r5.A05.A0A(A0B), i5, false);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(A0G6);
                sb3.append(" @ ");
                sb3.append(r22.A0G(r12, i5, false));
                A0G = sb3.toString();
            }
            return new C42721yK(A0G, Conversation.pNotifi(r12, r5.A0G(r4)));
        }
    }

    public CharSequence A03(C16010sH r10, boolean z2) {
        CharSequence[] charSequenceArr;
        StringBuilder sb;
        CharSequence obj;
        String string;
        StringBuilder sb2;
        CharSequence charSequence;
        if (this instanceof C45982Bw) {
            C45982Bw r3 = (C45982Bw) this;
            charSequenceArr = new CharSequence[2];
            int i2 = 2;
            if (C16030sJ.A0L(r3.A00.A02.A11.A00)) {
                i2 = 1;
            }
            if (r10.A0J()) {
                C16740tZ r7 = r3.A00;
                boolean z3 = r7.A11.A02;
                if (z2) {
                    if (!z3) {
                        CharSequence A082 = r3.A08(r3.A09.A0I(r7.A0B(), i2));
                        sb2 = new StringBuilder();
                        sb2.append(A082);
                        sb2.append(" @ ");
                    }
                } else if (!z3) {
                    CharSequence A083 = r3.A08(r3.A09.A0I(r7.A0B(), i2));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(A083);
                    sb3.append(": ");
                    charSequence = C218415q.A02(sb3.toString());
                    charSequenceArr[0] = charSequence;
                    string = r3.A09();
                }
                sb2 = new StringBuilder();
            } else {
                if (z2) {
                    String A0G = r3.A05.A0G(r10, i2, false);
                    AnonymousClass00B.A06(A0G);
                    CharSequence A084 = r3.A08(A0G);
                    sb2 = new StringBuilder();
                    sb2.append(A084);
                    sb2.append(": ");
                    charSequence = sb2.toString();
                    charSequenceArr[0] = charSequence;
                    string = r3.A09();
                }
                sb2 = new StringBuilder();
            }
            sb2.append(r3.A05.A0G(r10, i2, false));
            sb2.append(": ");
            charSequence = sb2.toString();
            charSequenceArr[0] = charSequence;
            string = r3.A09();
        } else if (!(this instanceof C45962Bu)) {
            return this.A09.A0E(r10, this.A00, z2, false);
        } else {
            C45962Bu r32 = (C45962Bu) this;
            charSequenceArr = new CharSequence[2];
            AnonymousClass23Z r2 = r32.A00;
            int i3 = 2;
            if (C16030sJ.A0L(r2.A01.A11.A00)) {
                i3 = 1;
            }
            if (r10.A0J()) {
                String A0I = r32.A09.A0I(r32.A00.A0B(), i3);
                boolean z4 = r32.A00.A11.A02;
                if (z2) {
                    if (!z4) {
                        sb = new StringBuilder();
                        sb.append(A0I);
                        sb.append(" @ ");
                    }
                } else if (!z4) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(A0I);
                    sb4.append(": ");
                    obj = C218415q.A02(sb4.toString());
                    charSequenceArr[0] = obj;
                    C218415q r1 = r32.A09;
                    string = r32.A01.A00.getString(R.string.str0c00, new Object[]{r1.A0G(r2.A00)});
                }
                sb = new StringBuilder();
            } else {
                String A0G2 = r32.A05.A0G(r10, i3, false);
                AnonymousClass00B.A06(A0G2);
                if (z2) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(A0G2);
                    sb5.append(": ");
                    obj = sb5.toString();
                    charSequenceArr[0] = obj;
                    C218415q r12 = r32.A09;
                    string = r32.A01.A00.getString(R.string.str0c00, new Object[]{r12.A0G(r2.A00)});
                }
                sb = new StringBuilder();
            }
            sb.append(r32.A05.A0G(r10, i3, false));
            sb.append(": ");
            obj = sb.toString();
            charSequenceArr[0] = obj;
            C218415q r122 = r32.A09;
            string = r32.A01.A00.getString(R.string.str0c00, new Object[]{r122.A0G(r2.A00)});
        }
        charSequenceArr[1] = string;
        return TextUtils.concat(charSequenceArr);
    }

    public String A04() {
        ContentResolver A0C = this.A06.A0C();
        if (A0C == null) {
            Log.w("messagenotification cr=null");
        } else {
            Uri A042 = this.A04.A04(A0C, A01());
            if (A042 != null) {
                return A042.toString();
            }
        }
        return null;
    }

    public void A05(C007503l r5) {
        Bundle bundle = new Bundle();
        bundle.putLong("last_row_id", this.A00.A13);
        Bundle bundle2 = r5.A0D;
        if (bundle2 == null) {
            r5.A0D = new Bundle(bundle);
        } else {
            bundle2.putAll(bundle);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        r7 = r6 * 3;
        r6 = r7 / 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C007503l r15, X.C16010sH r16, java.lang.StringBuilder r17, boolean r18) {
        /*
            r14 = this;
            r4 = 1
            r7 = 0
            if (r18 == 0) goto L_0x002e
            r0 = r16
            java.lang.CharSequence r2 = r14.A03(r0, r7)
        L_0x000a:
            X.0tZ r1 = r14.A00
            boolean r0 = r1 instanceof X.C38681rF
            r5 = r17
            if (r0 == 0) goto L_0x006b
            r0 = r1
            X.0tY r0 = (X.C16730tY) r0
            X.0ta r8 = r0.A02
            if (r8 == 0) goto L_0x006b
            X.15q r9 = r14.A09
            X.AnonymousClass00B.A06(r8)
            boolean r0 = r8.A0P
            r3 = 0
            if (r0 == 0) goto L_0x00f0
            java.io.File r0 = r8.A0F
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x00f0
            goto L_0x0041
        L_0x002e:
            X.013 r6 = r14.A07
            r5 = 2131755243(0x7f1000eb, float:1.914136E38)
            long r0 = (long) r4
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r3[r7] = r2
            java.lang.String r2 = r6.A0J(r3, r5, r0)
            goto L_0x000a
        L_0x0041:
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x00d6 }
            r6.<init>()     // Catch:{ OutOfMemoryError -> 0x00d6 }
            r6.inJustDecodeBounds = r4     // Catch:{ OutOfMemoryError -> 0x00d6 }
            java.io.File r0 = r8.A0F     // Catch:{ OutOfMemoryError -> 0x00d6 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ OutOfMemoryError -> 0x00d6 }
            android.graphics.BitmapFactory.decodeFile(r0, r6)     // Catch:{ OutOfMemoryError -> 0x00d6 }
            int r1 = r6.outWidth     // Catch:{ OutOfMemoryError -> 0x00d6 }
            int r0 = r6.outHeight     // Catch:{ OutOfMemoryError -> 0x00d6 }
            int r1 = r9.A0B(r1, r0)     // Catch:{ OutOfMemoryError -> 0x00d6 }
            r6.inSampleSize = r1     // Catch:{ OutOfMemoryError -> 0x00d6 }
            r0 = -1
            if (r1 == r0) goto L_0x00f0
            r6.inJustDecodeBounds = r7     // Catch:{ OutOfMemoryError -> 0x00d6 }
            java.io.File r0 = r8.A0F     // Catch:{ OutOfMemoryError -> 0x00d6 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ OutOfMemoryError -> 0x00d6 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r0, r6)     // Catch:{ OutOfMemoryError -> 0x00d6 }
            goto L_0x00d6
        L_0x006b:
            boolean r0 = r1 instanceof X.C38641rB
            if (r0 == 0) goto L_0x00f0
            X.1Vt r0 = r1.A0L
            if (r0 != 0) goto L_0x00f0
            X.15q r8 = r14.A09
            X.1rB r1 = (X.C38641rB) r1
            X.1jm r9 = r1.A1A()
            X.0tz r0 = r8.A09
            android.content.Context r7 = r0.A00
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131167155(0x7f0707b3, float:1.7948576E38)
            int r6 = r1.getDimensionPixelSize(r0)
            r11 = 0
            X.0xL r3 = r8.A0J     // Catch:{ OutOfMemoryError -> 0x00f0 }
            X.0sb r0 = r8.A01     // Catch:{ OutOfMemoryError -> 0x00f0 }
            java.lang.String r1 = X.AnonymousClass1MF.A00(r9, r6, r6)     // Catch:{ OutOfMemoryError -> 0x00f0 }
            byte[] r0 = X.AnonymousClass1MF.A01(r7, r0, r9)     // Catch:{ OutOfMemoryError -> 0x00f0 }
            if (r0 == 0) goto L_0x00f0
            android.graphics.Bitmap r10 = r3.A05(r1, r0, r6, r6)     // Catch:{ OutOfMemoryError -> 0x00f0 }
            if (r10 == 0) goto L_0x00f0
            int r7 = r6 * 3
            int r6 = r7 / 2
            int r1 = r8.A0B(r7, r6)     // Catch:{ OutOfMemoryError -> 0x00f0 }
            r0 = -1
            if (r1 == r0) goto L_0x00f0
            int r7 = r7 / r1
            int r6 = r6 / r1
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x00f0 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r7, r6, r0)     // Catch:{ OutOfMemoryError -> 0x00f0 }
            android.graphics.Canvas r9 = new android.graphics.Canvas     // Catch:{ OutOfMemoryError -> 0x00f0 }
            r9.<init>(r3)     // Catch:{ OutOfMemoryError -> 0x00f0 }
            float r12 = (float) r7     // Catch:{ OutOfMemoryError -> 0x00f0 }
            r13 = 1077936128(0x40400000, float:3.0)
            float r8 = r12 / r13
            float r7 = (float) r6     // Catch:{ OutOfMemoryError -> 0x00f0 }
            r1 = 1086324736(0x40c00000, float:6.0)
            float r6 = r7 / r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 * r0
            float r12 = r12 / r13
            r0 = 1084227584(0x40a00000, float:5.0)
            float r7 = r7 * r0
            float r7 = r7 / r1
            android.graphics.RectF r1 = new android.graphics.RectF     // Catch:{ OutOfMemoryError -> 0x00f0 }
            r1.<init>(r8, r6, r12, r7)     // Catch:{ OutOfMemoryError -> 0x00f0 }
            android.graphics.Paint r0 = new android.graphics.Paint     // Catch:{ OutOfMemoryError -> 0x00f0 }
            r0.<init>()     // Catch:{ OutOfMemoryError -> 0x00f0 }
            r9.drawBitmap(r10, r11, r1, r0)     // Catch:{ OutOfMemoryError -> 0x00f0 }
        L_0x00d6:
            if (r3 == 0) goto L_0x00f0
            java.lang.String r0 = " bigpicture"
            r5.append(r0)
            androidx.core.app.NotificationCompat$BigPictureStyle r1 = new androidx.core.app.NotificationCompat$BigPictureStyle
            r1.<init>()
            java.lang.CharSequence r0 = X.C007503l.A00(r2)
            r1.A01 = r0
            r1.A02 = r4
            r1.A00 = r3
            r15.A08(r1)
            return
        L_0x00f0:
            java.lang.String r0 = " bigtext:"
            r5.append(r0)
            int r0 = r2.length()
            r5.append(r0)
            androidx.core.app.NotificationCompat$BigTextStyle r7 = new androidx.core.app.NotificationCompat$BigTextStyle
            r7.<init>()
            r7.A09(r2)
            X.013 r6 = r14.A07
            r5 = 2131755243(0x7f1000eb, float:1.914136E38)
            r2 = 1
            r0 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r1] = r0
            java.lang.String r0 = r6.A0J(r4, r5, r2)
            java.lang.CharSequence r0 = X.C007503l.A00(r0)
            r7.A01 = r0
            r0 = 1
            r7.A02 = r0
            r15.A08(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37871ps.A06(X.03l, X.0sH, java.lang.StringBuilder, boolean):void");
    }

    public boolean A07(Context context, C007503l r7, C16010sH r8) {
        C16750ta r1;
        File file;
        C16740tZ r12 = this.A00;
        if ((!(r12 instanceof C38701rH) && !(r12 instanceof C38681rF)) || (r1 = ((C16730tY) r12).A02) == null || !r1.A0P || (file = r1.A0F) == null || !file.exists()) {
            return false;
        }
        Intent action = new C14750ph().A0v(context, r8).setAction("com.obwhatsapp.intent.action.PLAY");
        AnonymousClass22U.A01(action, "UpdateMessageNotificationRunnable");
        AnonymousClass1yL.A00(action, this.A00.A11);
        PendingIntent A002 = C42341xd.A00(context, 4, action, 134217728);
        C16740tZ r13 = this.A00;
        boolean z2 = r13 instanceof C38681rF;
        int i2 = R.drawable.notification_action_audio;
        if (z2) {
            i2 = R.drawable.notification_action_image;
        }
        byte b2 = r13.A10;
        int i3 = R.string.str1d62;
        if (b2 == 1) {
            i3 = R.string.str19cd;
        }
        r7.A04(i2, context.getString(i3), A002);
        return true;
    }
}
