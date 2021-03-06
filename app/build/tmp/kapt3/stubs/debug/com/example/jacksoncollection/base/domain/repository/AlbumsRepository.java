package com.example.jacksoncollection.base.domain.repository;

import java.lang.System;

/**
 * *
 * Created By Amir Fury on April 6 2021
 *
 * Email: Fury.amir93@gmail.com
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/example/jacksoncollection/base/domain/repository/AlbumsRepository;", "", "fetchAlbums", "Lcom/example/jacksoncollection/base/domain/network/remote/Resource;", "Lcom/example/jacksoncollection/base/domain/response/JacksonCollectionResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllAlbums", "Landroidx/lifecycle/LiveData;", "Lcom/example/jacksoncollection/base/domain/db/AlbumEntity;", "app_debug"})
public abstract interface AlbumsRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.jacksoncollection.base.domain.network.remote.Resource<com.example.jacksoncollection.base.domain.response.JacksonCollectionResponse>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.example.jacksoncollection.base.domain.db.AlbumEntity>> p0);
}