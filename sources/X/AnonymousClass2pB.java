package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.2pB  reason: invalid class name */
public class AnonymousClass2pB extends LinearLayout implements AnonymousClass006 {
    public C15860rz A00;
    public C16070sO A01;
    public AnonymousClass18O A02;
    public GroupJid A03;
    public C52662eE A04;
    public boolean A05;
    public final View A06;
    public final AnonymousClass28S A07;

    public AnonymousClass2pB(Context context, AnonymousClass2AT r5) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A00 = C16150sX.A0Y(A002);
            this.A02 = (AnonymousClass18O) A002.ABN.get();
            this.A01 = C16150sX.A0e(A002);
        }
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.inflate(getContext(), R.layout.layout0110, this);
        this.A07 = new C102414yu(r5, this);
        View A0E = C004601z.A0E(this, R.id.invite_members_row);
        this.A06 = A0E;
        C34331k5.A04(A0E, this, context, 45);
        C34331k5.A04(C004601z.A0E(this, R.id.invite_members_remove_button), this, r5, 46);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A04;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass18O r0 = this.A02;
        r0.A00.add(this.A07);
    }

    public void onDetachedFromWindow() {
        AnonymousClass18O r0 = this.A02;
        r0.A00.remove(this.A07);
        super.onDetachedFromWindow();
    }
}
