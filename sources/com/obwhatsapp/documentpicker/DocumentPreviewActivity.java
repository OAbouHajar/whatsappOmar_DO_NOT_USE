package com.obwhatsapp.documentpicker;

import X.AnonymousClass1XI;
import X.AnonymousClass1ZW;
import X.AnonymousClass2GQ;
import X.AnonymousClass2P5;
import X.AnonymousClass36D;
import X.AnonymousClass4Y6;
import X.C004601z;
import X.C107995Mg;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C18820xJ;
import X.C221516v;
import X.C41941wu;
import X.C49132Rg;
import X.C49302Si;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Locale;

public class DocumentPreviewActivity extends C49302Si implements C107995Mg {
    public C18820xJ A00;
    public boolean A01;

    public DocumentPreviewActivity() {
        this(0);
    }

    public DocumentPreviewActivity(int i2) {
        this.A01 = false;
        C13680ns.A1G(this, 64);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0a(A1T, r1, this);
            this.A00 = (C18820xJ) r1.A7K.get();
        }
    }

    public final String A38() {
        if (getIntent().getParcelableExtra("uri") == null) {
            return getString(R.string.str18a7);
        }
        return C18820xJ.A04((Uri) getIntent().getParcelableExtra("uri"), this.A08);
    }

    public final void A39(File file, String str) {
        View inflate = ((ViewStub) C004601z.A0E(this.A00, R.id.view_stub_for_document_info)).inflate();
        C13680ns.A0J(inflate, R.id.document_icon).setImageDrawable(AnonymousClass4Y6.A01(this, str, (String) null, true));
        TextView A0L = C13680ns.A0L(inflate, R.id.document_file_name);
        String A05 = AnonymousClass1ZW.A05(150, A38());
        A0L.setText(A05);
        TextView A0L2 = C13680ns.A0L(inflate, R.id.document_info_text);
        String A002 = C221516v.A00(str);
        Locale locale = Locale.US;
        String upperCase = A002.toUpperCase(locale);
        if (TextUtils.isEmpty(upperCase) && !TextUtils.isEmpty(A05)) {
            upperCase = AnonymousClass1XI.A08(A05).toUpperCase(locale);
        }
        int i2 = 0;
        if (file != null) {
            C13680ns.A0L(inflate, R.id.document_size).setText(AnonymousClass2GQ.A03(this.A01, file.length()));
            try {
                i2 = C18820xJ.A00(file, str);
            } catch (C41941wu e2) {
                Log.e("DocumentPreviewActivity/addStaticDocInfoView/ could not get page count", e2);
            }
        }
        String A052 = C18820xJ.A05(this.A01, str, i2);
        if (!TextUtils.isEmpty(A052)) {
            Object[] A1Z = C13690nt.A1Z();
            A1Z[0] = A052;
            upperCase = C13680ns.A0d(this, upperCase, A1Z, 1, R.string.str0729);
        }
        A0L2.setText(upperCase);
    }

    public void ATN(File file, String str) {
        File file2 = file;
        String str2 = str;
        super.ATN(file, str);
        if (isFinishing()) {
            return;
        }
        if (this.A00.A09(str)) {
            this.A05.Acn(new AnonymousClass36D(this, this, this.A00, file2, str2), new Void[0]);
            return;
        }
        this.A01.setVisibility(8);
        this.A03.setVisibility(8);
        A39(file, str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(A38());
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass2P5 r2 = this.A0G;
        if (r2 != null) {
            r2.A00.getViewTreeObserver().removeGlobalOnLayoutListener(r2.A01);
            r2.A05.A08();
            r2.A03.dismiss();
            this.A0G = null;
        }
    }
}
