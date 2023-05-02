package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.IOUtils;

/* renamed from: X.31j  reason: invalid class name and case insensitive filesystem */
public class C604131j extends AnonymousClass58D {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final Paint A03;
    public final AnonymousClass01V A04;
    public final AnonymousClass013 A05;
    public final C17250um A06;
    public final C17020u3 A07;
    public final CharSequence A08;
    public final List A09;

    public C604131j(Context context, Paint paint, AnonymousClass01V r3, AnonymousClass013 r4, C17250um r5, C17020u3 r6, CharSequence charSequence, List list, int i2, int i3) {
        this.A02 = context;
        this.A03 = paint;
        this.A01 = i2;
        this.A00 = i3;
        this.A08 = charSequence;
        this.A09 = list;
        this.A06 = r5;
        this.A04 = r3;
        this.A05 = r4;
        this.A07 = r6;
    }

    public static List A00(BreakIterator breakIterator, List list, int i2, int i3) {
        if (list.size() == 0) {
            return list;
        }
        ArrayList A0u = AnonymousClass000.A0u();
        int min = Math.min(list.size(), 5);
        for (int i4 = 0; i4 < min; i4++) {
            AnonymousClass01Q r1 = (AnonymousClass01Q) list.get(i4);
            Number number = (Number) r1.A00;
            AnonymousClass00B.A06(number);
            Number number2 = (Number) r1.A01;
            AnonymousClass00B.A06(number2);
            int max = Math.max(0, breakIterator.preceding(Math.max(0, number.intValue() - i2)));
            int following = breakIterator.following(Math.min(i3, number2.intValue() + i2)) - 1;
            if (following < 0) {
                following = i3;
            }
            AnonymousClass01Q r7 = new AnonymousClass01Q(Integer.valueOf(max), Integer.valueOf(following));
            if (A0u.size() != 0) {
                int size = A0u.size() - 1;
                AnonymousClass01Q r10 = (AnonymousClass01Q) A0u.get(size);
                Object obj = r7.A00;
                AnonymousClass00B.A06(obj);
                int A0D = AnonymousClass000.A0D(obj);
                Object obj2 = r7.A01;
                AnonymousClass00B.A06(obj2);
                int A0D2 = AnonymousClass000.A0D(obj2);
                Object obj3 = r10.A00;
                AnonymousClass00B.A06(obj3);
                int A0D3 = AnonymousClass000.A0D(obj3);
                Object obj4 = r10.A01;
                AnonymousClass00B.A06(obj4);
                int A0D4 = AnonymousClass000.A0D(obj4);
                if ((A0D <= A0D3 && A0D3 <= A0D2) || (A0D3 <= A0D && A0D <= A0D4)) {
                    int min2 = Math.min(A0D, A0D3);
                    int max2 = Math.max(A0D2, A0D4);
                    A0u.remove(size);
                    r7 = new AnonymousClass01Q(Integer.valueOf(min2), Integer.valueOf(max2));
                }
            }
            A0u.add(r7);
        }
        return A0u;
    }

    public /* bridge */ /* synthetic */ Object A01() {
        CharSequence charSequence = this.A08;
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        CharSequence A032 = C45922Bq.A03(this.A04, this.A07, charSequence.toString().replace(IOUtils.LINE_SEPARATOR_UNIX, " "));
        Context context = this.A02;
        List list = this.A09;
        AnonymousClass013 r12 = this.A05;
        AnonymousClass01Q A002 = AnonymousClass2TP.A00(context, r12, AnonymousClass2TP.A02, A032, list, true);
        AnonymousClass024 r9 = this.A00;
        r9.A02();
        CharSequence charSequence2 = (CharSequence) A002.A00;
        Object obj = A002.A01;
        AnonymousClass00B.A06(obj);
        List list2 = (List) obj;
        C40051tU r10 = new C40051tU(1, 460);
        if (TextUtils.isEmpty(charSequence2)) {
            return "";
        }
        if (!list2.isEmpty()) {
            Paint paint = this.A03;
            float measureText = paint.measureText(charSequence2, 0, charSequence2.length());
            float f2 = (float) (this.A00 * this.A01);
            if (measureText > f2) {
                BreakIterator A012 = C40661uU.A01(r12);
                A012.setText(charSequence2.toString());
                List A003 = A00(A012, list2, 20, charSequence2.length());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                A02(spannableStringBuilder, charSequence2, A003);
                r9.A02();
                int i2 = 10;
                while (paint.measureText(spannableStringBuilder, 0, spannableStringBuilder.length()) <= f2 && spannableStringBuilder.length() < charSequence2.length()) {
                    r9.A02();
                    spannableStringBuilder.clear();
                    A003 = A00(A012, A003, i2, charSequence2.length());
                    A02(spannableStringBuilder, charSequence2, A003);
                    r9.A02();
                    i2 += 10;
                }
                return spannableStringBuilder;
            }
        }
        return AnonymousClass2Sy.A02(context, this.A03, r10, this.A06, charSequence2);
    }

    public final void A02(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, List list) {
        long length = (long) (charSequence.length() - 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass01Q r6 = (AnonymousClass01Q) it.next();
            this.A00.A02();
            Object obj = r6.A00;
            if (!(obj == null || AnonymousClass000.A0D(obj) == 0)) {
                if (spannableStringBuilder.length() == 0) {
                    spannableStringBuilder.append(" ");
                    spannableStringBuilder.append("…");
                } else if (!"…".equals(String.valueOf(spannableStringBuilder.charAt(spannableStringBuilder.length() - 1)))) {
                    if (!Character.isWhitespace(spannableStringBuilder.charAt(spannableStringBuilder.length() - 1))) {
                        spannableStringBuilder.append(" ");
                    }
                    spannableStringBuilder.append("…");
                    spannableStringBuilder.append(" ");
                }
            }
            AnonymousClass00B.A06(obj);
            int A0D = AnonymousClass000.A0D(obj);
            Number number = (Number) r6.A01;
            AnonymousClass00B.A06(number);
            spannableStringBuilder.append(charSequence.subSequence(A0D, number.intValue()));
            if (((long) number.intValue()) < length) {
                spannableStringBuilder.append(" ");
                spannableStringBuilder.append("…");
            }
        }
    }
}
