package com.facebook.redex;

import X.AnonymousClass2BE;
import X.AnonymousClass2BF;
import X.AnonymousClass2OW;
import X.AnonymousClass3A5;
import X.C54502hd;
import X.C54612hq;
import X.C816349d;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.obwhatsapp.gallery.MediaGalleryFragmentBase;
import com.obwhatsapp.storage.StorageUsageMediaPreviewView;

public class IDxBRecipientShape14S0400000_2_I0 implements AnonymousClass2OW {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxBRecipientShape14S0400000_2_I0(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A00 = obj4;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public void A5K() {
        int i2 = this.A04;
        ImageView imageView = (ImageView) this.A03;
        Object obj = this.A00;
        imageView.setBackgroundColor(i2 != 0 ? ((StorageUsageMediaPreviewView) obj).A07 : ((C54612hq) obj).A05.A01);
        imageView.setImageDrawable((Drawable) null);
    }

    public /* synthetic */ void AQs() {
    }

    public void AY3(Bitmap bitmap, boolean z2) {
        C54502hd r6;
        AnonymousClass2BF r5;
        int i2;
        Drawable drawable;
        Bitmap bitmap2 = bitmap;
        if (this.A04 != 0) {
            r6 = (C54502hd) this.A03;
            if (r6.getTag() == this.A01) {
                r5 = (AnonymousClass2BE) this.A02;
                if (bitmap == StorageUsageMediaPreviewView.A0B) {
                    bitmap2 = null;
                }
                StorageUsageMediaPreviewView storageUsageMediaPreviewView = (StorageUsageMediaPreviewView) this.A00;
                i2 = storageUsageMediaPreviewView.A07;
                drawable = storageUsageMediaPreviewView.A09;
            } else {
                return;
            }
        } else {
            MediaGalleryFragmentBase mediaGalleryFragmentBase = ((C54612hq) this.A00).A05;
            if (mediaGalleryFragmentBase.A0C() != null) {
                r6 = (C54502hd) this.A03;
                if (r6.getTag() == this.A01) {
                    r5 = (AnonymousClass2BF) this.A02;
                    if (bitmap == C816349d.A00) {
                        bitmap2 = null;
                    }
                    i2 = mediaGalleryFragmentBase.A01;
                    drawable = mediaGalleryFragmentBase.A04;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        AnonymousClass3A5.A01(bitmap2, drawable, r5, r6, i2, !z2);
    }
}
