package com.obwhatsapp.settings;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass2Rf;
import X.C004601z;
import X.C005402i;
import X.C006602z;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C17250um;
import X.C18260wP;
import X.C18950xW;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C434920f;
import X.C45922Bq;
import X.C49132Rg;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape177S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape219S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;

public class SettingsUserProxyActivity extends C14530pL implements C18950xW {
    public int A00;
    public int A01;
    public int A02;
    public SwitchCompat A03;
    public WaTextView A04;
    public WaTextView A05;
    public SettingsUserProxyViewModel A06;
    public boolean A07;

    public SettingsUserProxyActivity() {
        this(0);
    }

    public SettingsUserProxyActivity(int i2) {
        this.A07 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 90));
    }

    public void A1q() {
        if (!this.A07) {
            this.A07 = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A0C = (C14710pd) r1.A05.get();
            this.A05 = (C14870pt) r1.AB3.get();
            this.A03 = (C16300so) r1.A5p.get();
            this.A04 = (C16180sb) r1.A8b.get();
            this.A0B = (C17250um) r1.A7e.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A08 = (AnonymousClass01V) r1.AOi.get();
            this.A0D = (C19950zG) r1.AQV.get();
            this.A09 = (C15860rz) r1.AQh.get();
            this.A07 = (C18260wP) r1.A4p.get();
            this.A0A = (C16290sm) r1.AQk.get();
            this.A05 = (C16440t3) r1.AP2.get();
            this.A0B = (C23061Ai) r1.AC0.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A04 = (C16190sc) r1.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r1.ANy.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A02 = (C23071Aj) r1.AQb.get();
            this.A03 = (AnonymousClass15P) r1.A0b.get();
            this.A0A = (C19490yW) r1.ALQ.get();
            this.A09 = (C15960sC) r1.AKz.get();
            this.A07 = C16150sX.A0d(r1);
        }
    }

    public final void A35(boolean z2) {
        if (this.A01 != 0 && this.A00 != 0 && this.A02 != 0) {
            SpannableString spannableString = new SpannableString(this.A05.getText());
            SpannableString spannableString2 = new SpannableString(this.A04.getText());
            spannableString.setSpan(new ForegroundColorSpan(z2 ? this.A02 : this.A00), 0, spannableString.length(), 0);
            spannableString2.setSpan(new ForegroundColorSpan(z2 ? this.A01 : this.A00), 0, spannableString2.length(), 0);
            this.A05.setText(spannableString);
            this.A04.setText(spannableString2);
        }
    }

    public /* synthetic */ void ARy() {
    }

    public /* synthetic */ void ARz() {
    }

    public /* synthetic */ void AS0() {
    }

    public /* synthetic */ void AS1() {
    }

    public void onBackPressed() {
        SettingsUserProxyViewModel settingsUserProxyViewModel = this.A06;
        C15860rz r3 = settingsUserProxyViewModel.A0B;
        r3.A0K().putInt("proxy_connection_status", settingsUserProxyViewModel.A00.intValue()).apply();
        r3.A0K().putString("proxy_ip_address", settingsUserProxyViewModel.A01).apply();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A06 = (SettingsUserProxyViewModel) new C006602z(this).A01(SettingsUserProxyViewModel.class);
        setTitle(R.string.str1328);
        setContentView((int) R.layout.layout04ba);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        this.A00 = C434920f.A00(this, R.attr.attr0465, R.color.color070b);
        this.A02 = C434920f.A00(this, R.attr.attr0467, R.color.color0711);
        this.A01 = C434920f.A00(this, R.attr.attr0463, R.color.color0710);
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.proxy_switcher);
        this.A03 = switchCompat;
        switchCompat.setChecked(this.A06.A0F.A02());
        this.A03.setOnCheckedChangeListener(new IDxCListenerShape219S0100000_2_I0(this, 5));
        C14870pt r8 = this.A05;
        C19980zJ r7 = this.A00;
        AnonymousClass01V r10 = this.A08;
        String string = getString(R.string.str1324);
        C45922Bq.A08(this, Uri.parse("https://faq.whatsapp.com/520504143274092"), r7, r8, (TextEmojiLabel) C004601z.A0E(this.A00, R.id.proxy_info_description), r10, string);
        this.A05 = (WaTextView) findViewById(R.id.ip_address_text);
        View findViewById = findViewById(R.id.ip_connection_view_group);
        findViewById.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 4));
        findViewById.setOnLongClickListener(new IDxCListenerShape177S0100000_2_I0(this, 5));
        this.A04 = (WaTextView) findViewById(R.id.connection_status_indicator);
        A35(this.A06.A0F.A02());
        this.A05.Acl(new RunnableRunnableShape14S0100000_I0_13((Object) this, 36));
        SettingsUserProxyViewModel settingsUserProxyViewModel = this.A06;
        settingsUserProxyViewModel.A04.A0B(((SharedPreferences) settingsUserProxyViewModel.A0B.A01.get()).getString("proxy_ip_address", (String) null));
        SettingsUserProxyViewModel settingsUserProxyViewModel2 = this.A06;
        settingsUserProxyViewModel2.A06(((SharedPreferences) settingsUserProxyViewModel2.A0B.A01.get()).getInt("proxy_connection_status", 0), true);
        this.A06.A04.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 287));
        this.A06.A05.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 286));
        this.A06.A06.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 285));
        SettingsUserProxyViewModel settingsUserProxyViewModel3 = this.A06;
        if (settingsUserProxyViewModel3.A0F.A02()) {
            settingsUserProxyViewModel3.A08.A02(settingsUserProxyViewModel3);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
