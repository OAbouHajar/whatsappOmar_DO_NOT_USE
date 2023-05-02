package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import java.util.List;

/* renamed from: X.35D  reason: invalid class name */
public class AnonymousClass35D extends AnonymousClass3GL {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public WaImageView A04;
    public C57482rF A05;
    public List A06;
    public boolean A07;
    public final C16040sK A08;
    public final C009904t A09;
    public final C212613k A0A;
    public final AnonymousClass1MF A0B;
    public final AnonymousClass5QT A0C;
    public final boolean A0D;

    public AnonymousClass35D(Context context, LayoutInflater layoutInflater, C16040sK r4, C14710pd r5, C009904t r6, C212613k r7, AnonymousClass1MF r8, AnonymousClass5QT r9, int i2) {
        super(context, layoutInflater, r5, i2);
        this.A08 = r4;
        this.A09 = r6;
        this.A0A = r7;
        this.A0B = r8;
        this.A0C = r9;
        this.A0D = r7.A0B;
    }

    public void A03(View view) {
        View findViewById = view.findViewById(R.id.empty);
        this.A01 = findViewById;
        findViewById.setVisibility(4);
        TextView A0M = C13680ns.A0M(view, R.id.get_stickers_button);
        this.A02 = A0M;
        AnonymousClass1UP.A06(A0M);
        C13680ns.A19(this.A02, this, 32);
        this.A03 = C13680ns.A0M(view, R.id.empty_text);
        this.A04 = C13690nt.A0R(view, R.id.empty_image);
        this.A00 = view.findViewById(R.id.sticker_avatar_upsell);
        if (this.A0D) {
            C34151jm r0 = this.A05;
            if (r0 != null) {
                A04(r0);
            } else {
                this.A04.setImageDrawable((Drawable) null);
            }
        }
    }

    public void A04(C34151jm r10) {
        C34151jm r2 = r10;
        this.A05 = r10;
        WaImageView waImageView = this.A04;
        if (waImageView == null) {
            return;
        }
        if (r10 == null) {
            waImageView.setImageDrawable((Drawable) null);
            return;
        }
        AnonymousClass1MF r0 = this.A0B;
        int i2 = this.A08;
        r0.A04(waImageView, r2, (C436420x) null, 0, i2, i2, true, true);
    }

    public void A05(List list) {
        C57482rF A002 = A00();
        this.A06 = list;
        A002.A0E(list);
        A002.A01();
        if (this.A01 != null) {
            int A0C2 = A00().A0C();
            View view = this.A01;
            int i2 = 8;
            if (A0C2 == 0) {
                i2 = 0;
            }
            view.setVisibility(i2);
            boolean z2 = this.A07;
            TextView textView = this.A03;
            if (z2) {
                textView.setText(R.string.str16b3);
                this.A02.setVisibility(4);
            } else {
                textView.setText(R.string.str16b2);
                this.A02.setVisibility(0);
            }
            C16040sK r1 = this.A08;
            if (!r1.A0G()) {
                r1.A0G();
            }
            this.A04.setVisibility(0);
            if (this.A0D) {
                this.A03.setText(R.string.str0137);
                this.A02.setVisibility(4);
            }
        }
    }

    public void APc(View view, ViewGroup viewGroup, int i2) {
        super.APc(view, viewGroup, i2);
        C57482rF r1 = this.A05;
        if (r1 != null) {
            r1.A03 = null;
        }
        this.A01 = null;
    }
}
