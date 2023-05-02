package X;

import com.google.android.gms.maps.model.CameraPosition;
import com.obwhatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.4sh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98614sh implements AnonymousClass5OA {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    public /* synthetic */ C98614sh(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A00 = groupChatLiveLocationsActivity2;
    }

    public final void AO1() {
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        AnonymousClass2NT r0 = groupChatLiveLocationsActivity2.A06;
        AnonymousClass00B.A06(r0);
        CameraPosition A02 = r0.A02();
        if (A02 != null) {
            int i2 = (int) (groupChatLiveLocationsActivity2.A00 * 5.0f);
            float f2 = A02.A02;
            if (i2 != ((int) (5.0f * f2))) {
                groupChatLiveLocationsActivity2.A00 = f2;
                groupChatLiveLocationsActivity2.A36();
            }
            AnonymousClass291 r1 = groupChatLiveLocationsActivity2.A0N;
            if (r1.A0j != null) {
                r1.A0W((Float) null);
            }
            AnonymousClass291 r02 = groupChatLiveLocationsActivity2.A0N;
            AnonymousClass29W r12 = r02.A0l;
            if (r12 != null && r02.A0t && groupChatLiveLocationsActivity2.A39(r12.A00())) {
                groupChatLiveLocationsActivity2.A0N.A0B();
            }
        }
    }
}
