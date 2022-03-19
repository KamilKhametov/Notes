package com.notes.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/notes/data/LocalDateTimeConverter;", "", "()V", "dateTimeFormatter", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "localDateTimeToString", "", "localDateTime", "Ljava/time/LocalDateTime;", "stringToLocalDateTime", "value", "app_debug"})
public final class LocalDateTimeConverter {
    private final java.time.format.DateTimeFormatter dateTimeFormatter = null;
    
    public LocalDateTimeConverter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.time.LocalDateTime stringToLocalDateTime(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.lang.String localDateTimeToString(@org.jetbrains.annotations.NotNull
    java.time.LocalDateTime localDateTime) {
        return null;
    }
}