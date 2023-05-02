package androidx.media;

import X.AnonymousClass04J;
import android.util.SparseIntArray;

public class AudioAttributesCompat implements AnonymousClass04J {
    public static final SparseIntArray A01;
    public AudioAttributesImpl A00;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A01 = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.A00;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).A00;
        return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }
}
