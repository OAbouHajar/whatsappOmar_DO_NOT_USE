package X;

import android.graphics.Bitmap;
import android.os.Process;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.37X  reason: invalid class name */
public class AnonymousClass37X extends AnonymousClass1ZS {
    public final /* synthetic */ C38451qo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass37X(C38451qo r2, String str) {
        super(C13680ns.A0h("PhotosDisk-", str));
        this.A00 = r2;
    }

    public void run() {
        Process.setThreadPriority(10);
        do {
            try {
                C38451qo r4 = this.A00;
                Stack stack = r4.A0A;
                synchronized (stack) {
                    try {
                        if (stack.size() == 0) {
                            stack.wait();
                        }
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                        }
                        throw th;
                    }
                }
                if (stack.size() != 0) {
                    AnonymousClass4OS r8 = null;
                    Object obj = r4.A05;
                    synchronized (obj) {
                        try {
                            if (stack.size() != 0) {
                                r8 = (AnonymousClass4OS) stack.pop();
                            }
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                    if (r8 != null) {
                        ConcurrentMap concurrentMap = r8.A05;
                        if (concurrentMap.size() != 0) {
                            String str = r8.A03;
                            String A02 = C004101u.A02(str);
                            AnonymousClass00B.A06(A02);
                            C43201zV r6 = r4.A03;
                            Bitmap A002 = r6.A00(A02, r8.A01, r8.A00, r8.A06);
                            if (A002 != null) {
                                AnonymousClass03L r1 = r6.A03;
                                synchronized (r1) {
                                    try {
                                        r1.A06(str, A002);
                                    } catch (Throwable th3) {
                                        while (true) {
                                            th = th3;
                                            break;
                                        }
                                    }
                                }
                                synchronized (obj) {
                                    try {
                                        r4.A09.remove(str);
                                        if (concurrentMap.size() != 0) {
                                            ArrayList A0n = C13680ns.A0n(concurrentMap.values());
                                            concurrentMap.clear();
                                            r4.A02.A0K(new RunnableRunnableShape0S0300000_I0(A002, A0n, r4, 17));
                                        }
                                    } catch (Throwable th4) {
                                        while (true) {
                                            th = th4;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                synchronized (obj) {
                                    try {
                                        for (AnonymousClass5TC r12 : concurrentMap.values()) {
                                            if (r12.A8u()) {
                                                if (r12.getId().equals(str)) {
                                                    concurrentMap.remove(r12);
                                                }
                                                r4.A02.A0K(new RunnableRunnableShape0S0300000_I0((Object) null, Collections.singletonList(r12), r4, 17));
                                            }
                                        }
                                        if (!r8.A07.get() && concurrentMap.size() != 0) {
                                            Stack stack2 = r4.A0B;
                                            stack2.remove(r8);
                                            stack2.push(r8);
                                            r8.A02 = new C30741cs(AnonymousClass1XK.A0B);
                                            synchronized (stack2) {
                                                stack2.notify();
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                return;
            }
        } while (!Thread.interrupted());
    }
}
