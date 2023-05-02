package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.EditText;
import com.obwhatsapp.R;
import com.obwhatsapp.emoji.EmojiDescriptor;

/* renamed from: X.2Sy  reason: invalid class name */
public abstract class AnonymousClass2Sy {
    public static boolean A00;

    public static SpannableStringBuilder A00(Context context, Paint paint, C40061tV r5, C17250um r6, CharSequence charSequence, float f2) {
        C83724Hu r0;
        if (paint == null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dimen02e7);
            Paint paint2 = new Paint();
            paint2.setTextSize((float) dimensionPixelSize);
            r0 = new C83724Hu(paint2, 1.0f);
        } else {
            r0 = new C83724Hu(paint, f2);
        }
        return A01(context, r5, r0, r6, charSequence);
    }

    public static SpannableStringBuilder A01(Context context, C40061tV r21, C83724Hu r22, C17250um r23, CharSequence charSequence) {
        boolean z2;
        Object imageSpan;
        CharSequence charSequence2 = charSequence;
        C435020g r6 = new C435020g(charSequence2);
        int length = charSequence2.length();
        Paint paint = new Paint();
        SpannableStringBuilder spannableStringBuilder = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < length) {
                r6.A00 = i2;
                long A002 = EmojiDescriptor.A00(r6, false);
                int A01 = r6.A01(i2, A002);
                C40061tV r8 = r21;
                if (A002 != -1) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = SpannableStringBuilder.valueOf(charSequence2);
                    }
                    Context context2 = context;
                    Drawable A05 = r23.A05(context2.getResources(), r6, A002);
                    if (A05 != null) {
                        if (C434520b.A00) {
                            StringBuilder sb = new StringBuilder(A01);
                            for (int i4 = 0; i4 < A01; i4++) {
                                sb.append(65535);
                            }
                            spannableStringBuilder.replace(i3, i3 + A01, sb, 0, A01);
                        }
                        int i5 = i3 + A01;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i3, i5);
                        C83724Hu r12 = r22;
                        Paint paint2 = r12.A01;
                        Paint.FontMetricsInt A003 = C89684cj.A00(paint2);
                        if (A003 != null) {
                            int textSize = (int) ((r12.A00 * paint2.getTextSize() * 1.1f) + 0.5f);
                            A05.setBounds(0, 0, textSize, textSize);
                            imageSpan = new C607235o(context2, A003, A05, subSequence);
                        } else {
                            int textSize2 = (int) (paint2.getFontMetrics() != null ? (r12.A00 * paint2.getTextSize() * 1.1f) + 0.5f : context2.getResources().getDisplayMetrics().scaledDensity * 22.0f);
                            A05.setBounds(0, 0, textSize2, textSize2);
                            imageSpan = new ImageSpan(A05, 0);
                        }
                        spannableStringBuilder.setSpan(imageSpan, i3, i5, 33);
                        if (r21 != null) {
                            z2 = true;
                        } else {
                            continue;
                        }
                    } else if (!AnonymousClass0T6.A00(paint, charSequence2.subSequence(i2, i2 + A01).toString())) {
                        spannableStringBuilder.setSpan(new AnonymousClass3MP(), i3, i3 + A01, 33);
                    }
                    i3 += A01;
                    i2 += A01;
                } else if (r21 != null) {
                    z2 = false;
                } else {
                    continue;
                    i3 += A01;
                    i2 += A01;
                }
                if (!r8.AYa(i2, z2)) {
                    break;
                }
                i3 += A01;
                i2 += A01;
            } else if (charSequence2 instanceof SpannableStringBuilder) {
                return (SpannableStringBuilder) charSequence2;
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence A02(Context context, Paint paint, C40061tV r9, C17250um r10, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        SpannableStringBuilder A002 = A00(context, paint, r9, r10, charSequence2, 1.0f);
        int AD8 = r9.AD8();
        if (AD8 <= 0) {
            return A002 != null ? A002 : charSequence2;
        }
        if (A002 == null) {
            A002 = new SpannableStringBuilder(charSequence);
        }
        SpannableStringBuilder delete = A002.delete(AD8 + (Character.charCount(Character.codePointAt(charSequence, AD8 - 1)) - 1), A002.length());
        delete.append("…");
        return delete;
    }

    public static CharSequence A03(Context context, Paint paint, C17250um r8, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder A002 = A00(context, paint, (C40061tV) null, r8, charSequence2, 1.0f);
        return A002 != null ? A002 : charSequence2;
    }

    public static CharSequence A04(Context context, Paint paint, C17250um r7, CharSequence charSequence, float f2) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder A002 = A00(context, paint, (C40061tV) null, r7, charSequence2, f2);
        return A002 != null ? A002 : charSequence2;
    }

    public static CharSequence A05(Context context, C17250um r4, CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dimen02e7);
        Paint paint = new Paint();
        paint.setTextSize((float) dimensionPixelSize);
        SpannableStringBuilder A01 = A01(context, (C40061tV) null, new C83724Hu(paint, 1.0f), r4, charSequence);
        return A01 != null ? A01 : charSequence;
    }

    public static String A06(int[] iArr) {
        StringBuilder sb = new StringBuilder(r4);
        for (int i2 : iArr) {
            if (C434520b.A00 && i2 >= 126980 && i2 <= 129784) {
                i2 &= 65535;
            }
            sb.append(Character.toChars(i2));
        }
        return sb.toString();
    }

    public static void A07(Context context, Paint paint, Editable editable, C17250um r14, float f2) {
        Drawable A05;
        Object imageSpan;
        Paint.FontMetricsInt A002;
        if (!A00) {
            A00 = true;
            String obj = editable.toString();
            int length = obj.length();
            for (ImageSpan removeSpan : (ImageSpan[]) editable.getSpans(0, length, ImageSpan.class)) {
                editable.removeSpan(removeSpan);
            }
            if (C434520b.A00) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int codePointAt = obj.codePointAt(i2);
                    int charCount = Character.charCount(codePointAt);
                    if (charCount > 1 && codePointAt >= 126980 && codePointAt <= 129784) {
                        editable.replace(i3, i3 + charCount, new String(Character.toChars(codePointAt & 65535)));
                        i3 -= charCount - 1;
                    }
                    i2 += charCount;
                    i3 += charCount;
                }
                obj = editable.toString();
            }
            C435020g r4 = new C435020g(obj);
            int length2 = obj.length();
            int i4 = 0;
            while (i4 < length2) {
                r4.A00 = i4;
                long A003 = EmojiDescriptor.A00(r4, false);
                int A01 = r4.A01(i4, A003);
                if (!(A003 == -1 || (A05 = r14.A05(context.getResources(), r4, A003)) == null)) {
                    if (paint == null || (A002 = C89684cj.A00(paint)) == null) {
                        A05.setBounds(0, 0, (int) (context.getResources().getDisplayMetrics().scaledDensity * 22.0f), (int) (context.getResources().getDisplayMetrics().scaledDensity * 22.0f));
                        imageSpan = new ImageSpan(A05, 0);
                    } else {
                        int textSize = (int) ((paint.getTextSize() * f2) + 0.5f);
                        A05.setBounds(0, 0, textSize, textSize);
                        imageSpan = new C607235o(context, A002, A05, obj.substring(i4, i4 + A01));
                    }
                    editable.setSpan(imageSpan, i4, i4 + A01, 33);
                }
                i4 += A01;
            }
            A00 = false;
        }
    }

    public static void A08(EditText editText, int[] iArr, int i2) {
        int max = Math.max(0, editText.getSelectionStart());
        int max2 = Math.max(0, editText.getSelectionEnd());
        if (max > max2) {
            int i3 = max2;
            max2 = max;
            max = i3;
        }
        if (i2 > 0) {
            StringBuilder sb = new StringBuilder(editText.getText().toString());
            sb.replace(max, max2, A06(iArr));
            if (C31011dK.A00(sb) > i2) {
                return;
            }
        }
        editText.getText().replace(max, max2, A06(iArr));
        int i4 = 0;
        for (int charCount : iArr) {
            i4 += C434520b.A00 ? 1 : Character.charCount(charCount);
        }
        if (max <= editText.length() - i4) {
            editText.setSelection(max + i4);
        }
    }
}
