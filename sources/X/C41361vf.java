package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.whatsapp.util.Log;

/* renamed from: X.1vf  reason: invalid class name and case insensitive filesystem */
public class C41361vf extends Handler {
    public final /* synthetic */ AnonymousClass17Z A00;
    public final /* synthetic */ AnonymousClass17E A01;
    public final /* synthetic */ C19150xq A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41361vf(Looper looper, AnonymousClass17Z r2, AnonymousClass17E r3, C19150xq r4) {
        super(looper);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        C41401vj r1;
        C16740tZ r3 = (C16740tZ) message.obj;
        int i2 = message.what;
        if (i2 == 3) {
            C19150xq r4 = this.A02;
            for (C18940xV r2 : r4.A01()) {
                r4.A00++;
                if (r2 instanceof C19300yD) {
                    C19300yD r22 = (C19300yD) r2;
                    if (r3 != null && r3.A14 >= -1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("app/message/received/duplicate ");
                        C28381Vw r7 = r3.A11;
                        String str = r7.A01;
                        sb.append(str);
                        sb.append(" ");
                        C16040sK r0 = r22.A04;
                        r0.A0B();
                        sb.append(r0.A05);
                        sb.append(" ");
                        C15830rv r5 = r7.A00;
                        sb.append(r5);
                        sb.append(" ");
                        sb.append(r3.A0B());
                        Log.i(sb.toString());
                        if (!r7.A02) {
                            r22.A0d.A03(r3);
                        } else if (r3 instanceof C39291sE) {
                            C39291sE r02 = (C39291sE) r3;
                            C30641ci r12 = r02.A04;
                            if (r12 != null) {
                                r22.A0f.A02(r12);
                            } else if (r02.A00 == 6) {
                                r22.A0d.A02(r5, str, r3.A16);
                            }
                        }
                    }
                }
            }
        } else if (i2 == 4) {
            AnonymousClass17Z r13 = this.A00;
            C15830rv r03 = r3.A11.A00;
            AnonymousClass00B.A06(r03);
            r13.A01(r03);
            this.A02.A07(r3, message.arg1);
        } else if (i2 == 5) {
            AnonymousClass17E r42 = this.A01;
            r42.A04.A07(r3, message.arg1);
            AnonymousClass1Vt r23 = r3.A0L;
            if (r23 != null) {
                for (C41411vk AUe : r42.A05.A01()) {
                    AUe.AUe(r23);
                }
            }
            AnonymousClass17Z r24 = r42.A03;
            C15830rv r14 = r3.A11.A00;
            AnonymousClass00B.A06(r14);
            r24.A03(r14, false);
        } else if (i2 == 6) {
            this.A00.A00();
        } else if (i2 == 7) {
            C19150xq r43 = this.A02;
            for (C18940xV r52 : r43.A01()) {
                r43.A00++;
                if (r52 instanceof C19300yD) {
                    C19300yD r53 = (C19300yD) r52;
                    if (r53.A0c.A01()) {
                        r53.A0Y.A08(new RunnableRunnableShape2S0100000_I0_1(r53, 3));
                    }
                    C41391vi r04 = r53.A0a.A07;
                    if (!(r04 == null || (r1 = r04.A06) == null)) {
                        r1.A00(true);
                    }
                }
            }
        }
    }
}
