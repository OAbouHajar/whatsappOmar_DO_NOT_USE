package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.2iV  reason: invalid class name and case insensitive filesystem */
public class C54932iV {
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
    public int A0A;
    public int A0B;
    public Context A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public int[] A0G;
    public int[] A0H;
    public int[] A0I;
    public String[] A0J;
    public String[] A0K;

    public C54932iV(Context context) {
        this.A0C = context;
    }

    public Intent A00() {
        Intent intent = new Intent();
        intent.setClassName(this.A0C.getPackageName(), "com.obwhatsapp.RequestPermissionActivity");
        intent.putExtra("drawable_id", this.A01);
        intent.putExtra("drawable_ids", this.A0H);
        intent.putExtra("message_id", this.A06);
        intent.putExtra("message_params_id", this.A0I);
        intent.putExtra("cancel_button_message_id", this.A00);
        intent.putExtra("perm_denial_message_id", this.A09);
        intent.putExtra("perm_denial_message_params_id", this.A0G);
        intent.putExtra("permissions", this.A0K);
        intent.putExtra("force_ui", this.A0D);
        intent.putExtra("minimal_partial_permissions", this.A0J);
        intent.putExtra("title_id", this.A0A);
        intent.putExtra("hide_permissions_rationale", this.A0E);
        intent.putExtra("is_attachment", this.A0F);
        intent.putExtra("drawable_id_v2", this.A02);
        intent.putExtra("message_id_v2", this.A07);
        intent.putExtra("extra_permission_title_id_v2", this.A0B);
        intent.putExtra("extra_permission_nth_details_id_v2", this.A08);
        intent.putExtra("extra_line1_message_id_v2", this.A04);
        intent.putExtra("extra_line2_message_id_v2", this.A05);
        intent.putExtra("extra_line3_message_id_v2", 0);
        intent.putExtra("extra_permission_name_id_v2", 0);
        intent.putExtra("extra_line1_icon_id_v2", this.A03);
        intent.putExtra("extra_line2_icon_id_v2", 0);
        intent.putExtra("extra_line3_icon_id_v2", 0);
        return intent;
    }
}
