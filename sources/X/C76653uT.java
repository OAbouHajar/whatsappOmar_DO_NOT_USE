package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.3uT  reason: invalid class name and case insensitive filesystem */
public class C76653uT extends C55562jx {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76653uT(Context context, AnonymousClass0P5 r2, GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        super(context, r2);
        this.A00 = groupChatLiveLocationsActivity;
    }

    public void A0M(int i2) {
        ImageView imageView;
        int i3;
        int i4 = 8;
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        if (i2 == 0) {
            AnonymousClass291 r0 = groupChatLiveLocationsActivity.A0M;
            r0.A0u = true;
            r0.A0s = true;
            imageView = groupChatLiveLocationsActivity.A03;
            i3 = R.drawable.btn_compass_mode_tilt;
        } else if (i2 != 1) {
            groupChatLiveLocationsActivity.A03.setImageResource(R.drawable.btn_myl);
            groupChatLiveLocationsActivity.A0M.A0s = false;
            return;
        } else {
            AnonymousClass291 r02 = groupChatLiveLocationsActivity.A0M;
            r02.A0u = true;
            r02.A0s = true;
            imageView = groupChatLiveLocationsActivity.A03;
            i3 = R.drawable.btn_myl_active;
        }
        imageView.setImageResource(i3);
        AnonymousClass291 r03 = groupChatLiveLocationsActivity.A0M;
        View view = r03.A0U;
        if (r03.A0m == null) {
            i4 = 0;
        }
        view.setVisibility(i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.A0J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.location.Location getMyLocation() {
        /*
            r1 = this;
            com.obwhatsapp.location.GroupChatLiveLocationsActivity r0 = r1.A00
            X.291 r0 = r0.A0M
            if (r0 == 0) goto L_0x000b
            android.location.Location r0 = r0.A0J
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            android.location.Location r0 = super.getMyLocation()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76653uT.getMyLocation():android.location.Location");
    }
}
