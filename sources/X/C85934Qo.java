package X;

import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import java.util.concurrent.Executor;

/* renamed from: X.4Qo  reason: invalid class name and case insensitive filesystem */
public class C85934Qo {
    public Handler A00 = AnonymousClass000.A0L();
    public Executor A01;

    public C85934Qo(Executor executor) {
        this.A01 = executor;
    }

    public void A00(AnonymousClass5PR r4, AnonymousClass58D r5) {
        this.A01.execute(new RunnableRunnableShape3S0300000_I1(this, r5, r4, 24));
    }
}
