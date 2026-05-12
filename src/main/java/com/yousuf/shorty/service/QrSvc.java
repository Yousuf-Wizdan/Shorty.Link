package com.yousuf.shorty.service;

public interface QrSvc {

	public byte[] generateQrCode(String data) throws Exception;
}
