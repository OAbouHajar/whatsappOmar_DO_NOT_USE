package X;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TypefaceSpan;
import com.obwhatsapp.R;

/* renamed from: X.2eU  reason: invalid class name and case insensitive filesystem */
public class C52812eU {
    public static final TypefaceSpan A02 = new TypefaceSpan("monospace");
    public final C16980tz A00;
    public final AnonymousClass013 A01;

    public C52812eU(C16980tz r1, AnonymousClass013 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public Spanned A00(long j2, long j3) {
        String A022;
        Spannable[] spannableArr;
        SpannableString spannableString;
        char c2;
        C16980tz r1;
        int i2;
        SpannableString spannableString2 = new SpannableString(this.A01.A0L().format(((double) j2) / 100.0d));
        spannableString2.setSpan(A02, 0, spannableString2.length(), 33);
        if (j3 < 60000) {
            spannableString = new SpannableString(String.valueOf(j3 / 1000));
            r1 = this.A00;
            i2 = R.string.str0872;
        } else if (j3 < 3600000) {
            spannableString = new SpannableString(String.valueOf(j3 / 60000));
            r1 = this.A00;
            i2 = R.string.str0871;
        } else if (j3 < 43200000) {
            SpannableString spannableString3 = new SpannableString(String.valueOf(j3 / 3600000));
            spannableString = new SpannableString(String.valueOf((j3 % 3600000) / 60000));
            A022 = this.A00.A02(R.string.str0870);
            spannableArr = new Spannable[3];
            spannableArr[0] = spannableString2;
            spannableArr[1] = spannableString3;
            c2 = 2;
            spannableArr[c2] = spannableString;
            return C45922Bq.A02(A022, spannableArr);
        } else {
            A022 = this.A00.A02(R.string.str086f);
            spannableArr = new Spannable[]{spannableString2};
            return C45922Bq.A02(A022, spannableArr);
        }
        A022 = r1.A02(i2);
        spannableArr = new Spannable[2];
        spannableArr[0] = spannableString2;
        c2 = 1;
        spannableArr[c2] = spannableString;
        return C45922Bq.A02(A022, spannableArr);
    }
}
