package com.google.android.exoplayer2.decoder;

import X.AnonymousClass3K3;
import X.C108235Ne;
import X.C65313Ug;
import java.nio.ByteBuffer;

public class SimpleOutputBuffer extends C65313Ug {
    public ByteBuffer data;
    public final C108235Ne owner;

    public SimpleOutputBuffer(C108235Ne r1) {
        this.owner = r1;
    }

    public void clear() {
        this.flags = 0;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer init(long j2, int i2) {
        this.timeUs = j2;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i2) {
            this.data = AnonymousClass3K3.A0s(i2);
        }
        this.data.position(0);
        this.data.limit(i2);
        return this.data;
    }

    public void release() {
        this.owner.Abk(this);
    }
}
