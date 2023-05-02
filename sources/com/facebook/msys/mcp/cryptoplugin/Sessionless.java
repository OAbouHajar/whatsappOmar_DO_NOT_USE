package com.facebook.msys.mcp.cryptoplugin;

public abstract class Sessionless {
    public abstract String MsysCryptoImpl_MsysCryptoCreateMD5DigestHandler(byte[] bArr);

    public abstract String MsysCryptoImpl_MsysCryptoCreateSHA256DigestHandler(byte[] bArr, String str);

    public abstract String MsysCryptoImpl_MsysCryptoCreateSHA256HashFromFileUrl(String str, String str2);
}
