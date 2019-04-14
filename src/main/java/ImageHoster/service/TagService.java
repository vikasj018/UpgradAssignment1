package com.upgrad.ImageHoster.service;

import java.util.List;

public interface TagService {
    List<Tag> getAll();

    Tag getByName(String title);

    Tag createTag(Tag tag);
}