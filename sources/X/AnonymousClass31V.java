package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;

/* renamed from: X.31V  reason: invalid class name */
public class AnonymousClass31V extends C45712Ah {
    public final Resources A00;
    public final LayoutInflater A01;
    public final C16080sP A02;

    public AnonymousClass31V(Context context, C16040sK r12, C16000sG r13, C16080sP r14, AnonymousClass2Ao r15, C30001ba r16, AnonymousClass1YG r17, C16460t6 r18, ViewOnClickCListenerShape0S0200000_I0 viewOnClickCListenerShape0S0200000_I0) {
        super(context, r12, r13, r15, r16, r17, r18, viewOnClickCListenerShape0S0200000_I0);
        this.A01 = LayoutInflater.from(context);
        this.A00 = context.getResources();
        this.A02 = r14;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        String A0G;
        View inflate = view != null ? view : this.A01.inflate(R.layout.layout0376, viewGroup, false);
        ViewGroup A0K = C13690nt.A0K(inflate, R.id.chat_bubble_container);
        TextView A0M = C13680ns.A0M(inflate, R.id.kept_by_footer_tv);
        if (A0K == null || A0M == null) {
            return super.getView(i2, view, viewGroup);
        }
        View view2 = super.getView(i2, A0K.getChildAt(0), viewGroup);
        if (view == null) {
            A0K.addView(view2);
        }
        C16740tZ A04 = getItem(i2);
        AnonymousClass00B.A06(A04);
        C39191s4 r2 = A04.A1A;
        if (r2 != null && !r2.A11.A02) {
            Resources resources = this.A00;
            Object[] A1b = C13680ns.A1b();
            C16000sG r1 = this.A02;
            C16080sP r3 = this.A02;
            UserJid A0C = r2.A0C();
            if (A0C == null) {
                A0G = null;
            } else {
                C16010sH A0A = r1.A0A(A0C);
                int i3 = 2;
                if (C16030sJ.A0L(A04.A11.A00)) {
                    i3 = 1;
                }
                A0G = r3.A0G(A0A, i3, false);
            }
            A0M.setText(C13700nu.A0F(resources, A0G, A1b, 0, R.string.str0bf8));
        }
        return inflate;
    }
}
