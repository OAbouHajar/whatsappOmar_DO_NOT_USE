package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import com.obwhatsapp.R;
import com.obwhatsapp.invites.InviteGroupParticipantsActivity;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;

/* renamed from: X.365  reason: invalid class name */
public class AnonymousClass365 extends C16690tT {
    public final AnonymousClass152 A00;
    public final C16010sH A01;
    public final WeakReference A02;

    public AnonymousClass365(AnonymousClass152 r2, C16010sH r3, InviteGroupParticipantsActivity inviteGroupParticipantsActivity) {
        this.A00 = r2;
        this.A02 = C13690nt.A0h(inviteGroupParticipantsActivity);
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Bitmap bitmap;
        Context context = (Context) this.A02.get();
        byte[] bArr = null;
        if (context != null) {
            bitmap = this.A00.A00(context, this.A01, 0.0f, 96);
            if (bitmap != null) {
                bArr = C13690nt.A1X(bitmap, new ByteArrayOutputStream());
            }
        } else {
            bitmap = null;
        }
        return C13690nt.A0I(bitmap, bArr);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Pair pair = (Pair) obj;
        Bitmap bitmap = (Bitmap) pair.first;
        byte[] bArr = (byte[]) pair.second;
        InviteGroupParticipantsActivity inviteGroupParticipantsActivity = (InviteGroupParticipantsActivity) this.A02.get();
        if (inviteGroupParticipantsActivity != null) {
            inviteGroupParticipantsActivity.A0J = bArr;
            if (bitmap == null) {
                inviteGroupParticipantsActivity.A01.setImageResource(R.drawable.avatar_group);
            } else {
                inviteGroupParticipantsActivity.A01.setImageBitmap(bitmap);
            }
        }
    }
}
