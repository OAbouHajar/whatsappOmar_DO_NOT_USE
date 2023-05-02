package com.whatsapp.stickers.thirdparty;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass04o;
import X.AnonymousClass0LL;
import X.AnonymousClass1ZW;
import X.AnonymousClass2Re;
import X.AnonymousClass2TA;
import X.C001000l;
import X.C13680ns;
import X.C13690nt;
import X.C14870pt;
import X.C16320sq;
import X.C16490t9;
import X.C16690tT;
import X.C32241fu;
import X.C41781we;
import X.C50292Yt;
import X.C610036y;
import X.C78373xv;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape20S0100000_I1_5;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class AddThirdPartyStickerPackActivity extends C001000l implements AnonymousClass006 {
    public C16490t9 A00;
    public C610036y A01;
    public C50292Yt A02;
    public C16320sq A03;
    public boolean A04;
    public final Object A05;
    public volatile AnonymousClass2Re A06;

    public class AddStickerPackDialogFragment extends Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment {
        public C14870pt A00;
        public C50292Yt A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public final View.OnClickListener A06 = new ViewOnClickCListenerShape20S0100000_I1_5(this, 39);
        public final View.OnClickListener A07 = new ViewOnClickCListenerShape20S0100000_I1_5(this, 38);
        public final View.OnClickListener A08 = new ViewOnClickCListenerShape20S0100000_I1_5(this, 37);
        public final C41781we A09 = new C78373xv(this);

        public static AddStickerPackDialogFragment A01(String str, String str2, String str3) {
            Bundle A0D = C13690nt.A0D();
            A0D.putString("sticker_pack_id", str);
            A0D.putString("sticker_pack_authority", str2);
            A0D.putString("sticker_pack_name", str3);
            AddStickerPackDialogFragment addStickerPackDialogFragment = new AddStickerPackDialogFragment();
            addStickerPackDialogFragment.A0T(A0D);
            return addStickerPackDialogFragment;
        }

        public void A12() {
            super.A12();
            C50292Yt r0 = this.A01;
            r0.A01.A03(this.A09);
        }

        public void A17(Bundle bundle) {
            super.A17(bundle);
            C50292Yt r0 = this.A01;
            r0.A01.A02(this.A09);
        }

        public Dialog A1B(Bundle bundle) {
            super.A1B(bundle);
            Bundle bundle2 = this.A05;
            if (bundle2 != null) {
                this.A03 = bundle2.getString("sticker_pack_id");
                this.A02 = bundle2.getString("sticker_pack_authority");
                String string = bundle2.getString("sticker_pack_name");
                this.A04 = string;
                if (string != null) {
                    this.A05 = Html.escapeHtml(string);
                }
            }
            View inflate = LayoutInflater.from(A0u()).inflate(R.layout.layout0065, (ViewGroup) null);
            C13680ns.A0M(inflate, R.id.message_text_view).setText(C13690nt.A0c(this, A0J(R.string.str1cf7), C13680ns.A1b(), 0, R.string.str1979));
            View findViewById = inflate.findViewById(R.id.ok_button);
            findViewById.setVisibility(8);
            findViewById.setOnClickListener(this.A08);
            View findViewById2 = inflate.findViewById(R.id.cancel_button);
            findViewById2.setVisibility(8);
            findViewById2.setOnClickListener(this.A07);
            View findViewById3 = inflate.findViewById(R.id.add_button);
            findViewById3.setOnClickListener(this.A06);
            findViewById3.setVisibility(8);
            C32241fu A002 = C32241fu.A00(A02());
            A002.setView(inflate);
            return A002.create();
        }

        public final void A1N(String str, int i2, int i3, int i4) {
            Dialog dialog = this.A03;
            if (dialog != null) {
                View findViewById = dialog.findViewById(R.id.message_text_view);
                AnonymousClass00B.A04(findViewById);
                ((TextView) findViewById).setText(AnonymousClass1ZW.A01(str, new Object[0]));
                AnonymousClass0LL.A00(dialog, R.id.progress_bar).setVisibility(i2);
                AnonymousClass0LL.A00(dialog, R.id.ok_button).setVisibility(i3);
                AnonymousClass0LL.A00(dialog, R.id.cancel_button).setVisibility(i4);
                AnonymousClass0LL.A00(dialog, R.id.add_button).setVisibility(i4);
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            C001000l A0C = A0C();
            if (A0C != null) {
                A0C.finish();
                A0C.overridePendingTransition(0, 0);
            }
        }
    }

    public AddThirdPartyStickerPackActivity() {
        this(0);
    }

    public AddThirdPartyStickerPackActivity(int i2) {
        this.A05 = C13690nt.A0Y();
        this.A04 = false;
        C13680ns.A1G(this, 134);
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A00(this, super.ABj());
    }

    public final Object generatedComponent() {
        if (this.A06 == null) {
            synchronized (this.A05) {
                if (this.A06 == null) {
                    this.A06 = new AnonymousClass2Re(this);
                }
            }
        }
        return this.A06.generatedComponent();
    }

    public void onCreate(Bundle bundle) {
        String packageName;
        String A0h;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("sticker_pack_id");
        String stringExtra2 = getIntent().getStringExtra("sticker_pack_authority");
        String stringExtra3 = getIntent().getStringExtra("sticker_pack_name");
        if (!(getCallingActivity() == null || (packageName = getCallingActivity().getPackageName()) == null)) {
            ProviderInfo resolveContentProvider = this.A02.A00.resolveContentProvider(stringExtra2, 128);
            if (resolveContentProvider == null) {
                A0h = C13680ns.A0h("cannot find the provider for authority: ", stringExtra2);
            } else if (!packageName.equals(resolveContentProvider.packageName)) {
                StringBuilder A0r = AnonymousClass000.A0r("the calling activity: ");
                A0r.append(packageName);
                A0r.append(" does not own authority: ");
                A0h = AnonymousClass000.A0h(stringExtra2, A0r);
            }
            Intent A09 = C13680ns.A09();
            A09.putExtra("validation_error", A0h);
            setResult(0, A09);
            Log.e(A0h);
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        C610036y r2 = new C610036y(this, this.A00, this.A02, stringExtra, stringExtra2, stringExtra3);
        this.A01 = r2;
        C13680ns.A1U(r2, this.A03);
    }

    public void onDestroy() {
        super.onDestroy();
        C610036y r0 = this.A01;
        if (r0 != null && !C16690tT.A02(r0)) {
            this.A01.A06(true);
        }
    }
}
