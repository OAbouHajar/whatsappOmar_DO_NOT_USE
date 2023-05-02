package com.obwhatsapp.location;

import X.AnonymousClass291;
import X.C55582jz;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.obwhatsapp.R;
import com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;

public class IDxMViewShape86S0100000_2_I0 extends C55582jz {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxMViewShape86S0100000_2_I0(Context context, GoogleMapOptions googleMapOptions, Object obj, int i2) {
        super(context, googleMapOptions);
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A0A(int i2) {
        DirectorySetLocationMapActivity directorySetLocationMapActivity;
        ImageView imageView;
        int i3;
        ImageView imageView2;
        int i4;
        if (this.A01 != 0) {
            int i5 = 8;
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A00;
            if (i2 == 0) {
                AnonymousClass291 r0 = groupChatLiveLocationsActivity2.A0N;
                r0.A0u = true;
                r0.A0s = true;
                View view = r0.A0U;
                if (r0.A0m == null) {
                    i5 = 0;
                }
                view.setVisibility(i5);
                imageView2 = groupChatLiveLocationsActivity2.A04;
                i4 = R.drawable.btn_compass_mode_tilt;
            } else if (i2 != 1) {
                groupChatLiveLocationsActivity2.A04.setImageResource(R.drawable.btn_myl);
                groupChatLiveLocationsActivity2.A0N.A0s = false;
                return;
            } else {
                AnonymousClass291 r02 = groupChatLiveLocationsActivity2.A0N;
                r02.A0u = true;
                r02.A0s = true;
                View view2 = r02.A0U;
                if (r02.A0m == null) {
                    i5 = 0;
                }
                view2.setVisibility(i5);
                imageView2 = groupChatLiveLocationsActivity2.A04;
                i4 = R.drawable.btn_myl_active;
            }
            imageView2.setImageResource(i4);
            return;
        }
        if (i2 != 0) {
            directorySetLocationMapActivity = (DirectorySetLocationMapActivity) this.A00;
            imageView = directorySetLocationMapActivity.A09.A04;
            if (i2 != 1) {
                i3 = R.drawable.btn_myl;
            } else {
                imageView.setImageResource(R.drawable.btn_myl_active);
                directorySetLocationMapActivity.A09.A0F = true;
                return;
            }
        } else {
            directorySetLocationMapActivity = (DirectorySetLocationMapActivity) this.A00;
            imageView = directorySetLocationMapActivity.A09.A04;
            i3 = R.drawable.btn_compass_mode_tilt;
        }
        imageView.setImageResource(i3);
        directorySetLocationMapActivity.A09.A0F = false;
    }
}
