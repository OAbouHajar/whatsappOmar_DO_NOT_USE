package com.facebook.redex;

import X.AnonymousClass027;
import X.AnonymousClass2WU;
import X.AnonymousClass41F;
import X.C18450wi;
import X.C211813c;
import X.C32291fz;
import X.C47572Jn;
import X.C47592Jp;
import X.C70803hl;
import X.C70813hm;
import X.C70823hn;
import X.C89304bw;
import com.obwhatsapp.R;
import com.obwhatsapp.avatar.home.AvatarHomeViewModel;
import com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.Iterator;
import java.util.Map;

public class IDxEListenerShape288S0100000_2_I0 implements C211813c {
    public Object A00;
    public final int A01;

    public IDxEListenerShape288S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AN2() {
        switch (this.A01) {
            case 0:
                AvatarHomeViewModel.A03((AvatarHomeViewModel) this.A00, false);
                return;
            case 1:
                return;
            case 2:
                C47572Jn r2 = (C47572Jn) this.A00;
                C47592Jp r1 = r2.A0A;
                if (r1 != null) {
                    r2.A05 = true;
                    r1.A01(8);
                    int i2 = r2.A00;
                    if (i2 == 3) {
                        r2.A0G(i2);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((StickerStorePackPreviewActivity) this.A00).A0W = true;
                return;
        }
    }

    public void AN3() {
        switch (this.A01) {
            case 0:
                return;
            case 1:
                AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = (AvatarProfilePhotoViewModel) this.A00;
                if (!avatarProfilePhotoViewModel.A07.A01()) {
                    avatarProfilePhotoViewModel.A0C.A0B(AnonymousClass41F.CLOSE_SCREEN);
                    return;
                }
                return;
            case 2:
                C47572Jn r3 = (C47572Jn) this.A00;
                if (r3.A05) {
                    C32291fz.A00(r3.A05, R.string.str0139, 0).A03();
                    r3.A05 = false;
                    return;
                }
                return;
            default:
                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) this.A00;
                if (stickerStorePackPreviewActivity.A0W) {
                    if (stickerStorePackPreviewActivity.A0Z) {
                        stickerStorePackPreviewActivity.A0J.A00(8);
                    }
                    stickerStorePackPreviewActivity.finish();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ void AN4(String str) {
    }

    public /* synthetic */ void AN5(String str, Map map) {
    }

    public void AN6(boolean z2) {
        switch (this.A01) {
            case 0:
                AvatarHomeViewModel avatarHomeViewModel = (AvatarHomeViewModel) this.A00;
                avatarHomeViewModel.A00.A0B(AnonymousClass2WU.A00);
                AvatarHomeViewModel.A03(avatarHomeViewModel, true);
                return;
            case 1:
                AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = (AvatarProfilePhotoViewModel) this.A00;
                AnonymousClass027 r3 = avatarProfilePhotoViewModel.A00;
                Object A012 = r3.A01();
                C18450wi.A0F(A012);
                C18450wi.A0B(A012);
                C89304bw r0 = (C89304bw) A012;
                C89304bw r6 = new C89304bw(r0.A00, r0.A01, r0.A03, r0.A02, r0.A06, true, r0.A04);
                Iterator it = r6.A03.iterator();
                int i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        C70823hn r1 = (C70823hn) it.next();
                        if (!(r1 instanceof C70813hm ? ((C70813hm) r1).A01 : ((C70803hl) r1).A03)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                r3.A09(r6);
                avatarProfilePhotoViewModel.A06(true, i2);
                return;
            case 2:
                C47572Jn r2 = (C47572Jn) this.A00;
                C47592Jp r12 = r2.A0A;
                if (r12 != null) {
                    r12.A01(0);
                    if (z2) {
                        r2.A0G(3);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
