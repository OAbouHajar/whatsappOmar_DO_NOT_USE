package com.facebook.redex;

import X.AnonymousClass5IT;
import X.AnonymousClass5IU;
import X.C107405Ib;
import X.C107595Iu;
import java.util.Enumeration;
import java.util.NoSuchElementException;

public class IDxEnumerationShape16S0101000_2_I1 implements Enumeration {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxEnumerationShape16S0101000_2_I1(AnonymousClass5IU r2, int i2) {
        this.A02 = i2;
        this.A01 = r2;
        this.A00 = 0;
    }

    public IDxEnumerationShape16S0101000_2_I1(C107595Iu r2) {
        this.A02 = 0;
        this.A01 = r2;
        this.A00 = 0;
    }

    public boolean hasMoreElements() {
        int i2 = this.A02;
        int i3 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                return i3 < ((C107595Iu) obj).A01.length;
            case 1:
                return i3 < ((C107405Ib) obj).A00.length;
            default:
                return i3 < ((AnonymousClass5IU) obj).A00.length;
        }
    }

    public Object nextElement() {
        int i2;
        Object[] objArr;
        switch (this.A02) {
            case 0:
                i2 = this.A00;
                objArr = ((C107595Iu) this.A01).A01;
                if (i2 >= objArr.length) {
                    throw new NoSuchElementException();
                }
                break;
            case 1:
                int i3 = this.A00;
                byte[] bArr = ((C107405Ib) this.A01).A00;
                int length = bArr.length;
                if (i3 < length) {
                    int min = Math.min(length - i3, 1000);
                    byte[] bArr2 = new byte[min];
                    System.arraycopy(bArr, i3, bArr2, 0, min);
                    this.A00 += min;
                    return new AnonymousClass5IT(bArr2);
                }
                throw new NoSuchElementException();
            default:
                i2 = this.A00;
                objArr = ((AnonymousClass5IU) this.A01).A00;
                if (i2 >= objArr.length) {
                    throw new NoSuchElementException();
                }
                break;
        }
        this.A00 = i2 + 1;
        return objArr[i2];
    }
}
