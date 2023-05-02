package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.5e7  reason: invalid class name and case insensitive filesystem */
public class C110435e7 extends LinearLayout implements AnonymousClass006 {
    public View A00;
    public ImageView A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public AnonymousClass2Ao A09;
    public C17200uh A0A;
    public AnonymousClass013 A0B;
    public C52662eE A0C;
    public boolean A0D;

    public C110435e7(Context context) {
        super(context);
        if (!this.A0D) {
            this.A0D = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A0A = C16150sX.A0R(A002);
            this.A0B = C16150sX.A0Z(A002);
        }
        C13680ns.A0G(this).inflate(R.layout.layout02ff, this, true);
        setOrientation(1);
        this.A02 = C13680ns.A0K(this, R.id.profile_image);
        this.A08 = C13680ns.A0M(this, R.id.profile_payment_name);
        this.A07 = C13680ns.A0M(this, R.id.profile_payment_handler);
        this.A09 = this.A0A.A03(getContext(), "india-upi-payment-settings-header-row");
        this.A03 = (LinearLayout) findViewById(R.id.profile_container);
        this.A05 = (LinearLayout) findViewById(R.id.send_payment_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.scan_qr_container);
        this.A04 = linearLayout;
        this.A06 = C13680ns.A0L(linearLayout, R.id.scan_qr);
        this.A00 = findViewById(R.id.divider_above_send_payment);
        this.A01 = C13680ns.A0J(this, R.id.profile_details_icon);
    }

    public void A00(C16010sH r6, String str, String str2) {
        this.A03.setVisibility(0);
        this.A00.setVisibility(0);
        this.A09.A06(this.A02, r6);
        this.A08.setText(str);
        this.A07.setText(C13700nu.A0F(getResources(), str2, C13680ns.A1b(), 0, R.string.str1b1e));
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0C;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public LinearLayout getProfileContainer() {
        return this.A03;
    }

    public LinearLayout getScanQrContainer() {
        return this.A04;
    }

    public LinearLayout getSendPaymentContainer() {
        return this.A05;
    }

    public void setScanQrText(int i2) {
        this.A06.setText(i2);
    }
}
