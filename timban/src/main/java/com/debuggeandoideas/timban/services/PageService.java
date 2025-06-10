package com.debuggeandoideas.timban.services;

import com.debuggeandoideas.timban.dtos.PageRequest;
import com.debuggeandoideas.timban.dtos.PageResponse;
import com.debuggeandoideas.timban.dtos.PostRequest;

public interface PageService {

    PageResponse create(PageRequest page);
    PageResponse readByTitle(String title);
    PageResponse update(PageRequest page, String title);
    void delete(String title);

    PageResponse createPost(PostRequest post);
    PageResponse deletePost(Long idPost);
}
