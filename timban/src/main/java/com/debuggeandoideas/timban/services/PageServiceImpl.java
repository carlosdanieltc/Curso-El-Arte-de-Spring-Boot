package com.debuggeandoideas.timban.services;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import com.debuggeandoideas.timban.dtos.PageRequest;
import com.debuggeandoideas.timban.dtos.PageResponse;
import com.debuggeandoideas.timban.dtos.PostRequest;
import com.debuggeandoideas.timban.entities.PageEntity;
import com.debuggeandoideas.timban.repositories.PageRepository;
import com.debuggeandoideas.timban.repositories.UserRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
@AllArgsConstructor
public class PageServiceImpl implements PageService{

    private final PageRepository pageRepository;
    private final UserRepository userRepository;

    @Override
    public PageResponse create(PageRequest page) {
        final var entity = new PageEntity();
        BeanUtils.copyProperties(page, entity);

        final var user = this.userRepository.findById(page.getUserId())
            .orElseThrow();
        entity.setDateCreation(LocalDateTime.now());
        entity.setUser(user);
        entity.setPosts(new ArrayList<>());
        var pageCreated = this.pageRepository.save(entity);

        final var response = new PageResponse();

        BeanUtils.copyProperties(pageCreated, response);
        return response;
    }

    @Override
    public PageResponse readByTitle(String title) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readByTitle'");
    }

    @Override
    public PageResponse update(PageRequest page, String title) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(String title) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public PageResponse createPost(PostRequest post) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPost'");
    }

    @Override
    public PageResponse deletePost(Long idPost) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePost'");
    }

}
