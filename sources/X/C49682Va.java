package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape2S1100000_I0;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2Va  reason: invalid class name and case insensitive filesystem */
public class C49682Va extends C49692Vb {
    public View A00;
    public C16010sH A01;
    public UserJid A02;
    public UserJid A03;
    public final ViewGroup A04;
    public final C16040sK A05;
    public final C16000sG A06;
    public final C16080sP A07;
    public final C27421Rr A08;
    public final UserJid A09;
    public final C16320sq A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C49682Va(ViewGroup viewGroup, C16040sK r3, C16000sG r4, C16080sP r5, AnonymousClass1yP r6, C27421Rr r7, C16010sH r8, UserJid userJid, C16320sq r10, boolean z2, boolean z3) {
        super(r6, 30);
        this.A05 = r3;
        this.A0A = r10;
        this.A06 = r4;
        this.A07 = r5;
        this.A08 = r7;
        this.A09 = userJid;
        this.A04 = viewGroup;
        this.A0B = z2;
        this.A0C = z3;
        this.A01 = r8;
    }

    public final void A05() {
        int i2;
        View view = this.A00;
        AnonymousClass00B.A04(view);
        TextView textView = (TextView) view.findViewById(R.id.change_number_text);
        boolean A0G = this.A05.A0G();
        boolean equals = this.A09.equals(this.A03);
        if (!A0G) {
            i2 = R.string.str040e;
            if (equals) {
                i2 = R.string.str0410;
            }
        } else {
            i2 = R.string.str040f;
            if (equals) {
                i2 = R.string.str0411;
            }
        }
        C16000sG r1 = this.A06;
        UserJid userJid = this.A03;
        AnonymousClass00B.A06(userJid);
        String A082 = this.A07.A08(r1.A0A(userJid));
        textView.setText(((Context) this.A01).getString(i2, new Object[]{A082}));
        this.A00.setOnClickListener(new ViewOnClickCListenerShape2S1100000_I0(4, A082, this));
        this.A00.findViewById(R.id.change_number_dismiss).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 28));
    }
}
