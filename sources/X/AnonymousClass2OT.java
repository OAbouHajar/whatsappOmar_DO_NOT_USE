package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxObserverShape34S0200000_1_I0;
import com.facebook.redex.IDxObserverShape36S0200000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.2OT  reason: invalid class name */
public class AnonymousClass2OT extends LinearLayout implements AnonymousClass006 {
    public C19980zJ A00;
    public C14870pt A01;
    public C17230uk A02;
    public C16000sG A03;
    public C16080sP A04;
    public C16070sO A05;
    public C14710pd A06;
    public C217915l A07;
    public C16050sL A08;
    public C16320sq A09;
    public C52662eE A0A;
    public List A0B;
    public boolean A0C;
    public final View A0D;
    public final View A0E;
    public final View A0F;
    public final View A0G;
    public final View A0H;
    public final View A0I;
    public final AnonymousClass2AS A0J;

    public AnonymousClass2OT(Context context) {
        super(context);
        if (!this.A0C) {
            this.A0C = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A06 = (C14710pd) r1.A05.get();
            this.A01 = (C14870pt) r1.AB3.get();
            this.A09 = (C16320sq) r1.ARB.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A03 = (C16000sG) r1.A4x.get();
            this.A04 = (C16080sP) r1.AQ9.get();
            this.A07 = (C217915l) r1.AOG.get();
            this.A02 = (C17230uk) r1.A4I.get();
            this.A05 = (C16070sO) r1.ABY.get();
        }
        C001100m r3 = (C001100m) C19980zJ.A01(context, C000900k.class);
        AnonymousClass2AS r4 = (AnonymousClass2AS) new C006602z(r3).A01(AnonymousClass2AS.class);
        this.A0J = r4;
        View inflate = LinearLayout.inflate(getContext(), R.layout.layout010f, this);
        this.A0H = inflate;
        this.A0F = C004601z.A0E(inflate, R.id.community_no_longer_description);
        View A0E2 = C004601z.A0E(inflate, R.id.report_community_button);
        this.A0I = A0E2;
        View A0E3 = C004601z.A0E(inflate, R.id.deactivate_community_btn);
        this.A0D = A0E3;
        View A0E4 = C004601z.A0E(inflate, R.id.delete_community_btn);
        this.A0E = A0E4;
        View A0E5 = C004601z.A0E(inflate, R.id.exit_community_btn);
        this.A0G = A0E5;
        A0E2.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 32, context));
        A0E4.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 31, context));
        A0E3.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 33, context));
        A0E5.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 19));
        r4.A0w.A0A(r3, new IDxObserverShape115S0100000_2_I0((Object) context, 186));
        r4.A08.A0A(r3, new IDxObserverShape34S0200000_1_I0(context, 3, this));
        r4.A0u.A0A(r3, new IDxObserverShape36S0200000_2_I0(context, 6, this));
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0A;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }
}
