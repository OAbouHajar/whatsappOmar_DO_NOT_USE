package com.obwhatsapp.migration.export.ui;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass07V;
import X.AnonymousClass2Rf;
import X.C005402i;
import X.C14550pN;
import X.C14710pd;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C16150sX;
import X.C16180sb;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16330sr;
import X.C17250um;
import X.C18260wP;
import X.C19950zG;
import X.C32241fu;
import X.C49132Rg;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4;
import com.obwhatsapp.R;

public class ExportMigrationDataExportedActivity extends C14550pN {
    public C16330sr A00;
    public boolean A01;

    public ExportMigrationDataExportedActivity() {
        this(0);
    }

    public ExportMigrationDataExportedActivity(int i2) {
        this.A01 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 64));
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C16150sX r1 = ((C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent())).A1s;
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
            this.A00 = (C16330sr) r1.A85.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0278);
        setTitle(getString(R.string.str1d15));
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
        }
        TextView textView = (TextView) AnonymousClass00T.A05(this, R.id.export_migrate_main_action);
        View A05 = AnonymousClass00T.A05(this, R.id.export_migrate_sub_action);
        textView.setVisibility(0);
        textView.setText(R.string.str0de0);
        A05.setVisibility(8);
        AnonymousClass07V A012 = AnonymousClass07V.A01((Resources.Theme) null, getResources(), R.drawable.vec_android_to_ios_in_progress);
        AnonymousClass00B.A07(A012, "ExportMigrationDataExportedActivity/getVectorDrawable/drawableId is invalid");
        ((ImageView) AnonymousClass00T.A05(this, R.id.export_migrate_image_view)).setImageDrawable(A012);
        textView.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 12));
        ((TextView) AnonymousClass00T.A05(this, R.id.export_migrate_title)).setText(R.string.str1d09);
        ((TextView) AnonymousClass00T.A05(this, R.id.export_migrate_sub_title)).setText(R.string.str1d12);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String string = getString(R.string.str1d19);
        C32241fu r3 = new C32241fu(this);
        r3.A06(string);
        r3.A09((DialogInterface.OnClickListener) null, getString(R.string.str1d0d));
        r3.A08(new IDxCListenerShape127S0100000_2_I0(this, 80), getString(R.string.str1d0c));
        r3.A00();
        return true;
    }
}
