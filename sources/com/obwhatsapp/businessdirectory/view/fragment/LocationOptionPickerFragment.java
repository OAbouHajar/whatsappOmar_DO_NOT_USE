package com.obwhatsapp.businessdirectory.view.fragment;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass07M;
import X.AnonymousClass07P;
import X.AnonymousClass09N;
import X.AnonymousClass1GE;
import X.AnonymousClass38W;
import X.AnonymousClass3FJ;
import X.C004601z;
import X.C006602z;
import X.C011105i;
import X.C13680ns;
import X.C13690nt;
import X.C17210ui;
import X.C29151a7;
import X.C32241fu;
import X.C54932iV;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCListenerShape1S0110000_2_I1;
import com.facebook.redex.IDxRCallbackShape215S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import com.obwhatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel;

public class LocationOptionPickerFragment extends Hilt_LocationOptionPickerFragment {
    public RecyclerView A00;
    public AnonymousClass38W A01;
    public AnonymousClass3FJ A02;
    public LocationOptionPickerViewModel A03;
    public final C011105i A04 = A07(new IDxRCallbackShape215S0100000_2_I1(this, 1), new AnonymousClass07M());
    public final C011105i A05 = A07(new IDxRCallbackShape215S0100000_2_I1(this, 2), new AnonymousClass07M());
    public final C011105i A06 = A07(new IDxRCallbackShape215S0100000_2_I1(this, 3), new AnonymousClass07P());

    public static LocationOptionPickerFragment A01(AnonymousClass3FJ r3, String str, double d2, double d3, int i2) {
        LocationOptionPickerFragment locationOptionPickerFragment = new LocationOptionPickerFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("source", i2);
        A0D.putString("country-name", str);
        A0D.putDouble("latitude", d2);
        A0D.putDouble("longitude", d3);
        locationOptionPickerFragment.A0T(A0D);
        locationOptionPickerFragment.A02 = r3;
        return locationOptionPickerFragment;
    }

    public static /* synthetic */ void A02(LocationOptionPickerFragment locationOptionPickerFragment, Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            locationOptionPickerFragment.A01.A00(locationOptionPickerFragment.A02(), locationOptionPickerFragment.A03);
        } else if (intValue == 1) {
            C54932iV r3 = new C54932iV(locationOptionPickerFragment.A0D());
            r3.A01 = R.drawable.permission_location;
            r3.A0K = AnonymousClass1GE.A07;
            r3.A0J = new String[]{"android.permission.ACCESS_COARSE_LOCATION"};
            r3.A09 = R.string.str11ce;
            r3.A06 = R.string.str11d7;
            locationOptionPickerFragment.A05.A00((AnonymousClass09N) null, r3.A00());
        } else if (intValue == 2) {
            locationOptionPickerFragment.A02.A07.Aha();
            locationOptionPickerFragment.A1C();
        } else if (intValue == 3) {
            boolean A0H = AnonymousClass00T.A0H(locationOptionPickerFragment.A0D(), "android.permission.ACCESS_FINE_LOCATION");
            int i2 = R.string.str11d5;
            int i3 = R.string.str01c8;
            if (A0H) {
                i2 = R.string.str11d4;
                i3 = R.string.str0222;
            }
            C32241fu A002 = C32241fu.A00(locationOptionPickerFragment.A0D());
            A002.A02(R.string.str021e);
            A002.A01(i2);
            A002.setPositiveButton(i3, new IDxCListenerShape1S0110000_2_I1(locationOptionPickerFragment, 2, A0H));
            A002.setNegativeButton(R.string.str0e1f, (DialogInterface.OnClickListener) null);
            C13690nt.A1G(A002);
        } else if (intValue == 4) {
            C011105i r8 = locationOptionPickerFragment.A04;
            Context A022 = locationOptionPickerFragment.A02();
            String string = locationOptionPickerFragment.A04().getString("country-name");
            double d2 = locationOptionPickerFragment.A04().getDouble("latitude", 500.0d);
            double d3 = locationOptionPickerFragment.A04().getDouble("longitude", 500.0d);
            Intent intent = new Intent(A022, DirectorySetLocationMapActivity.class);
            intent.putExtra("country_name", string);
            intent.putExtra("latitude", d2);
            intent.putExtra("longitude", d3);
            r8.A00((AnonymousClass09N) null, intent);
        } else {
            throw AnonymousClass000.A0V(AnonymousClass000.A0g("LocationOptionPickerFragment/onViewAction view action not handled: ", num));
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout03ab);
        this.A00 = (RecyclerView) C004601z.A0E(A0H, R.id.rv_location_options);
        C13680ns.A1L(this, this.A03.A00, 38);
        C13680ns.A1L(this, this.A03.A07, 37);
        Bundle bundle2 = this.A05;
        if (bundle2 != null) {
            LocationOptionPickerViewModel locationOptionPickerViewModel = this.A03;
            int i2 = bundle2.getInt("source", -1);
            C17210ui r4 = locationOptionPickerViewModel.A02;
            Integer valueOf = Integer.valueOf(i2);
            Integer A022 = locationOptionPickerViewModel.A04.A02();
            C29151a7 r1 = new C29151a7();
            C29151a7.A00(r1, 35);
            r1.A0F = valueOf;
            r1.A06 = A022;
            r4.A06(r1);
        }
        return A0H;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A03 = (LocationOptionPickerViewModel) new C006602z(this).A01(LocationOptionPickerViewModel.class);
    }
}
