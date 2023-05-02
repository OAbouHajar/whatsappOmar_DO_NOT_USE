package X;

import android.os.CountDownTimer;
import com.obwhatsapp.registration.RegisterPhone;

/* renamed from: X.2nZ  reason: invalid class name and case insensitive filesystem */
public class C56392nZ extends CountDownTimer {
    public final /* synthetic */ RegisterPhone A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56392nZ(RegisterPhone registerPhone) {
        super(200, 200);
        this.A00 = registerPhone;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cf, code lost:
        if (r8 == -2) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01ae, code lost:
        if (r4 == 30) goto L_0x017f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFinish() {
        /*
            r18 = this;
            r17 = r18
            r0 = r17
            com.obwhatsapp.registration.RegisterPhone r0 = r0.A00
            r16 = r0
            X.4OJ r0 = r0.A0E
            android.widget.EditText r0 = r0.A02
            android.text.Editable r0 = r0.getText()
            java.lang.String r4 = X.C13690nt.A0d(r0)
            r0 = r16
            X.4OJ r0 = r0.A0E
            android.widget.EditText r0 = r0.A03
            android.text.Editable r0 = r0.getText()
            java.lang.String r6 = X.C13690nt.A0d(r0)
            if (r4 == 0) goto L_0x00d1
            if (r6 == 0) goto L_0x00d1
            java.lang.String r5 = ""
            boolean r0 = r4.equals(r5)
            if (r0 != 0) goto L_0x00d1
            r0 = r16
            X.1G1 r1 = r0.A03
            java.lang.String r0 = r0.A0Q
            java.lang.String r3 = X.AnonymousClass2JN.A0C(r1, r6, r4, r0)
            if (r3 == 0) goto L_0x00d1
            r0 = r16
            X.1G1 r0 = r0.A03
            java.lang.String r2 = X.AnonymousClass2JN.A0B(r0, r4, r3)
            int r1 = r2.length()
            int r0 = r3.length()
            if (r1 < r0) goto L_0x00d1
            r9 = 2131891081(0x7f121389, float:1.9416872E38)
            r1 = 1
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r0 = r16
            X.013 r0 = r0.A01
            java.lang.String r7 = r0.A0H(r2)
            r2 = 0
            r0 = r16
            java.lang.String r10 = X.C13680ns.A0d(r0, r7, r8, r2, r9)
            X.1G1 r0 = r0.A03
            java.lang.String r7 = X.AnonymousClass2JO.A02(r0, r4, r6)
            int r0 = r4.length()
            java.lang.String r0 = r3.substring(r0)
            java.lang.String r9 = "\\D"
            java.lang.String r13 = r0.replaceAll(r9, r5)
            java.lang.String r15 = r7.replaceAll(r9, r5)
            int r12 = r15.length()
            int r0 = r13.length()
            int r14 = X.AnonymousClass000.A09(r12, r0)
            if (r14 != r1) goto L_0x0097
            if (r12 <= r0) goto L_0x0097
        L_0x0089:
            r8 = -1
        L_0x008a:
            r0 = r16
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x00d5
            r0 = r16
            int r0 = r0.A01
            if (r0 != r8) goto L_0x00d5
            return
        L_0x0097:
            r11 = 0
            r8 = 0
        L_0x0099:
            if (r11 < r12) goto L_0x009e
            if (r14 != 0) goto L_0x00ba
            goto L_0x0089
        L_0x009e:
            char r7 = r10.charAt(r8)     // Catch:{ StringIndexOutOfBoundsException -> 0x00c7 }
            char r0 = r13.charAt(r11)     // Catch:{ StringIndexOutOfBoundsException -> 0x00c7 }
            if (r7 == r0) goto L_0x00ab
            int r8 = r8 + 1
            goto L_0x009e
        L_0x00ab:
            char r7 = r15.charAt(r11)     // Catch:{ StringIndexOutOfBoundsException -> 0x00c7 }
            char r0 = r13.charAt(r11)     // Catch:{ StringIndexOutOfBoundsException -> 0x00c7 }
            if (r7 != r0) goto L_0x00ce
            int r8 = r8 + 1
            int r11 = r11 + 1
            goto L_0x0099
        L_0x00ba:
            char r7 = r10.charAt(r8)     // Catch:{ StringIndexOutOfBoundsException -> 0x00c7 }
            char r0 = r13.charAt(r12)     // Catch:{ StringIndexOutOfBoundsException -> 0x00c7 }
            if (r7 == r0) goto L_0x00ce
            int r8 = r8 + 1
            goto L_0x00ba
        L_0x00c7:
            r1 = move-exception
            java.lang.String r0 = "registerphone/index/skip"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x00d1
        L_0x00ce:
            r0 = -2
            if (r8 != r0) goto L_0x008a
        L_0x00d1:
            r16.A37()
            return
        L_0x00d5:
            r0 = r16
            r0.A01 = r8
            int r12 = r10.length()
            int r0 = r12 + -2
            if (r8 != r0) goto L_0x01b1
            com.obwhatsapp.registration.RegisterPhone.A0d = r1
        L_0x00e3:
            r0 = r16
            android.widget.ScrollView r7 = r0.A06
            android.widget.TextView r0 = r0.A07
            int r0 = r0.getBottom()
            r7.scrollTo(r2, r0)
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r10)
            X.2nm r10 = new X.2nm
            r0 = r17
            r10.<init>(r0, r4, r3)
            r11 = 17
            r7.setSpan(r10, r2, r12, r11)
            r0 = r16
            android.widget.TextView r10 = r0.A07
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r10.setMovementMethod(r0)
            r0 = -1
            if (r8 == r0) goto L_0x011b
            r0 = -65536(0xffffffffffff0000, float:NaN)
            android.text.style.ForegroundColorSpan r10 = new android.text.style.ForegroundColorSpan
            r10.<init>(r0)
            int r0 = r8 + 1
            r7.setSpan(r10, r8, r0, r11)
        L_0x011b:
            java.lang.String r0 = r7.toString()
            java.lang.String r8 = r0.replaceAll(r9, r5)
            java.lang.String r6 = r6.replaceAll(r9, r5)
            java.lang.String r0 = "register/phone/suggested/cc/"
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r0)
            r5.append(r4)
            java.lang.String r0 = " pn="
            r5.append(r0)
            r5.append(r6)
            java.lang.String r0 = " suggest="
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = " s="
            r5.append(r0)
            r0 = r16
            java.lang.String r0 = r0.A0Q
            r5.append(r0)
            java.lang.String r0 = " disp="
            r5.append(r0)
            r5.append(r8)
            java.lang.String r0 = " same="
            r5.append(r0)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0q(r4)
            r0 = r16
            X.1G1 r0 = r0.A03
            java.lang.String r0 = X.AnonymousClass2JO.A02(r0, r4, r6)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r3)
            boolean r0 = r8.equals(r0)
            r5.append(r0)
            X.C13680ns.A1V(r5)
            r0 = r16
            r0.A0W = r1
            int r4 = r0.A00
            r3 = 31
            if (r4 != r3) goto L_0x01ac
            r3 = 32
        L_0x017f:
            r0 = r16
            r0.A00 = r3
        L_0x0183:
            r0 = r16
            android.widget.TextView r3 = r0.A07
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r3.setText(r7, r0)
            r3 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.AlphaAnimation r5 = new android.view.animation.AlphaAnimation
            r5.<init>(r3, r0)
            r3 = 150(0x96, double:7.4E-322)
            r5.setDuration(r3)
            r0 = r16
            android.widget.TextView r0 = r0.A07
            r0.startAnimation(r5)
            r0 = r16
            android.widget.TextView r0 = r0.A07
            r0.setVisibility(r2)
            r0 = r16
            r0.A0V = r1
            return
        L_0x01ac:
            r0 = 30
            if (r4 != r0) goto L_0x0183
            goto L_0x017f
        L_0x01b1:
            com.obwhatsapp.registration.RegisterPhone.A0e = r1
            goto L_0x00e3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56392nZ.onFinish():void");
    }

    public void onTick(long j2) {
    }
}
