package X;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.view.ActionMode;
import android.widget.TextView;

/* renamed from: X.04h  reason: invalid class name */
public final class AnonymousClass04h {
    public static int A00(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (!(textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR))) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                return 2;
            }
            if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                return 3;
            }
            if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                return 4;
            }
            if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                return 5;
            }
            if (textDirectionHeuristic == textDirectionHeuristic2) {
                return 6;
            }
            if (textDirectionHeuristic == textDirectionHeuristic3) {
                return 7;
            }
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r3 != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        return android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        return android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r1 != 2) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.TextDirectionHeuristic A01(android.widget.TextView r4) {
        /*
            android.text.method.TransformationMethod r0 = r4.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 != 0) goto L_0x0053
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            r3 = 0
            r2 = 1
            if (r1 < r0) goto L_0x0037
            int r0 = r4.getInputType()
            r1 = r0 & 15
            r0 = 3
            if (r1 != r0) goto L_0x0037
            java.util.Locale r0 = X.C017108b.A02(r4)
            android.icu.text.DecimalFormatSymbols r0 = X.C04300Lz.A00(r0)
            java.lang.String[] r0 = X.AnonymousClass08T.A02(r0)
            r0 = r0[r3]
            int r0 = r0.codePointAt(r3)
            byte r1 = java.lang.Character.getDirectionality(r0)
            if (r1 == r2) goto L_0x0034
            r0 = 2
            if (r1 != r0) goto L_0x0053
        L_0x0034:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.RTL
            return r0
        L_0x0037:
            int r0 = X.C017108b.A00(r4)
            if (r0 != r2) goto L_0x003e
            r3 = 1
        L_0x003e:
            int r0 = X.C017108b.A01(r4)
            switch(r0) {
                case 2: goto L_0x004d;
                case 3: goto L_0x0053;
                case 4: goto L_0x0034;
                case 5: goto L_0x0050;
                case 6: goto L_0x004a;
                case 7: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            if (r3 == 0) goto L_0x004a
        L_0x0047:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            return r0
        L_0x004a:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            return r0
        L_0x004d:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            return r0
        L_0x0050:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LOCALE
            return r0
        L_0x0053:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04h.A01(android.widget.TextView):android.text.TextDirectionHeuristic");
    }

    public static ActionMode.Callback A02(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof AnonymousClass0YT) || callback == null) ? callback : new AnonymousClass0YT(callback, textView);
    }

    public static void A03(ColorStateList colorStateList, TextView textView) {
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass08W.A02(colorStateList, textView);
        } else if (textView instanceof C004702b) {
            ((C004702b) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void A04(PorterDuff.Mode mode, TextView textView) {
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass08W.A03(mode, textView);
        } else if (textView instanceof C004702b) {
            ((C004702b) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void A05(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 18) {
            C017108b.A03(drawable, drawable2, drawable3, drawable4, textView);
        } else if (i2 >= 17) {
            Drawable drawable5 = drawable3;
            if (C017108b.A00(textView) != 1) {
                drawable5 = drawable;
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    public static void A06(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        } else if (Build.VERSION.SDK_INT >= 28) {
            AnonymousClass08T.A01(textView, i2);
        } else {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
            if (i2 > Math.abs(i3)) {
                textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
            }
        }
    }

    public static void A07(TextView textView, int i2) {
        if (i2 >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (i2 > Math.abs(i3)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void A08(TextView textView, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i2);
        } else {
            textView.setTextAppearance(textView.getContext(), i2);
        }
    }

    public static void A09(TextView textView, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 27) {
            C05720Ss.A01(textView, i2, i3, i4, i5);
        } else if (textView instanceof AnonymousClass02a) {
            ((AnonymousClass02a) textView).setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
        }
    }
}
