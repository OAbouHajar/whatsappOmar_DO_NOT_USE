package com.obwhatsapp.gallery;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass1PD;
import X.AnonymousClass1V7;
import X.AnonymousClass2TA;
import X.C14710pd;
import X.C14870pt;
import X.C15900s5;
import X.C16150sX;
import X.C16260sj;
import X.C16300so;
import X.C16320sq;
import X.C16460t6;
import X.C16480t8;
import X.C16500tA;
import X.C16510tB;
import X.C16980tz;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C19150xq;
import X.C19980zJ;
import X.C20350zu;
import X.C23151Ar;
import X.C23651Cv;
import X.C24671Gv;
import X.C25791Ld;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaFragment;
import com.obwhatsapp.camera.bottomsheet.Hilt_CameraMediaPickerFragment;
import com.obwhatsapp.gallerypicker.Hilt_MediaPickerFragment;
import com.obwhatsapp.gallerypicker.MediaPickerFragment;
import com.obwhatsapp.storage.Hilt_StorageUsageMediaGalleryFragment;
import com.obwhatsapp.storage.StorageUsageMediaGalleryFragment;

public abstract class Hilt_MediaGalleryFragmentBase extends WaFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A1A();
        return this.A00;
    }

    public LayoutInflater A0v(Bundle bundle) {
        LayoutInflater A0v = super.A0v(bundle);
        return A0v.cloneInContext(new C54452hX(A0v, (AnonymousClass01A) this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C54442hW.A00(r0) == r4) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0y(android.app.Activity r4) {
        /*
            r3 = this;
            r0 = 1
            r3.A0V = r0
            android.content.ContextWrapper r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto L_0x000f
            android.content.Context r0 = X.C54442hW.A00(r0)
            r2 = 0
            if (r0 != r4) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            X.C52772eQ.A00(r0, r1, r2)
            r3.A1A()
            r3.A19()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.gallery.Hilt_MediaGalleryFragmentBase.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1A();
        A19();
    }

    public void A19() {
        C17060uT r3;
        Hilt_CameraMediaPickerFragment hilt_CameraMediaPickerFragment;
        C17060uT r32;
        Hilt_NewMediaPickerFragment hilt_NewMediaPickerFragment;
        if (this instanceof Hilt_StorageUsageMediaGalleryFragment) {
            Hilt_StorageUsageMediaGalleryFragment hilt_StorageUsageMediaGalleryFragment = (Hilt_StorageUsageMediaGalleryFragment) this;
            if (!hilt_StorageUsageMediaGalleryFragment.A02) {
                hilt_StorageUsageMediaGalleryFragment.A02 = true;
                StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = (StorageUsageMediaGalleryFragment) hilt_StorageUsageMediaGalleryFragment;
                C17050uS r33 = (C17050uS) ((C17060uT) hilt_StorageUsageMediaGalleryFragment.generatedComponent());
                C16150sX r2 = r33.A0b;
                storageUsageMediaGalleryFragment.A00 = (C17070uU) r2.ABg.get();
                storageUsageMediaGalleryFragment.A01 = (C17080uV) r2.APK.get();
                storageUsageMediaGalleryFragment.A09 = (C23651Cv) r2.A1k.get();
                storageUsageMediaGalleryFragment.A0F = (C14710pd) r2.A05.get();
                storageUsageMediaGalleryFragment.A0B = (C16980tz) r2.AQB.get();
                storageUsageMediaGalleryFragment.A0N = (C16320sq) r2.ARB.get();
                storageUsageMediaGalleryFragment.A0A = (AnonymousClass01V) r2.AOi.get();
                storageUsageMediaGalleryFragment.A0D = (AnonymousClass1V7) r33.A0X.get();
                storageUsageMediaGalleryFragment.A0C = (C16260sj) r2.AQe.get();
                storageUsageMediaGalleryFragment.A07 = (C14870pt) r2.AB3.get();
                storageUsageMediaGalleryFragment.A0K = r33.A0Y.A0K();
                storageUsageMediaGalleryFragment.A0E = (AnonymousClass013) r2.AR8.get();
                storageUsageMediaGalleryFragment.A08 = (AnonymousClass1PD) r2.AEP.get();
                storageUsageMediaGalleryFragment.A02 = (C16300so) r2.A5p.get();
                storageUsageMediaGalleryFragment.A01 = (C19980zJ) r2.A0P.get();
                storageUsageMediaGalleryFragment.A03 = (C16460t6) r2.A5k.get();
                storageUsageMediaGalleryFragment.A04 = (C16480t8) r2.AEF.get();
                storageUsageMediaGalleryFragment.A09 = (C25791Ld) r2.AFY.get();
                storageUsageMediaGalleryFragment.A06 = (C16500tA) r2.AMF.get();
                storageUsageMediaGalleryFragment.A05 = (C19150xq) r2.AFC.get();
            }
        } else if (this instanceof Hilt_MediaPickerFragment) {
            Hilt_MediaPickerFragment hilt_MediaPickerFragment = (Hilt_MediaPickerFragment) this;
            if (hilt_MediaPickerFragment instanceof Hilt_NewMediaPickerFragment) {
                Hilt_NewMediaPickerFragment hilt_NewMediaPickerFragment2 = (Hilt_NewMediaPickerFragment) hilt_MediaPickerFragment;
                if (!hilt_NewMediaPickerFragment2.A02) {
                    hilt_NewMediaPickerFragment2.A02 = true;
                    r32 = (C17060uT) hilt_NewMediaPickerFragment2.generatedComponent();
                    hilt_NewMediaPickerFragment = hilt_NewMediaPickerFragment2;
                } else {
                    return;
                }
            } else if (!hilt_MediaPickerFragment.A02) {
                hilt_MediaPickerFragment.A02 = true;
                r32 = (C17060uT) hilt_MediaPickerFragment.generatedComponent();
                hilt_NewMediaPickerFragment = (MediaPickerFragment) hilt_MediaPickerFragment;
            } else {
                return;
            }
            C17050uS r34 = (C17050uS) r32;
            C16150sX r22 = r34.A0b;
            hilt_NewMediaPickerFragment.A00 = (C17070uU) r22.ABg.get();
            hilt_NewMediaPickerFragment.A01 = (C17080uV) r22.APK.get();
            hilt_NewMediaPickerFragment.A09 = (C23651Cv) r22.A1k.get();
            hilt_NewMediaPickerFragment.A0F = (C14710pd) r22.A05.get();
            hilt_NewMediaPickerFragment.A0B = (C16980tz) r22.AQB.get();
            hilt_NewMediaPickerFragment.A0N = (C16320sq) r22.ARB.get();
            hilt_NewMediaPickerFragment.A0A = (AnonymousClass01V) r22.AOi.get();
            hilt_NewMediaPickerFragment.A0D = (AnonymousClass1V7) r34.A0X.get();
            hilt_NewMediaPickerFragment.A0C = (C16260sj) r22.AQe.get();
            hilt_NewMediaPickerFragment.A07 = (C14870pt) r22.AB3.get();
            hilt_NewMediaPickerFragment.A0K = r34.A0Y.A0K();
            hilt_NewMediaPickerFragment.A0E = (AnonymousClass013) r22.AR8.get();
            hilt_NewMediaPickerFragment.A06 = (C15900s5) r22.ALm.get();
            hilt_NewMediaPickerFragment.A0A = (C20350zu) r22.AIX.get();
            hilt_NewMediaPickerFragment.A0C = (C16510tB) r22.A8S.get();
            hilt_NewMediaPickerFragment.A0B = (C24671Gv) r22.ALR.get();
            hilt_NewMediaPickerFragment.A07 = (C23151Ar) r22.A3Q.get();
        } else if (this instanceof Hilt_MediaGalleryFragment) {
            Hilt_MediaGalleryFragment hilt_MediaGalleryFragment = (Hilt_MediaGalleryFragment) this;
            if (!hilt_MediaGalleryFragment.A02) {
                hilt_MediaGalleryFragment.A02 = true;
                MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) hilt_MediaGalleryFragment;
                C17050uS r35 = (C17050uS) ((C17060uT) hilt_MediaGalleryFragment.generatedComponent());
                C16150sX r23 = r35.A0b;
                mediaGalleryFragment.A00 = (C17070uU) r23.ABg.get();
                mediaGalleryFragment.A01 = (C17080uV) r23.APK.get();
                mediaGalleryFragment.A09 = (C23651Cv) r23.A1k.get();
                mediaGalleryFragment.A0F = (C14710pd) r23.A05.get();
                mediaGalleryFragment.A0B = (C16980tz) r23.AQB.get();
                mediaGalleryFragment.A0N = (C16320sq) r23.ARB.get();
                mediaGalleryFragment.A0A = (AnonymousClass01V) r23.AOi.get();
                mediaGalleryFragment.A0D = (AnonymousClass1V7) r35.A0X.get();
                mediaGalleryFragment.A0C = (C16260sj) r23.AQe.get();
                mediaGalleryFragment.A07 = (C14870pt) r23.AB3.get();
                mediaGalleryFragment.A0K = r35.A0Y.A0K();
                mediaGalleryFragment.A0E = (AnonymousClass013) r23.AR8.get();
                mediaGalleryFragment.A00 = (C16460t6) r23.A5k.get();
                mediaGalleryFragment.A01 = (C16480t8) r23.AEF.get();
                mediaGalleryFragment.A04 = (C25791Ld) r23.AFY.get();
                mediaGalleryFragment.A02 = (C19150xq) r23.AFC.get();
            }
        } else if (this instanceof Hilt_GalleryRecentsFragment) {
            Hilt_GalleryRecentsFragment hilt_GalleryRecentsFragment = (Hilt_GalleryRecentsFragment) this;
            if (!hilt_GalleryRecentsFragment.A02) {
                hilt_GalleryRecentsFragment.A02 = true;
                GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) hilt_GalleryRecentsFragment;
                C17050uS r36 = (C17050uS) ((C17060uT) hilt_GalleryRecentsFragment.generatedComponent());
                C16150sX r24 = r36.A0b;
                galleryRecentsFragment.A00 = (C17070uU) r24.ABg.get();
                galleryRecentsFragment.A01 = (C17080uV) r24.APK.get();
                galleryRecentsFragment.A09 = (C23651Cv) r24.A1k.get();
                galleryRecentsFragment.A0F = (C14710pd) r24.A05.get();
                galleryRecentsFragment.A0B = (C16980tz) r24.AQB.get();
                galleryRecentsFragment.A0N = (C16320sq) r24.ARB.get();
                galleryRecentsFragment.A0A = (AnonymousClass01V) r24.AOi.get();
                galleryRecentsFragment.A0D = (AnonymousClass1V7) r36.A0X.get();
                galleryRecentsFragment.A0C = (C16260sj) r24.AQe.get();
                galleryRecentsFragment.A07 = (C14870pt) r24.AB3.get();
                galleryRecentsFragment.A0K = r36.A0Y.A0K();
                galleryRecentsFragment.A0E = (AnonymousClass013) r24.AR8.get();
                galleryRecentsFragment.A04 = (C20350zu) r24.AIX.get();
            }
        } else {
            if (this instanceof Hilt_CameraMediaPickerFragment) {
                Hilt_CameraMediaPickerFragment hilt_CameraMediaPickerFragment2 = (Hilt_CameraMediaPickerFragment) this;
                if (!hilt_CameraMediaPickerFragment2.A02) {
                    hilt_CameraMediaPickerFragment2.A02 = true;
                    r3 = (C17060uT) hilt_CameraMediaPickerFragment2.generatedComponent();
                    hilt_CameraMediaPickerFragment = hilt_CameraMediaPickerFragment2;
                } else {
                    return;
                }
            } else if (!this.A02) {
                this.A02 = true;
                r3 = (C17060uT) generatedComponent();
                hilt_CameraMediaPickerFragment = (MediaGalleryFragmentBase) this;
            } else {
                return;
            }
            C17050uS r37 = (C17050uS) r3;
            C16150sX r25 = r37.A0b;
            hilt_CameraMediaPickerFragment.A00 = (C17070uU) r25.ABg.get();
            hilt_CameraMediaPickerFragment.A01 = (C17080uV) r25.APK.get();
            hilt_CameraMediaPickerFragment.A09 = (C23651Cv) r25.A1k.get();
            hilt_CameraMediaPickerFragment.A0F = (C14710pd) r25.A05.get();
            hilt_CameraMediaPickerFragment.A0B = (C16980tz) r25.AQB.get();
            hilt_CameraMediaPickerFragment.A0N = (C16320sq) r25.ARB.get();
            hilt_CameraMediaPickerFragment.A0A = (AnonymousClass01V) r25.AOi.get();
            hilt_CameraMediaPickerFragment.A0D = (AnonymousClass1V7) r37.A0X.get();
            hilt_CameraMediaPickerFragment.A0C = (C16260sj) r25.AQe.get();
            hilt_CameraMediaPickerFragment.A07 = (C14870pt) r25.AB3.get();
            hilt_CameraMediaPickerFragment.A0K = r37.A0Y.A0K();
            hilt_CameraMediaPickerFragment.A0E = (AnonymousClass013) r25.AR8.get();
        }
    }

    public final void A1A() {
        if (this.A00 == null) {
            this.A00 = new C54452hX(super.A0u(), (AnonymousClass01A) this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A01(this, super.ABj());
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C54442hW(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }
}
