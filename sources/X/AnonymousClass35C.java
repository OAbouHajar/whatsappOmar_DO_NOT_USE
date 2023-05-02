package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import java.util.List;

/* renamed from: X.35C  reason: invalid class name */
public class AnonymousClass35C extends AnonymousClass3GL {
    public View A00;
    public WaImageView A01;
    public WaTextView A02;
    public List A03;
    public final int A04;
    public final AnonymousClass1MF A05;
    public final AnonymousClass1CX A06;
    public final AnonymousClass5QT A07;
    public final boolean A08;

    public AnonymousClass35C(Context context, LayoutInflater layoutInflater, C14710pd r4, AnonymousClass1MF r5, AnonymousClass1CX r6, AnonymousClass5QT r7, int i2, boolean z2) {
        super(context, layoutInflater, r4, i2);
        this.A06 = r6;
        this.A05 = r5;
        this.A07 = r7;
        this.A04 = C13690nt.A00(z2 ? 1 : 0);
        this.A08 = z2;
    }

    public void A03(View view) {
        View findViewById = view.findViewById(R.id.empty);
        this.A00 = findViewById;
        findViewById.setVisibility(4);
        this.A01 = C13690nt.A0R(view, R.id.empty_image);
        WaTextView A0S = C13680ns.A0S(view, R.id.empty_text);
        this.A02 = A0S;
        A0S.setText(R.string.str16b0);
        if (this.A08) {
            C34151jm r0 = this.A05;
            if (r0 != null) {
                A04(r0);
            } else {
                this.A01.setImageDrawable((Drawable) null);
            }
        }
    }

    public void A04(C34151jm r10) {
        C34151jm r2 = r10;
        this.A05 = r10;
        WaImageView waImageView = this.A01;
        if (waImageView == null) {
            return;
        }
        if (r10 == null) {
            waImageView.setImageDrawable((Drawable) null);
            return;
        }
        AnonymousClass1MF r0 = this.A05;
        int i2 = this.A08;
        r0.A04(waImageView, r2, (C436420x) null, 0, i2, i2, true, true);
    }

    public void A05(List list) {
        this.A03 = list;
        C57482rF A002 = A00();
        A002.A0E(this.A03);
        A002.A01();
        if (this.A00 != null) {
            if (this.A08) {
                this.A02.setText(R.string.str0136);
            }
            int A0C = A00().A0C();
            View view = this.A00;
            int i2 = 8;
            if (A0C == 0) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
    }

    public void APc(View view, ViewGroup viewGroup, int i2) {
        super.APc(view, viewGroup, i2);
        this.A00 = null;
    }
}
