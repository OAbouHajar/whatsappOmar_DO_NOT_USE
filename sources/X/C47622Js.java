package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.emoji.EmojiDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/* renamed from: X.2Js  reason: invalid class name and case insensitive filesystem */
public class C47622Js {
    public static final Random A00 = new Random();
    public static final int[] A01 = {-5886863, -7296959, -4087745, -8838856, -5339276, -1002704, -4803801, -3760180, -7640688, -30068, -11222427, -33941, -14236452, -11023873, -9148566, -8482653, -11102465, -9558658, -8729691, -14404032, -8219446};
    public static final int[] A02 = {0, 1, 2, 3, 5};

    public static int A00(int i2, int i3, boolean z2) {
        if (z2) {
            if (i2 < 50) {
                return 24;
            }
            if (i2 < 150) {
                return i3 >= 640 ? 19 : 16;
            }
            if (i3 < 560) {
                return 14;
            }
            if (i3 < 640) {
                return 16;
            }
        } else if (i2 < 50) {
            return 32;
        } else {
            return i2 < 150 ? 24 : 16;
        }
    }

    public static int A01(CharSequence charSequence) {
        int i2 = 0;
        int A022 = A02(charSequence, 0, charSequence.length());
        ArrayList A04 = C30931dC.A04(charSequence.toString());
        if (A04 == null) {
            return A022;
        }
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            i2 += str.length() - C812247i.A00(str).length();
        }
        return A022 - i2;
    }

    public static int A02(CharSequence charSequence, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        while (i2 < i3) {
            if (charSequence.charAt(i2) != 10) {
                sb.append(charSequence.charAt(i2));
            }
            i2++;
        }
        return C31011dK.A00(sb.toString());
    }

    public static Typeface A03(Context context, int i2) {
        if (i2 == 1) {
            return Typeface.SERIF;
        }
        if (i2 == 2) {
            return AnonymousClass32z.A03(context);
        }
        if (i2 != 3) {
            return i2 != 5 ? Typeface.SANS_SERIF : AnonymousClass32z.A02(context);
        }
        Typeface typeface = AnonymousClass32z.A0B;
        if (typeface != null) {
            return typeface;
        }
        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/Bryndan-Write.ttf");
        AnonymousClass32z.A0B = createFromAsset;
        return createFromAsset;
    }

    public static CharSequence A04(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        for (int i6 = i2; i6 < i3 && i4 >= 0 && i5 > 0; i6++) {
            sb.append(charSequence.charAt(i6));
            if (charSequence.charAt(i6) == 10) {
                i4--;
            } else {
                i5--;
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == 10 && charSequence.charAt(i2) != 10 && i2 != i3 - 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String A05(C16740tZ r6) {
        String A13;
        if (r6 instanceof C30571cb) {
            return ((C30571cb) r6).AFB();
        }
        if (r6 instanceof C30581cc) {
            C30581cc r1 = (C30581cc) r6;
            if (!(r1.A13() == null || (A13 = r1.A13()) == null)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A04(A13, 0, A13.length(), 10, 700).toString());
                C30931dC.A06(spannableStringBuilder);
                for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                    spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), C812247i.A00(uRLSpan.getURL()));
                }
                return spannableStringBuilder.toString();
            }
        }
        return r6.A0I();
    }

    public static String A06(String str) {
        C435020g r5 = new C435020g(str);
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            i3 = str.charAt(i2) == 10 ? i3 + 50 : i3 + 1;
            if (i3 > 700) {
                break;
            }
            r5.A00 = i2;
            i2 += r5.A01(i2, EmojiDescriptor.A00(r5, false));
        }
        return str.substring(0, i2);
    }

    public static void A07(Context context, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = ((float) context.getResources().getDisplayMetrics().widthPixels) > context.getResources().getDimension(R.dimen.dimen0794) + (context.getResources().getDimension(R.dimen.dimen078b) * 2.0f) ? (int) context.getResources().getDimension(R.dimen.dimen0794) : -1;
        layoutParams.height = -2;
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }

    public static void A08(TextView textView, int i2) {
        if (i2 < 150) {
            textView.setGravity(17);
            if (C15450qv.A00()) {
                textView.setTextAlignment(4);
                return;
            }
            return;
        }
        textView.setGravity(16);
        if (C15450qv.A00()) {
            textView.setTextAlignment(5);
            textView.setTextDirection(5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0.A00 <= 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A09(X.AnonymousClass1ZR r6, int r7) {
        /*
            r5 = 0
            if (r6 == 0) goto L_0x0027
            android.graphics.Bitmap r0 = r6.A03()
            if (r0 == 0) goto L_0x0027
            X.2k5 r0 = r6.A09
            r4 = 1
            if (r0 == 0) goto L_0x0013
            int r0 = r0.A00
            r3 = 1
            if (r0 > 0) goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            r0 = 250(0xfa, float:3.5E-43)
            r2 = 0
            if (r7 < r0) goto L_0x001a
            r2 = 1
        L_0x001a:
            byte[] r1 = r6.A0U
            r0 = 0
            if (r1 != 0) goto L_0x0020
            r0 = 1
        L_0x0020:
            if (r3 != 0) goto L_0x0027
            if (r2 != 0) goto L_0x0027
            if (r0 != 0) goto L_0x0027
            return r4
        L_0x0027:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47622Js.A09(X.1ZR, int):boolean");
    }
}
