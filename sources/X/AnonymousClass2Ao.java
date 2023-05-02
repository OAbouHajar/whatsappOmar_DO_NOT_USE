package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: X.2Ao  reason: invalid class name */
public class AnonymousClass2Ao {
    public AnonymousClass2OX A00;
    public final float A01;
    public final int A02;
    public final C55892kc A03 = new C55892kc();
    public final String A04;
    public final boolean A05;
    public final /* synthetic */ C17200uh A06;

    public AnonymousClass2Ao(C17200uh r2, String str, float f2, int i2, boolean z2) {
        this.A06 = r2;
        this.A02 = i2;
        this.A01 = f2;
        this.A04 = str;
        this.A05 = z2;
    }

    public void A00() {
        AnonymousClass2OX r1 = this.A00;
        if (r1 != null) {
            r1.A07 = true;
            r1.interrupt();
            this.A00 = null;
        }
    }

    public void A01(ImageView imageView, C55902kd r13) {
        C55902kd r7 = r13;
        ImageView imageView2 = imageView;
        imageView.setContentDescription(r13.A06);
        String obj = Long.valueOf(r13.A04).toString();
        imageView.setTag(obj);
        Bitmap bitmap = r13.A00;
        if (bitmap != null) {
            imageView.getDrawable();
            imageView.setImageBitmap(bitmap);
            return;
        }
        C16010sH r0 = r13.A01;
        if (r0 != null) {
            A06(imageView, r0);
            return;
        }
        C17200uh r02 = this.A06;
        A04(imageView2, new C55912ke(r02.A02, (C16010sH) null, r02.A0A, r02.A0B), r7, obj, this.A01, this.A02);
    }

    public final void A02(ImageView imageView, AnonymousClass2OY r12, C16010sH r13, float f2, int i2, boolean z2) {
        ImageView imageView2 = imageView;
        C16010sH r6 = r13;
        if (z2) {
            C17200uh r2 = this.A06;
            imageView.setContentDescription(r2.A01.A0I(r13.A0E) ? imageView.getContext().getString(R.string.str1ba8) : r2.A04.A08(r13));
        }
        float f3 = f2;
        int i3 = i2;
        String A0C = r13.A0C(f2, i2);
        AnonymousClass2OY r5 = r12;
        if (A0C == null) {
            r12.Afn(imageView);
            return;
        }
        boolean equals = A0C.equals(imageView.getTag());
        imageView.setTag(A0C);
        Bitmap bitmap = (Bitmap) this.A06.A05.A02.A01().A00(A0C);
        if (bitmap != null) {
            if (r13.A0J()) {
                StringBuilder sb = new StringBuilder("contactPhotos/displaying from cache instead of fetching from server/jid = ");
                sb.append(r13.A0E);
                Log.i(sb.toString());
            }
            r12.AfW(bitmap, imageView, true);
            return;
        }
        if (!equals || !r13.A0Z) {
            if (r13.A0J()) {
                StringBuilder sb2 = new StringBuilder("contactPhotos/contact does not have photo, so show placeholder/jid = ");
                sb2.append(r13.A0E);
                Log.i(sb2.toString());
            }
            r12.Afn(imageView);
        }
        if (r13.A0Z) {
            A04(imageView2, r5, r6, A0C, f3, i3);
        }
    }

    public void A03(ImageView imageView, AnonymousClass2OY r12, C16010sH r13, boolean z2) {
        C16010sH r6 = r13;
        float f2 = this.A01;
        C17200uh r0 = this.A06;
        if (r0.A0B.A0d(r0.A09.A02((GroupJid) r13.A08(GroupJid.class)))) {
            f2 = -2.14748365E9f;
        }
        A02(imageView, r12, r6, f2, this.A02, z2);
    }

    public final void A04(ImageView imageView, AnonymousClass2OY r15, Object obj, Object obj2, float f2, int i2) {
        ImageView imageView2;
        C55892kc r5 = this.A03;
        Stack stack = r5.A00;
        synchronized (stack) {
            int i3 = 0;
            while (true) {
                imageView2 = imageView;
                if (i3 < stack.size()) {
                    if (((C55922kf) stack.get(i3)).A04 == imageView) {
                        stack.remove(i3);
                    } else {
                        i3++;
                    }
                }
            }
            while (true) {
            }
        }
        C55922kf r6 = new C55922kf(imageView2, r15, obj, obj2, f2, i2);
        synchronized (stack) {
            stack.add(0, r6);
            stack.notifyAll();
            AnonymousClass2OX r2 = this.A00;
            if (r2 == null || (this.A05 && r2.A07)) {
                String str = this.A04;
                C17200uh r0 = this.A06;
                AnonymousClass2OX r22 = new AnonymousClass2OX(r0.A00, r0.A03, r5, r0.A06, r0.A07, r0.A08, str, this.A05);
                this.A00 = r22;
                r22.start();
            }
        }
    }

    public void A05(ImageView imageView, AnonymousClass2OY r13, C39701sv r14, float f2, int i2) {
        int length;
        ImageView imageView2 = imageView;
        imageView.setContentDescription(r14.A02());
        ArrayList arrayList = new ArrayList();
        List<C39711sw> list = r14.A05;
        if (list != null) {
            for (C39711sw r0 : list) {
                UserJid userJid = r0.A01;
                if (userJid != null) {
                    arrayList.add(userJid);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C15830rv r2 = (C15830rv) it.next();
            if (C16030sJ.A0O(r2)) {
                C17200uh r1 = this.A06;
                C16010sH A08 = r1.A03.A08(r2);
                if (A08 != null) {
                    A02(imageView2, new C55912ke(r1.A02, (C16010sH) null, r1.A0A, r1.A0B), A08, f2, i2, true);
                    return;
                }
            }
        }
        byte[] bArr = r14.A09;
        if (bArr == null || (length = bArr.length) <= 0) {
            r13.Afn(imageView);
        } else {
            r13.AfW(BitmapFactory.decodeByteArray(bArr, 0, length), imageView, true);
        }
    }

    public void A06(ImageView imageView, C16010sH r3) {
        if (imageView != null) {
            A08(imageView, r3, true);
        }
    }

    public void A07(ImageView imageView, C16010sH r13, int i2) {
        C16010sH r7 = r13;
        float f2 = this.A01;
        C17200uh r3 = this.A06;
        C17240ul r2 = r3.A0B;
        if (r2.A0d(r3.A09.A02((GroupJid) r13.A08(GroupJid.class)))) {
            f2 = -2.14748365E9f;
        }
        A02(imageView, new C55912ke(r3.A02, r13, r3.A0A, r2), r7, f2, i2, true);
    }

    public void A08(ImageView imageView, C16010sH r6, boolean z2) {
        C17200uh r0 = this.A06;
        A03(imageView, new C55912ke(r0.A02, r6, r0.A0A, r0.A0B), r6, z2);
    }

    public void A09(ImageView imageView, C39701sv r12) {
        C17200uh r0 = this.A06;
        ImageView imageView2 = imageView;
        C39701sv r7 = r12;
        A05(imageView2, new C55912ke(r0.A02, (C16010sH) null, r0.A0A, r0.A0B), r7, this.A01, this.A02);
    }
}
