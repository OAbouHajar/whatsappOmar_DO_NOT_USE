package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3PB  reason: invalid class name */
public class AnonymousClass3PB extends AnonymousClass05M {
    public static final Map A05;
    public static final Map A06;
    public static final Map A07;
    public static final Map A08;
    public int A00 = 1056964608;
    public final C14990q7 A01;
    public final C31201dg A02;
    public final C31201dg A03;
    public final Map A04;

    static {
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put("button", "android.widget.Button");
        A0x.put("checkbox", "android.widget.CompoundButton");
        A0x.put("checked_text_view", "android.widget.CheckedTextView");
        A0x.put("drop_down_list", "android.widget.Spinner");
        A0x.put("edit_text", "android.widget.EditText");
        A0x.put("grid", "android.widget.GridView");
        A0x.put("image", "android.widget.ImageView");
        A0x.put("list", "android.widget.AbsListView");
        A0x.put("pager", "androidx.viewpager.widget.ViewPager");
        A0x.put("radio_button", "android.widget.RadioButton");
        A0x.put("seek_control", "android.widget.SeekBar");
        A0x.put("switch", "android.widget.Switch");
        A0x.put("tab_bar", "android.widget.TabWidget");
        A0x.put("toggle_button", "android.widget.ToggleButton");
        A0x.put("view_group", "android.view.ViewGroup");
        A0x.put("web_view", "android.webkit.WebView");
        A0x.put("progress_bar", "android.widget.ProgressBar");
        A0x.put("action_bar_tab", "android.app.ActionBar$Tab");
        A0x.put("drawer_layout", "androidx.drawerlayout.widget.DrawerLayout");
        A0x.put("sliding_drawer", "android.widget.SlidingDrawer");
        A0x.put("icon_menu", "com.android.internal.view.menu.IconMenuView");
        A0x.put("toast", "android.widget.Toast$TN");
        A0x.put("alert_dialog", "android.app.AlertDialog");
        A0x.put("date_picker_dialog", "android.app.DatePickerDialog");
        A0x.put("time_picker_dialog", "android.app.TimePickerDialog");
        A0x.put("date_picker", "android.widget.DatePicker");
        A0x.put("time_picker", "android.widget.TimePicker");
        A0x.put("number_picker", "android.widget.NumberPicker");
        A0x.put("scroll_view", "android.widget.ScrollView");
        A0x.put("horizontal_scroll_view", "android.widget.HorizontalScrollView");
        A0x.put("keyboard_key", "android.inputmethodservice.Keyboard$Key");
        A0x.put("none", "");
        A08 = Collections.unmodifiableMap(A0x);
        HashMap A0x2 = AnonymousClass000.A0x();
        A0x2.put("click", A00(AnonymousClass032.A05));
        A0x2.put("long_click", A00(AnonymousClass032.A0F));
        A0x2.put("scroll_forward", A00(AnonymousClass032.A0T));
        A0x2.put("scroll_backward", A00(AnonymousClass032.A0R));
        A0x2.put("expand", A00(AnonymousClass032.A0B));
        A0x2.put("collapse", A00(AnonymousClass032.A06));
        A0x2.put("dismiss", A00(AnonymousClass032.A0A));
        A0x2.put("scroll_up", A00(AnonymousClass032.A0X));
        A0x2.put("scroll_left", A00(AnonymousClass032.A0U));
        A0x2.put("scroll_down", A00(AnonymousClass032.A0S));
        A0x2.put("scroll_right", A00(AnonymousClass032.A0V));
        A0x2.put("custom", -1);
        A05 = Collections.unmodifiableMap(A0x2);
        HashMap A0x3 = AnonymousClass000.A0x();
        Integer A0Z = C13680ns.A0Z();
        A0x3.put("percent", A0Z);
        Integer A0Y = C13680ns.A0Y();
        A0x3.put("float", A0Y);
        Integer A0X = C13680ns.A0X();
        A0x3.put("int", A0X);
        A07 = Collections.unmodifiableMap(A0x3);
        HashMap A0x4 = AnonymousClass000.A0x();
        A0x4.put("none", A0X);
        A0x4.put("single", A0Y);
        A0x4.put("multiple", A0Z);
        A06 = Collections.unmodifiableMap(A0x4);
    }

    public AnonymousClass3PB(C14990q7 r9, C31201dg r10, C31201dg r11) {
        this.A02 = r10;
        this.A03 = r11;
        this.A01 = r9;
        HashMap A0x = AnonymousClass000.A0x();
        List<C31201dg> A0M = r10.A0M(55);
        if (A0M != null && !A0M.isEmpty()) {
            for (C31201dg r2 : A0M) {
                String A0J = r2.A0J(35);
                String A0J2 = r2.A0J(36);
                C14930q1 A0H = r2.A0H(38);
                if (A0J != null) {
                    Map map = A05;
                    if (map.containsKey(A0J)) {
                        int A0D = AnonymousClass000.A0D(map.get(A0J));
                        if (map.containsKey("custom") && A0D == AnonymousClass000.A0D(map.get("custom"))) {
                            A0D = this.A00;
                            this.A00 = A0D + 1;
                        }
                        A0x.put(Integer.valueOf(A0D), new C84274Jx(A0H, A0J2, A0D));
                    }
                }
            }
        }
        this.A04 = A0x;
    }

    public static Integer A00(AnonymousClass032 r0) {
        AnonymousClass44n.A00(r0);
        return Integer.valueOf(r0.A00());
    }

    public boolean A03(View view, int i2, Bundle bundle) {
        C14930q1 r3;
        C84274Jx r0 = (C84274Jx) AnonymousClass000.A0Y(this.A04, i2);
        if (r0 == null || (r3 = r0.A01) == null) {
            return super.A03(view, i2, bundle);
        }
        C31201dg r2 = this.A03;
        C14940q2 r02 = new C14940q2();
        r02.A03(r2, 0);
        Object A012 = C29701b3.A01(this.A01, r2, r02.A01(), r3);
        if ((A012 instanceof Number) || (A012 instanceof Boolean)) {
            return C89554cQ.A02(A012);
        }
        C29691b2.A00("bk.components.AndroidNativeAccessibilityExtension", C13680ns.A0i(A012 != null ? "Got a non-boolean result while evaluating action " : "Got a null result while evaluating action ", AnonymousClass000.A0o(), i2));
        return false;
    }

    public void A06(View view, AnonymousClass031 r25) {
        Number number;
        Number number2;
        AnonymousClass031 r9 = r25;
        super.A06(view, r9);
        C31201dg r2 = this.A02;
        boolean A0P = r2.A0P(41, false);
        boolean A0P2 = r2.A0P(49, false);
        boolean A0P3 = r2.A0P(51, false);
        boolean A0P4 = r2.A0P(36, false);
        String A0J = r2.A0J(50);
        String A0J2 = r2.A0J(45);
        String A0J3 = r2.A0J(46);
        String A0J4 = r2.A0J(58);
        String A0J5 = r2.A0J(57);
        C31201dg A0G = r2.A0G(52);
        C31201dg A0G2 = r2.A0G(53);
        C31201dg A0G3 = r2.A0G(54);
        if (A0G != null) {
            String A0J6 = A0G.A0J(40);
            float A082 = A0G.A08(38, -1.0f);
            float A083 = A0G.A08(36, -1.0f);
            float A084 = A0G.A08(35, -1.0f);
            if (A082 >= 0.0f && A084 >= 0.0f && A083 >= 0.0f && (number2 = (Number) A07.get(A0J6)) != null) {
                r9.A0B(C05910Tm.A00(A082, A083, A084, number2.intValue()));
            }
        }
        if (A0G2 != null) {
            int A0A = A0G2.A0A(35, -1);
            int A0A2 = A0G2.A0A(38, -1);
            boolean A0P5 = A0G2.A0P(36, false);
            String A0K = A0G2.A0K(40, "none");
            if (A0A >= -1 && A0A2 >= -1 && (number = (Number) A06.get(A0K)) != null) {
                r9.A0I(AnonymousClass09M.A01(A0A2, A0A, number.intValue(), A0P5));
            }
        }
        if (A0G3 != null) {
            int A0A3 = A0G3.A0A(35, -1);
            int A0A4 = A0G3.A0A(38, -1);
            int A0A5 = A0G3.A0A(36, -1);
            int A0A6 = A0G3.A0A(40, -1);
            if (A0A3 >= 0 && A0A4 >= 0 && A0A5 >= 0 && A0A6 >= 0) {
                r9.A0J(AnonymousClass0WL.A01(A0A4, A0A6, A0A3, A0A5, A0P, A0P2));
            }
        }
        Iterator A0q = C13680ns.A0q(this.A04);
        while (A0q.hasNext()) {
            C84274Jx r11 = (C84274Jx) A0q.next();
            int i2 = r11.A00;
            Map map = A05;
            if (map.containsKey("click") && i2 == AnonymousClass000.A0D(map.get("click"))) {
                r9.A01.setClickable(true);
            } else if (map.containsKey("long_click") && i2 == AnonymousClass000.A0D(map.get("long_click"))) {
                r9.A01.setLongClickable(true);
            }
            String str = r11.A02;
            if (str != null) {
                r9.A09(new AnonymousClass032(i2, str));
            } else {
                r9.A01.addAction(i2);
            }
        }
        if (A0P3) {
            AccessibilityNodeInfo accessibilityNodeInfo = r9.A01;
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(A0P4);
        }
        if (A0J != null) {
            r9.A0H(A0J);
        }
        if (A0J2 != null && !A0J2.equals("none")) {
            Map map2 = A08;
            if (map2.containsKey(A0J2)) {
                r9.A01.setClassName((CharSequence) map2.get(A0J2));
            }
        }
        if (A0J3 != null) {
            r9.A0F(A0J3);
        }
        if (A0J4 != null) {
            r9.A0G(A0J4);
        }
        if (A0J5 != null && !A0J5.isEmpty()) {
            r9.A05();
            r9.A0C(A0J5);
        }
    }
}
