package org.whispersystems.curve25519;

import X.C47392Iu;

public class NativeVOPRFExtension {
    public C47392Iu A00 = new C47392Iu();

    private native byte[] nativeBlind(byte[] bArr, int i2, byte[] bArr2, int i3);

    private native boolean nativeIsValid(byte[] bArr, int i2);

    private native byte[] nativePcdBlind(byte[] bArr, int i2, byte[] bArr2, int i3, boolean z2);

    private native byte[] nativeUnBlind(byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, int i4);

    public boolean A00(byte[] bArr) {
        try {
            return nativeIsValid(bArr, 32);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public byte[] A01(byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, int i4) {
        try {
            return nativeUnBlind(bArr, i2, bArr2, i3, bArr3, i4);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return null;
        }
    }

    public byte[] A02(byte[] bArr, byte[] bArr2, int i2) {
        try {
            return nativeBlind(bArr, i2, bArr2, 32);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return null;
        }
    }
}
