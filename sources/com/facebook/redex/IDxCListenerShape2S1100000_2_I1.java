package com.facebook.redex;

import X.AnonymousClass01A;
import X.AnonymousClass1CX;
import X.AnonymousClass524;
import X.C13690nt;
import X.C14750ph;
import X.C38521qv;
import X.C41831wj;
import X.C55542jp;
import android.content.DialogInterface;
import android.net.Uri;
import com.obwhatsapp.status.playback.fragment.OpenLinkDialogFragment;
import com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.lang.ref.WeakReference;

public class IDxCListenerShape2S1100000_2_I1 implements DialogInterface.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxCListenerShape2S1100000_2_I1(int i2, String str, Object obj) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        C55542jp r2;
        switch (this.A02) {
            case 0:
                ((AnonymousClass01A) this.A00).A0r(C13690nt.A0B(Uri.parse(this.A01)));
                return;
            case 1:
                OpenLinkDialogFragment openLinkDialogFragment = (OpenLinkDialogFragment) this.A00;
                String str = this.A01;
                C41831wj r0 = openLinkDialogFragment.A04;
                if (r0 != null) {
                    r0.AOd();
                }
                openLinkDialogFragment.A01.Act(openLinkDialogFragment.A0u(), Uri.parse(str));
                return;
            case 2:
                AnonymousClass01A r22 = (AnonymousClass01A) this.A00;
                r22.A0r(C14750ph.A0e(r22.A0u(), this.A01));
                return;
            case 3:
                OpenLinkDialogFragment openLinkDialogFragment2 = (OpenLinkDialogFragment) this.A00;
                String str2 = this.A01;
                C41831wj r02 = openLinkDialogFragment2.A04;
                if (r02 != null) {
                    r02.AOd();
                }
                openLinkDialogFragment2.A01.Act(openLinkDialogFragment2.A0u(), Uri.parse(str2));
                openLinkDialogFragment2.A1D();
                return;
            default:
                ConfirmPackDeleteDialogFragment confirmPackDeleteDialogFragment = (ConfirmPackDeleteDialogFragment) this.A00;
                String str3 = this.A01;
                if (i2 == -1) {
                    try {
                        r2 = (C55542jp) confirmPackDeleteDialogFragment.A0u();
                        if (r2 != null) {
                            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r2;
                            stickerStorePackPreviewActivity.A0X = true;
                            stickerStorePackPreviewActivity.A35();
                        }
                    } catch (ClassCastException unused) {
                        r2 = null;
                    }
                    WeakReference A0h = C13690nt.A0h(r2);
                    AnonymousClass1CX r3 = confirmPackDeleteDialogFragment.A00;
                    r3.A0Y.Ack(new C38521qv(r3.A0K, new AnonymousClass524(A0h), r3), str3);
                    confirmPackDeleteDialogFragment.A1C();
                    return;
                }
                return;
        }
    }
}
