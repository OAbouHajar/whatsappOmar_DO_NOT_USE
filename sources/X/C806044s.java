package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.44s  reason: invalid class name and case insensitive filesystem */
public class C806044s {
    public static void A00(Context context, View view, AnonymousClass031 r6, String str) {
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -2137403731:
                    if (str.equals("Header")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -565577257:
                    if (str.equals("Image Button")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 2368538:
                    if (str.equals("Link")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 70760763:
                    if (str.equals("Image")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 109450440:
                    if (str.equals("Tab Bar")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 1404906583:
                    if (str.equals("Selected Button")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 2001146706:
                    if (str.equals("Button")) {
                        c2 = 6;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    r6.A0L(true);
                    if (view != null) {
                        C004601z.A0o(view, true);
                        return;
                    }
                    return;
                case 1:
                case 6:
                    r6.A01.setClassName("android.widget.Button");
                    return;
                case 2:
                    r6.A01.setClassName("android.widget.Button");
                    r6.A0F(context.getString(C04020Ku.accessibility_link_role));
                    return;
                case 3:
                    r6.A01.setClassName("android.widget.ImageView");
                    r6.A0A(AnonymousClass032.A0Y);
                    return;
                case 4:
                    r6.A01.setClassName("android.widget.TabWidget");
                    return;
                case 5:
                    AccessibilityNodeInfo accessibilityNodeInfo = r6.A01;
                    accessibilityNodeInfo.setClassName("android.widget.Button");
                    accessibilityNodeInfo.setSelected(true);
                    return;
                default:
                    return;
            }
        }
    }
}
