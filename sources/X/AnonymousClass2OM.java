package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.provider.MediaStore;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2OM  reason: invalid class name */
public class AnonymousClass2OM {
    public boolean A00;
    public final ContentResolver A01;
    public final Handler A02;
    public final C34711kk A03;
    public final Thread A04;
    public final ArrayList A05 = new ArrayList();

    public AnonymousClass2OM(ContentResolver contentResolver, Handler handler, C23651Cv r7, String str) {
        int i2;
        this.A01 = contentResolver;
        this.A02 = handler;
        C34711kk A022 = r7.A02();
        this.A03 = A022;
        this.A00 = false;
        RunnableRunnableShape9S0100000_I0_8 runnableRunnableShape9S0100000_I0_8 = new RunnableRunnableShape9S0100000_I0_8(this, 16);
        StringBuilder sb = new StringBuilder("image-loader-");
        sb.append(str);
        AnonymousClass1ZS r0 = new AnonymousClass1ZS(runnableRunnableShape9S0100000_I0_8, sb.toString());
        this.A04 = r0;
        r0.start();
        StringBuilder sb2 = new StringBuilder("imageloader/cachesize:");
        C34731km r1 = A022.A02;
        synchronized (r1) {
            i2 = r1.A02;
        }
        sb2.append(i2);
        Log.i(sb2.toString());
    }

    public void A00() {
        ArrayList arrayList = this.A05;
        synchronized (arrayList) {
            this.A00 = true;
            arrayList.notifyAll();
        }
        C89114bc A002 = C89114bc.A00();
        Thread thread = this.A04;
        ContentResolver contentResolver = this.A01;
        synchronized (A002) {
            AnonymousClass4RD A032 = A002.A03(thread);
            A032.A00 = 0;
            BitmapFactory.Options options = A032.A01;
            if (options != null) {
                options.requestCancelDecode();
            }
            A002.notifyAll();
            synchronized (A032) {
                if (A032.A02) {
                    MediaStore.Images.Thumbnails.cancelThumbnailRequest(contentResolver, -1, thread.getId());
                    MediaStore.Video.Thumbnails.cancelThumbnailRequest(contentResolver, -1, thread.getId());
                }
            }
        }
        thread.interrupt();
    }

    public void A01(AnonymousClass2OV r4) {
        if (r4 != null) {
            ArrayList arrayList = this.A05;
            synchronized (arrayList) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    } else if (((AnonymousClass2OU) arrayList.get(i2)).A00 != r4) {
                        i2++;
                    } else if (i2 >= 0) {
                        arrayList.remove(i2);
                    }
                }
            }
        }
    }

    public void A02(AnonymousClass2OV r4, AnonymousClass2OW r5) {
        AnonymousClass00B.A0B("Thumb loader reused after destroy", !this.A04.isInterrupted());
        Bitmap bitmap = (Bitmap) this.A03.A00(r4.AGT());
        if (bitmap != null) {
            r5.AY3(bitmap, true);
            return;
        }
        r5.A5K();
        ArrayList arrayList = this.A05;
        synchronized (arrayList) {
            arrayList.add(new AnonymousClass2OU(r4, r5));
            arrayList.notifyAll();
        }
    }
}
