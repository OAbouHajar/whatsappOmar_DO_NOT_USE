package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxObserverShape36S0200000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2SL  reason: invalid class name */
public abstract class AnonymousClass2SL extends AnonymousClass2SN {
    public AnonymousClass2SO A00;
    public C24511Gf A01;
    public C17170ue A02;
    public UserJid A03;
    public AnonymousClass1KS A04;
    public String A05;
    public final C15220qW A06 = new AnonymousClass1DV(new C106265De(this));
    public final C15220qW A07 = new AnonymousClass1DV(new AnonymousClass3Ik(this));

    public final UserJid A35() {
        UserJid userJid = this.A03;
        if (userJid != null) {
            return userJid;
        }
        C18450wi.A0O("bizJid");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable parcelableExtra = bundle == null ? getIntent().getParcelableExtra("business_owner_jid") : bundle.getParcelable("business_owner_jid");
        AnonymousClass00B.A06(parcelableExtra);
        C18450wi.A0B(parcelableExtra);
        UserJid userJid = (UserJid) parcelableExtra;
        C18450wi.A0H(userJid, 0);
        this.A03 = userJid;
        C15220qW r3 = this.A07;
        ((C64443Ps) r3.getValue()).A00.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 90));
        ((C64443Ps) r3.getValue()).A01.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 89));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18450wi.A0H(menu, 0);
        MenuItem findItem = menu.findItem(R.id.menu_cart);
        findItem.setActionView(R.layout.layout03db);
        View actionView = findItem.getActionView();
        C18450wi.A0F(actionView);
        AnonymousClass2JP.A02(actionView);
        View actionView2 = findItem.getActionView();
        C18450wi.A0F(actionView2);
        actionView2.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 25));
        View actionView3 = findItem.getActionView();
        C18450wi.A0F(actionView3);
        TextView textView = (TextView) actionView3.findViewById(R.id.cart_total_quantity);
        if (this.A05 != null) {
            C18450wi.A0F(textView);
            textView.setText(this.A05);
        }
        C15220qW r3 = this.A06;
        ((AnonymousClass2XA) r3.getValue()).A00.A0A(this, new IDxObserverShape36S0200000_2_I0(findItem, 0, this));
        ((AnonymousClass2XA) r3.getValue()).A06();
        return super.onCreateOptionsMenu(menu);
    }

    public void onResume() {
        super.onResume();
        ((C64443Ps) this.A07.getValue()).A03.A00();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18450wi.A0H(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("business_owner_jid", A35());
    }
}
