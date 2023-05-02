package com.obwhatsapp.conversation.conversationrow.googlesearch;

import X.AnonymousClass00B;
import X.C001000l;
import X.C005702l;
import X.C13690nt;
import X.C14550pN;
import X.C14870pt;
import X.C15900s5;
import X.C15910s6;
import X.C16320sq;
import X.C16490t9;
import X.C16740tZ;
import X.C17130ua;
import X.C19980zJ;
import X.C30581cc;
import X.C32241fu;
import X.C38681rF;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.obwhatsapp.R;

public class GoogleSearchDialogFragment extends Hilt_GoogleSearchDialogFragment {
    public C19980zJ A00;
    public C14870pt A01;
    public C15900s5 A02;
    public C17130ua A03;
    public C16490t9 A04;
    public C16320sq A05;

    public static void A01(C14550pN r4, C15900s5 r5, C16740tZ r6) {
        if (!(r6 instanceof C38681rF) && (r6 instanceof C30581cc) && r5.A05(C15910s6.A0v)) {
            String A0I = r6.A0I();
            Bundle A0D = C13690nt.A0D();
            A0D.putInt("search_query_type", 0);
            A0D.putString("search_query_text", A0I);
            GoogleSearchDialogFragment googleSearchDialogFragment = new GoogleSearchDialogFragment();
            googleSearchDialogFragment.A0T(A0D);
            r4.Afc(googleSearchDialogFragment);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f1, code lost:
        if (r3 == null) goto L_0x00f3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A02(com.obwhatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment r10, int r11) {
        /*
            r0 = -1
            if (r11 != r0) goto L_0x001a
            android.os.Bundle r2 = r10.A04()
            X.00l r1 = r10.A0D()
            boolean r0 = r1 instanceof X.C14550pN
            if (r0 == 0) goto L_0x001b
            X.0pN r1 = (X.C14550pN) r1
            r0 = 2131891002(0x7f12133a, float:1.9416712E38)
            boolean r0 = r1.A2l(r0)
            if (r0 == 0) goto L_0x0020
        L_0x001a:
            return
        L_0x001b:
            java.lang.String r0 = "GoogleSearchDialogFragment does not have a DialogActivity as a host"
            X.AnonymousClass00B.A08(r0)
        L_0x0020:
            java.lang.String r0 = "search_query_type"
            int r1 = r2.getInt(r0)
            if (r1 == 0) goto L_0x0061
            r0 = 1
            if (r1 != r0) goto L_0x001a
            android.os.Bundle r1 = r10.A04()
            java.lang.String r0 = "image_file"
            java.lang.String r1 = r1.getString(r0)
            X.00l r2 = r10.A0C()
            if (r2 == 0) goto L_0x001a
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x001a
            boolean r0 = r2 instanceof X.C14550pN
            if (r0 == 0) goto L_0x005d
            X.0sq r0 = r10.A05
            X.0pt r3 = r10.A01
            X.0ua r4 = r10.A03
            X.0t9 r5 = r10.A04
            X.0pN r2 = (X.C14550pN) r2
            java.io.File r6 = X.C13700nu.A0D(r1)
            X.36u r1 = new X.36u
            r1.<init>(r2, r3, r4, r5, r6)
            X.C13680ns.A1U(r1, r0)
            return
        L_0x005d:
            java.lang.String r0 = "GoogleSearchDialogFragment does not have a DialogActivity as a host"
            goto L_0x00f5
        L_0x0061:
            android.os.Bundle r1 = r10.A04()
            java.lang.String r0 = "search_query_text"
            java.lang.String r3 = r1.getString(r0)
            java.lang.String r2 = "wa"
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "https"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = "www.google.com"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "search"
            android.net.Uri$Builder r1 = r1.path(r0)
            java.lang.String r0 = "ctx"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r0, r2)
            java.lang.String r0 = X.C13700nu.A0G(r6)
            byte[] r0 = r0.getBytes()
            int r0 = r0.length
            int r0 = 2000 - r0
            int r9 = r0 + -3
            java.nio.charset.Charset r7 = X.AnonymousClass01S.A0A
            java.nio.ByteBuffer r0 = r7.encode(r3)
            byte[] r8 = r0.array()
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ UnsupportedEncodingException -> 0x00eb }
            java.lang.String r2 = java.net.URLEncoder.encode(r3, r0)     // Catch:{ UnsupportedEncodingException -> 0x00eb }
            java.lang.String r1 = "+"
            java.lang.String r0 = "%20"
            java.lang.String r5 = r2.replace(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x00eb }
            byte[] r0 = r5.getBytes()     // Catch:{ UnsupportedEncodingException -> 0x00eb }
            int r0 = r0.length     // Catch:{ UnsupportedEncodingException -> 0x00eb }
            if (r0 <= r9) goto L_0x00f1
            r4 = 0
            r3 = 0
            r2 = 0
        L_0x00bd:
            if (r3 >= r9) goto L_0x00d4
            int r0 = r8.length     // Catch:{ UnsupportedEncodingException -> 0x00eb }
            if (r2 >= r0) goto L_0x00d4
            char r1 = r5.charAt(r3)     // Catch:{ UnsupportedEncodingException -> 0x00eb }
            r0 = 37
            if (r1 != r0) goto L_0x00cd
            int r3 = r3 + 3
            goto L_0x00cf
        L_0x00cd:
            int r3 = r3 + 1
        L_0x00cf:
            if (r3 > r9) goto L_0x00d4
            int r2 = r2 + 1
            goto L_0x00bd
        L_0x00d4:
            byte r0 = r8[r2]     // Catch:{ UnsupportedEncodingException -> 0x00eb }
            r1 = r0 & 192(0xc0, float:2.69E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 != r0) goto L_0x00e1
            if (r2 <= 0) goto L_0x00e1
            int r2 = r2 + -1
            goto L_0x00d4
        L_0x00e1:
            byte[] r0 = java.util.Arrays.copyOfRange(r8, r4, r2)     // Catch:{ UnsupportedEncodingException -> 0x00eb }
            java.lang.String r3 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00eb }
            r3.<init>(r0, r7)     // Catch:{ UnsupportedEncodingException -> 0x00eb }
            goto L_0x00f9
        L_0x00eb:
            java.lang.String r0 = "UrlUtils/truncateParameterForPercentEncoding UTF-8 encoding not supported"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00f3
        L_0x00f1:
            if (r3 != 0) goto L_0x00f9
        L_0x00f3:
            java.lang.String r0 = "Failed to encode URI in UTF-8, this should not happen"
        L_0x00f5:
            X.AnonymousClass00B.A08(r0)
            return
        L_0x00f9:
            java.lang.String r0 = "q"
            android.net.Uri$Builder r0 = r6.appendQueryParameter(r0, r3)
            android.net.Uri r0 = r0.build()
            if (r0 == 0) goto L_0x00f3
            android.content.Intent r3 = X.C13690nt.A0B(r0)
            X.00l r2 = r10.A0C()
            if (r2 == 0) goto L_0x001a
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x001a
            X.0t9 r1 = r10.A04
            X.3q0 r0 = new X.3q0
            r0.<init>()
            r1.A06(r0)
            X.0zJ r0 = r10.A00
            r0.A06(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment.A02(com.obwhatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment, int):void");
    }

    public void A16(Context context) {
        super.A16(context);
        if (!(C19980zJ.A00(context) instanceof C14550pN)) {
            AnonymousClass00B.A08("GoogleSearchDialogFragment does not have a DialogActivity as a host");
        }
    }

    public Dialog A1B(Bundle bundle) {
        C001000l A0D = A0D();
        IDxCListenerShape128S0100000_2_I1 iDxCListenerShape128S0100000_2_I1 = new IDxCListenerShape128S0100000_2_I1(this, 47);
        C32241fu A002 = C32241fu.A00(A0D);
        A002.setPositiveButton(R.string.str0098, iDxCListenerShape128S0100000_2_I1);
        C13690nt.A1E(A002);
        A002.A01(R.string.str1339);
        C005702l create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
