package X;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape28S0200000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.2JN  reason: invalid class name */
public class AnonymousClass2JN {
    public static String A00 = "";

    public static int A00(EditText editText) {
        if (!editText.isFocused()) {
            return -1;
        }
        String obj = editText.getText().toString();
        int i2 = 0;
        int i3 = 0;
        while (i2 < editText.getSelectionEnd() && i2 <= obj.length()) {
            if (obj.charAt(i2) <= '9' && obj.charAt(i2) >= '0') {
                i3++;
            }
            i2++;
        }
        return i3;
    }

    public static int A01(String str, String str2) {
        int length;
        int length2;
        if (str == null || str2 == null || (length = str.length()) < 6 || (length2 = str2.length()) < 6) {
            return -1;
        }
        int i2 = length - 6;
        int i3 = length2 - 6;
        int i4 = 0;
        int i5 = 0;
        do {
            if (str.charAt(i2 + i4) != str2.charAt(i3 + i4)) {
                i5++;
            }
            i4++;
        } while (i4 < 6);
        return i5;
    }

    public static long A02(String str, long j2) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e2) {
                Log.w((Throwable) e2);
            }
        }
        return j2;
    }

    public static Dialog A03(C14550pN r5, AnonymousClass1KO r6, C18260wP r7, AnonymousClass01V r8, C16260sj r9, AnonymousClass15W r10, AnonymousClass1KP r11, C16320sq r12) {
        Log.i("registrationutils/dialog/cant-connect");
        C32241fu r3 = new C32241fu(r5);
        r3.A06(r5.getString(R.string.str13ad));
        r3.A09(new C91454fw(r5, r6, r7, r8, r9, r10, r11, r12), r5.getString(R.string.str0452));
        r3.A08(new IDxCListenerShape127S0100000_2_I0(r5, 98), r5.getString(R.string.str0394));
        r3.A03(new C91204fX());
        return r3.create();
    }

    public static Dialog A04(C14550pN r14, AnonymousClass1KO r15, AnonymousClass013 r16, AnonymousClass15W r17, Runnable runnable, String str, String str2) {
        boolean z2 = false;
        Runnable runnable2 = runnable;
        if (runnable != null) {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder("registrationutils/dialog/ban cancelable=");
        sb.append(z2);
        Log.w(sb.toString());
        String str3 = str;
        String str4 = str2;
        String A0H = r16.A0H(A0E(str3, str4));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A0H);
        sb2.append("\n\n");
        sb2.append(r14.getString(R.string.str13b1));
        SpannableString spannableString = new SpannableString(sb2.toString());
        spannableString.setSpan(new StyleSpan(1), 0, A0H.length() + 2, 33);
        C32241fu r3 = new C32241fu(r14);
        r3.A06(spannableString);
        r3.A07(z2);
        r3.A08(new IDxCListenerShape28S0200000_2_I0(r14, 11, runnable2), r14.getString(R.string.str0394));
        r3.A09(new C91424ft(r14, r15, r17, runnable2, str3, str4), r14.getString(R.string.str13cb));
        return r3.create();
    }

    public static Dialog A05(C14550pN r5, AnonymousClass1KO r6, AnonymousClass15W r7, String str, String str2) {
        Log.w("registrationutils/dialog/underage-ban cancelable=");
        C32241fu r3 = new C32241fu(r5);
        r3.setTitle(r5.getString(R.string.str1885));
        r3.A06(r5.getString(R.string.str1884));
        r3.A07(false);
        r3.A09(new IDxCListenerShape127S0100000_2_I0(r5, 97), r5.getString(R.string.str0394));
        String string = r5.getString(R.string.str1377);
        C91394fq r4 = new C91394fq(r5, r6, r7, str, str2);
        CharSequence A0A = r3.A0A(string);
        AnonymousClass0PG r0 = r3.A01;
        r0.A0G = A0A;
        r0.A04 = r4;
        return r3.create();
    }

    public static Dialog A06(C14550pN r7, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        View inflate = LayoutInflater.from(r7).inflate(R.layout.layout03ed, (ViewGroup) null);
        C32241fu r3 = new C32241fu(r7);
        r3.A01(R.string.str13b2);
        r3.setView(inflate);
        r3.A07(false);
        TextView textView = (TextView) C004601z.A0E(inflate, R.id.button3);
        TextView textView2 = (TextView) C004601z.A0E(inflate, R.id.button1);
        TextView textView3 = (TextView) C004601z.A0E(inflate, R.id.button2);
        textView.setVisibility(0);
        textView.setText(R.string.str0394);
        textView.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(r7, 46, runnable));
        textView3.setVisibility(0);
        textView3.setText(R.string.str1c4c);
        int A002 = AnonymousClass00T.A00(r7, R.color.color0697);
        textView3.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(r7, 48, runnable3));
        textView2.setVisibility(0);
        textView2.setText(R.string.str0895);
        textView2.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(r7, 49, runnable2));
        return r3.create();
    }

    public static SpannableStringBuilder A07(TextAppearanceSpan textAppearanceSpan, String str, Map map, int i2) {
        Spanned A01 = AnonymousClass1ZW.A01(str, new Object[0]);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A01);
        URLSpan[] uRLSpanArr = (URLSpan[]) A01.getSpans(0, A01.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if (map.containsKey(uRLSpan.getURL())) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new C70423ge(uRLSpan, map, i2), spanStart, spanEnd, spanFlags);
                    if (textAppearanceSpan != null) {
                        spannableStringBuilder.setSpan(textAppearanceSpan, spanStart, spanEnd, spanFlags);
                    }
                }
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder A08(Runnable runnable, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, runnable);
        return A07((TextAppearanceSpan) null, str, hashMap, 0);
    }

    public static C005702l A09(Context context) {
        Log.i("RegistrationUtils/showVerificationCompleteDialog");
        if (C19980zJ.A00(context).isFinishing()) {
            return null;
        }
        View inflate = View.inflate(context, R.layout.layout022f, (ViewGroup) null);
        C32241fu r0 = new C32241fu(context);
        r0.setView(inflate);
        return r0.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r12.A03 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C005702l A0A(X.C19980zJ r16, X.C14550pN r17, X.C14870pt r18, X.AnonymousClass1KO r19, X.AnonymousClass013 r20, X.AnonymousClass15W r21, X.C31621el r22, java.lang.Runnable r23, java.lang.String r24, java.lang.String r25) {
        /*
            r9 = 0
            r12 = r22
            if (r22 == 0) goto L_0x00ea
            java.lang.String r0 = r12.A02
        L_0x0007:
            int r7 = X.AnonymousClass47M.A00(r0)
            r10 = 1
            r1 = 0
            if (r22 == 0) goto L_0x0014
            boolean r0 = r12.A03
            r11 = 1
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r11 = 0
        L_0x0015:
            r8 = 0
            r6 = r23
            if (r23 == 0) goto L_0x001b
            r8 = 1
        L_0x001b:
            java.lang.String r2 = "registrationutils/dialog/ban cancelable="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r5 = r24
            r4 = r25
            java.lang.String r0 = A0E(r5, r4)
            r13 = r20
            java.lang.String r2 = r13.A0H(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r0 = "\n\n"
            r3.append(r0)
            r15 = r17
            java.lang.String r0 = r15.getString(r7)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r0)
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r10)
            int r0 = r2.length()
            int r2 = r0 + 2
            r0 = 33
            r7.setSpan(r3, r1, r2, r0)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r15)
            r0 = 2131559405(0x7f0d03ed, float:1.8744153E38)
            android.view.View r2 = r2.inflate(r0, r9)
            X.1fu r3 = new X.1fu
            r3.<init>(r15)
            r3.A06(r7)
            r3.setView(r2)
            r3.A07(r8)
            r0 = 2131362438(0x7f0a0286, float:1.8344657E38)
            android.view.View r8 = X.C004601z.A0E(r2, r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 2131362436(0x7f0a0284, float:1.8344653E38)
            android.view.View r7 = X.C004601z.A0E(r2, r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 2131362437(0x7f0a0285, float:1.8344655E38)
            android.view.View r2 = X.C004601z.A0E(r2, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r8.setVisibility(r1)
            r0 = 2131886996(0x7f120394, float:1.9408587E38)
            r8.setText(r0)
            r7.setVisibility(r1)
            r0 = 2131891146(0x7f1213ca, float:1.9417004E38)
            r7.setText(r0)
            r2.setVisibility(r1)
            r0 = 2131891147(0x7f1213cb, float:1.9417006E38)
            if (r11 == 0) goto L_0x00ba
            r0 = 2131893307(0x7f121c3b, float:1.9421387E38)
        L_0x00ba:
            r2.setText(r0)
            r1 = 45
            com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0
            r0.<init>(r15, r1, r6)
            r8.setOnClickListener(r0)
            r17 = 2
            com.facebook.redex.ViewOnClickCListenerShape1S0500000_I0 r11 = new com.facebook.redex.ViewOnClickCListenerShape1S0500000_I0
            r14 = r16
            r16 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r7.setOnClickListener(r11)
            X.4kG r7 = new X.4kG
            r9 = r19
            r10 = r21
            r8 = r15
            r11 = r6
            r12 = r5
            r13 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r2.setOnClickListener(r7)
            X.02l r0 = r3.create()
            return r0
        L_0x00ea:
            r0 = r9
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JN.A0A(X.0zJ, X.0pN, X.0pt, X.1KO, X.013, X.15W, X.1el, java.lang.Runnable, java.lang.String, java.lang.String):X.02l");
    }

    public static String A0B(AnonymousClass1G1 r3, String str, String str2) {
        String str3;
        String replaceAll = str2.replaceAll("\\D", "");
        try {
            str3 = r3.A02(Integer.parseInt(str), replaceAll);
        } catch (IOException e2) {
            Log.e("verify/number/trim/error", e2);
            str3 = null;
        }
        return str3 != null ? A0E(str, replaceAll.substring(str.length())) : replaceAll;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r5.equals(r4) != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A0C(X.AnonymousClass1G1 r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r8 = 0
            if (r0 != 0) goto L_0x0059
            int r1 = r12.length()
            int r0 = r11.length()
            if (r1 < r0) goto L_0x0059
            java.lang.String r1 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r5 = r12.replaceAll(r1, r0)
            java.lang.String r1 = r10.replaceAll(r1, r0)
            java.lang.String r6 = X.AnonymousClass2JO.A02(r9, r11, r1)
            java.lang.String r4 = X.AnonymousClass2JO.A02(r9, r11, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r6)
            java.lang.String r7 = r0.toString()
            int r0 = A01(r6, r4)
            if (r0 != 0) goto L_0x005a
            boolean r0 = r4.equals(r6)
            if (r0 != 0) goto L_0x0059
            boolean r0 = r4.equals(r7)
            if (r0 != 0) goto L_0x0059
            boolean r0 = X.AnonymousClass2JO.A04(r5, r6, r4, r11)
            if (r0 != 0) goto L_0x0059
            boolean r0 = r1.endsWith(r4)
            if (r0 == 0) goto L_0x005a
            int r1 = X.AnonymousClass2JO.A00(r9, r11, r4)
            r0 = 5
            if (r1 != r0) goto L_0x005a
        L_0x0059:
            return r8
        L_0x005a:
            r3 = 1
            r2 = 0
            if (r4 == 0) goto L_0x0065
            boolean r0 = r5.equals(r4)
            r1 = 1
            if (r0 == 0) goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            boolean r0 = A0L(r9, r5, r11, r7, r3)
            if (r0 == 0) goto L_0x006d
            return r5
        L_0x006d:
            if (r1 == 0) goto L_0x0076
            boolean r0 = A0L(r9, r4, r11, r7, r3)
            if (r0 == 0) goto L_0x0076
            return r4
        L_0x0076:
            boolean r0 = A0L(r9, r5, r11, r6, r2)
            if (r0 == 0) goto L_0x008c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r5)
        L_0x0087:
            java.lang.String r0 = r0.toString()
            return r0
        L_0x008c:
            if (r1 == 0) goto L_0x0059
            boolean r0 = A0L(r9, r4, r11, r6, r2)
            if (r0 == 0) goto L_0x0059
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r4)
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JN.A0C(X.1G1, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String A0D(C14530pL r7, AnonymousClass013 r8, String str, int i2, long j2) {
        if (j2 > 3600000) {
            int ceil = (int) Math.ceil(((double) j2) / 3600000.0d);
            return r7.getResources().getQuantityString(i2, ceil, new Object[]{Integer.valueOf(ceil)});
        }
        return String.format(AnonymousClass013.A00(r8.A00), "%s%s%s", new Object[]{str, "  ", C28961Zl.A04(r8, j2 / 1000)});
    }

    public static String A0E(String str, String str2) {
        if (str == null || str2 == null) {
            Log.e("verifynumber/prettyprint/cc-or-phnum-is-null");
            return null;
        }
        StringBuilder sb = new StringBuilder("+");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        String obj = sb.toString();
        C26071Mf A002 = C26071Mf.A00();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("+");
            sb2.append(str);
            sb2.append(str2);
            return A002.A0G(C796640u.INTERNATIONAL, A002.A0E(sb2.toString(), "ZZ"));
        } catch (Exception e2) {
            Log.e("verifynumber/formatter-exception", e2);
            return obj;
        } catch (ExceptionInInitializerError e3) {
            Log.e("verifynumber/formatter-init-exception", e3);
            return obj;
        }
    }

    public static void A0F(Context context, C19380yL r10, int i2) {
        Log.i("registrationutils/notify/unverified");
        long currentTimeMillis = System.currentTimeMillis();
        String string = context.getString(R.string.str164e, new Object[]{context.getString(R.string.str1cf7)});
        String string2 = context.getString(R.string.str1652);
        String string3 = context.getString(R.string.str1650);
        Intent intent = new Intent(context, context.getClass());
        if (i2 != -1) {
            intent.putExtra("com.obwhatsapp.verifynumber.dialog", i2);
        }
        intent.addFlags(536870912);
        PendingIntent A002 = C42341xd.A00(context, 0, intent, 134217728);
        C007503l A003 = C218415q.A00(context);
        A003.A0J = "critical_app_alerts@1";
        A003.A0B(string);
        A003.A05(currentTimeMillis);
        A003.A02(3);
        A003.A0D(true);
        A003.A0A(string2);
        A003.A09(string3);
        A003.A09 = A002;
        A003.A07.icon = yo.getNIcon(R.drawable.notifybar);
        r10.A02(1, A003.A01());
    }

    public static void A0G(Context context, C19380yL r10, C19760yx r11, boolean z2) {
        Intent A05;
        Log.i("registrationutils/notify/verified");
        long currentTimeMillis = System.currentTimeMillis();
        String string = context.getString(R.string.str164f, new Object[]{context.getString(R.string.str1cf7)});
        String string2 = context.getString(R.string.str1653);
        String string3 = context.getString(R.string.str1651);
        if (z2) {
            A05 = C14750ph.A04(context);
        } else {
            A05 = C14750ph.A05(context);
            r11.A0A(2);
        }
        PendingIntent A002 = C42341xd.A00(context, 1, A05, 0);
        C007503l A003 = C218415q.A00(context);
        A003.A0J = "other_notifications@1";
        A003.A0B(string);
        A003.A05(currentTimeMillis);
        A003.A02(3);
        A003.A0D(true);
        A003.A0A(string2);
        A003.A09(string3);
        A003.A09 = A002;
        A003.A07.icon = yo.getNIcon(R.drawable.notifybar);
        r10.A02(1, A003.A01());
    }

    public static void A0H(View view, C14550pN r4, AnonymousClass013 r5, boolean z2, boolean z3) {
        Toolbar toolbar = (Toolbar) C004601z.A0E(view, R.id.title_toolbar);
        r4.Aem(toolbar);
        C005402i x2 = r4.x();
        if (x2 != null) {
            x2.A0N(z2);
            x2.A0Q(false);
        }
        if (z3) {
            toolbar.setNavigationIcon((Drawable) new C447725m(AnonymousClass2SR.A06(r4.getResources().getDrawable(R.drawable.ic_back), r4.getResources().getColor(R.color.color04ef)), r5));
            toolbar.setNavigationOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(r4, 46));
            toolbar.setNavigationContentDescription((int) R.string.str014a);
        }
    }

    public static void A0I(EditText editText, int i2) {
        int length = editText.getText().length();
        if (i2 <= -1 || i2 > length) {
            if (i2 > length) {
                editText.requestFocus();
            }
            editText.setSelection(length);
            return;
        }
        editText.requestFocus();
        String obj = editText.getText().toString();
        int i3 = 0;
        for (int i4 = 0; i4 < obj.length() && i2 > 0; i4++) {
            if (obj.charAt(i4) <= '9' && obj.charAt(i4) >= '0') {
                i2--;
            }
            i3++;
        }
        editText.setSelection(i3);
    }

    public static void A0J(C14550pN r5, int i2) {
        C54932iV r4 = new C54932iV(r5);
        r4.A01 = R.drawable.permission_sms;
        r4.A0K = new String[]{"android.permission.RECEIVE_SMS"};
        r4.A06 = R.string.str11f2;
        r4.A0D = true;
        r5.Ag3(r4.A00(), i2);
    }

    public static void A0K(C15860rz r1, String str) {
        A00 = str;
        r1.A0K().putString("registration_failure_reason", str).apply();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0L(X.AnonymousClass1G1 r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r7 = 0
            if (r0 != 0) goto L_0x0057
            int r1 = r9.length()
            int r4 = r10.length()
            if (r1 < r4) goto L_0x0057
            r3 = 1
            int r6 = r11.length()
            int r0 = r6 - r1
            int r0 = java.lang.Math.abs(r0)
            r5 = 0
            if (r0 != r3) goto L_0x005e
            r2 = r9
            if (r6 >= r1) goto L_0x0023
            r2 = r11
        L_0x0023:
            boolean r0 = r2.equals(r11)
            if (r0 == 0) goto L_0x002a
            r11 = r9
        L_0x002a:
            int r0 = r2.length()
            if (r5 >= r0) goto L_0x007e
            char r1 = r2.charAt(r5)
            char r0 = r11.charAt(r5)
            if (r1 == r0) goto L_0x005b
            int r0 = r5 + 1
            java.lang.String r1 = r11.substring(r0)
            java.lang.String r0 = r2.substring(r5)
        L_0x0044:
            boolean r0 = r1.equals(r0)
        L_0x0048:
            if (r12 == 0) goto L_0x0058
            if (r0 == 0) goto L_0x0057
            java.lang.String r9 = r9.substring(r4)
        L_0x0050:
            int r0 = X.AnonymousClass2JO.A00(r8, r10, r9)
            if (r0 != r3) goto L_0x0057
            r7 = 1
        L_0x0057:
            return r7
        L_0x0058:
            if (r0 == 0) goto L_0x0057
            goto L_0x0050
        L_0x005b:
            int r5 = r5 + 1
            goto L_0x002a
        L_0x005e:
            if (r0 != 0) goto L_0x0080
            r2 = 0
        L_0x0061:
            if (r2 >= r6) goto L_0x0080
            char r1 = r11.charAt(r2)
            char r0 = r9.charAt(r2)
            if (r1 == r0) goto L_0x007b
            int r6 = r6 - r3
            if (r2 == r6) goto L_0x007e
            int r0 = r2 + 1
            java.lang.String r1 = r11.substring(r0)
            java.lang.String r0 = r9.substring(r0)
            goto L_0x0044
        L_0x007b:
            int r2 = r2 + 1
            goto L_0x0061
        L_0x007e:
            r0 = 1
            goto L_0x0048
        L_0x0080:
            r0 = 0
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JN.A0L(X.1G1, java.lang.String, java.lang.String, java.lang.String, boolean):boolean");
    }

    public static byte[] A0M(String str) {
        try {
            UUID fromString = UUID.fromString(str);
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putLong(fromString.getMostSignificantBits());
            allocate.putLong(fromString.getLeastSignificantBits());
            return allocate.array();
        } catch (IllegalArgumentException unused) {
            StringBuilder sb = new StringBuilder("RegistrationUtils/getBytesFromUUIDString/invalid-input ");
            sb.append(str);
            Log.e(sb.toString());
            return new byte[0];
        }
    }
}
