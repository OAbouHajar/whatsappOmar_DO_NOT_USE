package com.facebook.redex;

import X.AnonymousClass129;
import X.AnonymousClass15H;
import X.AnonymousClass1ND;
import X.AnonymousClass1YI;
import X.AnonymousClass1YJ;
import X.AnonymousClass1YK;
import X.AnonymousClass1ZT;
import X.AnonymousClass1ZX;
import X.AnonymousClass25V;
import X.AnonymousClass2OX;
import X.AnonymousClass2OY;
import X.AnonymousClass2OZ;
import X.C15810rt;
import X.C16740tZ;
import X.C18350wY;
import X.C19090xk;
import X.C19650ym;
import X.C216314v;
import X.C41771wd;
import android.graphics.Bitmap;
import android.os.Process;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.storage.StorageUsageActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class RunnableRunnableShape0S0500000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public RunnableRunnableShape0S0500000_I0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.A05 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
    }

    public final void run() {
        Object tag;
        switch (this.A05) {
            case 0:
                AnonymousClass129 r8 = (AnonymousClass129) this.A00;
                AnonymousClass1ZX r9 = (AnonymousClass1ZX) this.A01;
                AnonymousClass1ZX r7 = (AnonymousClass1ZX) this.A02;
                UserJid userJid = (UserJid) this.A03;
                UserJid userJid2 = (UserJid) this.A04;
                AnonymousClass15H r10 = r8.A06;
                synchronized (r10) {
                    C216314v r0 = r10.A01;
                    long A012 = r0.A01(r9);
                    long A013 = r0.A01(r7);
                    if (!(A012 == -1 || A013 == -1)) {
                        Boolean A014 = r10.A01(r9);
                        if (A014 != null) {
                            r10.A07(r7, A013, A014.booleanValue());
                        }
                        r10.A02.A03(A013, r10.A00(r9));
                    }
                }
                if (userJid instanceof AnonymousClass1ZT) {
                    r8.A05.A03(r9, (AnonymousClass1ZT) userJid);
                }
                if (userJid2 instanceof AnonymousClass1ZT) {
                    r8.A05.A03(r7, (AnonymousClass1ZT) userJid2);
                    return;
                }
                return;
            case 1:
                if (!((AnonymousClass2OX) this.A04).A07) {
                    ImageView imageView = (ImageView) this.A01;
                    if (imageView.getTag() != null && (tag = imageView.getTag()) != null && tag.equals(this.A03)) {
                        ((AnonymousClass2OY) this.A02).AfW((Bitmap) this.A00, imageView, false);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                AnonymousClass1ND r6 = (AnonymousClass1ND) this.A00;
                AnonymousClass2OZ r2 = new AnonymousClass2OZ();
                r2.A00 = 1;
                r2.A01 = 1;
                r2.A06 = r6.A02.A00((Jid) this.A01);
                r2.A02 = (Integer) this.A02;
                r2.A03 = (Integer) this.A03;
                r2.A04 = (Integer) this.A04;
                r2.A05 = Long.valueOf((long) r6.A04.getAndIncrement());
                r6.A01.A06(r2);
                return;
            case 3:
                C19090xk r3 = (C19090xk) this.A03;
                C15810rt r22 = (C15810rt) this.A04;
                Process.setThreadPriority(-8);
                if (((C19650ym) this.A01).A02.A07((C18350wY) this.A02, false)) {
                    Log.i("app-init/main/msgstoredb/healthy");
                    r3.A04();
                }
                r22.A0C();
                Process.setThreadPriority(0);
                return;
            case 4:
                StorageUsageActivity storageUsageActivity = (StorageUsageActivity) this.A00;
                AnonymousClass1YI r62 = (AnonymousClass1YI) this.A01;
                AnonymousClass1YK r5 = (AnonymousClass1YK) this.A02;
                AnonymousClass1YK r4 = (AnonymousClass1YK) this.A03;
                C41771wd r23 = (C41771wd) this.A04;
                AnonymousClass1YJ r1 = storageUsageActivity.A0G;
                if (r62 != null && r1.A02 == null) {
                    r1.A02 = r62;
                    r1.A02(r1.A0G(1));
                }
                if (r5 != null && r1.A01 == null) {
                    r1.A01 = r5;
                    r1.A0H();
                }
                if (r4 != null && r1.A00 == null) {
                    r1.A00 = r4;
                    r1.A0H();
                }
                if (r23.A04 != null) {
                    Log.i("storage-usage-activity/fetch cache/fetched media size");
                    storageUsageActivity.A36(0);
                }
                if (r5 != null) {
                    Log.i("storage-usage-activity/fetch cache/fetched large files");
                    storageUsageActivity.A36(1);
                }
                if (r4 != null) {
                    Log.i("storage-usage-activity/fetch cache/fetched forwarded files");
                    storageUsageActivity.A36(2);
                    return;
                }
                return;
            default:
                Object obj = this.A00;
                View view = (View) this.A01;
                AnonymousClass25V r32 = (AnonymousClass25V) this.A02;
                Bitmap bitmap = (Bitmap) this.A03;
                C16740tZ r12 = (C16740tZ) this.A04;
                Object tag2 = view.getTag();
                if (tag2 != null && obj.equals(tag2)) {
                    r32.AfV(bitmap, view, r12);
                    return;
                }
                return;
        }
    }
}
