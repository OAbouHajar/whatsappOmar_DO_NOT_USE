package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.invites.PaymentInviteFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.62d  reason: invalid class name and case insensitive filesystem */
public class C1205662d implements AnonymousClass5Si {
    public View A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public Button A04;
    public Button A05;
    public GridView A06;
    public ImageButton A07;
    public TextView A08;
    public TextView A09;
    public PaymentInviteFragment A0A;
    public final C16000sG A0B;
    public final C16080sP A0C;
    public final C17200uh A0D;
    public final String A0E;
    public final boolean A0F;

    public C1205662d(C16000sG r1, C16080sP r2, C17200uh r3, String str, boolean z2) {
        this.A0F = z2;
        this.A0D = r3;
        this.A0B = r1;
        this.A0C = r2;
        this.A0E = str;
    }

    public void A00(Context context, List list) {
        View view;
        Context context2 = context;
        if (list.size() == 1) {
            String A0E2 = this.A0C.A0E(this.A0B.A0A((C15830rv) list.get(0)));
            this.A04.setText(R.string.str1057);
            this.A08.setText(C13680ns.A0d(context, A0E2, new Object[1], 0, R.string.str0f67));
            this.A09.setText(C13680ns.A0d(context, A0E2, new Object[1], 0, R.string.str0f68));
            if (this.A0F) {
                C13680ns.A0L(this.A00, R.id.incentive_info_text).setText(C13680ns.A0d(context, A0E2, new Object[1], 0, R.string.str0b57));
                view = this.A01;
            }
            C110105dW.A0r(this.A04, this, 110);
            C110105dW.A0s(this.A07, list, this, 19);
            C110105dW.A0r(this.A05, this, 111);
            this.A02.setVisibility(0);
        }
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0u.add(this.A0B.A0A((C15830rv) it.next()));
        }
        this.A06.setAdapter(new C110325dt(context2, context, this.A0D.A04(context, "payment-invite-view-component"), this, A0u, A0u));
        view = this.A06;
        view.setVisibility(0);
        C110105dW.A0r(this.A04, this, 110);
        C110105dW.A0s(this.A07, list, this, 19);
        C110105dW.A0r(this.A05, this, 111);
        this.A02.setVisibility(0);
    }

    public /* bridge */ /* synthetic */ void A5O(Object obj) {
        AnonymousClass4J0 r5 = (AnonymousClass4J0) obj;
        Context context = this.A00.getContext();
        AnonymousClass00B.A06(r5);
        if (1 == r5.A00) {
            this.A03.setVisibility(0);
            this.A02.setVisibility(8);
            return;
        }
        this.A03.setVisibility(8);
        Object obj2 = r5.A01;
        AnonymousClass00B.A06(obj2);
        A00(context, (List) obj2);
    }

    public int AD5() {
        return R.layout.layout0457;
    }

    public void AZf(View view) {
        this.A00 = view;
        this.A04 = (Button) C004601z.A0E(view, R.id.invite_button);
        this.A05 = (Button) C004601z.A0E(view, R.id.secondary_button);
        this.A06 = (GridView) C004601z.A0E(view, R.id.selected_items);
        this.A02 = C13700nu.A07(view, R.id.invite_ui_content);
        this.A03 = C13700nu.A07(view, R.id.invite_ui_loader);
        this.A07 = (ImageButton) C004601z.A0E(view, R.id.back);
        this.A08 = C13680ns.A0L(view, R.id.payment_invite_bottom_sheet_body);
        this.A09 = C13680ns.A0L(view, R.id.payment_invite_bottom_sheet_title);
        this.A01 = C13700nu.A07(view, R.id.incentive_info_container);
    }
}
