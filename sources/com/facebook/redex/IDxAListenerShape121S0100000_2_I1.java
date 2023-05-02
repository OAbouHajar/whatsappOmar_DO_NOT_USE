package com.facebook.redex;

import X.AnonymousClass121;
import X.AnonymousClass2Rf;
import X.AnonymousClass3K2;
import X.C006202q;
import X.C16150sX;
import X.C16180sb;
import X.C16260sj;
import X.C49132Rg;
import android.content.Context;
import com.obwhatsapp.gallerypicker.GalleryPickerLauncher;
import com.obwhatsapp.profile.ViewProfilePhoto;
import com.obwhatsapp.support.Remove;
import com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity;

public class IDxAListenerShape121S0100000_2_I1 implements C006202q {
    public Object A00;
    public final int A01;

    public IDxAListenerShape121S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AP6(Context context) {
        switch (this.A01) {
            case 66:
                GalleryPickerLauncher galleryPickerLauncher = (GalleryPickerLauncher) this.A00;
                if (!galleryPickerLauncher.A04) {
                    galleryPickerLauncher.A04 = true;
                    C16150sX r1 = ((C49132Rg) ((AnonymousClass2Rf) galleryPickerLauncher.generatedComponent())).A1s;
                    galleryPickerLauncher.A01 = C16150sX.A0Z(r1);
                    galleryPickerLauncher.A03 = (AnonymousClass121) r1.AJY.get();
                    galleryPickerLauncher.A00 = (C16260sj) r1.AQe.get();
                    galleryPickerLauncher.A02 = C16150sX.A0k(r1);
                    return;
                }
                return;
            case 99:
                ViewProfilePhoto.SavePhoto savePhoto = (ViewProfilePhoto.SavePhoto) this.A00;
                if (!savePhoto.A02) {
                    savePhoto.A02 = true;
                    C16150sX r12 = ((C49132Rg) ((AnonymousClass2Rf) savePhoto.generatedComponent())).A1s;
                    savePhoto.A01 = C16150sX.A02(r12);
                    savePhoto.A00 = (C16180sb) r12.A8b.get();
                    return;
                }
                return;
            case 134:
                AddThirdPartyStickerPackActivity addThirdPartyStickerPackActivity = (AddThirdPartyStickerPackActivity) this.A00;
                if (!addThirdPartyStickerPackActivity.A04) {
                    addThirdPartyStickerPackActivity.A04 = true;
                    C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) addThirdPartyStickerPackActivity.generatedComponent());
                    C16150sX r13 = r2.A1s;
                    addThirdPartyStickerPackActivity.A03 = C16150sX.A1B(r13);
                    addThirdPartyStickerPackActivity.A00 = C16150sX.A0m(r13);
                    addThirdPartyStickerPackActivity.A02 = r2.A0f();
                    return;
                }
                return;
            case 135:
                Remove remove = (Remove) this.A00;
                if (!remove.A01) {
                    remove.A01 = true;
                    remove.A00 = C16150sX.A0Z(((C49132Rg) ((AnonymousClass2Rf) remove.generatedComponent())).A1s);
                    return;
                }
                return;
            default:
                AnonymousClass3K2.A13(this);
                return;
        }
    }
}
