package X;

import android.content.Context;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.1Li  reason: invalid class name and case insensitive filesystem */
public final class C25841Li {
    public static final AnonymousClass20R A0H = new AnonymousClass20Q();
    public C37661pW A00;
    public C38411qk A01;
    public ThreadPoolExecutor A02;
    public final C16300so A03;
    public final C27381Rn A04;
    public final C16180sb A05;
    public final C14870pt A06;
    public final Mp4Ops A07;
    public final C17130ua A08;
    public final AnonymousClass12W A09;
    public final C16440t3 A0A;
    public final C16980tz A0B;
    public final C19950zG A0C;
    public final C16320sq A0D;
    public final AnonymousClass01D A0E;
    public final boolean A0F;
    public volatile C37661pW A0G;

    public C25841Li(C16300so r3, C27381Rn r4, C16180sb r5, C14870pt r6, Mp4Ops mp4Ops, C17130ua r8, AnonymousClass12W r9, C16440t3 r10, C16980tz r11, C14710pd r12, C19950zG r13, C16320sq r14, AnonymousClass01D r15) {
        this.A0B = r11;
        this.A0A = r10;
        this.A04 = r4;
        this.A07 = mp4Ops;
        this.A06 = r6;
        this.A03 = r3;
        this.A0D = r14;
        this.A05 = r5;
        this.A08 = r8;
        this.A09 = r9;
        this.A0C = r13;
        this.A0E = r15;
        this.A0F = r12.A0E(C16620tM.A02, 1662);
    }

    public final C37661pW A00() {
        if (this.A0G == null) {
            synchronized (this) {
                if (this.A0G == null) {
                    this.A0G = this.A04.A00("gif_content_obj_store", 32);
                }
            }
        }
        return this.A0G;
    }

    public final ThreadPoolExecutor A01() {
        AnonymousClass00B.A01();
        ThreadPoolExecutor threadPoolExecutor = this.A02;
        if (threadPoolExecutor != null) {
            return threadPoolExecutor;
        }
        ThreadPoolExecutor A7d = this.A0D.A7d("GifCacheWorker", new LinkedBlockingQueue(), 4, 4, 10, 1);
        this.A02 = A7d;
        return A7d;
    }

    public void A02(ImageView imageView, String str) {
        Context context = imageView.getContext();
        AnonymousClass00B.A01();
        C38411qk r0 = this.A01;
        if (r0 == null) {
            File file = new File(this.A0B.A00.getCacheDir(), "GifsCache");
            if (!file.mkdirs() && !file.isDirectory()) {
                Log.w("gif/cache/unable to create gifs directory");
            }
            C38461qp r3 = new C38461qp(this.A06, this.A08, this.A0C, file, "gif-cache");
            r3.A00 = context.getResources().getDimensionPixelSize(R.dimen.dimen0406);
            r0 = r3.A00();
            this.A01 = r0;
        }
        r0.A01(imageView, str);
    }

    public byte[] A03(String str) {
        C27371Rm r0;
        AnonymousClass00B.A01();
        AnonymousClass00B.A01();
        if (this.A0F) {
            r0 = (C27371Rm) this.A0E.get();
        } else {
            C27371Rm r02 = this.A00;
            r0 = r02;
            if (r02 == null) {
                C37661pW A002 = this.A04.A00("gif_preview_obj_store", 256);
                this.A00 = A002;
                r0 = A002;
            }
        }
        AnonymousClass20S A9Y = r0.A9Y(str);
        if (A9Y != null) {
            return A9Y.A02;
        }
        return null;
    }
}
