package androidx.media;

import X.AnonymousClass0SG;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AnonymousClass0SG r3) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.A03 = r3.A00(audioAttributesImplBase.A03, 1);
        audioAttributesImplBase.A00 = r3.A00(audioAttributesImplBase.A00, 2);
        audioAttributesImplBase.A01 = r3.A00(audioAttributesImplBase.A01, 3);
        audioAttributesImplBase.A02 = r3.A00(audioAttributesImplBase.A02, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AnonymousClass0SG r3) {
        r3.A06(audioAttributesImplBase.A03, 1);
        r3.A06(audioAttributesImplBase.A00, 2);
        r3.A06(audioAttributesImplBase.A01, 3);
        r3.A06(audioAttributesImplBase.A02, 4);
    }
}
