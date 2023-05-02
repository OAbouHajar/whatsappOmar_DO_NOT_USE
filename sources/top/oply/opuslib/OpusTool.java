package top.oply.opuslib;

import java.nio.ByteBuffer;

/* compiled from: XFMFile */
public class OpusTool {
    static {
        try {
            System.loadLibrary("opustool");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public native void closeOpusFile();

    public native int decode(String str, String str2, String str3);

    public native int encode(String str, String str2, String str3);

    public native int getChannelCount();

    public long getCurrentPosition() {
        return getPcmOffset() / 48000;
    }

    public native int getFinished();

    public native long getPcmOffset();

    public native int getSize();

    public long getTotalDuration() {
        return getTotalPcmDuration() / 48000;
    }

    public native long getTotalPcmDuration();

    public native int isOpusFile(String str);

    public native String nativeGetString();

    public native int openOpusFile(String str);

    public native int play(String str);

    public native void readOpusFile(ByteBuffer byteBuffer, int i2);

    public native int seekOpusFile(float f2);

    public native int startRecording(String str);

    public native void stopPlaying();

    public native void stopRecording();

    public native int writeFrame(ByteBuffer byteBuffer, int i2);
}
