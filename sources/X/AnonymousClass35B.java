package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.R;

/* renamed from: X.35B  reason: invalid class name */
public class AnonymousClass35B extends AnonymousClass3GL {
    public int A00;
    public View A01;
    public TextView A02;
    public CircularProgressBar A03;
    public C37771pi A04;
    public final AnonymousClass1MF A05;
    public final AnonymousClass1CX A06;
    public final AnonymousClass5QT A07;

    public AnonymousClass35B(Context context, LayoutInflater layoutInflater, C14710pd r3, AnonymousClass1MF r4, C37771pi r5, AnonymousClass1CX r6, AnonymousClass5QT r7, int i2) {
        super(context, layoutInflater, r3, i2);
        this.A06 = r6;
        this.A05 = r4;
        this.A04 = r5;
        this.A07 = r7;
    }

    public void A03(View view) {
        this.A03 = (CircularProgressBar) C004601z.A0E(view, R.id.pack_loading);
        this.A02 = C13680ns.A0L(view, R.id.pack_loading_text);
        View A0E = C004601z.A0E(view, R.id.cancel_button);
        this.A01 = A0E;
        C34331k5.A02(A0E, this, 8);
        A04();
    }

    public void A04() {
        View view;
        if (this instanceof AnonymousClass358) {
            AnonymousClass358 r4 = (AnonymousClass358) this;
            CircularProgressBar circularProgressBar = r4.A03;
            if (!(circularProgressBar == null || r4.A02 == null)) {
                if (r4.A02) {
                    circularProgressBar.setVisibility(0);
                    r4.A02.setVisibility(0);
                    boolean isEmpty = TextUtils.isEmpty(r4.A04.A0H);
                    TextView textView = r4.A02;
                    if (isEmpty) {
                        textView.setText(R.string.str16a6);
                    } else {
                        textView.setText(C13680ns.A0d(r4.A0A, r4.A04.A0H, C13680ns.A1b(), 0, R.string.str16a7));
                    }
                } else {
                    circularProgressBar.setVisibility(8);
                    r4.A02.setVisibility(8);
                }
            }
            if (r4.A00 == null) {
                return;
            }
            if (r4.A04.A04.size() != 0 || r4.A02) {
                r4.A00.setVisibility(8);
                return;
            }
            r4.A00.setVisibility(0);
            C13680ns.A19(r4.A01, r4, 33);
            return;
        }
        CircularProgressBar circularProgressBar2 = this.A03;
        if (circularProgressBar2 != null && this.A02 != null && (view = this.A01) != null) {
            if (this.A04.A05) {
                circularProgressBar2.setVisibility(0);
                this.A02.setVisibility(0);
                this.A01.setVisibility(0);
                boolean isEmpty2 = TextUtils.isEmpty(this.A04.A0H);
                TextView textView2 = this.A02;
                if (isEmpty2) {
                    textView2.setText(R.string.str16a4);
                } else {
                    textView2.setText(C13680ns.A0d(this.A0A, this.A04.A0H, new Object[1], 0, R.string.str16a5));
                }
                int i2 = this.A00;
                CircularProgressBar circularProgressBar3 = this.A03;
                if (i2 >= 0) {
                    circularProgressBar3.setIndeterminate(false);
                    this.A03.setProgress(this.A00);
                    return;
                }
                circularProgressBar3.setIndeterminate(true);
                return;
            }
            view.setVisibility(8);
            this.A03.setVisibility(8);
            this.A02.setVisibility(8);
        }
    }

    public void A05(C37771pi r3) {
        this.A04 = r3;
        A00().A0E(r3.A04);
    }
}
