package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Pair;
import com.obwhatsapp.IDxTSpanShape13S0200000_2_I0;
import com.obwhatsapp.R;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0uY  reason: invalid class name and case insensitive filesystem */
public class C17110uY {
    public final Context A00;
    public final C14870pt A01;
    public final C17090uW A02;
    public final AnonymousClass01V A03;
    public final C15860rz A04;
    public final C18090w8 A05;
    public final C18290wS A06;

    public C17110uY(C14870pt r2, C17090uW r3, AnonymousClass01V r4, C16980tz r5, C15860rz r6, C18090w8 r7, C18290wS r8) {
        this.A00 = r5.A00;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r6;
        this.A06 = r8;
        this.A05 = r7;
    }

    public static void A00(Spannable spannable, C18090w8 r6, C18290wS r7) {
        Pattern AEc;
        if (r6.A09() && (AEc = r7.A03().AEc()) != null) {
            Matcher matcher = AEc.matcher(spannable);
            while (matcher.find()) {
                Pair A002 = C89764cr.A00(new Pair(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end())), C89764cr.A01, spannable);
                int intValue = ((Number) A002.first).intValue();
                int intValue2 = ((Number) A002.second).intValue();
                StringBuilder sb = new StringBuilder("wapay://pay/");
                sb.append(spannable.subSequence(intValue, intValue2));
                spannable.setSpan(new URLSpan(sb.toString()), intValue, intValue2, 0);
            }
        }
    }

    public static void A01(Spannable spannable, C18090w8 r6, C18290wS r7) {
        Pattern AEg;
        if (r6.A09() && (AEg = r7.A03().AEg()) != null) {
            Matcher matcher = AEg.matcher(spannable);
            while (matcher.find()) {
                Pair A002 = C89764cr.A00(new Pair(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end())), C89764cr.A01, spannable);
                int intValue = ((Number) A002.first).intValue();
                int intValue2 = ((Number) A002.second).intValue();
                spannable.setSpan(new URLSpan(spannable.subSequence(intValue, intValue2).toString()), intValue, intValue2, 0);
            }
        }
    }

    public static void A02(Spannable spannable, String str) {
        C26071Mf A002 = C26071Mf.A00();
        Iterator it = new AnonymousClass554(C801442s.A02, A002, spannable, A002.A0F(Integer.parseInt(str))).iterator();
        while (it.hasNext()) {
            C87214Vw r0 = (C87214Vw) it.next();
            int i2 = r0.A00;
            Pair pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i2 + r0.A02.length()));
            if (!C89764cr.A01(pair, spannable)) {
                pair = C89764cr.A00(pair, C89764cr.A02, spannable);
                if (!C89764cr.A01(pair, spannable)) {
                }
            }
            StringBuilder sb = new StringBuilder("tel:");
            sb.append(spannable.subSequence(((Number) pair.first).intValue(), ((Number) pair.second).intValue()));
            spannable.setSpan(new URLSpan(sb.toString()), ((Number) pair.first).intValue(), ((Number) pair.second).intValue(), 33);
        }
    }

    public static void A03(C42821yj r2, C17110uY r3, Runnable runnable, String str, String str2) {
        r2.A18.setText(r3.A06(runnable, str, str2));
        r2.A18.setMovementMethod(new AnonymousClass3MF());
    }

    public SpannableString A04(String str) {
        SpannableString spannableString = new SpannableString(AnonymousClass1ZW.A01(str, new Object[0]));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                int spanFlags = spannableString.getSpanFlags(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                spannableString.setSpan(new AnonymousClass3MS(this.A00, uRLSpan.getURL()), spanStart, spanEnd, spanFlags);
            }
        }
        return spannableString;
    }

    public SpannableString A05(String str, Runnable[] runnableArr, String[] strArr, String[] strArr2) {
        SpannableString spannableString = new SpannableString(AnonymousClass1ZW.A01(str, new Object[0]));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            int i2 = 0;
            for (URLSpan uRLSpan : uRLSpanArr) {
                if (strArr[i2].equals(uRLSpan.getURL())) {
                    int spanStart = spannableString.getSpanStart(uRLSpan);
                    int spanEnd = spannableString.getSpanEnd(uRLSpan);
                    int spanFlags = spannableString.getSpanFlags(uRLSpan);
                    spannableString.removeSpan(uRLSpan);
                    C59142uk r10 = new C59142uk(this.A00, this.A02, this.A01, this.A03, strArr2[i2]);
                    r10.A02 = new C99934up(runnableArr, i2);
                    spannableString.setSpan(r10, spanStart, spanEnd, spanFlags);
                }
                i2++;
            }
        }
        return spannableString;
    }

    public SpannableStringBuilder A06(Runnable runnable, String str, String str2) {
        return A07(runnable, str, str2, R.color.start);
    }

    public SpannableStringBuilder A07(Runnable runnable, String str, String str2, int i2) {
        Spanned A012 = AnonymousClass1ZW.A01(str, new Object[0]);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A012);
        URLSpan[] uRLSpanArr = (URLSpan[]) A012.getSpans(0, A012.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if (str2.equals(uRLSpan.getURL())) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new IDxTSpanShape13S0200000_2_I0(this.A00, this, runnable, i2), spanStart, spanEnd, spanFlags);
                }
            }
        }
        return spannableStringBuilder;
    }

    public void A08(Spannable spannable) {
        try {
            Linkify.addLinks(spannable, 10);
            C30931dC.A06(spannable);
            A02(spannable, this.A04.A0O());
            C18290wS r1 = this.A06;
            C18090w8 r0 = this.A05;
            A00(spannable, r0, r1);
            A01(spannable, r0, r1);
        } catch (Exception unused) {
        }
        List<URLSpan> A052 = C45922Bq.A05(spannable);
        if (A052 != null && !A052.isEmpty()) {
            for (URLSpan uRLSpan : A052) {
                String url = uRLSpan.getURL();
                spannable.setSpan(new C59142uk(this.A00, this.A02, this.A01, this.A03, url), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
            }
            for (Object removeSpan : A052) {
                spannable.removeSpan(removeSpan);
            }
        }
    }

    public void A09(Spannable spannable, String str) {
        try {
            Linkify.addLinks(spannable, 2);
            C30931dC.A06(spannable);
            A02(spannable, str);
            C18290wS r1 = this.A06;
            C18090w8 r0 = this.A05;
            A00(spannable, r0, r1);
            A01(spannable, r0, r1);
            Matcher matcher = C818249w.A00.matcher(spannable);
            if (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                spannable.setSpan(new URLSpan(spannable.subSequence(start, end).toString()), start, end, 0);
            }
        } catch (Exception unused) {
        }
    }
}
