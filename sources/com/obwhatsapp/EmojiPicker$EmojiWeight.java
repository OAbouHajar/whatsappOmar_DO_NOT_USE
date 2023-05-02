package com.obwhatsapp;

import X.C37891pu;
import java.util.Arrays;

public class EmojiPicker$EmojiWeight implements C37891pu {
    public float A00;
    public int[] A01;

    public EmojiPicker$EmojiWeight(int[] iArr, float f2) {
        this.A01 = iArr;
        this.A00 = f2;
    }

    public /* bridge */ /* synthetic */ boolean A6R(Object obj) {
        return Arrays.equals(this.A01, (int[]) obj);
    }

    public long A9n() {
        return -1;
    }

    public /* bridge */ /* synthetic */ Object ACV() {
        return this.A01;
    }

    public float AH5() {
        return this.A00;
    }

    public void Af1(float f2) {
        this.A00 = f2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EmojiPicker$EmojiWeight emojiPicker$EmojiWeight = (EmojiPicker$EmojiWeight) obj;
            if (Float.compare(emojiPicker$EmojiWeight.A00, this.A00) != 0 || !Arrays.equals(this.A01, emojiPicker$EmojiWeight.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (Float.valueOf(this.A00).hashCode() * 31 * 31) + Arrays.hashCode(this.A01);
    }
}
