package X;

import android.content.Context;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* renamed from: X.0F8  reason: invalid class name */
public abstract class AnonymousClass0F8 extends AnonymousClass0SB {
    public final Executor A00;
    public volatile C10590hN A01;
    public volatile C10590hN A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0F8(Context context) {
        super(context);
        Executor executor = C10590hN.A09;
        this.A00 = executor;
    }

    @Deprecated
    public void A05(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.A05(str, fileDescriptor, printWriter, strArr);
        if (this.A02 != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.A02);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
        if (this.A01 != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.A01);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
    }

    public abstract Object A06();

    public void A07() {
    }

    public void A08() {
        String str;
        if (this.A01 == null && this.A02 != null) {
            C10590hN r3 = this.A02;
            Executor executor = this.A00;
            if (r3.A05 != C03660Jj.PENDING) {
                switch (r3.A05.ordinal()) {
                    case 1:
                        str = "Cannot execute task: the task is already running.";
                        break;
                    case 2:
                        str = "Cannot execute task: the task has already been executed (a task can be executed only once)";
                        break;
                    default:
                        str = "We should never reach this state";
                        break;
                }
                throw AnonymousClass000.A0V(str);
            }
            r3.A05 = C03660Jj.RUNNING;
            executor.execute(r3.A02);
        }
    }

    public void A09() {
        A00();
        this.A02 = new C10590hN(this);
        A08();
    }

    public void A0A(C10590hN r2, Object obj) {
        A0B(obj);
        if (this.A01 == r2) {
            if (this.A04) {
                if (this.A06) {
                    A09();
                } else {
                    this.A03 = true;
                }
            }
            SystemClock.uptimeMillis();
            this.A01 = null;
            A08();
        }
    }

    public void A0B(Object obj) {
    }
}
