package com.facebook.redex;

import X.AnonymousClass1YG;
import X.AnonymousClass2BF;
import X.AnonymousClass2J6;
import X.AnonymousClass31J;
import X.AnonymousClass35D;
import X.AnonymousClass39Z;
import X.AnonymousClass3GL;
import X.AnonymousClass4Q9;
import X.AnonymousClass5QR;
import X.C001000l;
import X.C108715Pb;
import X.C13690nt;
import X.C14550pN;
import X.C14870pt;
import X.C15830rv;
import X.C16740tZ;
import X.C17250um;
import X.C19980zJ;
import X.C19990zK;
import X.C34151jm;
import X.C37921px;
import X.C37941pz;
import X.C47612Jr;
import X.C54502hd;
import X.C56972pY;
import X.C57482rF;
import X.C57732rf;
import X.C59882zE;
import X.C59912zL;
import X.C603831g;
import X.C603931h;
import X.C616739v;
import X.C93504jJ;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.obwhatsapp.calling.calllink.view.CallLinkActivity;
import com.obwhatsapp.conversationslist.ViewHolder;
import com.obwhatsapp.gallery.MediaGalleryFragmentBase;
import com.obwhatsapp.mediaview.MediaViewFragment;
import com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment;
import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.stickers.StarStickerFromPickerDialogFragment;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Set;

public class IDxCListenerShape53S0200000_2_I1 implements View.OnLongClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape53S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final boolean onLongClick(View view) {
        switch (this.A02) {
            case 0:
                C37921px r1 = (C37921px) this.A01;
                AnonymousClass4Q9 r0 = ((C59882zE) this.A00).A03;
                if (r0 == null) {
                    return false;
                }
                r0.A00(r1);
                return true;
            case 1:
                C59912zL r3 = (C59912zL) this.A00;
                C616739v r2 = (C616739v) this.A01;
                CallsHistoryFragment callsHistoryFragment = r3.A0B;
                if (!callsHistoryFragment.A0i) {
                    Log.i("callsfragment/fillcallgroupview/longclicklistener Ignoring long click");
                    return true;
                }
                callsHistoryFragment.A1J(r2, r3);
                return true;
            case 2:
                ((CallLinkActivity) this.A00).A3A((C93504jJ) this.A01);
                return true;
            case 3:
                AnonymousClass39Z r12 = (AnonymousClass39Z) this.A00;
                C16740tZ r4 = (C16740tZ) this.A01;
                AnonymousClass31J r32 = r12.A0C;
                AnonymousClass1YG r22 = r32.A0b;
                if (r22 == null) {
                    return true;
                }
                r22.Ag8(r12.A06);
                r12.A00();
                r12.A02.setSelected(r22.AJI(r4));
                r32.A1D(r4);
                return true;
            case 4:
                C603831g r02 = (C603831g) this.A00;
                AnonymousClass2J6 r33 = r02.A03;
                ViewHolder viewHolder = r02.A0A;
                r33.ATE(viewHolder.A06, viewHolder, (C15830rv) this.A01, -1);
                return true;
            case 5:
                C603931h r03 = (C603931h) this.A00;
                AnonymousClass2J6 r34 = r03.A0B;
                ViewHolder viewHolder2 = r03.A0A;
                r34.ATE(viewHolder2.A06, viewHolder2, (C15830rv) this.A01, -1);
                return true;
            case 6:
                C57732rf r5 = (C57732rf) this.A00;
                C17250um r35 = r5.A04;
                ImageView imageView = r5.A02;
                C37941pz.A01(imageView, r5.A03.getRootView(), new C56972pY(imageView, (C108715Pb) this.A01, r35, r5.A01.A00));
                return true;
            case 7:
                C54502hd r23 = (C54502hd) this.A00;
                MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A01;
                AnonymousClass2BF r04 = r23.A05;
                return r04 != null && mediaGalleryFragmentBase.A1M(r04, r23);
            case 8:
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
                Set singleton = Collections.singleton(this.A01);
                C001000l A0D = mediaViewFragment.A0D();
                C14870pt r36 = mediaViewFragment.A0I;
                C19990zK r9 = mediaViewFragment.A1E;
                C47612Jr.A05(A0D, r36, mediaViewFragment.A0K, mediaViewFragment.A0T, mediaViewFragment.A0X, mediaViewFragment.A0e, mediaViewFragment.A0l, r9, mediaViewFragment.A1J, singleton);
                return true;
            default:
                C34151jm r42 = (C34151jm) this.A01;
                AnonymousClass5QR r13 = ((C57482rF) this.A00).A02;
                if (r13 == null) {
                    return false;
                }
                IDxPListenerShape314S0100000_2_I1 iDxPListenerShape314S0100000_2_I1 = (IDxPListenerShape314S0100000_2_I1) r13;
                switch (iDxPListenerShape314S0100000_2_I1.A01) {
                    case 0:
                        ((C14550pN) C19980zJ.A01(((AnonymousClass3GL) iDxPListenerShape314S0100000_2_I1.A00).A0A, C14550pN.class)).Afc(StarStickerFromPickerDialogFragment.A01(r42));
                        return true;
                    case 2:
                        AnonymousClass35D r24 = (AnonymousClass35D) iDxPListenerShape314S0100000_2_I1.A00;
                        ((C14550pN) C19980zJ.A00(r24.A0A)).Afc(StarOrRemoveFromRecentsStickerDialogFragment.A01(r42, r24.A0D));
                        return true;
                    case 3:
                        RemoveStickerFromFavoritesDialogFragment removeStickerFromFavoritesDialogFragment = new RemoveStickerFromFavoritesDialogFragment();
                        Bundle A0D2 = C13690nt.A0D();
                        A0D2.putParcelable("sticker", r42);
                        removeStickerFromFavoritesDialogFragment.A0T(A0D2);
                        ((C14550pN) C19980zJ.A00(((AnonymousClass3GL) iDxPListenerShape314S0100000_2_I1.A00).A0A)).Afc(removeStickerFromFavoritesDialogFragment);
                        return true;
                    default:
                        ((C14550pN) C19980zJ.A00(((AnonymousClass3GL) iDxPListenerShape314S0100000_2_I1.A00).A0A)).Afc(StarStickerFromPickerDialogFragment.A01(r42));
                        return true;
                }
        }
    }
}
