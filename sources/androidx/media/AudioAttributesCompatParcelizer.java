package androidx.media;

import X.AnonymousClass0SG;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AnonymousClass0SG r3) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.A00;
        if (r3.A09(1)) {
            obj = r3.A03();
        }
        audioAttributesCompat.A00 = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AnonymousClass0SG r2) {
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.A00;
        r2.A05(1);
        r2.A08(audioAttributesImpl);
    }
}
