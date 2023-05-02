package com.facebook.msys.mcp.cryptoplugin;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MsysCryptoPluginSessionless extends Sessionless {
    public String MsysCryptoImpl_MsysCryptoCreateMD5DigestHandler(byte[] bArr) {
        return new String(DefaultCrypto.mCrypto.computeMd5(bArr), StandardCharsets.UTF_8);
    }

    public String MsysCryptoImpl_MsysCryptoCreateSHA256DigestHandler(byte[] bArr, String str) {
        return DefaultCrypto.mCrypto.computeSHA256(bArr, str);
    }

    public String MsysCryptoImpl_MsysCryptoCreateSHA256HashFromFileUrl(String str, String str2) {
        try {
            return DefaultCrypto.mCrypto.computeSHA256(str, str2);
        } catch (IOException e2) {
            throw new RuntimeException("Failed to compute SHA256.", e2);
        }
    }
}
