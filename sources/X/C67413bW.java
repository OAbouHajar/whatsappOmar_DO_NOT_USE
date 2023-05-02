package X;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.3bW  reason: invalid class name and case insensitive filesystem */
public final class C67413bW extends C85784Py {
    public boolean A00 = true;
    public final AnonymousClass4S3 A01;
    public final C87994Zm A02 = new C87994Zm();
    public final Object A03 = C13690nt.A0Y();

    public C67413bW() {
        throw AnonymousClass000.A0V("Default constructor called");
    }

    public C67413bW(AnonymousClass4S3 r2) {
        this.A01 = r2;
    }

    public final void A00() {
        Parcel obtain;
        Parcel obtain2;
        super.A00();
        synchronized (this.A03) {
            if (this.A00) {
                AnonymousClass4S3 r1 = this.A01;
                synchronized (r1.A05) {
                    if (r1.A00 != null) {
                        try {
                            Object A002 = r1.A00();
                            C13710nw.A01(A002);
                            C66823aY r4 = (C66823aY) ((AnonymousClass5UA) A002);
                            obtain = Parcel.obtain();
                            obtain.writeInterfaceToken(r4.A01);
                            obtain2 = Parcel.obtain();
                            AnonymousClass3K2.A0w(r4.A00, obtain, obtain2, 3);
                            obtain.recycle();
                            obtain2.recycle();
                        } catch (RemoteException e2) {
                            Log.e("FaceNativeHandle", "Could not finalize native handle", e2);
                        } catch (Throwable th) {
                            obtain.recycle();
                            obtain2.recycle();
                            throw th;
                        }
                    }
                }
                this.A00 = false;
            }
        }
    }

    public final void finalize() {
        try {
            synchronized (this.A03) {
                if (this.A00) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    A00();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
