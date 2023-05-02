package X;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.greenalert.GreenAlertActivity;
import java.util.TreeMap;

/* renamed from: X.2ro  reason: invalid class name and case insensitive filesystem */
public class C57792ro extends AnonymousClass012 {
    public final C12410kM A00;
    public final C19980zJ A01;
    public final C14870pt A02;
    public final C23071Aj A03;
    public final AnonymousClass01V A04;
    public final C17120uZ A05;
    public final AnonymousClass013 A06;
    public final C17220uj A07;
    public final C18160wF A08;

    public C57792ro(C12410kM r1, C19980zJ r2, C14870pt r3, C23071Aj r4, AnonymousClass01V r5, C17120uZ r6, AnonymousClass013 r7, C17220uj r8, C18160wF r9) {
        this.A02 = r3;
        this.A08 = r9;
        this.A01 = r2;
        this.A03 = r4;
        this.A07 = r8;
        this.A04 = r5;
        this.A06 = r7;
        this.A05 = r6;
        this.A00 = r1;
    }

    public int A01() {
        return 2;
    }

    public Object A05(ViewGroup viewGroup, int i2) {
        NestedScrollView nestedScrollView;
        int i3;
        if (i2 == 0) {
            nestedScrollView = (NestedScrollView) C13680ns.A0G(viewGroup).inflate(R.layout.layout02c4, viewGroup, false);
            TextView A0L = C13680ns.A0L(nestedScrollView, R.id.green_alert_education_title);
            C004601z.A0o(A0L, true);
            A0L.setText(R.string.str0a0b);
            C13680ns.A0L(nestedScrollView, R.id.green_alert_education_intro).setText(R.string.str0a0a);
            View A0E = C004601z.A0E(nestedScrollView, R.id.green_alert_education_image_and_caption_1);
            C13680ns.A0J(A0E, R.id.green_alert_education_image).setImageResource(R.drawable.ga_edu_1);
            C13680ns.A0L(A0E, R.id.green_alert_education_image_caption).setText(Html.fromHtml(C13700nu.A0H(A0E, R.string.str0a07)));
            View A0E2 = C004601z.A0E(nestedScrollView, R.id.green_alert_education_image_and_caption_2);
            C13680ns.A0J(A0E2, R.id.green_alert_education_image).setImageResource(R.drawable.ga_edu_2);
            C13680ns.A0L(A0E2, R.id.green_alert_education_image_caption).setText(Html.fromHtml(C13700nu.A0H(A0E2, R.string.str0a08)));
            View A0E3 = C004601z.A0E(nestedScrollView, R.id.green_alert_education_image_and_caption_3);
            String A0H = A0H(AnonymousClass4ZD.A00);
            C13680ns.A0J(A0E3, R.id.green_alert_education_image).setImageResource(R.drawable.ga_edu_3);
            A0J(C13680ns.A0Q(A0E3, R.id.green_alert_education_image_caption), C13680ns.A0d(A0E3.getContext(), "0", new Object[1], 0, R.string.str0a09), A0H);
        } else if (i2 == 1) {
            nestedScrollView = (NestedScrollView) C13680ns.A0G(viewGroup).inflate(R.layout.layout02c6, viewGroup, false);
            TextView A0L2 = C13680ns.A0L(nestedScrollView, R.id.green_alert_tos_title);
            C004601z.A0o(A0L2, true);
            A0L2.setText(A0F(nestedScrollView.getContext(), GreenAlertActivity.A0O));
            C13680ns.A0L(nestedScrollView, R.id.green_alert_tos_intro).setText(Html.fromHtml(A0F(nestedScrollView.getContext(), GreenAlertActivity.A0I)));
            A0J(C13680ns.A0Q(nestedScrollView, R.id.green_alert_tos_bullets_header), A0G(nestedScrollView.getContext(), GreenAlertActivity.A0J, "0"), A0H(AnonymousClass4ZD.A00));
            A0I(C004601z.A0E(nestedScrollView, R.id.green_alert_tos_bullet_1), A0F(nestedScrollView.getContext(), GreenAlertActivity.A0K), new String[0], R.drawable.ga_tos_1);
            A0I(C004601z.A0E(nestedScrollView, R.id.green_alert_tos_bullet_2), A0F(nestedScrollView.getContext(), GreenAlertActivity.A0L), new String[0], R.drawable.ga_tos_2);
            C18160wF r5 = this.A08;
            if (AnonymousClass4ZD.A00(r5)) {
                C004601z.A0E(nestedScrollView, R.id.green_alert_tos_bullet_3).setVisibility(8);
            } else {
                C004601z.A0E(nestedScrollView, R.id.green_alert_tos_bullet_3).setVisibility(0);
                A0I(C004601z.A0E(nestedScrollView, R.id.green_alert_tos_bullet_3), A0G(nestedScrollView.getContext(), GreenAlertActivity.A0M, "0"), new String[]{A0H(AnonymousClass4ZD.A02)}, R.drawable.ga_tos_3);
            }
            TextEmojiLabel A0Q = C13680ns.A0Q(nestedScrollView, R.id.green_alert_tos_footer);
            String A0G = A0G(nestedScrollView.getContext(), GreenAlertActivity.A0N, "0", "1", "2");
            String[] strArr = new String[3];
            String[] strArr2 = AnonymousClass4ZD.A03;
            C23071Aj r4 = this.A03;
            strArr[0] = r4.A00(strArr2[AnonymousClass4ZD.A00(r5) ? 2 : AnonymousClass000.A1O(r5.A05("BR") ? 1 : 0)]).toString();
            strArr[1] = r4.A00(AnonymousClass4ZD.A01[AnonymousClass4ZD.A00(r5) ? 2 : AnonymousClass000.A1O(r5.A05("BR") ? 1 : 0)]).toString();
            strArr[2] = A0H(AnonymousClass4ZD.A04);
            A0J(A0Q, A0G, strArr);
        } else {
            throw AnonymousClass000.A0T(C13680ns.A0c(i2, "Unknown page: "));
        }
        Context context = nestedScrollView.getContext();
        if (context != null) {
            String string = context.getString(R.string.str1ce6);
            String string2 = context.getString(R.string.str1ce5);
            if (i2 == 0) {
                View findViewById = nestedScrollView.findViewById(R.id.start_list_green_alert_education_view);
                if (findViewById != null) {
                    findViewById.setContentDescription(string);
                }
                i3 = R.id.end_list_green_alert_education_view;
            } else {
                View findViewById2 = nestedScrollView.findViewById(R.id.start_list_green_alert_tos_view);
                if (findViewById2 != null) {
                    findViewById2.setContentDescription(string);
                }
                i3 = R.id.end_list_green_alert_tos_view;
            }
            View findViewById3 = nestedScrollView.findViewById(i3);
            if (findViewById3 != null) {
                findViewById3.setContentDescription(string2);
            }
        }
        nestedScrollView.A0E = this.A00;
        nestedScrollView.setTag(Integer.valueOf(i2));
        viewGroup.addView(nestedScrollView);
        return nestedScrollView;
    }

    public void A0D(ViewGroup viewGroup, Object obj, int i2) {
        viewGroup.removeView((View) obj);
    }

    public boolean A0E(View view, Object obj) {
        return AnonymousClass000.A1Y(view, obj);
    }

    public final String A0F(Context context, int[] iArr) {
        C18160wF r1 = this.A08;
        return context.getString(iArr[(AnonymousClass4ZD.A00(r1) || (r1.A05("BR") && iArr == GreenAlertActivity.A0N)) ? (char) 1 : 0]);
    }

    public final String A0G(Context context, int[] iArr, Object... objArr) {
        C18160wF r1 = this.A08;
        return context.getString(iArr[(AnonymousClass4ZD.A00(r1) || (r1.A05("BR") && iArr == GreenAlertActivity.A0N)) ? (char) 1 : 0], objArr);
    }

    public final String A0H(String[] strArr) {
        C17220uj r2 = this.A07;
        C18160wF r1 = this.A08;
        return r2.A05("security-and-privacy", strArr[AnonymousClass4ZD.A00(r1) ? 2 : AnonymousClass000.A1O(r1.A05("BR") ? 1 : 0)]).toString();
    }

    public final void A0I(View view, String str, String[] strArr, int i2) {
        C13680ns.A0J(view, R.id.green_alert_tos_bullet_image).setImageResource(i2);
        A0J(C13680ns.A0Q(view, R.id.green_alert_tos_bullet_text), str, strArr);
    }

    public final void A0J(TextEmojiLabel textEmojiLabel, String str, String... strArr) {
        int length = strArr.length;
        Object[] objArr = new Object[length];
        TreeMap treeMap = new TreeMap();
        for (int i2 = 0; i2 < length; i2++) {
            String valueOf = String.valueOf(i2);
            objArr[i2] = valueOf;
            treeMap.put(valueOf, Uri.parse(strArr[i2]));
        }
        Context context = textEmojiLabel.getContext();
        C14870pt r6 = this.A02;
        C45922Bq.A09(context, this.A01, r6, textEmojiLabel, this.A04, String.format(C13690nt.A0m(this.A06), str, objArr), treeMap);
    }
}
