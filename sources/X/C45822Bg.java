package X;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.calllink.view.CallLinkActivity;
import com.whatsapp.util.ViewOnClickCListenerShape0S0300000_I0;

/* renamed from: X.2Bg  reason: invalid class name and case insensitive filesystem */
public abstract class C45822Bg extends C45832Bh {
    public ViewGroup A00;
    public LinearLayout A01;
    public TextView A02;

    public View A35() {
        View inflate = View.inflate(this, R.layout.layout0556, (ViewGroup) null);
        ViewGroup viewGroup = this.A00;
        AnonymousClass00B.A04(viewGroup);
        viewGroup.addView(inflate);
        return inflate;
    }

    public C70483h0 A36() {
        C70483h0 r3 = new C70483h0();
        ViewOnClickCListenerShape3S0200000_I0 viewOnClickCListenerShape3S0200000_I0 = new ViewOnClickCListenerShape3S0200000_I0(this, 1, r3);
        r3.A00 = A35();
        r3.A00(viewOnClickCListenerShape3S0200000_I0, getString(R.string.str0600), R.drawable.ic_action_copy);
        return r3;
    }

    public C70503h2 A37() {
        C70503h2 r4 = new C70503h2();
        ViewOnClickCListenerShape3S0200000_I0 viewOnClickCListenerShape3S0200000_I0 = new ViewOnClickCListenerShape3S0200000_I0(this, 2, r4);
        if (!(this instanceof CallLinkActivity)) {
            this.A01.setOnClickListener(new ViewOnClickCListenerShape0S0300000_I0(this, r4, viewOnClickCListenerShape3S0200000_I0, 0));
        }
        r4.A00 = A35();
        r4.A00(viewOnClickCListenerShape3S0200000_I0, getString(R.string.str1606), R.drawable.ic_share);
        return r4;
    }

    public C70493h1 A38() {
        C70493h1 r6 = new C70493h1();
        ViewOnClickCListenerShape3S0200000_I0 viewOnClickCListenerShape3S0200000_I0 = new ViewOnClickCListenerShape3S0200000_I0(this, 3, r6);
        String string = getString(R.string.str1cf7);
        r6.A00 = A35();
        r6.A00(viewOnClickCListenerShape3S0200000_I0, getString(R.string.str1608, new Object[]{string}), R.drawable.ic_action_forward);
        return r6;
    }

    public void A39() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this, R.style.style024b);
        View view = new View(contextThemeWrapper, (AttributeSet) null, R.style.style024b);
        view.setLayoutParams(new LinearLayout.LayoutParams(contextThemeWrapper, (AttributeSet) null));
        ViewGroup viewGroup = this.A00;
        AnonymousClass00B.A04(viewGroup);
        viewGroup.addView(view);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0555);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (this instanceof CallLinkActivity) {
            Aem(toolbar);
        } else {
            toolbar.setVisibility(8);
        }
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        this.A00 = (ViewGroup) AnonymousClass00T.A05(this, R.id.share_link_root);
        this.A02 = (TextView) AnonymousClass00T.A05(this, R.id.link);
        this.A01 = (LinearLayout) AnonymousClass00T.A05(this, R.id.link_btn);
    }
}
