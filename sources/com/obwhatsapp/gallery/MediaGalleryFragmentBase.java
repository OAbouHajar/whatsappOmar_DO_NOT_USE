package com.obwhatsapp.gallery;

import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass01X;
import X.AnonymousClass1PD;
import X.AnonymousClass1V7;
import X.AnonymousClass1YG;
import X.AnonymousClass2BC;
import X.AnonymousClass2BE;
import X.AnonymousClass2BF;
import X.AnonymousClass2JP;
import X.AnonymousClass2OM;
import X.AnonymousClass2TH;
import X.C001000l;
import X.C14550pN;
import X.C14710pd;
import X.C14870pt;
import X.C16260sj;
import X.C16300so;
import X.C16320sq;
import X.C16500tA;
import X.C16730tY;
import X.C16980tz;
import X.C18450wi;
import X.C18820xJ;
import X.C23651Cv;
import X.C28381Vw;
import X.C38631rA;
import X.C455529g;
import X.C47612Jr;
import X.C49172Rk;
import X.C54502hd;
import X.C54522hf;
import X.C54532hg;
import X.C54552hi;
import X.C54562hj;
import X.C54572hk;
import X.C54582hn;
import X.C54592ho;
import X.C54602hp;
import X.C54652hv;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCObserverShape9S0100000_2_I0;
import com.facebook.redex.IDxLCreatorShape439S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.StickyHeadersRecyclerView;
import com.obwhatsapp.camera.bottomsheet.CameraMediaPickerFragment;
import com.obwhatsapp.gallerypicker.MediaPickerFragment;
import com.obwhatsapp.scroller.RecyclerFastScroller;
import com.obwhatsapp.storage.StorageUsageMediaGalleryFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class MediaGalleryFragmentBase extends Hilt_MediaGalleryFragmentBase {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public Drawable A04;
    public View A05;
    public AnonymousClass01X A06;
    public C14870pt A07;
    public StickyHeadersRecyclerView A08;
    public C23651Cv A09;
    public AnonymousClass01V A0A;
    public C16980tz A0B;
    public C16260sj A0C;
    public AnonymousClass1V7 A0D;
    public AnonymousClass013 A0E;
    public C14710pd A0F;
    public C54532hg A0G;
    public AnonymousClass2BC A0H;
    public C54522hf A0I;
    public AnonymousClass2TH A0J;
    public C49172Rk A0K;
    public AnonymousClass2OM A0L;
    public RecyclerFastScroller A0M;
    public C16320sq A0N;
    public boolean A0O;
    public boolean A0P;
    public final ContentObserver A0Q;
    public final Handler A0R;
    public final List A0S = new ArrayList();

    public MediaGalleryFragmentBase() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.A0R = handler;
        this.A0Q = new IDxCObserverShape9S0100000_2_I0(handler, this);
    }

    public void A0s(Bundle bundle) {
        bundle.putInt("sort_type", this.A02);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.layout02f9, viewGroup, false);
    }

    public void A12() {
        Log.i("mediagalleryfragmentbase/destroy");
        super.A12();
        A1E();
        this.A0O = false;
        AnonymousClass2OM r0 = this.A0L;
        if (r0 != null) {
            r0.A00();
            this.A0L = null;
        }
        AnonymousClass2BC r1 = this.A0H;
        if (r1 != null) {
            r1.unregisterContentObserver(this.A0Q);
            this.A0H.close();
            this.A0H = null;
        }
        this.A06 = null;
        this.A00 = 0;
    }

    public void A14() {
        super.A14();
        A1D();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x00cf, code lost:
        if (r2 == 1) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A18(android.os.Bundle r6, android.view.View r7) {
        /*
            r5 = this;
            java.lang.String r0 = "sort_type"
            r4 = 0
            if (r6 != 0) goto L_0x000a
            android.os.Bundle r6 = r5.A05
            if (r6 == 0) goto L_0x0010
        L_0x000a:
            int r0 = r6.getInt(r0, r4)
            r5.A02 = r0
        L_0x0010:
            android.content.Context r1 = r5.A02()
            r0 = 2131100759(0x7f060457, float:1.7813909E38)
            int r1 = X.AnonymousClass00T.A00(r1, r0)
            r5.A01 = r1
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r5.A04 = r0
            android.content.res.Resources r1 = r5.A03()
            r0 = 2131166201(0x7f0703f9, float:1.794664E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5.A03 = r0
            boolean r0 = r5 instanceof com.obwhatsapp.storage.StorageUsageMediaGalleryFragment
            r5.A0P = r0
            r0 = 2131364846(0x7f0a0bee, float:1.834954E38)
            android.view.View r0 = r7.findViewById(r0)
            r5.A05 = r0
            r0 = 2131363938(0x7f0a0862, float:1.8347699E38)
            android.view.View r0 = r7.findViewById(r0)
            com.obwhatsapp.StickyHeadersRecyclerView r0 = (com.obwhatsapp.StickyHeadersRecyclerView) r0
            r5.A08 = r0
            X.2hq r1 = new X.2hq
            r1.<init>(r5, r5)
            r5.A06 = r1
            com.obwhatsapp.StickyHeadersRecyclerView r0 = r5.A08
            r0.setAdapter(r1)
            r0 = 2131365906(0x7f0a1012, float:1.835169E38)
            android.view.View r1 = X.C004601z.A0E(r7, r0)
            com.obwhatsapp.scroller.RecyclerFastScroller r1 = (com.obwhatsapp.scroller.RecyclerFastScroller) r1
            r5.A0M = r1
            X.013 r0 = r5.A0E
            boolean r0 = r0.A0T()
            r1.A0C = r0
            com.obwhatsapp.scroller.RecyclerFastScroller r1 = r5.A0M
            com.obwhatsapp.StickyHeadersRecyclerView r0 = r5.A08
            r1.setRecyclerView(r0)
            android.content.Context r0 = r5.A0u()
            android.widget.ImageView r3 = new android.widget.ImageView
            r3.<init>(r0)
            X.013 r2 = r5.A0E
            android.content.Context r1 = r5.A02()
            r0 = 2131231302(0x7f080246, float:1.8078681E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00T.A04(r1, r0)
            X.25m r0 = new X.25m
            r0.<init>(r1, r2)
            r3.setImageDrawable(r0)
            com.obwhatsapp.scroller.RecyclerFastScroller r0 = r5.A0M
            r0.setThumbView(r3)
            X.00l r0 = r5.A0D()
            android.view.LayoutInflater r2 = r0.getLayoutInflater()
            r1 = 2131559368(0x7f0d03c8, float:1.8744078E38)
            com.obwhatsapp.StickyHeadersRecyclerView r0 = r5.A08
            android.view.View r4 = r2.inflate(r1, r0, r4)
            r0 = 2131363665(0x7f0a0751, float:1.8347145E38)
            android.view.View r3 = r4.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            X.AnonymousClass1UP.A06(r3)
            r0 = 23
            com.facebook.redex.IDxProviderShape156S0100000_2_I0 r1 = new com.facebook.redex.IDxProviderShape156S0100000_2_I0
            r1.<init>(r5, r0)
            r0 = 0
            X.01T r2 = new X.01T
            r2.<init>(r0, r1)
            com.obwhatsapp.scroller.RecyclerFastScroller r1 = r5.A0M
            X.2ht r0 = new X.2ht
            r0.<init>(r3, r5, r2)
            r1.setBubbleView(r4, r0)
            com.obwhatsapp.scroller.RecyclerFastScroller r3 = r5.A0M
            int r2 = r5.A02
            if (r2 == 0) goto L_0x00d1
            r1 = 1
            r0 = 8
            if (r2 != r1) goto L_0x00d2
        L_0x00d1:
            r0 = 0
        L_0x00d2:
            r3.setVisibility(r0)
            X.1Cv r4 = r5.A09
            android.content.Context r0 = r5.A02()
            android.content.ContentResolver r3 = r0.getContentResolver()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r2 = new android.os.Handler
            r2.<init>(r0)
            java.lang.String r1 = "media-gallery-fragment"
            X.2OM r0 = new X.2OM
            r0.<init>(r3, r2, r4, r1)
            r5.A0L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.gallery.MediaGalleryFragmentBase.A18(android.os.Bundle, android.view.View):void");
    }

    public C54502hd A1B(Uri uri) {
        if (uri == null) {
            return null;
        }
        int childCount = this.A08.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.A08.getChildAt(i2);
            if (childAt instanceof C54502hd) {
                C54502hd r1 = (C54502hd) childAt;
                if (uri.equals(r1.getUri())) {
                    return r1;
                }
            }
        }
        return null;
    }

    public C54552hi A1C() {
        int i2;
        if (this instanceof StorageUsageMediaGalleryFragment) {
            i2 = 1;
        } else if (this instanceof MediaPickerFragment) {
            MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) this;
            C001000l A0C2 = mediaPickerFragment.A0C();
            if (A0C2 == null) {
                return null;
            }
            return new C54562hj(A0C2.getIntent().getData(), mediaPickerFragment.A0B, mediaPickerFragment.A0K, mediaPickerFragment.A0A, mediaPickerFragment.A00, mediaPickerFragment.A0D);
        } else if (this instanceof MediaGalleryFragment) {
            i2 = 0;
        } else {
            CameraMediaPickerFragment cameraMediaPickerFragment = (CameraMediaPickerFragment) this;
            return new C54572hk(cameraMediaPickerFragment.A0K, cameraMediaPickerFragment.A06);
        }
        return new IDxLCreatorShape439S0100000_2_I0(this, i2);
    }

    public void A1D() {
        if (this.A0H == null) {
            return;
        }
        if (!this.A0C.A0B() || this.A0H.getCount() <= 0) {
            this.A05.setVisibility(0);
            this.A08.setVisibility(8);
            return;
        }
        this.A05.setVisibility(8);
        this.A08.setVisibility(0);
    }

    public final void A1E() {
        C54522hf r0 = this.A0I;
        if (r0 != null) {
            r0.A06(true);
            this.A0I = null;
        }
        AnonymousClass2TH r02 = this.A0J;
        if (r02 != null) {
            r02.A06(true);
            this.A0J = null;
        }
        C54532hg r03 = this.A0G;
        if (r03 != null) {
            r03.A06(true);
            this.A0G = null;
        }
    }

    public final void A1F() {
        if (this.A0P && this.A0H != null) {
            C54532hg r1 = this.A0G;
            if (r1 != null) {
                r1.A06(true);
            }
            this.A0G = new C54532hg(this, this.A0H, new C54582hn(this));
            this.A0O = false;
            this.A06.A01();
            this.A0N.Ack(this.A0G, new Void[0]);
        }
    }

    public void A1G(int i2) {
        C001000l A0C2 = A0C();
        if (A0C2 != null) {
            AnonymousClass2JP.A00(A0C2, this.A0A, this.A0E.A0J(new Object[]{Integer.valueOf(i2)}, R.plurals.plurals00dc, (long) i2));
        }
    }

    public void A1H(AnonymousClass2BF r10, C54502hd r11) {
        C28381Vw r5;
        Intent intent;
        Context context;
        C001000l r0;
        if (this instanceof StorageUsageMediaGalleryFragment) {
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = (StorageUsageMediaGalleryFragment) this;
            C16730tY r6 = ((AnonymousClass2BE) r10).A03;
            if (storageUsageMediaGalleryFragment.A1K()) {
                r11.setChecked(((AnonymousClass1YG) storageUsageMediaGalleryFragment.A0D()).Agy(r6));
                storageUsageMediaGalleryFragment.A06.A01();
                return;
            } else if (r10.getType() != 4) {
                C54592ho r2 = new C54592ho(storageUsageMediaGalleryFragment.A0D());
                r2.A05 = true;
                r5 = r6.A11;
                r2.A03 = r5.A00;
                r2.A04 = r5;
                r2.A02 = 2;
                r2.A01 = 2;
                intent = r2.A00();
                C455529g.A07(storageUsageMediaGalleryFragment.A0D(), intent, r11);
                context = storageUsageMediaGalleryFragment.A02();
                r0 = storageUsageMediaGalleryFragment.A0D();
            } else if (r6 instanceof C38631rA) {
                AnonymousClass1PD r7 = storageUsageMediaGalleryFragment.A08;
                C14870pt r4 = storageUsageMediaGalleryFragment.A07;
                C16300so r22 = storageUsageMediaGalleryFragment.A02;
                C16320sq r8 = storageUsageMediaGalleryFragment.A0N;
                C16500tA r52 = storageUsageMediaGalleryFragment.A06;
                C18820xJ.A06(storageUsageMediaGalleryFragment.A01, r22, (C14550pN) storageUsageMediaGalleryFragment.A0C(), r4, r52, (C38631rA) r6, r7, r8);
                return;
            } else {
                return;
            }
        } else if (this instanceof MediaPickerFragment) {
            ((MediaPickerFragment) this).A1O(r10);
            return;
        } else if (this instanceof MediaGalleryFragment) {
            MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) this;
            C16730tY r23 = ((AnonymousClass2BE) r10).A03;
            if (mediaGalleryFragment.A1K()) {
                r11.setChecked(((AnonymousClass1YG) mediaGalleryFragment.A0C()).Agy(r23));
                return;
            }
            C54592ho r1 = new C54592ho(mediaGalleryFragment.A0D());
            r1.A05 = true;
            r1.A03 = mediaGalleryFragment.A03;
            r5 = r23.A11;
            r1.A04 = r5;
            r1.A02 = 2;
            r1.A00 = 34;
            intent = r1.A00();
            C455529g.A07(mediaGalleryFragment.A0D(), intent, r11);
            context = mediaGalleryFragment.A02();
            r0 = mediaGalleryFragment.A0D();
        } else if (this instanceof GalleryRecentsFragment) {
            GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) this;
            if (galleryRecentsFragment.A1K()) {
                galleryRecentsFragment.A1O(r10);
                return;
            }
            Map map = galleryRecentsFragment.A07;
            Uri A9L = r10.A9L();
            C18450wi.A0B(A9L);
            map.put(A9L, r10);
            GalleryTabHostFragment galleryTabHostFragment = galleryRecentsFragment.A02;
            if (galleryTabHostFragment != null) {
                List singletonList = Collections.singletonList(r10);
                C18450wi.A0B(singletonList);
                galleryTabHostFragment.A1I(singletonList);
                return;
            }
            return;
        } else {
            ((CameraMediaPickerFragment) this).A1Q(r10);
            return;
        }
        C455529g.A08(context, intent, r11, new C54602hp(r0), C47612Jr.A04(r5.toString()));
    }

    public void A1I(boolean z2) {
        StringBuilder sb = new StringBuilder("mediagalleryfragmentbase/rebake unmounted:");
        sb.append(z2);
        Log.i(sb.toString());
        A1E();
        AnonymousClass2BC r1 = this.A0H;
        if (r1 != null) {
            r1.unregisterContentObserver(this.A0Q);
            this.A0H.close();
            this.A0H = null;
        }
        A1J(true);
        this.A00 = 0;
        this.A06.A01();
        this.A0S.clear();
        C54552hi A1C = A1C();
        if (A1C != null) {
            C54522hf r2 = new C54522hf(A0H(), new C54652hv(this), A1C, z2);
            this.A0I = r2;
            this.A0N.Ack(r2, new Void[0]);
        }
    }

    public void A1J(boolean z2) {
        View view = this.A0A;
        if (view != null) {
            View findViewById = view.findViewById(R.id.progress_bar);
            int i2 = 8;
            if (z2) {
                i2 = 0;
            }
            findViewById.setVisibility(i2);
        }
    }

    public boolean A1K() {
        C001000l A0C2;
        if (this instanceof StorageUsageMediaGalleryFragment) {
            A0C2 = A0D();
        } else if (this instanceof MediaPickerFragment) {
            return ((MediaPickerFragment) this).A05 != null;
        } else {
            if (this instanceof MediaGalleryFragment) {
                A0C2 = A0C();
            } else if (!(this instanceof GalleryRecentsFragment)) {
                return ((CameraMediaPickerFragment) this).A02.getVisibility() == 0;
            } else {
                GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) this;
                return galleryRecentsFragment.A05 || (galleryRecentsFragment.A07.isEmpty() ^ true);
            }
        }
        return ((AnonymousClass1YG) A0C2).AHi();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r1 = ((X.AnonymousClass2BE) r1).A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1L(int r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.obwhatsapp.storage.StorageUsageMediaGalleryFragment
            if (r0 == 0) goto L_0x0025
            X.2BC r0 = r3.A0H
            r2 = 0
            if (r0 == 0) goto L_0x0024
            X.2BF r1 = r0.ADR(r4)
            boolean r0 = r1 instanceof X.AnonymousClass2BE
            if (r0 == 0) goto L_0x0024
            X.2BE r1 = (X.AnonymousClass2BE) r1
            X.0tY r1 = r1.A03
            if (r1 == 0) goto L_0x0024
            X.00l r0 = r3.A0D()
            X.1YG r0 = (X.AnonymousClass1YG) r0
            boolean r0 = r0.AJI(r1)
            if (r0 == 0) goto L_0x0024
            r2 = 1
        L_0x0024:
            return r2
        L_0x0025:
            boolean r0 = r3 instanceof com.obwhatsapp.gallerypicker.MediaPickerFragment
            if (r0 == 0) goto L_0x0041
            r2 = r3
            com.obwhatsapp.gallerypicker.MediaPickerFragment r2 = (com.obwhatsapp.gallerypicker.MediaPickerFragment) r2
            boolean r0 = r2 instanceof com.obwhatsapp.gallery.NewMediaPickerFragment
            if (r0 == 0) goto L_0x0086
            com.obwhatsapp.gallery.NewMediaPickerFragment r2 = (com.obwhatsapp.gallery.NewMediaPickerFragment) r2
            X.2BC r0 = r2.A0H
            if (r0 == 0) goto L_0x007c
            java.util.Set r1 = r2.A05
            X.2BF r0 = r0.ADR(r4)
            boolean r0 = X.C003101j.A0I(r1, r0)
            return r0
        L_0x0041:
            boolean r0 = r3 instanceof com.obwhatsapp.gallery.MediaGalleryFragment
            if (r0 == 0) goto L_0x005d
            X.00l r1 = r3.A0C()
            X.1YG r1 = (X.AnonymousClass1YG) r1
            X.2BC r0 = r3.A0H
            X.2BD r0 = (X.AnonymousClass2BD) r0
            X.2BE r0 = r0.ADR(r4)
            X.AnonymousClass00B.A06(r0)
            X.0tY r0 = r0.A03
            boolean r0 = r1.AJI(r0)
            return r0
        L_0x005d:
            boolean r0 = r3 instanceof com.obwhatsapp.gallery.GalleryRecentsFragment
            if (r0 == 0) goto L_0x007e
            r1 = r3
            com.obwhatsapp.gallery.GalleryRecentsFragment r1 = (com.obwhatsapp.gallery.GalleryRecentsFragment) r1
            X.2BC r0 = r1.A0H
            if (r0 == 0) goto L_0x007c
            X.2BF r0 = r0.ADR(r4)
            if (r0 == 0) goto L_0x007c
            java.util.Map r1 = r1.A07
            android.net.Uri r0 = r0.A9L()
            X.C18450wi.A0B(r0)
            boolean r0 = r1.containsKey(r0)
            return r0
        L_0x007c:
            r0 = 0
            return r0
        L_0x007e:
            r0 = r3
            com.obwhatsapp.camera.bottomsheet.CameraMediaPickerFragment r0 = (com.obwhatsapp.camera.bottomsheet.CameraMediaPickerFragment) r0
            java.util.HashSet r1 = r0.A05
            X.2BC r0 = r0.A0H
            goto L_0x008d
        L_0x0086:
            java.util.HashSet r1 = r2.A0J
            X.2BC r0 = r2.A0H
            X.AnonymousClass00B.A06(r0)
        L_0x008d:
            X.2BF r0 = r0.ADR(r4)
            android.net.Uri r0 = r0.A9L()
            boolean r0 = r1.contains(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.gallery.MediaGalleryFragmentBase.A1L(int):boolean");
    }

    public abstract boolean A1M(AnonymousClass2BF r1, C54502hd r2);
}
