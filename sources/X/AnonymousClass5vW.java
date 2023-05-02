package X;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import com.facebook.redex.IDxPCallbackShape320S0100000_3_I1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.5vW  reason: invalid class name */
public class AnonymousClass5vW {
    public int A00 = 0;
    public AnonymousClass5vQ A01 = new AnonymousClass5vQ(0, 0);
    public boolean A02;
    public final Camera.PreviewCallback A03 = new IDxPCallbackShape320S0100000_3_I1(this, 0);
    public final Camera.PreviewCallback A04 = new IDxPCallbackShape320S0100000_3_I1(this, 1);
    public final C118855vM A05 = new C118855vM();
    public final ArrayList A06 = AnonymousClass000.A0u();
    public final HashMap A07 = AnonymousClass000.A0x();

    public synchronized void A00() {
        synchronized (this) {
            this.A05.A00();
            this.A07.clear();
            this.A06.clear();
        }
    }

    public synchronized void A01(Camera camera) {
        if (!AnonymousClass5xT.A02()) {
            camera.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
            camera.setPreviewCallback((Camera.PreviewCallback) null);
            this.A02 = false;
        } else {
            throw AnonymousClass000.A0a("Cannot disable listeners on the UI thread");
        }
    }

    public synchronized void A02(Camera camera, AnonymousClass5vQ r10, int i2) {
        RuntimeException th;
        int i3;
        synchronized (this) {
            if (AnonymousClass5xT.A02()) {
                th = AnonymousClass000.A0a("Cannot enable listeners on the UI thread");
                throw th;
            } else if (!this.A02) {
                this.A00 = i2;
                this.A01 = r10;
                HashMap hashMap = this.A07;
                if (!hashMap.isEmpty()) {
                    camera.setPreviewCallback((Camera.PreviewCallback) null);
                    try {
                        Iterator A0i = C110115dX.A0i(hashMap);
                        int i4 = 0;
                        int i5 = 0;
                        while (A0i.hasNext()) {
                            int intValue = ((Integer) A0i.next()).intValue();
                            if (intValue > i5) {
                                i5 = intValue;
                            }
                        }
                        if (i2 != 842094169) {
                            i3 = ImageFormat.getBitsPerPixel(i2) * r10.A02 * r10.A01;
                            if (i3 % 8 != 0) {
                                throw AnonymousClass000.A0V("Total bits for Frame should be a multiple of 8");
                            }
                        } else {
                            int ceil = ((int) Math.ceil(((double) r10.A02) / 16.0d)) << 4;
                            int i6 = r10.A01;
                            i3 = (ceil * i6) + ((((((int) Math.ceil(((double) (ceil >> 1)) / 16.0d)) << 4) * i6) >> 1) << 1);
                        }
                        int i7 = i3 >> 3;
                        ArrayList arrayList = this.A06;
                        if (!arrayList.isEmpty()) {
                            if (((byte[]) arrayList.get(0)).length != i7) {
                                arrayList.clear();
                            }
                            int size = arrayList.size();
                            if (i5 > size) {
                                int i8 = i5 - size;
                                while (i4 < i8) {
                                    arrayList.add(new byte[i7]);
                                    i4++;
                                }
                            } else if (i5 < size) {
                                ArrayList A0i2 = C13690nt.A0i(i5);
                                while (i4 < i5) {
                                    A0i2.add((byte[]) arrayList.get(i4));
                                    i4++;
                                }
                                arrayList.clear();
                                arrayList.addAll(A0i2);
                            }
                        } else {
                            while (i4 < i5) {
                                arrayList.add(new byte[i7]);
                                i4++;
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            camera.addCallbackBuffer((byte[]) it.next());
                        }
                        camera.setPreviewCallbackWithBuffer(this.A04);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    camera.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                    camera.setPreviewCallback(this.A03);
                }
                this.A02 = true;
            }
        }
    }
}
