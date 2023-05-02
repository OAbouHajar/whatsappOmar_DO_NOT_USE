package com.whatsapp.util;

import X.AnonymousClass00B;
import X.AnonymousClass027;
import X.AnonymousClass1CX;
import X.AnonymousClass1P7;
import X.AnonymousClass29F;
import X.AnonymousClass29H;
import X.AnonymousClass35H;
import X.AnonymousClass35I;
import X.AnonymousClass4IS;
import X.AnonymousClass5QS;
import X.C34331k5;
import X.C37771pi;
import X.C41841wk;
import X.C613038j;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.obwhatsapp.InteractiveAnnotation;
import com.obwhatsapp.SerializableLocation;
import com.obwhatsapp.picker.searchexpressions.ExpressionSearchViewModel;
import com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment;
import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;

public class ViewOnClickCListenerShape2S0200000_I1_1 extends C34331k5 {
    public Object A00;
    public Object A01;
    public final int A02;

    public ViewOnClickCListenerShape2S0200000_I1_1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void A06(View view) {
        switch (this.A02) {
            case 0:
                AnonymousClass29H r2 = (AnonymousClass29H) this.A01;
                ((AnonymousClass29F) r2).A0A = true;
                Log.i("MediaCaptionDialog/dismiss/send");
                r2.onDismiss();
                return;
            case 1:
                C613038j r1 = (C613038j) this.A00;
                AnonymousClass1P7 r22 = r1.A03;
                Context context = r1.A00;
                SerializableLocation serializableLocation = ((InteractiveAnnotation) this.A01).serializableLocation;
                r22.A08(context, serializableLocation.name, (String) null, serializableLocation.latitude, serializableLocation.longitude);
                r1.A02.dismiss();
                return;
            case 2:
                ExpressionSearchViewModel expressionSearchViewModel = (ExpressionSearchViewModel) this.A01;
                AnonymousClass027 r12 = expressionSearchViewModel.A0A;
                AnonymousClass00B.A06(r12.A01());
                expressionSearchViewModel.A09(((AnonymousClass4IS) r12.A01()).A01);
                return;
            case 3:
                ((C41841wk) this.A00).A00.Act(view.getContext(), (Uri) this.A01);
                return;
            case 4:
                C37771pi r5 = (C37771pi) this.A01;
                if (!r5.A05) {
                    StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = ((AnonymousClass35H) this.A00).A01;
                    AnonymousClass1CX r3 = stickerStoreFeaturedTabFragment.A0F;
                    r3.A0Y.Acl(new RunnableRunnableShape10S0200000_I0_8(r3, 42, r5));
                    stickerStoreFeaturedTabFragment.A0G.A00(r5, (AnonymousClass5QS) null, (Integer) null, 2, false);
                    return;
                }
                return;
            default:
                StickerStoreMyTabFragment stickerStoreMyTabFragment = ((AnonymousClass35I) this.A00).A00;
                if (stickerStoreMyTabFragment.A0H != null) {
                    ConfirmPackDeleteDialogFragment.A01((C37771pi) this.A01).A1G(stickerStoreMyTabFragment.A0H, "confirm_delete");
                    return;
                }
                return;
        }
    }
}
