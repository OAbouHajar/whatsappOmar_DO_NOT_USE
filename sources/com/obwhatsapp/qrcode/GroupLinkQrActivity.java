package com.obwhatsapp.qrcode;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass36N;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14870pt;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16050sL;
import X.C16150sX;
import X.C16180sb;
import X.C16320sq;
import X.C17190ug;
import X.C17240ul;
import X.C45862Bk;
import X.C45872Bl;
import X.C49132Rg;
import X.C613138k;
import X.C63163Gj;
import X.C812647m;
import X.C86434Sr;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickCListenerShape19S0100000_I1_4;
import com.obwhatsapp.R;
import com.obwhatsapp.RevokeLinkConfirmationDialogFragment;
import com.obwhatsapp.growthlock.InviteLinkUnavailableDialogFragment;
import com.obwhatsapp.qrcode.contactqr.ContactQrContactCardView;
import com.whatsapp.util.Log;

public class GroupLinkQrActivity extends C14530pL implements C45862Bk, C45872Bl {
    public C16000sG A00;
    public AnonymousClass013 A01;
    public C16010sH A02;
    public C17240ul A03;
    public C16050sL A04;
    public C17190ug A05;
    public C86434Sr A06;
    public ContactQrContactCardView A07;
    public String A08;
    public boolean A09;

    public GroupLinkQrActivity() {
        this(0);
    }

    public GroupLinkQrActivity(int i2) {
        this.A09 = false;
        C13680ns.A1G(this, 102);
    }

    public void A1q() {
        if (!this.A09) {
            this.A09 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A05 = C16150sX.A0t(r1);
            this.A00 = C16150sX.A0M(r1);
            this.A01 = C16150sX.A0Z(r1);
            this.A03 = C16150sX.A0o(r1);
        }
    }

    public final void A35(boolean z2) {
        if (z2) {
            Afr(0, R.string.str058f);
        }
        C63163Gj r1 = new C63163Gj(this.A05, this, this.A05, z2);
        C16050sL r0 = this.A04;
        AnonymousClass00B.A06(r0);
        r1.A00(r0);
    }

    public void ASf(int i2, String str, boolean z2) {
        Ac1();
        if (str != null) {
            StringBuilder A0r = AnonymousClass000.A0r("invitelink/gotcode/");
            A0r.append(str);
            A0r.append(" recreate:");
            A0r.append(z2);
            C13680ns.A1V(A0r);
            this.A03.A11.put(this.A04, str);
            this.A08 = str;
            this.A07.setQrCode(TextUtils.isEmpty(str) ? null : C13680ns.A0h("https://chat.whatsapp.com/", str));
            if (z2) {
                Afg(R.string.str1453);
                return;
            }
            return;
        }
        Log.i(C13680ns.A0c(i2, "invitelink/failed/"));
        if (i2 == 436) {
            Afc(InviteLinkUnavailableDialogFragment.A01(true, true));
            this.A03.A11.remove(this.A04);
            return;
        }
        this.A05.A09(C812647m.A00(i2, this.A03.A0m(this.A04)), 0);
        if (TextUtils.isEmpty(this.A08)) {
            finish();
        }
    }

    public void Ace() {
        A35(true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout02e4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        C14530pL.A0W(this, toolbar, this.A01);
        toolbar.setTitle((int) R.string.str058a);
        toolbar.setNavigationOnClickListener(new ViewOnClickCListenerShape19S0100000_I1_4(this, 17));
        Aem(toolbar);
        setTitle(R.string.str15b8);
        C16050sL A0N = C14530pL.A0N(getIntent(), "jid");
        this.A04 = A0N;
        this.A02 = this.A00.A0A(A0N);
        ContactQrContactCardView contactQrContactCardView = (ContactQrContactCardView) findViewById(R.id.group_qr_card);
        this.A07 = contactQrContactCardView;
        contactQrContactCardView.A02(this.A02, true);
        this.A07.setStyle(0);
        boolean A0m = this.A03.A0m(this.A04);
        ContactQrContactCardView contactQrContactCardView2 = this.A07;
        int i2 = R.string.str0ab0;
        if (A0m) {
            i2 = R.string.str0f12;
        }
        contactQrContactCardView2.setPrompt(getString(i2));
        this.A06 = new C86434Sr();
        String A0e = C13690nt.A0e(this.A04, this.A03.A11);
        this.A08 = A0e;
        if (!TextUtils.isEmpty(A0e)) {
            String str = this.A08;
            this.A07.setQrCode(TextUtils.isEmpty(str) ? null : C13680ns.A0h("https://chat.whatsapp.com/", str));
        }
        A35(false);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C14530pL.A0U(this, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        MenuItem menuItem2 = menuItem;
        if (menuItem2.getItemId() == R.id.menuitem_contactqr_share) {
            if (this.A08 == null) {
                A35(false);
                this.A05.A09(R.string.str15fd, 0);
                return true;
            }
            boolean A0m = this.A03.A0m(this.A04);
            Afq(R.string.str058f);
            C16320sq r4 = this.A05;
            C14870pt r12 = this.A05;
            C16040sK r13 = this.A01;
            C16180sb r11 = this.A04;
            int i2 = R.string.str0af5;
            if (A0m) {
                i2 = R.string.str0f1a;
            }
            Object[] objArr = new Object[1];
            String str = this.A08;
            AnonymousClass36N r9 = new AnonymousClass36N(this, r11, r12, r13, C13680ns.A0d(this, TextUtils.isEmpty(str) ? null : C13680ns.A0h("https://chat.whatsapp.com/", str), objArr, 0, i2));
            Bitmap[] bitmapArr = new Bitmap[1];
            C16010sH r6 = this.A02;
            String str2 = this.A08;
            String A0h = TextUtils.isEmpty(str2) ? null : C13680ns.A0h("https://chat.whatsapp.com/", str2);
            int i3 = R.string.str0ab1;
            if (A0m) {
                i3 = R.string.str0f13;
            }
            bitmapArr[0] = new C613138k(r6, getString(i3), A0h, true).A00(this);
            r4.Ack(r9, bitmapArr);
            return true;
        } else if (menuItem2.getItemId() != R.id.menuitem_contactqr_revoke) {
            return super.onOptionsItemSelected(menuItem2);
        } else {
            Afc(RevokeLinkConfirmationDialogFragment.A01(this.A04, true));
            return true;
        }
    }

    public void onStart() {
        super.onStart();
        this.A06.A01(getWindow(), this.A08);
    }

    public void onStop() {
        this.A06.A00(getWindow());
        super.onStop();
    }
}
