package com.example.jacksoncollection.base.domain.db;

import java.lang.System;

/**
 * *
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010\t\u001a\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/example/jacksoncollection/base/domain/db/AlbumConverter;", "", "()V", "convertToFeed", "Ljava/util/ArrayList;", "Lcom/example/jacksoncollection/base/domain/response/Album;", "Lkotlin/collections/ArrayList;", "value", "", "convertToString", "list", "", "app_debug"})
public final class AlbumConverter {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String convertToString(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.jacksoncollection.base.domain.response.Album> list) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.ArrayList<com.example.jacksoncollection.base.domain.response.Album> convertToFeed(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    public AlbumConverter() {
        super();
    }
}