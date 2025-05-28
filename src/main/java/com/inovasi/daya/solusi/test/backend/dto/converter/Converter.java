package com.inovasi.daya.solusi.test.backend.dto.converter;

public interface Converter<A, B> {
    B convert(A source);
}
