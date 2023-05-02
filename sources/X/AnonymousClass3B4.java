package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.AssemMods.translator.Language;
import com.facebook.redex.IDxVPropertyShape2S0000000_I0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3B4  reason: invalid class name */
public class AnonymousClass3B4 {
    public static final Map A00;
    public static final Map A01;

    static {
        HashMap A0x = AnonymousClass000.A0x();
        Integer A0X = C13680ns.A0X();
        A0x.put(Language.AUTO_DETECT, A0X);
        Integer A0Y = C13680ns.A0Y();
        A0x.put("yes", A0Y);
        Integer A0Z = C13680ns.A0Z();
        A0x.put("no", A0Z);
        A0x.put("no_hide_descendants", C13690nt.A0T());
        A00 = Collections.unmodifiableMap(A0x);
        HashMap A0x2 = AnonymousClass000.A0x();
        A0x2.put("none", A0X);
        A0x2.put("polite", A0Y);
        A0x2.put("assertive", A0Z);
        A01 = Collections.unmodifiableMap(A0x2);
    }

    public static void A00(View view, C14990q7 r17, C31201dg r18, C31201dg r19) {
        C14990q7 r5 = r17;
        C31201dg r7 = r18;
        C85504Os r12 = (C85504Os) C62183Bz.A05(r5, r7);
        if (r12 != null) {
            View view2 = view;
            r12.A03 = (String) view2.getContentDescription();
            r12.A00 = Integer.valueOf(view2.getImportantForAccessibility());
            r12.A01 = Integer.valueOf(C004601z.A04(view2));
            r12.A05 = view2.isFocusable();
            r12.A08 = view2.isSelected();
            r12.A04 = view2.isEnabled();
            r12.A06 = C004601z.A0s(view2);
            r12.A07 = C004601z.A0x(view2);
            C004601z.A0j(view2, new AnonymousClass3PB(r5, r7, r19));
            int i2 = 35;
            String A0K = r7.A0K(35, r12.A03);
            Number number = (Number) A00.get(r7.A0J(42));
            Integer num = (Integer) A01.get(r7.A0J(44));
            boolean A0P = r7.A0P(40, r12.A05);
            boolean A0P2 = r7.A0P(49, r12.A08);
            boolean A0P3 = r7.A0P(38, r12.A04);
            boolean A0P4 = r7.A0P(41, r12.A06);
            boolean A0P5 = r7.A0P(48, r12.A07);
            Object obj = r7.A02.get(43);
            List<C31201dg> A0N = r7.A0N(55);
            if (A0N != null && !A0N.isEmpty()) {
                for (C31201dg r2 : A0N) {
                    String A0J = r2.A0J(i2);
                    C14930q1 A0H = r2.A0H(38);
                    if (A0J != null) {
                        Map map = AnonymousClass3PB.A05;
                        if (map.containsKey(A0J)) {
                            int A0D = AnonymousClass000.A0D(map.get(A0J));
                            Object obj2 = map.get("click");
                            AnonymousClass44n.A00(obj2);
                            int A0D2 = AnonymousClass000.A0D(obj2);
                            Object obj3 = map.get("long_click");
                            AnonymousClass44n.A00(obj3);
                            int A0D3 = AnonymousClass000.A0D(obj3);
                            if (A0D == A0D2) {
                                if (A0H != null && Build.VERSION.SDK_INT <= 25) {
                                    r12.A09 = true;
                                    view2.setOnClickListener(new C93964k4(A0D2));
                                }
                            } else if (A0D == A0D3 && A0H != null) {
                                r12.A0A = true;
                                view2.setOnLongClickListener(new C94164kT(A0D3));
                            }
                        }
                    }
                    i2 = 35;
                }
            }
            String str = r12.A02;
            view2.setContentDescription(A0K);
            r12.A02 = A0K;
            if (Build.VERSION.SDK_INT >= 21) {
                A01(view2, num, str, A0K);
            }
            if (number == null) {
                number = r12.A00;
            }
            view2.setImportantForAccessibility(number.intValue());
            if (num == null) {
                num = r12.A01;
            }
            C004601z.A0c(view2, num.intValue());
            view2.setFocusable(A0P);
            if (obj != null) {
                C89534cO.A00(view2, r5, obj);
            }
            view2.setSelected(A0P2);
            view2.setEnabled(A0P3);
            C004601z.A0o(view2, A0P4);
            new IDxVPropertyShape2S0000000_I0(0).A02(view2, Boolean.valueOf(A0P5));
            C89534cO.A02(r5, r19, r7.A0N(56));
        }
    }

    public static void A01(View view, Integer num, String str, String str2) {
        if ((num == null || num.intValue() == 0) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !str2.equals(str) && view.isAccessibilityFocused()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            obtain.setContentChangeTypes(4);
            obtain.setContentDescription(str2);
            view.sendAccessibilityEventUnchecked(obtain);
        }
    }
}
