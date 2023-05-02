package X;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.3WZ  reason: invalid class name */
public final class AnonymousClass3WZ extends C438121p {
    public final AnonymousClass3Y3 A00;

    public AnonymousClass3WZ(AnonymousClass3Y3 r2, C437121f r3) {
        super(C88354aM.A09, r3);
        this.A00 = r2;
    }

    public final /* synthetic */ void A00(C15760ro r8) {
        C15770rp r82 = (C15770rp) r8;
        C66393Ze r6 = new C66393Ze(this);
        try {
            AnonymousClass3Y3 r5 = this.A00;
            C66373Zc r3 = r5.A08;
            int A03 = r3.A03();
            r3.A00 = A03;
            byte[] bArr = new byte[A03];
            C90704ef r0 = new C90704ef(bArr, A03);
            r3.A05(r0);
            ByteBuffer byteBuffer = r0.A02;
            if (byteBuffer.remaining() == 0) {
                r5.A02 = bArr;
                C92184h9 r1 = (C92184h9) ((C109855Tx) r82.A01());
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                obtain.writeStrongBinder(r6.asBinder());
                obtain.writeInt(1);
                r5.writeToParcel(obtain, 0);
                try {
                    r1.A00.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            } else {
                Object[] A1b = C13680ns.A1b();
                AnonymousClass000.A1M(A1b, byteBuffer.remaining(), 0);
                throw AnonymousClass000.A0V(String.format("Did not write as much data as expected, %s bytes remaining.", A1b));
            }
        } catch (IOException e2) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e2);
        } catch (RuntimeException e3) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e3);
            A02(new Status(10, "MessageProducer"));
        }
    }

    public final /* synthetic */ C108395Nu createFailedResult(Status status) {
        return status;
    }
}
