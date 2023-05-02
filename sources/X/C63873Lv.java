package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.facebook.redex.RunnableRunnableShape0S0102000_I1;
import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3Lv  reason: invalid class name and case insensitive filesystem */
public class C63873Lv extends Handler {
    public final Handler A00 = AnonymousClass000.A0L();
    public final WeakReference A01;

    public C63873Lv(Looper looper, AnonymousClass2Qx r3) {
        super(looper);
        this.A01 = C13690nt.A0h(r3);
    }

    public void handleMessage(Message message) {
        StringBuilder sb;
        String str;
        AnonymousClass2Qx r2 = (AnonymousClass2Qx) this.A01.get();
        if (r2 != null) {
            switch (message.what) {
                case 1:
                    int i2 = message.arg1;
                    int i3 = message.arg2;
                    if (!r2.A09()) {
                        sb = AnonymousClass000.A0o();
                        str = "voip/CoreVideoPort/setWindowSize failed: -6 for ";
                        break;
                    } else {
                        r2.A02(AnonymousClass2Qx.A0J);
                        r2.A0C.setWindow(0, 0, i2, i3);
                        this.A00.post(new RunnableRunnableShape0S0102000_I1(r2, i2, i3, 0));
                        return;
                    }
                case 2:
                    Object obj = message.obj;
                    AnonymousClass00B.A06(obj);
                    r2.A0C.setScaleType(AnonymousClass000.A0D(obj));
                    return;
                case 3:
                    Object obj2 = message.obj;
                    AnonymousClass00B.A06(obj2);
                    float A04 = AnonymousClass000.A04(obj2);
                    if (!r2.A0E.get()) {
                        sb = AnonymousClass000.A0o();
                        str = "voip/CoreVideoPort/setCornerRadius failed: -6 for ";
                        break;
                    } else {
                        r2.A0C.setCornerRadius(A04);
                        return;
                    }
                case 4:
                    AnonymousClass00B.A03(r2.A07);
                    try {
                        r2.A03 = C90194dg.A00(C90194dg.A00);
                        return;
                    } catch (Exception e2) {
                        Log.e((Throwable) e2);
                        r2.A04();
                        sb = AnonymousClass000.A0r("voip/CoreVideoPort/create failed to init EGL (");
                        sb.append(-5);
                        str = ") for ";
                        break;
                    }
                case 5:
                    r2.A04();
                    r2.A07.quit();
                    return;
                case 6:
                    int i4 = message.arg1;
                    int i5 = message.arg2;
                    Object obj3 = message.obj;
                    AnonymousClass00B.A06(obj3);
                    AnonymousClass4V1 r3 = (AnonymousClass4V1) obj3;
                    HandlerThread handlerThread = r2.A07;
                    AnonymousClass00B.A03(handlerThread);
                    r2.A04 = true;
                    if (!r2.A09()) {
                        sb = AnonymousClass000.A0o();
                        str = "voip/CoreVideoPort/renderTexture failed: -6 for ";
                        break;
                    } else if (r3.A01(r2.A0C, i4, i5)) {
                        AnonymousClass00B.A03(handlerThread);
                        r2.A04 = false;
                        AnonymousClass00B.A03(handlerThread);
                        if (r2.A03.A0C()) {
                            this.A00.post(new RunnableRunnableShape17S0100000_I1((Object) r2, 28));
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                case 7:
                    if (message.obj != null) {
                        StringBuilder A0r = AnonymousClass000.A0r("voip/CoreVideoPort/ releasing surface texture holder for ");
                        A0r.append(r2.A0B);
                        C13680ns.A1V(A0r);
                        ((AnonymousClass4V1) message.obj).A00();
                        AnonymousClass00B.A03(r2.A07);
                        r2.A01 = null;
                        return;
                    }
                    return;
                default:
                    return;
            }
            sb.append(str);
            Log.e(AnonymousClass000.A0f(r2.A0B, sb));
        }
    }
}
