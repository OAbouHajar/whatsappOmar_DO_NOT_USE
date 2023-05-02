package com.whatsapp.util;

import X.AnonymousClass2GQ;
import X.C001300o;
import X.C16690tT;
import X.C30141bo;
import X.C30151bp;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import com.obwhatsapp.settings.SettingsDataUsageActivity;
import java.util.Arrays;

public class IDxATaskShape108S0100000_2_I0 extends C16690tT {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxATaskShape108S0100000_2_I0(C001300o r2, Object obj, int i2) {
        super(r2, true);
        this.A01 = i2;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        if (this.A01 != 0) {
            Log.i("settings-data-usage-activity/load storage data/load cache in background");
            return ((SettingsDataUsageActivity) this.A00).A0Q.A00().A04;
        }
        try {
            C30141bo r3 = (C30141bo) this.A00;
            Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(r3.A04, r3.A0J, r3.A0I);
            if (extractThumbnail == null) {
                return null;
            }
            r3.A02 = extractThumbnail;
            C30151bp r0 = r3.A0A;
            if (r0 == null) {
                return null;
            }
            Arrays.fill(r0.A03, true);
            return null;
        } catch (OutOfMemoryError e2) {
            Log.e("FilterThumbnailAdapter/updateBaseThumbnail/OutOfMemoryError", e2);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        if (1 - this.A01 != 0) {
            super.A0A(obj);
            return;
        }
        Number number = (Number) obj;
        if (number != null) {
            SettingsDataUsageActivity settingsDataUsageActivity = (SettingsDataUsageActivity) this.A00;
            if (settingsDataUsageActivity.A03 == -1) {
                Log.i("settings-data-usage-activity/load storage data/cache data fetched");
                long longValue = number.longValue();
                settingsDataUsageActivity.A03 = longValue;
                settingsDataUsageActivity.A0C.setText(AnonymousClass2GQ.A04(settingsDataUsageActivity.A01, longValue));
            }
        }
    }
}
