package com.facebook.minscript.compiler;

import com.facebook.soloader.SoLoader;
import java.nio.ByteBuffer;

public class MinsCompilerImpl$Helper {
    static {
        SoLoader.A06("minscompiler-jni");
    }

    public static native ByteBuffer doCompile(byte[] bArr);
}
