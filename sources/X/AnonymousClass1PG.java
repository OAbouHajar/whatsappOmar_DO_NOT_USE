package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.print.PrintAttributes;
import android.print.PrintManager;
import com.whatsapp.util.Log;

/* renamed from: X.1PG  reason: invalid class name */
public class AnonymousClass1PG {
    public final C16180sb A00;
    public final C16320sq A01;

    public AnonymousClass1PG(C16180sb r1, C16320sq r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static void A00(Activity activity, Bitmap bitmap, String str) {
        PrintManager A002 = AnonymousClass01V.A00(activity);
        if (A002 == null) {
            Log.e("PAY: payments-display-qr/print/no-print-manager");
        } else {
            A002.print(str, new AnonymousClass3M7(activity, bitmap), (PrintAttributes) null);
        }
    }
}
