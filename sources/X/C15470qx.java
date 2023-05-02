package X;

import android.os.Bundle;

/* renamed from: X.0qx  reason: invalid class name and case insensitive filesystem */
public class C15470qx {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public String[] A0E;

    public Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putInt("icon_id", this.A00);
        bundle.putInt("title_id", this.A09);
        bundle.putInt("message_id", this.A07);
        bundle.putInt("line1_icon_id", this.A01);
        bundle.putInt("line2_icon_id", this.A03);
        bundle.putInt("line3_icon_id", this.A05);
        bundle.putString("permission_requestor_screen_type", this.A0A);
        bundle.putStringArray("permissions", this.A0E);
        bundle.putBoolean("is_first_time_request", this.A0B);
        bundle.putInt("nth_details_id", this.A08);
        bundle.putInt("line1_message_id", this.A02);
        bundle.putInt("line2_message_id", this.A04);
        bundle.putInt("line3_message_id", this.A06);
        bundle.putBoolean("should_disable_cancel_on_outside_click", this.A0C);
        bundle.putBoolean("should_hide_cancel_button_on_1st_time", this.A0D);
        return bundle;
    }
}
