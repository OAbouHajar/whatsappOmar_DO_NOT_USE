package X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.5oP  reason: invalid class name and case insensitive filesystem */
public abstract class C114695oP extends C114705oQ implements AnonymousClass686 {
    public C52372dh A00;
    public C20180zd A01;
    public AnonymousClass633 A02;
    public String A03;
    public String A04;
    public boolean A05 = true;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        C20180zd r2 = this.A01;
        if (r2 != null) {
            Intent intent = getIntent();
            C18450wi.A0F(intent);
            String stringExtra = intent.getStringExtra("fds_observer_id");
            C18450wi.A0F(stringExtra);
            C52372dh A022 = r2.A02(stringExtra);
            this.A00 = A022;
            C110105dW.A1N(A022, C1206562m.class, this, 8);
            C52372dh r22 = this.A00;
            if (r22 != null) {
                C110105dW.A1N(r22, C1206662n.class, this, 9);
            }
            C52372dh r23 = this.A00;
            if (r23 != null) {
                C110105dW.A1N(r23, C1036652g.class, this, 10);
            }
            Intent intent2 = getIntent();
            C18450wi.A0F(intent2);
            String stringExtra2 = intent2.getStringExtra("fds_state_name");
            C18450wi.A0F(stringExtra2);
            C18450wi.A0B(stringExtra2);
            this.A04 = stringExtra2;
            return;
        }
        C18450wi.A0O("uiObserversFactory");
        throw AnonymousClass000.A0a("Redex: Unreachable code after no-return invoke");
    }

    public void onDestroy() {
        super.onDestroy();
        C52372dh r0 = this.A00;
        if (r0 != null) {
            r0.A03(this);
        }
        this.A00 = null;
    }
}
