package X;

import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape16S0100000_I1_1;
import com.facebook.redex.ViewOnClickCListenerShape3S0300000_I1;
import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.R;
import com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

/* renamed from: X.2R7  reason: invalid class name */
public class AnonymousClass2R7 implements LocationListener {
    public Location A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public TextView A05;
    public CircularProgressBar A06;
    public C14530pL A07;
    public AnonymousClass26B A08;
    public Double A09;
    public Double A0A;
    public Float A0B = Float.valueOf(16.0f);
    public String A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public final AnonymousClass16R A0H;
    public final C16040sK A0I;
    public final C25511Kb A0J;
    public final AnonymousClass01V A0K;
    public final WhatsAppLibLoader A0L;
    public final /* synthetic */ DirectorySetLocationMapActivity A0M;

    public AnonymousClass2R7(AnonymousClass16R r2, C16040sK r3, C25511Kb r4, DirectorySetLocationMapActivity directorySetLocationMapActivity, AnonymousClass01V r6, WhatsAppLibLoader whatsAppLibLoader) {
        this.A0M = directorySetLocationMapActivity;
        this.A0I = r3;
        this.A0K = r6;
        this.A0L = whatsAppLibLoader;
        this.A0H = r2;
        this.A0J = r4;
    }

    public void A00() {
        this.A0C = null;
        this.A05.setText(R.string.str01cb);
        TextView textView = this.A05;
        int A002 = AnonymousClass00T.A00(this.A07, R.color.color04c0);
    }

    public void A01() {
        LocationManager A0F2 = this.A0K.A0F();
        if (A0F2 != null && !A0F2.isProviderEnabled("gps") && !A0F2.isProviderEnabled("network")) {
            AnonymousClass29T.A01(this.A07, 2);
        }
    }

    public void A02(AnonymousClass4DM r7) {
        View inflate = View.inflate(this.A07, R.layout.layout048d, (ViewGroup) null);
        View A0E2 = C004601z.A0E(inflate, R.id.submit);
        View A0E3 = C004601z.A0E(inflate, R.id.cancel);
        ((TextView) C004601z.A0E(inflate, R.id.permission_message)).setText(R.string.str11d7);
        ((ImageView) C004601z.A0E(inflate, R.id.permission_image_1)).setImageResource(R.drawable.permission_location);
        C32241fu r1 = new C32241fu(this.A07);
        r1.setView(inflate);
        r1.A07(true);
        C005702l create = r1.create();
        if (create.getWindow() != null) {
            create.getWindow().setBackgroundDrawable(new ColorDrawable(AnonymousClass00T.A00(this.A07, R.color.color0792)));
        }
        A0E2.setOnClickListener(new ViewOnClickCListenerShape3S0300000_I1((Object) this, (Object) r7, (Object) create, 7));
        A0E3.setOnClickListener(new ViewOnClickCListenerShape16S0100000_I1_1(create, 3));
        create.show();
        this.A0E = true;
        this.A0J.A02.A00().edit().putBoolean("DIRECTORY_LOCATION_INFO_SHOWN", true).apply();
    }

    public void A03(String str) {
        this.A0C = str;
        if (!TextUtils.isEmpty(str)) {
            this.A05.setText(str);
            TextView textView = this.A05;
            int A002 = AnonymousClass00T.A00(this.A07, R.color.color0507);
        }
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            if (this.A00 == null) {
                DirectorySetLocationMapActivity directorySetLocationMapActivity = this.A0M;
                if (directorySetLocationMapActivity.A01 != null && this.A09 == null && this.A0A == null) {
                    directorySetLocationMapActivity.A0C.setLocationMode(1);
                    directorySetLocationMapActivity.A01.A0A(AnonymousClass2R8.A01(new LatLng(location.getLatitude(), location.getLongitude())));
                }
            }
            DirectorySetLocationMapActivity directorySetLocationMapActivity2 = this.A0M;
            if (directorySetLocationMapActivity2.A09.A0F && directorySetLocationMapActivity2.A01 != null) {
                directorySetLocationMapActivity2.A01.A09(AnonymousClass2R8.A01(new LatLng(location.getLatitude(), location.getLongitude())));
            }
            directorySetLocationMapActivity2.A0C.A06 = location;
            if (AnonymousClass1GE.A01(location, this.A00)) {
                this.A00 = location;
            }
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i2, Bundle bundle) {
    }
}
