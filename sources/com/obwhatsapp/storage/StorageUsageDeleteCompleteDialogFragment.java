package com.obwhatsapp.storage;

import X.AnonymousClass00B;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.AnonymousClass2GQ;
import X.C004601z;
import X.C016907z;
import X.C14870pt;
import X.C32241fu;
import X.C41741wY;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;

public class StorageUsageDeleteCompleteDialogFragment extends Hilt_StorageUsageDeleteCompleteDialogFragment {
    public C14870pt A00;

    public static StorageUsageDeleteCompleteDialogFragment A01(long j2) {
        StorageUsageDeleteCompleteDialogFragment storageUsageDeleteCompleteDialogFragment = new StorageUsageDeleteCompleteDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("deleted_disk_size", j2);
        storageUsageDeleteCompleteDialogFragment.A0T(bundle);
        return storageUsageDeleteCompleteDialogFragment;
    }

    public void A14() {
        super.A14();
        this.A03.getWindow().setLayout(A03().getDimensionPixelSize(R.dimen.dimen07bf), -2);
    }

    public Dialog A1B(Bundle bundle) {
        Context A0u = A0u();
        Bundle A04 = A04();
        View inflate = LayoutInflater.from(A0u).inflate(R.layout.layout0596, (ViewGroup) null, false);
        C016907z A042 = C016907z.A04(A0u, R.drawable.vec_storage_usage_check_mark_icon);
        AnonymousClass00B.A06(A042);
        ((ImageView) C004601z.A0E(inflate, R.id.check_mark_image_view)).setImageDrawable(A042);
        A042.start();
        A042.A08(new C41741wY(this));
        ((TextView) C004601z.A0E(inflate, R.id.title_text_view)).setText(AnonymousClass2GQ.A02(this.A02, R.plurals.plurals014a, A04.getLong("deleted_disk_size"), true));
        C32241fu r0 = new C32241fu(A0u);
        r0.setView(inflate);
        r0.A07(true);
        return r0.create();
    }

    public void A1G(AnonymousClass02C r2, String str) {
        AnonymousClass050 r0 = new AnonymousClass050(r2);
        r0.A0C(this, str);
        r0.A02();
    }
}
