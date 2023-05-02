package X;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import com.obwhatsapp.TextEmojiLabel;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3Az  reason: invalid class name and case insensitive filesystem */
public final class C61933Az {
    public static final Pattern A00 = Pattern.compile("\\[(\\d+)]");

    public static Spannable A00(View view, C14990q7 r19, C31201dg r20, AnonymousClass1JW r21) {
        boolean z2;
        Integer num;
        boolean z3;
        C31201dg r10 = r20;
        Object obj = r10.A02.get(44);
        int i2 = 0;
        Object[] array = obj != null ? ((List) obj).toArray(new String[0]) : null;
        String A0J = r10.A0J(36);
        if (array != null) {
            A0J = MessageFormat.format(A0J, array);
        }
        if (A0J == null) {
            return new SpannableStringBuilder();
        }
        Map map = C39791t4.A01;
        Iterator A0I = C13700nu.A0I(map);
        while (true) {
            if (A0I.hasNext()) {
                if (A0J.contains(AnonymousClass000.A0m(A0I))) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        SpannableStringBuilder A0F = z2 ? C13690nt.A0F(C39791t4.A00(view.getContext(), A0J)) : C13690nt.A0F(A0J);
        C31201dg A0G = r10.A0G(43);
        int i3 = 40;
        String A0J2 = r10.A0J(40);
        C14990q7 r11 = r19;
        if (A0G != null) {
            num = Integer.valueOf(C87564Xk.A01(r11, A0G, 0));
        } else {
            if (A0J2 != null) {
                try {
                    num = Integer.valueOf(C62163Bx.A05(A0J2));
                } catch (AnonymousClass40K e2) {
                    C29691b2.A01("WaRcRichTextComponentBinderUtils", String.format("Failed to parse text color %s", new Object[]{A0J2}), e2);
                }
            }
            num = null;
        }
        if (num != null) {
            A0F.setSpan(new ForegroundColorSpan(num.intValue()), 0, A0J.length(), 0);
        }
        String A0J3 = r10.A0J(41);
        if (A0J3 != null) {
            try {
                A0F.setSpan(new AbsoluteSizeSpan(Math.round(C62163Bx.A01(A0J3))), 0, A0J.length(), 0);
            } catch (AnonymousClass40K e3) {
                C29691b2.A01("WaRcRichTextComponentBinderUtils", String.format("Failed to parse text color %s", new Object[]{A0J2}), e3);
            }
        }
        String A0J4 = r10.A0J(42);
        if (A0J4 != null) {
            try {
                A0F.setSpan(new StyleSpan(C62163Bx.A09(A0J4)), 0, A0J.length(), 0);
            } catch (AnonymousClass40K e4) {
                C29691b2.A01("WaRcRichTextComponentBinderUtils", String.format("Failed to textStyle  %s", new Object[]{A0J3}), e4);
            }
        }
        Matcher matcher = A00.matcher(A0J);
        int i4 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            int A002 = C29501aj.A00(group.replaceAll("[\\[\\]]", ""), -1);
            if (A002 >= 0 && A002 < r10.A0L().size()) {
                C31201dg A0Q = C13690nt.A0Q(r10.A0L(), A002);
                String A0J5 = A0Q.A0J(38);
                if (array != null) {
                    A0J5 = MessageFormat.format(A0J5, array);
                }
                int start = matcher.start() + i4;
                if (A0J5 != null) {
                    int length = A0J5.length();
                    int length2 = group.length();
                    i4 += length - length2;
                    Iterator A0I2 = C13700nu.A0I(map);
                    while (true) {
                        if (A0I2.hasNext()) {
                            if (A0J5.contains(AnonymousClass000.A0m(A0I2))) {
                                z3 = true;
                                break;
                            }
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                    SpannableStringBuilder A0F2 = z3 ? C13690nt.A0F(C39791t4.A00(view.getContext(), A0J5)) : C13690nt.A0F(A0J5);
                    String A0J6 = A0Q.A0J(i3);
                    if (A0J6 != null) {
                        try {
                            A0F2.setSpan(new ForegroundColorSpan(C62163Bx.A05(A0J6)), i2, length, i2);
                        } catch (AnonymousClass40K unused) {
                            C29691b2.A00("WaRcRichTextComponentBinderUtils", "Error parsing TextSpan color");
                        }
                    }
                    C31201dg A0G2 = A0Q.A0G(44);
                    if (A0G2 != null) {
                        A0F2.setSpan(new ForegroundColorSpan(C87564Xk.A01(r11, A0G2, i2)), 0, length, 0);
                    }
                    String A0J7 = A0Q.A0J(42);
                    if (A0J7 != null) {
                        try {
                            A0F2.setSpan(new AbsoluteSizeSpan(Math.round(TypedValue.applyDimension(2, C62163Bx.A02(A0J7), AnonymousClass000.A0M(r11.A00)))), 0, length, 0);
                        } catch (AnonymousClass40K unused2) {
                            C29691b2.A00("WaRcRichTextComponentBinderUtils", "Error parsing TextSpan size");
                        }
                    }
                    String A0J8 = A0Q.A0J(43);
                    if (A0J8 != null) {
                        try {
                            A0F2.setSpan(new StyleSpan(C62163Bx.A09(A0J8)), 0, length, 0);
                        } catch (AnonymousClass40K unused3) {
                            C29691b2.A00("WaRcRichTextComponentBinderUtils", "Error parsing TextSpan textStyle");
                        }
                    }
                    String A0J9 = A0Q.A0J(35);
                    if (A0J9 != null) {
                        A0F2.setSpan(new TypefaceSpan(A0J9), 0, length, 0);
                    }
                    C14930q1 A0H = A0Q.A0H(36);
                    if (A0H != null) {
                        int intValue = num != null ? num.intValue() : 0;
                        if (A0G2 != null) {
                            intValue = C87564Xk.A01(r11, A0G2, 0);
                        }
                        A0F2.setSpan(r21.AH2(new RunnableRunnableShape3S0300000_I1(r10, A0H, r11, 10), intValue, -65536, 1711315404), 0, length, 0);
                    }
                    A0F.replace(start, length2 + start, A0F2);
                }
            }
            i2 = 0;
            i3 = 40;
        }
        return A0F;
    }

    public static void A01(Spannable spannable, AnonymousClass02Z r7, C31201dg r8) {
        C30531cW.A02((TextEmojiLabel) r7);
        r7.setText(spannable);
        String A0J = r8.A0J(38);
        if (A0J != null) {
            try {
                r7.setGravity(C62163Bx.A07(A0J));
            } catch (AnonymousClass40K e2) {
                C29691b2.A01("WaRcRichTextComponentBinderUtils", String.format("Failed to parse text align %s", new Object[]{A0J}), e2);
            }
        }
        String A0J2 = r8.A0J(35);
        if (A0J2 != null) {
            try {
                r7.setLineHeight((int) C62163Bx.A01(A0J2));
            } catch (AnonymousClass40K e3) {
                C29691b2.A01("WaRcRichTextComponentBinderUtils", String.format("Failed to parse line height pixel  %s", new Object[]{A0J2}), e3);
            }
        }
    }
}
