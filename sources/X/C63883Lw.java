package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapeItemView;

/* renamed from: X.3Lw  reason: invalid class name and case insensitive filesystem */
public final class C63883Lw extends Handler {
    public final Context A00;
    public final /* synthetic */ AnonymousClass2Ur A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63883Lw(Context context, Looper looper, AnonymousClass2Ur r3) {
        super(looper);
        this.A01 = r3;
        AnonymousClass00B.A06(looper);
        this.A00 = context;
    }

    public void handleMessage(Message message) {
        if (message.obj != null) {
            String A02 = AnonymousClass2Ur.A02(message.getData());
            ShapeItemView shapeItemView = (ShapeItemView) message.obj;
            if (A02.equals(shapeItemView.A01)) {
                AnonymousClass4IG r1 = (AnonymousClass4IG) shapeItemView.getTag();
                shapeItemView.setImageDrawable(r1.A00);
                shapeItemView.setContentDescription(r1.A01);
            }
        }
    }
}
