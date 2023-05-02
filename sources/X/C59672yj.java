package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2yj  reason: invalid class name and case insensitive filesystem */
public class C59672yj extends C65123Sy {
    public int A00;
    public final Button A01;
    public final LinearLayout A02;
    public final TextView A03;
    public final C19980zJ A04;
    public final C16040sK A05;
    public final C16000sG A06;
    public final C17030uP A07;
    public final C16080sP A08;
    public final UserJid A09;

    public C59672yj(View view, C19980zJ r3, C16040sK r4, C16000sG r5, C17030uP r6, C16080sP r7, UserJid userJid) {
        super(view);
        this.A05 = r4;
        this.A04 = r3;
        this.A02 = (LinearLayout) view.findViewById(R.id.catalog_list_footer_end_of_results);
        this.A03 = C13680ns.A0M(view, R.id.catalog_list_footer_end_of_results_title);
        this.A08 = r7;
        this.A07 = r6;
        this.A06 = r5;
        this.A09 = userJid;
        this.A01 = (Button) view.findViewById(R.id.end_of_results_button);
    }

    public /* bridge */ /* synthetic */ void A08(C50082Xw r12) {
        Context context;
        int i2;
        View view = this.A0H;
        view.setVisibility(0);
        LinearLayout linearLayout = this.A02;
        linearLayout.setVisibility(8);
        Button button = this.A01;
        button.setVisibility(8);
        TextView textView = this.A03;
        textView.setVisibility(8);
        int i3 = this.A00;
        if (i3 != 1) {
            if (i3 == 2) {
                linearLayout.setVisibility(0);
                textView.setVisibility(0);
                context = view.getContext();
                i2 = R.string.str03eb;
            } else if (i3 != 3) {
                if (i3 == 4) {
                    linearLayout.setVisibility(0);
                    textView.setVisibility(0);
                    context = view.getContext();
                    i2 = R.string.str03c8;
                } else if (i3 == 5) {
                    linearLayout.setVisibility(8);
                    textView.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            C13690nt.A0s(context, textView, i2);
            return;
        }
        C16040sK r0 = this.A05;
        UserJid userJid = this.A09;
        if (!r0.A0I(userJid)) {
            linearLayout.setVisibility(0);
            C28331Vq A002 = this.A07.A00(userJid);
            String str = A002 == null ? null : A002.A08;
            C16010sH A0A = this.A06.A0A(userJid);
            Context context2 = view.getContext();
            Object[] objArr = new Object[1];
            if (AnonymousClass1ZW.A0E(str)) {
                str = this.A08.A08(A0A);
            }
            textView.setText(C13680ns.A0d(context2, str, objArr, 0, R.string.str030c));
            C13690nt.A0s(view.getContext(), button, R.string.str030b);
            button.setVisibility(0);
            textView.setVisibility(0);
            C34331k5.A04(button, this, A0A, 15);
        }
    }
}
