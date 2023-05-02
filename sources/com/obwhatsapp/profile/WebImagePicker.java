package com.obwhatsapp.profile;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass12W;
import X.AnonymousClass1UP;
import X.AnonymousClass1VA;
import X.AnonymousClass2SX;
import X.AnonymousClass35t;
import X.AnonymousClass37E;
import X.AnonymousClass4OZ;
import X.C005402i;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16980tz;
import X.C17130ua;
import X.C17660vR;
import X.C32301g2;
import X.C38411qk;
import X.C38461qp;
import X.C40651uT;
import X.C49132Rg;
import X.C56692oL;
import X.C64363Op;
import X.C94914lg;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.facebook.redex.IDxComparatorShape20S0000000_2_I1;
import com.facebook.redex.IDxSCallbackShape222S0100000_2_I1;
import com.facebook.redex.IDxTListenerShape171S0100000_2_I1;
import com.facebook.redex.ViewOnClickCListenerShape19S0100000_I1_4;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class WebImagePicker extends AnonymousClass1VA {
    public int A00;
    public int A01;
    public Uri A02;
    public View.OnClickListener A03;
    public View A04;
    public View A05;
    public ProgressBar A06;
    public SearchView A07;
    public C17130ua A08;
    public AnonymousClass12W A09;
    public C16980tz A0A;
    public AnonymousClass37E A0B;
    public C56692oL A0C;
    public AnonymousClass4OZ A0D;
    public C38411qk A0E;
    public C17660vR A0F;
    public File A0G;
    public boolean A0H;
    public final C32301g2 A0I;
    public final ArrayList A0J;

    public WebImagePicker() {
        this(0);
        this.A0J = AnonymousClass000.A0u();
        this.A00 = 4;
        this.A0I = new IDxSCallbackShape222S0100000_2_I1(this, 2);
    }

    public WebImagePicker(int i2) {
        this.A0H = false;
        C13680ns.A1G(this, 100);
    }

    public void A1q() {
        if (!this.A0H) {
            this.A0H = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A00 = new AnonymousClass2SX();
            this.A0F = (C17660vR) r1.APW.get();
            this.A0A = C16150sX.A0V(r1);
            this.A08 = C16150sX.A05(r1);
            this.A09 = (AnonymousClass12W) r1.AEM.get();
        }
    }

    public final void A36() {
        int A012 = (int) (C13680ns.A01(this) * 3.3333333f);
        this.A01 = AnonymousClass1UP.A01(this) + (((int) (C13680ns.A01(this) * 1.3333334f)) << 1) + A012;
        Point point = new Point();
        C13680ns.A0s(this, point);
        int i2 = point.x;
        int i3 = i2 / this.A01;
        this.A00 = i3;
        this.A01 = (i2 / i3) - A012;
        C38411qk r0 = this.A0E;
        if (r0 != null) {
            r0.A02.A02(false);
        }
        C38461qp r2 = new C38461qp(this.A05, this.A08, this.A0D, this.A0G, "web-image-picker");
        r2.A00 = this.A01;
        r2.A01 = 4194304;
        r2.A03 = AnonymousClass00T.A04(this, R.drawable.picture_loading);
        r2.A02 = AnonymousClass00T.A04(this, R.drawable.ic_missing_thumbnail_picture);
        this.A0E = r2.A00();
    }

    public final void A37() {
        String charSequence = this.A07.A0k.getText().toString();
        if (TextUtils.isEmpty(charSequence)) {
            this.A05.A09(R.string.str129d, 0);
            return;
        }
        this.A0B.A01(this.A07);
        this.A06.setVisibility(0);
        C13700nu.A0T((TextView) ADA().getEmptyView());
        C56692oL r2 = this.A0C;
        if (charSequence != null) {
            AnonymousClass35t r0 = r2.A00;
            if (r0 != null) {
                r0.A06(false);
            }
            r2.A01 = true;
            WebImagePicker webImagePicker = r2.A02;
            webImagePicker.A0D = new AnonymousClass4OZ(webImagePicker.A08, webImagePicker.A0A, webImagePicker.A0D, charSequence);
            webImagePicker.A0J.clear();
            webImagePicker.A0E.A02.A02(false);
            C38461qp r6 = new C38461qp(webImagePicker.A05, webImagePicker.A08, webImagePicker.A0D, webImagePicker.A0G, "web-image-picker-adapter");
            r6.A00 = webImagePicker.A01;
            r6.A01 = 4194304;
            r6.A03 = AnonymousClass00T.A04(webImagePicker, R.drawable.gray_rectangle);
            r6.A02 = AnonymousClass00T.A04(webImagePicker, R.drawable.ic_missing_thumbnail_picture);
            webImagePicker.A0E = r6.A00();
        }
        AnonymousClass35t r1 = new AnonymousClass35t(r2);
        r2.A00 = r1;
        C13700nu.A0W(r1, r2.A02.A05);
        if (charSequence != null) {
            r2.notifyDataSetChanged();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 151) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            A37();
        } else {
            finish();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A36();
        this.A0C.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str14b2);
        this.A0G = C13700nu.A0C(getCacheDir(), "Thumbs");
        C005402i A0N = C13690nt.A0N(this);
        A0N.A0N(true);
        A0N.A0Q(false);
        A0N.A0O(true);
        this.A0G.mkdirs();
        AnonymousClass4OZ r0 = new AnonymousClass4OZ(this.A08, this.A0A, this.A0D, "");
        this.A0D = r0;
        File[] listFiles = r0.A06.listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles, new IDxComparatorShape20S0000000_2_I1(24));
            int i2 = 0;
            while (true) {
                int length = listFiles.length;
                if (i2 >= length) {
                    break;
                }
                File file = listFiles[i2];
                if (i2 <= length - 16 || file.lastModified() + 86400000 <= System.currentTimeMillis()) {
                    file.delete();
                }
                i2++;
            }
        }
        setContentView((int) R.layout.layout061e);
        this.A06 = (ProgressBar) findViewById(R.id.indefiniteProgressBar);
        String stringExtra = getIntent().getStringExtra("query");
        if (stringExtra != null) {
            stringExtra = C40651uT.A04(stringExtra);
        }
        C64363Op r1 = new C64363Op(A0N.A02(), this);
        this.A07 = r1;
        C13680ns.A0v(this, C13680ns.A0M(r1, R.id.search_src_text), R.color.color06be);
        this.A07.setQueryHint(getString(R.string.str14a4));
        this.A07.setIconified(false);
        SearchView searchView = this.A07;
        searchView.A0A = new C94914lg();
        searchView.A0F(stringExtra);
        SearchView searchView2 = this.A07;
        searchView2.A07 = new ViewOnClickCListenerShape19S0100000_I1_4(this, 14);
        searchView2.A0B = new IDxTListenerShape171S0100000_2_I1(this, 8);
        A0N.A0G(searchView2);
        Bundle A0E2 = C13690nt.A0E(this);
        if (A0E2 != null) {
            this.A02 = (Uri) A0E2.getParcelable("output");
        }
        ListView ADA = ADA();
        ADA.requestFocus();
        ADA.setClickable(false);
        ADA.setBackground((Drawable) null);
        ADA.setDividerHeight(0);
        View inflate = getLayoutInflater().inflate(R.layout.layout061f, ADA, false);
        ADA.addFooterView(inflate, (Object) null, false);
        ADA.setFooterDividersEnabled(false);
        this.A05 = inflate.findViewById(R.id.progress);
        this.A04 = inflate.findViewById(R.id.attribution);
        C56692oL r02 = new C56692oL(this);
        this.A0C = r02;
        A35(r02);
        this.A03 = new ViewOnClickCListenerShape19S0100000_I1_4(this, 15);
        A36();
        this.A09.A03(this.A0I);
        this.A07.requestFocus();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0J.clear();
        this.A0E.A02.A02(true);
        AnonymousClass37E r0 = this.A0B;
        if (r0 != null) {
            r0.A06(true);
            Log.i("webimagesearch/cancel_image_download_task");
            if (this.A0B.A00 != null) {
                Log.i("webimagesearch/cancel_dialog");
                this.A0B.A00.dismiss();
                this.A0B.A00 = null;
            }
            this.A0B = null;
        }
        AnonymousClass35t r1 = this.A0C.A00;
        if (r1 != null) {
            r1.A06(false);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
