package X;

import com.facebook.redex.IDxRCallbackShape215S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.businessdirectory.util.LocationUpdateListener;
import com.obwhatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment;

/* renamed from: X.3FJ  reason: invalid class name */
public class AnonymousClass3FJ implements AnonymousClass5ST {
    public final C011105i A00;
    public final AnonymousClass01A A01;
    public final C17180uf A02;
    public final C17210ui A03;
    public final C25511Kb A04;
    public final LocationUpdateListener A05;
    public final AnonymousClass38W A06;
    public final AnonymousClass5T5 A07;
    public final C16260sj A08;

    public AnonymousClass3FJ(AnonymousClass01A r4, C17180uf r5, C17210ui r6, C25511Kb r7, LocationUpdateListener locationUpdateListener, AnonymousClass38W r9, AnonymousClass5T5 r10, C16260sj r11) {
        this.A01 = r4;
        this.A08 = r11;
        this.A05 = locationUpdateListener;
        this.A02 = r5;
        this.A06 = r9;
        this.A04 = r7;
        this.A07 = r10;
        this.A03 = r6;
        this.A00 = r4.A07(new IDxRCallbackShape215S0100000_2_I1(this, 0), new AnonymousClass07M());
    }

    public void A00() {
        AnonymousClass01A r2 = this.A01;
        if (!RequestPermissionActivity.A0W(r2.A0D(), AnonymousClass1GE.A07)) {
            this.A06.A00(r2.A02(), this);
        } else if (this.A08.A05()) {
            this.A07.Aha();
        } else {
            A02();
            this.A07.AcR();
        }
    }

    public void A01() {
        LocationOptionPickerFragment locationOptionPickerFragment = (LocationOptionPickerFragment) this.A01.A0F().A0B("location-options-bottom-sheet");
        if (locationOptionPickerFragment != null) {
            locationOptionPickerFragment.A02 = this;
        }
    }

    public void A02() {
        AnonymousClass01A r4 = this.A01;
        C54932iV r3 = new C54932iV(r4.A0D());
        r3.A01 = R.drawable.permission_location;
        r3.A0K = AnonymousClass1GE.A07;
        r3.A0J = new String[]{"android.permission.ACCESS_COARSE_LOCATION"};
        r3.A09 = R.string.str11ce;
        r3.A06 = R.string.str11d7;
        r4.startActivityForResult(r3.A00(), 34);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r12 != null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AnonymousClass26B r12, int r13) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x0056
            java.lang.String r1 = r12.A08
            java.lang.String r0 = "country_default"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            java.lang.String r5 = r12.A07
        L_0x000e:
            r8 = 4647503709213818880(0x407f400000000000, double:500.0)
            if (r12 == 0) goto L_0x004e
            java.lang.Double r0 = r12.A03
            if (r0 == 0) goto L_0x004e
            double r6 = r0.doubleValue()
        L_0x001d:
            java.lang.Double r0 = r12.A04
            if (r0 == 0) goto L_0x0025
            double r8 = r0.doubleValue()
        L_0x0025:
            r0 = 8
            r4 = r11
            r10 = r13
            if (r13 != r0) goto L_0x0058
            X.05i r3 = r11.A00
            X.01A r0 = r11.A01
            X.00l r2 = r0.A0D()
            java.lang.Class<com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity> r0 = com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r0)
            java.lang.String r0 = "country_name"
            r1.putExtra(r0, r5)
            java.lang.String r0 = "latitude"
            r1.putExtra(r0, r6)
            java.lang.String r0 = "longitude"
            r1.putExtra(r0, r8)
            r0 = 0
            r3.A00(r0, r1)
            return
        L_0x004e:
            r6 = 4647503709213818880(0x407f400000000000, double:500.0)
            if (r12 == 0) goto L_0x0025
            goto L_0x001d
        L_0x0056:
            r5 = 0
            goto L_0x000e
        L_0x0058:
            com.obwhatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment r2 = com.obwhatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment.A01(r4, r5, r6, r8, r10)
            X.01A r0 = r11.A01
            X.02C r1 = r0.A0F()
            java.lang.String r0 = "location-options-bottom-sheet"
            r2.A1G(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3FJ.A03(X.26B, int):void");
    }

    public void AT6() {
        if (this.A08.A05()) {
            this.A07.AT4();
        } else {
            A02();
        }
        this.A03.A03(3, 0);
    }

    public void AT7() {
        this.A07.AT3();
    }

    public void AT8() {
        this.A07.AT3();
        this.A03.A03(4, 0);
    }
}
