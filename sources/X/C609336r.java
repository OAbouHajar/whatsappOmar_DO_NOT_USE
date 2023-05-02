package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import com.obwhatsapp.group.GroupProfileEmojiEditor;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.36r  reason: invalid class name and case insensitive filesystem */
public class C609336r extends C16690tT {
    public int A00;
    public ContentResolver A01;
    public Bitmap A02;
    public Bitmap A03;
    public Uri A04;

    public C609336r(C001000l r2) {
        super(r2, true);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i2;
        Bitmap bitmap = this.A03;
        if (bitmap == null) {
            return -3;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(this.A00);
        canvas.drawBitmap(this.A02, 0.0f, 0.0f, C13700nu.A05());
        OutputStream outputStream = null;
        int i3 = -1;
        try {
            ContentResolver contentResolver = this.A01;
            if (contentResolver == null) {
                Log.w("GroupProfileEmojiEditor/render/bg contentResolver=null");
            } else {
                outputStream = contentResolver.openOutputStream(this.A04);
            }
            if (outputStream == null) {
                i2 = -1;
                C30311c8.A04(outputStream);
                return i2;
            }
            this.A03.compress(Bitmap.CompressFormat.JPEG, 85, outputStream);
            outputStream.flush();
            C30311c8.A04(outputStream);
            if (!C16690tT.A02(this)) {
                i3 = 0;
            }
            return Integer.valueOf(i3);
        } catch (IOException e2) {
            i2 = (C16690tT.A02(this) || e2.getMessage() == null || !C13690nt.A1T(e2)) ? -1 : -2;
        } catch (Exception e3) {
            if (!C16690tT.A02(this)) {
                Log.e("GroupProfileEmojiEditor/render/bg/error", e3);
            }
            i2 = -1;
        } catch (Throwable th) {
            C30311c8.A04((Closeable) null);
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C001300o A042 = A04(GroupProfileEmojiEditor.class);
        AnonymousClass3DW r0 = new AnonymousClass3DW(this, (Integer) obj);
        if (A042 != null) {
            r0.accept(A042);
        }
    }
}
