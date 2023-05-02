package com.obwhatsapp.wabloks.base;

import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.C13680ns;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.ext.WaBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1;
import java.io.Serializable;

public abstract class BkDialogFragment extends Hilt_BkDialogFragment {
    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0094);
        View findViewById = A0H.findViewById(R.id.wa_bloks_dialog_fragment_container);
        AnonymousClass02C A0F = A0F();
        String A1O = A1O();
        if (A0F.A0B(A1O) == null) {
            AnonymousClass050 r2 = new AnonymousClass050(A0F);
            r2.A0D(A1N(), A1O, findViewById.getId());
            r2.A01();
        }
        return A0H;
    }

    public AnonymousClass01A A1N() {
        WaBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1 waBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1 = (WaBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1) this;
        String str = waBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1.A02;
        String str2 = waBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1.A01;
        BkScreenFragment bkScreenFragment = new BkScreenFragment();
        bkScreenFragment.A1F(str);
        bkScreenFragment.A1E(str2);
        bkScreenFragment.A1C();
        bkScreenFragment.A04().putParcelable("screen_cache_config", (Parcelable) null);
        bkScreenFragment.A1C();
        bkScreenFragment.A04().putSerializable("qpl_params", (Serializable) null);
        return bkScreenFragment;
    }

    public String A1O() {
        return "FRAGMENT_CONTENT";
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i2 = configuration.orientation;
        if (i2 == 2) {
            AnonymousClass00B.A06(this);
            AnonymousClass00B.A06(this.A03.getWindow());
            this.A03.getWindow().setLayout((int) (((double) A0D().getWindowManager().getDefaultDisplay().getWidth()) * 0.8d), -2);
        } else if (i2 == 1) {
            Dialog dialog = this.A03;
            AnonymousClass00B.A06(dialog);
            AnonymousClass00B.A06(dialog.getWindow());
            this.A03.getWindow().setLayout(-2, (int) (((double) A0D().getWindowManager().getDefaultDisplay().getHeight()) * 0.85d));
        }
    }
}
