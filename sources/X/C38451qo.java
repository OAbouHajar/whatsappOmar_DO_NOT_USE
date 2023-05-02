package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.obwhatsapp.R;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.1qo  reason: invalid class name and case insensitive filesystem */
public abstract class C38451qo {
    public boolean A00;
    public boolean A01;
    public final C14870pt A02;
    public final C43201zV A03;
    public final C38431qm A04;
    public final Object A05 = new Object();
    public final String A06;
    public final List A07;
    public final List A08;
    public final Map A09 = new HashMap();
    public final Stack A0A = new Stack();
    public final Stack A0B = new Stack();

    public C38451qo(C14870pt r5, C38431qm r6, File file, String str, int i2, long j2) {
        this.A02 = r5;
        this.A06 = str;
        this.A03 = new C43201zV(file, j2);
        this.A04 = r6;
        this.A07 = new ArrayList(i2);
        this.A08 = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.A08.add(new AnonymousClass37Y(this, this.A06));
            this.A07.add(new AnonymousClass37X(this, this.A06));
        }
    }

    public void A00(AnonymousClass5TC r5) {
        synchronized (this.A05) {
            AnonymousClass4OS r2 = (AnonymousClass4OS) this.A09.get(r5.getId());
            if (r2 != null && r5.getId().equals(r2.A03)) {
                r2.A05.remove(r5);
            }
        }
    }

    public void A01(AnonymousClass5TC r11, boolean z2) {
        C38431qm r4 = this.A04;
        r4.ASt(r11);
        C43201zV r7 = this.A03;
        String id = r11.getId();
        AnonymousClass03L r5 = r7.A03;
        Bitmap bitmap = (Bitmap) r5.A02(id);
        if (bitmap != null && r7.A01) {
            r7.A04.A04(bitmap.getWidth(), id, bitmap.getHeight());
        }
        ImageView ACj = r11.ACj();
        if (!(ACj == null || ACj.getTag(R.id.optin_for_bitmapool_caching) == null || !((Boolean) ACj.getTag(R.id.optin_for_bitmapool_caching)).booleanValue())) {
            ImageView ACj2 = r11.ACj();
            String str = ACj2 != null ? (String) ACj2.getTag(R.id.previous_loaded_image_url) : null;
            String id2 = r11.getId();
            if (str != null) {
                if (id2 == null || !TextUtils.equals(str, id2)) {
                    synchronized (r5) {
                        Bitmap bitmap2 = (Bitmap) r5.A02(str);
                        if (bitmap2 != null) {
                            if (r7.A01) {
                                r7.A04.A04(bitmap2.getWidth(), str, bitmap2.getHeight());
                            }
                            r7.A04.A03(bitmap2.getWidth(), str, bitmap2.getHeight());
                        }
                    }
                }
            }
            if (r11.ACj() != null) {
                r11.ACj().setTag(R.id.previous_loaded_image_url, id2);
            }
        }
        if (bitmap != null) {
            if (bitmap != C43201zV.A07) {
                r4.ASx(bitmap, r11, true);
                return;
            } else if (!z2) {
                r4.ASn(r11);
                return;
            }
        }
        r4.AMd(r11);
        AnonymousClass00B.A01();
        synchronized (this.A05) {
            Map map = this.A09;
            AnonymousClass4OS r2 = (AnonymousClass4OS) map.get(r11.getId());
            if (r2 == null) {
                r2 = new AnonymousClass4OS(r11);
                map.put(r2.A03, r2);
            } else {
                r2.A05.put(r11, r11);
            }
            Stack stack = this.A0A;
            stack.remove(r2);
            this.A0B.remove(r2);
            stack.push(r2);
            synchronized (stack) {
                stack.notify();
            }
        }
        if (!this.A00) {
            for (Thread thread : this.A07) {
                if (thread.getState() == Thread.State.NEW) {
                    thread.start();
                }
            }
            this.A00 = true;
        }
        if (!this.A01) {
            for (Thread thread2 : this.A08) {
                if (thread2.getState() == Thread.State.NEW) {
                    thread2.start();
                }
            }
            this.A01 = true;
        }
    }

    public void A02(boolean z2) {
        for (Thread interrupt : this.A08) {
            interrupt.interrupt();
        }
        for (Thread interrupt2 : this.A07) {
            interrupt2.interrupt();
        }
        this.A03.A03(z2);
        this.A01 = false;
        this.A00 = false;
    }
}
