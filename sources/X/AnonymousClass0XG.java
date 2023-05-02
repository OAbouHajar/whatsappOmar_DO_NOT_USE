package X;

import android.os.Bundle;
import com.AssemMods.translator.Language;

/* renamed from: X.0XG  reason: invalid class name */
public class AnonymousClass0XG {
    public static final C03870Ke A0B = C03870Ke.STATIC;
    public static final C03850Kc A0C = C03850Kc.AUTO;
    public static final C03860Kd A0D = C03860Kd.AUTO;
    public static final C03880Kf A0E = C03880Kf.FULL_SHEET;
    public final C03870Ke A00;
    public final C03850Kc A01;
    public final C03860Kd A02;
    public final C03880Kf A03;
    public final C14990q7 A04;
    public final C14960q4 A05;
    public final C31201dg A06;
    public final C14930q1 A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public AnonymousClass0XG(C03870Ke r1, C03850Kc r2, C03860Kd r3, C03880Kf r4, C14990q7 r5, C14960q4 r6, C31201dg r7, C14930q1 r8, boolean z2, boolean z3, boolean z4) {
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r8;
        this.A09 = z3;
        this.A08 = z4;
        this.A0A = z2;
    }

    public static AnonymousClass0JQ A00(String str) {
        try {
            return AnonymousClass0JQ.valueOf(str);
        } catch (IllegalArgumentException e2) {
            C29691b2.A02("CdsOpenScreenConfig", e2);
            return AnonymousClass0JQ.NEVER_ANIMATED;
        }
    }

    public static AnonymousClass0JR A01(String str) {
        try {
            return AnonymousClass0JR.valueOf(str);
        } catch (IllegalArgumentException e2) {
            C29691b2.A02("CdsOpenScreenConfig", e2);
            return AnonymousClass0JR.FULL_SHEET;
        }
    }

    public static AnonymousClass0XG A02() {
        return new AnonymousClass0XG(A0B, A0C, A0D, A0E, (C14990q7) null, (C14960q4) null, (C31201dg) null, (C14930q1) null, false, false, false);
    }

    public static AnonymousClass0XG A03(Bundle bundle) {
        C14990q7 r6 = (C14990q7) A04(bundle, C14990q7.class, "bloks_context");
        C03860Kd A002 = C03860Kd.A00(bundle.getString("drag_to_dismiss", Language.AUTO_DETECT));
        C03880Kf A003 = C03880Kf.A00(bundle.getString("mode", "full_sheet"));
        C03870Ke A004 = C03870Ke.A00(bundle.getString("background_mode", "static"));
        C03850Kc A005 = C03850Kc.A00(bundle.getString("dimmed_background_tap_to_dismiss", "static"));
        A04(bundle, C13490mS.class, "native_on_dismiss_callback");
        A04(bundle, C12140ju.class, "custom_loading_view_resolver");
        return new AnonymousClass0XG(A004, A005, A002, A003, r6, (C14960q4) A04(bundle, C14960q4.class, "bloks_interpreter_environment"), (C31201dg) A04(bundle, C31201dg.class, "bloks_model"), (C14930q1) A04(bundle, C14930q1.class, "on_dismiss_callback"), bundle.getBoolean("clear_top_activity", false), bundle.getBoolean("custom_loading_view_resolver", false), bundle.getBoolean("native_disable_cancel_button_on_loading_screen", false));
    }

    public static Object A04(Bundle bundle, Class cls, String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        return C05850Tg.A00(cls, Integer.valueOf(i2));
    }

    public static void A05(Bundle bundle, Object obj, String str) {
        if (obj != null) {
            int incrementAndGet = C05850Tg.A02.incrementAndGet();
            synchronized (C05850Tg.A01) {
                C05850Tg.A00.append(incrementAndGet, obj);
            }
            bundle.putInt(str, incrementAndGet);
        }
    }

    public Bundle A06() {
        Bundle bundle = new Bundle();
        bundle.putString("drag_to_dismiss", this.A02.value);
        bundle.putString("mode", this.A03.value);
        bundle.putString("background_mode", this.A00.value);
        bundle.putString("dimmed_background_tap_to_dismiss", this.A01.value);
        A05(bundle, this.A05, "bloks_interpreter_environment");
        A05(bundle, this.A04, "bloks_context");
        A05(bundle, this.A06, "bloks_model");
        A05(bundle, this.A07, "on_dismiss_callback");
        bundle.putBoolean("native_use_slide_animation_for_full_screen", this.A09);
        bundle.putBoolean("native_disable_cancel_button_on_loading_screen", this.A08);
        bundle.putBoolean("clear_top_activity", this.A0A);
        bundle.setClassLoader(AnonymousClass0XG.class.getClassLoader());
        return bundle;
    }
}
