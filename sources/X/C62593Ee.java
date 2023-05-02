package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.3Ee  reason: invalid class name and case insensitive filesystem */
public class C62593Ee implements AnonymousClass5SS {
    public View A00;
    public final AnonymousClass1VI A01;
    public final C16040sK A02;
    public final AnonymousClass1SS A03;
    public final C15860rz A04;
    public final C14710pd A05;

    public C62593Ee(AnonymousClass1VI r1, C16040sK r2, AnonymousClass1SS r3, C15860rz r4, C14710pd r5) {
        this.A05 = r5;
        this.A02 = r2;
        this.A01 = r1;
        this.A04 = r4;
        this.A03 = r3;
    }

    public void AHm() {
        C13680ns.A13(this.A00);
    }

    public boolean AfA() {
        return false;
    }

    public void AhG() {
        View view = this.A00;
        if (AnonymousClass000.A1V(view)) {
            view.setVisibility(0);
            return;
        }
        AnonymousClass1VI r6 = this.A01;
        Activity A012 = C19980zJ.A01(r6.getContext(), C14550pN.class);
        View inflate = LayoutInflater.from(A012).inflate(R.layout.layout006e, r6, false);
        this.A00 = inflate;
        C13680ns.A1B(inflate, this, A012, 5);
        C13680ns.A1A(C004601z.A0E(this.A00, R.id.cancel), this, 25);
        TextView A0L = C13680ns.A0L(this.A00, R.id.banner_body);
        Context context = r6.getContext();
        Object[] A1b = C13680ns.A1b();
        A1b[0] = AnonymousClass1ZW.A06(r6.getContext(), R.color.start);
        A0L.setText(AnonymousClass1ZW.A00(context, A1b, R.string.str00dc));
        r6.addView(this.A00);
        C15860rz r62 = this.A04;
        if (r62.A0J("android_tablet_banner_first_displayed") == -1) {
            r62.A0x("android_tablet_banner_first_displayed");
        }
    }
}
