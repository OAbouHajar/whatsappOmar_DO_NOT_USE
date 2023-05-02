package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;
import com.whatsapp.util.Log;

/* renamed from: X.37u  reason: invalid class name and case insensitive filesystem */
public class C611537u extends C111545gY {
    public ViewGroup A00;
    public ImageView A01;
    public TextView A02;
    public String A03;
    public final C118355uY A04;

    public C611537u(AnonymousClass013 r1, WaBloksActivity waBloksActivity, C118355uY r3) {
        super(r1, waBloksActivity);
        this.A04 = r3;
    }

    public void A03(Intent intent, Bundle bundle) {
        A01().A0J("");
        ViewGroup viewGroup = (ViewGroup) C13680ns.A0H(LayoutInflater.from(A01().A02()), (ViewGroup) A00(), R.layout.layout0095);
        this.A00 = viewGroup;
        this.A01 = C13680ns.A0K(viewGroup, R.id.bk_navigation_logo);
        TextView A0M = C13680ns.A0M(this.A00, R.id.bk_navigation_title);
        this.A02 = A0M;
        AnonymousClass00B.A04(this.A00);
        AnonymousClass00B.A04(this.A01);
        AnonymousClass00B.A04(A0M);
        AnonymousClass2JP.A05(A0M, true);
        if (bundle != null) {
            this.A03 = bundle.getString("bk_navigation_bar_logo");
            A06(this.A01);
        }
        A01().A0O(true);
        A01().A0G(this.A00);
    }

    public void A04(C108615Or r5) {
        try {
            C31201dg r3 = new AnonymousClass4FV(r5.A9T()).A00;
            String A0J = r3.A0J(36);
            this.A01 = A0J;
            this.A03 = r3.A0K(45, "");
            A06(A0J);
        } catch (ClassCastException e2) {
            Log.e(AnonymousClass000.A0g("Bloks: Invalid navigation bar type", e2));
        }
    }

    public final void A06(String str) {
        String str2;
        TextView textView = this.A02;
        if (textView != null) {
            textView.setText(str);
            this.A02.setVisibility(0);
        }
        ImageView imageView = this.A01;
        if (imageView != null && (str2 = this.A03) != null) {
            this.A04.A00(imageView, (C88024Zp) null, str2, str2);
            this.A01.setVisibility(0);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        bundle.putString("bk_navigation_bar_logo", this.A03);
        super.onActivitySaveInstanceState(activity, bundle);
    }
}
