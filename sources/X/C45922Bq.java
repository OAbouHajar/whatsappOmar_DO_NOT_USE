package X;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.text.Editable;
import android.text.Html;
import android.text.ParcelableSpan;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import com.facebook.redex.IDxComparatorShape183S0100000_2_I0;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Bq  reason: invalid class name and case insensitive filesystem */
public class C45922Bq {
    public static Spannable A00(Context context, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new AnonymousClass3MR(context), 0, str.length(), 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder A01(String str, Map map) {
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                Object obj = map.get(uRLSpan.getURL());
                if (obj != null) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder A02(String str, Spannable... spannableArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i2 = 0;
        while (i2 < spannableArr.length) {
            StringBuilder sb = new StringBuilder("%");
            int i3 = i2 + 1;
            sb.append(i3);
            sb.append("$s");
            String obj = sb.toString();
            int indexOf = spannableStringBuilder.toString().indexOf(obj);
            if (indexOf != -1) {
                spannableStringBuilder.replace(indexOf, obj.length() + indexOf, spannableArr[i2]);
            } else {
                StringBuilder sb2 = new StringBuilder("RichTextUtils/formatSpannableString: skipping placeholder of index ");
                sb2.append(i3);
                sb2.append(" as we cannot find it in template: ");
                sb2.append(str);
                Log.e(sb2.toString());
            }
            i2 = i3;
        }
        return spannableStringBuilder;
    }

    public static CharSequence A03(AnonymousClass01V r2, C17020u3 r3, CharSequence charSequence) {
        return A04(r2, r3, charSequence, -16777216, false);
    }

    public static CharSequence A04(AnonymousClass01V r13, C17020u3 r14, CharSequence charSequence, int i2, boolean z2) {
        int i3;
        int i4;
        int i5;
        ParcelableSpan styleSpan;
        int codePointAt;
        if (charSequence == null) {
            return null;
        }
        int i6 = 1024;
        if (C42971z5.A01(r13, r14) < 2011) {
            i6 = 512;
        }
        ArrayList arrayList = new ArrayList();
        int length = charSequence.length();
        int[] iArr = null;
        int i7 = 0;
        char c2 = ' ';
        char c3 = ' ';
        int i8 = -1;
        int i9 = -1;
        while (i7 < length) {
            char charAt = charSequence.charAt(i7);
            if (charAt == '*' && i7 < length - 1 && ((codePointAt = Character.codePointAt(charSequence, i7 + 1)) == 8419 || codePointAt == 65039)) {
                charAt = ' ';
            } else if (charAt == '*' || charAt == '_' || charAt == '~') {
                if (iArr == null) {
                    iArr = new int[3];
                    Arrays.fill(iArr, -1);
                }
                if (charAt == '*') {
                    i3 = 0;
                } else {
                    i3 = 2;
                    if (charAt == '_') {
                        i3 = 1;
                    }
                }
                if (iArr[i3] < 0 && c2 != charAt && (Character.isWhitespace(c2) || c2 == '_' || c2 == '~' || c2 == '*' || c2 == '.' || c2 == ',' || c2 == ':' || c2 == ';')) {
                    i4 = i7 + 1;
                    if (i4 < length) {
                        if (Character.isWhitespace(charSequence.charAt(i4))) {
                        }
                    }
                } else if (iArr[i3] >= 0 && !Character.isWhitespace(c2) && (i7 == length - 1 || !Character.isLetterOrDigit(Character.codePointAt(charSequence, i7 + 1)))) {
                    int i10 = iArr[i3];
                    if (i10 < i7) {
                        if (charAt == '*') {
                            i5 = 1;
                            styleSpan = new StyleSpan(i5);
                        } else if (charAt != '_') {
                            styleSpan = charAt != '~' ? null : new StrikethroughSpan();
                        } else {
                            i5 = 2;
                            styleSpan = new StyleSpan(i5);
                        }
                        arrayList.add(new C84894Mh(styleSpan, i10, i7, 1));
                        if (arrayList.size() >= i6) {
                            break;
                        }
                    }
                    for (int i11 = 0; i11 < iArr.length; i11++) {
                        if (i11 != i3 && iArr[i3] < iArr[i11]) {
                            iArr[i11] = -1;
                        }
                    }
                    i4 = -1;
                    if (iArr[i3] < i9) {
                        i9 = -1;
                    }
                }
                iArr[i3] = i4;
            } else if (charAt == '`') {
                if (c2 == '`' && c3 == '`' && (i8 < 0 || i8 < i7 - 2)) {
                    if (i9 < 0) {
                        i9 = i7 + 1;
                    } else {
                        int i12 = i7 - 2;
                        if (i9 < i12) {
                            int i13 = i9;
                            while (true) {
                                if (i13 >= i12) {
                                    continue;
                                    break;
                                } else if (!Character.isWhitespace(charSequence.charAt(i13))) {
                                    arrayList.add(new C84894Mh(new TypefaceSpan("monospace"), i9, i12, 3));
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        C84894Mh r1 = (C84894Mh) it.next();
                                        if (r1.A00 > i9 - 1 && r1.A01 < i12) {
                                            arrayList2.add(r1);
                                        }
                                    }
                                    arrayList.removeAll(arrayList2);
                                    if (iArr != null) {
                                        Arrays.fill(iArr, -1);
                                    }
                                    if (arrayList.size() >= i6) {
                                        break;
                                    }
                                    i8 = i7;
                                    i9 = -1;
                                } else {
                                    i13++;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } else if (charAt == 10 && iArr != null) {
                Arrays.fill(iArr, -1);
            }
            i7++;
            c3 = c2;
            c2 = charAt;
        }
        if (arrayList.isEmpty()) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C84894Mh r4 = (C84894Mh) it2.next();
            if (z2) {
                int i14 = 855638016 | (16777215 & i2);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i14);
                int i15 = r4.A00;
                int i16 = r4.A02;
                valueOf.setSpan(foregroundColorSpan, i15 - i16, i15, 18);
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(i14);
                int i17 = r4.A01;
                valueOf.setSpan(foregroundColorSpan2, i17, i16 + i17, 18);
            } else {
                int i18 = r4.A00;
                int i19 = r4.A02;
                valueOf.replace(i18 - i19, i18, "");
                A0A(arrayList, r4.A00 - i19, i19);
                int i20 = r4.A01;
                valueOf.replace(i20, i19 + i20, "");
                A0A(arrayList, r4.A01, i19);
            }
            valueOf.setSpan(r4.A03, r4.A00, r4.A01, 17);
        }
        return valueOf;
    }

    public static List A05(Spannable spannable) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        Object[] spans = spannable.getSpans(0, spannable.length(), URLSpan.class);
        if (spans == null || spans.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(spans));
        Collections.sort(arrayList, new IDxComparatorShape183S0100000_2_I0(spannable, 5));
        int size = arrayList.size();
        while (i5 < size - 1) {
            Object obj = arrayList.get(i5);
            int i6 = i5 + 1;
            Object obj2 = arrayList.get(i6);
            int spanStart = spannable.getSpanStart(obj);
            int spanEnd = spannable.getSpanEnd(obj);
            int spanStart2 = spannable.getSpanStart(obj2);
            int spanEnd2 = spannable.getSpanEnd(obj2);
            if (spanStart <= spanStart2 && spanEnd > spanStart2) {
                if (spanEnd2 <= spanEnd || (i3 = spanEnd - spanStart) > (i4 = spanEnd2 - spanStart2)) {
                    spannable.removeSpan(obj2);
                    i2 = i6;
                } else if (i3 < i4) {
                    spannable.removeSpan(obj);
                    i2 = i5;
                }
                if (i2 != -1) {
                    arrayList.remove(i2);
                    size--;
                }
            }
            i5 = i6;
        }
        return arrayList;
    }

    public static void A06(Context context, Paint paint, Editable editable, AnonymousClass01V r10, C17250um r11, C17020u3 r12) {
        A07(context, paint, editable, r10, r11, r12, 1.3f);
    }

    public static void A07(Context context, Paint paint, Editable editable, AnonymousClass01V r8, C17250um r9, C17020u3 r10, float f2) {
        AnonymousClass2Sy.A07(context, paint, editable, r9, f2);
        for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) editable.getSpans(0, editable.length(), ForegroundColorSpan.class)) {
            if (!(foregroundColorSpan instanceof AnonymousClass5N2)) {
                editable.removeSpan(foregroundColorSpan);
            }
        }
        Object[] spans = editable.getSpans(0, editable.length(), StyleSpan.class);
        if (spans != null) {
            for (Object removeSpan : spans) {
                editable.removeSpan(removeSpan);
            }
        }
        Object[] spans2 = editable.getSpans(0, editable.length(), StrikethroughSpan.class);
        if (spans2 != null) {
            for (Object removeSpan2 : spans2) {
                editable.removeSpan(removeSpan2);
            }
        }
        Object[] spans3 = editable.getSpans(0, editable.length(), TypefaceSpan.class);
        if (spans3 != null) {
            for (Object removeSpan3 : spans3) {
                editable.removeSpan(removeSpan3);
            }
        }
        A04(r8, r10, editable, paint.getColor(), true);
    }

    public static void A08(Context context, Uri uri, C19980zJ r9, C14870pt r10, TextEmojiLabel textEmojiLabel, AnonymousClass01V r12, String str) {
        A09(context, r9, r10, textEmojiLabel, r12, str, new AnonymousClass5CD(uri));
    }

    public static void A09(Context context, C19980zJ r11, C14870pt r12, TextEmojiLabel textEmojiLabel, AnonymousClass01V r14, String str, Map map) {
        HashMap hashMap = new HashMap();
        Iterator it = map.entrySet().iterator();
        while (true) {
            AnonymousClass01V r8 = r14;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                hashMap.put(entry.getKey(), new C59142uk(context, r11, r12, r8, entry.getValue().toString()));
            } else {
                SpannableStringBuilder A01 = A01(str, hashMap);
                textEmojiLabel.A07 = new AnonymousClass3MF();
                textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, r14));
                textEmojiLabel.setText(A01);
                return;
            }
        }
    }

    public static void A0A(List list, int i2, int i3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C84894Mh r1 = (C84894Mh) it.next();
            int i4 = r1.A00;
            if (i4 > i2) {
                r1.A00 = i4 - i3;
            }
            int i5 = r1.A01;
            if (i5 > i2) {
                r1.A01 = i5 - i3;
            }
        }
    }

    public static boolean A0B(AnonymousClass01V r0, C17020u3 r1, CharSequence charSequence) {
        return charSequence != null && !AnonymousClass1ZW.A0E(A03(r0, r1, charSequence));
    }
}
