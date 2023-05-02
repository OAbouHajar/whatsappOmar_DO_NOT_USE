package X;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.google.android.material.textfield.TextInputLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.community.NewCommunityActivity;
import com.whatsapp.util.ViewOnClickCListenerShape4S0100000_I1;

/* renamed from: X.2Sq  reason: invalid class name and case insensitive filesystem */
public abstract class C49362Sq extends C49372Sr {
    public ImageView A00;
    public WaEditText A01;
    public WaEditText A02;
    public AnonymousClass1L4 A03;
    public C17750va A04;
    public AnonymousClass120 A05;
    public AnonymousClass152 A06;
    public C218115n A07;
    public C17020u3 A08;
    public AnonymousClass121 A09;

    public void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0050);
        this.A00 = (ImageView) AnonymousClass00T.A05(this, R.id.icon);
        this.A02 = (WaEditText) AnonymousClass00T.A05(this, R.id.group_name);
        this.A01 = (WaEditText) AnonymousClass00T.A05(this, R.id.community_description);
        Aem((Toolbar) findViewById(R.id.toolbar));
        boolean z2 = this instanceof NewCommunityActivity;
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0Q(true);
        if (z2) {
            x2.A0N(true);
            i2 = R.string.str0dce;
        } else {
            x2.A0N(true);
            i2 = R.string.str075d;
        }
        x2.A0B(i2);
        this.A00.setImageDrawable(this.A07.A00(getTheme(), getResources(), C49752Vp.A00, R.drawable.avatar_parent_large));
        this.A00.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 9));
        this.A02 = (WaEditText) findViewById(R.id.group_name);
        int A022 = this.A06.A02(C15910s6.A20);
        this.A02.setFilters(new InputFilter[]{new C93744jh(A022)});
        WaEditText waEditText = this.A02;
        C17250um r6 = this.A0B;
        waEditText.addTextChangedListener(new AnonymousClass35O(waEditText, (TextView) findViewById(R.id.name_counter), this.A08, this.A01, r6, this.A08, A022, A022, false));
        if (C15450qv.A00()) {
            ((TextInputLayout) AnonymousClass00T.A05(this, R.id.name_text_container)).setHint(getString(R.string.str04f5));
        } else {
            ((TextView) AnonymousClass00T.A05(this, R.id.name_hint)).setHint(getString(R.string.str04f5));
        }
        this.A01 = (WaEditText) AnonymousClass00T.A05(this, R.id.community_description);
        int A023 = this.A06.A02(C15910s6.A1F);
        C17250um r4 = this.A0B;
        AnonymousClass01V r3 = this.A08;
        AnonymousClass013 r2 = this.A01;
        AnonymousClass01V r16 = r3;
        AnonymousClass013 r17 = r2;
        AnonymousClass38A.A00(this, (ScrollView) AnonymousClass00T.A05(this, R.id.scrollView), (TextView) findViewById(R.id.description_counter), (TextView) findViewById(R.id.description_hint), this.A01, r16, r17, r4, this.A08, A023);
        if (z2) {
            ImageView imageView = (ImageView) AnonymousClass00T.A05(this, R.id.new_community_next_button);
            imageView.setImageDrawable(new C447725m(AnonymousClass00T.A04(this, R.drawable.ic_fab_next), this.A01));
            imageView.setOnClickListener(new ViewOnClickCListenerShape4S0100000_I1(this, 43));
            return;
        }
        ImageView imageView2 = (ImageView) AnonymousClass00T.A05(this, R.id.new_community_next_button);
        imageView2.setImageDrawable(AnonymousClass00T.A04(this, R.drawable.ic_fab_check));
        imageView2.setOnClickListener(new ViewOnClickCListenerShape4S0100000_I1(this, 40));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
