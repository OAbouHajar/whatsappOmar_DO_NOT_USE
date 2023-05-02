package com.obwhatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass06y;
import X.AnonymousClass0Bo;
import X.AnonymousClass29E;
import X.AnonymousClass29K;
import X.AnonymousClass29M;
import X.AnonymousClass29Q;
import X.AnonymousClass2OM;
import X.AnonymousClass2OV;
import X.AnonymousClass4IF;
import X.C001000l;
import X.C004101u;
import X.C102104yP;
import X.C102164yV;
import X.C102784zW;
import X.C13680ns;
import X.C14530pL;
import X.C15860rz;
import X.C16180sb;
import X.C16320sq;
import X.C23651Cv;
import X.C26051Md;
import X.C30141bo;
import X.C456429w;
import X.C62813Fa;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.facebook.redex.IDxBRecipientShape31S0300000_1_I1;
import com.facebook.redex.IDxLListenerShape145S0100000_2_I1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView;
import com.obwhatsapp.mediacomposer.doodle.ImagePreviewContentLayout;
import com.obwhatsapp.mediaview.PhotoView;
import java.io.File;

public class ImageComposerFragment extends Hilt_ImageComposerFragment {
    public Bitmap A00;
    public C16180sb A01;
    public C23651Cv A02;
    public C26051Md A03;
    public AnonymousClass2OV A04;
    public AnonymousClass2OV A05;
    public ImagePreviewContentLayout A06;
    public C30141bo A07;
    public PhotoView A08;
    public boolean A09;

    public static File A01(Uri uri, C16180sb r3) {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(C004101u.A02(uri.toString()));
        return r3.A0N(AnonymousClass000.A0h("-crop", A0o));
    }

    public void A0s(Bundle bundle) {
        bundle.putBoolean("handle-crop-image-result", this.A09);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01bc, code lost:
        if (r2 > 0) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c7, code lost:
        if (r2 <= 0) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c9, code lost:
        r15.A03.A0F((X.C14550pN) A0C(), r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x019b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0x(int r16, int r17, android.content.Intent r18) {
        /*
            r15 = this;
            r4 = 1
            r0 = r17
            r8 = r18
            r1 = r16
            if (r1 == r4) goto L_0x000d
            super.A0x(r1, r0, r8)
            return
        L_0x000d:
            java.lang.String r7 = "error_message_id"
            r2 = 0
            r5 = 0
            r6 = -1
            if (r0 != r6) goto L_0x01ae
            com.obwhatsapp.mediaview.PhotoView r1 = r15.A08
            r1.A0J = r2
            r0 = 0
            r1.A04 = r0
            X.1bo r1 = r15.A07
            r1.A03 = r2
            X.1kk r0 = r1.A0R
            java.lang.String r1 = r1.A0Y
            X.1km r0 = r0.A02
            r0.A03(r1)
            java.lang.String r0 = "rect"
            android.os.Parcelable r9 = r8.getParcelableExtra(r0)
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            java.lang.String r0 = "rotate"
            int r14 = r8.getIntExtra(r0, r5)
            X.20I r0 = X.C14530pL.A0L(r15)
            int r3 = r0.A01()
            X.0sb r1 = r15.A01
            android.net.Uri r0 = r15.A00
            java.io.File r13 = A01(r0, r1)
            android.net.Uri r11 = android.net.Uri.fromFile(r13)
            X.00l r12 = r15.A0C()
            X.29K r12 = (X.AnonymousClass29K) r12
            android.net.Uri r10 = r15.A00
            int r3 = r3 + r14
            int r3 = r3 % 360
            com.obwhatsapp.mediacomposer.MediaComposerActivity r12 = (com.obwhatsapp.mediacomposer.MediaComposerActivity) r12
            X.29Q r0 = r12.A1S
            X.20I r1 = r0.A00(r10)
            monitor-enter(r1)
            r1.A04 = r9     // Catch:{ all -> 0x01ab }
            monitor-exit(r1)
            monitor-enter(r1)
            r1.A01 = r3     // Catch:{ all -> 0x01ab }
            monitor-exit(r1)
            monitor-enter(r1)
            r1.A06 = r13     // Catch:{ all -> 0x01ab }
            monitor-exit(r1)
            r12.A3K(r10)
            X.29w r0 = r12.A0o
            X.29n r0 = r0.A08
            X.29y r0 = r0.A02
            r0.A01()
            android.net.Uri r0 = r15.A00
            java.lang.String r3 = "flip-h"
            java.lang.String r0 = r0.getQueryParameter(r3)
            if (r0 == 0) goto L_0x008e
            android.net.Uri$Builder r1 = r11.buildUpon()
            java.lang.String r0 = "1"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r3, r0)
            android.net.Uri r11 = r0.build()
        L_0x008e:
            int r0 = r15.A1K()
            java.lang.String r10 = "rotation"
            if (r0 == 0) goto L_0x00a7
            android.net.Uri$Builder r1 = r11.buildUpon()
            java.lang.String r0 = java.lang.Integer.toString(r0)
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r10, r0)
            android.net.Uri r11 = r0.build()
        L_0x00a7:
            X.0pd r3 = r15.A09     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            r1 = 1576(0x628, float:2.208E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            int r1 = r3.A03(r0, r1)     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            X.1A9 r0 = r15.A0M     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            android.graphics.Bitmap r1 = r0.A0W(r11, r1, r1)     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            X.1bo r0 = r15.A07     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            r0.A04 = r1     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            r0.A0B = r5     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            r0.A02()     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            X.1bo r3 = r15.A07     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            r3.A04()     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            X.1bp r0 = r3.A0A     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            if (r0 == 0) goto L_0x00d3
            r0.A01()     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
        L_0x00cc:
            X.1bo r0 = r15.A07     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            android.graphics.Bitmap r1 = r0.A03     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            if (r1 != 0) goto L_0x00e5
            goto L_0x00de
        L_0x00d3:
            android.os.Handler r1 = r3.A0K     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            java.lang.Runnable r0 = r3.A0X     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            r1.removeCallbacks(r0)     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            r0.run()     // Catch:{ 20M | IOException | OutOfMemoryError -> 0x019c }
            goto L_0x00cc
        L_0x00de:
            java.lang.String r0 = "ImageComposerFragment/cropImage/nullbitmap"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x01a2
        L_0x00e5:
            com.obwhatsapp.mediaview.PhotoView r0 = r15.A08
            r0.A06(r1)
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x01c3 }
            r3.<init>()     // Catch:{ IOException -> 0x01c3 }
            r3.inJustDecodeBounds = r4     // Catch:{ IOException -> 0x01c3 }
            X.20I r0 = X.C14530pL.A0L(r15)     // Catch:{ IOException -> 0x01c3 }
            java.io.File r0 = r0.A05()     // Catch:{ IOException -> 0x01c3 }
            android.net.Uri r4 = android.net.Uri.fromFile(r0)     // Catch:{ IOException -> 0x01c3 }
            X.1A9 r1 = r15.A0M     // Catch:{ IOException -> 0x01c3 }
            r0 = 1
            java.io.InputStream r1 = r1.A0b(r4, r0)     // Catch:{ IOException -> 0x01c3 }
            android.graphics.BitmapFactory.decodeStream(r1, r2, r3)     // Catch:{ all -> 0x0197 }
            r1.close()     // Catch:{ IOException -> 0x01c3 }
            int r0 = r3.outWidth     // Catch:{ IOException -> 0x01c3 }
            float r2 = (float) r0     // Catch:{ IOException -> 0x01c3 }
            int r0 = r3.outHeight     // Catch:{ IOException -> 0x01c3 }
            float r1 = (float) r0     // Catch:{ IOException -> 0x01c3 }
            r0 = 0
            android.graphics.RectF r3 = new android.graphics.RectF     // Catch:{ IOException -> 0x01c3 }
            r3.<init>(r0, r0, r2, r1)     // Catch:{ IOException -> 0x01c3 }
            X.01V r0 = r15.A05     // Catch:{ IOException -> 0x01c3 }
            android.content.ContentResolver r0 = r0.A0C()     // Catch:{ IOException -> 0x01c3 }
            android.graphics.Matrix r4 = X.C17970vw.A09(r0, r4)     // Catch:{ IOException -> 0x01c3 }
            if (r4 != 0) goto L_0x0126
            android.graphics.Matrix r4 = X.AnonymousClass000.A0H()     // Catch:{ IOException -> 0x01c3 }
        L_0x0126:
            android.net.Uri r0 = r15.A00     // Catch:{ IOException -> 0x01c3 }
            java.lang.String r0 = r0.getQueryParameter(r10)     // Catch:{ IOException -> 0x01c3 }
            if (r0 == 0) goto L_0x0138
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ IOException -> 0x01c3 }
            if (r0 == 0) goto L_0x0138
            float r0 = (float) r0     // Catch:{ IOException -> 0x01c3 }
            r4.postRotate(r0)     // Catch:{ IOException -> 0x01c3 }
        L_0x0138:
            r4.mapRect(r3)     // Catch:{ IOException -> 0x01c3 }
            float r1 = r3.left     // Catch:{ IOException -> 0x01c3 }
            float r0 = r3.top     // Catch:{ IOException -> 0x01c3 }
            android.graphics.RectF r2 = new android.graphics.RectF     // Catch:{ IOException -> 0x01c3 }
            r2.<init>(r9)     // Catch:{ IOException -> 0x01c3 }
            r4.mapRect(r2)     // Catch:{ IOException -> 0x01c3 }
            float r1 = -r1
            float r0 = -r0
            r2.offset(r1, r0)     // Catch:{ IOException -> 0x01c3 }
            X.2Ra r0 = r15.A0D     // Catch:{ IOException -> 0x01c3 }
            X.39P r0 = r0.A0I     // Catch:{ IOException -> 0x01c3 }
            android.graphics.RectF r1 = r0.A06     // Catch:{ IOException -> 0x01c3 }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1.width()     // Catch:{ IOException -> 0x01c3 }
            float r1 = r1 * r0
            float r0 = r3.width()     // Catch:{ IOException -> 0x01c3 }
            float r1 = r1 / r0
            float r0 = r2.left     // Catch:{ IOException -> 0x01c3 }
            float r0 = r0 * r1
            r2.left = r0     // Catch:{ IOException -> 0x01c3 }
            float r0 = r2.top     // Catch:{ IOException -> 0x01c3 }
            float r0 = r0 * r1
            r2.top = r0     // Catch:{ IOException -> 0x01c3 }
            float r0 = r2.right     // Catch:{ IOException -> 0x01c3 }
            float r0 = r0 * r1
            r2.right = r0     // Catch:{ IOException -> 0x01c3 }
            float r0 = r2.bottom     // Catch:{ IOException -> 0x01c3 }
            float r0 = r0 * r1
            r2.bottom = r0     // Catch:{ IOException -> 0x01c3 }
            X.2Ra r0 = r15.A0D     // Catch:{ IOException -> 0x01c3 }
            r0.A05(r2)     // Catch:{ IOException -> 0x01c3 }
            X.2Ra r4 = r15.A0D     // Catch:{ IOException -> 0x01c3 }
            X.39P r3 = r4.A0I     // Catch:{ IOException -> 0x01c3 }
            int r0 = r3.A02     // Catch:{ IOException -> 0x01c3 }
            int r0 = r0 + r14
            int r0 = r0 % 360
            r3.A02 = r0     // Catch:{ IOException -> 0x01c3 }
            android.graphics.RectF r2 = r3.A07     // Catch:{ IOException -> 0x01c3 }
            if (r2 == 0) goto L_0x018c
            float r1 = (float) r0     // Catch:{ IOException -> 0x01c3 }
            android.graphics.Matrix r0 = r3.A09     // Catch:{ IOException -> 0x01c3 }
            X.AnonymousClass470.A00(r0, r2, r1)     // Catch:{ IOException -> 0x01c3 }
        L_0x018c:
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r4.A0H     // Catch:{ IOException -> 0x01c3 }
            r0.requestLayout()     // Catch:{ IOException -> 0x01c3 }
            X.29m r0 = r4.A0G     // Catch:{ IOException -> 0x01c3 }
            r0.A01()     // Catch:{ IOException -> 0x01c3 }
            goto L_0x01d4
        L_0x0197:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x019b }
        L_0x019b:
            throw r0     // Catch:{ IOException -> 0x01c3 }
        L_0x019c:
            r1 = move-exception
            java.lang.String r0 = "ImageComposerFragment/cropImage"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01a2:
            X.0pt r1 = r15.A03
            r0 = 2131888200(0x7f120848, float:1.9411029E38)
            r1.A09(r0, r4)
            return
        L_0x01ab:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x01ae:
            if (r17 != 0) goto L_0x01d4
            if (r18 == 0) goto L_0x01bf
            X.00l r0 = r15.A0C()
            if (r0 == 0) goto L_0x01d4
            int r2 = r8.getIntExtra(r7, r6)
            if (r2 <= 0) goto L_0x01d4
            goto L_0x01c9
        L_0x01bf:
            r15.A1L(r2)
            goto L_0x01d4
        L_0x01c3:
            int r2 = r8.getIntExtra(r7, r6)
            if (r2 <= 0) goto L_0x01d4
        L_0x01c9:
            X.0pt r1 = r15.A03
            X.00l r0 = r15.A0C()
            X.0pN r0 = (X.C14550pN) r0
            r1.A0F(r0, r2)
        L_0x01d4:
            r15.A09 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediacomposer.ImageComposerFragment.A0x(int, int, android.content.Intent):void");
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout02f7);
    }

    public void A13() {
        this.A06.A00();
        C30141bo r2 = this.A07;
        r2.A04 = null;
        r2.A03 = null;
        r2.A02 = null;
        View view = r2.A0L;
        if (view != null) {
            ((AnonymousClass0Bo) view.getLayoutParams()).A01((AnonymousClass06y) null);
        }
        BottomSheetBehavior bottomSheetBehavior = r2.A08;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.A0E = null;
        }
        r2.A03();
        AnonymousClass2OM r1 = ((MediaComposerActivity) ((AnonymousClass29K) A0C())).A0e;
        if (r1 != null) {
            AnonymousClass2OV r0 = this.A04;
            if (r0 != null) {
                r1.A01(r0);
            }
            AnonymousClass2OV r02 = this.A05;
            if (r02 != null) {
                r1.A01(r02);
            }
        }
        super.A13();
    }

    public void A18(Bundle bundle, View view) {
        this.A06 = (ImagePreviewContentLayout) view.findViewById(R.id.media_content);
        super.A18(bundle, view);
        int A002 = C14530pL.A0L(this).A00();
        C23651Cv r4 = this.A02;
        C16320sq r10 = this.A0N;
        C26051Md r7 = this.A03;
        AnonymousClass013 r6 = this.A07;
        C15860rz r5 = this.A06;
        C001000l A0C = A0C();
        this.A07 = new C30141bo(this.A00, view, A0C, r4, r5, r6, r7, new AnonymousClass29E(this), this.A0D, r10, A002);
        this.A08 = (PhotoView) view.findViewById(R.id.photo);
        ImagePreviewContentLayout imagePreviewContentLayout = this.A06;
        imagePreviewContentLayout.A03 = this.A0D;
        imagePreviewContentLayout.A04 = new C102784zW(this);
        C13680ns.A16(imagePreviewContentLayout, this, 44);
        if (bundle == null || !bundle.getBoolean("handle-crop-image-result", false)) {
            A1L(bundle);
        }
        if (this.A00 == null) {
            C62813Fa r2 = new C62813Fa(this);
            this.A05 = r2;
            C102164yV r1 = new C102164yV(this);
            AnonymousClass2OM r0 = ((MediaComposerActivity) ((AnonymousClass29K) A0C())).A0e;
            if (r0 != null) {
                r0.A02(r2, r1);
            }
        }
    }

    public void A1F(Rect rect) {
        super.A1F(rect);
        if (this.A0A != null) {
            C30141bo r4 = this.A07;
            if (!rect.equals(r4.A05)) {
                r4.A05 = new Rect(0, rect.top, 0, rect.bottom);
            }
        }
    }

    public boolean A1H() {
        return this.A07.A09() || super.A1H();
    }

    public final int A1K() {
        String queryParameter = this.A00.getQueryParameter("rotation");
        return (C14530pL.A0L(this).A01() + (queryParameter != null ? Integer.parseInt(queryParameter) : 0)) % 360;
    }

    public final void A1L(Bundle bundle) {
        this.A08.setTag(this.A00);
        AnonymousClass29K r4 = (AnonymousClass29K) A0C();
        Uri uri = this.A00;
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) r4;
        AnonymousClass29Q r1 = mediaComposerActivity.A1S;
        File A032 = r1.A00(uri).A03();
        if (A032 == null) {
            A032 = r1.A00(this.A00).A05();
        }
        Uri.Builder buildUpon = Uri.fromFile(A032).buildUpon();
        int A1K = A1K();
        if (A1K != 0) {
            buildUpon.appendQueryParameter("rotation", Integer.toString(A1K));
        }
        if (this.A00.getQueryParameter("flip-h") != null) {
            buildUpon.appendQueryParameter("flip-h", this.A00.getQueryParameter("flip-h"));
        }
        C102104yP r2 = new C102104yP(buildUpon.build(), this);
        this.A04 = r2;
        IDxBRecipientShape31S0300000_1_I1 iDxBRecipientShape31S0300000_1_I1 = new IDxBRecipientShape31S0300000_1_I1(bundle, this, r4, 1);
        AnonymousClass2OM r0 = mediaComposerActivity.A0e;
        if (r0 != null) {
            r0.A02(r2, iDxBRecipientShape31S0300000_1_I1);
        }
    }

    public final void A1M(boolean z2, boolean z3) {
        C30141bo r0 = this.A07;
        if (z2) {
            r0.A01();
        } else {
            r0.A06(z3);
        }
        C001000l A0C = A0C();
        if (A0C instanceof AnonymousClass29M) {
            boolean z4 = !z2;
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) ((AnonymousClass29M) A0C);
            C456429w r2 = mediaComposerActivity.A0o;
            boolean A072 = mediaComposerActivity.A0l.A07();
            AnonymousClass4IF r02 = r2.A05;
            if (z4) {
                if (A072) {
                    FilterSwipeView filterSwipeView = r02.A01;
                    TextView textView = filterSwipeView.A00;
                    if (textView.getVisibility() == 0) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation.setDuration(300);
                        textView.startAnimation(alphaAnimation);
                        filterSwipeView.setFilterSwipeTextVisibility(4);
                    }
                }
            } else if (A072) {
                FilterSwipeView filterSwipeView2 = r02.A01;
                TextView textView2 = filterSwipeView2.A00;
                if (textView2.getVisibility() == 4) {
                    filterSwipeView2.setFilterSwipeTextVisibility(0);
                    C13680ns.A11(textView2);
                }
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C30141bo r3 = this.A07;
        if (r3.A08 != null) {
            r3.A0N.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape145S0100000_2_I1(r3, 9));
        }
    }
}
