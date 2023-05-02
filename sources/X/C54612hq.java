package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.facebook.redex.IDxBRecipientShape14S0400000_2_I0;
import com.facebook.redex.IDxDListenerShape57S0200000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.gallery.MediaGalleryFragment;
import com.obwhatsapp.gallery.MediaGalleryFragmentBase;
import com.obwhatsapp.gallerypicker.MediaPickerFragment;
import com.obwhatsapp.storage.StorageUsageMediaGalleryFragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2hq  reason: invalid class name and case insensitive filesystem */
public class C54612hq extends AnonymousClass01X implements C54622hr {
    public int A00 = 10;
    public long A01 = 0;
    public boolean A02;
    public final MediaGalleryFragmentBase A03;
    public final Map A04 = new HashMap();
    public final /* synthetic */ MediaGalleryFragmentBase A05;

    public C54612hq(MediaGalleryFragmentBase mediaGalleryFragmentBase, MediaGalleryFragmentBase mediaGalleryFragmentBase2) {
        this.A05 = mediaGalleryFragmentBase;
        A0B(true);
        this.A03 = mediaGalleryFragmentBase2;
    }

    public /* bridge */ /* synthetic */ void A07(C005602k r3) {
        C54502hd r1 = ((C64713Rj) r3).A00;
        r1.setImageBitmap((Bitmap) null);
        r1.A00 = null;
    }

    public int A0C() {
        return this.A05.A00;
    }

    public long A0D(int i2) {
        AnonymousClass2BC r0 = this.A05.A0H;
        AnonymousClass2BF ADR = r0 != null ? r0.ADR(i2) : null;
        if (!this.A00 || ADR == null) {
            return 0;
        }
        Uri A9L = ADR.A9L();
        Map map = this.A04;
        Number number = (Number) map.get(A9L);
        if (number == null) {
            long j2 = this.A01;
            this.A01 = 1 + j2;
            number = Long.valueOf(j2);
            map.put(A9L, number);
        }
        return number.longValue();
    }

    public final void A0E(AnonymousClass3S2 r8, StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment, int i2) {
        AnonymousClass1YG r1;
        boolean z2;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A05;
        if (mediaGalleryFragmentBase.A0O && mediaGalleryFragmentBase.A0H != null) {
            boolean isChecked = r8.A00.isChecked();
            int count = mediaGalleryFragmentBase.A0H.getCount() - 1;
            int i3 = mediaGalleryFragmentBase.A02;
            boolean z3 = true;
            if (!(i3 == 0 || i3 == 1)) {
                z3 = false;
            }
            int i4 = 0;
            if (z3) {
                int i5 = 0;
                while (i4 <= i2) {
                    int i6 = ((C56112kz) mediaGalleryFragmentBase.A0S.get(i4)).count;
                    if (i4 == i2) {
                        count = (i6 + i5) - 1;
                    } else {
                        i5 += i6;
                    }
                    i4++;
                }
                i4 = i5;
            }
            ArrayList arrayList = new ArrayList();
            while (i4 <= count) {
                AnonymousClass2BF ADR = mediaGalleryFragmentBase.A0H.ADR(i4);
                if (ADR instanceof AnonymousClass2BE) {
                    arrayList.add(((AnonymousClass2BE) ADR).A03);
                }
                i4++;
            }
            int size = arrayList.size();
            if (isChecked) {
                if (size != 0) {
                    if (!storageUsageMediaGalleryFragment.A1K()) {
                        ((AnonymousClass1YG) storageUsageMediaGalleryFragment.A0D()).Ag8((C16740tZ) arrayList.get(0));
                    }
                    r1 = (AnonymousClass1YG) storageUsageMediaGalleryFragment.A0D();
                    z2 = true;
                } else {
                    return;
                }
            } else if (size != 0) {
                r1 = (AnonymousClass1YG) storageUsageMediaGalleryFragment.A0D();
                z2 = false;
            } else {
                return;
            }
            r1.Aec(arrayList, z2);
            storageUsageMediaGalleryFragment.A06.A01();
        }
    }

    public int AB1(int i2) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A05;
        int i3 = mediaGalleryFragmentBase.A02;
        return (i3 == 0 || i3 == 1) ? ((C56112kz) mediaGalleryFragmentBase.A0S.get(i2)).count : mediaGalleryFragmentBase.A00;
    }

    public int ACY() {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A05;
        int i2 = mediaGalleryFragmentBase.A02;
        if (i2 == 0 || i2 == 1) {
            return mediaGalleryFragmentBase.A0S.size();
        }
        return 1;
    }

    public long ACZ(int i2) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A05;
        int i3 = mediaGalleryFragmentBase.A02;
        if (i3 == 0 || i3 == 1) {
            return -((Calendar) mediaGalleryFragmentBase.A0S.get(i2)).getTimeInMillis();
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r0 == 1) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void ANd(X.C005602k r8, int r9) {
        /*
            r7 = this;
            X.3S2 r8 = (X.AnonymousClass3S2) r8
            com.obwhatsapp.gallery.MediaGalleryFragmentBase r4 = r7.A05
            int r1 = r4.A02
            r0 = 1
            if (r1 == 0) goto L_0x005c
            if (r1 == r0) goto L_0x005c
            r0 = 2
            if (r1 != r0) goto L_0x0053
            android.widget.TextView r1 = r8.A01
            r0 = 2131891752(0x7f121628, float:1.9418233E38)
        L_0x0013:
            r1.setText(r0)
        L_0x0016:
            boolean r0 = r4.A0P
            if (r0 == 0) goto L_0x0087
            android.widget.CheckBox r6 = r8.A00
            r0 = 0
            r6.setVisibility(r0)
            boolean r0 = r4.A0O
            r6.setEnabled(r0)
            X.2BC r1 = r4.A0H
            if (r1 == 0) goto L_0x0077
            boolean r0 = r4.A0O
            if (r0 == 0) goto L_0x0077
            int r1 = r1.getCount()
            r5 = 1
            int r1 = r1 - r5
            int r0 = r4.A02
            if (r0 == 0) goto L_0x003a
            r3 = 0
            if (r0 != r5) goto L_0x006c
        L_0x003a:
            r2 = 0
            r3 = 0
        L_0x003c:
            if (r2 > r9) goto L_0x006c
            java.util.List r0 = r4.A0S
            java.lang.Object r0 = r0.get(r2)
            X.2kz r0 = (X.C56112kz) r0
            if (r2 != r9) goto L_0x004f
            int r1 = r0.count
            int r1 = r1 + r3
            int r1 = r1 - r5
        L_0x004c:
            int r2 = r2 + 1
            goto L_0x003c
        L_0x004f:
            int r0 = r0.count
            int r3 = r3 + r0
            goto L_0x004c
        L_0x0053:
            r0 = 3
            if (r1 != r0) goto L_0x0016
            android.widget.TextView r1 = r8.A01
            r0 = 2131893674(0x7f121daa, float:1.9422131E38)
            goto L_0x0013
        L_0x005c:
            android.widget.TextView r1 = r8.A01
            java.util.List r0 = r4.A0S
            java.lang.Object r0 = r0.get(r9)
            java.lang.String r0 = r0.toString()
            r1.setText(r0)
            goto L_0x0016
        L_0x006c:
            if (r3 > r1) goto L_0x0079
            boolean r0 = r4.A1L(r3)
            if (r0 == 0) goto L_0x0077
            int r3 = r3 + 1
            goto L_0x006c
        L_0x0077:
            r0 = 0
            goto L_0x007a
        L_0x0079:
            r0 = 1
        L_0x007a:
            r6.setChecked(r0)
            r1 = 0
            com.facebook.redex.ViewOnClickCListenerShape1S0201000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape1S0201000_I0
            r0.<init>(r7, r9, r8, r1)
            r6.setOnClickListener(r0)
            return
        L_0x0087:
            android.widget.CheckBox r1 = r8.A00
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r1 = r8.A0H
            r0 = 0
            r1.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54612hq.ANd(X.02k, int):void");
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r13, int i2) {
        C64713Rj r132 = (C64713Rj) r13;
        int i3 = this.A00;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A05;
        if (i3 < mediaGalleryFragmentBase.A08.getChildCount()) {
            int childCount = mediaGalleryFragmentBase.A08.getChildCount();
            this.A00 = childCount;
            C04850Oe A002 = mediaGalleryFragmentBase.A08.getRecycledViewPool().A00(1);
            A002.A00 = childCount;
            ArrayList arrayList = A002.A03;
            while (arrayList.size() > childCount) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        C54502hd r8 = (C54502hd) r132.A0H;
        r8.A00 = null;
        r8.setScaleType(ImageView.ScaleType.CENTER_CROP);
        AnonymousClass2BC r0 = mediaGalleryFragmentBase.A0H;
        if (r0 != null) {
            AnonymousClass2BF ADR = r0.ADR(i2);
            r8.setMediaItem(ADR);
            if (r8 instanceof AnonymousClass32B) {
                AnonymousClass32B r6 = (AnonymousClass32B) r8;
                boolean z2 = false;
                if (mediaGalleryFragmentBase.A02 == 3) {
                    z2 = true;
                }
                r6.A09 = z2;
            }
            if (r8.getTag() instanceof AnonymousClass2OV) {
                mediaGalleryFragmentBase.A0L.A01((AnonymousClass2OV) r8.getTag());
            }
            if (ADR != null) {
                C102134yS r9 = new C102134yS(ADR, this, r8, r132);
                r8.setTag(r9);
                mediaGalleryFragmentBase.A0L.A02(r9, new IDxBRecipientShape14S0400000_2_I0(ADR, r8, r9, this, 0));
                r8.setChecked(mediaGalleryFragmentBase.A1L(i2));
            } else {
                r8.setScaleType(ImageView.ScaleType.CENTER);
                r8.setBackgroundColor(mediaGalleryFragmentBase.A01);
                r8.setImageDrawable((Drawable) null);
                r8.setChecked(false);
            }
            if (!this.A02) {
                this.A02 = true;
                r8.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape57S0200000_2_I0(r8, 1, this));
            }
        }
    }

    public /* bridge */ /* synthetic */ C005602k APB(ViewGroup viewGroup) {
        AnonymousClass013 r3 = this.A05.A0E;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout03ca, viewGroup, false);
        C004601z.A0f(inflate, (r3.A0T() ^ true) ^ true ? 1 : 0);
        inflate.setClickable(false);
        AnonymousClass3S2 r32 = new AnonymousClass3S2(inflate);
        int A002 = AnonymousClass00T.A00(r32.A01.getContext(), R.color.color0459);
        return r32;
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        C54502hd r1;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A03;
        MediaGalleryFragmentBase mediaGalleryFragmentBase2 = this.A05;
        if (mediaGalleryFragmentBase2 instanceof StorageUsageMediaGalleryFragment) {
            r1 = new AnonymousClass32B(mediaGalleryFragmentBase2.A0C());
        } else if ((mediaGalleryFragmentBase2 instanceof MediaPickerFragment) || !(mediaGalleryFragmentBase2 instanceof MediaGalleryFragment)) {
            r1 = new C54482hb(mediaGalleryFragmentBase2.A0C());
        } else {
            AnonymousClass32B r12 = new AnonymousClass32B(mediaGalleryFragmentBase2.A0C());
            r12.A00 = 2;
            r1 = r12;
        }
        return new C64713Rj(mediaGalleryFragmentBase, r1);
    }

    public /* bridge */ /* synthetic */ boolean AXu(MotionEvent motionEvent, C005602k r6, int i2) {
        AnonymousClass3S2 r62 = (AnonymousClass3S2) r6;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A05;
        if (!mediaGalleryFragmentBase.A0P) {
            return false;
        }
        float x2 = motionEvent.getX();
        CheckBox checkBox = r62.A00;
        if (x2 < checkBox.getX() || !mediaGalleryFragmentBase.A0O) {
            return false;
        }
        checkBox.setChecked(!checkBox.isChecked());
        A0E(r62, (StorageUsageMediaGalleryFragment) mediaGalleryFragmentBase, i2);
        return true;
    }
}
