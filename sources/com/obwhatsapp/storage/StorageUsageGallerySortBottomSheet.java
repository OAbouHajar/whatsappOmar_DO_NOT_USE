package com.obwhatsapp.storage;

import X.C54232h3;
import X.C55492jh;
import android.os.Bundle;
import com.obwhatsapp.R;

public class StorageUsageGallerySortBottomSheet extends Hilt_StorageUsageGallerySortBottomSheet {
    public C54232h3 A00;
    public C55492jh A01;
    public C55492jh A02;
    public C55492jh A03;
    public C55492jh A04;

    public static StorageUsageGallerySortBottomSheet A01(int i2, boolean z2) {
        StorageUsageGallerySortBottomSheet storageUsageGallerySortBottomSheet = new StorageUsageGallerySortBottomSheet();
        Bundle bundle = new Bundle();
        bundle.putInt("storage_usage_gallery_sort_bottom_sheet_selected_sort_row", i2);
        bundle.putBoolean("storage_usage_gallery_sort_bottom_sheet_show_forwarding_score", z2);
        storageUsageGallerySortBottomSheet.A0T(bundle);
        return storageUsageGallerySortBottomSheet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A11(android.os.Bundle r10, android.view.LayoutInflater r11, android.view.ViewGroup r12) {
        /*
            r9 = this;
            r0 = 2131559833(0x7f0d0599, float:1.8745021E38)
            r5 = 0
            android.view.View r4 = r11.inflate(r0, r12, r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.content.Context r0 = r9.A0u()
            X.2jh r1 = new X.2jh
            r1.<init>(r0)
            r9.A02 = r1
            r0 = 2131891816(0x7f121668, float:1.9418363E38)
            java.lang.String r0 = r9.A0J(r0)
            r1.setText(r0)
            X.2jh r1 = r9.A02
            r8 = 11
            com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0
            r0.<init>(r9, r5, r8)
            r1.setOnClickListener(r0)
            X.2jh r0 = r9.A02
            r4.addView(r0)
            android.content.Context r0 = r9.A0u()
            X.2jh r1 = new X.2jh
            r1.<init>(r0)
            r9.A03 = r1
            r0 = 2131891817(0x7f121669, float:1.9418365E38)
            java.lang.String r0 = r9.A0J(r0)
            r1.setText(r0)
            X.2jh r1 = r9.A03
            r3 = 1
            com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0
            r0.<init>(r9, r3, r8)
            r1.setOnClickListener(r0)
            X.2jh r0 = r9.A03
            r4.addView(r0)
            android.content.Context r0 = r9.A0u()
            X.2jh r1 = new X.2jh
            r1.<init>(r0)
            r9.A04 = r1
            r0 = 2131891818(0x7f12166a, float:1.9418367E38)
            java.lang.String r0 = r9.A0J(r0)
            r1.setText(r0)
            X.2jh r1 = r9.A04
            r6 = 2
            com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0
            r0.<init>(r9, r6, r8)
            r1.setOnClickListener(r0)
            X.2jh r0 = r9.A04
            r4.addView(r0)
            android.os.Bundle r7 = r9.A04()
            java.lang.String r0 = "storage_usage_gallery_sort_bottom_sheet_show_forwarding_score"
            boolean r0 = r7.getBoolean(r0, r5)
            r2 = 3
            if (r0 == 0) goto L_0x00ac
            android.content.Context r0 = r9.A0u()
            X.2jh r1 = new X.2jh
            r1.<init>(r0)
            r9.A01 = r1
            r0 = 2131893674(0x7f121daa, float:1.9422131E38)
            java.lang.String r0 = r9.A0J(r0)
            r1.setText(r0)
            X.2jh r1 = r9.A01
            com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0
            r0.<init>(r9, r2, r8)
            r1.setOnClickListener(r0)
            X.2jh r0 = r9.A01
            r4.addView(r0)
        L_0x00ac:
            java.lang.String r0 = "storage_usage_gallery_sort_bottom_sheet_selected_sort_row"
            int r1 = r7.getInt(r0, r5)
            X.2jh r0 = r9.A02
            r0.setChecked(r5)
            X.2jh r0 = r9.A03
            r0.setChecked(r5)
            X.2jh r0 = r9.A04
            r0.setChecked(r5)
            if (r1 == 0) goto L_0x010b
            if (r1 == r3) goto L_0x0108
            if (r1 == r6) goto L_0x0105
            if (r1 != r2) goto L_0x00d2
            X.2jh r0 = r9.A01
            X.AnonymousClass00B.A04(r0)
        L_0x00cf:
            r0.setChecked(r3)
        L_0x00d2:
            android.app.Dialog r3 = r9.A03
            X.AnonymousClass00B.A06(r3)
            android.view.Window r2 = r3.getWindow()
            X.AnonymousClass00B.A06(r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x00ed
            android.view.View r1 = r2.getDecorView()
            r0 = 1280(0x500, float:1.794E-42)
            r1.setSystemUiVisibility(r0)
        L_0x00ed:
            android.view.WindowManager$LayoutParams r1 = r2.getAttributes()
            r0 = -1
            r1.width = r0
            r0 = 48
            r1.gravity = r0
            r2.setAttributes(r1)
            r1 = 3
            com.facebook.redex.IDxSListenerShape246S0100000_2_I0 r0 = new com.facebook.redex.IDxSListenerShape246S0100000_2_I0
            r0.<init>(r9, r1)
            r3.setOnShowListener(r0)
            return r4
        L_0x0105:
            X.2jh r0 = r9.A04
            goto L_0x00cf
        L_0x0108:
            X.2jh r0 = r9.A03
            goto L_0x00cf
        L_0x010b:
            X.2jh r0 = r9.A02
            goto L_0x00cf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.storage.StorageUsageGallerySortBottomSheet.A11(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A13() {
        super.A13();
        this.A00 = null;
        this.A02 = null;
        this.A03 = null;
        this.A04 = null;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        A1E(0, R.style.style02f0);
    }
}
